package k03;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: k03.d */
public final class C60937d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60934c f173568d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60937d(C60934c cVar) {
        super(0);
        this.f173568d = cVar;
    }

    public Object invoke() {
        String d = this.f173568d.mo85888d();
        Log.m105928w(d, "dismissCoverBitmapInternal captureBitmap:" + this.f173568d.f173560e + '.');
        C60934c cVar = this.f173568d;
        cVar.f173556a.removeView(cVar.f173558c);
        return C13598b0.f38549a;
    }
}
