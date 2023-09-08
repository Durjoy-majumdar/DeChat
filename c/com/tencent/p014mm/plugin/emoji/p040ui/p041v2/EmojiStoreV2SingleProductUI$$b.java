package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.DialogInterface;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI$$b */
public class EmojiStoreV2SingleProductUI$$b implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2SingleProductUI f268927d;

    public EmojiStoreV2SingleProductUI$$b(EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f268927d = emojiStoreV2SingleProductUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f268927d.f268898M != null) {
            C86709a0.m107529k().f251779b.mo123458d(this.f268927d.f268898M);
        }
    }
}
