package com.tencent.p014mm.plugin.fav.p047ui;

import com.tencent.p014mm.plugin.fav.p047ui.FavSearchUI;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.C68901b;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.fav.ui.c1 */
public class C93494c1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f270004d;

    /* renamed from: e */
    public final /* synthetic */ List f270005e;

    /* renamed from: f */
    public final /* synthetic */ List f270006f;

    /* renamed from: g */
    public final /* synthetic */ FavSearchUI.C93448i f270007g;

    public C93494c1(FavSearchUI.C93448i iVar, List list, List list2, List list3) {
        this.f270007g = iVar;
        this.f270004d = list;
        this.f270005e = list2;
        this.f270006f = list3;
    }

    public void run() {
        if (this.f270004d.isEmpty() && this.f270005e.isEmpty()) {
            FavSearchUI favSearchUI = FavSearchUI.this;
            int i = FavSearchUI.f269788N;
            if (favSearchUI.mo128301Q7()) {
                FavSearchUI.m118040H7(FavSearchUI.this, false);
                FavSearchUI.m118041I7(FavSearchUI.this, this.f270004d, this.f270005e);
                return;
            }
        }
        FavSearchUI.m118041I7(FavSearchUI.this, this.f270004d, this.f270005e);
        Log.m105919d("MicroMsg.FavSearchUI", "on text changed, types %s keys %s tags %s", this.f270006f, this.f270004d, this.f270005e);
        FavSearchUI favSearchUI2 = FavSearchUI.this;
        favSearchUI2.f269819x = this.f270004d;
        List<String> list = this.f270005e;
        favSearchUI2.f269820y = list;
        favSearchUI2.f269818w = this.f270006f;
        C68901b bVar = favSearchUI2.f269810o;
        ((HashSet) bVar.f198003g).clear();
        if (list != null) {
            bVar.f198003g.addAll(list);
        }
        FavSearchUI.this.f269809n.mo128370d(this.f270006f, this.f270004d, this.f270005e);
        FavSearchUI.m118042J7(FavSearchUI.this, false);
    }
}
