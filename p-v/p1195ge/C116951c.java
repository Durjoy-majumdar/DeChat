package p1195ge;

import android.content.Context;
import android.os.Build;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import java.util.Iterator;
import java.util.List;
import p723vf.C118672d;
import p981ie.C117173p;

/* renamed from: ge.c */
public final class C116951c {
    /* renamed from: a */
    public static double m165000a(C117173p pVar, HealthStats healthStats) {
        return ((pVar.mo181088e("modem.controller.idle") / 3600000.0d) * ((double) m165013n(healthStats, 10024))) + 0.0d + ((pVar.mo181088e("modem.controller.rx") / 3600000.0d) * ((double) m165013n(healthStats, 10025))) + ((pVar.mo181088e("modem.controller.tx") / 3600000.0d) * ((double) m165013n(healthStats, 10026)));
    }

    /* renamed from: b */
    public static double m165001b(C117173p pVar, HealthStats healthStats, double d, double d2) {
        double e = pVar.mo181088e("radio.active");
        if (e <= 0.0d) {
            double a = pVar.mo181084a("modem.controller.rx") + 0.0d;
            int h = pVar.mo181091h("modem.controller.tx");
            for (int i = 0; i < h; i++) {
                a += pVar.mo181085b("modem.controller.tx", i);
            }
            e = a / ((double) (h + 1));
        }
        return 0.0d + ((((e / 3600.0d) / (((d + d2) / 8.0d) / 2048.0d)) / 3600.0d) * ((double) (m165013n(healthStats, 10054) + m165013n(healthStats, 10055))));
    }

    /* renamed from: c */
    public static double m165002c(C117173p pVar, HealthStats healthStats) {
        long o = m165014o(healthStats, 10061) / 1000;
        double e = pVar.mo181088e("radio.active");
        if (e <= 0.0d) {
            double a = pVar.mo181084a("modem.controller.rx") + 0.0d;
            int h = pVar.mo181091h("modem.controller.tx");
            for (int i = 0; i < h; i++) {
                a += pVar.mo181085b("modem.controller.tx", i);
            }
            e = a / ((double) (h + 1));
        }
        return (e / 3600000.0d) * ((double) o);
    }

    /* renamed from: d */
    public static double m165003d(C117173p pVar, HealthStats healthStats) {
        return ((pVar.mo181088e("wifi.controller.idle") / 3600000.0d) * ((double) m165013n(healthStats, 10016))) + 0.0d + ((pVar.mo181088e("wifi.controller.rx") / 3600000.0d) * ((double) m165013n(healthStats, 10017))) + ((pVar.mo181088e("wifi.controller.tx") / 3600000.0d) * ((double) m165013n(healthStats, 10018)));
    }

    /* renamed from: e */
    public static double m165004e(C117173p pVar, HealthStats healthStats, double d, double d2) {
        int i;
        int i2 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
        if (i2 < 0 || d2 < 0.0d) {
            return 0.0d;
        }
        if (i2 == 0 && i == 0) {
            return 0.0d;
        }
        return 0.0d + (((pVar.mo181088e("wifi.active") / 3600.0d) / (((d + d2) / 8.0d) / 2048.0d)) * ((double) (m165013n(healthStats, 10056) + m165013n(healthStats, 10057)))) + ((pVar.mo181088e("wifi.on") / 3600000.0d) * ((double) m165013n(healthStats, 10028))) + ((pVar.mo181088e("wifi.scan") / 3600000.0d) * ((double) m165014o(healthStats, 10030)));
    }

    /* renamed from: f */
    public static double m165005f(C117173p pVar, long j) {
        return (pVar.mo181088e("cpu.active") / 3600000.0d) * ((double) j);
    }

