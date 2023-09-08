package com.tencent.p014mm.plugin.card.p031ui;

import android.view.MenuItem;
import di3.C86312j;
import nj3.C11184p0;
import p140cw.C7138g;

/* renamed from: com.tencent.mm.plugin.card.ui.k */
public class C92969k implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ CardGiftImageUI f267776d;

    public C92969k(CardGiftImageUI cardGiftImageUI) {
        this.f267776d = cardGiftImageUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 0) {
            CardGiftImageUI cardGiftImageUI = this.f267776d;
            ((C7138g) C86312j.m106911c(C7138g.class)).he0(cardGiftImageUI.f267722e, cardGiftImageUI);
        }
    }
}
