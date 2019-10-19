package main;

import chart.BarChart;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BarChart barChart1 = BarChart.builder().withTitle("Table").withBackgroundColor("Blue").withDisplayLegend(true).build();
        System.out.println(barChart1);
    }
}
