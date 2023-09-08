package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI$$b */
public final /* synthetic */ class EmojiPaidUI$$b implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiPaidUI f268521d;

    public /* synthetic */ EmojiPaidUI$$b(EmojiPaidUI emojiPaidUI) {
        this.f268521d = emojiPaidUI;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        EmojiPaidUI emojiPaidUI = this.f268521d;
        int i = EmojiPaidUI.f268517K;
        emojiPaidUI.getClass();
        ((C76874e0) contextMenu).mo107136c(0, 1, 0, emojiPaidUI.getString(C0966R.string.f7944x1), C0966R.raw.icons_outlined_delete);
    }
}
