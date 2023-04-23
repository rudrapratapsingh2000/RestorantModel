package com.RestorantModel.Controller;

import com.RestorantModel.Model.RestaurantModelClass;
import com.RestorantModel.Service.RestorantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resto-app")
public class RestorantController {
    private final RestorantService restoService;
    public RestorantController(RestorantService restoService){
        this.restoService=restoService;
    }
    @PostMapping("/add-restaurant")
    public void addResto(@RequestBody RestaurantModelClass restaurantModelClass){
        restoService.addRestaurant(restaurantModelClass);
    }


    //http://localhost:8080/api/resto-app/find-restaurant/name/{name}
    //http://localhost:8080/api/resto-app/find-restaurant/name/TAJ
    @GetMapping("/find-restaurant/name/{name}")
    public RestaurantModelClass findRestaurantByName(@PathVariable String name){
        return restoService.findByName(name);
    }


    //http://localhost:8080/api/resto-app/findall-restaurant
    @GetMapping("/findall-restaurant")
    public List<RestaurantModelClass> findAllRestos(){
        return restoService.findAllRestaurant();
    }


    //http://localhost:8080/api/resto-app/update-restaurant/number/{number}
//    http://localhost:8080/api/resto-app/update-restaurant/number/1001

    @PutMapping("/update-restaurant/number/{number}")
    public void updateRestaurant(@PathVariable int number,@RequestBody RestaurantModelClass restaurantModelClass){
        restoService.updateRestaurant(number,restaurantModelClass);
    }


    //http://localhost:8080/api/resto-app/delete-restaurant/number/{number}
    //http://localhost:8080/api/resto-app/delete-restaurant/number/1001
    @DeleteMapping("/delete-restaurant/number/{number}")
    public void deleteRestaurant(@PathVariable int number){
        restoService.deleteRestaurant(number);
    }
}
