package me.dio.sacola.resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import me.dio.sacola.Service.SacolaService;
import me.dio.sacola.model.Item;
import me.dio.sacola.resource.dto.ItemDto;

@RestController
@RequestMapping("/ifood-devweek/sacola")
@RequiredArgsConstructor

public class SacolaResource {
    private final SacolaService sacolaService;

    @PostMapping
    public Item incluirItemNaSacola(@RequestBody ItemDto itemDto) {
        return sacolaService.incluirItemNaSacola(itemDto);
    }


}
