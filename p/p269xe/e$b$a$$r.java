package p269xe;

import android.os.Build;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p1177ce.C113287a;
import p1195ge.C116947b;
import p212oe.C117774q;
import p212oe.C117776s;
import p212oe.b$$f;
import p212oe.b$$g;
import p269xe.C91179e;
import p285zh.c$$f;
import p981ie.C117159b;
import p981ie.C117173p;
import p981ie.C87705i;

/* renamed from: xe.e$b$a$$r */
public final /* synthetic */ class e$b$a$$r implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C114467i f355689a;

    /* renamed from: b */
    public final /* synthetic */ AtomicBoolean f355690b;

    /* renamed from: c */
    public final /* synthetic */ C113287a f355691c;

    public /* synthetic */ e$b$a$$r(C114467i iVar, AtomicBoolean atomicBoolean, C113287a aVar) {
        this.f355689a = iVar;
        this.f355690b = atomicBoolean;
        this.f355691c = aVar;
    }

    public final void accept(Object obj) {
        CpuStatFeature cpuStatFeature;
        String str;
        int i;
        long j;
        String str2;
        long j2;
        String str3;
        long j3;
        String str4;
        int i2;
        int i3;
        C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot> k;
        String str5;
        String str6;
        C114467i iVar = this.f355689a;
        AtomicBoolean atomicBoolean = this.f355690b;
        C113287a aVar = this.f355691c;
        C114490k0.C114491a.C114492a aVar2 = (C114490k0.C114491a.C114492a) obj;
        if ((Build.VERSION.SDK_INT >= 24) && (cpuStatFeature = (CpuStatFeature) iVar.mo173670n(CpuStatFeature.class)) != null && cpuStatFeature.mo173600x()) {
            C117774q.m166127j(MMApplicationContext.getContext(), (C116947b.C116948a) aVar2.f343207c, iVar);
            if (!atomicBoolean.get() || (((C116947b.C116948a) aVar2.f343207c).mo180934d() * 3600000.0d) / ((double) aVar.f338976n) >= 200.0d) {
                long e = aVar.mo165841e();
                int c = aVar.mo165839c();
                int d = aVar.mo165840d();
                int i4 = aVar.f338972j;
                String str7 = (String) C118872b.m167611h(aVar).f166179a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("work-id", Integer.valueOf(iVar.hashCode()));
                linkedHashMap.put("cpu-load-prc", Integer.valueOf(iVar.mo173666j()));
                linkedHashMap.put("cpu-load-nor", Integer.valueOf(iVar.mo173672p()));
                C117776s sVar = (C117776s) iVar;
                List<C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot>> g = sVar.mo173663g();
                String str8 = "";
                long j4 = 0;
                if (g == null || g.isEmpty()) {
                    str = str8;
                    i = i4;
                    j2 = 0;
                    j = 0;
                    str3 = str;
                    str2 = str3;
                } else {
                    String str9 = str8;
                    str2 = str9;
                    i = i4;
                    j2 = 0;
                    j = 0;
                    int i5 = 0;
                    while (i5 < g.size()) {
                        C114490k0.C114491a.C114492a aVar3 = g.get(i5);
                        JiffiesMonitorFeature.JiffiesSnapshot jiffiesSnapshot = (JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c;
                        List<C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot>> list = g;
                        String str10 = jiffiesSnapshot.f343061f;
                        j2 += ((Long) jiffiesSnapshot.f343062g.f343211a).longValue();
                        if (!((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343063h.f343212a.isEmpty()) {
                            str5 = str8;
                            str6 = ((JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesSnapshot) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343063h.f343212a.get(0)).f343067c;
                        } else {
                            str5 = str8;
                            str6 = str5;
                        }
                        if (i5 == 0) {
                            str9 = C118872b.m167610g(str10);
                            str2 = C118872b.m167612i(str6, -1);
                            j = ((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343063h.f343212a.isEmpty() ? 0 : ((Long) ((JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesSnapshot) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343063h.f343212a.get(0)).f343211a).longValue();
                        }
                        i5++;
                        g = list;
                        str8 = str5;
                    }
                    str = str8;
                    linkedHashMap.put("cpu-load-uid", Integer.valueOf(((int) ((((float) j2) * 10.0f) / ((float) aVar.f338976n))) * 100));
                    str3 = str9;
                }
                if (j2 != 0 || (k = iVar.mo173667k(JiffiesMonitorFeature.JiffiesSnapshot.class)) == null) {
                    i2 = 0;
                    str4 = str2;
                    j3 = j2;
                } else {
                    String str11 = ((JiffiesMonitorFeature.JiffiesSnapshot) k.f343207c).f343063h.f343212a.size() > 0 ? ((JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesSnapshot) ((JiffiesMonitorFeature.JiffiesSnapshot) k.f343207c).f343063h.f343212a.get(0)).f343067c : str;
                    if (((JiffiesMonitorFeature.JiffiesSnapshot) k.f343207c).f343063h.f343212a.size() > 0) {
                        j4 = ((Long) ((JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesSnapshot) ((JiffiesMonitorFeature.JiffiesSnapshot) k.f343207c).f343063h.f343212a.get(0)).f343211a).longValue();
                    }
                    j3 = ((Long) ((JiffiesMonitorFeature.JiffiesSnapshot) k.f343207c).f343062g.f343211a).longValue();
                    str4 = str11;
                    j = j4;
                    i2 = 0;
                }
                C117173p pVar = cpuStatFeature.f343048k;
                if (pVar == null || !pVar.mo181094l()) {
                    i3 = d;
                    linkedHashMap.put("power-profile", "non-supported");
                } else {
                    linkedHashMap.put("power-profile", "supported");
                    linkedHashMap.put("resType", C117173p.f351032f);
                    linkedHashMap.put("ver", 2);
                    linkedHashMap.put("dice-stat", Boolean.valueOf(b$$f.m166059d("powerStat", 50)));
                    linkedHashMap.put("dice-comp", Boolean.valueOf(b$$f.m166059d("powerCompare", 50)));
                    linkedHashMap.put("dice-test", Boolean.valueOf(b$$f.m166061f()));
                    Map<String, Object> d2 = C117774q.m166121d(pVar, (C116947b.C116948a) aVar2.f343207c, iVar, new e$b$a$$e(aVar));
                    Map<String, Object> v = C117159b.m165221v(d2, new e$b$a$$f());
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry key : ((LinkedHashMap) v).entrySet()) {
                        String str12 = (String) key.getKey();
                        if (!str12.startsWith("power-total")) {
                            arrayList.add(str12);
                            i2++;
                            if (i2 >= 3) {
                                break;
                            }
                        }
                    }
                    linkedHashMap.putAll(d2);
                    linkedHashMap.put("power-ranks", arrayList);
                    double d3 = ((C116947b.C116948a) aVar2.f343207c).mo180934d();
                    if (d3 > 0.0d) {
                        iVar.mo173668l(b$$g.class, new e$b$a$$g(aVar, d3, linkedHashMap));
                        i3 = d;
                        e$b$a$$h e_b_a__h = r1;
                        e$b$a$$h e_b_a__h2 = new e$b$a$$h(iVar, aVar, d3, linkedHashMap);
                        C114490k0.C114491a.C114503c.C114505b q = iVar.mo173673q(C114536x.C114540d.class);
                        if (q != null) {
                            e_b_a__h.accept(q);
                        }
                    } else {
                        return;
                    }
                }
                if ("ExplicitBgPoll".equals(sVar.mo182526y())) {
                    linkedHashMap.put("poll-count", Integer.valueOf(iVar.f343160i.getInt("poll_count")));
                }
                if ("ExplicitBg".equals(sVar.mo182526y())) {
                    iVar.mo173668l(c$$f.class, new e$b$a$$i(linkedHashMap));
                }
                String str13 = atomicBoolean.get() ? "Exception" : "Stats";
                String str14 = "avgPower" + C118872b.m167605b(iVar) + str13;
                Log.m105924i("Matrix.battery.BatteryReporter", "#reportHeathStats: " + str14);
                C91179e.C91181b.m114437a(0, 5, str3, C91179e.C91181b.m114438b(linkedHashMap), c, i3, str14, j3 / e, C118872b.m167612i(str4, -1), j / e, "duringMin", e, str7, "", (long) aVar.f338964b, (long) aVar.f338967e, (long) i, "");
            }
        }
    }
}
