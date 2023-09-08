package com.tencent.mapsdk.shell.events;

import com.tencent.mapsdk.internal.C114207sl;
import java.util.Map;

public class ReportEvent {
    public String appKey = C114207sl.f341939k;
    public String code;
    public boolean isSucceed;
    public Map<String, String> params;
    public boolean realtime = false;

    public ReportEvent(String str, Map<String, String> map) {
        this.code = str;
        this.params = map;
    }
}
