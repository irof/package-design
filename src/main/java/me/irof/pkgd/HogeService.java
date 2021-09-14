package me.irof.pkgd;

import org.springframework.stereotype.Service;

@Service
public class HogeService {

    HogeRepository repository;

    public HogeService(HogeRepository repository) {
        this.repository = repository;
    }
}
