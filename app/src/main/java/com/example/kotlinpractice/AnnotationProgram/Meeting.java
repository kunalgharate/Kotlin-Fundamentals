package com.example.kotlinpractice.AnnotationProgram;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Meeting {
    String title;

    public void  addTitle(@NonNull String title)
    {
        this.title= title;
    }

    // Return nullable here

    public @Nullable String getMeetingTitle()
    {

         return title;
    }
}
