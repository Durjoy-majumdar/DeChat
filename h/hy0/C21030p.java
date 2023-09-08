package hy0;

import com.tencent.p014mm.plugin.brandservice.p028ui.widget.MPExoVideoWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: hy0.p */
public final class C21030p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MPExoVideoWrapper f59500d;

    public C21030p(MPExoVideoWrapper mPExoVideoWrapper) {
        this.f59500d = mPExoVideoWrapper;
    }

    public final void run() {
        int i = MPExoVideoWrapper.f51486Q0;
        Log.m105924i("MicroMsg.MPExoVideoWrapper", "video stop");
        this.f59500d.mo23216q(0);
        this.f59500d.mo23217r(false);
        this.f59500d.mo23209j();
        this.f59500d.mo23186g();
    }
}
