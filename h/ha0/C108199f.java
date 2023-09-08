package ha0;

import a14.C53916l;
import com.tencent.maas.camerafun.MJCamFunSession;
import com.tencent.maas.camerafun.MJCaptureOptions;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.p014mm.sdk.platformtools.Log;
import ja0.C108679b;
import kotlin.Result;

/* renamed from: ha0.f */
public final class C108199f implements MJCamFunSession.OnOptionsComplete {

    /* renamed from: a */
    public final /* synthetic */ C53916l<MJCaptureOptions> f323988a;

    /* renamed from: b */
    public final /* synthetic */ String f323989b;

    /* renamed from: c */
    public final /* synthetic */ long f323990c;

    public C108199f(C53916l<? super MJCaptureOptions> lVar, String str, long j) {
        this.f323988a = lVar;
        this.f323989b = str;
        this.f323990c = j;
    }

    public final void onComplete(MJCaptureOptions mJCaptureOptions, MJError mJError) {
        if (!this.f323988a.mo74597a()) {
            Log.m105920e("MicroMsg.MaasFuncUtils", this.f323989b + " already resumed");
        } else if (mJError != null) {
            C108679b.f325464a.mo159694a(this.f323989b, mJError, System.currentTimeMillis() - this.f323990c);
            this.f323988a.resumeWith(Result.m168114constructorimpl((Object) null));
        } else {
            this.f323988a.resumeWith(Result.m168114constructorimpl(mJCaptureOptions));
            C108679b.f325464a.mo159695b(this.f323989b, System.currentTimeMillis() - this.f323990c);
        }
    }
}
