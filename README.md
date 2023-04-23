# RestorantModel
Language - Java-17
Frame work - SprongBoot
Data flow->
            Controller-> Add some methods like - addResto, findRestaurantByName, findAllRestos , updateRestaurant, deleteRestaurant
            Service   -> Add some methods like - addRestaurant, findRestaurantByName, findAllRestaurant, updateRestaurant, deleteRestaurant
            Model     -> private String restoname
                         private String restoaddress
                         private int restonumber
                         private String restospeciality
                         private int restototalstaff
         Dependencies -> Lambok, Devtool, Spring web.
Summarry -> Creating a project using Spring Initializer  With required depencdencies( link:- https://start.spring.io/ ) 
            Name -> RestorantModel and Add some class variables to Restaurant  model like restaurant name, restaurant address, number, specialty, total staffs etc.   
            Operation performed-> get Restaurant by id using GetMapping.
                                  get all Reataurant using  GetMapping
                                  Add some Restaurant to Restaurant lists using PostMapping 
                                  update Restaurant information like Specialty. 
                                  delete Restaurant from the list.
         
           
