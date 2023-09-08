package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI$$f */
public class EmojiAddCustomDialogUI$$f implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiAddCustomDialogUI f268405d;

    public EmojiAddCustomDialogUI$$f(EmojiAddCustomDialogUI emojiAddCustomDialogUI) {
        this.f268405d = emojiAddCustomDialogUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f268405d.setResult(3);
        this.f268405d.finish();
    }
}
