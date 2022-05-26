--INSERT CLIENTS
INSERT INTO client (id, name, email) VALUES (1, 'firstClient', 'firstClient@email.com');
INSERT INTO client (id, name, email) VALUES (2, 'secondClient', 'secondClient@email.com');

--INSERT CLIENT_DETAILS
INSERT INTO client_details (id, details, client_id, active) VALUES (1, 'first client active details', 1, '1');
INSERT INTO client_details (id, details, client_id, active) VALUES (2, 'first client inactive details', 1, '0');
INSERT INTO client_details (id, details, client_id, active) VALUES (3, 'second client active details', 2, '1');
INSERT INTO client_details (id, details, client_id, active) VALUES (4, 'second client inactive details', 2, '0');

