package fr.formation.inti.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import fr.formation.inti.entity.EventPagination;

public interface EventPaginationDao extends PagingAndSortingRepository<EventPagination, Integer>{

	
	@Query("SELECT e FROM Event e WHERE e.name LIKE %?1% or e.date LIKE %?1% or e.city LIKE %?1% or e.duration LIKE %?1% or e.category LIKE %?1% or e.description LIKE %?1%  or e.important LIKE %?1%")
	Page<EventPagination> findByFind(Pageable pageable, String text);
}
