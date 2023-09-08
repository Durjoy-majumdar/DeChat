package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C30790w2;
import di3.C86312j;
import eb0.C75592q0;
import nj3.C76879j;
import p441aq.C92054g;
import qn3.C101208b;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$f */
public class EmojiCustomUI$$f implements C101208b.C101209a {

    /* renamed from: a */
    public final /* synthetic */ int f268445a;

    /* renamed from: b */
    public final /* synthetic */ String f268446b;

    /* renamed from: c */
    public final /* synthetic */ EmojiCustomUI f268447c;

    public EmojiCustomUI$$f(EmojiCustomUI emojiCustomUI, int i, String str) {
        this.f268447c = emojiCustomUI;
        this.f268445a = i;
        this.f268446b = str;
    }

    /* renamed from: a */
    public void mo127704a() {
        C76879j.m92711E(this.f268447c.getContext(), this.f268447c.getContext().getString(C0966R.string.c5m), "", this.f268447c.getContext().getString(C0966R.string.fmz), false, (DialogInterface.OnClickListener) null);
    }

    /* renamed from: b */
    public void mo127705b(C101208b bVar) {
        Class cls = C92054g.class;
        EmojiCustomUI emojiCustomUI = this.f268447c;
        if (emojiCustomUI.f268416E == null) {
            if (this.f268445a == 0) {
                ((C92054g) C86312j.m106911c(cls)).getClass();
                emojiCustomUI.f268416E = C30790w2.m39221h().mo57717d().mo142059kD(this.f268446b, "", 65, 1, bVar.f296349e, (String) null, (String) null, (String) null, "", 1);
            } else {
                ((C92054g) C86312j.m106911c(cls)).getClass();
                emojiCustomUI.f268416E = C30790w2.m39221h().mo57717d().mo142059kD(this.f268446b, "", 65, 2, bVar.f296349e, (String) null, (String) null, (String) null, "", 1);
            }
        }
        ((C92054g) C86312j.m106911c(cls)).xx0().mo138008O(this.f268447c.getContext(), this.f268447c.f268416E, 1, C75592q0.m90789s());
    }
}
