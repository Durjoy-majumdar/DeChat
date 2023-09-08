package com.tencent.p014mm.plugin.luckymoney.story;

import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.j */
public class C69320j extends SimplePAGViewUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ EnvelopeAppBarLayout f199609d;

    public C69320j(EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f199609d = envelopeAppBarLayout;
    }

    public void onAnimationCancel(PAGView pAGView) {
    }

    public void onAnimationEnd(PAGView pAGView) {
    }

    public void onAnimationRepeat(PAGView pAGView) {
    }

    public void onAnimationStart(PAGView pAGView) {
        this.f199609d.f199518t.setVisibility(0);
    }
}
