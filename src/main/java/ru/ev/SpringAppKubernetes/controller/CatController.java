package ru.ev.SpringAppKubernetes.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.ev.SpringAppKubernetes.dto.CatDto;
import ru.ev.SpringAppKubernetes.entity.Cat;
import ru.ev.SpringAppKubernetes.service.CatService;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {
    private final CatService catService;
    @PostMapping
    public Cat save(@RequestBody CatDto cat){
        return catService.save(cat);
    }

    @GetMapping
    public Iterable<Cat> getAll(){
        return catService.getAll();
    }

}
