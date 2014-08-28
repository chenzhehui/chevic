drop table t_user ;
create TABLE T_USER (
USER_ID NUMBER(10),
USER_NAME VARCHAR2(30),
USER_PASW VARCHAR2(100),
USER_REGDATE VARCHAR2(20),
USER_STATUS VARCHAR2(4)
);
COMMENT ON TABLE T_USER IS '用户表' ;
comment on column T_user.USER_ID is '用户流水号' ;
comment on column T_user.USER_NAME is '用户名' ;
comment on column T_user.USER_PASW is '密码' ;
comment on column T_user.USER_REGDATE is '注册日期' ;
comment on column T_user.USER_STATUS is '状态' ;