package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.JavaSort;
import com.fastcampus.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //구현체 중에 BubbleSort 를 사용할 것을 명확하게 알고 있으니, 현재는 Strongly coupled 상태임.
        //이를 다시 루즐리 커플드로 바꿈.
        //BubbleSort<String> sort = new BubbleSort<>();
        Sort<String> sort = new JavaSort<>();

        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}
