package me.irof.pkgd.piyo.service;

import me.irof.pkgd.piyo.repository.PiyoRepository;
import org.springframework.stereotype.Service;

@Service
public class PiyoService {
    PiyoRepository repository;

    public PiyoService(PiyoRepository repository) {
        this.repository = repository;
    }
}
