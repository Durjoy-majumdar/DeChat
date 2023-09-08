package xy2;

import f40.C86709a0;
import fy3.C32226l;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import rx3.C13598b0;
import sy2.C48509c;

/* renamed from: xy2.i */
public final class C53480i implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C48509c f150396d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f150397e;

    public C53480i(C48509c cVar, C32226l<? super Boolean, C13598b0> lVar) {
        this.f150396d = cVar;
        this.f150397e = lVar;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C89137b0 d = C86709a0.m107524d();
        this.f150396d.getClass();
        d.mo123469o(4290, this);
        C89137b0 d2 = C86709a0.m107524d();
        this.f150396d.getClass();
        d2.mo123470p(4290, this);
        C32226l<Boolean, C13598b0> lVar = this.f150397e;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(i == 0 && i2 == 0));
        }
    }
}
