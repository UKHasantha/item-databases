package com.singer.elec.datasinger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.singer.elec.datasinger.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
