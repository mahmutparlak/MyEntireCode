package com.company;

public class Main {

    public static void main(String[] args) {
        static boolean blala(int big, int small, int goal) {
            int dif = 5 * big + small - goal;
            if(dif < 0) {
                return false;

            } else if (dif == 0) {
                return true;

            } else {
                if (small >= dif) {
                    return true;

                } else {
                    return dif % big == 0;
                }
            }
        }
        static boolean blalabla(int big, int small, int goal) {
            int rem = goal % 5;
            if (rem == 0) {
                return true;
            }
            return small >= rem;
        }
        static boolean blalabla(int big, int small, int goal) {
            int rem = goal;
            int cnt = 1;
            while (rem >= 5) {
                rem -= cnt * 5;
                cnt++;
                if(cnt >= big) {
                    break;
                }
            }
            if (rem == 0) {
                return true;
            }
            return small >= rem;
        }
    }
}
