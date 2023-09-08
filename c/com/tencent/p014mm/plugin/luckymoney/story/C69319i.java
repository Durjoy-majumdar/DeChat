package com.tencent.p014mm.plugin.luckymoney.story;

import f32.C75672b;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.i */
public class C69319i implements C75672b.C75673a {

    /* renamed from: a */
    public final /* synthetic */ EnvelopeAppBarLayout f199608a;

    public C69319i(EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f199608a = envelopeAppBarLayout;
    }

    public void onComplete(boolean z) {
        if (z) {
            this.f199608a.f199483S.setVisibility(8);
            EnvelopeAppBarLayout envelopeAppBarLayout = this.f199608a;
            envelopeAppBarLayout.f199462B1 = true;
            envelopeAppBarLayout.mo95442o();
        }
    }
}
