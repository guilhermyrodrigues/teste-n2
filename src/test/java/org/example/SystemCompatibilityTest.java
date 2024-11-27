package org.example;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SystemCompatibilityTest {

    private final App app = new App();

    @Test
    @EnabledOnOs(OS.WINDOWS) // Teste executado apenas no Windows
    void testOnWindows() {
        String os = app.getOperatingSystem();
        System.out.println("Running on: " + os);
        assertTrue(os.contains("windows"), "This test should run only on Windows");
    }

    @Test
    @EnabledOnOs(OS.LINUX) // Teste executado apenas no Linux
    void testOnLinux() {
        String os = app.getOperatingSystem();
        System.out.println("Running on: " + os);
        assertTrue(os.contains("linux"), "This test should run only on Linux");
    }

    @Test
    @EnabledOnOs(OS.MAC) // Teste executado apenas no macOS
    void testOnMac() {
        String os = app.getOperatingSystem();
        System.out.println("Running on: " + os);
        assertTrue(os.contains("mac"), "This test should run only on macOS");
    }
}
