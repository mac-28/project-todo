CREATE TABLE IF NOT EXISTS user (
    user_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50)  NOT NULL,
    last_name VARCHAR(50)  NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
    --  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS task (
    task_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    --  user_id BIGINT ,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    is_completed boolean default false,
    --     due_date DATE,
    --     priority INT DEFAULT 1,  -- 1 = Low, 2 = Medium, 3 = High
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
    -- FOREIGN KEY (user_id) REFERENCES user(user_id) ON DELETE CASCADE
    );