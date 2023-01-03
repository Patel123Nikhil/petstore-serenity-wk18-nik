package com.petstore.petinfo;

import com.petstore.constants.EndPoints;
import com.petstore.model.PetsPojo;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class PetSteps {
    @Step("Create pet")
    public ValidatableResponse createPet(int id, String name, int cid,  String cname, String photourl, int tid,
                                         String tname, String status){
        PetsPojo petPojo = new PetsPojo();
        petPojo=PetsPojo.getPetPojo(id,name,cid,cname,photourl,tid,tname,status);

        return  SerenityRest.given().log().all()
                .header("Content-Type","application/json")
                .when()
                .body(petPojo)
                .post(EndPoints.CREATE_PET)
                .then();
    }
    @Step("Get Newly Created Pet by id")
    public ValidatableResponse getPetById(int id){
        return  SerenityRest.given().log().all()
                .pathParam("petID",id)
                .when()
                .get(EndPoints.GET_PET_BY_ID)
                .then();


    }
    @Step("Update Pet")
    public ValidatableResponse updatePet(int id, String name, int cid,  String cname, String photourl, int tid,
                                          String tname, String status){
        PetsPojo petPojo = new PetsPojo();
        petPojo=PetsPojo.getPetPojo(id,name,cid,cname,photourl,tid,tname,status);


        return  SerenityRest.given().log().all()
                .header("Content-Type","application/json")
                .when()
                .body(petPojo)
                .put(EndPoints.UPDATE_PET_BY_ID)
                .then();

    }
    @Step("Delete Pet")
    public ValidatableResponse deletePet(int id){

        return  SerenityRest.given().log().all()
                .header("Content-Type","application/json")
                .pathParam("petID",id)
                .when()
                .delete(EndPoints.DELETE_PET_BY_ID)
                .then();

    }

}
