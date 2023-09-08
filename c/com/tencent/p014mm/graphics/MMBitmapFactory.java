package com.tencent.p014mm.graphics;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.InputStream;

/* renamed from: com.tencent.mm.graphics.MMBitmapFactory */
public class MMBitmapFactory {

    /* renamed from: com.tencent.mm.graphics.MMBitmapFactory$Options */
    public static class Options extends BitmapFactory.Options {
        public boolean inUseSmoothSample = true;
    }

    /* renamed from: com.tencent.mm.graphics.MMBitmapFactory$a */
    public interface C80870a {
        void loadLibrary(String str);
    }

    /* renamed from: com.tencent.mm.graphics.MMBitmapFactory$b */
    public static abstract class C80871b {
    }

    /* renamed from: a */
    public static Bitmap m98732a(byte[] bArr, int i, int i2) {
        return MMBitmapFactoryImpl.getInstance().decodeByteArray(bArr, i, i2);
    }

    /* renamed from: b */
    public static Bitmap m98733b(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return MMBitmapFactoryImpl.getInstance().decodeByteArray(bArr, i, i2, options);
    }

    /* renamed from: c */
    public static Bitmap m98734c(String str) {
        return MMBitmapFactoryImpl.getInstance().decodeFile(str);
    }

    /* renamed from: d */
    public static Bitmap m98735d(String str, BitmapFactory.Options options) {
        return MMBitmapFactoryImpl.getInstance().decodeFile(str, options);
    }

    /* renamed from: e */
    public static Bitmap m98736e(Resources resources, int i) {
        return MMBitmapFactoryImpl.getInstance().decodeResource(resources, i);
    }

    /* renamed from: f */
    public static Bitmap m98737f(InputStream inputStream) {
        return MMBitmapFactoryImpl.getInstance().decodeStream(inputStream);
    }

    /* renamed from: g */
    public static Bitmap m98738g(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return MMBitmapFactoryImpl.getInstance().decodeStream(inputStream, rect, options);
    }

    /* renamed from: h */
    public static Bitmap m98739h(Bitmap bitmap) {
        return MMBitmapFactoryImpl.getInstance().pinBitmap(bitmap);
    }

    /* renamed from: i */
    public static void m98740i(C80875a aVar) {
        MMBitmapFactoryImpl.getInstance().setDecodeCanary(aVar);
    }

    /* renamed from: j */
    public static void m98741j(C80871b bVar) {
        MMBitmapFactoryImpl.getInstance().setStreamProvider(bVar);
    }
}
