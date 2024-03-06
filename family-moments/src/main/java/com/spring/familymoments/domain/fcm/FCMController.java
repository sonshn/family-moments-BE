package com.spring.familymoments.domain.fcm;

import com.spring.familymoments.domain.fcm.model.FCMReq;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class FCMController {
    private final FCMService fcmService;

    /**
     * 업로드 알림
     * Cron 표현식을 사용한 작업 예약
     * 초(0-59) 분(0-59) 시간(0-23) 일(1-31) 월(1-12) 요일(0-7)
     */
    @Scheduled(initialDelay = 0, fixedDelay = 60000)    // 초기 지연: 0밀리초, 실행 간격: 60초
//    @Scheduled(cron = "0 0 10 * * *")
    public void sendUploadAlarm() {
        FCMReq requestDto = FCMReq.builder()
                .title("게시물을 업로드 해주세요!")
                .body("바디바디")
                .build();
//        String result = fcmService.sendUploadAlarm(requestDto);
        fcmService.sendUploadAlarm(requestDto);
//        System.out.println(result);
    }
}
