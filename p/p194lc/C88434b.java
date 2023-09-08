package p194lc;

import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.skyline.jni.INativeHandler;

/* renamed from: lc.b */
public final class C88434b implements INativeHandler {

    /* renamed from: a */
    public final /* synthetic */ C83181q f255440a;

    public C88434b(C83181q qVar) {
        this.f255440a = qVar;
    }

    public final void checkAndPost(Runnable runnable) {
        if (runnable != null) {
            if (this.f255440a.mo115422q()) {
                runnable.run();
            } else {
                this.f255440a.post(runnable);
            }
        }
    }
}
