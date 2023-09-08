package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.plugin.finder.video.FinderLongVideoPlayerSeekBar;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import he1.C59869v;

/* renamed from: com.tencent.mm.plugin.finder.view.q6 */
public final class C4157q6 implements FinderLongVideoPlayerSeekBar.C3908a {

    /* renamed from: a */
    public final /* synthetic */ HorizontalVideoPreviewLayout f18381a;

    /* renamed from: b */
    public final /* synthetic */ FinderThumbPlayerProxy f18382b;

    /* renamed from: c */
    public final /* synthetic */ FinderLongVideoPlayerSeekBar f18383c;

    /* renamed from: d */
    public final /* synthetic */ FinderVideoLayout f18384d;

    public C4157q6(HorizontalVideoPreviewLayout horizontalVideoPreviewLayout, FinderThumbPlayerProxy finderThumbPlayerProxy, FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar, FinderVideoLayout finderVideoLayout) {
        this.f18381a = horizontalVideoPreviewLayout;
        this.f18382b = finderThumbPlayerProxy;
        this.f18383c = finderLongVideoPlayerSeekBar;
        this.f18384d = finderVideoLayout;
    }

    /* renamed from: a */
    public void mo2425a(int i) {
        C59869v bulletLifecycle = this.f18384d.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bulletLifecycle.mo84824a(i);
        }
    }

    /* renamed from: b */
    public void mo2426b(float f) {
    }

    /* renamed from: c */
    public void mo2427c(long j) {
        this.f18381a.mo4790f(this.f18382b, (int) (j / ((long) 1000)));
        if (this.f18382b.isPlaying()) {
            this.f18383c.setIsPlay(true);
        }
    }

    /* renamed from: d */
    public void mo2428d(boolean z) {
        this.f18381a.setKeepScreenOn(z);
    }

    /* renamed from: e */
    public void mo2429e() {
    }

    public void onVideoEnded() {
        this.f18381a.mo4803j(false);
        this.f18381a.mo4791g();
        this.f18381a.getLongVideoSeekBarLayout().setVisibility(8);
    }
}
