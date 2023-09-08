package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.UiSettings;

/* renamed from: com.tencent.mapsdk.internal.te */
public final class C26875te implements UiSettings {

    /* renamed from: a */
    private C26872ae f74716a;

    public C26875te(C26872ae aeVar) {
        this.f74716a = aeVar;
    }

    public final boolean isCompassEnabled() {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar == null || (alVar = aeVar.f74714a) == null) {
            return false;
        }
        return alVar.mo54039b();
    }

    public final boolean isIndoorLevelPickerEnabled() {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar == null || (alVar = aeVar.f74714a) == null) {
            return false;
        }
        return alVar.mo54057h();
    }

    public final boolean isMyLocationButtonEnabled() {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar == null || (alVar = aeVar.f74714a) == null) {
            return false;
        }
        return alVar.mo54042c();
    }

    public final boolean isRotateGesturesEnabled() {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar == null || (alVar = aeVar.f74714a) == null) {
            return false;
        }
        return alVar.mo54054g();
    }

    public final boolean isScaleViewEnabled() {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar == null || (alVar = aeVar.f74714a) == null) {
            return false;
        }
        return alVar.mo54059i();
    }

    public final boolean isScrollGesturesEnabled() {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar == null || (alVar = aeVar.f74714a) == null) {
            return false;
        }
        return alVar.mo54045d();
    }

    public final boolean isTiltGesturesEnabled() {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar == null || (alVar = aeVar.f74714a) == null) {
            return false;
        }
        return alVar.mo54051f();
    }

    public final boolean isZoomControlsEnabled() {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar == null || (alVar = aeVar.f74714a) == null) {
            return false;
        }
        return alVar.mo54035a();
    }

    public final boolean isZoomGesturesEnabled() {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar == null || (alVar = aeVar.f74714a) == null) {
            return false;
        }
        return alVar.mo54048e();
    }

    public final void setAllGesturesEnabled(boolean z) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54058i(z);
        }
    }

    public final void setCompassEnabled(boolean z) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54038b(z);
        }
    }

    public final void setCompassExtraPadding(int i) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54049f(i);
        }
    }

    public final void setFlingGestureEnabled(boolean z) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54047e(z);
        }
    }

    public final void setGestureRotateByMapCenter(boolean z) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54063m(z);
        }
    }

    public final void setGestureScaleByMapCenter(boolean z) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54062l(z);
        }
    }

    public final void setIndoorLevelPickerEnabled(boolean z) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54064n(z);
        }
    }

    public final void setLogoPosition(int i) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54036b(i);
        }
    }

    public final void setLogoPositionWithMargin(int i, int i2, int i3, int i4, int i5) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54032a(i, i2, i3, i4, i5);
        }
    }

    public final void setLogoScale(float f) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54029a(f);
        }
    }

    public final void setLogoSize(int i) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54052g(i);
        }
    }

    public final void setMyLocationButtonEnabled(boolean z) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54041c(z);
        }
    }

    public final void setRotateGesturesEnabled(boolean z) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54056h(z);
        }
    }

    public final void setScaleViewEnabled(boolean z) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54060j(z);
        }
    }

    public final void setScaleViewFadeEnable(boolean z) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54065o(z);
        }
    }

    public final void setScaleViewPosition(int i) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54046e(i);
        }
    }

    public final void setScaleViewPositionWithMargin(int i, int i2, int i3, int i4, int i5) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54037b(i, i2, i3, i4, i5);
        }
    }

    public final void setScrollGesturesEnabled(boolean z) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54044d(z);
        }
    }

    public final void setTiltGesturesEnabled(boolean z) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54053g(z);
        }
    }

    public final void setZoomControlsEnabled(boolean z) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54034a(z);
        }
    }

    public final void setZoomGesturesEnabled(boolean z) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54050f(z);
        }
    }

    public final void setZoomPosition(int i) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54055h(i);
        }
    }

    public final void setCompassExtraPadding(int i, int i2) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54031a(i, i2);
        }
    }

    public final void setLogoPosition(int i, int[] iArr) {
        C26873al alVar;
        C26872ae aeVar = this.f74716a;
        if (aeVar != null && (alVar = aeVar.f74714a) != null) {
            alVar.mo54033a(i, iArr);
        }
    }
}
