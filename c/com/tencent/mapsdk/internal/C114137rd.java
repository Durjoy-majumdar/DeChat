package com.tencent.mapsdk.internal;

import android.os.SystemClock;
import com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.rd */
public final class C114137rd {

    /* renamed from: a */
    public long f341650a = SystemClock.elapsedRealtime();

    /* renamed from: b */
    public LatLngBounds f341651b;

    /* renamed from: c */
    public List<Detail> f341652c;

    public C114137rd(LatLngBounds latLngBounds, List<Detail> list) {
        this.f341651b = latLngBounds;
        this.f341652c = list;
    }
}
