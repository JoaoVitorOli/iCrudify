package com.joaovitoroli.iCrudify.DTO;

import com.joaovitoroli.iCrudify.model.Cruditem;

public record CruditemResponseDTO(String id, String title, String image) {
    public CruditemResponseDTO(Cruditem cruditem) {
        this(cruditem.getId(), cruditem.getTitle(), cruditem.getImage());
    }
}