package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.shell.events.EngineWriteDataModel;
import com.tencent.mapsdk.shell.events.ReportEvent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mapsdk.internal.sm */
public final class C114210sm extends ReportEvent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C114210sm(EngineWriteDataModel engineWriteDataModel) {
        super("map_engine_writeData", (Map<String, String>) null);
        engineWriteDataModel.getClass();
        HashMap hashMap = new HashMap();
        this.params = hashMap;
        StringBuilder sb = new StringBuilder();
        sb.append(engineWriteDataModel.resultCode);
        hashMap.put("err", sb.toString());
        Map<String, String> map = this.params;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(engineWriteDataModel.totalWriteCount);
        map.put("writeCount", sb4.toString());
        Map<String, String> map2 = this.params;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(engineWriteDataModel.dataSize);
        map2.put("size", sb5.toString());
        Map<String, String> map3 = this.params;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(engineWriteDataModel.ptr);
        map3.put("ptr", sb6.toString());
        Map<String, String> map4 = this.params;
        map4.put("url", engineWriteDataModel.url);
    }
}
