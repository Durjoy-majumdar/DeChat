package com.tencent.p014mm.plugin.fav.p047ui.detail;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.e */
public class C93560e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ float f270211d;

    /* renamed from: e */
    public final /* synthetic */ String f270212e;

    /* renamed from: f */
    public final /* synthetic */ FavoriteFileDetailUI f270213f;

    public C93560e(FavoriteFileDetailUI favoriteFileDetailUI, float f, String str) {
        this.f270213f = favoriteFileDetailUI;
        this.f270211d = f;
        this.f270212e = str;
    }

    public void run() {
        this.f270213f.f270068s.setProgress((int) this.f270211d);
        this.f270213f.f270069t.setText(this.f270212e);
    }
}
