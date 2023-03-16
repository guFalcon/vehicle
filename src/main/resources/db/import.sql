INSERT INTO vehicle(model, brand, price)
VALUES('Kadett', 'Opel', 100);

INSERT INTO vehicle(model, brand, price)
VALUES('Megane', 'Renault', 10);

INSERT INTO customer(name, dateOfBirth)
VALUES('Gerald', '1975-05-02 12:00:00.000');

INSERT INTO rental(customer_id, vehicle_id, startDateTime, endDateTime, discount)
VALUES(1, 1, '2023-03-24 14:23:45.009', '2023-03-24 16:00:0.000', 43.4);