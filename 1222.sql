
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
VALUES('m1','11','����','���','����','�ڱ�Ұ� m1');
insert into login1222(userid,userpw,gender,hobbys,city,memo)
VALUES('m2','21','����','����','����','�ڱ�Ұ� m2');
insert into login1222(userid,userpw,gender,hobbys,city,memo)
VALUES('m3','31','����','��ȭ','��õ','�ڱ�Ұ� m3');

select * from login1222;
--�α���       count(*) 1�̸� ȸ��, �ƴϸ� ��ȸ��
select count(*) from login1222 WHERE userid='m1' and userpw='11';
--ȸ������ -> ������
SELECT * FROM login1222 where userId = 'm1';
commit;
