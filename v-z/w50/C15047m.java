package w50;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import p1081gi.C98123f;
import rx3.C13598b0;

/* renamed from: w50.m */
public final class C15047m extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C98123f f41186d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15047m(C98123f fVar) {
        super(1);
        this.f41186d = fVar;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        Log.m105924i("LiveMakeupUtil", "#downloadCdnResV2 invokeOnCancellation");
        this.f41186d.f287662f = null;
        return C13598b0.f38549a;
    }
}
