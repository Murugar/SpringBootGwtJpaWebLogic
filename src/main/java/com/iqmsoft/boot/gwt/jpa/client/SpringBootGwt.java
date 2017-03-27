package com.iqmsoft.boot.gwt.jpa.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

import org.fusesource.restygwt.client.Defaults;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;




@Component
public class SpringBootGwt implements EntryPoint {

    public void onModuleLoad() {
        useCorrectRequestBaseUrl();
        //RootPanel.get().add(new TodoPanel());
        RootPanel.get().add(new TestPage());
    }

    
   
    
    private void useCorrectRequestBaseUrl() {
        if (isDevelopmentMode()) {
            // our spring boot server is running at port 7001. If we don't change the url
            // resty gwt would use the gwt servlet port
            Defaults.setServiceRoot("http://127.0.1.1:7001/SpringBootGwtJpa/");
            //Defaults.setServiceRoot(GWT.getHostPageBaseURL());
        } else {
            // in production our compiled javascript code gets copied into
            // a 'springbootgwt' folder into the static resources. So if we
            // dont change the default url resty gwt would put the folders name
            // to the base url
        	Defaults.setServiceRoot("http://127.0.1.1:7001/SpringBootGwtJpa/");
            //Defaults.setServiceRoot(GWT.getHostPageBaseURL());
        }
    }

   

       
    
      
    /**
     * Detect if the app is in development mode.
     *
     * @return true if in development mode
     */
    private static native boolean isDevelopmentMode()/*-{
        return typeof $wnd.__gwt_sdm !== 'undefined';
    }-*/;
}
