package com.tencent.p014mm.plugin.emoji.p040ui.p319v3;

import java.util.List;
import n61.C100078b;
import te3.C101824o80;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.a */
public final class C55636a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f158343d;

    /* renamed from: e */
    public final /* synthetic */ EmojiStoreDesignerPackFragment f158344e;

    /* renamed from: f */
    public final /* synthetic */ List<C101824o80> f158345f;

    public C55636a(boolean z, EmojiStoreDesignerPackFragment emojiStoreDesignerPackFragment, List<? extends C101824o80> list) {
        this.f158343d = z;
        this.f158344e = emojiStoreDesignerPackFragment;
        this.f158345f = list;
    }

    public final void run() {
        if (this.f158343d) {
            C100078b bVar = this.f158344e.f268979j;
            bVar.f293190f.clear();
            bVar.notifyDataSetChanged();
        }
        List<C101824o80> list = this.f158345f;
        if (list != null) {
            C100078b bVar2 = this.f158344e.f268979j;
            bVar2.getClass();
            int size = bVar2.f293190f.size();
            bVar2.f293190f.addAll(list);
            bVar2.notifyItemRangeInserted(size, list.size());
        }
    }
}
