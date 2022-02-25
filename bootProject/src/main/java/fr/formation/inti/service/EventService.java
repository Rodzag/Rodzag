package fr.formation.inti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import fr.formation.inti.entity.Event;

@Service
public interface EventService {

	
	List<Event>findAll();
	
	List<Event>findByFind(String text);
	
	Integer saveEvent(Event cust);
	
	void updateEvent(Optional<Event> event);
	
	void updateEvent(Event event);
	
	void deleteEvent(Event cust);
	
	void deleteEvent(Integer id);
	
	Event findById2(Integer id);
	
	Optional<Event> findById(Integer id);



		

	}