package com.flashcards.common.services.broker.core.entites;

import com.flashcards.common.entities.Base;
import com.flashcards.common.services.broker.core.enums.EventStatus;

import jakarta.persistence.*;
import org.apache.avro.generic.GenericRecord;

@Entity
@Table(name = "events")
public class Event extends Base
{
    @Column(nullable = false)
    private String topic;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private byte attempts;

    @Lob
    @Column(nullable = false)
    private byte[] payload;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EventStatus status;

    @Column(nullable = false)
    private byte schemaId;

    @Transient
    private GenericRecord record;

    protected Event() { }

    public Event(
            String topic,
            String name,
            byte[] payload,
            byte schemaId
    )
    {
        super();

        this.topic = topic;
        this.name = name;
        this.attempts = 0;
        this.payload = payload;
        this.status = EventStatus.NEW;
        this.schemaId = schemaId;
    }

    public String getTopic()
    {
        return topic;
    }
    public String getName()
    {
        return name;
    }
    public byte getAttempts()
    {
        return attempts;
    }
    public byte[] getPayload()
    {
        return payload;
    }
    public EventStatus getStatus()
    {
        return status;
    }
    public byte getSchemaId() {
        return schemaId;
    }
    public GenericRecord getRecord()
    {
        return record;
    }

    public void incrementAttempts ()
    {
        this.attempts++;
    }
    public void markProcessed ()
    {
        this.status = EventStatus.PROCESSED;
    }
    public void markFailed ()
    {
        this.status = EventStatus.FAILED;
    }
    public void setRecord(GenericRecord record)
    {
        this.record = record;
    }
}

