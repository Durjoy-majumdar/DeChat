package yw3;

import com.tencent.mapsdk.raster.model.TileProvider;
import com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider;
import java.net.URL;

/* renamed from: yw3.l */
public class C119021l extends UrlTileProvider {

    /* renamed from: e */
    public final /* synthetic */ TileProvider f356484e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119021l(int i, int i2, TileProvider tileProvider) {
        super(i, i2);
        this.f356484e = tileProvider;
    }

    public URL getTileUrl(int i, int i2, int i3) {
        return ((com.tencent.mapsdk.raster.model.UrlTileProvider) this.f356484e).getTileUrl(i, i2, i3);
    }
}
