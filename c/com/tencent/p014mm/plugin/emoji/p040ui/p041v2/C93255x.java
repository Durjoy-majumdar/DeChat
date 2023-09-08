package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMTagPanel;
import com.tencent.p014mm.p136ui.contact.LabelContainerView;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.x */
public class C93255x implements MMTagPanel.C73201i {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2SingleProductUI f268970d;

    public C93255x(EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f268970d = emojiStoreV2SingleProductUI;
    }

    /* renamed from: a */
    public void mo94790a(String str) {
    }

    /* renamed from: b */
    public void mo94791b(String str) {
    }

    /* renamed from: d */
    public void mo94792d(String str) {
        if (!Util.isNullOrNil(this.f268970d.f268893H) && !Util.isNullOrNil(str) && str.equals(this.f268970d.f268893H)) {
            EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f268970d;
            emojiStoreV2SingleProductUI.f268895J.mo101814r(emojiStoreV2SingleProductUI.f268893H, true);
        }
    }

    /* renamed from: g */
    public void mo94794g() {
    }

    /* renamed from: h */
    public void mo94799h(String str) {
    }

    /* renamed from: i */
    public void mo94800i(String str) {
        EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f268970d;
        int i = EmojiStoreV2SingleProductUI.f268885U;
        emojiStoreV2SingleProductUI.setMMTitle((int) C0966R.string.c98);
        emojiStoreV2SingleProductUI.showOptionMenu(1001, emojiStoreV2SingleProductUI.f268887B);
        HashMap<String, Integer> hashMap = emojiStoreV2SingleProductUI.f268896K;
        if (hashMap == null || !hashMap.containsKey(str)) {
            emojiStoreV2SingleProductUI.f268890E = null;
            emojiStoreV2SingleProductUI.f268891F = -1;
            emojiStoreV2SingleProductUI.f268893H = emojiStoreV2SingleProductUI.getString(C0966R.string.c_1);
            emojiStoreV2SingleProductUI.f268916r = 1;
            emojiStoreV2SingleProductUI.f268907f = 0;
            emojiStoreV2SingleProductUI.mo127858J7(emojiStoreV2SingleProductUI.f268890E);
            emojiStoreV2SingleProductUI.mo127862N7("");
        } else {
            emojiStoreV2SingleProductUI.f268891F = -1;
            emojiStoreV2SingleProductUI.f268893H = str;
            emojiStoreV2SingleProductUI.f268916r = 4;
            emojiStoreV2SingleProductUI.f268907f = emojiStoreV2SingleProductUI.f268896K.get(str).intValue();
            emojiStoreV2SingleProductUI.mo127858J7((byte[]) null);
            emojiStoreV2SingleProductUI.mo127862N7(str);
        }
        LabelContainerView labelContainerView = emojiStoreV2SingleProductUI.f268894I;
        if (labelContainerView != null) {
            labelContainerView.setVisibility(8);
        }
    }

    /* renamed from: j */
    public void mo94801j(boolean z, int i) {
    }
}
