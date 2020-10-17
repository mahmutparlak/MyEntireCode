package com.company;

import java.util.ArrayList;

public class Main {

    class IntClass {
        private int myValue;

        public IntClass(int myValue) {
            this.myValue = myValue;
        }

        public int getMyValue() {
            return myValue;
        }

        public void setMyValue(int myValue) {
            this.myValue = myValue;
        }
    }

        public static void main(String[] args) {
//            String[] strArray = new String[10];
//            int[] intArray = new int[10];
//
//            ArrayList<String> strArrayList = new ArrayList<>();
//            strArrayList.add("Mahmut");
//
//            Integer integer = new Integer(24);
//            Double myDouble = new Double(11.5);
//
//            ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
//            for (int i = 0; i <= 10; i++) {
//                integerArrayList.add(Integer.valueOf(i));
//
//                System.out.println(i + "--->" + integerArrayList.get(i).intValue());
//            }
            Integer myIntValue = 54;

            ArrayList<Double> myDoubleValue = new ArrayList<Double>();
            for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
                myDoubleValue.add(dbl);
                System.out.println(dbl + "--->" + dbl);
            }

//            for (int i = 0; i < myDoubleValue.size(); i++) {
//                double value = myDoubleValue.get(i).doubleValue();
//                System.out.println(i + "--->" + value);
//            }
        }
    }