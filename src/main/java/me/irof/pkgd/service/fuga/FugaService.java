package me.irof.pkgd.service.fuga;

import me.irof.pkgd.repository.fuga.FugaRepository;
import org.springframework.stereotype.Service;

@Service
public class FugaService {
    FugaRepository repository;

    public FugaService(FugaRepository repository) {
        this.repository = repository;
    }
}
