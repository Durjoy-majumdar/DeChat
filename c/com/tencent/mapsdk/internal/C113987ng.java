package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import com.tencent.map.lib.models.GroundOverlayInfo;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.ng */
public final class C113987ng extends C113971mt<C113988nh> {
    public C113987ng(C114216sq sqVar) {
        super(sqVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C113970ms mo172486a(C113973mu muVar) {
        return new C113986nf(this, (C113988nh) muVar);
    }

    /* renamed from: c */
    public final void mo172492c(C113970ms msVar) {
    }

    /* renamed from: f */
    public final void mo172495f() {
        int size = this.f340959c.size();
        for (int i = 0; i < size; i++) {
            C113986nf nfVar = (C113986nf) this.f340959c.get(this.f340959c.keyAt(i));
            C114216sq sqVar = this.f340957a;
            nfVar.mo172477a(((Long) sqVar.mo172900a(new CallbackRunnable<Long>((GroundOverlayInfo) nfVar.f340956d) {
                /* renamed from: a */
                private Long m160095a() {
                    GroundOverlayInfo groundOverlayInfo;
                    if (C114216sq.this.f342024e == 0 || (groundOverlayInfo = r4) == null || !groundOverlayInfo.checkValid()) {
                        return 0L;
                    }
                    return Long.valueOf(C114216sq.this.f342023d.nativeAddGroundOverlay(C114216sq.this.f342024e, r4));
                }

                public final /* synthetic */ Object run() {
                    GroundOverlayInfo groundOverlayInfo;
                    if (C114216sq.this.f342024e == 0 || (groundOverlayInfo = r4) == null || !groundOverlayInfo.checkValid()) {
                        return 0L;
                    }
                    return Long.valueOf(C114216sq.this.f342023d.nativeAddGroundOverlay(C114216sq.this.f342024e, r4));
                }
            }, 0L)).longValue());
            ((C113988nh) nfVar.f340956d).setBitmap((Bitmap) null);
            ((C113988nh) nfVar.f340956d).setLatLngBounds((LatLngBounds) null);
        }
    }

    /* renamed from: g */
    public final void mo172496g() {
        int size = this.f340961e.size();
        for (int i = 0; i < size; i++) {
            C113986nf nfVar = (C113986nf) this.f340961e.get(this.f340961e.keyAt(i));
            C114216sq sqVar = this.f340957a;
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(nfVar.mo172480e_(), (GroundOverlayInfo) nfVar.f340956d) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0 && r2 != 0) {
                        C114216sq.this.f342023d.nativeUpdateGroundOverlay(C114216sq.this.f342024e, r2, r4);
                    }
                }
            });
            ((C113988nh) nfVar.f340956d).setBitmap((Bitmap) null);
            ((C113988nh) nfVar.f340956d).setLatLngBounds((LatLngBounds) null);
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
    public synchronized C113986nf mo172488b(C113988nh nhVar) {
        return (C113986nf) super.mo172488b(nhVar);
    }

    /* renamed from: a */
    private C113970ms<C113988nh> m158345a(C113988nh nhVar) {
        return new C113986nf(this, nhVar);
    }
}
