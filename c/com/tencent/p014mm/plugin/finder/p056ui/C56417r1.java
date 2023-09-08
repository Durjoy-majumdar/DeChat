package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import gr1.C59670o2;
import xn2.C102693c;

/* renamed from: com.tencent.mm.plugin.finder.ui.r1 */
public final class C56417r1 implements C102693c {

    /* renamed from: d */
    public final /* synthetic */ FinderMediaPreviewUI f161280d;

    public C56417r1(FinderMediaPreviewUI finderMediaPreviewUI) {
        this.f161280d = finderMediaPreviewUI;
    }

    /* renamed from: a */
    public void mo4335a(int i) {
        FinderMediaPreviewUI finderMediaPreviewUI = this.f161280d;
        int i2 = FinderMediaPreviewUI.f161053y;
        C59670o2 videoView = ((FinderVideoLayout) finderMediaPreviewUI.mo79091N7().getVideoBanner().getMediaView()).getVideoView();
        if (videoView != null) {
            videoView.mo51223a((double) i, true);
        }
        this.f161280d.mo79092O7().setIsPlay(true);
    }

    /* renamed from: c */
    public void mo4336c(int i) {
    }

    public void onSeekPre() {
        FinderMediaPreviewUI finderMediaPreviewUI = this.f161280d;
        int i = FinderMediaPreviewUI.f161053y;
        finderMediaPreviewUI.mo79093P7(false);
        this.f161280d.mo79092O7().setIsPlay(false);
    }
}
