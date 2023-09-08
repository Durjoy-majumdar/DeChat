package com.tencent.thumbplayer.api.reportv2;

import java.util.Map;

public interface ITPReportInfoGetter {
    Map<String, String> getInitExtendReportInfo();

    Map<String, String> getPeriodExtendReportInfo();
}
