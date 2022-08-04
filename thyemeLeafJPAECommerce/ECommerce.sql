create database ECommerce;
use ECommerce;

create table productcategory(categoryid bigint primary key, categoryname varchar(255));
create table product(id bigint primary key, sku varchar(255), name varchar(255), description varchar(255),
unitprice decimal(13,2) , imageurl varchar(255) ,unitsinstock int, datecreated datetime(6), 
lastupdated datetime(6) ,categoryid bigint, foreign key (categoryid) references productcategory(categoryid));