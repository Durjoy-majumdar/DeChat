package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

@Deprecated
/* renamed from: androidx.core.widget.g */
public final class C103732g {

    /* renamed from: a */
    public OverScroller f306426a;

    public C103732g(Context context, Interpolator interpolator) {
        this.f306426a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Deprecated
    /* renamed from: a */
    public void mo145035a() {
        this.f306426a.abortAnimation();
    }

    @Deprecated
    /* renamed from: b */
    public int mo145036b() {
        return this.f306426a.getCurrY();
    }

    @Deprecated
    /* renamed from: c */
    public boolean mo145037c() {
        return this.f306426a.isFinished();
    }

    @Deprecated
    /* renamed from: d */
    public void mo145038d(int i, int i2, int i3, int i4, int i5) {
        this.f306426a.startScroll(i, i2, i3, i4, i5);
    }
}
