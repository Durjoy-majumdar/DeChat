package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.m */
public class C4693m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageView f19681d;

    /* renamed from: e */
    public final /* synthetic */ String f19682e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f19683f;

    public C4693m(C94154k kVar, ImageView imageView, String str, Bitmap bitmap) {
        this.f19681d = imageView;
        this.f19682e = str;
        this.f19683f = bitmap;
    }

    public void run() {
        Bitmap bitmap;
        if (this.f19681d.getTag() != null && this.f19681d.getTag().equals(this.f19682e) && (bitmap = this.f19683f) != null && !bitmap.isRecycled()) {
            this.f19681d.setImageBitmap(this.f19683f);
        }
    }
}
