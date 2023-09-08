package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.plugin.finder.video.FinderLongVideoPlayerSeekBar;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import df1.C58259c;
import fy3.C32224a;
import gr1.C59667n2;
import pl1.C62367r0;
import rx3.C13598b0;
import xn2.C102693c;

/* renamed from: com.tencent.mm.plugin.finder.view.s6 */
public final class C4173s6 implements C102693c {

    /* renamed from: d */
    public final /* synthetic */ FinderThumbPlayerProxy f18419d;

    /* renamed from: e */
    public final /* synthetic */ FinderLongVideoPlayerSeekBar f18420e;

    /* renamed from: f */
    public final /* synthetic */ HorizontalVideoPreviewLayout f18421f;

    /* renamed from: g */
    public final /* synthetic */ FinderVideoLayout f18422g;

    public C4173s6(FinderThumbPlayerProxy finderThumbPlayerProxy, FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar, HorizontalVideoPreviewLayout horizontalVideoPreviewLayout, FinderVideoLayout finderVideoLayout) {
        this.f18419d = finderThumbPlayerProxy;
        this.f18420e = finderLongVideoPlayerSeekBar;
        this.f18421f = horizontalVideoPreviewLayout;
        this.f18422g = finderVideoLayout;
    }

    /* renamed from: a */
    public void mo4335a(int i) {
        int currentPlaySecond = this.f18419d.getCurrentPlaySecond();
        FinderLongVideoPlayerSeekBar.C3908a aVar = this.f18420e.f17551H;
        if (aVar != null) {
            aVar.mo2425a(i);
        }
        this.f18419d.setVideoViewFocused(true);
        C59667n2 fullSeekBar = this.f18421f.getFullSeekBar();
        if (fullSeekBar != null) {
            fullSeekBar.mo4259i("HorizontalSeek");
        }
        this.f18419d.mo51233x((double) i, true, 3);
        this.f18419d.play();
        this.f18420e.setIsPlay(true);
        C32224a<C13598b0> onSeekEnd = this.f18420e.getOnSeekEnd();
        if (onSeekEnd != null) {
            onSeekEnd.invoke();
        }
        FinderVideoLayout.C56521b playInfo = this.f18422g.getPlayInfo();
        if (playInfo != null) {
            if (!playInfo.f161898g) {
                playInfo = null;
            }
            FinderVideoLayout.C56521b bVar = playInfo;
            if (bVar != null) {
                FinderVideoLayout finderVideoLayout = this.f18422g;
                FinderThumbPlayerProxy finderThumbPlayerProxy = this.f18419d;
                HorizontalVideoPreviewLayout horizontalVideoPreviewLayout = this.f18421f;
                C58259c.C58261b videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
                if (videoPlayBehavior != null) {
                    long expectId = bVar.f161892a.getExpectId();
                    C62367r0 r0Var = bVar.f161894c;
                    videoPlayBehavior.mo83027l(expectId, r0Var.f177253e, currentPlaySecond, i, r0Var);
                }
                finderVideoLayout.mo79543G(bVar.f161892a.getExpectId(), finderThumbPlayerProxy.getVideoMediaId(), currentPlaySecond, i);
                HorizontalVideoPreviewLayout.m4253b(horizontalVideoPreviewLayout, bVar, currentPlaySecond, i, finderThumbPlayerProxy.getVideoDurationMs(), false);
            }
        }
    }

    /* renamed from: c */
    public void mo4336c(int i) {
        this.f18421f.mo4790f(this.f18419d, i);
    }

    public void onSeekPre() {
        FinderVideoLayout.C56521b playInfo = this.f18422g.getPlayInfo();
        if (playInfo != null) {
            playInfo.f161902k = !this.f18419d.isPlaying();
        }
        this.f18419d.pause();
        this.f18420e.setIsPlay(false);
        C32224a<C13598b0> onSeekStart = this.f18420e.getOnSeekStart();
        if (onSeekStart != null) {
            onSeekStart.invoke();
        }
    }
}
