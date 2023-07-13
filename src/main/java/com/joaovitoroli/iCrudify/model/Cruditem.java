package com.joaovitoroli.iCrudify.model;

import jakarta.persistence.*;

@Table(name = "cruditems")
@Entity(name = "cruditems")
public class Cruditem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
}
