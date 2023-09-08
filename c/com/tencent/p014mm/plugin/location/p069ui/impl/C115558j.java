package com.tencent.p014mm.plugin.location.p069ui.impl;

import com.tencent.mapsdk.raster.model.MapPoi;
import com.tencent.tencentmap.mapsdk.map.TencentMap;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.j */
public class C115558j implements TencentMap.OnMapPoiClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115560k f346580a;

    public C115558j(C115560k kVar) {
        this.f346580a = kVar;
    }

    public void onClicked(MapPoi mapPoi) {
        this.f346580a.mo175573l(mapPoi.getPosition());
    }
}
