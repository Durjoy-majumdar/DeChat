package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.MarkerInfo;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;

/* renamed from: com.tencent.mapsdk.internal.nq */
public class C113997nq extends MarkerInfo implements C113973mu {
    public C113997nq(LatLng latLng, String str) {
        super(latLng.getLatitude(), latLng.getLongitude(), str);
    }

    public C113997nq(double d, double d2, String str) {
        super(d, d2, str);
    }
}
