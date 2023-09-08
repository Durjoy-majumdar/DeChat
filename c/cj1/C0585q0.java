package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import gy3.C87412m;
import hp3.C87581a;
import kotlin.Result;
import o40.C61937h;
import ob0.C89132b;
import te3.C50397mg0;
import wx3.C15601d;

/* renamed from: cj1.q0 */
public final class C0585q0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C15601d<C50397mg0> f1392a;

    public C0585q0(C15601d<? super C50397mg0> dVar) {
        this.f1392a = dVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar == null) {
            return null;
        }
        C15601d<C50397mg0> dVar = this.f1392a;
        if (C58739j4.f168176a.mo83692U()) {
            StringBuilder sb = new StringBuilder();
            sb.append("BatchGetObjectAsyncInfo resp:");
            T t = cVar.f256796d;
            C87412m.m108593f(t, "cgiBack.resp");
            sb.append(C61937h.m72703b(t));
            Log.m105924i("FinderLiveAssistant2", sb.toString());
        }
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(cVar.f256796d));
            return cVar;
        }
        dVar.resumeWith(Result.m168114constructorimpl((Object) null));
        return cVar;
    }
}
