package p643p5;

import android.view.View;
import android.view.ViewTreeObserver;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: p5.h */
public final class C110172h extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110170g<View> f329589d;

    /* renamed from: e */
    public final /* synthetic */ ViewTreeObserver f329590e;

    /* renamed from: f */
    public final /* synthetic */ C110173i f329591f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110172h(C110170g<View> gVar, ViewTreeObserver viewTreeObserver, C110173i iVar) {
        super(1);
        this.f329589d = gVar;
        this.f329590e = viewTreeObserver;
        this.f329591f = iVar;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        C110170g<View> gVar = this.f329589d;
        ViewTreeObserver viewTreeObserver = this.f329590e;
        C87412m.m108593f(viewTreeObserver, "viewTreeObserver");
        C110173i iVar = this.f329591f;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(iVar);
        } else {
            gVar.getView().getViewTreeObserver().removeOnPreDrawListener(iVar);
        }
        return C13598b0.f38549a;
    }
}
