package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.u */
public class C93584u implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FavoriteVoiceDetailUI f270255d;

    public C93584u(FavoriteVoiceDetailUI favoriteVoiceDetailUI) {
        this.f270255d = favoriteVoiceDetailUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f270255d.finish();
        return true;
    }
}
