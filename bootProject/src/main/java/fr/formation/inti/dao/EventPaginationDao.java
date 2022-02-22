package fr.formation.inti.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import fr.formation.inti.entity.EventPagination;

public interface EventPaginationDao extends PagingAndSortingRepository<EventPagination, Integer>{

}
