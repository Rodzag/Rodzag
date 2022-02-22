package fr.formation.inti.service;

import java.util.List;
import java.util.Optional;


import fr.formation.inti.entity.EventPagination;

public interface EventPaginationService {
	
	List<EventPagination> findAll(Integer pageNo, Integer pageSize);

	Long findAll();

	Integer saveEvent(EventPaginationService event);
	
	void updateEvent(EventPaginationService event);
	
	void deleteEvent(EventPaginationService event);
	
	void deleteEvent(Integer id);
	
	Optional<EventPagination> findById(Integer id);
}
