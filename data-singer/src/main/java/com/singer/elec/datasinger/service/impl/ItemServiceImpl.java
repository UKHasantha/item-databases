package com.singer.elec.datasinger.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.singer.elec.datasinger.dto.ItemDTO;
import com.singer.elec.datasinger.model.Item;
import com.singer.elec.datasinger.repository.ItemRepository;
import com.singer.elec.datasinger.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepo;

	@Override
	public List<ItemDTO> getAllItemSing() {
		List<Item> itemList = itemRepo.findAll();
		List<ItemDTO> itemDTOs = new ArrayList<>();
		itemList.forEach(
				item -> itemDTOs.add(new ItemDTO(item.getId(), item.getBrand(), item.getName(), item.getPrice())));
		return itemDTOs;
	}

}
