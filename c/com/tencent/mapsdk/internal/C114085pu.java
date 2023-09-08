package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.tencent.mapsdk.engine.jni.models.TappedElement;
import com.tencent.mapsdk.internal.C114367v;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.pu */
public final class C114085pu implements C113711ev {

    /* renamed from: i */
    private static final int f341386i = 8;

    /* renamed from: j */
    private static final float f341387j = 10.0f;

    /* renamed from: a */
    public boolean f341388a;

    /* renamed from: b */
    public C114094px f341389b;

    /* renamed from: c */
    public boolean f341390c = false;

    /* renamed from: d */
    public C113532ba f341391d;

    /* renamed from: e */
    private final long f341392e = 250;

    /* renamed from: f */
    private final long f341393f = 1200;

    /* renamed from: g */
    private float f341394g = ((float) ViewConfiguration.getMinimumFlingVelocity());

    /* renamed from: h */
    private float f341395h = ((float) ViewConfiguration.getMaximumFlingVelocity());

    /* renamed from: k */
    private C113536be f341396k;

    /* renamed from: l */
    private float f341397l;

    /* renamed from: m */
    private float f341398m;

    /* renamed from: n */
    private final float f341399n;

    public C114085pu(C113536be beVar) {
        this.f341396k = beVar;
        C113532ba baVar = (C113532ba) beVar.mo171634b();
        this.f341391d = baVar;
        if (baVar != null) {
            baVar.mo171559a((C113711ev) this);
            Context G = this.f341391d.mo171543G();
            if (G != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(G);
                this.f341394g = (float) viewConfiguration.getScaledMinimumFlingVelocity();
                this.f341395h = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            }
        }
        this.f341389b = new C114094px();
        this.f341399n = beVar.mo171640h() * 2.5f;
    }

    /* renamed from: e */
    private boolean m158888e() {
        boolean z = this.f341390c;
        this.f341390c = false;
        return z;
    }

    /* renamed from: l */
    private void m158889l(float f, float f2) {
        this.f341390c = true;
        if (!this.f341388a) {
            float f3 = f / 64.0f;
            float f4 = f2 / 64.0f;
            if (Math.abs(f3) >= this.f341399n || Math.abs(f4) >= this.f341399n) {
                float max = Math.max(Math.abs(f), Math.abs(f2));
                float f5 = this.f341394g;
                final long j = ((long) (((max - f5) / (this.f341395h - f5)) * 950.0f)) + 250;
                final PointF pointF = new PointF(f3, f4);
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f341388a = true;
                this.f341396k.mo171633a().mo171217a((C113831iz) new C113831iz(new double[]{0.0d, 0.0d}) {
                    /* renamed from: a */
                    public final boolean mo171260a() {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - r8;
                        long j = r10;
                        if (elapsedRealtime > j) {
                            C114085pu.this.f341388a = false;
                            return true;
                        }
                        float f = r12.x;
                        if (f != 0.0f) {
                            this.f340601A[0] = C104551iw.m139973a(elapsedRealtime, f, -f, j);
                        }
                        float f2 = r12.y;
                        if (f2 != 0.0f) {
                            this.f340601A[1] = C104551iw.m139973a(elapsedRealtime, f2, -f2, r10);
                        }
                        return false;
                    }

                    /* renamed from: b */
                    public final void mo172219b() {
                        C114085pu.this.f341388a = false;
                    }
                });
            }
        }
    }

