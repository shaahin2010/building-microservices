-- auto-generated definition
create table bms_building
(
  id            bigint      not null
    constraint bms_building_pkey
      primary key,
  address       varchar(255),
  building_code varchar(15) not null
    constraint uk_skh95r36u5wwq18q8w64aarp6
      unique,
  building_name varchar(50),
  building_no   varchar(15),
  total_flats   integer
);

alter table bms_building
  owner to shaahin2010;

INSERT INTO public.bms_building (id, address, building_code, building_name, building_no, total_flats) VALUES (1, '2nd East, Fakouri St.', 'myhome', '', '13', 8);