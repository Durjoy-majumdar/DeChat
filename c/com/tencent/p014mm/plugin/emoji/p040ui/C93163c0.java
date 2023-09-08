package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import di3.C86312j;
import i61.C76300m;
import nj3.C11184p0;
import p441aq.C92054g;
import te3.C101787i40;

/* renamed from: com.tencent.mm.plugin.emoji.ui.c0 */
public final class C93163c0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ EmojiDesignerIPInfoUI f268683d;

    public C93163c0(EmojiDesignerIPInfoUI emojiDesignerIPInfoUI) {
        this.f268683d = emojiDesignerIPInfoUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1000) {
            C101787i40 i402 = this.f268683d.f268474j;
            String str = i402.f298385g;
            String str2 = i402.f298383e;
            String L = ((C92054g) C86312j.m106911c(C92054g.class)).xx0().mo138005L();
            C101787i40 i403 = this.f268683d.f268474j;
            C76300m.m91726b(this.f268683d.getContext(), this.f268683d.f268474j.f298384f + this.f268683d.getString(C0966R.string.n6n), str, str2, L, EmojiLogic.m117471b(0, i403.f298384f, i403.f298385g, i403.f298383e, (String) null, 0, i403.f298382d), 33);
        } else if (itemId == 1001) {
            C76300m.m91725a(this.f268683d.getContext(), 2002);
            this.f268683d.getContext().overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2394bx);
        }
    }
}
