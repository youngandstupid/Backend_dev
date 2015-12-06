package main.java.yas.manager;

import main.java.yas.dao.BaseDao;
import main.java.yas.entity.*;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.*;

/**
 * Created by Salman on 11/30/2015.
 */
@Stateless
public class HousingManager {
    @EJB
    private BaseDao baseDao;

    public String createNewHousing() {
        Housing housing = new Housing();
        housing.setName("Otermount");
        housing.setDescription("high rise");
        housing.setBuildingType(BuildingType.apartmentBlock);
        housing.setCountry("Canada");
        housing.setCity("Montreal");
        housing.setState("QC");
        housing.setLatitude(1234567);
        housing.setLongitude(7654321);
        housing.setStreetName("Cote saint Catherine");
        housing.setStreetNumber("33");
        housing.setWorkingHours("9am-4pm");
        housing.setPostalCode("H2V2A1");
        housing.setFloors(24);
        Facility facility1 = new Facility();
        facility1.setFacility(FacilityConstant.securitySurveilance);

        Facility facility2 = new Facility();
        facility2.setFacility(FacilityConstant.indoorSwimmingPool);
        facility2.setDescription("open until 10pm");

        List<Facility> facilities = new ArrayList<Facility>();
        facilities.add(facility1);
        facilities.add(facility2);

        housing.setFacilities(facilities);

        /*HousingTypeDetail detail = new HousingTypeDetail();
        detail.setCurrency("CAD");
        //detail.setDateOfPrice(new Date());
        detail.setPrice(870f);
        HousingType housingType = new HousingType();
        housingType.setType(HousingTypeConstant.studio);
        housingType.setDescription("cozy");
        detail.setTypeDetail(housingType);
        detail.setHousingDetail(housing);

        housing.setDetails(Arrays.asList(detail));*/

        baseDao.saveHousing(housing);

        return housing.getName();


    }

}
