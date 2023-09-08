package com.tencent.p014mm.plugin.luckymoney.story;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.h */
public class C69318h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EnvelopeAppBarLayout f199607d;

    public C69318h(EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f199607d = envelopeAppBarLayout;
    }

    public void run() {
        EnvelopeAppBarLayout envelopeAppBarLayout = this.f199607d;
        TouchCoordinatorLayout touchCoordinatorLayout = envelopeAppBarLayout.f199526x;
        if (touchCoordinatorLayout != null) {
            touchCoordinatorLayout.f199577E = true;
        }
        envelopeAppBarLayout.f199506k1.setStartDelay(700);
        this.f199607d.f199506k1.start();
    }
}
