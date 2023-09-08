package com.tencent.kinda.gen;

public interface KHoneyPayService {
    void handleOfflineThings(int i, String str);

    void jumpToBankcardList();

    void selectSingeContactImpl(String str, VoidStringCallback voidStringCallback);

    void stopSelectSingleContact();

    void updateBubbleMsg(String str, String str2, String str3);
}
