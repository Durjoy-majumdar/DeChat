package db0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: db0.b */
public final class C58251b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C58248a f166790d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58251b(C58248a aVar) {
        super(0);
        this.f166790d = aVar;
    }

    public Object invoke() {
        String c = this.f166790d.mo82999c();
        Log.m105928w(c, "dismissCoverBitmapInternal captureBitmap:" + this.f166790d.f166782e + '.');
        C58248a aVar = this.f166790d;
        aVar.f166778a.removeView(aVar.f166780c);
        return C13598b0.f38549a;
    }
}
