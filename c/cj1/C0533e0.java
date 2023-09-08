package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;

/* renamed from: cj1.e0 */
public final class C0533e0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C54820t f1298a;

    public C0533e0(C54820t tVar) {
        this.f1298a = tVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            String str = this.f1298a.f153694d;
            Log.m105924i(str, "post fastComment succ, errType = " + cVar.f256793a + ", errCode = " + cVar.f256794b + ", errMsg = " + cVar.f256795c);
        } else {
            String str2 = this.f1298a.f153694d;
            Log.m105924i(str2, "post fastComment fail, errType = " + cVar.f256793a + ", errCode = " + cVar.f256794b + ", errMsg = " + cVar.f256795c);
        }
        return C13598b0.f38549a;
    }
}
