package yw3;

import com.tencent.mapsdk.raster.model.CustomLayer;

/* renamed from: yw3.c */
public class C119003c implements CustomLayer {

    /* renamed from: a */
    public com.tencent.tencentmap.mapsdk.maps.model.CustomLayer f356442a;

    public C119003c(com.tencent.tencentmap.mapsdk.maps.model.CustomLayer customLayer) {
        this.f356442a = customLayer;
    }

    public void clearDiskCache() {
        com.tencent.tencentmap.mapsdk.maps.model.CustomLayer customLayer = this.f356442a;
        if (customLayer != null) {
            customLayer.clearDiskCache();
        }
    }

    public String getId() {
        com.tencent.tencentmap.mapsdk.maps.model.CustomLayer customLayer = this.f356442a;
        if (customLayer == null) {
            return null;
        }
        return customLayer.getId();
    }

    public void reload() {
        com.tencent.tencentmap.mapsdk.maps.model.CustomLayer customLayer = this.f356442a;
        if (customLayer != null) {
            customLayer.reload();
        }
    }

    public void remove() {
        com.tencent.tencentmap.mapsdk.maps.model.CustomLayer customLayer = this.f356442a;
        if (customLayer != null) {
            customLayer.remove();
        }
    }
}