    /* renamed from: g */
    public static double m165006g(C117173p pVar, CpuStatFeature.C114427b bVar, long j, boolean z) {
        boolean z2 = false;
        for (C114490k0.C114491a.C114494b.C114502c<C114490k0.C114491a.C114494b.C114497b<Long>> cVar : bVar.f343054e) {
            Iterator<ITEM> it = cVar.f343212a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Long) ((C114490k0.C114491a.C114494b.C114497b) it.next()).f343211a).longValue() > 0) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2) {
            return m165008i(pVar, bVar, j, z);
        }
        C118672d.m167353c("HealthStatsHelper", "estimate CPU by device stats", new Object[0]);
        return m165007h(pVar, bVar, j);
    }

    /* renamed from: h */
    public static double m165007h(C117173p pVar, CpuStatFeature.C114427b bVar, long j) {
        C117173p pVar2 = pVar;
        CpuStatFeature.C114427b bVar2 = bVar;
        long j2 = j;
        double d = 0.0d;
        long j3 = 0;
        if (j2 > 0) {
            long j4 = 0;
            for (int i = 0; i < bVar2.f343053d.size(); i++) {
                for (ITEM item : bVar2.f343053d.get(i).f343212a) {
                    j4 += ((Long) item.f343211a).longValue();
                }
            }
            int i2 = 0;
            while (i2 < bVar2.f343053d.size()) {
                List<ITEM> list = bVar2.f343053d.get(i2).f343212a;
                long j5 = j3;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    j5 += ((Long) ((C114490k0.C114491a.C114494b.C114497b) list.get(i3)).f343211a).longValue();
                }
                long j6 = (long) (((((float) j5) * 1.0f) / ((float) j4)) * ((float) j2));
                int f = pVar2.mo181089f(i2);
                if (f >= 0 && f < pVar2.f351033a.length) {
                    d += (pVar2.mo181086c(f) / 3600000.0d) * ((double) j6);
                }
                i2++;
                j3 = 0;
            }
        }
        return d;
    }

    /* renamed from: i */
    public static double m165008i(C117173p pVar, CpuStatFeature.C114427b bVar, long j, boolean z) {
        C117173p pVar2 = pVar;
        CpuStatFeature.C114427b bVar2 = bVar;
        long j2 = j;
        double d = 0.0d;
        if (j2 > 0) {
            long j3 = 0;
            int i = 0;
            while (true) {
                int i2 = 1;
                if (i >= bVar2.f343054e.size()) {
                    break;
                }
                List<ITEM> list = bVar2.f343054e.get(i).f343212a;
                if (z) {
                    i2 = pVar2.f351033a[i].f351037d;
                }
                for (ITEM item : list) {
                    j3 += ((Long) item.f343211a).longValue() * ((long) i2);
                }
                i++;
            }
            for (int i3 = 0; i3 < bVar2.f343054e.size(); i3++) {
                List<ITEM> list2 = bVar2.f343054e.get(i3).f343212a;
                int i4 = z ? pVar2.f351033a[i3].f351037d : 1;
                int i5 = 0;
                long j4 = 0;
                while (i5 < list2.size()) {
                    j4 += ((Long) ((C114490k0.C114491a.C114494b.C114497b) list2.get(i5)).f343211a).longValue() * ((long) i4);
                    i5++;
                    list2 = list2;
                    d = d;
                }
                d += (pVar2.mo181086c(i3) / 3600000.0d) * ((double) ((long) (((((float) j4) * 1.0f) / ((float) j3)) * ((float) j2))));
            }
            double d2 = d;
        }
        return d;
    }

    /* renamed from: j */
    public static double m165009j(C117173p pVar, CpuStatFeature.C114427b bVar, long j, boolean z) {
        boolean z2 = false;
        for (C114490k0.C114491a.C114494b.C114502c<C114490k0.C114491a.C114494b.C114497b<Long>> cVar : bVar.f343054e) {
            Iterator<ITEM> it = cVar.f343212a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Long) ((C114490k0.C114491a.C114494b.C114497b) it.next()).f343211a).longValue() > 0) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2) {
            return m165011l(pVar, bVar, j, z);
        }
        C118672d.m167353c("HealthStatsHelper", "estimate CPU by device stats", new Object[0]);
        return m165010k(pVar, bVar, j);
    }

    /* renamed from: k */
    public static double m165010k(C117173p pVar, CpuStatFeature.C114427b bVar, long j) {
        C117173p pVar2 = pVar;
        CpuStatFeature.C114427b bVar2 = bVar;
        long j2 = j;
        double d = 0.0d;
        long j3 = 0;
        if (j2 > 0) {
            for (int i = 0; i < bVar2.f343053d.size(); i++) {
                for (ITEM item : bVar2.f343053d.get(i).f343212a) {
                    j3 += ((Long) item.f343211a).longValue();
                }
            }
            for (int i2 = 0; i2 < bVar2.f343053d.size(); i2++) {
                List<ITEM> list = bVar2.f343053d.get(i2).f343212a;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    long longValue = (long) (((((float) ((Long) ((C114490k0.C114491a.C114494b.C114497b) list.get(i3)).f343211a).longValue()) * 1.0f) / ((float) j3)) * ((float) j2));
                    int f = pVar2.mo181089f(i2);
                    if (f >= 0 && f < pVar2.f351033a.length) {
                        d += (pVar2.mo181087d(f, i3) / 3600000.0d) * ((double) longValue);
                    }
                }
            }
        }
        return d;
    }

    /* renamed from: l */
    public static double m165011l(C117173p pVar, CpuStatFeature.C114427b bVar, long j, boolean z) {
        C117173p pVar2 = pVar;
        CpuStatFeature.C114427b bVar2 = bVar;
        long j2 = j;
        double d = 0.0d;
        long j3 = 0;
        if (j2 > 0) {
            int i = 0;
            while (true) {
                int i2 = 1;
                if (i >= bVar2.f343054e.size()) {
                    break;
                }
                List<ITEM> list = bVar2.f343054e.get(i).f343212a;
                if (z) {
                    i2 = pVar2.f351033a[i].f351037d;
                }
                for (ITEM item : list) {
                    j3 += ((Long) item.f343211a).longValue() * ((long) i2);
                }
                i++;
            }
            int i3 = 0;
            while (i3 < bVar2.f343054e.size()) {
                List<ITEM> list2 = bVar2.f343054e.get(i3).f343212a;
                int i4 = z ? pVar2.f351033a[i3].f351037d : 1;
                int i5 = 0;
                while (i5 < list2.size()) {
                    int i6 = i3;
                    d += (pVar2.mo181087d(i6, i5) / 3600000.0d) * ((double) ((long) (((((float) (((Long) ((C114490k0.C114491a.C114494b.C114497b) list2.get(i5)).f343211a).longValue() * ((long) i4))) * 1.0f) / ((float) j3)) * ((float) j2))));
                    i5++;
                    i3 = i6;
                }
                i3++;
            }
        }
        return d;
    }

    /* renamed from: m */
    public static HealthStats m165012m(Context context) {
        if (!(Build.VERSION.SDK_INT >= 24)) {
            return null;
        }
        try {
            return ((SystemHealthManager) context.getSystemService("systemhealth")).takeMyUidSnapshot();
        } catch (Exception e) {
            C118672d.m167356f("HealthStatsHelper", "takeMyUidSnapshot err: " + e, new Object[0]);
            return null;
        }
    }

    /* renamed from: n */
    public static long m165013n(HealthStats healthStats, int i) {
        if (healthStats.hasMeasurement(i)) {
            return healthStats.getMeasurement(i);
        }
        return 0;
    }

    /* renamed from: o */
    public static long m165014o(HealthStats healthStats, int i) {
        if (healthStats.hasTimer(i)) {
            return healthStats.getTimerTime(i);
        }
        return 0;
    }

    /* renamed from: p */
    public static double m165015p(double d, int i) {
        double pow = Math.pow(10.0d, (double) i);
        return ((double) Math.round(d * pow)) / pow;
    }
}
