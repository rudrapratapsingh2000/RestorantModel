package com.RestorantModel.Service;

import com.RestorantModel.Model.RestaurantModelClass;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class RestorantService {
    private static List<RestaurantModelClass> restos = new ArrayList<>();
    static {
        restos.add(new RestaurantModelClass("Taj","Noida",1001,"7 star",250));
        restos.add(new RestaurantModelClass("Raj Mahal","Noida",1002,"4.6 star",370));
        restos.add(new RestaurantModelClass("Rajput Resort","Lucknow",1003,"5 star",220));
        restos.add(new RestaurantModelClass("RP Palace","Noida",1004,"4 star",170));
        restos.add(new RestaurantModelClass("GIP","Delhi",1005,"6 star",300));
    }

    // add Restaurant in the List
    public void addRestaurant(RestaurantModelClass resto){
        restos.add(resto);
    }

    //find all restaurant in the List
    public List<RestaurantModelClass> findAllRestaurant(){ return restos; }

    // find Restaurant by Name
    public RestaurantModelClass findByName( String name){
        Predicate<? super RestaurantModelClass> predicate = rest -> rest.getRestoname().equals(name);
        RestaurantModelClass rest=restos.stream().filter(predicate).findFirst().get();
        return rest;
    }

    // find Restaurant by Number
    public RestaurantModelClass findByNumber( int number){
        Predicate<? super RestaurantModelClass> predicate = rest -> rest.getRestonumber()==number;
        RestaurantModelClass rest=restos.stream().filter(predicate).findFirst().get();
        return rest;
    }

    //number work as restaurant id and delete it.
    public void deleteRestaurant(int number){
        Predicate<? super RestaurantModelClass> predicate=rest ->rest.getRestonumber()==number;
        restos.removeIf(predicate);
    }

    //Update Restaurant Information
    public void updateRestaurant(int number, RestaurantModelClass newrest){
        RestaurantModelClass rest=findByNumber(number);
        rest.setRestoname(newrest.getRestoname());
        rest.setRestoaddress(newrest.getRestoaddress());
        rest.setRestonumber(newrest.getRestonumber());
        rest.setRestospeciality(newrest.getRestospeciality());
        rest.setRestototalstaff(newrest.getRestototalstaff());
    }

}
