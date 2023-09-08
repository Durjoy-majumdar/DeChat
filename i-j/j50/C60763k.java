package j50;

import android.view.SurfaceHolder;
import fy3.C32224a;
import gy3.C87413o;
import s50.C110747k;
import s50.C63703d0;

/* renamed from: j50.k */
public final class C60763k extends C87413o implements C32224a {

    /* renamed from: d */
    public final /* synthetic */ C63703d0 f173081d;

    /* renamed from: e */
    public final /* synthetic */ C60735a f173082e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60763k(C63703d0 d0Var, C60735a aVar) {
        super(0);
        this.f173081d = d0Var;
        this.f173082e = aVar;
    }

    public Object invoke() {
        C63703d0 d0Var = this.f173081d;
        d0Var.f180582b = null;
        C110747k kVar = this.f173082e.f173031q;
        SurfaceHolder surfaceHolder = d0Var.f180581a;
        kVar.mo162268c(surfaceHolder != null ? surfaceHolder.getSurface() : null);
        return null;
    }
}
