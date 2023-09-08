package com.tencent.liteav.videobase.base;

public interface GLConstants {

    /* renamed from: a */
    public static final float[] f309787a = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: b */
    public static final float[] f309788b = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: c */
    public static final float[] f309789c = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: d */
    public static final float[] f309790d = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: e */
    public static final float[] f309791e = {1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: f */
    public static final float[] f309792f = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: g */
    public static final float[] f309793g = {1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};

    public enum MirrorMode {
        AUTO(0),
        ENABLE(1),
        DISABLE(2);
        

        /* renamed from: d */
        private static final MirrorMode[] f46482d = null;
        public int mValue;

        /* access modifiers changed from: public */
        static {
            f46482d = values();
        }

        private MirrorMode(int i) {
            this.mValue = i;
        }

        /* renamed from: a */
        public static MirrorMode m17041a(int i) {
            for (MirrorMode mirrorMode : f46482d) {
                if (mirrorMode.mValue == i) {
                    return mirrorMode;
                }
            }
            return AUTO;
        }
    }

    public enum Orientation {
        LANDSCAPE(0),
        PORTRAIT(1);
        

        /* renamed from: c */
        private static final Orientation[] f46486c = null;
        public int mValue;

        /* access modifiers changed from: public */
        static {
            f46486c = values();
        }

        private Orientation(int i) {
            this.mValue = i;
        }

        /* renamed from: a */
        public static Orientation m17042a(int i) {
            for (Orientation orientation : f46486c) {
                if (orientation.mValue == i) {
                    return orientation;
                }
            }
            return PORTRAIT;
        }
    }

    public enum PixelBufferType {
        BYTE_BUFFER(0),
        TEXTURE_2D(1),
        TEXTURE_OES(2),
        BYTE_ARRAY(3);
        

        /* renamed from: e */
        private static final PixelBufferType[] f46492e = null;
        public int mValue;

        /* access modifiers changed from: public */
        static {
            f46492e = values();
        }

        private PixelBufferType(int i) {
            this.mValue = i;
        }

        /* renamed from: a */
        public static PixelBufferType m17043a(int i) {
            for (PixelBufferType pixelBufferType : f46492e) {
                if (pixelBufferType.mValue == i) {
                    return pixelBufferType;
                }
            }
            return TEXTURE_2D;
        }
    }

    public enum PixelFormatType {
        I420(0),
        NV12(1),
        NV21(2),
        RGB(3),
        YUY2(4),
        RGBA(5),
        BGR(6),
        YV12(7),
        BGRA(8),
        ARGB(9),
        YUV422P(10),
        UYVY(11),
        YUYV(12),
        JPG(13),
        H264(14);
        

        /* renamed from: p */
        private static final PixelFormatType[] f46509p = null;
        private final int mJniValue;

        /* access modifiers changed from: public */
        static {
            f46509p = values();
        }

        private PixelFormatType(int i) {
            this.mJniValue = i;
        }

        /* renamed from: a */
        public static PixelFormatType m17044a(int i) {
            for (PixelFormatType pixelFormatType : f46509p) {
                if (pixelFormatType.mJniValue == i) {
                    return pixelFormatType;
                }
            }
            return null;
        }

        public final int getValue() {
            return this.mJniValue;
        }
    }

    public enum GLScaleType {
        CENTER_CROP(0),
        FIT_CENTER(1),
        FILL(2);
        

        /* renamed from: d */
        private static final GLScaleType[] f309797d = null;
        public int mValue;

        /* access modifiers changed from: public */
        static {
            f309797d = values();
        }

        private GLScaleType(int i) {
            this.mValue = i;
        }

        /* renamed from: a */
        public static GLScaleType m139835a(int i) {
            for (GLScaleType gLScaleType : f309797d) {
                if (gLScaleType.mValue == i) {
                    return gLScaleType;
                }
            }
            return FIT_CENTER;
        }
    }
}
