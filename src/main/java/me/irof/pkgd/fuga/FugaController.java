package me.irof.pkgd.fuga;

import me.irof.pkgd.piyo.PiyoService;
import org.springframework.stereotype.Controller;

@Controller
public class FugaController {
    FugaService service;
    PiyoService piyoService;

    public FugaController(FugaService service) {
        this.service = service;
    }
}
