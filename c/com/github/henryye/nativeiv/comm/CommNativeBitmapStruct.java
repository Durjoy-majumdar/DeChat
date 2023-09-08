package com.github.henryye.nativeiv.comm;

import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;

class CommNativeBitmapStruct extends NativeBitmapStruct {
    private int nConfig = -1;
    private boolean premultiplyAlpha;

    public CommNativeBitmapStruct convertToCommonStruct() {
        int i = this.nConfig;
        int i2 = NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE;
        int i3 = 0;
        if (!(i == 4 || i == 3 || i == 2)) {
            i2 = 0;
        }
        this.glType = i2;
        if (i == 4) {
            i3 = NativeBitmapStruct.GLFormat.GL_RGBA;
        } else if (i == 3) {
            i3 = NativeBitmapStruct.GLFormat.GL_RGB;
        } else if (i == 2) {
            i3 = NativeBitmapStruct.GLFormat.GL_ALPHA;
        }
        this.glFormat = i3;
        return this;
    }
}
