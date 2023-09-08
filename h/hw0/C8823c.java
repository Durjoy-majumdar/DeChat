package hw0;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import kotlin.Result;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C51294st;
import wx3.C15601d;

/* renamed from: hw0.c */
public final class C8823c<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C8824d f28053a;

    /* renamed from: b */
    public final /* synthetic */ C15601d<C51294st> f28054b;

    public C8823c(C8824d dVar, C15601d<? super C51294st> dVar2) {
        this.f28053a = dVar;
        this.f28054b = dVar2;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        int i2 = cVar.f256794b;
        C51294st stVar = (C51294st) cVar.f256796d;
        this.f28053a.getClass();
        Log.m105924i("BizCommonSchemeUrlCgiServe", "CheckExternalUrlCgi: " + i + ", " + i2);
        if (i == 0 && i2 == 0) {
            this.f28054b.resumeWith(Result.m168114constructorimpl(stVar));
        } else {
            this.f28054b.resumeWith(Result.m168114constructorimpl((Object) null));
        }
        return C13598b0.f38549a;
    }
}
