package com.tencent.p014mm.plugin.fav.p047ui;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteImageServer$$h */
public final /* synthetic */ class FavoriteImageServer$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageView f158389d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f158390e;

    public /* synthetic */ FavoriteImageServer$$h(ImageView imageView, Bitmap bitmap) {
        this.f158389d = imageView;
        this.f158390e = bitmap;
    }

    public final void run() {
        this.f158389d.setImageBitmap(this.f158390e);
    }
}
