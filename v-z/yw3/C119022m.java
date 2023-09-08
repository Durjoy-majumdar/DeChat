package yw3;

import com.tencent.tencentmap.mapsdk.maps.model.Tile;
import com.tencent.tencentmap.mapsdk.maps.model.TileProvider;

/* renamed from: yw3.m */
public class C119022m implements TileProvider {

    /* renamed from: a */
    public final /* synthetic */ com.tencent.mapsdk.raster.model.TileProvider f356485a;

    public C119022m(com.tencent.mapsdk.raster.model.TileProvider tileProvider) {
        this.f356485a = tileProvider;
    }

    public Tile getTile(int i, int i2, int i3) {
        com.tencent.mapsdk.raster.model.Tile tile = this.f356485a.getTile(i, i2, i3);
        if (tile == null) {
            return null;
        }
        return new Tile(tile.mWidth, tile.mHeight, tile.mData);
    }
}
