package com.example.mandisi.myassign6.ValuesObjectFactories;

import com.example.mandisi.myassign6.ValuesObjects.Addrec;

/**
 * Created by 211014486 on 4/17/2016.
 */
public interface AddrecFactory {
    Addrec createAddrec(String addressId, String street, String town, String postCode, String country);
}
