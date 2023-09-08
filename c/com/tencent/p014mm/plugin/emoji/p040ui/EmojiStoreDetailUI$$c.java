package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI$$c */
public class EmojiStoreDetailUI$$c implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreDetailUI f268644d;

    public EmojiStoreDetailUI$$c(EmojiStoreDetailUI emojiStoreDetailUI) {
        this.f268644d = emojiStoreDetailUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107529k().f251779b.mo123458d(this.f268644d.f268619q);
        this.f268644d.f268554A.setText(C0966R.string.f360087a11);
        this.f268644d.mo127739K7();
    }
}
