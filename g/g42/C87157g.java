package g42;

import fy3.C32224a;
import gy3.C87413o;
import h42.C87433d;
import rx3.C13598b0;

/* renamed from: g42.g */
public final class C87157g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C87148f f252764d;

    /* renamed from: e */
    public final /* synthetic */ String f252765e;

    /* renamed from: f */
    public final /* synthetic */ String f252766f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87157g(C87148f fVar, String str, String str2) {
        super(0);
        this.f252764d = fVar;
        this.f252765e = str;
        this.f252766f = str2;
    }

    public Object invoke() {
        C87433d dVar = this.f252764d.f252746h.get(this.f252765e);
        if (dVar != null) {
            dVar.mo121866I("onThemeChange", this.f252766f);
        }
        return C13598b0.f38549a;
    }
}
