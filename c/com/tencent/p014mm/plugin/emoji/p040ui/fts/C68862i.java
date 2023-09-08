package com.tencent.p014mm.plugin.emoji.p040ui.fts;

import java.util.List;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.emoji.ui.fts.i */
public class C68862i implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ List f197865d;

    /* renamed from: e */
    public final /* synthetic */ List f197866e;

    public C68862i(FTSEmojiDetailPageUI fTSEmojiDetailPageUI, List list, List list2) {
        this.f197865d = list;
        this.f197866e = list2;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.setHeaderTitle((CharSequence) "");
        for (int i = 0; i < this.f197865d.size(); i++) {
            e0Var.mo107142f(((Integer) this.f197865d.get(i)).intValue(), (CharSequence) this.f197866e.get(i));
        }
    }
}
