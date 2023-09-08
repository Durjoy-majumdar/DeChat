package ds0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import ob0.C117747y;
import ob0.C89144l0;
import rx3.C13598b0;

/* renamed from: ds0.f */
public final class C31277f extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C117747y f83757d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31277f(C117747y yVar) {
        super(1);
        this.f83757d = yVar;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        Log.m105924i("MicroMsg.CgiWxaAppGetPrivacyUseRecord", "invokeOnCancellation");
        C89144l0.m111426b(this.f83757d);
        return C13598b0.f38549a;
    }
}
