package com.tencent.matrix.batterycanary.stats;

import com.tencent.matrix.batterycanary.stats.BatteryRecord;
import com.tencent.matrix.batterycanary.stats.C114570h;
import java.util.LinkedHashMap;
import java.util.Map;
import p1177ce.C113287a;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.stats.f */
public class C114568f implements C87705i<BatteryRecord.ReportRecord.EntryInfo> {

    /* renamed from: a */
    public final /* synthetic */ C113287a f343360a;

    /* renamed from: b */
    public final /* synthetic */ BatteryRecord.ReportRecord f343361b;

    public C114568f(C114570h.C114571a aVar, C113287a aVar2, BatteryRecord.ReportRecord reportRecord) {
        this.f343360a = aVar2;
        this.f343361b = reportRecord;
    }

    public void accept(Object obj) {
        BatteryRecord.ReportRecord.EntryInfo entryInfo = (BatteryRecord.ReportRecord.EntryInfo) obj;
        entryInfo.f343337d = "App 状态";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        entryInfo.f343339f = linkedHashMap;
        linkedHashMap.put("前台时间占比", this.f343360a.f338963a + "%");
        Map<String, String> map = entryInfo.f343339f;
        map.put("后台时间占比", this.f343360a.f338964b + "%");
        Map<String, String> map2 = entryInfo.f343339f;
        map2.put("前台服务时间占比", this.f343360a.f338965c + "%");
        Map<String, String> map3 = entryInfo.f343339f;
        map3.put("充电时间占比", this.f343360a.f338967e + "%");
        Map<String, String> map4 = entryInfo.f343339f;
        map4.put("息屏时间占比 (排除充电)", this.f343360a.f338969g + "%");
        this.f343361b.f343336o.add(entryInfo);
    }
}
