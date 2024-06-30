-- V1__initial_migration.sql

-- Create schema if not exists
CREATE SCHEMA IF NOT EXISTS test;

-- Create extension for UUID generation if not exists
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- Create pdfs table
CREATE TABLE IF NOT EXISTS test.pdfs
(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    file_name VARCHAR(255) NOT NULL,
    data OID NOT NULL
);

-- Create pdf_validation_results table
CREATE TABLE IF NOT EXISTS test.pdf_validation_results
(
    pdf_id UUID NOT NULL,
    family VARCHAR(255),
    iso VARCHAR(255),
    part_number INT,
    ordinal INT,
    status VARCHAR(255),
    message TEXT,
    location_level VARCHAR(255),
    location_context VARCHAR(255),
    clause VARCHAR(255),
    test_number INT,
    CONSTRAINT fk_pdf
        FOREIGN KEY(pdf_id)
            REFERENCES test.pdfs(id)
);
