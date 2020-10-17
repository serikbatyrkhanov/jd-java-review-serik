package com.cybertek.streams.exercises;

import com.cybertek.enums.Status;

public class StreamDemoTest {
    public static void main(String[] args) {

        System.out.println(StreamDemo.getListOfProject());

        System.out.println(StreamDemo.getListOfProject(Status.IN_PROGRESS));
    }
}
