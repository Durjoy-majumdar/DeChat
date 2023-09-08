package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j61.C46434a;
import nr3.C89059e;
import qo3.C89779i0;
import te3.C101824o80;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI$$d */
public final /* synthetic */ class EmojiPaidUI$$d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiPaidUI f110577d;

    /* renamed from: e */
    public final /* synthetic */ int f110578e;

    /* renamed from: f */
    public final /* synthetic */ C101824o80 f110579f;

    public /* synthetic */ EmojiPaidUI$$d(EmojiPaidUI emojiPaidUI, int i, C101824o80 o802) {
        this.f110577d = emojiPaidUI;
        this.f110578e = i;
        this.f110579f = o802;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EmojiPaidUI emojiPaidUI = this.f110577d;
        int i2 = this.f110578e;
        C101824o80 o802 = this.f110579f;
        int i3 = EmojiPaidUI.f268517K;
        C89779i0 e = C89779i0.m112248e(emojiPaidUI, emojiPaidUI.getString(C0966R.string.c5u), true, 0, (DialogInterface.OnCancelListener) null);
        String str = o802.f298994d;
        C87412m.m108594g(str, "productId");
        C89059e i4 = new C46434a(str, 1).mo9225i();
        i4.mo11397F(emojiPaidUI);
        i4.mo123420E(new EmojiPaidUI$$e(emojiPaidUI, o802, e, i2));
    }
}
