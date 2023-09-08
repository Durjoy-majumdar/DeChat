package com.tencent.thumbplayer.common.report;

import java.util.Map;

public interface ITPReportProperties {
    void propertiesToMap(Map<String, String> map);

    void put(String str, float f);

    void put(String str, int i);

    void put(String str, long j);

    void put(String str, String str2);
}
