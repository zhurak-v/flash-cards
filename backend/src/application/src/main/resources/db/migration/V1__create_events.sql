CREATE TABLE events
(
    id         UUID         PRIMARY KEY,
    created_at TIMESTAMPTZ  NOT NULL DEFAULT now(),
    updated_at TIMESTAMPTZ,
    topic      VARCHAR(255) NOT NULL,
    name       VARCHAR(255) NOT NULL,
    attempts   INTEGER      NOT NULL DEFAULT 0,
    payload    JSONB        NOT NULL,
    status     VARCHAR(255) NOT NULL,
    schema_id  INTEGER      NOT NULL
);
