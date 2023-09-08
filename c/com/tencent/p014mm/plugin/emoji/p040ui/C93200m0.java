package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.emoji.ui.m0 */
public class C93200m0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiSortFragment f268761d;

    public C93200m0(EmojiSortFragment emojiSortFragment) {
        this.f268761d = emojiSortFragment;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f268761d.f268543g != null) {
            C86709a0.m107529k().f251779b.mo123458d(this.f268761d.f268543g);
        }
    }
}
