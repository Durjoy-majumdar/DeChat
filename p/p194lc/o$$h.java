package p194lc;

import com.tencent.p014mm.plugin.appbrand.page.d1$$r;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.skyline.IRouteDoneCallback;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: lc.o$$h */
public final class o$$h implements IRouteDoneCallback, d1$$r {

    /* renamed from: d */
    public final IRouteDoneCallback f255519d;

    /* renamed from: e */
    public final AtomicBoolean f255520e = new AtomicBoolean(false);

    public o$$h(C88453o oVar, IRouteDoneCallback iRouteDoneCallback) {
        oVar.mo116074u0(this);
        this.f255519d = iRouteDoneCallback;
    }

    /* renamed from: h5 */
    public void mo116384h5(boolean z) {
    }

    public void onDone() {
        if (this.f255520e.getAndSet(true)) {
            return;
        }
        if (MMHandlerThread.isMainThread()) {
            this.f255519d.onDone();
            return;
        }
        IRouteDoneCallback iRouteDoneCallback = this.f255519d;
        Objects.requireNonNull(iRouteDoneCallback);
        MMHandlerThread.postToMainThread(new o$$h$$a(iRouteDoneCallback));
    }

    public void run() {
        onDone();
    }
}
