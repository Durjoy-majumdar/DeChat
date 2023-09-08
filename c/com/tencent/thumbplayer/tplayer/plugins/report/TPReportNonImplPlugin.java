package com.tencent.thumbplayer.tplayer.plugins.report;

import com.tencent.thumbplayer.api.report.ITPBusinessReportManager;
import com.tencent.thumbplayer.api.report.TPDefaultReportInfo;
import com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase;
import java.util.Map;

public class TPReportNonImplPlugin implements ITPPluginBase, ITPBusinessReportManager {
    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onEvent(int i, int i2, int i3, String str, Object obj) {
    }

    public void reportEvent(int i, Map<String, Object> map) {
    }

    public void setReportInfoGetter(TPDefaultReportInfo tPDefaultReportInfo) {
    }

    public void setReportSamplingRate(double d) {
    }
}
