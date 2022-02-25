package fr.formation.inti.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.formation.inti.entity.Event;

public interface EventDao extends JpaRepository<Event, Integer> {

	@Query("SELECT e FROM Event e order by e.date")
	List<Event> findAll();
	
	@Query("SELECT e FROM Event e WHERE e.name LIKE %?1% or e.date LIKE %?1% or e.city LIKE %?1% or e.duration LIKE %?1% or e.category LIKE %?1% order by e.date")
	List<Event> findByFind(String text);
	
	@Query("SELECT e FROM Event e WHERE e.eventId = ?1")
	Event findById2(Integer id);

	void save(Optional<Event> event);
   
}