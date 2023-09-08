package com.tencent.kinda.gen;

public interface KContactService {
    void attachAvatar(String str, KImageView kImageView);

    KContact get(String str);

    long getCryptUin();

    String getUserName();

    boolean isEuropeRegUser();
}
