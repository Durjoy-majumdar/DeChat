package ha0;

import a14.C53895h;
import a14.C53934p0;
import com.tencent.maas.camerafun.MJCaptureOptions;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ha0.C108210m;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: ha0.n */
public final class C108213n extends C87413o implements C32226l<C32227p<? super MJCaptureOptions, ? super MJError, ? extends C13598b0>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108210m f324016d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108213n(C108210m mVar) {
        super(1);
        this.f324016d = mVar;
    }

    public Object invoke(Object obj) {
        C32227p pVar = (C32227p) obj;
        C87412m.m108594g(pVar, LocaleUtil.ITALIAN);
        Log.m105924i("MicroMsg.CamFunSessionManager", "camFunSession start");
        C108210m mVar = this.f324016d;
        if (mVar.f324012b == null) {
            Log.m105924i("MicroMsg.CamFunSessionManager", "installFirstFrameCallback");
            mVar.f324012b = C53895h.m60466d(mVar.f324013c, (C66212f) null, (C53934p0) null, new C108205j(mVar, (C15601d<? super C108205j>) null), 3, (Object) null);
        }
        this.f324016d.f324011a.start(new C108210m.C108212b(pVar));
        return C13598b0.f38549a;
    }
}
