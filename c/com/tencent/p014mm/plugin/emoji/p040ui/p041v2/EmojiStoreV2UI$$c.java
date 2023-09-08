package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiMineUI;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import di3.C86312j;
import j20.C117292a;
import k20.C9556a;
import p626nv.C109759g;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI$$c */
public class EmojiStoreV2UI$$c implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2UI f110641d;

    public EmojiStoreV2UI$$c(EmojiStoreV2UI emojiStoreV2UI) {
        this.f110641d = emojiStoreV2UI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Intent intent = new Intent();
        intent.putExtra(String.valueOf(10931), 1);
        intent.setClass(this.f110641d, EmojiMineUI.class);
        intent.putExtra("from_store", true);
        EmojiStoreV2UI emojiStoreV2UI = this.f110641d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        EmojiStoreV2UI emojiStoreV2UI2 = emojiStoreV2UI;
        C117292a.m165358d(emojiStoreV2UI2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2UI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        emojiStoreV2UI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(emojiStoreV2UI2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2UI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C115627l lVar = (C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40();
        lVar.mo175762a(44);
        lVar.mo175775q("stickernavright");
        return false;
    }
}
