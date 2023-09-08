package com.github.henryye.nativeiv.api;

import android.graphics.Bitmap;
import com.github.henryye.nativeiv.ImageDecodeConfig;
import com.github.henryye.nativeiv.bitmap.BitmapType;
import com.github.henryye.nativeiv.bitmap.IBitmap;
import p1019p6.C89314a;
import p1030s6.C90132b;
import p673r6.C89880c;
import p673r6.C89881d;

public interface IImageDecodeService {

    /* renamed from: com.github.henryye.nativeiv.api.IImageDecodeService$a */
    public interface C80187a {
        /* renamed from: a */
        void mo111027a(C80188b bVar);

        /* renamed from: b */
        void mo111028b(int i, int i2);

        /* renamed from: c */
        IBitmap mo111029c(String str, Object obj, C90132b bVar, ImageDecodeConfig imageDecodeConfig);

        void destroy();

        void forceSetUseType(BitmapType bitmapType);

        boolean isDestroyed();
    }

    /* renamed from: com.github.henryye.nativeiv.api.IImageDecodeService$b */
    public interface C80188b {

        /* renamed from: com.github.henryye.nativeiv.api.IImageDecodeService$b$a */
        public enum C80189a {
            OK,
            NOT_EXIST,
            PRE_DECODE_ERROR,
            UNSUPPORTED_IMG_FORMAT,
            HUGE_SIZE,
            IO_ERROR,
            OUT_OF_MEMORY,
            LEGACY_MODE,
            NATIVE_DECODE_ERROR,
            THROW_EXCEPTION
        }

        /* renamed from: a */
        void mo109472a(String str, Object obj, C80190c cVar, ImageDecodeConfig imageDecodeConfig);

        /* renamed from: b */
        void mo109473b(String str, C80189a aVar, C89314a aVar2);
    }

    /* renamed from: com.github.henryye.nativeiv.api.IImageDecodeService$c */
    public interface C80190c {
    }

    void addDecodeEventListener(C80188b bVar);

    void addImageStreamFetcher(C90132b bVar, boolean z);

    String encodeToBase64(Bitmap bitmap, int i, float f);

    byte[] encodeToBuffer(Bitmap bitmap, int i, float f);

    void forceSetUseType(BitmapType bitmapType);

    Bitmap getBitmap(int i, int i2);

    void init();

    void loadBitmapAsync(Object obj, ImageDecodeConfig imageDecodeConfig);

    void loadBitmapAsync(String str);

    void loadBitmapAsync(String str, ImageDecodeConfig imageDecodeConfig);

    IBitmap loadBitmapSync(Object obj, ImageDecodeConfig imageDecodeConfig);

    IBitmap loadBitmapSync(String str);

    IBitmap loadBitmapSync(String str, ImageDecodeConfig imageDecodeConfig);

    void release();

    void releaseBitmap(Bitmap bitmap);

    void removeDecodeEventListener(C80188b bVar);

    void removeImageStreamFetcher(C90132b bVar, boolean z);

    void setBitmapDecodeSlave(C80187a aVar);

    void setIdKeyReportDelegate(C89880c cVar);

    void setKvReportDelegate(C89881d dVar);

    void setMaxDecodeDimension(int i, int i2);

    void setNetworkTimeout(int i, int i2);
}
