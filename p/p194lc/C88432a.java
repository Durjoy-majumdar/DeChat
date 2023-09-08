package p194lc;

import com.tencent.skyline.IBootstrapDoneCallback;

/* renamed from: lc.a */
public final class C88432a implements IBootstrapDoneCallback {

    /* renamed from: a */
    public final /* synthetic */ Runnable f255438a;

    public C88432a(Runnable runnable) {
        this.f255438a = runnable;
    }

    public void onDone() {
        this.f255438a.run();
    }
}
