package u93;

import android.os.Looper;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: u93.f */
public final class C52494f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f146646d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52494f(String str) {
        super(0);
        this.f146646d = str;
    }

    public Object invoke() {
        Looper.myQueue().addIdleHandler(new C52493e(this.f146646d));
        return C13598b0.f38549a;
    }
}
