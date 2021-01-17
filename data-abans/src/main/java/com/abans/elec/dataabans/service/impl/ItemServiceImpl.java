package com.abans.elec.dataabans.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abans.elec.dataabans.dto.ItemDTO;
import com.abans.elec.dataabans.model.Item;
import com.abans.elec.dataabans.repository.ItemRepository;
import com.abans.elec.dataabans.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepo;

	@Override
	public List<ItemDTO> getAllItemAbans() {
		List<Item> itemList = itemRepo.findAll();
		List<ItemDTO> itemDTOs = new ArrayList<>();
		itemList.forEach(
				item -> itemDTOs.add(new ItemDTO(item.getId(), item.getBrand(), item.getName(), item.getPrice())));
		return itemDTOs;
	}

}
