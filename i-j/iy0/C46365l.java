package iy0;

import fy3.C32224a;
import gy3.C87413o;
import te3.m25;

/* renamed from: iy0.l */
public final class C46365l extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ C46353a f124954d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46365l(C46353a aVar) {
        super(0);
        this.f124954d = aVar;
    }

    public Object invoke() {
        C46353a aVar = this.f124954d;
        String str = aVar.f124929k;
        if (str != null) {
            return str;
        }
        m25 a = C46353a.m51676a(aVar);
        String str2 = a != null ? a.f137794w : null;
        return str2 == null ? "" : str2;
    }
}
