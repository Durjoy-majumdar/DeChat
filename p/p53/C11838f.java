package p53;

import hp3.C87581a;
import ob0.C89132b;
import r53.C12953c;
import te3.C50943qc2;

/* renamed from: p53.f */
public final class C11838f<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C11840h f34608a;

    public C11838f(C11840h hVar) {
        this.f34608a = hVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C50943qc2 qc22 = (C50943qc2) cVar.f256796d;
        if (qc22 == null) {
            return null;
        }
        C11840h hVar = this.f34608a;
        if (cVar.f256793a != 0 || cVar.f256794b != 0) {
            return qc22;
        }
        hVar.f34615h.postValue(Long.valueOf(qc22.f140241d));
        C12953c.m12403l(qc22.f140241d);
        return qc22;
    }
}
