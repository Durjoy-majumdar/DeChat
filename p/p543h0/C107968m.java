package p543h0;

import p175j0.C108499f1;
import p175j0.C108504h;
import p436a1.C103272w;
import p436a1.C103276y;

/* renamed from: h0.m */
public final class C107968m implements C107971p {

    /* renamed from: a */
    public static final C107968m f323335a = new C107968m();

    /* renamed from: a */
    public long mo158368a(long j, float f, C108504h hVar, int i) {
        C107951g gVar = (C107951g) hVar.mo51598m(C107953h.f323293a);
        if (Float.compare(f, (float) 0) <= 0 || gVar.mo158361h()) {
            return j;
        }
        int i2 = (i & 112) | (i & 14);
        C108499f1<C107971p> f1Var = C107972q.f323342a;
        return C103276y.m136793d(C103272w.m136780b(C107953h.m146252b(j, hVar, i2 & 14), ((((float) Math.log((double) (f + ((float) 1)))) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null), j);
    }
}
