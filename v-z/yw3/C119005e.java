package yw3;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Animation;
import com.tencent.mapsdk.raster.model.BitmapDescriptor;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Collision;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: yw3.e */
public class C119005e implements Marker {

    /* renamed from: a */
    public com.tencent.tencentmap.mapsdk.maps.model.Marker f356445a;

    /* renamed from: b */
    public C119009i f356446b;

    public C119005e(C119009i iVar, com.tencent.tencentmap.mapsdk.maps.model.Marker marker) {
        this.f356446b = iVar;
        this.f356445a = marker;
        if (iVar != null && iVar.f356454f != null) {
            synchronized (C119005e.class) {
                ((ArrayList) this.f356446b.f356454f).add(this.f356445a);
            }
        }
    }

    public float getAlpha() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            return marker.getAlpha();
        }
        return 0.0f;
    }

    public String getContentDescription() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            return marker.getContentDescription();
        }
        return null;
    }

    public String getId() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        return marker != null ? marker.getId() : "";
    }

    public int getLevel() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            return marker.getLevel();
        }
        return 0;
    }

    public View getMarkerView() {
        return null;
    }

    public LatLng getPosition() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            return C119023n.m167767a(marker.getPosition());
        }
        return null;
    }

    public float getRotation() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            return marker.getRotation();
        }
        return 0.0f;
    }

    public String getSnippet() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            return marker.getSnippet();
        }
        return null;
    }

    public Object getTag() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            return marker.getTag();
        }
        return null;
    }

    public String getTitle() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            return marker.getTitle();
        }
        return null;
    }

    public float getZIndex() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            return (float) marker.getZIndex();
        }
        return 0.0f;
    }

    public void hideInfoWindow() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            marker.hideInfoWindow();
        }
    }

    public boolean isDraggable() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            return marker.isDraggable();
        }
        return false;
    }

    public boolean isInfoWindowShown() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            return marker.isInfoWindowShown();
        }
        return false;
    }

    public boolean isVisible() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            return marker.isVisible();
        }
        return false;
    }

    public void refreshInfoWindow() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            marker.refreshInfoWindow();
        }
    }

    public void remove() {
        List<com.tencent.tencentmap.mapsdk.maps.model.Marker> list;
        if (this.f356445a != null) {
            synchronized (C119005e.class) {
                C119009i iVar = this.f356446b;
                if (!(iVar == null || (list = iVar.f356454f) == null)) {
                    ((ArrayList) list).remove(this.f356445a);
                }
            }
            this.f356445a.remove();
        }
    }

    public void set2Top() {
        int i;
        C119009i iVar = this.f356446b;
        if (iVar != null && iVar.f356454f != null) {
            synchronized (C119005e.class) {
                int size = ((ArrayList) this.f356446b.f356454f).size();
                Iterator it = ((ArrayList) this.f356446b.f356454f).iterator();
                while (true) {
                    i = Integer.MAX_VALUE;
                    if (!it.hasNext()) {
                        break;
                    }
                    com.tencent.tencentmap.mapsdk.maps.model.Marker marker = (com.tencent.tencentmap.mapsdk.maps.model.Marker) it.next();
                    if (marker.getZIndex() != Integer.MAX_VALUE && marker.getZIndex() > size) {
                        size = marker.getZIndex();
                    }
                }
                com.tencent.tencentmap.mapsdk.maps.model.Marker marker2 = this.f356445a;
                if (size < Integer.MAX_VALUE) {
                    i = size + 1;
                }
                marker2.setZIndex(i);
            }
        }
    }

    public void setAlpha(float f) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            marker.setAlpha(f);
        }
    }

    public void setAnchor(float f, float f2) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            marker.setAnchor(f, f2);
        }
    }

    public void setCollisions(Collision... collisionArr) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            marker.setCollisions(collisionArr);
        }
    }

    public void setContentDescription(String str) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            marker.setContentDescription(str);
        }
    }

    public void setDraggable(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            marker.setDraggable(z);
        }
    }

    public void setGifIcon(Bitmap[] bitmapArr, boolean z, int i) {
        if (this.f356445a != null && bitmapArr != null) {
            this.f356445a.setIconLooper(BitmapDescriptorFactory.fromBitmaps(bitmapArr), z, i);
        }
    }

    public void setIcon(BitmapDescriptor bitmapDescriptor) {
        if (this.f356445a != null && bitmapDescriptor != null) {
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromBitmap = BitmapDescriptorFactory.fromBitmap(bitmapDescriptor.getBitmap());
            fromBitmap.getFormater().setScale(2);
            this.f356445a.setIcon(fromBitmap);
        }
    }

    public void setInfoWindowHideAnimation(Animation animation) {
    }

    public void setInfoWindowOffset(int i, int i2) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            marker.setInfoWindowOffset(i, i2);
        }
    }

    public void setInfoWindowShowAnimation(Animation animation) {
    }

    public void setLevel(int i) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            marker.setLevel(i);
        }
    }

    public void setMarkerView(View view) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            marker.setIcon(BitmapDescriptorFactory.fromView(view));
        }
    }

    public void setPosition(LatLng latLng) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            marker.setPosition(C119023n.m167772f(latLng));
        }
    }

    public void setRotation(float f) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            marker.setRotation(f);
        }
    }

    public void setSnippet(String str) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            marker.setSnippet(str);
        }
    }

    public void setTag(Object obj) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            marker.setTag(obj);
        }
    }

    public void setTitle(String str) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            marker.setTitle(str);
        }
    }

    public void setVisible(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            marker.setVisible(z);
        }
    }

    public void setZIndex(float f) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            marker.setZIndex(f);
        }
    }

    public void showInfoWindow() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f356445a;
        if (marker != null) {
            marker.showInfoWindow();
        }
    }
}
