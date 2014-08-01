
# --- !Ups
CREATE TABLE `ACCOUNTS` (
  `a_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `a_name` varchar(255) NOT NULL,
  `a_weibo_accessToken` varchar(255) DEFAULT NULL,
  `a_weibo_uid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


CREATE TABLE JOBS (
    j_id bigint(20) NOT NULL AUTO_INCREMENT,
    j_name varchar(255) NOT NULL,
    j_parentId bigint(20) NOT NULL,
    j_frequence_amount int ,
    j_frequence_unit int,
	PRIMARY KEY (j_id)
)                ;

CREATE TABLE JOB_DISPATCHS (
    jd_id bigint(20) NOT NULL AUTO_INCREMENT,
    jd_status int,
    jd_j_id bigint(20),
    jd_u_id bigint(20)
)         ;


# --- !Downs
DROP TABLE USERS;
DROP TABLE JOBS;
DROP TABLE JOB_DISPATCHS;