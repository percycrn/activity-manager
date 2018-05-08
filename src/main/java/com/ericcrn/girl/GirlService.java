package com.ericcrn.girl;

import org.springframework.transaction.annotation.Transactional;

public class GirlService {
    private final GirlRepository girlRepository;

    public GirlService(GirlRepository girlRepository) {
        this.girlRepository = girlRepository;
    }

    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setName("OK");
        girlA.setAge(12);
        girlRepository.save(girlA);
        Girl girlB = new Girl();
        girlB.setName("NO");
        girlB.setAge(16);
        girlRepository.save(girlB);
    }
}
