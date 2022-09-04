/* 가제: 갓생살기 게임 테이블*/

/* 회원정보 테이블(id(PK), pw(nn)*/
create table Minimember(mem_id varchar2(10), mem_pw varchar2(20) not null,
constraint minimem_memid_pk primary key(mem_id)
);

select * from Minimember;

/* 캐릭터 정보 테이블 -> 3개까지만 만들 수 있음, 캐릭터 타입 중복 가능*/
create table Minicharac(char_nick varchar2(10), cha_type varchar2(10) not null, exp number (3),
lv number (3), energy number (3), mem_id varchar2(10) not null, wokr_ability number (3) not null, stress number (3),
constraint minicha_nick_pk primary key(char_nick),
constraint minicha_id_fk foreign key(mem_id) references Minimember(mem_id)
);

/*drop table Minicharac;*/

select * from Minicharac;

/*전투 테이블*/
create table Battle(bat_list varchar2(10) not null, strees number(3), energy number(3), exp number(3),
constraint Battle_batlist_ck check(bat_list in('행정업무', '미팅참여', '외근가기'))
);

/*drop table Battle;*/

select * from Battle;

/*힐링 테이블*/
create table Healing(heal_list varchar2(10) not null, strees number(3), energy number(3), exp number(3),
constraint Healing_heallist_ck check(heal_list in('ott 시청', '드라이브', '월루하기'))
);

/*drop table Healing;*/

select * from Healing;


/*delete from 테이블 이름 where 컬럼='김동원' and age=30 and gender='남성'; -> 행 전체 삭제 */
/*insert into 테이블 이름 values('김동원',30,'남성'); -> 행 추가 */
/*update 테이블 이름 set age=25 where name='채수민'; -> 기존 행 내용 업데이트 */
