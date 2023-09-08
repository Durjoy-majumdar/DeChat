package p259w6;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import gy3.C87412m;
import p175j0.C108494d2;

/* renamed from: w6.a */
public final class C111734a implements Drawable.Callback {

    /* renamed from: d */
    public final /* synthetic */ C111735b f334616d;

    public C111734a(C111735b bVar) {
        this.f334616d = bVar;
    }

    public void invalidateDrawable(Drawable drawable) {
        C87412m.m108594g(drawable, "d");
        C111735b bVar = this.f334616d;
        ((C108494d2) bVar.f334618j).setValue(Integer.valueOf(((Number) ((C108494d2) bVar.f334618j).getValue()).intValue() + 1));
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C87412m.m108594g(drawable, "d");
        C87412m.m108594g(runnable, "what");
        ((Handler) C15048c.f41187a.getValue()).postAtTime(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C87412m.m108594g(drawable, "d");
        C87412m.m108594g(runnable, "what");
        ((Handler) C15048c.f41187a.getValue()).removeCallbacks(runnable);
    }
}
