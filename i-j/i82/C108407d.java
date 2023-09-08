package i82;

import android.os.Handler;
import android.os.HandlerThread;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C36570n;

/* renamed from: i82.d */
public final class C108407d extends C87413o implements C32224a<Handler> {

    /* renamed from: d */
    public final /* synthetic */ C108408f f324605d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108407d(C108408f fVar) {
        super(0);
        this.f324605d = fVar;
    }

    public Object invoke() {
        return new Handler(((HandlerThread) ((C36570n) this.f324605d.f324609c).getValue()).getLooper());
    }
}
