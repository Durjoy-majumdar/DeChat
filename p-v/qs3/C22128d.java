package qs3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.qbar.C19938f;

/* renamed from: qs3.d */
public class C22128d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19938f f62614d;

    public C22128d(C19938f fVar) {
        this.f62614d = fVar;
    }

    public void run() {
        C19938f fVar = this.f62614d;
        synchronized (fVar.f56897g) {
            Log.m105924i("MicroMsg.WxScanDecodeQueue", "alvinluo onZoomEnd");
            fVar.f56904n = false;
        }
    }
}
