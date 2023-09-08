package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;

/* renamed from: com.tencent.mapsdk.internal.su */
public final class C114319su implements TencentMap.OnIndoorStateChangeListener {

    /* renamed from: a */
    private C114322sx f342495a;

    public C114319su(C114322sx sxVar) {
        this.f342495a = sxVar;
    }

    /* renamed from: a */
    private boolean m160130a() {
        return this.f342495a == null;
    }

    public final boolean onIndoorBuildingDeactivated() {
        C114322sx sxVar = this.f342495a;
        if (sxVar == null) {
            return false;
        }
        sxVar.onIndoorBuildingDeactivated();
        TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener = this.f342495a.f342597x;
        if (onIndoorStateChangeListener == null) {
            return true;
        }
        onIndoorStateChangeListener.onIndoorBuildingDeactivated();
        return true;
    }

    public final boolean onIndoorBuildingFocused() {
        C114322sx sxVar = this.f342495a;
        if (sxVar == null) {
            return false;
        }
        sxVar.onIndoorBuildingFocused();
        TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener = this.f342495a.f342597x;
        if (onIndoorStateChangeListener == null) {
            return true;
        }
        onIndoorStateChangeListener.onIndoorBuildingFocused();
        return true;
    }

    public final boolean onIndoorLevelActivated(IndoorBuilding indoorBuilding) {
        C114322sx sxVar = this.f342495a;
        if (sxVar == null) {
            return false;
        }
        sxVar.onIndoorLevelActivated(indoorBuilding);
        TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener = this.f342495a.f342597x;
        if (onIndoorStateChangeListener == null) {
            return true;
        }
        onIndoorStateChangeListener.onIndoorLevelActivated(indoorBuilding);
        return true;
    }
}
