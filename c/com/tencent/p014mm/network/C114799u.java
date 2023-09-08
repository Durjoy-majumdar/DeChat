package com.tencent.p014mm.network;

import qe3.C89631w;

/* renamed from: com.tencent.mm.network.u */
public interface C114799u {
    int getEncryptAlgo();

    boolean getIsLongPolling();

    boolean getIsUserCmd();

    int getLongPollingTimeout();

    int getNewExtFlags();

    int getOptions();

    String getReqHost();

    C89631w.C89634d getReqObj();

    C89631w.C89636e getRespObj();

    int getTimeOut();

    byte[] getTransHeader();

    int getType();

    String getUri();

    boolean isSingleSession();

    boolean keepAlive();

    void setConnectionInfo(String str);

    void setEncryptAlgo(int i);

    void setReqHost(String str);

    void setSingleSession(boolean z);
}
