package com.tencent.p014mm.plugin.card.p031ui;

import android.view.ViewTreeObserver;
import com.tencent.p014mm.p136ui.tools.C45059m0;

/* renamed from: com.tencent.mm.plugin.card.ui.l */
public class C92970l implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ CardGiftImageUI f267777d;

    public C92970l(CardGiftImageUI cardGiftImageUI) {
        this.f267777d = cardGiftImageUI;
    }

    public boolean onPreDraw() {
        this.f267777d.f267724g.getViewTreeObserver().removeOnPreDrawListener(this);
        CardGiftImageUI cardGiftImageUI = this.f267777d;
        cardGiftImageUI.f267731q.mo70408c(cardGiftImageUI.f267724g, cardGiftImageUI.f267723f, (C45059m0.C45068i) null);
        return true;
    }
}
