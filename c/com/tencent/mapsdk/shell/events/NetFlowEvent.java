package com.tencent.mapsdk.shell.events;

import java.util.HashMap;
import java.util.Map;

public class NetFlowEvent extends ReportEvent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetFlowEvent(NetFlowEventModel netFlowEventModel) {
        super("cm_nf", (Map<String, String>) null);
        netFlowEventModel.getClass();
        HashMap hashMap = new HashMap();
        this.params = hashMap;
        StringBuilder sb = new StringBuilder();
        sb.append(netFlowEventModel.uploadFlow);
        hashMap.put("up", sb.toString());
        Map<String, String> map = this.params;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(netFlowEventModel.downloadFlow);
        map.put("dw", sb4.toString());
        Map<String, String> map2 = this.params;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(netFlowEventModel.uploadTime);
        map2.put("up_time", sb5.toString());
        Map<String, String> map3 = this.params;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(netFlowEventModel.downloadTime);
        map3.put("dw_time", sb6.toString());
        Map<String, String> map4 = this.params;
        StringBuilder sb7 = new StringBuilder();
        sb7.append(netFlowEventModel.downloadTime - netFlowEventModel.uploadTime);
        map4.put("rt", sb7.toString());
        this.params.put("biz_type", netFlowEventModel.bizType);
        this.params.put("url", netFlowEventModel.url);
        Map<String, String> map5 = this.params;
        StringBuilder sb8 = new StringBuilder();
        sb8.append(netFlowEventModel.errorCode);
        map5.put("err", sb8.toString());
    }
}
