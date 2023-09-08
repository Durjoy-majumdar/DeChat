package com.tencent.p014mm.plugin.location.p069ui.impl;

import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.tencentmap.mapsdk.map.TencentMap;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.i */
public class C115556i implements TencentMap.OnMapClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115560k f346578a;

    public C115556i(C115560k kVar) {
        this.f346578a = kVar;
    }

    public void onMapClick(LatLng latLng) {
        this.f346578a.mo175573l(latLng);
    }
}
