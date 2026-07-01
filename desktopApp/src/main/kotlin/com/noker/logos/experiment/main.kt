package com.noker.logos.experiment

import androidx.compose.ui.window.application
import androidx.compose.ui.window.Window
import com.noker.logos.experiment.ui.dash

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Noker Logos Experiment"
    ) {
        dash()
    }
}

