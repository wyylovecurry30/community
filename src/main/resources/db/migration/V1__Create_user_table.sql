create table USER
(
  ID           INTEGER default (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_B9236FEB_AD9A_49AE_9494_4FFDE21F560D)
    primary key,
  ACCOUNT_ID   VARCHAR(100),
  NAME         VARCHAR(50),
  TOKEN        CHAR(36),
  GMT_CREATE   BIGINT,
  GMT_MODIFIED BIGINT
);
