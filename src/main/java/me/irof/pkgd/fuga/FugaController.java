package me.irof.pkgd.fuga;

import org.springframework.stereotype.Controller;

@Controller
public class FugaController {
    FugaService service;

    public FugaController(FugaService service) {
        this.service = service;
    }
}
