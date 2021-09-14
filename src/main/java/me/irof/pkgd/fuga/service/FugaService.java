package me.irof.pkgd.fuga.service;

import me.irof.pkgd.fuga.repository.FugaRepository;
import org.springframework.stereotype.Service;

@Service
public class FugaService {
    FugaRepository repository;

    public FugaService(FugaRepository repository) {
        this.repository = repository;
    }
}
