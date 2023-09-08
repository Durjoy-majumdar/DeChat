package l52;

import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import o52.C61943d;
import o52.C61945f;
import o52.C61946g;
import p004b0.C103941f;
import p175j0.C108504h;
import rx3.C13598b0;
import um0.C22657f;

/* renamed from: l52.j */
public final class C61230j extends C87413o implements C32229r<C103941f, Integer, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ List f174285d;

    /* renamed from: e */
    public final /* synthetic */ C109271t f174286e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61230j(List list, C109271t tVar) {
        super(4);
        this.f174285d = list;
        this.f174286e = tVar;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        C103941f fVar = (C103941f) obj;
        int intValue = ((Number) obj2).intValue();
        C108504h hVar = (C108504h) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C87412m.m108594g(fVar, "$this$items");
        if ((intValue2 & 14) == 0) {
            i = (hVar.mo51619x(fVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        int i3 = 16;
        if ((intValue2 & 112) == 0) {
            i |= hVar.mo51592j(intValue) ? 32 : 16;
        }
        if ((i & 731) != 146 || !hVar.mo51575a()) {
            int i4 = (i & 112) | (i & 14);
            C61943d dVar = (C61943d) this.f174285d.get(intValue);
            if ((i4 & 112) == 0) {
                if (hVar.mo51592j(intValue)) {
                    i3 = 32;
                }
                i2 = i3 | i4;
            } else {
                i2 = i4;
            }
            if ((i4 & C22657f.CTRL_INDEX) == 0) {
                i2 |= hVar.mo51619x(dVar) ? 256 : 128;
            }
            if ((i2 & 5841) == 1168 && hVar.mo51575a()) {
                hVar.mo51581d();
            } else if (dVar instanceof C61946g) {
                hVar.mo51557H(2138979470);
                C109271t.m148386e3(this.f174286e, intValue, hVar, ((i2 >> 3) & 14) | 64);
                hVar.mo51565P();
            } else if (dVar instanceof C61945f) {
                hVar.mo51557H(2138979532);
                C109271t.m148385d3(this.f174286e, (C61945f) dVar, hVar, 72);
                hVar.mo51565P();
            } else {
                hVar.mo51557H(2138979565);
                hVar.mo51565P();
            }
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
