package com.petstore.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PetsPojo {
    private int id;

    private HashMap<String,Object> category;

    private String name ;

    private List<String> photoUrls;

    private List<HashMap<String, Object>> tags;

    private String status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<String, Object> getCategory() {
        return category;
    }

    public void setCategory(HashMap<String, Object> category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public List<HashMap<String, Object>> getTags() {
        return tags;
    }

    public void setTags(List<HashMap<String, Object>> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

/**********petpojo method*/
    public static PetsPojo getPetPojo(int id, String name, int cid, String cname, String photourl, int tid,
                                         String tname, String status) {
        PetsPojo petPojo = new PetsPojo();
        HashMap<String, Object> pet = new HashMap<String, Object>();
        pet.put("id", cid);
        pet.put("name", cname);

        List<String> photourl1 = new ArrayList<String>();
        photourl1.add(photourl);

        List<HashMap<String, Object>> petList = new ArrayList<HashMap<String, Object>>();
        petList.add(pet);

        petPojo.setId(id);
        petPojo.setCategory(pet);
        petPojo.setName(name);
        petPojo.setPhotoUrls(photourl1);
        petPojo.setTags(petList);
        petPojo.setStatus(status);
        return petPojo;
    }
}
