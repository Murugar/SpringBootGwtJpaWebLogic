package com.iqmsoft.boot.gwt.jpa.server;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/countries")
public class CountryRestController {
    
    @Autowired
    private CountryRepo countryRepo;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Country> getCountries(){
        Iterable<Country> allCountries = countryRepo.findAll();
        
//        ArrayList list = new ArrayList();
//        for(Country c : allCountries){
//            list.add(c);
//        }
        
        List list = createList(allCountries);        
        return list;
    }
    
    private List createList(Iterable it){
        
        ArrayList list = new ArrayList();
        for(Object o : it){
            list.add(o);
        }
        
        return list;
    }
    
}
