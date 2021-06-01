package com.github.wajahatdeveloper.intellijplugin.services

import com.github.wajahatdeveloper.intellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
