package net.scit.std.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class memberVO {
	private String userid; 		// 유저 아이디
	private String userpwd; 	// 유저 비밀번호
	private int chargingtime; 	// 충전 시간
	private int chargingday; 	// 충전 일수
	
}
