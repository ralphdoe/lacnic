package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.InventoryItem;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2018-12-12T14:49:47.026Z")
public interface InventoryApiService {
      Response addInventory(InventoryItem inventoryItem,SecurityContext securityContext)
      throws NotFoundException;
      Response searchInventory(String searchString,Integer skip,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
}
