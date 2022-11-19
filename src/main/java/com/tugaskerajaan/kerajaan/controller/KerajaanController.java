package com.tugaskerajaan.kerajaan.controller;

import com.tugaskerajaan.kerajaan.model.Kerajaan;
import com.tugaskerajaan.kerajaan.service.KerajaanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kerajaan")
public class KerajaanController {
    @Autowired
    private KerajaanService kerajaanService;

    @PostMapping
    public Kerajaan addKerajaan(@RequestBody Kerajaan kerajaan){
        return kerajaanService.addKerajaan(kerajaan);
    }
    @GetMapping("/{id}")
    public  Kerajaan getKerajaanByIdById(@PathVariable("id") Long id){
        return kerajaanService.getKerajaanById(id);
    }

    @PutMapping("/{id}")
    public  Kerajaan editKerajaanById(@PathVariable("id") Long id,@RequestBody Kerajaan kerajaan){
        return  kerajaanService.editKerajaanById(id,kerajaan.getKerajaanIslam(),kerajaan.getLetak(),kerajaan.getTahunBerdiri(),kerajaan.getRajaTerkenal(),kerajaan.getPeninggalanSejarah());
    }
    @GetMapping("/all")
    public List<Kerajaan> getAllKerajaan(){
        return kerajaanService.getAllKerajaan();
    }

    @DeleteMapping("/{id}")
    public void deleteSekolahById(@PathVariable("id") Long id){
        kerajaanService.deleteKerajaanById(id);
    }

}
