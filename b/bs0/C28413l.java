package bs0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import ob0.C117747y;
import ob0.C89144l0;
import rx3.C13598b0;

/* renamed from: bs0.l */
public final class C28413l extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C117747y f78141d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28413l(C117747y yVar) {
        super(1);
        this.f78141d = yVar;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        Log.m105924i("MicroMsg.CgiWxaAppGetUserAuthorizeScopeList", "invokeOnCancellation");
        C89144l0.m111426b(this.f78141d);
        return C13598b0.f38549a;
    }
}
