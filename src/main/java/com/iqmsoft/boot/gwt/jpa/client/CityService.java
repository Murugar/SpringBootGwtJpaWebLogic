/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqmsoft.boot.gwt.jpa.client;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;


@Path("cities")
public interface CityService extends RestService { 
    
    @GET
    public void getCities( MethodCallback<List<CityDTO>> callback);
    
    @GET
    @Path("{countryname}")
    public void getCitiesByCountryName(@PathParam("countryname") String countryName, MethodCallback<List<CityDTO>> callback);
    
}
