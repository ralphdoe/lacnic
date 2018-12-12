package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.InventoryApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.InventoryItem;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;

@Path("/inventory")


@io.swagger.annotations.Api(description = "the inventory API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2018-12-12T14:49:47.026Z")
public class InventoryApi  {

    @Inject InventoryApiService service;

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "adds an inventory item", notes = "Adds an item to the system", response = Void.class, tags={ "admins", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "item created", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "invalid input, object invalid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "an existing item already exists", response = Void.class) })
    public Response addInventory(@ApiParam(value = "Inventory item to add" ) InventoryItem inventoryItem,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addInventory(inventoryItem,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "searches inventory", notes = "By passing in the appropriate options, you can search for available inventory in the system ", response = InventoryItem.class, responseContainer = "List", tags={ "developers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "search results matching criteria", response = InventoryItem.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad input parameter", response = Void.class) })
    public Response searchInventory(  @QueryParam("searchString") String searchString, @Min(0)  @QueryParam("skip") Integer skip, @Min(0) @Max(50)  @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchInventory(searchString,skip,limit,securityContext);
    }
}
