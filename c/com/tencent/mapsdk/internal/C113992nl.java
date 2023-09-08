package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.IntersectionOverlayInfo;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.C113961mq;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.nl */
public final class C113992nl extends C113971mt<C113994nn> {
    public C113992nl(C114216sq sqVar) {
        super(sqVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C113970ms mo172486a(C113973mu muVar) {
        return new C113993nm(this, (C113994nn) muVar);
    }

    /* renamed from: c */
    public final void mo172492c(C113970ms msVar) {
    }

    /* renamed from: f */
    public final void mo172495f() {
        int size = this.f340959c.size();
        for (int i = 0; i < size; i++) {
            C113993nm nmVar = (C113993nm) this.f340959c.get(this.f340959c.keyAt(i));
            C114216sq sqVar = this.f340957a;
            nmVar.mo172477a(((Long) sqVar.mo172900a(new CallbackRunnable<Long>((IntersectionOverlayInfo) nmVar.f340956d) {
                /* renamed from: a */
                private Long m160099a() {
                    if (C114216sq.this.f342024e == 0) {
                        return 0L;
                    }
                    return Long.valueOf(C114216sq.this.f342023d.nativeAddIntersectionOverlay(C114216sq.this.f342024e, r4));
                }

                public final /* synthetic */ Object run() {
                    if (C114216sq.this.f342024e == 0) {
                        return 0L;
                    }
                    return Long.valueOf(C114216sq.this.f342023d.nativeAddIntersectionOverlay(C114216sq.this.f342024e, r4));
                }
            }, 0L)).longValue());
        }
    }

    /* renamed from: g */
    public final void mo172496g() {
        int size = this.f340961e.size();
        for (int i = 0; i < size; i++) {
            C113993nm nmVar = (C113993nm) this.f340961e.get(this.f340961e.keyAt(i));
            C114216sq sqVar = this.f340957a;
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(nmVar.mo172480e_(), (IntersectionOverlayInfo) nmVar.f340956d) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0 && r2 != 0) {
                        C114216sq.this.f342023d.nativeUpdateIntersectionOverlay(r2, r4);
                    }
                }
            });
        }
    }

    /* renamed from: h */
    public final void mo172497h() {
        int size = this.f340963g.size();
        for (int i = 0; i < size; i++) {
            this.f340957a.mo172929b(this.f340963g.get(this.f340963g.keyAt(i)).mo172480e_());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized C113993nm mo172488b(C113994nn nnVar) {
        return (C113993nm) super.mo172488b(nnVar);
    }

    /* renamed from: a */
    private C113993nm m158366a(C113994nn nnVar) {
        return new C113993nm(this, nnVar);
    }

    /* renamed from: a */
    public final int mo172547a(long j) {
        C114216sq sqVar = this.f340957a;
        if (sqVar == null || j == 0) {
            return 0;
        }
        return sqVar.mo172895a(j);
    }
}
