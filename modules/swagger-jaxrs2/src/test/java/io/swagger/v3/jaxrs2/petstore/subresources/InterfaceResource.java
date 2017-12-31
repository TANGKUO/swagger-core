package io.swagger.v3.jaxrs2.petstore.subresources;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Interface resource
 * Created by rafaellopez on 12/31/17.
 */
public interface InterfaceResource {
    @GET
    @Path("/{petId}")
    @Operation(summary = "Find pet by ID Operation in Parent",
            description = "Returns a pet in Parent"
    )
    Response getPetById(@Parameter(description = "ID of pet that needs to be fetched", required = true)
                        @PathParam("petId") Long petId);
}
