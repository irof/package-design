package me.irof.pkgd;

import org.springframework.stereotype.Service;

@Service
public class PiyoService {
    PiyoRepository repository;

    public PiyoService(PiyoRepository repository) {
        this.repository = repository;
    }
}
