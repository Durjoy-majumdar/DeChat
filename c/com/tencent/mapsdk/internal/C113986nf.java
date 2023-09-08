package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;

/* renamed from: com.tencent.mapsdk.internal.nf */
public final class C113986nf extends C113970ms<C113988nh> implements GroundOverlay {
    public C113986nf(C113987ng ngVar, C113988nh nhVar) {
        super(ngVar, nhVar);
    }

    public final void setAlpha(float f) {
        T t = this.f340956d;
        if (((C113988nh) t).f340979a != null) {
            ((C113988nh) t).f340979a.alpha(f);
        }
        ((C113988nh) this.f340956d).setAlpha(f);
        mo172478a(this.f340956d);
    }

    public final void setAnchor(float f, float f2) {
        T t = this.f340956d;
        if (((C113988nh) t).f340979a != null) {
            ((C113988nh) t).f340979a.anchor(f, f2);
        }
        ((C113988nh) this.f340956d).mo172546a();
        mo172478a(this.f340956d);
    }

    public final void setBitmap(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor != null) {
            T t = this.f340956d;
            if (((C113988nh) t).f340979a != null) {
                ((C113988nh) t).f340979a.bitmap(bitmapDescriptor);
            }
            C113971mt<T> mtVar = this.f340955c;
            if (mtVar != null) {
                ((C113988nh) this.f340956d).setBitmap(bitmapDescriptor.getBitmap(mtVar.mo172483a()));
            }
            mo172478a(this.f340956d);
        }
    }

    public final void setLatLongBounds(LatLngBounds latLngBounds) {
        T t = this.f340956d;
        if (((C113988nh) t).f340979a != null) {
            ((C113988nh) t).f340979a.latLngBounds(latLngBounds);
        }
        ((C113988nh) this.f340956d).setLatLngBounds(latLngBounds);
        mo172478a(this.f340956d);
    }

    public final void setLevel(int i) {
        T t = this.f340956d;
        if (((C113988nh) t).f340979a != null) {
            ((C113988nh) t).f340979a.level(i);
        }
        ((C113988nh) this.f340956d).setLevel(i);
        mo172478a(this.f340956d);
    }

    public final void setPosition(LatLng latLng) {
        T t = this.f340956d;
        if (((C113988nh) t).f340979a != null) {
            ((C113988nh) t).f340979a.position(latLng);
        }
        ((C113988nh) this.f340956d).mo172546a();
        mo172478a(this.f340956d);
    }

    public final void setVisibility(boolean z) {
        T t = this.f340956d;
        if (((C113988nh) t).f340979a != null) {
            ((C113988nh) t).f340979a.visible(z);
        }
        ((C113988nh) this.f340956d).setVisibility(z);
        mo172478a(this.f340956d);
    }

    public final void setZindex(int i) {
        T t = this.f340956d;
        if (((C113988nh) t).f340979a != null) {
            ((C113988nh) t).f340979a.zIndex(i);
        }
        ((C113988nh) this.f340956d).setZIndex(i);
        mo172478a(this.f340956d);
    }

    public final void setZoom(float f) {
        T t = this.f340956d;
        if (((C113988nh) t).f340979a != null) {
            ((C113988nh) t).f340979a.zoom(f);
        }
        ((C113988nh) this.f340956d).mo172546a();
        mo172478a(this.f340956d);
    }
}
