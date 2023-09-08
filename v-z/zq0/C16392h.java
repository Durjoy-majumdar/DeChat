package zq0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import lp3.C88631d;
import rx3.C13598b0;
import te3.C51625v04;

/* renamed from: zq0.h */
public final class C16392h<T> implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ C32226l<C51625v04, C13598b0> f43789a;

    public C16392h(C32226l<? super C51625v04, C13598b0> lVar) {
        this.f43789a = lVar;
    }

    /* renamed from: a */
    public final void mo1720a(Object obj) {
        if (obj instanceof Exception) {
            Log.m105920e("Luggage.FULL.CgiPhoneNumber", "CgiSendVerifyCode " + ((Exception) obj).getMessage());
        }
        C32226l<C51625v04, C13598b0> lVar = this.f43789a;
        if (lVar != null) {
            lVar.invoke(null);
        }
    }
}
