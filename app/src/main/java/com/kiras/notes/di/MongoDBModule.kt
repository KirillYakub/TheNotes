package com.kiras.notes.di

import com.kiras.notes.elements.note.all.repository.MongoNotesRep
import com.kiras.notes.elements.note.all.repository.MongoNotesRepImpl
import com.kiras.notes.elements.note.write.repository.MongoNoteWriteRep
import com.kiras.notes.elements.note.write.repository.MongoNoteWriteRepImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object MongoDBModule {
    @Provides
    fun provideMongoNotesRep(): MongoNotesRep = MongoNotesRepImpl()

    @Provides
    fun provideMongoWriteNotesRep(): MongoNoteWriteRep = MongoNoteWriteRepImpl()
}