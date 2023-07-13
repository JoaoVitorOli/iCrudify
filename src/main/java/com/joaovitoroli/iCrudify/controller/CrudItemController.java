package com.joaovitoroli.iCrudify.controller;

import com.joaovitoroli.iCrudify.cruditem.Cruditem;
import com.joaovitoroli.iCrudify.cruditem.CruditemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cruditems")
public class CrudItemController {
    @Autowired
    private CruditemRepository cruditemRepository;

    @GetMapping
    public List<Cruditem> getAll() {
        List<Cruditem> cruditem = cruditemRepository.findAll();
        return cruditem;
    }
}
