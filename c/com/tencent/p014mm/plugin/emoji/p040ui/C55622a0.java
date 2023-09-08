package com.tencent.p014mm.plugin.emoji.p040ui;

import java.util.List;
import n61.C100078b;
import te3.C101824o80;

/* renamed from: com.tencent.mm.plugin.emoji.ui.a0 */
public final class C55622a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f158320d;

    /* renamed from: e */
    public final /* synthetic */ EmojiDesignerIPInfoUI f158321e;

    /* renamed from: f */
    public final /* synthetic */ List<C101824o80> f158322f;

    public C55622a0(boolean z, EmojiDesignerIPInfoUI emojiDesignerIPInfoUI, List<? extends C101824o80> list) {
        this.f158320d = z;
        this.f158321e = emojiDesignerIPInfoUI;
        this.f158322f = list;
    }

    public final void run() {
        if (this.f158320d) {
            C100078b bVar = this.f158321e.f268476o;
            bVar.f293190f.clear();
            bVar.notifyDataSetChanged();
        }
        List<C101824o80> list = this.f158322f;
        if (list != null) {
            C100078b bVar2 = this.f158321e.f268476o;
            bVar2.getClass();
            int size = bVar2.f293190f.size();
            bVar2.f293190f.addAll(list);
            bVar2.notifyItemRangeInserted(size, list.size());
        }
    }
}
