ALTER  TABLE  client
ADD COLUMN name VARCHAR(64),
ADD COLUMN email VARCHAR(64) UNIQUE NOT NULL;