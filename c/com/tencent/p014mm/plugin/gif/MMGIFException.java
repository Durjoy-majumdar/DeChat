package com.tencent.p014mm.plugin.gif;

import java.io.IOException;

/* renamed from: com.tencent.mm.plugin.gif.MMGIFException */
public class MMGIFException extends IOException {
    public static final int D_GIF_ERR_CLOSE_FAILED = 110;
    public static final int D_GIF_ERR_DATA_TOO_BIG = 108;
    public static final int D_GIF_ERR_EOF_TOO_SOON = 113;
    public static final int D_GIF_ERR_IMAGE_DEFECT = 112;
    public static final int D_GIF_ERR_NOT_ENOUGH_MEM = 109;
    public static final int D_GIF_ERR_NOT_GIF_FILE = 103;
    public static final int D_GIF_ERR_NOT_READABLE = 111;
    public static final int D_GIF_ERR_NO_COLOR_MAP = 106;
    public static final int D_GIF_ERR_NO_IMAG_DSCR = 105;
    public static final int D_GIF_ERR_NO_SCRN_DSCR = 104;
    public static final int D_GIF_ERR_OPEN_FAILED = 101;
    public static final int D_GIF_ERR_READ_FAILED = 102;
    public static final int D_GIF_ERR_WRONG_RECORD = 107;
    private static final String TAG = "MicroMsg.GIF.MMGIFException";
    private static final long serialVersionUID = 1;
    private final int errorCode;

    public MMGIFException(int i) {
        super(TAG + i);
        this.errorCode = i;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
