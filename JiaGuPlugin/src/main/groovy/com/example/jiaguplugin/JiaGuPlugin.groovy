package com.example.jiaguplugin


import org.gradle.api.Plugin
import org.gradle.api.Project

public class JiaGuPlugin implements Plugin<Project> {

    public void apply(Project project) {
        println "------JiaGuPlugin plugin entrance-------"
//        JiaGuExt jiaGuExt = project.getExtensions().create("jiagu", JiaGuExt.class);
//        project.afterEvaluate({});
    }
}