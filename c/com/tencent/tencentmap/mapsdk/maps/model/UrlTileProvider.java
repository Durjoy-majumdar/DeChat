package com.tencent.tencentmap.mapsdk.maps.model;

import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.exception.NetErrorException;
import java.net.URL;

public abstract class UrlTileProvider implements TileProvider {
    private static final boolean DEBUG = false;
    private static final String TAG = "UrlTileProvider";
    private final int mHeight;
    private final int mWidth;

    public UrlTileProvider() {
        this(256, 256);
    }

    public final Tile getTile(int i, int i2, int i3) {
        byte[] bArr;
        URL tileUrl = getTileUrl(i, i2, i3);
        Tile tile = TileProvider.NO_TILE;
        if (tileUrl == null) {
            return tile;
        }
        NetResponse requestTileData = requestTileData(tileUrl.toString());
        if (requestTileData == null) {
            bArr = null;
        } else if (!requestTileData.available()) {
            return requestTileData.exception instanceof NetErrorException ? requestTileData.statusCode == 404 ? tile : new Tile(this.mWidth, this.mHeight, (byte[]) null) : new Tile(this.mWidth, this.mHeight, (byte[]) null);
        } else {
            bArr = requestTileData.data;
        }
        Tile tile2 = (bArr == null || bArr.length == 0) ? tile : new Tile(this.mWidth, this.mHeight, bArr);
        return tile2.equals(tile) ? new Tile(this.mWidth, this.mHeight, (byte[]) null) : tile2;
    }

    public abstract URL getTileUrl(int i, int i2, int i3);

    public NetResponse requestTileData(String str) {
        try {
            return NetManager.getInstance().builder().url(str).doGet();
        } catch (Exception unused) {
            return null;
        }
    }

    public UrlTileProvider(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
    }
}
