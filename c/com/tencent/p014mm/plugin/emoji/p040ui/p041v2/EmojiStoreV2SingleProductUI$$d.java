package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import com.tencent.p014mm.p136ui.base.MMPullDownView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI$$d */
public class EmojiStoreV2SingleProductUI$$d implements MMPullDownView.C73179f {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2SingleProductUI f268928d;

    public EmojiStoreV2SingleProductUI$$d(EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f268928d = emojiStoreV2SingleProductUI;
    }

    /* renamed from: C7 */
    public boolean mo64409C7() {
        Log.m105924i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "onBottom");
        EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f268928d;
        int i = EmojiStoreV2SingleProductUI.f268885U;
        if (!emojiStoreV2SingleProductUI.f268892G) {
            emojiStoreV2SingleProductUI.mo127858J7(emojiStoreV2SingleProductUI.f268890E);
            emojiStoreV2SingleProductUI.f268892G = true;
            emojiStoreV2SingleProductUI.f268901Q.sendEmptyMessageDelayed(1002, 200);
        }
        return true;
    }
}
