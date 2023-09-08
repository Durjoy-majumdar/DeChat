package com.tencent.thumbplayer.api.reportv2;

import java.util.Map;

public interface ITPReportChannelListener {
    void reportEvent(String str, Map<String, String> map);
}