    /* renamed from: m */
    private boolean m158890m(float f, float f2) {
        List<C113712ew> list;
        C113554bj c = this.f341396k.mo171635c();
        if (c.f339819d.f339812i.mo171648a(f, f2)) {
            return true;
        }
        TappedElement a = c.f339816a.mo171638f().mo172899a(f, f2);
        if (a == null) {
            return false;
        }
        int i = a.type;
        if (i == 1 && c.f339820e != null) {
            new C113738ft(a.name, C113883ke.m157465a(a.pixelX, a.pixelY));
            return true;
        } else if (i != 6 || (list = c.f339821f) == null) {
            return false;
        } else {
            Iterator<C113712ew> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void mo172035a() {
    }

    /* renamed from: b */
    public final boolean mo172041b(float f) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo172042b(float f, float f2) {
        List<C113712ew> list;
        if (this.f341389b.mo172690g()) {
            C113554bj c = this.f341396k.mo171635c();
            if (c.f339819d.f339812i.mo171648a(f, f2)) {
                return true;
            }
            TappedElement a = c.f339816a.mo171638f().mo172899a(f, f2);
            if (a != null) {
                int i = a.type;
                if (i == 1 && c.f339820e != null) {
                    new C113738ft(a.name, C113883ke.m157465a(a.pixelX, a.pixelY));
                    return true;
                } else if (i == 6 && (list = c.f339821f) != null) {
                    Iterator<C113712ew> it = list.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo172044c(float f, float f2) {
        if (!this.f341389b.mo172685b() || !this.f341389b.mo172686c()) {
            return false;
        }
        this.f341390c = true;
        if (this.f341388a) {
            return false;
        }
        float f3 = f / 64.0f;
        float f4 = f2 / 64.0f;
        if (Math.abs(f3) < this.f341399n && Math.abs(f4) < this.f341399n) {
            return false;
        }
        float max = Math.max(Math.abs(f), Math.abs(f2));
        float f5 = this.f341394g;
        final long j = ((long) (((max - f5) / (this.f341395h - f5)) * 950.0f)) + 250;
        final PointF pointF = new PointF(f3, f4);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f341388a = true;
        this.f341396k.mo171633a().mo171217a((C113831iz) new C113831iz(new double[]{0.0d, 0.0d}) {
            /* renamed from: a */
            public final boolean mo171260a() {
                long elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime;
                long j = j;
                if (elapsedRealtime > j) {
                    C114085pu.this.f341388a = false;
                    return true;
                }
                float f = pointF.x;
                if (f != 0.0f) {
                    this.f340601A[0] = C104551iw.m139973a(elapsedRealtime, f, -f, j);
                }
                float f2 = pointF.y;
                if (f2 != 0.0f) {
                    this.f340601A[1] = C104551iw.m139973a(elapsedRealtime, f2, -f2, j);
                }
                return false;
            }

            /* renamed from: b */
            public final void mo172219b() {
                C114085pu.this.f341388a = false;
            }
        });
        return false;
    }

    /* renamed from: d */
    public final boolean mo172045d() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f341396k.mo171633a();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo172046d(float r3, float r4) {
        /*
            r2 = this;
            com.tencent.mapsdk.internal.px r0 = r2.f341389b
            boolean r0 = r0.mo172685b()
            if (r0 == 0) goto L_0x001e
            com.tencent.mapsdk.internal.be r0 = r2.f341396k
            com.tencent.mapsdk.internal.ad r0 = r0.mo171633a()
            com.tencent.mapsdk.internal.be r1 = r0.f339696z
            if (r1 == 0) goto L_0x001e
            com.tencent.mapsdk.internal.sq r1 = r1.mo171638f()
            if (r1 == 0) goto L_0x001e
            r1.mo172926b((float) r3, (float) r4)
            r0.mo171236c()
        L_0x001e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114085pu.mo172046d(float, float):boolean");
    }

    /* renamed from: e */
    public final boolean mo172047e(float f, float f2) {
        return false;
    }

    /* renamed from: f */
    public final boolean mo172048f(float f, float f2) {
        if (!this.f341389b.mo172689f()) {
            return false;
        }
        this.f341397l = this.f341396k.mo171633a().f339663A.f342783b.f342820p;
        this.f341398m = f2;
        return false;
    }

    /* renamed from: g */
    public final boolean mo172049g(float f, float f2) {
        C113896kq.m157658a(Float.valueOf(f), Float.valueOf(f2));
        if (this.f341389b.mo172689f()) {
            this.f341396k.mo171633a().mo171237c(Math.pow(2.0d, (double) (((this.f341398m - f2) * f341387j) / ((float) this.f341396k.mo171639g().height()))) * ((double) this.f341397l));
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo172050h(float f, float f2) {
        return false;
    }

    /* renamed from: i */
    public final boolean mo172051i(float f, float f2) {
        this.f341396k.mo171633a().f339685o.mo173098e();
        return false;
    }

    /* renamed from: j */
    public final boolean mo172052j(float f, float f2) {
        return false;
    }

    /* renamed from: k */
    public final boolean mo172053k(float f, float f2) {
        return false;
    }

    /* renamed from: a */
    private void m158886a(C114094px pxVar) {
        this.f341389b = pxVar;
        boolean a = pxVar.mo172684a();
        C113532ba baVar = this.f341391d;
        if (baVar != null) {
            if (a) {
                baVar.mo171579b((C113711ev) this);
            } else {
                baVar.mo171559a((C113711ev) this);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo172037a(float f, float f2) {
        if (!this.f341389b.mo172689f()) {
            return false;
        }
        final C113503ad a = this.f341396k.mo171633a();
        C1140861 r1 = new Runnable() {
            public final void run() {
                a.mo171253p();
            }
        };
        if (a.f339674L) {
            C114367v.C114370b bVar = a.f339663A.f342799r;
            if (bVar != null) {
                float width = ((float) a.f339696z.mo171639g().width()) * (bVar.f342822a + 0.5f);
                float f3 = width;
                f2 = (bVar.f342823b + 0.5f) * ((float) a.f339696z.mo171639g().height());
                f = f3;
            } else {
                a.mo171219a((Runnable) r1);
                return false;
            }
        }
        if (!a.mo171249l()) {
            return false;
        }
        Rect rect = a.f339663A.f342795n;
        int height = rect.height();
        float t = a.f339696z.mo171638f().mo172958t();
        int i = rect.top;
        if (f2 >= ((float) i) && f2 < ((float) (i + height)) - t) {
            f2 = ((float) (i + height)) - t;
        }
        a.f339696z.mo171638f().mo172933c(f, f2);
        r1.run();
        return false;
    }

    /* renamed from: b */
    public final boolean mo172040b() {
        C113896kq.m157658a(new Object[0]);
        if (this.f341389b.mo172692i()) {
            final C113503ad a = this.f341396k.mo171633a();
            a.mo171235b((Runnable) new Runnable() {
                public final void run() {
                    a.mo171253p();
                }
            });
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo172043c() {
        if (this.f341388a) {
            this.f341396k.mo171633a().f339685o.mo173098e();
            this.f341388a = false;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo172036a(float f) {
        if (!this.f341389b.mo172687d()) {
            return false;
        }
        double d = (double) ((f / 8.0f) * 2.0f);
        C113503ad a = this.f341396k.mo171633a();
        a.f339685o.mo173098e();
        a.mo171233b(new C113831iz(102, new double[]{0.0d, d}));
        return true;
    }

    /* renamed from: a */
    public final boolean mo172039a(PointF pointF, PointF pointF2, float f) {
        PointF pointF3 = pointF;
        PointF pointF4 = pointF2;
        if (!this.f341389b.mo172688e()) {
            return false;
        }
        C113503ad a = this.f341396k.mo171633a();
        double d = (double) f;
        double d2 = (double) pointF3.x;
        double d3 = (double) pointF3.y;
        double d4 = (double) pointF4.x;
        double d5 = (double) pointF4.y;
        a.f339685o.mo173098e();
        float width = ((float) a.f339696z.mo171639g().width()) / 2.0f;
        float height = ((float) a.f339696z.mo171639g().height()) / 2.0f;
        C114367v.C114370b bVar = a.f339663A.f342799r;
        if (a.f339675M) {
            if (bVar != null) {
                d2 = (double) (width + (bVar.f342822a * width * 2.0f));
                d3 = (double) (height + (bVar.f342823b * height * 2.0f));
            } else {
                d3 = (double) height;
                d2 = (double) width;
            }
            d4 = d2;
            d5 = d3;
        }
        a.mo171240c(new C113831iz(103, new double[]{d, d2, d3, d4, d5}));
        return false;
    }

    /* renamed from: a */
    public final boolean mo172038a(PointF pointF, PointF pointF2, double d, double d2) {
        PointF pointF3 = pointF;
        PointF pointF4 = pointF2;
        if (!this.f341389b.mo172693j()) {
            return false;
        }
        final C113503ad a = this.f341396k.mo171633a();
        a.mo171200a(d2 / d, (double) pointF3.x, (double) pointF3.y, (double) pointF4.x, (double) pointF4.y, new Runnable() {
            public final void run() {
                a.mo171253p();
            }
        });
        return false;
    }
}
