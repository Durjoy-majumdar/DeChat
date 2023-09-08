package p558i0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import gy3.C87412m;
import java.lang.reflect.Method;
import p436a1.C103272w;

/* renamed from: i0.v */
public final class C108313v extends RippleDrawable {

    /* renamed from: h */
    public static Method f324323h;

    /* renamed from: i */
    public static boolean f324324i;

    /* renamed from: d */
    public final boolean f324325d;

    /* renamed from: e */
    public C103272w f324326e;

    /* renamed from: f */
    public Integer f324327f;

    /* renamed from: g */
    public boolean f324328g;

    /* renamed from: i0.v$a */
    public static final class C108314a {

        /* renamed from: a */
        public static final C108314a f324329a = new C108314a();

        /* renamed from: a */
        public final void mo158777a(RippleDrawable rippleDrawable, int i) {
            C87412m.m108594g(rippleDrawable, "ripple");
            rippleDrawable.setRadius(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108313v(boolean z) {
        super(ColorStateList.valueOf(-16777216), (Drawable) null, z ? new ColorDrawable(-1) : null);
        this.f324325d = z;
    }

    public Rect getDirtyBounds() {
        if (!this.f324325d) {
            this.f324328g = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        C87412m.m108593f(dirtyBounds, "super.getDirtyBounds()");
        this.f324328g = false;
        return dirtyBounds;
    }

    public boolean isProjected() {
        return this.f324328g;
    }
}
