package com.iqmsoft.boot.gwt.jpa.server;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author artem
 */
@RestController
@RequestMapping("/cities")
public class CityRestController {
    
    @Autowired
    private CityRepo cityRepo;
    
    @Autowired
    private CountryRepo countryRepo;
    
    @RequestMapping(value = "/{countryname}", method = RequestMethod.GET)
    public List<City> getCities(@PathVariable("countryname") String countryName){

        if(countryName == null){
            Iterable<City> allCountries = cityRepo.findAll();
            List list = createList(allCountries);

            return list;
        } else {
            Country c = countryRepo.findByName(countryName);
            if(c == null)
                return new ArrayList();

            return cityRepo.findByCountryId(c.getId());
        }


    }
    
    private List createList(Iterable it){
        
        ArrayList list = new ArrayList();
        for(Object o : it){
            list.add(o);
        }
        
        return list;
    }
    
}
