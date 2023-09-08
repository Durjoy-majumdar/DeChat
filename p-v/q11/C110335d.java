package q11;

import android.os.Handler;
import android.os.HandlerThread;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C36570n;

/* renamed from: q11.d */
public final class C110335d extends C87413o implements C32224a<Handler> {

    /* renamed from: d */
    public final /* synthetic */ C110336f f330058d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110335d(C110336f fVar) {
        super(0);
        this.f330058d = fVar;
    }

    public Object invoke() {
        return new Handler(((HandlerThread) ((C36570n) this.f330058d.f330062c).getValue()).getLooper());
    }
}
