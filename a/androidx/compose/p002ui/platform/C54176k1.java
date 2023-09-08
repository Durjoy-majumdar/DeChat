package androidx.compose.p002ui.platform;

import fy3.C32227p;
import gy3.C87412m;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import p721v0.C65508k;
import wx3.C66212f;

/* renamed from: androidx.compose.ui.platform.k1 */
public final class C54176k1 implements C65508k {

    /* renamed from: d */
    public final C60690y0 f152125d = C108500f2.m146996c(Float.valueOf(1.0f), (C108497e2) null, 2, (Object) null);

    public <R> R fold(R r, C32227p<? super R, ? super C66212f.C66215b, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public <E extends C66212f.C66215b> E get(C66212f.C15602c<E> cVar) {
        C87412m.m108594g(cVar, "key");
        return C66212f.C66215b.C66216a.m78145a(this, cVar);
    }

    public C66212f.C15602c<?> getKey() {
        return C65508k.C65509a.f188492d;
    }

    public C66212f minusKey(C66212f.C15602c<?> cVar) {
        C87412m.m108594g(cVar, "key");
        return C66212f.C66215b.C66216a.m78146b(this, cVar);
    }

    public C66212f plus(C66212f fVar) {
        C87412m.m108594g(fVar, "context");
        return C66212f.C66213a.m78144a(this, fVar);
    }

    /* renamed from: r */
    public float mo74978r() {
        return ((Number) this.f152125d.getValue()).floatValue();
    }
}
