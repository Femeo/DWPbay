package dwpbay;

import java.time.*;
import java.time.LocalDateTime;

public class ItemsBean {
	
	private int itemID = 0 ;
	private String title = null ;
	private String category = null ;
	private String description = null ;
	private String picture = null ;
	private Double price = 0.0 ;
	private Boolean onSale = false ;
	private Double reservePrice = null ;
	private LocalDate startDate = null ;
	private LocalTime startTime = null;
	
	public ItemsBean(int itemID, String title, String category, String description, String picture, Double price, boolean onSale, Double reservePrice, LocalDate startDate, LocalTime startTime) {
		this.itemID = itemID ;
		this.title = title ;
		this.category = category ;
		this.description = description ;
		this.picture = picture ;
		this.price = price ;
		this.onSale = onSale ;
		this.reservePrice = reservePrice ;
		this.setStartDate(startDate) ;
		this.setStartTime(startTime) ;
	}
	
	public ItemsBean(int itemID) {}


	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public boolean getOnSale() {
		return onSale;
	}
	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}
	public Double getReservePrice() {
		return reservePrice;
	}
	public void setReservePrice(Double reservePrice) {
		this.reservePrice = reservePrice;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
}