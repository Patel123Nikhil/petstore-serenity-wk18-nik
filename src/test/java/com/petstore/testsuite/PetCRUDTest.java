package com.petstore.testsuite;

import com.petstore.petinfo.PetSteps;
import com.petstore.testbase.TestBase;
import com.petstore.utils.TestUtils;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SerenityRunner.class)


public class PetCRUDTest extends TestBase {
    static int id = TestUtils.getRandomNumber();
    static String name = "vir" + TestUtils.getRandomString();
    static int cid = TestUtils.getRandomNumber();
    static String cname = "vir" + TestUtils.getRandomString();
    static String photourl = "photo" + TestUtils.getRandomString() +"com";
    static int tid = TestUtils.getRandomNumber();
    static String tname = "VD" + TestUtils.getRandomString();
    static String status = "available";
    @Steps
    PetSteps petSteps;

    @Title("Create New Pet")
    @Test
    public void test01_createPet() {
        ValidatableResponse response = petSteps.createPet(id,name,cid,cname,photourl,tid,tname,status);
        response.log().all().statusCode(200);
    }

    @Title("Get Newly Created Pet")
    @Test
    public void test02_getPetById() {
        ValidatableResponse response = petSteps.getPetById(id);
        response.log().all().statusCode(200);
    }
    @Title("Update Newly Created Pet")
    @Test
    public void test04_updatePet() {
        name = "Mrs" + TestUtils.getRandomString();
        cname = TestUtils.getRandomString();
        status = "sold";
        ValidatableResponse response = petSteps.updatePet(id,name,cid,cname,photourl,tid,tname,status);
        response.log().all().statusCode(200);
    }
    @Title("Delete Pet")
    @Test
    public void test05_deletePet(){
        ValidatableResponse response=petSteps.deletePet(id);
        response.log().all().statusCode(200);
    }
}
