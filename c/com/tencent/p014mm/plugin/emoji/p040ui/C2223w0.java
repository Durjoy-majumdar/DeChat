package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.emoji.ui.w0 */
public class C2223w0 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreDetailUI f12275d;

    public C2223w0(EmojiStoreDetailUI emojiStoreDetailUI) {
        this.f12275d = emojiStoreDetailUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107144g(1001, this.f12275d.getString(C0966R.string.c7w), C0966R.raw.bottomsheet_icon_transmit);
        e0Var.mo107144g(1000, this.f12275d.getString(C0966R.string.c7x), C0966R.raw.bottomsheet_icon_moment);
    }
}
