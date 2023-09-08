package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import android.widget.ProgressBar;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.m */
public final class C44077m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MPVideoPlayFullScreenView f119422d;

    public C44077m(MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f119422d = mPVideoPlayFullScreenView;
    }

    public final void run() {
        ProgressBar progressBar;
        ProgressBar progressBar2 = this.f119422d.f119332B;
        if (!(progressBar2 != null && progressBar2.getVisibility() == 0) && (progressBar = this.f119422d.f119332B) != null) {
            progressBar.setVisibility(0);
        }
    }
}
