package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C86312j;
import i61.C76300m;
import nj3.C11184p0;
import p441aq.C92054g;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.u */
public class C93252u implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2SingleProductUI f268967d;

    public C93252u(EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f268967d = emojiStoreV2SingleProductUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1000) {
            AppCompatActivity context = this.f268967d.getContext();
            EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f268967d;
            String str = emojiStoreV2SingleProductUI.f268911j;
            String str2 = emojiStoreV2SingleProductUI.f268913o;
            String str3 = emojiStoreV2SingleProductUI.f268912n;
            String L = ((C92054g) C86312j.m106911c(C92054g.class)).xx0().mo138005L();
            EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI2 = this.f268967d;
            C76300m.m91726b(context, str, str2, str3, L, EmojiLogic.m117471b(emojiStoreV2SingleProductUI2.f268910i, emojiStoreV2SingleProductUI2.f268911j, emojiStoreV2SingleProductUI2.f268913o, emojiStoreV2SingleProductUI2.f268912n, emojiStoreV2SingleProductUI2.f268914p, emojiStoreV2SingleProductUI2.f268916r, (String) null), 12);
            C115669n.INSTANCE.mo160131h(13224, 2, 1, "", Integer.valueOf(this.f268967d.f268910i));
        } else if (itemId == 1001) {
            C76300m.m91725a(this.f268967d.getContext(), 2002);
            this.f268967d.getContext().overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2394bx);
            C115669n.INSTANCE.mo160131h(13224, 2, 2, "", Integer.valueOf(this.f268967d.f268910i));
        }
    }
}
