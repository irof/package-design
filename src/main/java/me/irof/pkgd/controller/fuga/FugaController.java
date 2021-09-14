package me.irof.pkgd.controller.fuga;

import me.irof.pkgd.service.fuga.FugaService;
import org.springframework.stereotype.Controller;

@Controller
public class FugaController {
    FugaService service;

    public FugaController(FugaService service) {
        this.service = service;
    }
}
