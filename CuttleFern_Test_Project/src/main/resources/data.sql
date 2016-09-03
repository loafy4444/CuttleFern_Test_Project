insert into cuttlefern.state (name) values ('Colorado');
insert into cuttlefern.state (name) values ('Tennessee');
insert into cuttlefern.state (name) values ('Michigan');

insert into cuttlefern.city (name) values ('Denver');
insert into cuttlefern.city (name) values ('Memphis');
insert into cuttlefern.city (name) values ('Detroit');

insert into cuttlefern.city (name, state_id) values ('Montrose', 1);
insert into cuttlefern.city (name, state_id) values ('Nashville', 2);
insert into cuttlefern.city (name, state_id) values ('Minneapolis', 3);

insert into cuttlefern.interest (name) values ('Magic: The Gathering');
insert into cuttlefern.interest (name) values ('Console Gaming');
insert into cuttlefern.interest (name) values ('PC Gaming');
insert into cuttlefern.interest (name) values ('Sports');
insert into cuttlefern.interest (name) values ('Outdoor Activities');

insert into cuttlefern.group (name, interest_id, city_id) values ('Xbox Consortium', 2, 5);
insert into cuttlefern.group (name, interest_id, city_id) values ('PC Gamers Extreme', 3, 3);
insert into cuttlefern.group (name, interest_id, city_id) values ('Fit Freaks', 4, 2);
insert into cuttlefern.group (name, interest_id, city_id) values ('Mountain People', 5, 1);
insert into cuttlefern.group (name, interest_id, city_id) values ('MagicTimeFriends', 1, 2);

insert into cuttlefern.person (name, city_id) values ('Ben Ricks', 2);
insert into cuttlefern.person (name, city_id) values ('Kevin', 1);
insert into cuttlefern.person (name, city_id) values ('Scott', 1);

insert into cuttlefern.members (groups_id, members_id) values (1, 1);
insert into cuttlefern.members (groups_id, members_id) values (1, 2);
insert into cuttlefern.members (groups_id, members_id) values (1, 3);
insert into cuttlefern.members (groups_id, members_id) values (2, 1);
insert into cuttlefern.members (groups_id, members_id) values (3, 1);
insert into cuttlefern.members (groups_id, members_id) values (2, 2);
insert into cuttlefern.members (groups_id, members_id) values (3, 3);
insert into cuttlefern.members (groups_id, members_id) values (4, 2);

