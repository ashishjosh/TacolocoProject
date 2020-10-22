package com.detroitlabs.tacolocojavachallenge.repository;

import com.detroitlabs.tacolocojavachallenge.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepo extends JpaRepository<Menu, Integer> {

    Menu findByItem(String item);
    
}
