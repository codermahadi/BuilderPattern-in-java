package com.phone;

/**
 * Created by Mahadi on 2/2/2018.
 */
public class Shop {

    public static void main(String[] args) {

        Phone p = new PhoneBuilder().setOs("Android").setRam(512).getPhone();
        System.out.println(p);
    }
}
