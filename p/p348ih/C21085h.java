package p348ih;

import com.tencent.p014mm.sdk.platformtools.Log;
import p213oh.C11412b;
import p356lh.C21428d;
import p366nh.C21632c;

/* renamed from: ih.h */
public class C21085h {
    /* renamed from: a */
    public static C21090n m23340a(C21428d dVar, C21632c cVar, int i, boolean z) {
        C21079c fVar = i != 2 ? i != 3 ? (cVar == null || !cVar.mo32136a().f256441z) ? new C21083f(dVar, cVar) : new C21082e(dVar, cVar) : new C21084g(dVar, cVar) : new C21080d(dVar, cVar);
        fVar.f59615q = fVar.f59600b.mo32136a().f256420e;
        fVar.f59608j.set(false);
        fVar.f59609k.set(false);
        if (fVar.f59600b != null) {
            fVar.f59600b.connect();
        }
        fVar.mo32821o(1);
        if (z) {
            int i2 = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "preload", (Object[]) null);
            fVar.f59606h.set(true);
            fVar.mo32821o(10);
        }
        return fVar;
    }
}
