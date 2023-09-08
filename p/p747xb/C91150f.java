package p747xb;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: xb.f */
public final class C91150f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C91151g f261369d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91150f(C91151g gVar) {
        super(0);
        this.f261369d = gVar;
    }

    public Object invoke() {
        ((MTimerHandler) ((C36570n) this.f261369d.f261377h).getValue()).stopTimer();
        return C13598b0.f38549a;
    }
}
