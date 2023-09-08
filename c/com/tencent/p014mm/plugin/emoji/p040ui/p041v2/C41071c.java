package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiMineUI;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.c */
public class C41071c implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2BaseFragment f110651d;

    public C41071c(EmojiStoreV2BaseFragment emojiStoreV2BaseFragment) {
        this.f110651d = emojiStoreV2BaseFragment;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Intent intent = new Intent();
        intent.setClass(this.f110651d.thisActivity(), EmojiMineUI.class);
        EmojiStoreV2BaseFragment emojiStoreV2BaseFragment = this.f110651d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        EmojiStoreV2BaseFragment emojiStoreV2BaseFragment2 = emojiStoreV2BaseFragment;
        C117292a.m165358d(emojiStoreV2BaseFragment2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment$5", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        emojiStoreV2BaseFragment.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(emojiStoreV2BaseFragment2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment$5", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }
}
