package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.laptops;
import com.example.entity.mobiles;
import com.example.entity.tv;
import com.example.entity.watches;
import com.example.repository.laptopsRepository;
import com.example.repository.mobilesRepository;
import com.example.repository.tvRepository;
import com.example.repository.watchesRepository;

@RestController
@RequestMapping("/ecom")
public class Products {




@Autowired
private watchesRepository watchRepo;

@Autowired
private laptopsRepository laptopRepo;

@Autowired
private tvRepository tvRepo;

@Autowired
private mobilesRepository mobileRepo;

@GetMapping(value="/getAllWatches")
public List<watches> getAllWatches()
{
List<watches> watches = watchRepo.findAll();
return watches;
}

@PostMapping(value="/saveWatches")
public void saveWatches(@RequestBody watches watches) {
watchRepo.save(watches);
}

@PutMapping(value="/updateWatches")
public void updateWatch(@RequestBody watches watches)
{
watchRepo.save(watches);
}

@DeleteMapping(value="/deleteWatches/{id}")
public void delateWatch(@PathVariable int id)
{
watchRepo.deleteById(id);
}
@GetMapping(value="/getAllLaptops")
public List<laptops> getAllLaptops()
{
List<laptops> laptops = laptopRepo.findAll();
return laptops;
}

@PostMapping(value="/saveLaptops")
public void saveLaptops(@RequestBody laptops laptop) {
laptopRepo.save(laptop);
}

@PutMapping(value="/updateLaptops")
public void updateLaptops(@RequestBody laptops laptop)
{
laptopRepo.save(laptop);
}

@DeleteMapping(value="/deleteLaptops/{id}")
public void delateLaptops(@PathVariable int id)
{
laptopRepo.deleteById(id);
}
@GetMapping(value="/getTvs")
public List<tv> getAllTvs()
{
List<tv> tvs = tvRepo.findAll();
return tvs;
}

@PostMapping(value="/saveTvs")
public void saveTvs(@RequestBody tv tv) {
tvRepo.save(tv);
}

@PutMapping(value="/updateTvs")
public void updateTvs(@RequestBody tv tv)
{
tvRepo.save(tv);
}

@DeleteMapping(value="/deleteTvs/{id}")
public void delateTvs(@PathVariable int id)
{
tvRepo.deleteById(id);
}

@GetMapping(value="/getMobiles")
public List<mobiles> getAllMobiles()
{
List<mobiles> mobiles = mobileRepo.findAll();
return mobiles;
}

@PostMapping(value="/saveMobiles")
public void saveMobiles(@RequestBody mobiles mobile) {
	mobileRepo.save(mobile);
}

@PutMapping(value="/updateMobiles")
public void updateMobiles(@RequestBody mobiles mobile)
{
	mobileRepo.save(mobile);
}

@DeleteMapping(value="/deleteMobiles/{id}")
public void delateMobiles(@PathVariable int id)
{
	mobileRepo.deleteById(id);
}


}
