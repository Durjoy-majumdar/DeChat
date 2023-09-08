package com.tencent.kinda.gen;

public interface KNetworkService {
    byte[] getBaseRequest(int i);

    void invoke(KCgi kCgi, KNetworkMockManager kNetworkMockManager);
}
