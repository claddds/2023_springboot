package com.ict.edu2.member.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
import lombok.NoArgsConstructor;

//@Setter
//@Getter
@Data
// @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode을 한꺼번에 설정
// 인자가 없는 기본생성자 자동 생성
@NoArgsConstructor
// 모든 인자가 들어있는 생성자 자동 생성
@AllArgsConstructor
public class VO {
    private String m_id, m_pw, m_name, m_age, m_reg;
}
