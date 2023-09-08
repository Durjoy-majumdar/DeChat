package wm1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C49712hj1;

/* renamed from: wm1.c */
public final class C15526c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f42084d;

    /* renamed from: e */
    public final /* synthetic */ C15522a f42085e;

    /* renamed from: f */
    public final /* synthetic */ C49712hj1 f42086f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15526c(boolean z, C15522a aVar, C49712hj1 hj12) {
        super(0);
        this.f42084d = z;
        this.f42085e = aVar;
        this.f42086f = hj12;
    }

    public Object invoke() {
        Log.m105928w("NearbyLiveSquareTabLayoutUIC", "fetchLiveSquareTabs success:" + this.f42084d);
        this.f42085e.mo14302c(this.f42086f);
        return C13598b0.f38549a;
    }
}
