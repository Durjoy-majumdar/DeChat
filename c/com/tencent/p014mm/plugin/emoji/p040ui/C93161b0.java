package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.emoji.ui.b0 */
public final class C93161b0 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ EmojiDesignerIPInfoUI f268681d;

    public C93161b0(EmojiDesignerIPInfoUI emojiDesignerIPInfoUI) {
        this.f268681d = emojiDesignerIPInfoUI;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107144g(1001, this.f268681d.getString(C0966R.string.c7w), C0966R.raw.bottomsheet_icon_transmit);
        e0Var.mo107144g(1000, this.f268681d.getString(C0966R.string.c7x), C0966R.raw.bottomsheet_icon_moment);
    }
}
