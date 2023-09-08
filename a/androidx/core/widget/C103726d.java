package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import p834a3.C103297a;

/* renamed from: androidx.core.widget.d */
public final class C103726d {

    /* renamed from: a */
    public EdgeEffect f306420a;

    /* renamed from: androidx.core.widget.d$a */
    public static class C103727a {
        /* renamed from: a */
        public static EdgeEffect m138090a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m138091b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: c */
        public static float m138092c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public C103726d(Context context) {
        this.f306420a = new EdgeEffect(context);
    }

    /* renamed from: a */
    public static float m138085a(EdgeEffect edgeEffect) {
        if (C103297a.m136810a()) {
            return C103727a.m138091b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: d */
    public static float m138086d(EdgeEffect edgeEffect, float f, float f2) {
        if (C103297a.m136810a()) {
            return C103727a.m138092c(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo145032b() {
        return this.f306420a.isFinished();
    }

    @Deprecated
    /* renamed from: c */
    public boolean mo145033c(float f) {
        this.f306420a.onPull(f);
        return true;
    }

    @Deprecated
    /* renamed from: e */
    public boolean mo145034e() {
        this.f306420a.onRelease();
        return this.f306420a.isFinished();
    }
}
