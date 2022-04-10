package com.ns.rivier.tokenvault;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.function.Function;

/**
 * AllowFunction
 * <br>
 * <code>com.ns.rivier.tokenvault.AllowFunction</code>
 * <br>
 *
 * @author Abhinav Jain
 * @since 22 March 2022
 */

public class AddUser implements Function<AllowList, String> {
@Autowired
private SaveAllowRepository saveAllowRepository;

    @Override
    public String apply(AllowList allowList) {
     String entityAlreadyExist = String.valueOf(saveAllowRepository.findAllById(Collections.singleton(allowList.getId())));
        if(entityAlreadyExist != null){
            AllowList resultAllowList =  saveAllowRepository.save(allowList);
            resultAllowList.getId();
        }
     return "entity already exist";

    }





}
