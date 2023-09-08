package com.tencent.thumbplayer.common.report;

import org.json.JSONObject;

public interface ITPReportParams {
    void paramsToJson(JSONObject jSONObject);

    void paramsToProperties(ITPReportProperties iTPReportProperties);

    void reset();
}
