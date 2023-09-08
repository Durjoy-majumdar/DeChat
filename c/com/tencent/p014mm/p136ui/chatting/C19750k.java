package com.tencent.p014mm.p136ui.chatting;

import ob0.C117747y;
import ob0.C47355o;

/* renamed from: com.tencent.mm.ui.chatting.k */
public class C19750k implements C47355o {

    /* renamed from: d */
    public final /* synthetic */ AppAttachDownloadUI f56171d;

    public C19750k(AppAttachDownloadUI appAttachDownloadUI) {
        this.f56171d = appAttachDownloadUI;
    }

    /* renamed from: m */
    public void mo26221m(int i, int i2, C117747y yVar) {
        float f = i2 == 0 ? 0.0f : (((float) i) * 100.0f) / ((float) i2);
        if (i < i2 && this.f56171d.f55933f.getVisibility() != 0) {
            this.f56171d.mo26096S7(0);
            this.f56171d.f55934g.mo26104a(8);
        }
        this.f56171d.f55933f.setProgress((int) f);
    }
}
