package com.tencent.matrix.batterycanary.monitor.feature;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import java.util.ArrayList;
import p1195ge.C116951c;
import p981ie.C117173p;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.t */
public class C114531t implements C87705i<C114490k0.C114491a.C114492a<CpuStatFeature.C114427b>> {

    /* renamed from: a */
    public final /* synthetic */ C114532u f343298a;

    public C114531t(C114532u uVar) {
        this.f343298a = uVar;
    }

    public void accept(Object obj) {
        double d;
        double d2;
        double d3;
        C114467i.C114481n nVar;
        CpuStatFeature.C114427b bVar = (CpuStatFeature.C114427b) ((C114490k0.C114491a.C114492a) obj).f343207c;
        long a = this.f343298a.f343300b.mo173684a((String) null);
        this.f343298a.f343302d.put("power-cpu-devDiff", Double.valueOf(C116951c.m165005f(this.f343298a.f343301c, a) + C116951c.m165007h(this.f343298a.f343301c, bVar, a) + C116951c.m165010k(this.f343298a.f343301c, bVar, a)));
        C114532u uVar = this.f343298a;
        C114467i.C114481n nVar2 = uVar.f343299a.f343164m;
        if (nVar2 != null && nVar2.mo173683a(uVar.f343301c)) {
            long a2 = this.f343298a.f343300b.mo173684a((String) null);
            double f = C116951c.m165005f(this.f343298a.f343301c, a2);
            C117173p pVar = this.f343298a.f343301c;
            long j = 0;
            if (a2 > 0) {
                long j2 = 0;
                for (int i = 0; i < ((ArrayList) nVar2.f343194b).size(); i++) {
                    for (int i2 : (int[]) ((ArrayList) nVar2.f343194b).get(i)) {
                        j2 += (long) i2;
                    }
                }
                if (j2 > 0) {
                    d2 = 0.0d;
                    int i3 = 0;
                    while (i3 < ((ArrayList) nVar2.f343194b).size()) {
                        int f2 = pVar.mo181089f(i3);
                        int i4 = 0;
                        while (i4 < ((int[]) ((ArrayList) nVar2.f343194b).get(i3)).length) {
                            int i5 = ((int[]) ((ArrayList) nVar2.f343194b).get(i3))[i4];
                            if (i5 > 0) {
                                nVar = nVar2;
                                d3 = f;
                                d2 += (pVar.mo181087d(f2, i4) / 3600000.0d) * ((double) ((long) (((((float) i5) * 1.0f) / ((float) j2)) * ((float) a2))));
                            } else {
                                nVar = nVar2;
                                d3 = f;
                            }
                            j += (long) i5;
                            i4++;
                            nVar2 = nVar;
                            f = d3;
                        }
                        C114467i.C114481n nVar3 = nVar2;
                        double d4 = f;
                        if (j > 0) {
                            d2 += (pVar.mo181086c(f2) / 3600000.0d) * ((double) ((long) (((((float) j) * 1.0f) / ((float) j2)) * ((float) a2))));
                        }
                        i3++;
                        j = 0;
                        nVar2 = nVar3;
                        f = d4;
                    }
                    d = f;
                    this.f343298a.f343302d.put("power-cpu-cpuFreq", Double.valueOf(d + d2));
                }
            }
            d = f;
            d2 = 0.0d;
            this.f343298a.f343302d.put("power-cpu-cpuFreq", Double.valueOf(d + d2));
        }
    }
}
