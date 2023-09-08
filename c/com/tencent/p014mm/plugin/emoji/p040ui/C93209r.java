package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.emoji.ui.r */
public class C93209r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EmojiAddCustomDialogUI f268770d;

    public C93209r(EmojiAddCustomDialogUI emojiAddCustomDialogUI) {
        this.f268770d = emojiAddCustomDialogUI;
    }

    public void run() {
        C76879j.m92726T(this.f268770d.f268393o, MMApplicationContext.getContext().getString(C0966R.string.c4e));
    }
}
