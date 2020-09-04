--
-- PostgreSQL database dump
--

-- Dumped from database version 12.4
-- Dumped by pg_dump version 12.4

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plantations2020; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE plantations2020 WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'French_France.1252' LC_CTYPE = 'French_France.1252';


ALTER DATABASE plantations2020 OWNER TO postgres;

\connect plantations2020

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: champ; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.champ (
    id integer NOT NULL,
    nom text,
    distanceferme text
);


ALTER TABLE public.champ OWNER TO postgres;

--
-- Name: collection_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.collection_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.collection_id_seq OWNER TO postgres;

--
-- Name: collection_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.collection_id_seq OWNED BY public.champ.id;


--
-- Name: semences; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.semences (
    id integer,
    typesemence text,
    taille integer,
    fertilitesol text,
    quandrecolter text
);


ALTER TABLE public.semences OWNER TO postgres;

--
-- Name: champ id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.champ ALTER COLUMN id SET DEFAULT nextval('public.collection_id_seq'::regclass);


--
-- Data for Name: champ; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.champ VALUES (1, 'Champ no 1', '1,3km');
INSERT INTO public.champ VALUES (2, 'Champ no 2', '1,7km');
INSERT INTO public.champ VALUES (3, 'Champ no 3', '400m');
INSERT INTO public.champ VALUES (5, 'Champ no 4', '6,3km');
INSERT INTO public.champ VALUES (6, 'Champ no 5
', '3,2km');
INSERT INTO public.champ VALUES (7, 'Champ no 6', '1,1km');
INSERT INTO public.champ VALUES (9, 'Champ no 7', '2,3km');
INSERT INTO public.champ VALUES (10, 'Champ no 8', '3,5km');


--
-- Data for Name: semences; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Name: collection_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.collection_id_seq', 12, true);


--
-- Name: champ collection_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.champ
    ADD CONSTRAINT collection_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

