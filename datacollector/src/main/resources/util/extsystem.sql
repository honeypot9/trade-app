CREATE SCHEMA IF NOT EXISTS "trade";
USE SCHEMA "trade";
CREATE TABLE trade.extsystem (
	id int8 NOT NULL,
	alias varchar(10) NOT NULL,
	"name" varchar(20) NOT NULL
);
CREATE UNIQUE INDEX extsystem_id_idx ON public.extsystem (id);
COMMENT ON TABLE public.extsystem IS 'Extsystem table';

INSERT INTO "extsystem" ("alias", "name") VALUES ('yobit', 'yobit');
INSERT INTO "extsystem" ("alias", "name") VALUES ('bitmex', 'bitmex');