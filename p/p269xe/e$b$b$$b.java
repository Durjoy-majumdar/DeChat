package p269xe;

import android.util.SparseArray;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p1177ce.C113287a;
import p269xe.C91179e;
import p329d3.C58104c;
import p981ie.C87705i;

/* renamed from: xe.e$b$b$$b */
public final /* synthetic */ class e$b$b$$b implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C113287a f355697a;

    /* renamed from: b */
    public final /* synthetic */ C114467i f355698b;

    /* renamed from: c */
    public final /* synthetic */ String f355699c;

    public /* synthetic */ e$b$b$$b(C113287a aVar, C114467i iVar, String str) {
        this.f355697a = aVar;
        this.f355698b = iVar;
        this.f355699c = str;
    }

    public final void accept(Object obj) {
        long j;
        String str;
        String str2;
        JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry;
        C113287a aVar = this.f355697a;
        C114467i iVar = this.f355698b;
        String str3 = this.f355699c;
        C114490k0.C114491a.C114492a aVar2 = (C114490k0.C114491a.C114492a) obj;
        if (((Long) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343207c).f343062g.f343211a).longValue() >= 100 && aVar2.f343208d >= 300000 && aVar.f338975m && !aVar.mo165843g()) {
            int c = aVar.mo165839c();
            int d = aVar.mo165840d();
            String f = C118872b.m167609f();
            long max = Math.max(1, aVar2.f343208d / 60000);
            long longValue = ((Long) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343207c).f343062g.f343211a).longValue() / max;
            ArrayList arrayList = new ArrayList(3);
            int i = 0;
            for (int i2 = 3; i < i2; i2 = 3) {
                long j2 = 0;
                if (((JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343207c).f343063h.f343212a.size() <= i || (threadJiffiesEntry = (JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343207c).f343063h.f343212a.get(i)) == null) {
                    str2 = "";
                } else {
                    str2 = threadJiffiesEntry.f343067c;
                    j2 = ((Long) threadJiffiesEntry.f343211a).longValue() / max;
                }
                arrayList.add(new C58104c(str2, Long.valueOf(j2)));
                i++;
            }
            String i3 = C118872b.m167612i((String) ((C58104c) arrayList.get(1)).f166179a, -1);
            int i4 = aVar.f338972j;
            C114490k0.C114491a.C114503c.C114505b q = iVar.mo173673q(C114536x.C114541e.class);
            if (q != null) {
                SparseArray<Integer> sparseArray = C91179e.C91181b.f261436a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("bat-temp-min", Double.valueOf(q.f343235g));
                linkedHashMap.put("bat-temp-max", Double.valueOf(q.f343234f));
                linkedHashMap.put("bat-temp-avg", Double.valueOf(q.f343236h));
                j = longValue;
                linkedHashMap.put("bat-temp-inc", Double.valueOf(q.f343234f - q.f343232d));
                linkedHashMap.put("bat-temp-dif", Double.valueOf(q.f343234f - q.f343235g));
                str = C91179e.C91181b.m114438b(linkedHashMap);
            } else {
                j = longValue;
                str = i3;
            }
            Log.m105924i("Matrix.battery.BatteryReporter", "#statModuleJiffies");
            String str4 = "statJiffies" + C118872b.m167604a(str3);
            SparseArray<Integer> sparseArray2 = C91179e.C91181b.f261436a;
            C91179e.C91181b.m114437a(0, 5, f, str, c, d, str4, j, C118872b.m167612i((String) ((C58104c) arrayList.get(0)).f166179a, -1), ((Long) ((C58104c) arrayList.get(0)).f166180b).longValue(), "duringMin", max, aVar.f338971i, "", (long) aVar.f338964b, (long) aVar.f338967e, (long) i4, "");
        }
    }
}
