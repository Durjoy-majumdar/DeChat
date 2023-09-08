package com.tencent.p014mm.p136ui.widget.cropview;

import android.graphics.Bitmap;

/* renamed from: com.tencent.mm.ui.widget.cropview.a */
public final class C97283a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RoundCropLayout f285545d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f285546e;

    public C97283a(RoundCropLayout roundCropLayout, Bitmap bitmap) {
        this.f285545d = roundCropLayout;
        this.f285546e = bitmap;
    }

    public final void run() {
        this.f285545d.setBitmap(this.f285546e);
    }
}
