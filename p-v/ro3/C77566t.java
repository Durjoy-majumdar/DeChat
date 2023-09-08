package ro3;

import android.view.View;
import com.tencent.p014mm.p136ui.C85975v4;
import gy3.C87412m;

/* renamed from: ro3.t */
public final class C77566t implements View.OnAttachStateChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C110588j f226130d;

    public C77566t(C110588j jVar) {
        this.f226130d = jVar;
    }

    public void onViewAttachedToWindow(View view) {
        C87412m.m108594g(view, "v");
    }

    public void onViewDetachedFromWindow(View view) {
        C87412m.m108594g(view, "v");
        C85975v4.m106304a("SelectableEditTextHelper", "onViewDetachedFromWindow:" + this.f226130d.f330812M, new Object[0]);
        C110588j jVar = this.f226130d;
        if (!jVar.f330812M) {
            jVar.mo162134b();
        }
    }
}
