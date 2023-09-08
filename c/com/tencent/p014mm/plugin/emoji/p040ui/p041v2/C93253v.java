package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2SingleProductUI;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.v */
public class C93253v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2SingleProductUI.C932422 f268968d;

    public C93253v(EmojiStoreV2SingleProductUI.C932422 r1) {
        this.f268968d = r1;
    }

    public void run() {
        EmojiStoreV2SingleProductUI.this.f268921w.notifyDataSetInvalidated();
    }
}
