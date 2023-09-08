package com.tencent.p014mm.plugin.music.p080ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import lb0.C88394b;

/* renamed from: com.tencent.mm.plugin.music.ui.h */
public final class C4914h implements C88394b.C88411m {

    /* renamed from: d */
    public final /* synthetic */ FloatBallMusicViewNew f20039d;

    /* renamed from: e */
    public final /* synthetic */ String f20040e;

    public C4914h(FloatBallMusicViewNew floatBallMusicViewNew, String str) {
        this.f20039d = floatBallMusicViewNew;
        this.f20040e = str;
    }

    /* renamed from: b */
    public void mo1907b() {
        FloatBallMusicViewNew floatBallMusicViewNew = this.f20039d;
        int i = FloatBallMusicViewNew.f20026i;
        floatBallMusicViewNew.mo5831a();
    }

    /* renamed from: d */
    public void mo1908d() {
    }

    public String key() {
        return this.f20040e;
    }

    public void onBitmapLoaded(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            FloatBallMusicViewNew floatBallMusicViewNew = this.f20039d;
            int i = FloatBallMusicViewNew.f20026i;
            floatBallMusicViewNew.mo5831a();
            return;
        }
        FloatBallMusicViewNew floatBallMusicViewNew2 = this.f20039d;
        ImageView imageView = floatBallMusicViewNew2.f20027d;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = floatBallMusicViewNew2.f20027d;
        if (imageView2 != null) {
            imageView2.setPadding(0, 0, 0, 0);
        }
        ImageView imageView3 = floatBallMusicViewNew2.f20027d;
        if (imageView3 != null) {
            imageView3.setImageBitmap(bitmap);
        }
    }
}
