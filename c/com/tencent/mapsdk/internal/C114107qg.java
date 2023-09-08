package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.qg */
public final class C114107qg {

    /* renamed from: a */
    public int f341524a;

    /* renamed from: b */
    public C114216sq f341525b;

    public C114107qg(C114216sq sqVar, GeoPoint[] geoPointArr, PolylineOptions.Text text) {
        this.f341525b = sqVar;
        if (sqVar != null) {
            this.f341524a = ((Integer) sqVar.mo172900a(new CallbackRunnable<Integer>(geoPointArr, text) {
                /* renamed from: a */
                private Integer m160068a() {
                    if (C114216sq.this.f342024e == 0) {
                        return -1;
                    }
                    return Integer.valueOf(C114216sq.this.f342023d.addLineText(C114216sq.this.f342024e, r2, r3));
                }

                public final /* synthetic */ Object run() {
                    if (C114216sq.this.f342024e == 0) {
                        return -1;
                    }
                    return Integer.valueOf(C114216sq.this.f342023d.addLineText(C114216sq.this.f342024e, r2, r3));
                }
            }, -1)).intValue();
        }
    }

    /* renamed from: a */
    private void m159095a(PolylineOptions.Text text) {
        int i;
        C114216sq sqVar = this.f341525b;
        if (sqVar != null && (i = this.f341524a) > 0) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(i, text) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.setLineTextStyle(C114216sq.this.f342024e, r2, r3);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo172713a() {
        int i;
        C114216sq sqVar = this.f341525b;
        if (sqVar != null && (i = this.f341524a) > 0) {
            sqVar.mo172941f(i);
        }
    }
}
