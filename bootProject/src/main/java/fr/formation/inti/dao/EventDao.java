package fr.formation.inti.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.formation.inti.entity.Event;

public interface EventDao extends JpaRepository<Event, Integer> {

	@Query("SELECT e FROM Event e")
	List<Event> findAll(String state);
   
}