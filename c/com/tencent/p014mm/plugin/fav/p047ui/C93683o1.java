package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.Context;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.C41401c;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.C68901b;
import java.util.HashSet;

/* renamed from: com.tencent.mm.plugin.fav.ui.o1 */
public class C93683o1 extends C41401c {

    /* renamed from: h */
    public final /* synthetic */ FavTagEditUI f270471h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93683o1(FavTagEditUI favTagEditUI, Context context) {
        super(context);
        this.f270471h = favTagEditUI;
    }

    /* renamed from: a */
    public void mo64487a(String str) {
        this.f270471h.f269847g.mo95185d(str, true);
        C68901b bVar = this.f270471h.f269851n;
        ((HashSet) bVar.f198003g).add(str);
        bVar.notifyDataSetChanged();
        this.f270471h.f269847g.mo101801g();
        this.f270471h.f269847g.mo101800f();
        this.f270471h.mo128315H7();
    }
}
