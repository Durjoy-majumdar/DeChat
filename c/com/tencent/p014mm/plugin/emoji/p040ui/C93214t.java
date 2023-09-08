package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.emoji.ui.t */
public class C93214t implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiAddCustomDialogUI f268776d;

    public C93214t(EmojiAddCustomDialogUI emojiAddCustomDialogUI) {
        this.f268776d = emojiAddCustomDialogUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f268776d.setResult(2);
        this.f268776d.finish();
    }
}
