package dy0;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import kotlin.Result;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50839pj2;
import wx3.C15601d;

/* renamed from: dy0.b */
public final class C7535b<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C15601d<C50839pj2> f25796a;

    public C7535b(C15601d<? super C50839pj2> dVar) {
        this.f25796a = dVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        int i2 = cVar.f256794b;
        C50839pj2 pj22 = (C50839pj2) cVar.f256796d;
        Log.m105924i("BrandServiceManageCgiServe", "runCgi: " + i + ", " + i2);
        if (i == 0 && i2 == 0) {
            this.f25796a.resumeWith(Result.m168114constructorimpl(pj22));
        } else {
            this.f25796a.resumeWith(Result.m168114constructorimpl((Object) null));
        }
        return C13598b0.f38549a;
    }
}
