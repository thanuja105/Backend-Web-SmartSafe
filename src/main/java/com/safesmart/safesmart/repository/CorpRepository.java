package com.safesmart.safesmart.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.safesmart.safesmart.model.Corp;
@Repository
public interface CorpRepository extends PagingAndSortingRepository<Corp, Long>{
	
	Corp findByCorpName(String corpName);

}
