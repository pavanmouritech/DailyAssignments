package com.demo.model.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.model.Laptop;
import com.demo.model.repository.LaptopRepository;

@RestController
@RequestMapping("/laptop")
public class LaptopRestController {

	@Autowired
	private LaptopRepository laptoprepository;
	
		@PostMapping("/")
	 	public Laptop addLaptop(@RequestBody Laptop laptop) {
	        return laptoprepository.save(laptop);
	    }
	    @GetMapping("/")
	    public List<Laptop> listlaptop() {
	        return laptoprepository.findAll();
	    }
	    @PutMapping("/")
	    public Laptop updateLaptop(@RequestBody Laptop laptop) {
	        return laptoprepository.save(laptop);
	    }
}
