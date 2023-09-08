package d71;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: d71.f */
public final class C31096f extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f83381d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31096f(C32226l<? super Boolean, C13598b0> lVar) {
        super(1);
        this.f83381d = lVar;
    }

    public Object invoke(Object obj) {
        MMHandlerThread.postToMainThread(new C31095e(this.f83381d, ((Boolean) obj).booleanValue()));
        return C13598b0.f38549a;
    }
}
