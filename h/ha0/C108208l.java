package ha0;

import com.tencent.maas.instamovie.base.MJError;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ha0.l */
public final class C108208l extends C87413o implements C32226l<C32226l<? super MJError, ? extends C13598b0>, MJError> {

    /* renamed from: d */
    public final /* synthetic */ C108210m f324008d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108208l(C108210m mVar) {
        super(1);
        this.f324008d = mVar;
    }

    public Object invoke(Object obj) {
        C32226l lVar = (C32226l) obj;
        C87412m.m108594g(lVar, "oncomplete");
        Log.m105924i("MicroMsg.CamFunSessionManager", "start teardown");
        C108210m mVar = this.f324008d;
        return mVar.f324011a.teardown(new C108207k(mVar, lVar));
    }
}
