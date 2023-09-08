package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonStoreActionStruct;
import q61.C101038b;

/* renamed from: com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI$$a */
public final /* synthetic */ class BaseEmojiStoreUI$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BaseEmojiStoreUI f268303d;

    public /* synthetic */ BaseEmojiStoreUI$$a(BaseEmojiStoreUI baseEmojiStoreUI) {
        this.f268303d = baseEmojiStoreUI;
    }

    public final void run() {
        BaseEmojiStoreUI baseEmojiStoreUI = this.f268303d;
        baseEmojiStoreUI.f268279C = false;
        EmoticonStoreActionStruct O7 = baseEmojiStoreUI.mo127646O7(1, (C101038b) null);
        if (O7 != null) {
            O7.mo86054n();
        }
    }
}
