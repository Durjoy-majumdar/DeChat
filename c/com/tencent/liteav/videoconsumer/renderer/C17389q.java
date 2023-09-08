package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.videobase.DisplayTarget;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.q */
final /* synthetic */ class C17389q implements Runnable {

    /* renamed from: a */
    private final C17383i f47165a;

    /* renamed from: b */
    private final DisplayTarget f47166b;

    /* renamed from: c */
    private final boolean f47167c;

    private C17389q(C17383i iVar, DisplayTarget displayTarget, boolean z) {
        this.f47165a = iVar;
        this.f47166b = displayTarget;
        this.f47167c = z;
    }

    /* renamed from: a */
    public static Runnable m17396a(C17383i iVar, DisplayTarget displayTarget, boolean z) {
        return new C17389q(iVar, displayTarget, z);
    }

    public final void run() {
        DisplayTarget displayTarget;
        C17383i iVar = this.f47165a;
        DisplayTarget displayTarget2 = this.f47166b;
        boolean z = this.f47167c;
        LiteavLog.m16901i("VideoRenderer", "setDisplayView=" + displayTarget2 + ",isNeedClear=" + z);
        boolean equals = CommonUtil.equals(iVar.f47131e, displayTarget2);
        if (!equals) {
            iVar.f47147u = true;
        }
        if (z && !equals && (displayTarget = iVar.f47131e) != null) {
            displayTarget.hideAll();
        }
        iVar.f47131e = displayTarget2;
        if (displayTarget2 != null) {
            displayTarget2.showAll();
        }
        iVar.f47129c.mo20451a(displayTarget2);
    }
}
