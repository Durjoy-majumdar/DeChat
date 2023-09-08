package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.MarkerInfo;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.C113961mq;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.np */
public final class C113996np extends C113971mt<C113997nq> {
    public C113996np(C114216sq sqVar) {
        super(sqVar);
    }

    /* renamed from: c */
    public final void mo172492c(C113970ms msVar) {
    }

    /* renamed from: f */
    public final void mo172495f() {
        int size = this.f340959c.size();
        for (int i = 0; i < size; i++) {
            C113995no noVar = (C113995no) this.f340959c.get(this.f340959c.keyAt(i));
            C114216sq sqVar = this.f340957a;
            noVar.mo172477a(((Long) sqVar.mo172900a(new CallbackRunnable<Long>((MarkerInfo) noVar.f340956d) {
                /* renamed from: a */
                private Long m160072a() {
                    if (C114216sq.this.f342024e == 0) {
                        return 0L;
                    }
                    return Long.valueOf(C114216sq.this.f342023d.nativeAddMarker2(C114216sq.this.f342024e, r4));
                }

                public final /* synthetic */ Object run() {
                    if (C114216sq.this.f342024e == 0) {
                        return 0L;
                    }
                    return Long.valueOf(C114216sq.this.f342023d.nativeAddMarker2(C114216sq.this.f342024e, r4));
                }
            }, 0L)).longValue());
        }
    }

    /* renamed from: g */
    public final void mo172496g() {
        int size = this.f340961e.size();
        for (int i = 0; i < size; i++) {
            C113995no noVar = (C113995no) this.f340961e.get(this.f340961e.keyAt(i));
            C114216sq sqVar = this.f340957a;
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(noVar.mo172480e_(), (MarkerInfo) noVar.f340956d) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeUpdateMarker(r2, r4);
                    }
                }
            });
        }
    }

    /* renamed from: h */
    public final void mo172497h() {
        int size = this.f340963g.size();
        for (int i = 0; i < size; i++) {
            this.f340957a.mo172929b(((C113995no) this.f340963g.get(this.f340963g.keyAt(i))).mo172480e_());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized C113995no mo172485a(int i) {
        return (C113995no) super.mo172485a(i);
    }

    /* renamed from: a */
    public final /* synthetic */ C113970ms mo172486a(C113973mu muVar) {
        return new C113995no(this, (C113997nq) muVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized C113995no mo172488b(C113997nq nqVar) {
        return (C113995no) super.mo172488b(nqVar);
    }

    /* renamed from: a */
    private C113995no m158377a(C113997nq nqVar) {
        return new C113995no(this, nqVar);
    }

    /* renamed from: a */
    public final int mo172554a(long j) {
        C114216sq sqVar = this.f340957a;
        if (sqVar == null || j == 0) {
            return 0;
        }
        return sqVar.mo172895a(j);
    }
}
