package com.RestorantModel.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantModelClass {
    private String restoname;
    private String restoaddress;
    private int restonumber;
    private String restospeciality;
    private int restototalstaff;

}
