package dp1;

import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C20480e0;
import fy3.C32224a;
import gy3.C87413o;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: dp1.f0 */
public final class C58362f0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C58362f0 f167136d = new C58362f0();

    public C58362f0() {
        super(0);
    }

    public Object invoke() {
        try {
            for (Map.Entry next : C20480e0.f57587e.entrySet()) {
                if (((C20480e0.C20481a) next.getValue()).f57617a && !((C20480e0.C20481a) next.getValue()).f57619b) {
                    ((C20480e0.C20481a) next.getValue()).f57624d0 = 1;
                }
            }
        } catch (Throwable th) {
            Log.m105921e("Finder.FinderLoadingTimeReporter", "notifyAppBackground: ", th);
        }
        return C13598b0.f38549a;
    }
}
