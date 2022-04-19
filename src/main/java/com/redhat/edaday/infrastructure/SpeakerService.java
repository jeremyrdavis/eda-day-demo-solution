package com.redhat.edaday.infrastructure;

import com.redhat.edaday.domain.CreateSpeakerCommand;
import com.redhat.edaday.domain.Speaker;
import com.redhat.edaday.domain.SpeakerEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.Collections;

@ApplicationScoped
public class SpeakerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpeakerService.class);

    @Inject
    SpeakerRepository speakerRepository;

    @Transactional
    public Speaker onCreateSpeaker(final CreateSpeakerCommand createSpeakerCommand) {

        SpeakerEventResult speakerEventResult = Speaker.createFrom(createSpeakerCommand);
        Speaker speaker = speakerEventResult.getSpeaker();
        speakerRepository.persist(speaker);
        LOGGER.info(speakerEventResult.getSpeakerEvents().get(0).getMessage());
        return speaker;
    }
}
