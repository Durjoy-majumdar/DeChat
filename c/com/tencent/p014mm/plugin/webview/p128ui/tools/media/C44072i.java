package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import com.tencent.p014mm.p136ui.tools.C45059m0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.i */
public final class C44072i implements C45059m0.C45070k {

    /* renamed from: a */
    public final /* synthetic */ MPVideoPlayFullScreenView f119414a;

    public C44072i(MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f119414a = mPVideoPlayFullScreenView;
    }

    /* renamed from: a */
    public final void mo68706a(float f, float f2) {
        boolean z = true;
        if (f == 0.0f) {
            if (f2 != 0.0f) {
                z = false;
            }
            if (z) {
                MPVideoPlayFullScreenView.m48335c(this.f119414a);
                return;
            }
        }
        if (Math.abs(f) > 10.0f || Math.abs(f2) > 10.0f) {
            MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119414a;
            int i = MPVideoPlayFullScreenView.f119330y0;
            mPVideoPlayFullScreenView.mo68677p();
        }
    }
}
