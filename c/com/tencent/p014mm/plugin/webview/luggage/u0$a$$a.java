package com.tencent.p014mm.plugin.webview.luggage;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: com.tencent.mm.plugin.webview.luggage.u0$a$$a */
public final /* synthetic */ class u0$a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageView f22262d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f22263e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f22264f;

    public /* synthetic */ u0$a$$a(ImageView imageView, ImageView imageView2, Bitmap bitmap) {
        this.f22262d = imageView;
        this.f22263e = imageView2;
        this.f22264f = bitmap;
    }

    public final void run() {
        ImageView imageView = this.f22262d;
        ImageView imageView2 = this.f22263e;
        Bitmap bitmap = this.f22264f;
        imageView.setVisibility(8);
        imageView2.setImageBitmap(bitmap);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
    }
}
