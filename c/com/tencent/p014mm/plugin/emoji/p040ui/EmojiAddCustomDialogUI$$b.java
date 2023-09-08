package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI$$b */
public class EmojiAddCustomDialogUI$$b implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiAddCustomDialogUI f268400d;

    public EmojiAddCustomDialogUI$$b(EmojiAddCustomDialogUI emojiAddCustomDialogUI) {
        this.f268400d = emojiAddCustomDialogUI;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f268400d.setResult(1);
        this.f268400d.finish();
    }
}
