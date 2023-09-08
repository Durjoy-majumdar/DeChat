package de1;

import android.graphics.drawable.Drawable;
import android.view.View;
import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: de1.x */
public final class C7301x {

    /* renamed from: a */
    public final Drawable f25402a;

    /* renamed from: b */
    public final WeakReference<View> f25403b;

    public C7301x(Drawable drawable, WeakReference<View> weakReference) {
        C87412m.m108594g(drawable, "drawable");
        C87412m.m108594g(weakReference, "viewRef");
        this.f25402a = drawable;
        this.f25403b = weakReference;
    }
}
