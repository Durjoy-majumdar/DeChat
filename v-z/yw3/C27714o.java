package yw3;

import com.tencent.tencentmap.mapsdk.map.UiSettings;

/* renamed from: yw3.o */
public class C27714o implements UiSettings {

    /* renamed from: a */
    public com.tencent.tencentmap.mapsdk.maps.UiSettings f76725a;

    public C27714o(com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings) {
        this.f76725a = uiSettings;
    }

    public boolean isAnimationEnabled() {
        return false;
    }

    public boolean isCompassEnabled() {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f76725a;
        if (uiSettings == null) {
            return false;
        }
        return uiSettings.isCompassEnabled();
    }

    public boolean isIndoorLevelPickerEnabled() {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f76725a;
        if (uiSettings == null) {
            return false;
        }
        return uiSettings.isIndoorLevelPickerEnabled();
    }

    public boolean isRotateGesturesEnabled() {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f76725a;
        if (uiSettings == null) {
            return false;
        }
        return uiSettings.isRotateGesturesEnabled();
    }

    public boolean isScaleControlsEnabled() {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f76725a;
        if (uiSettings != null) {
            return uiSettings.isScaleViewEnabled();
        }
        return false;
    }

    public boolean isTiltGesturesEnabled() {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f76725a;
        if (uiSettings == null) {
            return false;
        }
        return uiSettings.isTiltGesturesEnabled();
    }

    public void setAllGesturesEnabled(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f76725a;
        if (uiSettings != null) {
            uiSettings.setAllGesturesEnabled(z);
        }
    }

    public void setAnimationEnabled(boolean z) {
    }

    public void setCompassEnabled(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f76725a;
        if (uiSettings != null) {
            uiSettings.setCompassEnabled(z);
        }
    }

    public void setIndoorLevelPickerEnabled(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f76725a;
        if (uiSettings != null) {
            uiSettings.setIndoorLevelPickerEnabled(z);
        }
    }

    public void setLogoPosition(int i) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f76725a;
        if (uiSettings != null) {
            uiSettings.setLogoPosition(i);
        }
    }

    public void setLogoScale(float f) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f76725a;
        if (uiSettings != null) {
            uiSettings.setLogoScale(f);
        }
    }

    public void setRotateGesturesEnabled(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f76725a;
        if (uiSettings != null) {
            uiSettings.setRotateGesturesEnabled(z);
        }
    }

    public void setScaleControlsEnabled(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f76725a;
        if (uiSettings != null) {
            uiSettings.setScaleViewEnabled(z);
        }
    }

    public void setScaleViewPositionWithMargin(int i, int i2, int i3, int i4, int i5) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f76725a;
        if (uiSettings != null) {
            int i6 = 1;
            if (i == 1) {
                i6 = 4;
            } else if (i != 2) {
                i6 = i;
            }
            uiSettings.setScaleViewPositionWithMargin(i6, i2, i3, i4, i5);
        }
    }

    public void setScrollGesturesEnabled(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f76725a;
        if (uiSettings != null) {
            uiSettings.setScrollGesturesEnabled(z);
        }
    }

    public void setTiltGesturesEnabled(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f76725a;
        if (uiSettings != null) {
            uiSettings.setTiltGesturesEnabled(z);
        }
    }

    public void setZoomGesturesEnabled(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f76725a;
        if (uiSettings != null) {
            uiSettings.setZoomGesturesEnabled(z);
        }
    }

    public void setLogoPosition(int i, int[] iArr) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f76725a;
        if (uiSettings != null) {
            uiSettings.setLogoPosition(i, iArr);
        }
    }
}
