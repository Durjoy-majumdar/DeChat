package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.emoji.ui.y0 */
public class C93275y0 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreTopicUI f269119d;

    public C93275y0(EmojiStoreTopicUI emojiStoreTopicUI) {
        this.f269119d = emojiStoreTopicUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107144g(1001, this.f269119d.getString(C0966R.string.c7w), C0966R.raw.bottomsheet_icon_transmit);
        e0Var.mo107144g(1000, this.f269119d.getString(C0966R.string.c7x), C0966R.raw.bottomsheet_icon_moment);
    }
}
