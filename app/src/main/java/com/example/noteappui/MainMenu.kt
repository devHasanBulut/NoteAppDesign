package com.example.noteappui

import AllNotes
import BasicButton
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview



@Composable
fun MainMenu(notesModelDao: NotesModelDao,notesModel: NotesModel,modifier: Modifier = Modifier) {


    Column(
        modifier = modifier
            .fillMaxSize(),

        //verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        BasicButton(notesModelDao, notesModel )
        MainScreen()
        AllDate(notesModelDao = notesModelDao)
        AllCategory(notesModelDao)
        AllNotes(notesModelDao = notesModelDao)

    }
}


