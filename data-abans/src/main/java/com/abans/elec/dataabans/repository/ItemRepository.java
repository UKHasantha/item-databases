package com.abans.elec.dataabans.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abans.elec.dataabans.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
