package yw3;

import com.tencent.mapsdk.raster.model.TileOverlay;

/* renamed from: yw3.k */
public class C119020k implements TileOverlay {

    /* renamed from: a */
    public com.tencent.tencentmap.mapsdk.maps.model.TileOverlay f356483a;

    public C119020k(com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay) {
        this.f356483a = tileOverlay;
    }

    public void clearTileCache() {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay = this.f356483a;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public String getId() {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay = this.f356483a;
        if (tileOverlay == null) {
            return null;
        }
        return tileOverlay.getId();
    }

    public void reload() {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay = this.f356483a;
        if (tileOverlay != null) {
            tileOverlay.reload();
        }
    }

    public void remove() {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay = this.f356483a;
        if (tileOverlay != null) {
            tileOverlay.remove();
        }
    }

    public void setDiskCacheDir(String str) {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay = this.f356483a;
        if (tileOverlay != null) {
            tileOverlay.setDiskCacheDir(str);
        }
    }

    public void setZindex(int i) {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay = this.f356483a;
        if (tileOverlay != null) {
            tileOverlay.setZindex(i);
        }
    }
}
