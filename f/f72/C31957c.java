package f72;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: f72.c */
public final class C31957c extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f85098d;

    /* renamed from: e */
    public final /* synthetic */ Object f85099e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31957c(C8477a0 a0Var, Object obj) {
        super(1);
        this.f85098d = a0Var;
        this.f85099e = obj;
    }

    public Object invoke(Object obj) {
        this.f85098d.f27482d = ((Boolean) obj).booleanValue();
        Object obj2 = this.f85099e;
        synchronized (obj2) {
            try {
                obj2.notifyAll();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VideoTransCodeHelper", e, "", new Object[0]);
            }
        }
        return C13598b0.f38549a;
    }
}
