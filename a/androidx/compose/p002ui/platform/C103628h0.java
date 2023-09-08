package androidx.compose.p002ui.platform;

import android.view.ViewConfiguration;
import gy3.C87412m;
import p560i2.C108326g;

/* renamed from: androidx.compose.ui.platform.h0 */
public final class C103628h0 implements C103633i2 {

    /* renamed from: a */
    public final ViewConfiguration f306081a;

    public C103628h0(ViewConfiguration viewConfiguration) {
        C87412m.m108594g(viewConfiguration, "viewConfiguration");
        this.f306081a = viewConfiguration;
    }

    /* renamed from: a */
    public long mo144725a() {
        return (long) ViewConfiguration.getDoubleTapTimeout();
    }

    /* renamed from: b */
    public long mo144726b() {
        return (long) ViewConfiguration.getLongPressTimeout();
    }

    /* renamed from: c */
    public long mo144727c() {
        return 40;
    }

    /* renamed from: d */
    public float mo144728d() {
        return (float) this.f306081a.getScaledTouchSlop();
    }

    /* renamed from: e */
    public long mo144729e() {
        float f = (float) 48;
        return C108326g.m146737b(f, f);
    }
}
