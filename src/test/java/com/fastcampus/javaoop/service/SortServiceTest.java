package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//loosely coupled 하게 만들어서 이를 테스트하는 코드
//이에서 JavaSort<> 등을 통해 테스트 시점에서 이를 변경가능

class SortServiceTest {
    private SortService sut = new SortService(new BubbleSort<>());


    @Test
    void test() {
        //given

        //When
        List<String> actual = sut.doSort(List.of("3","2","1"));

        //Then
        assertEquals(List.of("1","2","3"),actual);
    }
}