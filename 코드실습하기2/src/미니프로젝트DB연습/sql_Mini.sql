/* 가제: 갓생살기 테이블*/
 /* 회원정보 테이블 */
create table godlifemember(mem_id varchar2(10), mem_pw varchar2(20) not null,
constraint mem_id_pk primary key(mem_id)
);

/* 캐릭터 정보 테이블*/
create table charac(ch_nick varchar2(10), cha_type 
);