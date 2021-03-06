package com.mine.api.impl;

import com.mine.api.*;
import java.io.File;
import com.mine.model.ModelApiResponse;
import com.mine.model.Pet;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;

import org.apache.cxf.jaxrs.ext.multipart.*;
import org.springframework.stereotype.Service;

/**
 * Swagger Petstore
 *
 * <p>This is a sample server Petstore server.  You can find out more about     Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters.
 *
 */
@Service
public class PetApiServiceImpl implements PetApi {
    /**
     * Add a new pet to the store
     *
     * 
     *
     */
    public void addPet(Pet body) {
        // TODO: Implement...
        
    }
    
    /**
     * Deletes a pet
     *
     * 
     *
     */
    public void deletePet(Long petId, String apiKey) {
        // TODO: Implement...
        
    }
    
    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     */
    public List<Pet> findPetsByStatus(List<String> status) {
        // TODO: Implement...
        return null;
    }
    
    /**
     * Finds Pets by tags
     *
     * Muliple tags can be provided with comma separated strings. Use         tag1, tag2, tag3 for testing.
     *
     */
    public List<Pet> findPetsByTags(List<String> tags) {
        // TODO: Implement...
        return null;
    }
    
    /**
     * Find pet by ID
     *
     * Returns a single pet
     *
     */
    public Pet getPetById(Long petId) {
        // TODO: Implement...
        return null;
    }
    
    /**
     * Update an existing pet
     *
     * 
     *
     */
    public void updatePet(Pet body) {
        // TODO: Implement...
        
    }
    
    /**
     * Updates a pet in the store with form data
     *
     * 
     *
     */
    public void updatePetWithForm(Long petId, String name, String status) {
        // TODO: Implement...
        
    }
    
    /**
     * uploads an image
     *
     * 
     *
     */
    public ModelApiResponse uploadFile(Long petId, String additionalMetadata,  Attachment fileDetail) {
        // TODO: Implement...
        return null;
    }
    
}

