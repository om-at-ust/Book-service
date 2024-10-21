package com.demo.book_service.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;

	public Book() {
	}

	public Book(int bookId, String bookTitle, String bookPrice, LocalDate bookPublished, String bookImageUrl, String bookAuthorId) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
		this.bookPublished = bookPublished;
		this.bookImageUrl = bookImageUrl;
		this.bookAuthorId = bookAuthorId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}

	public LocalDate getBookPublished() {
		return bookPublished;
	}

	public void setBookPublished(LocalDate bookPublished) {
		this.bookPublished = bookPublished;
	}

	public String getBookImageUrl() {
		return bookImageUrl;
	}

	public void setBookImageUrl(String bookImageUrl) {
		this.bookImageUrl = bookImageUrl;
	}

	public String getBookAuthorId() {
		return bookAuthorId;
	}

	public void setBookAuthorId(String bookAuthorId) {
		this.bookAuthorId = bookAuthorId;
	}

	private String bookTitle;
	private String bookPrice;
	private LocalDate bookPublished;
	private String bookImageUrl;
	private String bookAuthorId;
}
