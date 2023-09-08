package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.AggregationOverlayInfo;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.VectorHeatAggregationUnit;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.my */
public final class C113977my extends C113971mt<C113976mx> {
    public C113977my(C114216sq sqVar) {
        super(sqVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C113970ms mo172486a(C113973mu muVar) {
        return new C113975mw(this, (C113976mx) muVar);
    }

    /* renamed from: c */
    public final void mo172491c() {
        int size = this.f340958b.size();
        boolean n = this.f340957a.mo172952n();
        for (int i = 0; i < size; i++) {
            n |= ((C113976mx) ((C113975mw) this.f340958b.get(this.f340958b.keyAt(i))).f340956d).isAnimate();
        }
        if (n) {
            this.f340957a.f342029j.f340914v = true;
        }
    }

    /* renamed from: c */
    public final void mo172492c(C113970ms msVar) {
    }

    /* renamed from: e */
    public final void mo172494e() {
        if (this.f340957a.mo172964z()) {
            this.f340957a.f342029j.f340914v = true;
        }
    }

    /* renamed from: f */
    public final void mo172495f() {
        int size = this.f340959c.size();
        for (int i = 0; i < size; i++) {
            C113975mw mwVar = (C113975mw) this.f340959c.get(this.f340959c.keyAt(i));
            C114216sq sqVar = this.f340957a;
            mwVar.mo172477a(((Long) sqVar.mo172900a(new CallbackRunnable<Long>((AggregationOverlayInfo) mwVar.f340956d) {
                /* renamed from: a */
                private Long m160080a() {
                    if (C114216sq.this.f342024e == 0) {
                        return 0L;
                    }
                    return Long.valueOf(C114216sq.this.f342023d.nativeAddAggregatioinOverlay(C114216sq.this.f342024e, r4));
                }

                public final /* synthetic */ Object run() {
                    if (C114216sq.this.f342024e == 0) {
                        return 0L;
                    }
                    return Long.valueOf(C114216sq.this.f342023d.nativeAddAggregatioinOverlay(C114216sq.this.f342024e, r4));
                }
            }, 0L)).longValue());
        }
    }

    /* renamed from: g */
    public final void mo172496g() {
        int size = this.f340961e.size();
        for (int i = 0; i < size; i++) {
            C113975mw mwVar = (C113975mw) this.f340961e.get(this.f340961e.keyAt(i));
            C114216sq sqVar = this.f340957a;
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(mwVar.mo172480e_(), (AggregationOverlayInfo) mwVar.f340956d) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeUpdateAggregatioinOverlay(C114216sq.this.f342024e, r2, r4);
                    }
                }
            });
        }
    }

    /* renamed from: h */
    public final void mo172497h() {
        int size = this.f340963g.size();
        for (int i = 0; i < size; i++) {
            this.f340957a.mo172935c(this.f340963g.get(this.f340963g.keyAt(i)).mo172480e_());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized C113975mw mo172488b(C113976mx mxVar) {
        return (C113975mw) super.mo172488b(mxVar);
    }

    /* renamed from: a */
    private C113970ms<C113976mx> m158258a(C113976mx mxVar) {
        return new C113975mw(this, mxVar);
    }

    /* renamed from: a */
    public final VectorHeatAggregationUnit mo172508a(long j, LatLng latLng) {
        C114216sq sqVar = this.f340957a;
        if (sqVar == null) {
            return null;
        }
        return (VectorHeatAggregationUnit) sqVar.mo172900a(new CallbackRunnable<VectorHeatAggregationUnit>(j, latLng) {
            /* renamed from: a */
            private VectorHeatAggregationUnit m160086a() {
                if (C114216sq.this.f342024e == 0) {
                    return null;
                }
                return C114216sq.this.f342023d.getAggregationUnit(C114216sq.this.f342024e, r2, r4);
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return null;
                }
                return C114216sq.this.f342023d.getAggregationUnit(C114216sq.this.f342024e, r2, r4);
            }
        }, null);
    }
}
