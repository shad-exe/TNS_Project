package com.store;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MallRepository extends JpaRepository<MallEntity, Integer> 
{

	void deleteById();

}
