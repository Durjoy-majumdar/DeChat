package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.VideoControl;
import xn2.C102693c;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.d */
public final class C44066d implements C102693c {

    /* renamed from: d */
    public final /* synthetic */ MPVideoPlayFullScreenView f119404d;

    public C44066d(MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f119404d = mPVideoPlayFullScreenView;
    }

    /* renamed from: a */
    public void mo4335a(int i) {
        String str = this.f119404d.f119353d;
        Log.m105924i(str, "initSeekBar onSeekTo " + i);
        VideoControl videoControl = this.f119404d.f119373y;
        if (videoControl != null) {
            videoControl.videoSeek((double) i);
        }
    }

    /* renamed from: c */
    public void mo4336c(int i) {
    }

    public void onSeekPre() {
    }
}
