package com.devops.user_service_api_1.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RequestUserLoginRequest {
    private String username;
    private String password;
}