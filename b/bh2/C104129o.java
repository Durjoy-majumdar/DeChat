package bh2;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: bh2.o */
public final class C104129o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C104119h f308109d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104129o(C104119h hVar) {
        super(0);
        this.f308109d = hVar;
    }

    public Object invoke() {
        String str = this.f308109d.f308081m;
        Log.m105924i(str, "onDecodeEnd, encodeFrameCount:" + this.f308109d.f308064L + ", drawFrameCount:" + this.f308109d.f308065M);
        this.f308109d.f308066N = true;
        C104119h.m138955e(this.f308109d);
        return C13598b0.f38549a;
    }
}
