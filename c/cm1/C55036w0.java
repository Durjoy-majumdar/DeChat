package cm1;

import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import te3.C64848y91;
import tf1.C13914m;

/* renamed from: cm1.w0 */
public final class C55036w0 implements C0740i2 {

    /* renamed from: d */
    public final C64848y91 f154513d;

    public C55036w0(C64848y91 y912) {
        C87412m.m108594g(y912, "tagInfo");
        this.f154513d = y912;
    }

    /* renamed from: c */
    public int mo75c() {
        return C55036w0.class.hashCode();
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        C55036w0 w0Var = mVar instanceof C55036w0 ? (C55036w0) mVar : null;
        return (w0Var == null || !Util.isEqual(w0Var.f154513d.f186453d, this.f154513d.f186453d)) ? -1 : 0;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
