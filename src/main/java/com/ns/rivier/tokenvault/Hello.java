package com.ns.rivier.tokenvault;

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
public class Hello implements Function<String, String> {
    @Override
    public String apply(String name) {
        outerclass myclass = new outerclass();
        myclass.setInnerClass(1, "abhinav");
        return "Welcome, " + name;


    }


}
