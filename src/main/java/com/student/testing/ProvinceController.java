package com.student.testing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiProvince")

public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/")
    public List<Province> getProvince(){
        return provinceService.getProvinces();
    }

    @GetMapping("/{PROVINCE_ID}")
    public Province getProvince(@PathVariable Integer PROVINCE_ID){
        return provinceService.getProvinces(PROVINCE_ID);
        
    }


}
