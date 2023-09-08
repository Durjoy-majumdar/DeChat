package com.tencent.p014mm.plugin.fav.p047ui;

import android.view.MenuItem;
import gy3.C87412m;
import p525fr.C97951d;

/* renamed from: com.tencent.mm.plugin.fav.ui.f0 */
public final class C93593f0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FavFinderFilterUI f270266d;

    public C93593f0(FavFinderFilterUI favFinderFilterUI) {
        this.f270266d = favFinderFilterUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        FavFinderFilterUI favFinderFilterUI = this.f270266d;
        int i = FavFinderFilterUI.f269710o;
        if (favFinderFilterUI.mo128271I7().f292545d) {
            C97951d dVar = this.f270266d.f269713f;
            if (dVar != null) {
                dVar.mo79143q();
                this.f270266d.mo128271I7().mo139191c3();
                return true;
            }
            C87412m.m108603p("mGlobalFavFragment");
            throw null;
        }
        this.f270266d.finish();
        return true;
    }
}
