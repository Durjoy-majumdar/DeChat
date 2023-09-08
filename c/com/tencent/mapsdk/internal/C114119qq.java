package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.TileProvider;

/* renamed from: com.tencent.mapsdk.internal.qq */
public final class C114119qq {

    /* renamed from: a */
    private C114117qo f341594a;

    public C114119qq(C114117qo qoVar) {
        this.f341594a = qoVar;
    }

    /* renamed from: a */
    public final C114110qj mo172740a(TileOverlayOptions tileOverlayOptions) {
        TileProvider tileProvider = tileOverlayOptions.getTileProvider();
        C114110qj qpVar = tileProvider != null ? tileProvider instanceof C114123qu ? new C114118qp(this.f341594a, tileOverlayOptions) : tileProvider instanceof C114190rw ? new C114120qr(this.f341594a, tileOverlayOptions) : new C114110qj(this.f341594a, tileOverlayOptions) : null;
        this.f341594a.mo172736a(qpVar);
        return qpVar;
    }
}
