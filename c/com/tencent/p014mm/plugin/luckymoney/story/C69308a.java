package com.tencent.p014mm.plugin.luckymoney.story;

import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.a */
public class C69308a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EnvelopeAppBarLayout f199578d;

    public C69308a(EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f199578d = envelopeAppBarLayout;
    }

    public void run() {
        EnvelopeAppBarLayout envelopeAppBarLayout = this.f199578d;
        envelopeAppBarLayout.f199488U0.mo146260y(-(envelopeAppBarLayout.getTotalScrollRange() - this.f199578d.f199484S0));
        this.f199578d.f199529y.setAlpha(1.0f);
        View view = this.f199578d.f199485T.f199810I1;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$11", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$11", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f199578d.f199485T.f199812J1.setVisibility(0);
        EnvelopeAppBarLayout.m81664e(this.f199578d);
    }
}
