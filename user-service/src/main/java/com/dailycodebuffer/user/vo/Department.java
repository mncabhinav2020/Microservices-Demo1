package com.dailycodebuffer.user.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private Long departmentId;
    private String departName;
    private String departmentAddress;
    private String departmentCode;
}
