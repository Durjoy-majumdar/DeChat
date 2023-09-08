package v80;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMConditionVariable;
import rx3.C13598b0;

/* renamed from: v80.a */
public final class C111412a {

    /* renamed from: a */
    public static final C111412a f333531a = new C111412a();

    /* renamed from: b */
    public static final MMConditionVariable f333532b = new MMConditionVariable();

    /* renamed from: a */
    public final void mo163073a(boolean z) {
        MMConditionVariable mMConditionVariable = f333532b;
        synchronized (mMConditionVariable) {
            if (z) {
                try {
                    mMConditionVariable.close();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.PreviewRenderSignal", e, "markRendering error", new Object[0]);
                }
            } else {
                mMConditionVariable.open();
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
