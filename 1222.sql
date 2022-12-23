
/* Create Tables */

CREATE TABLE login1222
(
	userId varchar2(10 char) NOT NULL,
	userpw varchar2(10 char) NOT NULL,
	gender varchar2(10 char) NOT NULL,
	hobbys varchar2(100 char) NOT NULL,
	city varchar2(10 char) NOT NULL,
	memo varchar2(255 char) NOT NULL,
	PRIMARY KEY (userId)
);

desc login1222;
insert into login1222(userid,userpw,gender,hobbys,city,memo)
VALUES('m1','11','남자','등산','서울','자기소개 m1');
insert into login1222(userid,userpw,gender,hobbys,city,memo)
VALUES('m2','21','여자','게임','광주','자기소개 m2');
insert into login1222(userid,userpw,gender,hobbys,city,memo)
VALUES('m3','31','여자','영화','인천','자기소개 m3');

select * from login1222;
--로그인       count(*) 1이면 회원, 아니면 비회원
select count(*) from login1222 WHERE userid='m1' and userpw='11';
--회원정보 -> 상세정보
SELECT * FROM login1222 where userId = 'm1';
commit;
