package com.example.Springmogodp.Controller;

import com.example.Springmogodp.Model.Frutis;
import com.example.Springmogodp.Service.FruitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping

public class FruitsController {
    @Autowired
    private FruitsService service;
    @PostMapping
    public String newFruits(@RequestBody Frutis apple){
        return service.addfruits(fruits);

    }
    @GetMapping
    public List<Frutis> getFrutis(){
        return  service.getallFruits();
    }

    @PutMapping("/{id}")
    public String updateFrutis(@RequestBody Frutis apple,@PathVariable String id){
        return  service.updateFruits(apple,id);
    }
}
