package com.tpe.security;

import com.tpe.security.service.UserDetailImpl;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class JwtProvider {
    /*
        In this class :
            1. Generate JW Token
            2. Validate JW Token
            3. extract userName from JW Token
     */


    private String jwtSecretKey = "sboot"; //secret key will be used to generate/parse token

    private long jwtExpiration =  86400000; //24*60*60*1000 = 24 hours

    //*************** GENERATE JW TOKEN *****************
    /*
        to generate TOKEN we need 3 things
            1. userName
            2. expire duration
            3. secret key
     */
    public String createToken(Authentication authentication){
        //getPrincipal method will give us currently logged in user
        UserDetailImpl userDetail = (UserDetailImpl) authentication.getPrincipal();
        return null;
    }


    //*************** VALIDATE JW TOKEN *****************

    //*************** EXTRACT USERNAME FROM JW TOKEN *****************

}
