package me.irof.pkgd.hoge;

import org.springframework.stereotype.Service;

@Service
public class HogeService {

    HogeRepository repository;

    public HogeService(HogeRepository repository) {
        this.repository = repository;
    }
}
