package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.C0966R;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI$$c */
public class EmojiAddCustomDialogUI$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EmojiAddCustomDialogUI f268401d;

    public EmojiAddCustomDialogUI$$c(EmojiAddCustomDialogUI emojiAddCustomDialogUI) {
        this.f268401d = emojiAddCustomDialogUI;
    }

    public void run() {
        EmojiAddCustomDialogUI emojiAddCustomDialogUI = this.f268401d;
        String string = emojiAddCustomDialogUI.getString(C0966R.string.c_c);
        int i = EmojiAddCustomDialogUI.f268385t;
        if (!emojiAddCustomDialogUI.isFinishing()) {
            emojiAddCustomDialogUI.f268394p = C76879j.m92723Q(emojiAddCustomDialogUI, emojiAddCustomDialogUI.getString(C0966R.string.a3h), string, true, true, new C93216u(emojiAddCustomDialogUI));
        }
    }
}
