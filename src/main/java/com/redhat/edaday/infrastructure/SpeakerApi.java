package com.redhat.edaday.infrastructure;

import com.redhat.edaday.domain.CreateSpeakerCommand;
import com.redhat.edaday.domain.Speaker;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/speaker")
@Consumes(MediaType.APPLICATION_JSON) @Produces(MediaType.APPLICATION_JSON)
public class SpeakerApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpeakerApi.class);

    @Inject
    SpeakerService speakerService;

    @POST
    public Response createSpeaker(final CreateSpeakerCommand createSpeakerCommand) {

        Speaker speaker = speakerService.onCreateSpeaker(createSpeakerCommand);
        return Response.created(URI.create("/" + speaker.id)).entity(speaker).build();
    }
}
