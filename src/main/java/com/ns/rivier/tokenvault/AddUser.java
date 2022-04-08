package com.ns.rivier.tokenvault;

import org.springframework.beans.factory.annotation.Autowired;

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

     AllowList resultAllowList =  saveAllowRepository.save(allowList);
     return resultAllowList.getId();

    }





}
