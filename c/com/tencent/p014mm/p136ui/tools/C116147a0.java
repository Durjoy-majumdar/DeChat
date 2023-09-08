package com.tencent.p014mm.p136ui.tools;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.ui.tools.a0 */
public class C116147a0 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ CropImageNewUI f348600d;

    public C116147a0(CropImageNewUI cropImageNewUI) {
        this.f348600d = cropImageNewUI;
    }

    public boolean onTimerExpired() {
        this.f348600d.f348468h.mo177442b();
        return true;
    }
}
