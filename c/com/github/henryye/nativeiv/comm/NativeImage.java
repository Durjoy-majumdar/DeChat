package com.github.henryye.nativeiv.comm;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import com.github.henryye.nativeiv.ImageDecodeConfig;
import com.github.henryye.nativeiv.bitmap.BitmapType;
import com.github.henryye.nativeiv.bitmap.IBitmap;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p1024q6.C89482a;
import p1024q6.C89484c;
import p1037t6.C90375a;
import p673r6.C89876b;

class NativeImage implements IBitmap<NativeBitmapStruct> {
    private static final String TAG = "Ni.NativeImage";
    private C80191a factory;
    private NativeImageJni jni;
    private long lastDecodeUsing = -1;
    private NativeBitmapStruct mNativeBitmapStruct = null;

    public NativeImage(NativeImageJni nativeImageJni, C80191a aVar) {
        this.jni = nativeImageJni;
        this.factory = aVar;
        synchronized (this) {
            synchronized (aVar) {
                aVar.f234740b.put(Integer.valueOf(hashCode()), this);
            }
        }
    }

    public synchronized void decodeInputStream(InputStream inputStream, ImageDecodeConfig imageDecodeConfig, C89484c cVar) {
        if (this.factory != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (inputStream == null) {
                C89876b.f258326a.mo123906w(TAG, "hy: non stream, mark as request clear", new Object[0]);
                recycle();
            }
            ByteBuffer a = C90375a.m113171a(inputStream, false);
            Bitmap.Config config = imageDecodeConfig.mConfig;
            int i = 4;
            if (config != null) {
                if (config != Bitmap.Config.ARGB_8888) {
                    if (config != Bitmap.Config.ARGB_4444) {
                        if (config != Bitmap.Config.RGB_565) {
                            if (config == Bitmap.Config.ALPHA_8) {
                                i = 2;
                            }
                        }
                    }
                }
            }
            if (a != null) {
                try {
                    CommNativeBitmapStruct a2 = this.jni.mo111038a(a, i, imageDecodeConfig.mPremultiplyAlpha);
                    if (a2 != null) {
                        this.mNativeBitmapStruct = a2.convertToCommonStruct();
                    } else {
                        C89876b.m112384a(TAG, "hy: decode failed!!", new Object[0]);
                    }
                    a.clear();
                } finally {
                    this.lastDecodeUsing = SystemClock.elapsedRealtime() - elapsedRealtime;
                }
            } else {
                C89876b.f258326a.mo123906w(TAG, "hy: decode error!", new Object[0]);
                recycle();
                throw new IOException("decode error!");
            }
        }
    }

    public void decodeInputStreamRegion(InputStream inputStream, Rect rect, ImageDecodeConfig imageDecodeConfig, C89484c cVar) {
        throw new IOException("Stub!");
    }

    public synchronized C89482a<Integer> dump() {
        C89482a<Integer> aVar;
        aVar = new C89482a<>();
        NativeBitmapStruct nativeBitmapStruct = this.mNativeBitmapStruct;
        if (nativeBitmapStruct != null) {
            aVar.f257541a = nativeBitmapStruct.width;
            aVar.f257542b = nativeBitmapStruct.height;
            aVar.f257543c = true;
            aVar.f257544d = Integer.valueOf(nativeBitmapStruct.glFormat);
            aVar.f257545e = this.lastDecodeUsing;
        }
        return aVar;
    }

    public long getDecodeTime() {
        return this.lastDecodeUsing;
    }

    public BitmapType getType() {
        return BitmapType.Native;
    }

    public synchronized void recycle() {
        NativeBitmapStruct nativeBitmapStruct = this.mNativeBitmapStruct;
        if (nativeBitmapStruct != null) {
            long j = nativeBitmapStruct.ptr;
            if (j != -1) {
                this.jni.mo111041d(j);
                this.mNativeBitmapStruct = null;
            }
        }
        C80191a aVar = this.factory;
        if (aVar != null) {
            synchronized (aVar) {
                aVar.f234740b.remove(Integer.valueOf(hashCode()));
            }
            this.factory = null;
        }
    }

    public void forceSet(NativeBitmapStruct nativeBitmapStruct) {
        this.mNativeBitmapStruct = nativeBitmapStruct;
    }

    public NativeBitmapStruct provide() {
        return this.mNativeBitmapStruct;
    }
}
