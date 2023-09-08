package p643p5;

import a14.C53916l;
import android.view.View;
import android.view.ViewTreeObserver;
import coil.size.PixelSize;
import coil.size.Size;
import gy3.C87412m;
import kotlin.Result;
import p643p5.C110170g;

/* renamed from: p5.i */
public final class C110173i implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public boolean f329592d;

    /* renamed from: e */
    public final /* synthetic */ C110170g<View> f329593e;

    /* renamed from: f */
    public final /* synthetic */ ViewTreeObserver f329594f;

    /* renamed from: g */
    public final /* synthetic */ C53916l<Size> f329595g;

    public C110173i(C110170g<View> gVar, ViewTreeObserver viewTreeObserver, C53916l<? super Size> lVar) {
        this.f329593e = gVar;
        this.f329594f = viewTreeObserver;
        this.f329595g = lVar;
    }

    public boolean onPreDraw() {
        PixelSize b = C110170g.C110171a.m149769b(this.f329593e);
        if (b != null) {
            C110170g<View> gVar = this.f329593e;
            ViewTreeObserver viewTreeObserver = this.f329594f;
            C87412m.m108593f(viewTreeObserver, "viewTreeObserver");
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                gVar.getView().getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f329592d) {
                this.f329592d = true;
                this.f329595g.resumeWith(Result.m168114constructorimpl(b));
            }
        }
        return true;
    }
}
