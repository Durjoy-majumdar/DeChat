package com.github.henryye.nativeiv.bitmap;

public class NativeBitmapStruct {
    public int glFormat;
    public int glType;
    public int height;
    public long ptr;
    public int width;

    public interface GLFormat {
        public static final int GL_ALPHA = 6406;
        public static final int GL_RGB = 6407;
        public static final int GL_RGBA = 6408;
    }

    public interface GLType {
        public static final int GL_UNSIGNED_BYTE = 5121;
        public static final int GL_UNSIGNED_SHORT_4_4_4_4 = 32819;
        public static final int GL_UNSIGNED_SHORT_5_5_5_1 = 32820;
        public static final int GL_UNSIGNED_SHORT_5_6_5 = 33635;
    }
}
