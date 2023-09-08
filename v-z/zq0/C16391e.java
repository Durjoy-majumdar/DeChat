package zq0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import lp3.C88631d;
import rx3.C13598b0;
import te3.C90427mv;

/* renamed from: zq0.e */
public final class C16391e<T> implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ C32226l<C90427mv, C13598b0> f43788a;

    public C16391e(C32226l<? super C90427mv, C13598b0> lVar) {
        this.f43788a = lVar;
    }

    /* renamed from: a */
    public final void mo1720a(Object obj) {
        if (obj instanceof Exception) {
            Log.m105920e("Luggage.FULL.CgiPhoneNumber", "CgiCheckVerifyCodeWxaPhone " + ((Exception) obj).getMessage());
        }
        C32226l<C90427mv, C13598b0> lVar = this.f43788a;
        if (lVar != null) {
            lVar.invoke(null);
        }
    }
}
