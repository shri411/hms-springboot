package com.hmsapp.Service;

import com.hmsapp.Entity.City;
import com.hmsapp.Entity.Country;
import com.hmsapp.Entity.Property;
import com.hmsapp.Repository.CityRepository;
import com.hmsapp.Repository.CountryRepository;
import com.hmsapp.Repository.PropertyRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    private PropertyRepository pr;
    private CityRepository cr;
    private CountryRepository cor;

    public PropertyService(PropertyRepository pr, CityRepository cr, CountryRepository cor) {
        this.pr = pr;
        this.cr = cr;
        this.cor = cor;
    }


    public void addProperty(Property p, long cityId, long countryId) {
        City cityid = cr.findById(cityId).get();
        p.setCity(cityid);
        Country countryid = cor.findById(countryId).get();
        p.setCountry(countryid);
        pr.save(p);
    }


    public List<Property> getProperty(String search) {

        return  pr.search(search);
    }
}
