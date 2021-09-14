package me.irof.pkgd.service.piyo;

import me.irof.pkgd.repository.piyo.PiyoRepository;
import org.springframework.stereotype.Service;

@Service
public class PiyoService {
    PiyoRepository repository;

    public PiyoService(PiyoRepository repository) {
        this.repository = repository;
    }
}
