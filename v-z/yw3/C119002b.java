package yw3;

import android.graphics.DashPathEffect;
import com.tencent.mapsdk.raster.model.Circle;
import com.tencent.mapsdk.raster.model.LatLng;

/* renamed from: yw3.b */
public class C119002b implements Circle {

    /* renamed from: a */
    public com.tencent.tencentmap.mapsdk.maps.model.Circle f356441a;

    public C119002b(com.tencent.tencentmap.mapsdk.maps.model.Circle circle) {
        this.f356441a = circle;
    }

    public boolean contains(LatLng latLng) {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            return circle.contains(C119023n.m167772f(latLng));
        }
        return false;
    }

    public LatLng getCenter() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            return C119023n.m167767a(circle.getCenter());
        }
        return null;
    }

    public int getFillColor() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            return circle.getFillColor();
        }
        return 0;
    }

    public String getId() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            return circle.getId();
        }
        return null;
    }

    public int getLevel() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            return circle.getLevel();
        }
        return 0;
    }

    public double getRadius() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            return circle.getRadius();
        }
        return 0.0d;
    }

    public int getStrokeColor() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            return circle.getStrokeColor();
        }
        return 0;
    }

    public boolean getStrokeDash() {
        return false;
    }

    public DashPathEffect getStrokeDashPathEffect() {
        return null;
    }

    public float getStrokeWidth() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            return circle.getStrokeWidth();
        }
        return 0.0f;
    }

    public float getZIndex() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            return (float) circle.getZIndex();
        }
        return 0.0f;
    }

    public boolean isVisible() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            return circle.isVisible();
        }
        return false;
    }

    public void remove() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            circle.remove();
        }
    }

    public void setCenter(LatLng latLng) {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            circle.setCenter(C119023n.m167772f(latLng));
        }
    }

    public void setFillColor(int i) {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            circle.setFillColor(i);
        }
    }

    public void setLevel(int i) {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            circle.setLevel(i);
        }
    }

    public void setRadius(double d) {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            circle.setRadius(d);
        }
    }

    public void setStrokeColor(int i) {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            circle.setStrokeColor(i);
        }
    }

    public void setStrokeDash(boolean z) {
    }

    public void setStrokeWidth(float f) {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            circle.setStrokeWidth(f);
        }
    }

    public void setVisible(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            circle.setVisible(z);
        }
    }

    public void setZIndex(float f) {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f356441a;
        if (circle != null) {
            circle.setZIndex((int) f);
        }
    }

    public void strokeDashPathEffect(DashPathEffect dashPathEffect) {
    }
}
