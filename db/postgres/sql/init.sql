set client_encoding = 'UTF8';

create table if not exists login (
    user_id varchar(36) primary key,
    account_name varchar(100) not null,
    login_password varchar(255) not null, 
    last_login timestamp not null default current_timestamp
);