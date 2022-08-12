package org.study.home.model;

import lombok.Data;

@Data
public class AttachImageDTO {
	/* 경로 */
	private String uploadPath;
	
	/* uuid */
	private String uuid;
	
	/* 파일 이름 */
	private String fileName;
	
	/* 상품 id */
	private int shipId;
}
