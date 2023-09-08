package ha0;

import a14.C53973z1;
import com.tencent.maas.camerafun.MJCamFunSession;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import ja0.C60781a;
import java.util.concurrent.CancellationException;
import rx3.C13598b0;

/* renamed from: ha0.k */
public final class C108207k implements MJCamFunSession.OnComplete {

    /* renamed from: a */
    public final /* synthetic */ C108210m f324006a;

    /* renamed from: b */
    public final /* synthetic */ C32226l<MJError, C13598b0> f324007b;

    public C108207k(C108210m mVar, C32226l<? super MJError, C13598b0> lVar) {
        this.f324006a = mVar;
        this.f324007b = lVar;
    }

    public final void onComplete(MJError mJError) {
        Log.m105924i("MicroMsg.CamFunSessionManager", "teardown finish");
        this.f324006a.f324011a.release();
        C53973z1 z1Var = this.f324006a.f324012b;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f324006a.f324012b = null;
        Log.m105924i("MicroMsg.MaasMovieSessionManager", "setSessionKey " + "" + ", field: " + C60781a.f173118a);
        C60781a.f173118a = "";
        this.f324007b.invoke(mJError);
    }
}
