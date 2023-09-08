package androidx.compose.p002ui.platform;

import gy3.C87412m;
import java.util.List;
import p246u1.C111073i;
import p658q1.C110289d0;

/* renamed from: androidx.compose.ui.platform.u1 */
public final class C103690u1 implements C110289d0 {

    /* renamed from: d */
    public final int f306261d;

    /* renamed from: e */
    public final List<C103690u1> f306262e;

    /* renamed from: f */
    public Float f306263f;

    /* renamed from: g */
    public Float f306264g;

    /* renamed from: h */
    public C111073i f306265h;

    /* renamed from: i */
    public C111073i f306266i;

    public C103690u1(int i, List<C103690u1> list, Float f, Float f2, C111073i iVar, C111073i iVar2) {
        C87412m.m108594g(list, "allScopes");
        this.f306261d = i;
        this.f306262e = list;
        this.f306263f = f;
        this.f306264g = f2;
        this.f306265h = iVar;
        this.f306266i = iVar2;
    }

    public boolean isValid() {
        return this.f306262e.contains(this);
    }
}
