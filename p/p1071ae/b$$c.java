package p1071ae;

import android.os.Bundle;
import com.tencent.matrix.battery.accumulate.AccPowerStats;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p1177ce.C113287a;
import p1195ge.C116947b;
import p1195ge.C116951c;
import p212oe.C117774q;
import p212oe.C117776s;
import p212oe.b$$f;
import p269xe.C118872b;
import p329d3.C86165a;
import p981ie.C117173p;
import p981ie.C87705i;
import p988jj.C87968a;

/* renamed from: ae.b$$c */
public final /* synthetic */ class b$$c implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ AccPowerStats f337716a;

    /* renamed from: b */
    public final /* synthetic */ C113287a f337717b;

    /* renamed from: c */
    public final /* synthetic */ C117776s f337718c;

    /* renamed from: d */
    public final /* synthetic */ C117173p f337719d;

    public /* synthetic */ b$$c(AccPowerStats accPowerStats, C113287a aVar, C117776s sVar, C117173p pVar) {
        this.f337716a = accPowerStats;
        this.f337717b = aVar;
        this.f337718c = sVar;
        this.f337719d = pVar;
    }

    public final void accept(Object obj) {
        AccPowerStats accPowerStats = this.f337716a;
        C113287a aVar = this.f337717b;
        C117776s sVar = this.f337718c;
        C117173p pVar = this.f337719d;
        C114490k0.C114491a.C114492a aVar2 = (C114490k0.C114491a.C114492a) obj;
        accPowerStats.getClass();
        Class<C114536x.C114541e> cls = C114536x.C114541e.class;
        Class<C114536x.C114540d> cls2 = C114536x.C114540d.class;
        C116947b.C116948a.C116950b bVar = ((C116947b.C116948a) aVar2.f343205a).f350465d;
        if (bVar != null) {
            long j = bVar.f350511a;
            double p = C116951c.m165015p((double) ((((float) j) * 1.0f) / ((float) aVar.f338976n)), 2);
            StringBuilder sb = new StringBuilder();
            sb.append("checkUseful: ");
            sb.append(j);
            sb.append("/");
            long j2 = j;
            sb.append(aVar.f338976n);
            sb.append("=");
            sb.append(p);
            Log.m105924i("MicroMsg.AccPowerMonitor", sb.toString());
            if (b$$f.m166058c()) {
                C87968a.C87969a.C87970a.m109467a("accPowerUseful", (Throwable) null, (Map<String, Object>) null, accPowerStats.f343030e, String.valueOf(p), String.valueOf(j2), String.valueOf(aVar.f338976n));
            }
        }
        if (sVar.mo182527z()) {
            accPowerStats.f343032g++;
            long j3 = accPowerStats.f343033h;
            long j4 = aVar.f338976n;
            accPowerStats.f343033h = j3 + j4;
            float f = (float) j4;
            accPowerStats.f343035j += (long) ((((float) aVar.f338964b) / 100.0f) * f);
            accPowerStats.f343036n += (long) ((((float) aVar.f338967e) / 100.0f) * f);
            C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot> k = sVar.mo173667k(JiffiesMonitorFeature.JiffiesSnapshot.class);
            if (k != null) {
                accPowerStats.f343037o += ((Long) ((JiffiesMonitorFeature.JiffiesSnapshot) k.f343207c).f343062g.f343211a).longValue();
            }
            C114490k0.C114491a.C114492a<JiffiesMonitorFeature.UidJiffiesSnapshot> k2 = sVar.mo173667k(JiffiesMonitorFeature.UidJiffiesSnapshot.class);
            if (k2 != null) {
                accPowerStats.f343038p += ((Long) ((JiffiesMonitorFeature.UidJiffiesSnapshot) k2.f343207c).f343084d.f343211a).longValue();
            }
            List<C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot>> g = sVar.mo173663g();
            int i = 20;
            if (g != null && !g.isEmpty()) {
                int i2 = 0;
                while (i2 < g.size()) {
                    C114490k0.C114491a.C114492a aVar3 = g.get(i2);
                    if (!((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343063h.f343212a.isEmpty()) {
                        String g2 = C118872b.m167610g(((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343061f);
                        Bundle bundle = accPowerStats.f343043u.getBundle(g2);
                        if (bundle == null) {
                            bundle = new Bundle();
                            accPowerStats.f343043u.putBundle(g2, bundle);
                        }
                        Bundle bundle2 = accPowerStats.f343044v.getBundle(g2);
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                            accPowerStats.f343044v.putBundle(g2, bundle2);
                        }
                        int i3 = 0;
                        while (i3 < ((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343063h.f343212a.size() && i3 < i) {
                            JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry = (JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343063h.f343212a.get(i3);
                            String str = threadJiffiesEntry.f343067c;
                            C117173p pVar2 = pVar;
                            C114490k0.C114491a.C114492a aVar4 = aVar2;
                            bundle.putLong(str, bundle.getLong(str, 0) + ((Long) threadJiffiesEntry.f343211a).longValue());
                            int i4 = threadJiffiesEntry.f343066b;
                            ArrayList<Integer> integerArrayList = bundle2.getIntegerArrayList(str);
                            if (integerArrayList == null) {
                                integerArrayList = new ArrayList<>();
                            }
                            integerArrayList.add(Integer.valueOf(i4));
                            bundle2.putIntegerArrayList(str, integerArrayList);
                            i3++;
                            pVar = pVar2;
                            aVar2 = aVar4;
                            i = 20;
                        }
                    }
                    i2++;
                    pVar = pVar;
                    aVar2 = aVar2;
                    i = 20;
                }
            }
            C117173p pVar3 = pVar;
            C114490k0.C114491a.C114492a aVar5 = aVar2;
            sVar.mo173665i(new b$$d(accPowerStats));
            if (!(aVar.mo165843g() || sVar.mo173673q(cls2) == null || sVar.mo173673q(cls) == null)) {
                accPowerStats.f343039q++;
                C114490k0.C114491a.C114503c.C114505b q = sVar.mo173673q(cls2);
                if (q != null) {
                    accPowerStats.f343040r = (long) (((double) accPowerStats.f343040r) + q.f343236h);
                }
                C114490k0.C114491a.C114503c.C114505b q2 = sVar.mo173673q(cls);
                if (q2 != null) {
                    accPowerStats.f343041s = (long) (((double) accPowerStats.f343041s) + q2.f343236h);
                }
            }
            C114490k0.C114491a.C114492a aVar6 = aVar5;
            int i5 = 0;
            for (Map.Entry next : ((C116947b.C116948a) aVar6.f343207c).f350508y0.entrySet()) {
                if (i5 >= 20) {
                    break;
                }
                String str2 = (String) next.getKey();
                long longValue = ((Long) ((C114490k0.C114491a.C114494b.C114497b) next.getValue()).f343211a).longValue();
                Bundle bundle3 = accPowerStats.f343046x;
                bundle3.putLong(str2, bundle3.getLong(str2, 0) + longValue);
                i5++;
            }
            int i6 = 0;
            for (Map.Entry next2 : ((C116947b.C116948a) aVar6.f343207c).f350510z0.entrySet()) {
                if (i6 >= 20) {
                    break;
                }
                String str3 = (String) next2.getKey();
                long longValue2 = ((Long) ((C114490k0.C114491a.C114494b.C114497b) next2.getValue()).f343211a).longValue();
                Bundle bundle4 = accPowerStats.f343047y;
                bundle4.putLong(str3, bundle4.getLong(str3, 0) + longValue2);
                i6++;
            }
            Map<String, Object> d = C117774q.m166121d(pVar3, (C116947b.C116948a) aVar6.f343207c, sVar, (C86165a<Map<String, Object>>) null);
            if (!d.isEmpty()) {
                for (Map.Entry next3 : d.entrySet()) {
                    String str4 = (String) next3.getKey();
                    Object value = next3.getValue();
                    if (str4.startsWith("power-") && (value instanceof Map)) {
                        Map map = ((LinkedHashMap) accPowerStats.f343042t).get(str4) instanceof Map ? (Map) ((LinkedHashMap) accPowerStats.f343042t).get(str4) : null;
                        if (map == null) {
                            map = new LinkedHashMap();
                            accPowerStats.f343042t.put(str4, map);
                        }
                        for (Map.Entry entry : ((Map) value).entrySet()) {
                            String str5 = (String) entry.getKey();
                            Object value2 = entry.getValue();
                            if (str5.equals("type") && (value2 instanceof String)) {
                                map.put(str5, value2);
                            } else if (value2 instanceof Number) {
                                Double d2 = map.get(str5) instanceof Double ? (Double) map.get(str5) : null;
                                if (d2 == null) {
                                    d2 = Double.valueOf(0.0d);
                                }
                                map.put(str5, Double.valueOf(d2.doubleValue() + ((Number) value2).doubleValue()));
                            }
                        }
                    }
                }
            }
        }
    }
}
