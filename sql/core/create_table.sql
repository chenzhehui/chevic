drop table t_user ;
create TABLE T_USER (
USER_ID NUMBER(10),
USER_NAME VARCHAR2(30),
USER_PASW VARCHAR2(100),
USER_REGDATE VARCHAR2(20),
USER_STATUS VARCHAR2(4)
);
COMMENT ON TABLE T_USER IS '�û���' ;
comment on column T_user.USER_ID is '�û���ˮ��' ;
comment on column T_user.USER_NAME is '�û���' ;
comment on column T_user.USER_PASW is '����' ;
comment on column T_user.USER_REGDATE is 'ע������' ;
comment on column T_user.USER_STATUS is '״̬' ;