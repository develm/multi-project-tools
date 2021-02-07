package com.github.develm.multiprojecttools.services

import com.github.develm.multiprojecttools.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
