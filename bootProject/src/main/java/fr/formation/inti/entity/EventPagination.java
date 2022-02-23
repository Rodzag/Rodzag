package fr.formation.inti.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="event")
public class EventPagination {

	private Integer eventId;
	private Integer hostId;
	private String name;
	private Date date;
	private String city;
	private String duration;
	private String category;
	private String description;
	private String important;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EVENT_ID", unique = true, nullable = false)
	public Integer getEventId() {
		return eventId;
	}
	
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	

	@Column(name = "HOST_ID", nullable = false)
	public Integer getHostId() {
		return hostId;
	}
	public void setHostId(Integer hostId) {
		this.hostId = hostId;
	}
	
	@Column(name = "EVENT_NAME", nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "DATE", nullable = false)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Column(name = "CITY")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name = "DURATION")
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	@Column(name = "CATEGORY")
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name = "IMPORTANT_NEWS")
	public String getImportant() {
		return important;
	}
	public void setImportant(String important) {
		this.important = important;
	}


	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", hostId=" + hostId + ", name=" + name + ", date=" + date + ", city="
				+ city + ", duration=" + duration + ", category=" + category + ", description=" + description
				+ ", important=" + important + "]";
	}
	
	


}
