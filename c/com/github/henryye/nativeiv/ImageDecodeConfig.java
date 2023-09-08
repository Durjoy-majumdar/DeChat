package com.github.henryye.nativeiv;

import android.graphics.Bitmap;

public class ImageDecodeConfig {
    public Bitmap.Config mConfig = Bitmap.Config.ARGB_8888;
    public int mPreferredHeight = 0;
    public double mPreferredScale = 0.0d;
    public int mPreferredWidth = 0;
    public boolean mPremultiplyAlpha = true;
    public ReferrerPolicy mReferrerPolicy = ReferrerPolicy.NOT_SET;

    public enum ReferrerPolicy {
        NOT_SET,
        NO_REFERRER,
        ORIGIN
    }

    /* renamed from: com.github.henryye.nativeiv.ImageDecodeConfig$a */
    public static /* synthetic */ class C80185a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f234718a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f234719b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                com.github.henryye.nativeiv.ImageDecodeConfig$ReferrerPolicy[] r0 = com.github.henryye.nativeiv.ImageDecodeConfig.ReferrerPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f234719b = r0
                r1 = 1
                com.github.henryye.nativeiv.ImageDecodeConfig$ReferrerPolicy r2 = com.github.henryye.nativeiv.ImageDecodeConfig.ReferrerPolicy.NO_REFERRER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f234719b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.henryye.nativeiv.ImageDecodeConfig$ReferrerPolicy r3 = com.github.henryye.nativeiv.ImageDecodeConfig.ReferrerPolicy.ORIGIN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                android.graphics.Bitmap$Config[] r2 = android.graphics.Bitmap.Config.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f234718a = r2
                android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f234718a     // Catch:{ NoSuchFieldError -> 0x0038 }
                android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f234718a     // Catch:{ NoSuchFieldError -> 0x0043 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f234718a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.henryye.nativeiv.ImageDecodeConfig.C80185a.<clinit>():void");
        }
    }

    public static ImageDecodeConfig createConfig(Bitmap.Config config, boolean z) {
        ImageDecodeConfig imageDecodeConfig = new ImageDecodeConfig();
        imageDecodeConfig.mPremultiplyAlpha = z;
        imageDecodeConfig.mConfig = config;
        return imageDecodeConfig;
    }

    public int getNativeConfig() {
        int i = C80185a.f234718a[this.mConfig.ordinal()];
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 1 : 8;
        }
        return 7;
    }

    public int getNativeReferrerPolicy() {
        int i = C80185a.f234719b[this.mReferrerPolicy.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public String toString() {
        return "ImageDecodeConfig{mConfig=" + this.mConfig + ", mPremultiplyAlpha=" + this.mPremultiplyAlpha + ", mReferrerPolicy=" + this.mReferrerPolicy + ", mPreferredWidth=" + this.mPreferredWidth + ", mPreferredHeight=" + this.mPreferredHeight + ", mPreferredScale=" + this.mPreferredScale + '}';
    }

    public static Object createConfig(int i, boolean z, int i2, int i3, int i4, double d) {
        ImageDecodeConfig imageDecodeConfig = new ImageDecodeConfig();
        imageDecodeConfig.mPremultiplyAlpha = z;
        if (i == 8) {
            imageDecodeConfig.mConfig = Bitmap.Config.ALPHA_8;
        } else if (i == 4) {
            imageDecodeConfig.mConfig = Bitmap.Config.RGB_565;
        } else if (i == 7) {
            imageDecodeConfig.mConfig = Bitmap.Config.ARGB_4444;
        } else if (i == 1) {
            imageDecodeConfig.mConfig = Bitmap.Config.ARGB_8888;
        } else {
            imageDecodeConfig.mConfig = Bitmap.Config.ARGB_8888;
        }
        if (i2 == 0) {
            imageDecodeConfig.mReferrerPolicy = ReferrerPolicy.NOT_SET;
        } else if (i2 == 1) {
            imageDecodeConfig.mReferrerPolicy = ReferrerPolicy.NO_REFERRER;
        } else if (i2 == 2) {
            imageDecodeConfig.mReferrerPolicy = ReferrerPolicy.ORIGIN;
        }
        imageDecodeConfig.mPreferredWidth = i3;
        imageDecodeConfig.mPreferredHeight = i4;
        imageDecodeConfig.mPreferredScale = d;
        return imageDecodeConfig;
    }
}
