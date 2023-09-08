package yw3;

import com.tencent.mapsdk.raster.model.BitmapDescriptor;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Polyline;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* renamed from: yw3.f */
public class C119006f implements Polyline {

    /* renamed from: a */
    public com.tencent.tencentmap.mapsdk.maps.model.Polyline f356447a;

    public C119006f(com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline) {
        this.f356447a = polyline;
    }

    public void eraseTo(int i, LatLng latLng) {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f356447a;
        if (polyline != null) {
            polyline.eraseTo(i, C119023n.m167772f(latLng));
        }
    }

    public int getColor() {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f356447a;
        if (polyline != null) {
            return polyline.getColor();
        }
        return 0;
    }

    public String getId() {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f356447a;
        if (polyline != null) {
            return polyline.getId();
        }
        return null;
    }

    public int getLevel() {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f356447a;
        if (polyline != null) {
            return polyline.getLevel();
        }
        return 0;
    }

    public List<LatLng> getPoints() {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f356447a;
        if (polyline != null) {
            return C119023n.m167768b(polyline.getPoints());
        }
        return null;
    }

    public float getWidth() {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f356447a;
        if (polyline != null) {
            return polyline.getWidth();
        }
        return 0.0f;
    }

    public float getZIndex() {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f356447a;
        if (polyline != null) {
            return (float) polyline.getZIndex();
        }
        return 0.0f;
    }

    public boolean isDottedLine() {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f356447a;
        return (polyline == null || polyline.getPattern() == null) ? false : true;
    }

    public boolean isGeodesic() {
        return false;
    }

    public boolean isVisible() {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f356447a;
        if (polyline != null) {
            return polyline.isVisible();
        }
        return false;
    }

    public void remove() {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f356447a;
        if (polyline != null) {
            polyline.remove();
        }
    }

    public void setColor(int i) {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f356447a;
        if (polyline != null) {
            polyline.setColor(i);
        }
    }

    public void setColorTexture(BitmapDescriptor bitmapDescriptor) {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f356447a;
        if (polyline != null) {
            polyline.setColorTexture(BitmapDescriptorFactory.fromBitmap(bitmapDescriptor.getBitmap()));
        }
    }

    public void setDottedLine(boolean z) {
    }

    public void setEraseable(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f356447a;
        if (polyline != null) {
            polyline.setEraseable(z);
        }
    }

    public void setGeodesic(boolean z) {
    }

    public void setLevel(int i) {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f356447a;
        if (polyline != null) {
            polyline.setLevel(i);
        }
    }

    public void setPoints(List<LatLng> list) {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f356447a;
        if (polyline != null) {
            polyline.setPoints(C119023n.m167773g(list));
        }
    }

    public void setVisible(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f356447a;
        if (polyline != null) {
            polyline.setVisible(z);
        }
    }

    public void setWidth(float f) {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f356447a;
        if (polyline != null) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            polyline.setWidth(f);
        }
    }

    public void setZIndex(float f) {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f356447a;
        if (polyline != null) {
            polyline.setZIndex((int) f);
        }
    }
}
