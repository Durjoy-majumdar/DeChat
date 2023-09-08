package iy0;

import fy3.C32224a;
import gy3.C87413o;
import te3.m25;

/* renamed from: iy0.k */
public final class C46364k extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ C46353a f124953d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46364k(C46353a aVar) {
        super(0);
        this.f124953d = aVar;
    }

    public Object invoke() {
        m25 a = C46353a.m51676a(this.f124953d);
        String str = a != null ? a.f137792u : null;
        if (str != null) {
            return str;
        }
        String str2 = this.f124953d.f124928j;
        return str2 == null ? "" : str2;
    }
}
