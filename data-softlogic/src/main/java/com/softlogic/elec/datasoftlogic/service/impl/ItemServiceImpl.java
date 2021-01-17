package com.softlogic.elec.datasoftlogic.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softlogic.elec.datasoftlogic.dto.ItemDTO;
import com.softlogic.elec.datasoftlogic.model.Item;
import com.softlogic.elec.datasoftlogic.repository.ItemRepository;
import com.softlogic.elec.datasoftlogic.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepo;

	@Override
	public List<ItemDTO> getItemListSoft() {
		List<Item> itemList = itemRepo.findAll();
		List<ItemDTO> itemDTOs = new ArrayList<>();
		itemList.forEach(
				item -> itemDTOs.add(new ItemDTO(item.getId(), item.getName(), item.getBrand(), item.getPrice())));
		return itemDTOs;
	}

}
