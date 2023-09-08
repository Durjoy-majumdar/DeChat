package com.tencent.p014mm.plugin.emoji.p040ui.fts;

import c00.C92330r;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import p140cw.C7138g;
import p384tk.C101897a;
import p441aq.C92054g;

/* renamed from: com.tencent.mm.plugin.emoji.ui.fts.b */
public class C93180b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FTSEmojiDetailPageUI f268736d;

    public C93180b(FTSEmojiDetailPageUI fTSEmojiDetailPageUI) {
        this.f268736d = fTSEmojiDetailPageUI;
    }

    public void run() {
        Class cls = C7138g.class;
        FTSEmojiDetailPageUI fTSEmojiDetailPageUI = this.f268736d;
        ((C92330r) C86312j.m106911c(C92330r.class)).mo126126PR(fTSEmojiDetailPageUI.f268723u, fTSEmojiDetailPageUI.f268724v, fTSEmojiDetailPageUI.f268726x, 4, 0, 0, fTSEmojiDetailPageUI.f268725w);
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(this.f268736d.f268719q.getMd5());
        if (TO != null) {
            this.f268736d.f268719q = TO;
        }
        if (C101897a.m134075e().mo141392a(this.f268736d.f268719q)) {
            String str = this.f268736d.f268719q.mo62640K1() + "_decode";
            if (C86013q1.m106450k(str)) {
                C86013q1.m106447h(str);
            }
            C86013q1.m106444e(str);
            C86013q1.m106437S(str, C101897a.m134075e().mo126270A2(this.f268736d.f268719q));
            ((C7138g) C86312j.m106911c(cls)).he0(str, this.f268736d);
        } else if (C86013q1.m106450k(this.f268736d.f268721s)) {
            ((C7138g) C86312j.m106911c(cls)).he0(this.f268736d.f268721s, this.f268736d);
        }
    }
}
