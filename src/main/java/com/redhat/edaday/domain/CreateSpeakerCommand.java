package com.redhat.edaday.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class CreateSpeakerCommand {

    public final String name;

    public CreateSpeakerCommand(@JsonProperty("name") String name) {
        this.name = name;
    }
}
