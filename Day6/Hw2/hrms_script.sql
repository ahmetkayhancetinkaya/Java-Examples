-- This script was generated by a beta version of the ERD tool in pgAdmin 4.
-- Please log an issue at https://redmine.postgresql.org/projects/pgadmin4/issues/new if you find any bugs, including reproduction steps.
BEGIN;


CREATE TABLE public."Candidates"
(
    candidate_id integer NOT NULL,
    first_name character varying(25) NOT NULL,
    last_name character varying(25) NOT NULL,
    identity_number character varying(11) NOT NULL,
    birth_year date NOT NULL,
    PRIMARY KEY (candidate_id)
);

CREATE TABLE public."Departments"
(
    id integer NOT NULL,
    dpt_name character varying NOT NULL,
    dpt_description character varying NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public."Employees"
(
    employee_id integer NOT NULL,
    first_name character varying(25) NOT NULL,
    last_name character varying(25) NOT NULL,
    salary character varying(10) NOT NULL,
    birth_date date NOT NULL,
    departmant_id integer NOT NULL,
    PRIMARY KEY (employee_id)
);

CREATE TABLE public."Employers"
(
    employer_id integer NOT NULL,
    company_name character varying(60) NOT NULL,
    web_site character varying(40) NOT NULL,
    telephone character varying(11) NOT NULL,
    PRIMARY KEY (employer_id)
);

CREATE TABLE public."Job_positions"
(
    id integer NOT NULL,
    pst_name character varying(25) NOT NULL,
    pst_depatment_id integer NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public."Users"
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    e_mail "char" NOT NULL,
    password "char" NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public."Verification_by_email"
(
    id integer NOT NULL,
    verified_users_id integer NOT NULL,
    veridiad_date date NOT NULL,
    verified_code character varying NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public."Verification_by_employee"
(
    id integer NOT NULL,
    by_employee_id integer NOT NULL,
    to_employer_id integer NOT NULL,
    verified_date date NOT NULL,
    verified_code character varying NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public."Verification_by_mernis"
(
    id integer NOT NULL,
    verified_candidate_id integer NOT NULL,
    mernis_verified_code character varying NOT NULL,
    mernis_verified_date date NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE public."Candidates"
    ADD FOREIGN KEY (candidate_id)
    REFERENCES public."Users" (id)
    NOT VALID;


ALTER TABLE public."Employees"
    ADD FOREIGN KEY (departmant_id)
    REFERENCES public."Departments" (id)
    NOT VALID;


ALTER TABLE public."Employees"
    ADD FOREIGN KEY (employee_id)
    REFERENCES public."Users" (id)
    NOT VALID;


ALTER TABLE public."Employers"
    ADD FOREIGN KEY (employer_id)
    REFERENCES public."Users" (id)
    NOT VALID;


ALTER TABLE public."Job_positions"
    ADD FOREIGN KEY (pst_depatment_id)
    REFERENCES public."Departments" (id)
    NOT VALID;


ALTER TABLE public."Verification_by_email"
    ADD FOREIGN KEY (verified_users_id)
    REFERENCES public."Users" (id)
    NOT VALID;


ALTER TABLE public."Verification_by_employee"
    ADD FOREIGN KEY (by_employee_id)
    REFERENCES public."Employees" (employee_id)
    NOT VALID;


ALTER TABLE public."Verification_by_employee"
    ADD FOREIGN KEY (to_employer_id)
    REFERENCES public."Employers" (employer_id)
    NOT VALID;


ALTER TABLE public."Verification_by_mernis"
    ADD FOREIGN KEY (verified_candidate_id)
    REFERENCES public."Candidates" (candidate_id)
    NOT VALID;

END;