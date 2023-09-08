package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.InputStream;
import p224ra.C12964b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.l0 */
public interface C1737l0 extends C12964b {

    /* renamed from: j0 */
    public static final C1737l0 f11455j0 = new C1738a();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.l0$a */
    public class C1738a implements C1737l0 {
        /* renamed from: O0 */
        public Bitmap mo1725O0(InputStream inputStream) {
            return BitmapFactory.decodeStream(inputStream);
        }

        /* renamed from: jg */
        public Bitmap mo1726jg(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(inputStream, rect, options);
        }

        public Bitmap mf0(String str, BitmapFactory.Options options) {
            return BitmapFactory.decodeFile(str, options);
        }
    }

    /* renamed from: O0 */
    Bitmap mo1725O0(InputStream inputStream);

    /* renamed from: jg */
    Bitmap mo1726jg(InputStream inputStream, Rect rect, BitmapFactory.Options options);

    Bitmap mf0(String str, BitmapFactory.Options options);
}
