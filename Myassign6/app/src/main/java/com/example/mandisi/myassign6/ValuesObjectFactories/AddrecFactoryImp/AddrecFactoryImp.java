package com.example.mandisi.myassign6.ValuesObjectFactories.AddrecFactoryImp;

/**
 * Created by 211014486 on 4/17/2016.
 */
import com.example.mandisi.myassign6.ValuesObjectFactories.AddrecFactory;
import com.example.mandisi.myassign6.ValuesObjects.Addrec;

import java.util.UUID;


public class AddrecFactoryImp implements AddrecFactory {
    private static AddrecFactoryImp factory = null;

    private  AddrecFactoryImp() {
    }
    public static AddrecFactoryImp getInstance(){
        if(factory ==null)
            factory = new AddrecFactoryImp();
        return factory;
    }
    public Addrec createAddrec(String addressId, String street, String town, String postCode, String country) {
        Addrec addrec = new Addrec
                .Builder()
                .addressId(UUID.randomUUID().toString())
                .street(street)
                .town(town)
                .postCode(postCode)
                .country(country)
                .build();
        return addrec;
    }
}
