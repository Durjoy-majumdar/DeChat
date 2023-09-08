package com.tencent.p014mm.p136ui.chatting;

import ob0.C117747y;
import ob0.C47355o;

/* renamed from: com.tencent.mm.ui.chatting.l */
public class C19751l implements C47355o {

    /* renamed from: d */
    public final /* synthetic */ AppAttachNewDownloadUI f56172d;

    public C19751l(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f56172d = appAttachNewDownloadUI;
    }

    /* renamed from: m */
    public void mo26221m(int i, int i2, C117747y yVar) {
        float f = i2 == 0 ? 0.0f : (((float) i) * 100.0f) / ((float) i2);
        if (i < i2 && this.f56172d.f56026f.getVisibility() != 0) {
            this.f56172d.mo26137e8(0);
            this.f56172d.f56027g.mo26155a(8);
        }
        this.f56172d.f56026f.setProgress((int) f);
    }
}
