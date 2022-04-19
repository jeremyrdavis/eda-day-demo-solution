package com.redhat.edaday.domain;

import com.redhat.edaday.infrastructure.SpeakerEventResult;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.util.Collections;

@Entity
public class Speaker extends PanacheEntity{

    private String name;

    public static SpeakerEventResult createFrom(final CreateSpeakerCommand createSpeakerCommand) {

        Speaker speaker = new Speaker(createSpeakerCommand.name);
        SpeakerEvent speakerCreatedEvent = new SpeakerEvent("Speaker Created: " + speaker.getName()) ;
        return new SpeakerEventResult(speaker, Collections.singletonList(speakerCreatedEvent));
    }

    public Speaker(String name) {
        this.name = name;
    }

    public Speaker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
