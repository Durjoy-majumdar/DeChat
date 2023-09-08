package la0;

import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.p014mm.sdk.platformtools.Log;
import ha0.C108183c0;
import ha0.C108236x0;

/* renamed from: la0.e */
public final class C109328e implements MJMovieSession.OnComplete {

    /* renamed from: a */
    public final /* synthetic */ C109300b f327300a;

    /* renamed from: b */
    public final /* synthetic */ C108183c0 f327301b;

    public C109328e(C109300b bVar, C108183c0 c0Var) {
        this.f327300a = bVar;
        this.f327301b = c0Var;
    }

    public final void onComplete(MJError mJError) {
        Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "recommend with blank onComplete");
        C109300b.m148412e3(this.f327300a, this.f327301b, mJError != null ? new C108236x0(mJError) : null);
    }
}
