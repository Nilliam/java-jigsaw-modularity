package com.github.nilliam.systeminfo;

public class SystemInfo {

    public static void main(String[] args) {
        printSystemInfo();
    }

    public void printSystemInfo() {
        // Get basic system properties
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("OS Name: " + System.getProperty("os.name"));
        System.out.println("OS Architecture: " + System.getProperty("os.arch"));
        System.out.println("OS Version: " + System.getProperty("os.version"));
        System.out.println("User Home Directory: " + System.getProperty("user.home"));
        System.out.println("User Working Directory: " + System.getProperty("user.dir"));
        
        // Get additional system information using java.lang.management
        printMemoryInfo();
        printProcessorInfo();
    }

    private static void printMemoryInfo() {
        // Memory information
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();

        System.out.println("Max Memory: " + maxMemory / (1024 * 1024) + " MB");
        System.out.println("Total Memory: " + totalMemory / (1024 * 1024) + " MB");
        System.out.println("Free Memory: " + freeMemory / (1024 * 1024) + " MB");
    }

    private static void printProcessorInfo() {
        // Processor information
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println("Available Processors: " + availableProcessors);
    }
}