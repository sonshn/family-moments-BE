package com.spring.familymoments.domain.socialInfo.model;

import com.spring.familymoments.config.secret.jwt.model.TokenDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "로그인(토큰을 발급)하거나 리소스 서버 정보들을 반환하는 Response")
public class SocialLoginOrJoinResponse {
    private LoginResponse loginResponse;
    private JoinResponse joinResponse;
    @Builder
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class LoginResponse {
        @Schema(description = "기존회원있음", example = "true")
        private Boolean isExisted;
        @Schema(description = "토큰", example = "eeeeeeeeee")
        private TokenDto tokenDto;
    }
    @Builder
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JoinResponse {
        @Schema(description = "기존회원없음", example = "false")
        private Boolean isExisted;
        @Schema(description = "소셜 고유 ID", example = "23231221421")
        private String snsId;
        @Schema(description = "이름", example = "김영희")
        private String name;
        @Schema(description = "이메일", example = "younghee@kakao.com")
        private String email;
        @Schema(description = "생년월일", example = "20000101")
        private String strBirthDate;
        @Schema(description = "닉네임", example = "영희엄마")
        private String nickname;
        @Schema(description = "프로필 사진", example = "[url]")
        private String picture;
    }
}
