package com.davemorrissey.labs.subscaleview.decoder;

public class ImageDecodeResult {
    public static final int DECODE_BITMAP_FAILED = 2;
    public static final int DECODE_BITMAP_OOM_ERROR = 3;
    public static final int DECODE_COPY_BITMAP_OOM_ERROR = 7;
    public static final int DECODE_FILE_NOT_FOUND = 1;
    public static final int DECODE_TILE_FAILED = 5;
    public static final int DECODE_TILE_INIT_FAILED = 4;
    public static final int DECODE_TILE_OOM_ERROR = 6;

    /* renamed from: OK */
    public static final int f264604OK = 0;
    public int errCode;
    public String errMsg;

    public ImageDecodeResult(int i, String str) {
        this.errCode = i;
        this.errMsg = str;
    }

    public String toString() {
        return String.format("ImageDecodeResult{errCode: %d, errMsg: %s}", new Object[]{Integer.valueOf(this.errCode), this.errMsg});
    }
}
