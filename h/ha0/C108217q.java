package ha0;

import com.tencent.maas.camerafun.MJRecordingFinishInfo;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ha0.q */
public final class C108217q extends C87413o implements C32226l<C32227p<? super MJRecordingFinishInfo, ? super MJError, ? extends C13598b0>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108210m f324025d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108217q(C108210m mVar) {
        super(1);
        this.f324025d = mVar;
    }

    public Object invoke(Object obj) {
        C32227p pVar = (C32227p) obj;
        C87412m.m108594g(pVar, LocaleUtil.ITALIAN);
        Log.m105924i("MicroMsg.CamFunSessionManager", "stopRecording");
        this.f324025d.f324011a.stopRecording(new C108216p(pVar));
        return C13598b0.f38549a;
    }
}
