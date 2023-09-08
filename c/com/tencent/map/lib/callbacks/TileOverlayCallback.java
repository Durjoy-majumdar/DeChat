package com.tencent.map.lib.callbacks;

import android.graphics.Bitmap;

public interface TileOverlayCallback {
    Bitmap onLoadTile(int i, int i2, int i3, byte[] bArr);

    void onLoadTileFinish(int i, int i2, int i3);

    void onWriteTile(int i, int i2, int i3, String str, byte[] bArr);
}
