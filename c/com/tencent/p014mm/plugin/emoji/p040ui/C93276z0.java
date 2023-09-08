package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C86312j;
import i61.C76300m;
import nj3.C11184p0;
import p441aq.C92054g;

/* renamed from: com.tencent.mm.plugin.emoji.ui.z0 */
public class C93276z0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreTopicUI f269120d;

    public C93276z0(EmojiStoreTopicUI emojiStoreTopicUI) {
        this.f269120d = emojiStoreTopicUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1000) {
            AppCompatActivity context = this.f269120d.getContext();
            EmojiStoreTopicUI emojiStoreTopicUI = this.f269120d;
            String str = emojiStoreTopicUI.f268655J;
            String str2 = emojiStoreTopicUI.f268657L;
            String str3 = emojiStoreTopicUI.f268656K;
            String L = ((C92054g) C86312j.m106911c(C92054g.class)).xx0().mo138005L();
            EmojiStoreTopicUI emojiStoreTopicUI2 = this.f269120d;
            C76300m.m91726b(context, str, str2, str3, L, EmojiLogic.m117471b(emojiStoreTopicUI2.f268654I, emojiStoreTopicUI2.f268655J, emojiStoreTopicUI2.f268657L, emojiStoreTopicUI2.f268656K, emojiStoreTopicUI2.f268658M, 0, (String) null), 13);
            C115669n.INSTANCE.mo160131h(13224, 1, 1, "", Integer.valueOf(this.f269120d.f268654I));
        } else if (itemId == 1001) {
            C76300m.m91725a(this.f269120d.getContext(), 2002);
            this.f269120d.getContext().overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2394bx);
            C115669n.INSTANCE.mo160131h(13224, 1, 2, "", Integer.valueOf(this.f269120d.f268654I));
        }
    }
}
