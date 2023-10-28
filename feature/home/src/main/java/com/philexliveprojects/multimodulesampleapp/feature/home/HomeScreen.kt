package com.philexliveprojects.multimodulesampleapp.feature.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.philexliveprojects.multimodulesampleapp.core.ui.GoToDetailsButton
import com.philexliveprojects.multimodulesampleapp.core.ui.Label

@Composable
fun HomeScreen(title: String, onDetails: () -> Unit) {
    Column(Modifier.fillMaxSize()) {
        Label(title)
        GoToDetailsButton(onDetails)
    }
}