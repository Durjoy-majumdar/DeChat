package yw3;

import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Polygon;
import java.util.List;

/* renamed from: yw3.g */
public class C119007g implements Polygon {

    /* renamed from: a */
    public com.tencent.tencentmap.mapsdk.maps.model.Polygon f356448a;

    public C119007g(com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon) {
        this.f356448a = polygon;
    }

    public boolean contains(LatLng latLng) {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f356448a;
        if (polygon != null) {
            return polygon.contains(C119023n.m167772f(latLng));
        }
        return false;
    }

    public int getFillColor() {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f356448a;
        if (polygon != null) {
            return polygon.getFillColor();
        }
        return 0;
    }

    public String getId() {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f356448a;
        if (polygon != null) {
            return polygon.getId();
        }
        return null;
    }

    public int getLevel() {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f356448a;
        if (polygon != null) {
            return polygon.getLevel();
        }
        return 0;
    }

    public List<LatLng> getPoints() {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f356448a;
        if (polygon != null) {
            return C119023n.m167768b(polygon.getPoints());
        }
        return null;
    }

    public int getStrokeColor() {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f356448a;
        if (polygon != null) {
            return polygon.getStrokeColor();
        }
        return 0;
    }

    public float getStrokeWidth() {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f356448a;
        if (polygon != null) {
            return polygon.getStrokeWidth();
        }
        return 0.0f;
    }

    public float getZIndex() {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f356448a;
        if (polygon != null) {
            return (float) polygon.getZIndex();
        }
        return 0.0f;
    }

    public boolean isVisible() {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f356448a;
        if (polygon != null) {
            return polygon.isVisible();
        }
        return false;
    }

    public void remove() {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f356448a;
        if (polygon != null) {
            polygon.remove();
        }
    }

    public void setFillColor(int i) {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f356448a;
        if (polygon != null) {
            polygon.setFillColor(i);
        }
    }

    public void setLevel(int i) {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f356448a;
        if (polygon != null) {
            polygon.setLevel(i);
        }
    }

    public void setPoints(List<LatLng> list) {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f356448a;
        if (polygon != null) {
            polygon.setPoints(C119023n.m167773g(list));
        }
    }

    public void setStrokeColor(int i) {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f356448a;
        if (polygon != null) {
            polygon.setStrokeColor(i);
        }
    }

    public void setStrokeWidth(float f) {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f356448a;
        if (polygon != null) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            polygon.setStrokeWidth(f);
        }
    }

    public void setVisible(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f356448a;
        if (polygon != null) {
            polygon.setVisible(z);
        }
    }

    public void setZIndex(float f) {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f356448a;
        if (polygon != null) {
            polygon.setZIndex((int) f);
        }
    }
}
