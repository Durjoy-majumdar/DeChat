package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: com.tencent.mm.plugin.emoji.ui.x */
public class C29876x implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiCustomUI f80950d;

    public C29876x(EmojiCustomUI emojiCustomUI) {
        this.f80950d = emojiCustomUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C115669n.INSTANCE.mo160131h(11595, 1, Integer.valueOf(this.f80950d.f268432v));
    }
}
