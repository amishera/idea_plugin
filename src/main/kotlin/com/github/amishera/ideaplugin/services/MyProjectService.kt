package com.github.amishera.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.amishera.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
