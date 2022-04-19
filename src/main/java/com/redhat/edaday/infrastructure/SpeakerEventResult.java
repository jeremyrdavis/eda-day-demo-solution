package com.redhat.edaday.infrastructure;

import com.redhat.edaday.domain.Speaker;
import com.redhat.edaday.domain.SpeakerEvent;

import java.util.List;

public class SpeakerEventResult {

    private Speaker speaker;

    private List<SpeakerEvent> speakerEvents;

    public SpeakerEventResult(Speaker speaker, List<SpeakerEvent> speakerEvents) {
        this.speaker = speaker;
        this.speakerEvents = speakerEvents;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public List<SpeakerEvent> getSpeakerEvents() {
        return speakerEvents;
    }

    public void setSpeakerEvents(List<SpeakerEvent> speakerEvents) {
        this.speakerEvents = speakerEvents;
    }
}
