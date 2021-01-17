package com.softlogic.elec.datasoftlogic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softlogic.elec.datasoftlogic.dto.ItemDTO;
import com.softlogic.elec.datasoftlogic.service.ItemService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/soft")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@GetMapping("/get")
	public List<ItemDTO> getAllItem () {
		return itemService.getItemListSoft();
	}

}
