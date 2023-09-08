package p194lc;

import com.tencent.skyline.IBootstrapDoneCallback;

/* renamed from: lc.k */
public final class C88451k implements IBootstrapDoneCallback {

    /* renamed from: a */
    public final /* synthetic */ Runnable f255478a;

    public C88451k(Runnable runnable) {
        this.f255478a = runnable;
    }

    public void onDone() {
        this.f255478a.run();
    }
}
