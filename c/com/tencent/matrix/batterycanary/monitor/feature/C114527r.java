package com.tencent.matrix.batterycanary.monitor.feature;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114513o0;
import p981ie.C117173p;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.r */
public class C114527r implements C87705i<C114490k0.C114491a.C114492a<C114513o0.C114515b>> {

    /* renamed from: a */
    public final /* synthetic */ C117173p f343285a;

    /* renamed from: b */
    public final /* synthetic */ double f343286b;

    /* renamed from: c */
    public final /* synthetic */ double f343287c;

    /* renamed from: d */
    public final /* synthetic */ double f343288d;

    /* renamed from: e */
    public final /* synthetic */ double f343289e;

    /* renamed from: f */
    public final /* synthetic */ C114529s f343290f;

    public C114527r(C114529s sVar, C117173p pVar, double d, double d2, double d3, double d4) {
        this.f343290f = sVar;
        this.f343285a = pVar;
        this.f343286b = d;
        this.f343287c = d2;
        this.f343288d = d3;
        this.f343289e = d4;
    }

    public void accept(Object obj) {
        C114490k0.C114491a.C114492a aVar = (C114490k0.C114491a.C114492a) obj;
        C114467i iVar = this.f343290f.f343294d;
        if (iVar.f343162k != null && iVar.f343165n != null) {
            C117173p pVar = this.f343285a;
            C114513o0.C114515b bVar = (C114513o0.C114515b) aVar.f343207c;
            double d = this.f343286b;
            double d2 = this.f343287c;
            long longValue = (long) ((((double) ((Long) bVar.f343250h.f343211a).longValue()) / (d / 8.0d)) * 1000.0d);
            long longValue2 = (long) ((((double) ((Long) bVar.f343251i.f343211a).longValue()) / (d2 / 8.0d)) * 1000.0d);
            this.f343290f.f343293c.f350469f.put("power-mobile-statByte", Double.valueOf(((pVar.mo181088e("modem.controller.rx") / 3600000.0d) * ((double) longValue)) + 0.0d + ((pVar.mo181088e("modem.controller.tx") / 3600000.0d) * ((double) longValue2)) + ((pVar.mo181088e("modem.controller.idle") / 3600000.0d) * ((double) (longValue2 + longValue)))));
            C117173p pVar2 = this.f343285a;
            C114513o0.C114515b bVar2 = (C114513o0.C114515b) aVar.f343207c;
            double d3 = this.f343286b;
            double d4 = this.f343287c;
            double e = pVar2.mo181088e("radio.active");
            if (e <= 0.0d) {
                double a = pVar2.mo181084a("modem.controller.rx") + 0.0d;
                int h = pVar2.mo181091h("modem.controller.tx");
                for (int i = 0; i < h; i++) {
                    a += pVar2.mo181085b("modem.controller.tx", i);
                }
                e = a / ((double) (h + 1));
            }
            this.f343290f.f343293c.f350469f.put("power-mobile-statPacket", Double.valueOf(((((e / 3600.0d) / (((d3 + d4) / 8.0d) / 2048.0d)) / 3600.0d) * ((double) (((Long) bVar2.f343252j.f343211a).longValue() + ((Long) bVar2.f343253k.f343211a).longValue()))) + 0.0d));
            C117173p pVar3 = this.f343285a;
            C114513o0.C114515b bVar3 = (C114513o0.C114515b) aVar.f343207c;
            double d5 = this.f343288d;
            double d6 = this.f343289e;
            long longValue3 = (long) ((((double) ((Long) bVar3.f343246d.f343211a).longValue()) / (d5 / 8.0d)) * 1000.0d);
            long longValue4 = (long) ((((double) ((Long) bVar3.f343247e.f343211a).longValue()) / (d6 / 8.0d)) * 1000.0d);
            this.f343290f.f343293c.f350469f.put("power-wifi-statByte", Double.valueOf(((pVar3.mo181088e("wifi.controller.rx") / 3600000.0d) * ((double) longValue3)) + 0.0d + ((pVar3.mo181088e("wifi.controller.tx") / 3600000.0d) * ((double) longValue4)) + ((pVar3.mo181088e("wifi.controller.idle") / 3600000.0d) * ((double) (longValue4 + longValue3)))));
            C117173p pVar4 = this.f343285a;
            C114513o0.C114515b bVar4 = (C114513o0.C114515b) aVar.f343207c;
            this.f343290f.f343293c.f350469f.put("power-wifi-statPacket", Double.valueOf((((pVar4.mo181088e("wifi.active") / 3600.0d) / (((this.f343288d + this.f343289e) / 8.0d) / 2048.0d)) * ((double) (((Long) bVar4.f343248f.f343211a).longValue() + ((Long) bVar4.f343249g.f343211a).longValue()))) + 0.0d));
        }
    }
}
