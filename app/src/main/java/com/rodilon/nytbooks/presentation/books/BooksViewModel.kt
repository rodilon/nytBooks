package com.rodilon.nytbooks.presentation.books

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.rodilon.nytbooks.data.model.Book

class BooksViewModel : ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks() {
        booksLiveData.value = createFakeBooks()
    }

    private fun createFakeBooks(): List<Book> {
        return listOf(
            Book("Title", "Author 1"),
            Book("Title2", "Author 2"),
            Book("Title3", "Author 3")
        )
    }
}