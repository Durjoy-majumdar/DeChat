package te2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import pe2.C100786f;

/* renamed from: te2.a */
public final class C101744a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f297819d;

    /* renamed from: e */
    public final /* synthetic */ boolean f297820e;

    public C101744a(C72963f4 f4Var, boolean z) {
        this.f297819d = f4Var;
        this.f297820e = z;
    }

    public final void run() {
        C100786f.m131975f(this.f297819d, this.f297820e);
        Log.m105924i("MicroMsg.C2CPreDownloadPLC", "c2c pre download: image msg open, msgId:" + this.f297819d.getMsgId());
    }
}
