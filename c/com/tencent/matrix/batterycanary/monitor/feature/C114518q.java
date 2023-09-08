package com.tencent.matrix.batterycanary.monitor.feature;

import android.os.Build;
import android.os.health.HealthStats;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import p1195ge.C116947b;
import p1195ge.C116951c;
import p981ie.C117173p;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.q */
public class C114518q implements C87705i<C114490k0.C114491a.C114492a<C116947b.C116948a>> {

    /* renamed from: a */
    public final /* synthetic */ C117173p f343256a;

    /* renamed from: b */
    public final /* synthetic */ double f343257b;

    /* renamed from: c */
    public final /* synthetic */ double f343258c;

    /* renamed from: d */
    public final /* synthetic */ double f343259d;

    /* renamed from: e */
    public final /* synthetic */ double f343260e;

    /* renamed from: f */
    public final /* synthetic */ C114529s f343261f;

    public C114518q(C114529s sVar, C117173p pVar, double d, double d2, double d3, double d4) {
        this.f343261f = sVar;
        this.f343256a = pVar;
        this.f343257b = d;
        this.f343258c = d2;
        this.f343259d = d3;
        this.f343260e = d4;
    }

    public void accept(Object obj) {
        double d;
        double d2;
        double d3;
        double d4;
        C114490k0.C114491a.C114492a aVar = (C114490k0.C114491a.C114492a) obj;
        if (Build.VERSION.SDK_INT >= 24) {
            HealthStats healthStats = ((C116947b.C116948a) aVar.f343205a).f350467e;
            double d5 = 0.0d;
            if (healthStats == null || ((C116947b.C116948a) aVar.f343206b).f350467e == null) {
                d = 0.0d;
            } else {
                d = C116951c.m165002c(this.f343256a, ((C116947b.C116948a) aVar.f343206b).f350467e) - C116951c.m165002c(this.f343256a, healthStats);
            }
            this.f343261f.f343293c.f350469f.put("power-mobile-radio", Double.valueOf(d));
            HealthStats healthStats2 = ((C116947b.C116948a) aVar.f343205a).f350467e;
            if (healthStats2 == null || ((C116947b.C116948a) aVar.f343206b).f350467e == null) {
                d2 = 0.0d;
            } else {
                d2 = C116951c.m165000a(this.f343256a, ((C116947b.C116948a) aVar.f343206b).f350467e) - C116951c.m165000a(this.f343256a, healthStats2);
            }
            this.f343261f.f343293c.f350469f.put("power-mobile-controller", Double.valueOf(d2));
            HealthStats healthStats3 = ((C116947b.C116948a) aVar.f343205a).f350467e;
            if (healthStats3 == null || ((C116947b.C116948a) aVar.f343206b).f350467e == null) {
                d3 = 0.0d;
            } else {
                d3 = C116951c.m165001b(this.f343256a, ((C116947b.C116948a) aVar.f343206b).f350467e, this.f343257b, this.f343258c) - C116951c.m165001b(this.f343256a, healthStats3, this.f343257b, this.f343258c);
            }
            this.f343261f.f343293c.f350469f.put("power-mobile-packet", Double.valueOf(d3));
            HealthStats healthStats4 = ((C116947b.C116948a) aVar.f343205a).f350467e;
            if (healthStats4 == null || ((C116947b.C116948a) aVar.f343206b).f350467e == null) {
                d4 = 0.0d;
            } else {
                d4 = C116951c.m165003d(this.f343256a, ((C116947b.C116948a) aVar.f343206b).f350467e) - C116951c.m165003d(this.f343256a, healthStats4);
            }
            this.f343261f.f343293c.f350469f.put("power-wifi-controller", Double.valueOf(d4));
            HealthStats healthStats5 = ((C116947b.C116948a) aVar.f343205a).f350467e;
            if (!(healthStats5 == null || ((C116947b.C116948a) aVar.f343206b).f350467e == null)) {
                d5 = C116951c.m165004e(this.f343256a, ((C116947b.C116948a) aVar.f343206b).f350467e, this.f343259d, this.f343260e) - C116951c.m165004e(this.f343256a, healthStats5, this.f343259d, this.f343260e);
            }
            this.f343261f.f343293c.f350469f.put("power-wifi-packet", Double.valueOf(d5));
        }
    }
}
