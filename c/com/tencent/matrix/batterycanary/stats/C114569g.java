package com.tencent.matrix.batterycanary.stats;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C80364g;
import com.tencent.matrix.batterycanary.monitor.feature.C80368h0;
import com.tencent.matrix.batterycanary.monitor.feature.C80373t0;
import com.tencent.matrix.batterycanary.stats.BatteryRecord;
import com.tencent.matrix.batterycanary.stats.C114570h;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.stats.g */
public class C114569g implements C87705i<BatteryRecord.ReportRecord.EntryInfo> {

    /* renamed from: a */
    public final /* synthetic */ C114467i f343362a;

    /* renamed from: b */
    public final /* synthetic */ BatteryRecord.ReportRecord f343363b;

    public C114569g(C114570h.C114571a aVar, C114467i iVar, BatteryRecord.ReportRecord reportRecord) {
        this.f343362a = iVar;
        this.f343363b = reportRecord;
    }

    public void accept(Object obj) {
        BatteryRecord.ReportRecord.EntryInfo entryInfo = (BatteryRecord.ReportRecord.EntryInfo) obj;
        entryInfo.f343337d = "系统服务调用";
        entryInfo.f343339f = new LinkedHashMap();
        C114490k0.C114491a.C114492a<C80364g.C80367b> k = this.f343362a.mo173667k(C80364g.C80367b.class);
        if (k != null) {
            Map<String, String> map = entryInfo.f343339f;
            Locale locale = Locale.US;
            C80364g.C80367b bVar = (C80364g.C80367b) k.f343207c;
            map.put("BlueTooth 扫描", String.format(locale, "register %s, discovery %s, scan %s 次", new Object[]{bVar.f235242d.f343211a, bVar.f235243e.f343211a, bVar.f235244f.f343211a}));
        }
        C114490k0.C114491a.C114492a<C80373t0.C80376b> k2 = this.f343362a.mo173667k(C80373t0.C80376b.class);
        if (k2 != null) {
            Map<String, String> map2 = entryInfo.f343339f;
            Locale locale2 = Locale.US;
            C80373t0.C80376b bVar2 = (C80373t0.C80376b) k2.f343207c;
            map2.put("Wifi 扫描", String.format(locale2, "query %s, scan %s 次", new Object[]{bVar2.f235265e.f343211a, bVar2.f235264d.f343211a}));
        }
        C114490k0.C114491a.C114492a<C80368h0.C80371b> k3 = this.f343362a.mo173667k(C80368h0.C80371b.class);
        if (k3 != null) {
            entryInfo.f343339f.put("GPS 扫描", String.format(Locale.US, "scan %s 次", new Object[]{((C80368h0.C80371b) k3.f343207c).f235251d.f343211a}));
        }
        this.f343363b.f343336o.add(entryInfo);
    }
}
