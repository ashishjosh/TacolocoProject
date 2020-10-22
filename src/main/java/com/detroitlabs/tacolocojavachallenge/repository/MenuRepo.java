package com.detroitlabs.tacolocojavachallenge.repository;

import com.detroitlabs.tacolocojavachallenge.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository class using in-memory database H2
 * database table will be created in console
 @Query(value = "SELECT * FROM Menu")
 **/
@Repository
public interface MenuRepo extends JpaRepository<Menu, Integer> {

    Menu findByItem(String item);
    
}
