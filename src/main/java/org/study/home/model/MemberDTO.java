package org.study.home.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class MemberDTO {
	private int user_no;
	private String user_id;
	private String user_pw;
	private String user_nick;
	private String user_phone;
	private boolean user_adult;
	private String user_email;
	private boolean email_check;
	private boolean adminCk;
	private Timestamp user_insertDate;
}