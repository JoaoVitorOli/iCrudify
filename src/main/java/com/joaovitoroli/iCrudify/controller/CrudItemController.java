package com.joaovitoroli.iCrudify.controller;

import com.joaovitoroli.iCrudify.DTO.CruditemRequestDTO;
import com.joaovitoroli.iCrudify.DTO.CruditemResponseDTO;
import com.joaovitoroli.iCrudify.model.Cruditem;
import com.joaovitoroli.iCrudify.repository.CruditemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cruditems")
@CrossOrigin("*")
public class CrudItemController {
    @Autowired
    private CruditemRepository cruditemRepository;

    @PostMapping("save")
    public ResponseEntity<Void> saveCruditem(@RequestBody CruditemRequestDTO data) {
        Cruditem cruditemData = new Cruditem(data);
        cruditemRepository.save(cruditemData);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("update/{id}")
    public ResponseEntity<String> updateCruditem(@PathVariable String id, @RequestBody CruditemRequestDTO data) {
        Optional<Cruditem> crudItemOptional = cruditemRepository.findById(id);

        if (crudItemOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Item não encontrado.");
        }

        Cruditem cruditem = crudItemOptional.get();

        cruditem.setImage(data.image());
        cruditem.setTitle(data.title());

        cruditemRepository.save(cruditem);

        return ResponseEntity.status(HttpStatus.OK).body("Item atualizado com sucesso!");
    }

    @GetMapping
    public List<CruditemResponseDTO> getAll() {
        List<CruditemResponseDTO> cruditem = cruditemRepository.findAll().stream().map(CruditemResponseDTO::new).toList();
        return cruditem;
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteCruditem(@PathVariable String id) {
        Optional<Cruditem> cruditemOptional = cruditemRepository.findById(id);

        if (cruditemOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Item não encontrado.");
        }

        cruditemRepository.deleteById(id);

        return ResponseEntity.status(HttpStatus.OK).body("Item deletado com sucesso!");
    }
}
