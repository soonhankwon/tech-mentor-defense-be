package dev.techmentordefensebe.user.dto.request;

import dev.techmentordefensebe.oauth.enumtype.OauthProvider;
import dev.techmentordefensebe.user.domain.User;

//TODO 멤버변수 Validation 필요
public record UserAddRequest(
        String email,
        String nickname,
        OauthProvider oauthLoginType,
        String profileImgUrl
) {
    public User toEntity() {
        return new User(this);
    }
}
