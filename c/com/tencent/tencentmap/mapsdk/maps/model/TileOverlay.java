package com.tencent.tencentmap.mapsdk.maps.model;

public interface TileOverlay extends IOverlay {
    void clearTileCache();

    String getId();

    void reload();

    void remove();

    void setDiskCacheDir(String str);

    void setZindex(int i);
}
