package org.jacoco.test

import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test
import org.objectweb.asm.ClassReader
import org.objectweb.asm.util.ASMifier
import org.objectweb.asm.util.Textifier
import org.objectweb.asm.util.TraceClassVisitor
import java.io.File
import java.io.PrintWriter

abstract class TestBase {

    @get:Rule
    val compose = createComposeRule()

    @Test
    fun saveBytecodeRepresentations() {
        val testName = this.javaClass.simpleName
        val asmDir = File("build/asm/$testName")
        asmDir.mkdirs()
        // Without cleanup bytecode representation might be in
        // a weird misleading mixed state after multiple runs
        // during construction/modification of test in IDE:
        asmDir.listFiles().forEach { it.delete() }

        val packageName = this.javaClass.packageName.replace(".", "/")
        File("build/classes/kotlin/main/$packageName")
            .listFiles { _, name -> name.endsWith(".class") }
            .forEach { classFile ->
                val classReader = ClassReader(classFile.readBytes())
                val className = classReader.className.replace("/", ".")
                val textWriter = PrintWriter(File(asmDir, "$className.txt"))
                val asmWriter = PrintWriter(File(asmDir, "$className.java"))
                val classVisitor = TraceClassVisitor(
                    TraceClassVisitor(null, Textifier(), textWriter),
                    ASMifier(), asmWriter
                )
                classReader.accept(classVisitor, 0)
                textWriter.close()
                asmWriter.close()
            }
    }

}
