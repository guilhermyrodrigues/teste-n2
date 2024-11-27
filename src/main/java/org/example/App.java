package org.example;

public class App {
    public String getOperatingSystem() {
        return System.getProperty("os.name").toLowerCase();
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Current OS: " + app.getOperatingSystem());
    }
}
