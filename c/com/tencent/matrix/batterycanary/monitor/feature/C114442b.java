package com.tencent.matrix.batterycanary.monitor.feature;

import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.b */
public class C114442b extends C114490k0.C114491a.C114492a<C114436a.C114440d> {
    public C114442b(C114436a.C114440d dVar, C114436a.C114440d dVar2, C114436a.C114440d dVar3) {
        super(dVar2, dVar3);
    }

    /* renamed from: a */
    public C114490k0.C114491a mo173612a() {
        int i;
        int i2;
        C114436a.C114440d dVar = new C114436a.C114440d();
        C114436a.C114440d dVar2 = (C114436a.C114440d) this.f343206b;
        dVar.f343107d = dVar2.f343107d;
        dVar.f343108e = dVar2.f343108e;
        long j = dVar2.f343109f;
        C114436a.C114440d dVar3 = (C114436a.C114440d) this.f343205a;
        dVar.f343109f = j - dVar3.f343109f;
        dVar.f343110g = C114507l0.m161121a(dVar3.f343110g, dVar2.f343110g);
        C114436a.C114440d dVar4 = (C114436a.C114440d) this.f343206b;
        dVar.f343114k = dVar4.f343114k;
        C114436a.C114440d dVar5 = (C114436a.C114440d) this.f343205a;
        int i3 = dVar5.f343111h;
        if (i3 == 1 || (i2 = dVar4.f343111h) == 1) {
            dVar.f343111h = 1;
        } else if (i3 == 3 && i2 == 3) {
            dVar.f343111h = 3;
        } else {
            dVar.f343111h = 2;
        }
        int i4 = dVar5.f343112i;
        if (i4 == 1 || (i = dVar4.f343112i) == 1) {
            dVar.f343112i = 1;
        } else if (i4 == 3 && i == 3) {
            dVar.f343112i = 3;
        } else if (i4 == 4 && i == 4) {
            dVar.f343112i = 3;
        } else {
            dVar.f343112i = 2;
        }
        dVar.f343113j = dVar4.f343113j;
        return dVar;
    }
}
