package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedHashMap;
import java.util.List;
import p1177ce.C113287a;
import p212oe.C117776s;
import p269xe.C91179e;
import p981ie.C87705i;

/* renamed from: xe.e$b$a$$b */
public final /* synthetic */ class e$b$a$$b implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C114467i f355664a;

    /* renamed from: b */
    public final /* synthetic */ C113287a f355665b;

    public /* synthetic */ e$b$a$$b(C114467i iVar, C113287a aVar) {
        this.f355664a = iVar;
        this.f355665b = aVar;
    }

    public final void accept(Object obj) {
        float f;
        C114467i iVar = this.f355664a;
        C113287a aVar = this.f355665b;
        List list = (List) obj;
        if (!list.isEmpty()) {
            if ("ExcessiveCpu".equals(((C117776s) iVar).mo182526y())) {
                if (aVar.mo165841e() <= 15 || iVar.mo173666j() <= 2) {
                    Log.m105924i("Matrix.battery.BatteryReporter", "skip, min=" + aVar.mo165841e() + ", cpuLoad=" + iVar.mo173666j());
                    return;
                }
            } else if (iVar.mo173666j() < 85) {
                return;
            }
            long e = aVar.mo165841e();
            int c = aVar.mo165839c();
            int d = aVar.mo165840d();
            int i = aVar.f338972j;
            String str = (String) C118872b.m167611h(aVar).f166179a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("work-id", Integer.valueOf(iVar.hashCode()));
            String str2 = "";
            int i2 = 0;
            String str3 = str2;
            String str4 = str3;
            int i3 = 0;
            long j = 0;
            long j2 = 0;
            while (true) {
                String str5 = str2;
                f = 0.0f;
                if (i3 >= list.size()) {
                    break;
                }
                C114490k0.C114491a.C114492a aVar2 = (C114490k0.C114491a.C114492a) list.get(i3);
                JiffiesMonitorFeature.JiffiesSnapshot jiffiesSnapshot = (JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343207c;
                String str6 = jiffiesSnapshot.f343061f;
                long longValue = ((Long) jiffiesSnapshot.f343062g.f343211a).longValue();
                long j3 = j + longValue;
                String str7 = !((JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343207c).f343063h.f343212a.isEmpty() ? ((JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesSnapshot) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343207c).f343063h.f343212a.get(i2)).f343067c : str5;
                StringBuilder sb = new StringBuilder();
                sb.append("pid-");
                List list2 = list;
                int i4 = i3 + 1;
                sb.append(i4);
                String str8 = str3;
                sb.append("-cpuload");
                String sb4 = sb.toString();
                long j4 = j3;
                long j5 = aVar.f338976n;
                int i5 = c;
                int i6 = d;
                if (j5 > 0) {
                    f = ((float) (longValue * 10)) / ((float) j5);
                }
                linkedHashMap.put(sb4, Integer.valueOf((int) (100.0f * f)));
                linkedHashMap.put("pid-" + i4 + "-name", C118872b.m167610g(str6));
                linkedHashMap.put("pid-" + i4 + "-topThread", C118872b.m167612i(str7, -1));
                if (i3 == 0) {
                    str4 = C118872b.m167610g(str6);
                    str3 = C118872b.m167612i(str7, -1);
                    j2 = ((JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343207c).f343063h.f343212a.isEmpty() ? 0 : ((Long) ((JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesSnapshot) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343207c).f343063h.f343212a.get(0)).f343211a).longValue();
                } else {
                    str3 = str8;
                }
                str2 = str5;
                i3 = i4;
                list = list2;
                j = j4;
                c = i5;
                d = i6;
                i2 = 0;
            }
            int i7 = c;
            int i8 = d;
            String str9 = str3;
            long j6 = aVar.f338976n;
            if (j6 > 0) {
                f = ((float) (j * 10)) / ((float) j6);
            }
            linkedHashMap.put("pid-all-cpuLoad", Integer.valueOf((int) (100.0f * f)));
            if ("ExplicitBgPoll".equals(((C117776s) iVar).mo182526y())) {
                linkedHashMap.put("poll-count", Integer.valueOf(iVar.f343160i.getInt("poll_count")));
            }
            String str10 = "avgJiffies" + C118872b.m167605b(iVar) + "Exception";
            Log.m105924i("Matrix.battery.BatteryReporter", "#reportExplicitBgJiffies: " + str10);
            C91179e.C91181b.m114437a(1, 5, str4, C91179e.C91181b.m114438b(linkedHashMap), i7, i8, str10, j / e, C118872b.m167612i(str9, -1), j2 / e, "duringMin", e, str, "", (long) aVar.f338964b, (long) aVar.f338967e, (long) i, "");
        }
    }
}
