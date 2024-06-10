DROP TABLE IF EXISTS fruit;
DROP TABLE IF EXISTS farmer;
CREATE TABLE farmer
(
    id BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
    name VARCHAR(255) NOT NULL,
    location VARCHAR(255),
    PRIMARY KEY (id)
) ENGINE = InnoDB;
CREATE TABLE fruit
(
    id BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
    name VARCHAR (255) NOT NULL, 
    description VARCHAR(255), 
    farmer_id BIGINT(20) UNSIGNED NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT `fk_fruit_farmer`
        FOREIGN KEY (farmer_id) REFERENCES farmer (id)
        ON DELETE RESTRICT
        ON UPDATE RESTRICT
) ENGINE = InnoDB;
INSERT INTO 
    farmer (id, name, location) 
VALUES
    (1000, 'Farmer Rick', 'Sa Pobla'),
    (2000, 'Morty Vegan', 'Es Vivero');
INSERT INTO 
    fruit (id, name, description, farmer_id) 
VALUES 
    (1000, 'Apple', 'Winter fruit', 1000),
    (2000, 'Pineapple', 'Tropical fruit', 2000);