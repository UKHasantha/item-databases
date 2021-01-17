package com.abans.elec.dataabans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abans.elec.dataabans.dto.ItemDTO;
import com.abans.elec.dataabans.service.ItemService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/abans")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/get")
	public List<ItemDTO> getAllItemAbans(){
		return itemService.getAllItemAbans();
	}

}
