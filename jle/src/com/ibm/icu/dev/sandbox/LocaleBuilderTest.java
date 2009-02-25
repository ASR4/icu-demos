package com.ibm.icu.dev.sandbox;

import java.util.Locale;
import java.util.Locale.LocaleBuilder;

//import com.ibm.icu.util.Locale;
//import com.ibm.icu.util.Locale.LocaleBuilder;

public class LocaleBuilderTest {

    public static void main(String[] args) {
        test1();
    }

    static void test1() {
        try {
            LocaleBuilder bld1 = new LocaleBuilder();
            LocaleBuilder bld2 = new LocaleBuilder();

            bld1.setLanguage("JA");
            bld1.setRegion("jp");
            bld1.setLocaleKeyword("ca", "japanese");

            bld2.setLocaleKeyword("CA", "Japanese");
            bld2.setRegion("Jp");
            bld2.setLanguage("Ja");

            Locale loc1 = bld1.create();
            Locale loc2 = bld2.create();

            System.out.println("loc1: " + loc1);
            System.out.println("loc2: " + loc2);

            System.out.println("loc1 == loc2 -> " + (loc1 == loc2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}