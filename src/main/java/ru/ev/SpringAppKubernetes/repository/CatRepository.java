package ru.ev.SpringAppKubernetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ev.SpringAppKubernetes.entity.Cat;

public interface CatRepository extends JpaRepository<Cat,String> {

}
