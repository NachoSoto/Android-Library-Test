package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import rx.Observable;
import rx.functions.Func1;

import static org.junit.Assert.assertEquals;

public class MyClassTest {
    private MyClass mClass;

    @Before
    public void setUp() throws Exception {
        mClass = new MyClass(2);
    }

    @Test
    public void testOne() {
        assertEquals(2, mClass.getNumber());
    }

    @Test
    public void getNumbers() throws Exception {
        final Observable<Integer> doubles = mClass.getNumbers().map(new Func1<Integer, Integer>() {
            @Override public Integer call(final Integer integer) {
                return integer * 2;
            }
        });

        final List<Integer> result = doubles.toList().toBlocking().single();
        assertEquals(Arrays.asList(2, 4, 6), result);
    }
}