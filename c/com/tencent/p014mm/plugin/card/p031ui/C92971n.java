package com.tencent.p014mm.plugin.card.p031ui;

import android.view.ViewTreeObserver;
import com.tencent.p014mm.p136ui.tools.C45059m0;

/* renamed from: com.tencent.mm.plugin.card.ui.n */
public class C92971n implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ CardGiftVideoUI f267778d;

    public C92971n(CardGiftVideoUI cardGiftVideoUI) {
        this.f267778d = cardGiftVideoUI;
    }

    public boolean onPreDraw() {
        this.f267778d.f267750g.getViewTreeObserver().removeOnPreDrawListener(this);
        CardGiftVideoUI cardGiftVideoUI = this.f267778d;
        cardGiftVideoUI.f267761u.mo70408c(cardGiftVideoUI.f267750g, cardGiftVideoUI.f267751h, (C45059m0.C45068i) null);
        return true;
    }
}
