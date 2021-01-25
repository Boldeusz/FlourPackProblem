package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(canPack(2,2,11));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount <0 || smallCount < 0 || goal < 0){
            return false;
        }
        bigCount = 5 * bigCount;
        int sum = bigCount + smallCount;
        if (goal <= sum && smallCount >= goal % 5){
            return true;
        }
        return false;


    }

}
