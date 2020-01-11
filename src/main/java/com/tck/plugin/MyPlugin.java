package com.tck.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class MyPlugin implements Plugin<Project> {

    @Override
    public void apply(Project target) {
        System.out.println("----hello gradle plugin.......");
        System.out.println("----hello gradle plugin.......");
        System.out.println("----hello gradle plugin.......");
    }
}
