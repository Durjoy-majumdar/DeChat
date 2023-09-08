package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI$$g */
public class EmojiAddCustomDialogUI$$g implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiAddCustomDialogUI f268406d;

    public EmojiAddCustomDialogUI$$g(EmojiAddCustomDialogUI emojiAddCustomDialogUI) {
        this.f268406d = emojiAddCustomDialogUI;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f268406d.setResult(3);
        this.f268406d.finish();
    }
}
