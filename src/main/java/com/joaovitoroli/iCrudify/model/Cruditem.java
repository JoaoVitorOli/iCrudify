package com.joaovitoroli.iCrudify.model;

import com.joaovitoroli.iCrudify.DTO.CruditemRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "cruditems")
@Entity(name = "cruditems")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cruditem {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String title;
    private String image;

    public Cruditem(CruditemRequestDTO data) {
        this.image = data.image();
        this.title = data.title();
    }
}
