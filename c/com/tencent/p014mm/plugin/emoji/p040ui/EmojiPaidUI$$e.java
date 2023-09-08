package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.C41053r;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import java.util.List;
import nj3.C76912y0;
import ob0.C89132b;
import qo3.C77426q;
import qo3.C89779i0;
import te3.C101824o80;
import x51.C102562g;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI$$e */
public final /* synthetic */ class EmojiPaidUI$$e implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ EmojiPaidUI f110580a;

    /* renamed from: b */
    public final /* synthetic */ C101824o80 f110581b;

    /* renamed from: c */
    public final /* synthetic */ C89779i0 f110582c;

    /* renamed from: d */
    public final /* synthetic */ int f110583d;

    public /* synthetic */ EmojiPaidUI$$e(EmojiPaidUI emojiPaidUI, C101824o80 o802, C89779i0 i0Var, int i) {
        this.f110580a = emojiPaidUI;
        this.f110581b = o802;
        this.f110582c = i0Var;
        this.f110583d = i;
    }

    public final Object call(Object obj) {
        EmojiPaidUI emojiPaidUI = this.f110580a;
        C101824o80 o802 = this.f110581b;
        C89779i0 i0Var = this.f110582c;
        int i = this.f110583d;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i2 = EmojiPaidUI.f268517K;
        emojiPaidUI.getClass();
        int i3 = cVar.f256793a;
        int i4 = cVar.f256794b;
        Log.m105925i("MicroMsg.emoji.EmojiPaidUI", "delete %s, errType:%s, errCode:%s", o802.f298994d, Integer.valueOf(i3), Integer.valueOf(i4));
        i0Var.dismiss();
        if (i3 == 0 && i4 == 0) {
            C41053r rVar = emojiPaidUI.f268300y;
            if (rVar != null) {
                List<C102562g> list = rVar.f110540b;
                if (list != null && i >= 0 && list.size() > i) {
                    rVar.f110540b.remove(i);
                }
                emojiPaidUI.mo127644M7(true, emojiPaidUI.f268300y, false, false);
            }
            C76912y0.m92768g(emojiPaidUI, emojiPaidUI.getString(C0966R.string.f8055bw));
            return null;
        }
        C77426q qVar = new C77426q(emojiPaidUI);
        qVar.mo107595g(emojiPaidUI.getString(C0966R.string.f8056bx));
        qVar.mo107589a(true);
        qVar.mo107601m(C0966R.string.a18);
        qVar.mo107603o();
        return null;
    }
}
