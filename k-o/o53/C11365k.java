package o53;

import gy3.C87412m;
import hp3.C87581a;
import n53.C11128k;
import ob0.C89132b;
import r53.C12953c;
import rx3.C13598b0;
import s43.C13620a;
import s43.C13622c;
import te3.C50943qc2;

/* renamed from: o53.k */
public final class C11365k<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C11367m f33462a;

    public C11365k(C11367m mVar) {
        this.f33462a = mVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C87412m.m108593f(cVar, "cgiBack");
        if (C12953c.m12397f(cVar)) {
            this.f33462a.mo11380b(new C13620a(C13622c.Default));
            return C13598b0.f38549a;
        }
        long j = ((C50943qc2) cVar.f256796d).f140241d;
        C12953c.m12403l(j);
        return new C11128k(this.f33462a.f33467a.f38597a, 0).mo9225i().mo123062e(new C11364j(this.f33462a, j));
    }
}
