package com.tencent.p014mm.p136ui.tools;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.ui.tools.z */
public class C116162z implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ CropImageNewUI f348617d;

    public C116162z(CropImageNewUI cropImageNewUI) {
        this.f348617d = cropImageNewUI;
    }

    public boolean onTimerExpired() {
        this.f348617d.f348468h.mo177441a();
        return true;
    }
}
