package com.tencent.p014mm.plugin.flash.action;

import com.tencent.p014mm.plugin.flash.C105349l;
import com.tencent.p014mm.plugin.flash.C105352n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import f40.C86709a0;
import lu3.C34379c;
import zt1.C16407i;

/* renamed from: com.tencent.mm.plugin.flash.action.n */
public class C4381n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FaceFlashActionUI f19013d;

    public C4381n(FaceFlashActionUI faceFlashActionUI) {
        this.f19013d = faceFlashActionUI;
    }

    public void run() {
        FaceFlashActionProcessLayout faceFlashActionProcessLayout = this.f19013d.f18981e;
        faceFlashActionProcessLayout.f18977q.cancel();
        faceFlashActionProcessLayout.f18978r.cancel();
        faceFlashActionProcessLayout.f18979s.cancel();
        FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f19013d.f18980d;
        faceFlashActionPreviewLayout.getClass();
        Log.m105924i("MicroMsg.FaceFlashActionPreviewLayout", "release");
        faceFlashActionPreviewLayout.f18929g.clearAnimation();
        faceFlashActionPreviewLayout.f18930h.clearAnimation();
        faceFlashActionPreviewLayout.f18938s.getClass();
        Log.m105924i("MicroMsg.FaceFlashManager", "releaseYTSdk");
        YtSDKKitFramework.getInstance().deInit();
        C105349l lVar = faceFlashActionPreviewLayout.f18936q;
        MMHandler mMHandler = lVar.f313126c;
        if (mMHandler != null) {
            mMHandler.post(new C105352n(lVar));
        } else {
            Log.m105924i("MicroMsg.FaceFlashManagerCamera", "back thread is not running");
        }
        C16407i iVar = faceFlashActionPreviewLayout.f18940u;
        if (iVar != null) {
            iVar.release();
        }
        faceFlashActionPreviewLayout.f18925M.cancel();
        C34379c cVar = faceFlashActionPreviewLayout.f18918F;
        if (cVar != null) {
            cVar.cancel(true);
            faceFlashActionPreviewLayout.f18918F = null;
        }
        C86709a0.m107524d().mo123470p(5965, faceFlashActionPreviewLayout);
    }
}
