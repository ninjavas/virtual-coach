package io.ninjava.service;

import org.springframework.stereotype.Service;

/**
 * Created by jean- on 2016-02-09.
 */
@Service
public class CalcService {

    public int add(final int i1, final int i2) {
        return i1 + i2;
    }

    public int sub(final int i1, final int i2) {
        return i1 - i2;
    }

}
