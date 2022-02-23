package fr.formation.inti.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import fr.formation.inti.dao.EventPaginationDao;
import fr.formation.inti.entity.EventPagination;

@Service
public class EventPaginationServiceImpl implements EventPaginationService{

	@Autowired
	EventPaginationDao eventPaginationDao;
	
	@Override
	public Long findAll() {
		return eventPaginationDao.count();
	}

	@Override
	public Integer saveEvent(EventPaginationService event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEvent(EventPaginationService event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEvent(EventPaginationService event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEvent(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<EventPagination> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EventPagination> findAll(Integer pageNo, Integer pageSize) {
		org.springframework.data.domain.Pageable paging = PageRequest.of(pageNo, pageSize);
		
		Page<EventPagination> pagedResult = eventPaginationDao.findAll(paging);
		
		if(pagedResult.hasContent()) {
			return pagedResult.getContent();
		}else {
			return new ArrayList<EventPagination>();
		}
	}

	@Override
	public List<EventPagination> findByFind(Integer pageNo, Integer pageSize, String text) {
		org.springframework.data.domain.Pageable paging = PageRequest.of(pageNo, pageSize);
		
		Page<EventPagination> pagedResult = eventPaginationDao.findByFind(paging, text);
		
		if(pagedResult.hasContent()) {
			return pagedResult.getContent();
		}else {
			return new ArrayList<EventPagination>();
		}
	}

	@Override
	public Long findByFind(String text) {
		return eventPaginationDao.count();
	}

}
