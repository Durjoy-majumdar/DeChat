package qv0;

import av0.C16686a;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: qv0.d */
public final class C101303d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C101304e f296792d;

    public C101303d(C101304e eVar) {
        this.f296792d = eVar;
    }

    public final void run() {
        Log.m105924i("MicroMsg.ConvChooseHelper", "start calculateChooseConvSize");
        this.f296792d.mo140765b();
        C101304e eVar = this.f296792d;
        eVar.f296793d.mo142811a(eVar.mo140769f(), this.f296792d, C16686a.m16193i().mo142622e().f303755i);
    }
}
