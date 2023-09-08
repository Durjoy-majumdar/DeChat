package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI$$g */
public class EmojiPaidUI$$g implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiPaidUI f268523d;

    public EmojiPaidUI$$g(EmojiPaidUI emojiPaidUI) {
        this.f268523d = emojiPaidUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        EmojiPaidUI emojiPaidUI = this.f268523d;
        int i = EmojiPaidUI.f268517K;
        C76879j.m92737h(emojiPaidUI.getContext(), (String) null, (String[]) null, emojiPaidUI.getResources().getString(C0966R.string.c7e), false, new C93191i0(emojiPaidUI));
        return true;
    }
}
