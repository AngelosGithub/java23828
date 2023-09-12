package ch17stream.book.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("감자바");
        list.add("신용권");
        list.add("신민철");

        // 중복요소 제거
        list.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        // 신 으로 시작하는 요소만 필터링
        list.stream()
                .filter(n->n.startsWith("신"))
                .forEach(System.out::println);
        System.out.println();

        // 중복요소 먼저 제거하고 신 으로 시작하는 요소 필터링
        list.stream()
                .distinct()
                .filter(n->n.startsWith("신"))
                .forEach(System.out::println);
    }
}
