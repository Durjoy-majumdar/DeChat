package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.ArcLineOverlayInfo;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.C113961mq;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.na */
public final class C113980na extends C113971mt<C113981nb> {
    public C113980na(C114216sq sqVar) {
        super(sqVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C113970ms mo172486a(C113973mu muVar) {
        return new C113978mz(this, (C113981nb) muVar);
    }

    /* renamed from: c */
    public final void mo172491c() {
        int size = this.f340958b.size();
        boolean n = this.f340957a.mo172952n();
        for (int i = 0; i < size; i++) {
            n |= ((C113981nb) ((C113978mz) this.f340958b.get(this.f340958b.keyAt(i))).f340956d).getIsAnimate();
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
            C113978mz mzVar = (C113978mz) this.f340959c.get(this.f340959c.keyAt(i));
            C114216sq sqVar = this.f340957a;
            mzVar.mo172477a(((Long) sqVar.mo172900a(new CallbackRunnable<Long>((ArcLineOverlayInfo) mzVar.f340956d) {
                /* renamed from: a */
                private Long m160088a() {
                    if (C114216sq.this.f342024e == 0) {
                        return 0L;
                    }
                    return Long.valueOf(C114216sq.this.f342023d.nativeAddArcLineOverlay(C114216sq.this.f342024e, r4));
                }

                public final /* synthetic */ Object run() {
                    if (C114216sq.this.f342024e == 0) {
                        return 0L;
                    }
                    return Long.valueOf(C114216sq.this.f342023d.nativeAddArcLineOverlay(C114216sq.this.f342024e, r4));
                }
            }, 0L)).longValue());
        }
    }

    /* renamed from: g */
    public final void mo172496g() {
        int size = this.f340961e.size();
        for (int i = 0; i < size; i++) {
            C113978mz mzVar = (C113978mz) this.f340961e.get(this.f340961e.keyAt(i));
            C114216sq sqVar = this.f340957a;
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(mzVar.mo172480e_(), (ArcLineOverlayInfo) mzVar.f340956d) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeUpdateArcLineOverlay(C114216sq.this.f342024e, r2, r4);
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
    public synchronized C113978mz mo172488b(C113981nb nbVar) {
        return (C113978mz) super.mo172488b(nbVar);
    }

    /* renamed from: a */
    private C113970ms<C113981nb> m158306a(C113981nb nbVar) {
        return new C113978mz(this, nbVar);
    }
}
