CREATE TABLE app_users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100),
    email VARCHAR(100)
);

CREATE TABLE employees (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    role VARCHAR(100),
    salary DOUBLE,
    user_id BIGINT,
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES app_users(id)
);

-- Insert users
INSERT INTO app_users (username, email) VALUES ('admin', 'admin@example.com');
INSERT INTO app_users (username, email) VALUES ('manager', 'manager@example.com');

-- Insert employees with user assignments
INSERT INTO employees (name, role, salary, user_id) VALUES ('Alice', 'Developer', 60000, 1);
INSERT INTO employees (name, role, salary, user_id) VALUES ('Bob', 'Tester', 50000, 2);
