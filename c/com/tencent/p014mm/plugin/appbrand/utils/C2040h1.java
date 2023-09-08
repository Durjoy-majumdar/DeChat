package com.tencent.p014mm.plugin.appbrand.utils;

import a14.C53916l;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import js0.C9515s;
import kotlin.Result;
import kotlin.ResultKt;
import lb0.C88394b;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.h1 */
public final class C2040h1 implements C88394b.C88411m {

    /* renamed from: d */
    public final /* synthetic */ String f11987d;

    /* renamed from: e */
    public final /* synthetic */ C53916l<Bitmap> f11988e;

    public C2040h1(String str, C53916l<? super Bitmap> lVar) {
        this.f11987d = str;
        this.f11988e = lVar;
    }

    /* renamed from: b */
    public void mo1907b() {
        Log.m105918d("MicroMsg.AppBrand.IconAttacher", "onLoadFailed, iconUrl: " + this.f11987d);
        C53916l<Bitmap> lVar = this.f11988e;
        Result.Companion companion = Result.Companion;
        lVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new IOException("Load fail"))));
    }

    /* renamed from: d */
    public void mo1908d() {
        Log.m105918d("MicroMsg.AppBrand.IconAttacher", "beforeLoadBitmap, iconUrl: " + this.f11987d);
    }

    public String key() {
        return C9515s.m9209a(this);
    }

    public void onBitmapLoaded(Bitmap bitmap) {
        Log.m105918d("MicroMsg.AppBrand.IconAttacher", "onBitmapLoaded, iconUrl: " + this.f11987d);
        if (bitmap == null) {
            Log.m105928w("MicroMsg.AppBrand.IconAttacher", "onBitmapLoaded, bitmap is null");
            C53916l<Bitmap> lVar = this.f11988e;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new IOException("Unexpected null bitmap"))));
            return;
        }
        this.f11988e.resumeWith(Result.m168114constructorimpl(bitmap));
    }
}
