package ro3;

import android.view.ViewTreeObserver;

/* renamed from: ro3.v */
public final class C110599v implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ C110588j f330864d;

    public C110599v(C110588j jVar) {
        this.f330864d = jVar;
    }

    public final boolean onPreDraw() {
        C110588j jVar = this.f330864d;
        if (!jVar.f330800A || !jVar.f330848w) {
            return true;
        }
        jVar.f330833h.removeCallbacks(jVar.mo148758i());
        jVar.f330833h.postDelayed(jVar.mo148758i(), (long) 100);
        return true;
    }
}
