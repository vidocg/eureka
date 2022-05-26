DROP TABLE IF EXISTS client_details;

CREATE TABLE client_details(
    id bigint PRIMARY KEY,
    client_id bigint NOT NULL,
    details VARCHAR(255) NOT NULL,
    active BIT(1),
    FOREIGN KEY (client_id) REFERENCES client(id)
);