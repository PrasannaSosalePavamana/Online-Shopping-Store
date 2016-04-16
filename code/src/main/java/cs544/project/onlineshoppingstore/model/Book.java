package cs544.project.onlineshoppingstore.model;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Book {
	
	
	@Id @GeneratedValue
	private long id;
	
	@NotBlank(message ="ISBN can not be blank")
	private String isbn;
	
	@NotBlank(message ="Title can not be blank")
	private String title;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message ="Edition can not be blank")
	private Date releaseDate;
	
	@NotNull(message = "Price can not be blank")
	private double price;
	
	@NotNull(message = "Price can not be blank")
	private int quantity;
	
	@Max(value = 2000, message = "Page length can not be greater than 2000")
	@NotNull(message = "Length can not be blank")
	private int length;
	
	@NotBlank(message = "Dimensions (L * B * H) can not be blank")
	private String dimension;
	
	@Lob
	private Byte[] cover;
	
	@NotBlank(message ="Description can not be blank")
	private String description;	
	
	@NotBlank(message = "Language can not be blank")
	private String language;
	
	@NotNull(message = "Book type can not be blank")
	private BookType bookType;
	
	@NotNull(message = "Book type can not be blank")
	private BookCategory bookCategory;
	
	@ManyToMany
	@JoinTable(name="BookAuthor", joinColumns = @JoinColumn(name="bookId"),
	inverseJoinColumns = @JoinColumn(name="authorId"))	
	private List<Author> authors = new ArrayList<Author>();
	
	@ManyToOne
	@JoinColumn(name="publisherId")
	private Publisher publisher;
	
	@OneToMany(mappedBy="book")
	private List<Review> reviews = new ArrayList<Review>();
	
	@OneToMany(mappedBy="book")
	private List<Orderline>  orderlines;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(Date edition) {
		this.releaseDate = edition;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Byte[] getCover() {
		return cover;
	}

	public void setCover(Byte[] cover) {
		this.cover = cover;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BookType getBookType() {
		return bookType;
	}

	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}

	public BookCategory getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public List<Orderline> getOrderlines() {
		return orderlines;
	}

	public void setOrderlines(List<Orderline> orderlines) {
		this.orderlines = orderlines;
	}
	
	
	

}
