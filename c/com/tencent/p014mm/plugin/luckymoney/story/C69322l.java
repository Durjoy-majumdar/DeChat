package com.tencent.p014mm.plugin.luckymoney.story;

import android.view.ViewGroup;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.l */
public class C69322l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EnvelopeAppBarLayout f199610d;

    public C69322l(EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f199610d = envelopeAppBarLayout;
    }

    public void run() {
        ViewGroup.LayoutParams layoutParams = this.f199610d.f199518t.getLayoutParams();
        layoutParams.width = this.f199610d.f199516s.getWidth();
        layoutParams.height = this.f199610d.f199516s.getHeight();
        this.f199610d.f199518t.setLayoutParams(layoutParams);
    }
}
