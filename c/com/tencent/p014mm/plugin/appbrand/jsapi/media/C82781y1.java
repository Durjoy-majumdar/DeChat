package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import java.io.InputStream;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.y1 */
public class C82781y1 implements C1737l0 {

    /* renamed from: d */
    public static final C82781y1 f242137d = new C82781y1();

    /* renamed from: O0 */
    public Bitmap mo1725O0(InputStream inputStream) {
        return BitmapUtil.decodeStream(inputStream);
    }

    /* renamed from: jg */
    public Bitmap mo1726jg(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return MMBitmapFactory.m98738g(inputStream, rect, options);
    }

    public Bitmap mf0(String str, BitmapFactory.Options options) {
        return MMBitmapFactory.m98735d(str, options);
    }
}
