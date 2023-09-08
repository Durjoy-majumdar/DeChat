package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.C0966R;
import p171il.C98734m;
import p813fl.C97907h0;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$s */
public class EmojiCustomUI$$s extends C98734m.C98735a {

    /* renamed from: b */
    public final /* synthetic */ EmojiCustomUI f268457b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiCustomUI$$s(EmojiCustomUI emojiCustomUI, C98734m mVar) {
        super(mVar);
        this.f268457b = emojiCustomUI;
    }

    /* renamed from: c */
    public void mo127712c(C97907h0 h0Var) {
        super.mo127712c(h0Var);
        h0Var.mo127614a().size();
        EmojiCustomUI emojiCustomUI = this.f268457b;
        if (emojiCustomUI.f268417d == EmojiCustomUI$$u.EDIT) {
            return;
        }
        if (emojiCustomUI.f268432v == 0) {
            emojiCustomUI.setMMTitle(emojiCustomUI.getString(C0966R.string.c5o, new Object[]{Integer.valueOf(h0Var.getDataCount())}));
            return;
        }
        emojiCustomUI.setMMTitle(emojiCustomUI.getString(C0966R.string.f360363c51, new Object[]{Integer.valueOf(h0Var.getDataCount())}));
    }
}
