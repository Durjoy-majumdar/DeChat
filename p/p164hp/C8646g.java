package p164hp;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import p1081gi.C98123f;
import rx3.C13598b0;

/* renamed from: hp.g */
public final class C8646g extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C98123f f27801d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8646g(C98123f fVar) {
        super(1);
        this.f27801d = fVar;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        Log.m105924i("Download.SuperDownloaderWrapCore", "#downloadUrlRes invokeOnCancellation");
        this.f27801d.f287662f = null;
        return C13598b0.f38549a;
    }
}
