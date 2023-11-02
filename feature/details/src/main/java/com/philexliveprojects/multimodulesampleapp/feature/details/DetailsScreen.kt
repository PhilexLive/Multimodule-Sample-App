package com.philexliveprojects.multimodulesampleapp.feature.details

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.philexliveprojects.multimodulesampleapp.core.ui.Label

@Composable
fun DetailsScreen(title: String, onBack: () -> Unit) {
    Box(Modifier.fillMaxSize()) {
        IconButton(onBack) {
            Icon(Icons.Default.ArrowBack, contentDescription = stringResource(R.string.back))
        }
        Label(title, Modifier.offset(y = 48.dp))
    }
}