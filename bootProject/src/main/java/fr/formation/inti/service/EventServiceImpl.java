package fr.formation.inti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.inti.dao.EventDao;
import fr.formation.inti.entity.Event;


@Service
public class EventServiceImpl implements EventService {

	
	@Autowired
	private EventDao EventDao;
	
	@Override
	public List<Event> findAll() {
		return EventDao.findAll();
	}

	@Override
	public Integer saveEvent(Event Event) {
		return EventDao.save(Event).getEventId();
	}

	@Override
	public void updateEvent(Event Event) {
		EventDao.save(Event);
		
	}

	@Override
	public void deleteEvent(Event Event) {
		EventDao.delete(Event);
		
	}

	@Override
	public void deleteEvent(Integer id) {
		EventDao.deleteById(id);
		
	}

	@Override
	public Optional<Event> findById(Integer id) {	
		return EventDao.findById(id);
	}

	@Override
	public List<Event> findByFind(String text) {
		return EventDao.findByFind(text);
	}

	@Override
	public void updateEvent(Optional<Event> Event) {
		EventDao.save(Event);
		
	}




}