package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.graphics.Bitmap;
import android.os.Build;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C115249m;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.h1 */
public class C1734h1 extends C82268c {
    private static final int CTRL_INDEX = 528;
    private static final String NAME = "compressImage";

    /* renamed from: w */
    public static Bitmap m1786w(Bitmap bitmap, float f, float f2) {
        float f3;
        float f4;
        if (f <= 0.0f && f2 <= 0.0f) {
            return bitmap;
        }
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        Log.m105925i("MicroMsg.JsApiCompressImage.javayhu", "scaleTheBitmap srcWidth:%f srcHeight:%f targetCompressWidth:%f targetCompressHeight:%f", Float.valueOf(width), Float.valueOf(height), Float.valueOf(f), Float.valueOf(f2));
        if (width <= 0.0f || height <= 0.0f) {
            return bitmap;
        }
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i <= 0 || f2 <= 0.0f) {
            f4 = i > 0 ? f / width : f2 / height;
            f3 = f4;
        } else {
            f4 = f / width;
            f3 = f2 / height;
        }
        Log.m105925i("MicroMsg.JsApiCompressImage.javayhu", "scaleTheBitmap widthScale:%f heightScale:%f", Float.valueOf(f4), Float.valueOf(f3));
        try {
            Bitmap scaleBitmap = BitmapUtil.scaleBitmap(bitmap, f4, f3);
            Log.m105925i("MicroMsg.JsApiCompressImage.javayhu", "scaleTheBitmap scaledBitmap width:%d height:%d", Integer.valueOf(scaleBitmap.getWidth()), Integer.valueOf(scaleBitmap.getHeight()));
            return scaleBitmap;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiCompressImage.javayhu", "scaleTheBitmap %s", e);
            return bitmap;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        h1$$a h1__a = new h1$$a(this, fVar, jSONObject, i);
        C115249m.C1742c cVar = (C115249m.C1742c) fVar.mo109668l(C115249m.C1742c.class);
        if (cVar == null || Build.VERSION.SDK_INT >= 29) {
            Log.m105929w("MicroMsg.JsApiCompressImage.javayhu", "NULL permissionInterface with appId:%s, run directly", fVar.getAppId());
            h1__a.run();
            return;
        }
        cVar.mo1729Ed(fVar.getContext(), fVar, h1__a, new h1$$b(this, fVar, i));
    }
}
