package com.tencent.p014mm.plugin.flash;

import android.hardware.Camera;
import com.tencent.p014mm.plugin.facedetect.model.C105224h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import p156gj.C107848z;

/* renamed from: com.tencent.mm.plugin.flash.n */
public class C105352n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105349l f313142d;

    public C105352n(C105349l lVar) {
        this.f313142d = lVar;
    }

    public void run() {
        C105349l lVar = this.f313142d;
        lVar.getClass();
        Log.m105924i("MicroMsg.FaceFlashManagerCamera", "closeCamera start");
        C105224h.m141309b().mo149590d(lVar.f313141r);
        C107848z zVar = lVar.f313127d;
        if (zVar != null) {
            try {
                if (lVar.f313134k) {
                    lVar.f313134k = false;
                    zVar.mo158268l();
                    lVar.f313127d.mo158263g((Camera.PreviewCallback) null);
                    Log.m105924i("MicroMsg.FaceFlashManagerCamera", "stop preview, not previewing");
                }
            } catch (Exception e) {
                Log.m105924i("MicroMsg.FaceFlashManagerCamera", "Error setting camera preview: " + e.getMessage());
            }
            try {
                lVar.f313127d.mo158263g((Camera.PreviewCallback) null);
                lVar.f313127d.mo158260d();
            } catch (Exception e2) {
                Log.m105924i("MicroMsg.FaceFlashManagerCamera", "Error setting camera preview: " + e2.getMessage());
            } catch (Throwable th) {
                lVar.f313127d = null;
                throw th;
            }
            lVar.f313127d = null;
        }
        Log.m105924i("MicroMsg.FaceFlashManagerCamera", "closeCamera end");
        C105349l lVar2 = this.f313142d;
        if (lVar2.f313125b != null) {
            MMHandler mMHandler = lVar2.f313126c;
            if (mMHandler != null) {
                mMHandler.removeCallbacksAndMessages((Object) null);
            }
            Log.m105924i("MicroMsg.FaceFlashManagerCamera", "stop camera thread");
            lVar2.f313125b.quitSafely();
            lVar2.f313125b = null;
            lVar2.f313126c = null;
            lVar2.f313140q = null;
            Log.m105924i("MicroMsg.FaceFlashManagerCamera", "stop camera thread finish");
        }
    }
}
