package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$h */
public class EmojiCustomUI$$h implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiCustomUI f268449d;

    public EmojiCustomUI$$h(EmojiCustomUI emojiCustomUI) {
        this.f268449d = emojiCustomUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        EmojiCustomUI emojiCustomUI = this.f268449d;
        EmojiCustomUI$$u emojiCustomUI$$u = EmojiCustomUI$$u.EDIT;
        int i = EmojiCustomUI.f268411F;
        emojiCustomUI.mo127702L7(emojiCustomUI$$u);
        C115669n.INSTANCE.mo160131h(11596, 1);
        return true;
    }
}
