package com.petstore.testsuite;

import com.petstore.petinfo.UsersSteps;
import com.petstore.testbase.TestBase;
import com.petstore.utils.TestUtils;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//@RunWith(SerenityRunner.class)
public class UserCRUDTest extends TestBase {
    static int id = TestUtils.getRandomNumber();
    static String username = "vir" + TestUtils.getRandomString();
    static String firstname = "Dev" + TestUtils.getRandomString();
    static String lastname = "VD" + TestUtils.getRandomString();
    static String email = "vird" + TestUtils.getRandomNumber() + "@gmail.com";
    static String password = TestUtils.getRandomString();
    static int userstatus = TestUtils.getRandomNumber();

    @Steps
    UsersSteps userSteps;

    @Title("Create New User")
    @Test
    public void test01_createUser() {
        ValidatableResponse response = userSteps.createUser(id, username, firstname, lastname, email, password, userstatus);
        response.log().all().statusCode(200);

    }

    @Title("Get Newly Created User")
    @Test
    public void test02_getUserByUserName() {
        ValidatableResponse response = userSteps.getUserInfo(username);
        response.log().all().statusCode(200);
    }

    @Title("Update Newly Create Users")
    @Test
    public void test04_updateUser() {
        firstname = "Mrs" + TestUtils.getRandomString();
        lastname = TestUtils.getRandomString();
        email = TestUtils.getRandomString() + "@gmail.com";
        ValidatableResponse response = userSteps.updateUser(id, username, firstname, lastname, email, password, userstatus);
        response.log().all().statusCode(200);
    }
    @Title("Delete User")
    @Test
    public void test05_deleteUser(){
        ValidatableResponse response=userSteps.deleteUser(username);
        response.log().all().statusCode(200);
    }
}
