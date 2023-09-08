package iz1;

import fy3.C32227p;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;
import yy1.C53641c;
import yy1.C53647i;

/* renamed from: iz1.d */
public final class C33481d<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C32227p<String, C53641c, C13598b0> f90668a;

    public C33481d(C32227p<? super String, ? super C53641c, C13598b0> pVar) {
        this.f90668a = pVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        String str = "";
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C32227p<String, C53641c, C13598b0> pVar = this.f90668a;
            C53647i iVar = (C53647i) cVar.f256796d;
            String str2 = iVar.f150700d;
            if (str2 != null) {
                str = str2;
            }
            pVar.invoke(str, iVar.f150701e);
        } else {
            this.f90668a.invoke(str, null);
        }
        return C13598b0.f38549a;
    }
}
