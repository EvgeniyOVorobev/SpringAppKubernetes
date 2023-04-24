package ru.ev.SpringAppKubernetes.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ev.SpringAppKubernetes.dto.CatDto;
import ru.ev.SpringAppKubernetes.entity.Cat;
import ru.ev.SpringAppKubernetes.repository.CatRepository;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatService {
    private final CatRepository catRepository;

    public Cat save(CatDto catDto){
        Cat cat=new Cat().setName(catDto.getName())
                .setBirthDay(catDto.getBirthday())
                .setId(UUID.randomUUID().toString())
                .setCreatedAt(LocalDateTime.now());
     return catRepository.save(cat);
    }
    public Iterable<Cat> getAll(){
            return catRepository.findAll();
    }
}
