package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.TalksApiService;
import io.swagger.api.factories.TalksApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/talks")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-12T14:47:39.534Z[GMT]")public class TalksApi  {
   private final TalksApiService delegate;

   public TalksApi(@Context ServletConfig servletContext) {
      TalksApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TalksApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TalksApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = TalksApiServiceFactory.getTalksApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    
    @Operation(summary = "findAll", description = "", tags={ "talks-controller" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "403", description = "Forbidden"),
        
        @ApiResponse(responseCode = "404", description = "Not Found") })
    public Response findAllUsingGET(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.findAllUsingGET(securityContext);
    }
}
