package la0;

import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.maas.instamovie.base.MJError;
import ha0.C108183c0;
import ha0.C108236x0;

/* renamed from: la0.g */
public final class C109330g implements MJMovieSession.OnComplete {

    /* renamed from: a */
    public final /* synthetic */ C109300b f327305a;

    /* renamed from: b */
    public final /* synthetic */ C108183c0 f327306b;

    public C109330g(C109300b bVar, C108183c0 c0Var) {
        this.f327305a = bVar;
        this.f327306b = c0Var;
    }

    public final void onComplete(MJError mJError) {
        C109300b.m148412e3(this.f327305a, this.f327306b, mJError != null ? new C108236x0(mJError) : null);
    }
}
