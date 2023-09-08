package com.tencent.kinda.gen;

public interface KReportService {
    String getLastSessionInfo();

    void idkeyStat(long j, long j2, long j3, boolean z);

    void kvStat(int i, String str);

    void setLastSessionInfo(String str);

    long svrTimeMs();
}
