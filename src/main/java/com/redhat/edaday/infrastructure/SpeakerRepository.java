package com.redhat.edaday.infrastructure;

import com.redhat.edaday.domain.Speaker;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SpeakerRepository implements PanacheRepository<Speaker> {
}
