package com.tencent.p014mm.plugin.fav.p047ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import pb1.C100734q;
import pb1.C100755z;
import te3.C101834rc0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteImageServer$$b */
public final /* synthetic */ class FavoriteImageServer$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f269884d;

    /* renamed from: e */
    public final /* synthetic */ int f269885e;

    /* renamed from: f */
    public final /* synthetic */ int f269886f;

    /* renamed from: g */
    public final /* synthetic */ boolean f269887g;

    /* renamed from: h */
    public final /* synthetic */ C100755z f269888h;

    /* renamed from: i */
    public final /* synthetic */ C101834rc0 f269889i;

    /* renamed from: j */
    public final /* synthetic */ ImageView f269890j;

    public /* synthetic */ FavoriteImageServer$$b(String str, int i, int i2, boolean z, C100755z zVar, C101834rc0 rc02, ImageView imageView) {
        this.f269884d = str;
        this.f269885e = i;
        this.f269886f = i2;
        this.f269887g = z;
        this.f269888h = zVar;
        this.f269889i = rc02;
        this.f269890j = imageView;
    }

    public final void run() {
        String str = this.f269884d;
        int i = this.f269885e;
        int i2 = this.f269886f;
        boolean z = this.f269887g;
        C100755z zVar = this.f269888h;
        C101834rc0 rc02 = this.f269889i;
        ImageView imageView = this.f269890j;
        Bitmap j = FavoriteImageServer.m118081j(str, i, i2, false);
        if (j != null) {
            String str2 = (String) imageView.getTag();
            if (str2 != null && str2.equals(str)) {
                ((C119157j) C119157j.f356862d).mo183895z(new FavoriteImageServer$$h(imageView, j));
            }
        } else if (z || FavoriteImageServer.m118082k(str)) {
            C100734q.m131857k0(zVar, rc02, true);
        }
    }
}
