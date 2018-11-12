/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oohm.tests;

import io.restassured.RestAssured;

/**
 *
 * @author Ritika
 */
public class BaseTest
{
    public static void main(String args[])
    {
        String baseURI = "https://buythisspace.com.au";
        if(RestAssured.get(baseURI).getStatusCode()==200)
        {
            System.out.println("Test executed successfuly");
        }
        else
        {
            System.out.println("Could not execute successfuly");
        }
    }    
}