package io.swagger.api.factories;

import io.swagger.api.TalksApiService;
import io.swagger.api.impl.TalksApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-12T14:47:39.534Z[GMT]")public class TalksApiServiceFactory {
    private final static TalksApiService service = new TalksApiServiceImpl();

    public static TalksApiService getTalksApi() {
        return service;
    }
}
