package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.p */
public final class C55634p implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2DesignerUI f158341d;

    public C55634p(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI) {
        this.f158341d = emojiStoreV2DesignerUI;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107144g(1001, this.f158341d.getString(C0966R.string.c7w), C0966R.raw.bottomsheet_icon_transmit);
        e0Var.mo107144g(1000, this.f158341d.getString(C0966R.string.c7x), C0966R.raw.bottomsheet_icon_moment);
    }
}
