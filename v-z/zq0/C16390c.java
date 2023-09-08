package zq0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import lp3.C88631d;
import rx3.C13598b0;
import te3.C90427mv;

/* renamed from: zq0.c */
public final class C16390c<T> implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ C32226l<C90427mv, C13598b0> f43787a;

    public C16390c(C32226l<? super C90427mv, C13598b0> lVar) {
        this.f43787a = lVar;
    }

    /* renamed from: a */
    public final void mo1720a(Object obj) {
        if (obj instanceof Exception) {
            Log.m105920e("Luggage.FULL.CgiPhoneNumber", "CgiCheckVerifyCode " + ((Exception) obj).getMessage());
        }
        C32226l<C90427mv, C13598b0> lVar = this.f43787a;
        if (lVar != null) {
            lVar.invoke(null);
        }
    }
}
