package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.emoji.ui.e0 */
public final class C93169e0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiMineListFragment f268690d;

    public C93169e0(EmojiMineListFragment emojiMineListFragment) {
        this.f268690d = emojiMineListFragment;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i = EmojiSortUI.f268549f;
        Context requireContext = this.f268690d.requireContext();
        C87412m.m108593f(requireContext, "requireContext()");
        String str = this.f268690d.f268493e;
        if (str == null) {
            return true;
        }
        Intent intent = new Intent(requireContext, EmojiSortUI.class);
        intent.putExtra("type", "type_sort_ip_set");
        intent.putExtra("ip_set_key", str);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(requireContext, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiSortUI$Companion", "showIpSort", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        requireContext.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(requireContext, "com/tencent/mm/plugin/emoji/ui/EmojiSortUI$Companion", "showIpSort", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
