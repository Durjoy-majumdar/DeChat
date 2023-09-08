package zq0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import lp3.C88631d;
import rx3.C13598b0;
import te3.dm4;

/* renamed from: zq0.l */
public final class C16394l<T> implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ C32226l<dm4, C13598b0> f43791a;

    public C16394l(C32226l<? super dm4, C13598b0> lVar) {
        this.f43791a = lVar;
    }

    /* renamed from: a */
    public final void mo1720a(Object obj) {
        if (obj instanceof Exception) {
            Log.m105920e("Luggage.FULL.CgiPhoneNumber", "CgiUpdateUserPhone " + ((Exception) obj).getMessage());
        }
        C32226l<dm4, C13598b0> lVar = this.f43791a;
        if (lVar != null) {
            lVar.invoke(null);
        }
    }
}
