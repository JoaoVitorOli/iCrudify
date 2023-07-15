package com.joaovitoroli.iCrudify.repository;

import com.joaovitoroli.iCrudify.model.Cruditem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CruditemRepository extends JpaRepository<Cruditem, String> {
}
