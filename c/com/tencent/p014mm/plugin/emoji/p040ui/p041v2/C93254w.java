package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.LabelContainerView;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.w */
public class C93254w implements LabelContainerView.C74390a {

    /* renamed from: a */
    public final /* synthetic */ EmojiStoreV2SingleProductUI f268969a;

    public C93254w(EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f268969a = emojiStoreV2SingleProductUI;
    }

    /* renamed from: a */
    public void mo103375a() {
        LabelContainerView labelContainerView = this.f268969a.f268894I;
        if (labelContainerView != null) {
            labelContainerView.clearFocus();
        }
        this.f268969a.f268894I.requestFocus();
        this.f268969a.f268894I.setVisibility(8);
        EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f268969a;
        emojiStoreV2SingleProductUI.showOptionMenu(1001, emojiStoreV2SingleProductUI.f268887B);
        this.f268969a.setMMTitle((int) C0966R.string.c98);
    }

    /* renamed from: b */
    public void mo103376b() {
        this.f268969a.hideVKB();
    }
}
