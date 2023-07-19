package com.spring.familymoments.domain.family.model;

import com.spring.familymoments.domain.family.entity.Family;
import com.spring.familymoments.domain.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostFamilyRes {
    private Long familyId;
    private String ownerNickName;
    private String inviteCode;
    private String ownerProfileImg;
    private String representImg;
    private LocalDateTime createdAt;
}
