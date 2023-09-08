package p194lc;

import com.tencent.skyline.IRouteDoneCallback;

/* renamed from: lc.o$$h$$a */
public final /* synthetic */ class o$$h$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ IRouteDoneCallback f255492d;

    public /* synthetic */ o$$h$$a(IRouteDoneCallback iRouteDoneCallback) {
        this.f255492d = iRouteDoneCallback;
    }

    public final void run() {
        this.f255492d.onDone();
    }
}
