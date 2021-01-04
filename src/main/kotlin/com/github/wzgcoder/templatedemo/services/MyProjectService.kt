package com.github.wzgcoder.templatedemo.services

import com.intellij.openapi.project.Project
import com.github.wzgcoder.templatedemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
