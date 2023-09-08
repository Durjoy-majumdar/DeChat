package com.tencent.p014mm.plugin.appbrand.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C9515s;
import lb0.C88394b;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.e1 */
public final class C2035e1 implements C88394b.C88411m {

    /* renamed from: d */
    public final /* synthetic */ String f11980d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f11981e;

    public C2035e1(String str, ImageView imageView) {
        this.f11980d = str;
        this.f11981e = imageView;
    }

    /* renamed from: b */
    public void mo1907b() {
        Log.m105918d("MicroMsg.AppBrand.IconAttacher", "onLoadFailed, iconUrl: " + this.f11980d);
    }

    /* renamed from: d */
    public void mo1908d() {
        Log.m105918d("MicroMsg.AppBrand.IconAttacher", "beforeLoadBitmap, iconUrl: " + this.f11980d);
    }

    public String key() {
        return C9515s.m9209a(this);
    }

    public void onBitmapLoaded(Bitmap bitmap) {
        Log.m105918d("MicroMsg.AppBrand.IconAttacher", "onBitmapLoaded, iconUrl: " + this.f11980d);
        if (bitmap == null) {
            Log.m105928w("MicroMsg.AppBrand.IconAttacher", "onBitmapLoaded, bitmap is null");
        } else {
            this.f11981e.setImageBitmap(bitmap);
        }
    }
}
