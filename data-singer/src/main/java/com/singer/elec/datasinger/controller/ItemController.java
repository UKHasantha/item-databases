package com.singer.elec.datasinger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.singer.elec.datasinger.dto.ItemDTO;
import com.singer.elec.datasinger.service.ItemService;


@RestController
@CrossOrigin
@RequestMapping("api/v1/sin")
public class ItemController {
	@Autowired
	private ItemService itemService;

	@GetMapping("/get")
	public List<ItemDTO> getAllItem () {
		return itemService.getAllItemSing();
	}

}
