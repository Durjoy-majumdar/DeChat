package vh3;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C51193s22;

/* renamed from: vh3.j */
public final class C102200j<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C102198h f300897a;

    public C102200j(C102198h hVar) {
        this.f300897a = hVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105924i("MicroMsg.GetLensListTask", "cgi callback : " + cVar.f256793a + ' ' + cVar.f256794b);
        C102198h hVar = this.f300897a;
        if (hVar == null) {
            return null;
        }
        hVar.mo126170a(cVar.f256793a, cVar.f256794b, (C51193s22) cVar.f256796d);
        return C13598b0.f38549a;
    }
}
