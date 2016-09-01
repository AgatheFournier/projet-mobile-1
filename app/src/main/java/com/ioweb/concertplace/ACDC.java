package com.ioweb.concertplace;

import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by AFW on 01/09/2016.
 */
public class ACDC extends AppCompatActivity {

    private String name;
    private String genre;
    private String place;
    private String city;
    private String date;

    public ACDC(String name, String genre, String place, String city, String date) {
        this.name = name;
        this.genre = genre;
        this.place = place;
        this.city = city;
        this.date = date;
    }

    @Override
    public String toString() {
        return "AC/DC à " + city + ". " + place + ". " + date;
    }

    public static ArrayList<ACDC> getListOfACDC() {
        ArrayList<ACDC> dataBase = new ArrayList<ACDC>();
        dataBase.add(new ACDC("Lyon", "Transbordeaur", "AC/DC", "rock", "02/10/2016"));
        dataBase.add(new ACDC("Toulouse", "ZENITH", "AC/DC", "rock", "07/11/2016"));
        return dataBase;
    };

    // problème car je ne fais pas de tris.

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private DateFormat dayMonthYear;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateFormat getDayMonthYear() {
        return dayMonthYear;
    }

    public void setDayMonthYear(DateFormat dayMonthYear) {
        this.dayMonthYear = dayMonthYear;
    }
}

