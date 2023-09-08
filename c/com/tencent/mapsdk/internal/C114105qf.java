package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.mapsdk.internal.C114105qf;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.qf */
public final class C114105qf extends C114027oy {

    /* renamed from: A */
    private C113521ap f341507A;

    /* renamed from: a */
    public C113736fs f341508a;

    /* renamed from: n */
    public int[] f341509n;

    /* renamed from: o */
    public int[] f341510o;

    /* renamed from: p */
    public int f341511p;

    /* renamed from: q */
    public GeoPoint f341512q;

    /* renamed from: r */
    public int f341513r = -1;

    /* renamed from: s */
    public C114106a f341514s;

    /* renamed from: t */
    private C113536be f341515t;

    /* renamed from: u */
    private boolean f341516u = true;

    /* renamed from: v */
    private Selectable.OnSelectedListener f341517v;

    /* renamed from: w */
    private float f341518w = -1.0f;

    /* renamed from: x */
    private int f341519x = -1;

    /* renamed from: y */
    private C113960mp f341520y;

    /* renamed from: z */
    private boolean f341521z;

    /* renamed from: com.tencent.mapsdk.internal.qf$a */
    public static class C114106a {

        /* renamed from: a */
        public int f341522a;

        /* renamed from: b */
        public int f341523b;
    }

    public C114105qf(C113521ap apVar, C113532ba baVar, C113736fs fsVar) {
        super(baVar);
        this.f341507A = apVar;
        this.f341520y = baVar.mo171585c();
        mo172712a(fsVar);
    }

    /* renamed from: A */
    private boolean m159045A() {
        return this.f341508a.f340281w;
    }

    /* renamed from: B */
    private boolean m159046B() {
        return this.f341508a.f340284z;
    }

    /* renamed from: C */
    private boolean m159047C() {
        return this.f341508a.f340256B;
    }

    /* renamed from: D */
    private int m159048D() {
        return this.f341508a.f340257C;
    }

    /* renamed from: E */
    private boolean m159049E() {
        return this.f341508a.f340269O;
    }

    /* renamed from: F */
    private float m159050F() {
        return this.f341508a.f340282x;
    }

    /* renamed from: G */
    private float m159051G() {
        C113736fs fsVar = this.f341508a;
        if (fsVar == null) {
            return 1.0f;
        }
        return fsVar.f340255A;
    }

    /* renamed from: H */
    private C114106a m159052H() {
        return this.f341514s;
    }

    /* renamed from: I */
    private String m159053I() {
        C113736fs fsVar = this.f341508a;
        int[] iArr = fsVar.f340276r;
        if (iArr != null && iArr.length > 0) {
            int i = iArr[0];
            if (i == 33) {
                return C113736fs.f340253j;
            }
            if (i == 20) {
                return C113736fs.f340254k;
            }
        }
        return C40002he.m42805a(fsVar.f340283y) ? C113736fs.f340252i : this.f341508a.f340283y;
    }

    /* renamed from: J */
    private int m159054J() {
        return this.f341513r;
    }

    /* renamed from: K */
    private boolean m159055K() {
        return this.f341508a.f340258D;
    }

    /* renamed from: L */
    private boolean m159056L() {
        return this.f341508a.f340259E;
    }

    /* renamed from: M */
    private Rect m159057M() {
        int i;
        Rect rect;
        ArrayList<GeoPoint> arrayList = this.f341508a.f340270l;
        if (arrayList != null && !arrayList.isEmpty() && (i = this.f341511p) >= 0 && i < arrayList.size()) {
            List<GeoPoint> subList = arrayList.subList(this.f341511p, arrayList.size());
            if (subList == null || subList.isEmpty()) {
                rect = null;
            } else {
                GeoPoint geoPoint = subList.get(0);
                int longitudeE6 = geoPoint.getLongitudeE6();
                int longitudeE62 = geoPoint.getLongitudeE6();
                int latitudeE6 = geoPoint.getLatitudeE6();
                int latitudeE62 = geoPoint.getLatitudeE6();
                int size = subList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    GeoPoint geoPoint2 = subList.get(i2);
                    if (geoPoint2 != null) {
                        int latitudeE63 = geoPoint2.getLatitudeE6();
                        int longitudeE63 = geoPoint2.getLongitudeE6();
                        if (longitudeE63 < longitudeE6) {
                            longitudeE6 = longitudeE63;
                        } else if (longitudeE63 > longitudeE62) {
                            longitudeE62 = longitudeE63;
                        }
                        if (latitudeE63 < latitudeE62) {
                            latitudeE62 = latitudeE63;
                        } else if (latitudeE63 > latitudeE6) {
                            latitudeE6 = latitudeE63;
                        }
                    }
                }
                rect = new Rect(longitudeE6, latitudeE6, longitudeE62, latitudeE62);
            }
            if (rect != null) {
                this.f341508a.f340260F = rect;
            }
        }
        return this.f341508a.f340260F;
    }

    /* renamed from: N */
    private String m159058N() {
        return this.f341508a.f340262H;
    }

    /* renamed from: O */
    private float m159059O() {
        return this.f341508a.f340263I;
    }

    /* renamed from: P */
    private int[] m159060P() {
        C113736fs fsVar = this.f341508a;
        return new int[]{fsVar.f340264J, fsVar.f340265K};
    }

    /* renamed from: Q */
    private List<Integer> m159061Q() {
        return this.f341508a.f340266L;
    }

    /* renamed from: c */
    private void m159073c(float f) {
        C113736fs fsVar = this.f341508a;
        if (fsVar != null && f >= 0.0f && f <= 1.0f) {
            fsVar.f340255A = f;
        }
    }

    /* renamed from: e */
    private ArrayList<GeoPoint> m159075e() {
        return this.f341508a.f340271m;
    }

    /* renamed from: f */
    private int[] m159076f() {
        return this.f341509n;
    }

    /* renamed from: g */
    private int[] m159077g() {
        return this.f341510o;
    }

    /* renamed from: h */
    private boolean m159078h() {
        return this.f341508a.f340280v;
    }

    /* renamed from: i */
    private int[] m159079i() {
        return this.f341508a.f340277s;
    }

    /* renamed from: t */
    private int[] m159080t() {
        return this.f341508a.f340278t;
    }

    /* renamed from: u */
    private float m159081u() {
        return this.f341508a.f340279u;
    }

    /* renamed from: v */
    private int[] m159082v() {
        return this.f341508a.f340272n;
    }

    /* renamed from: w */
    private int[] m159083w() {
        return this.f341508a.f340273o;
    }

    /* renamed from: x */
    private String[] m159084x() {
        return this.f341508a.f340274p;
    }

    /* renamed from: y */
    private GeoPoint m159085y() {
        return this.f341512q;
    }

    /* renamed from: z */
    private int m159086z() {
        return this.f341511p;
    }

    /* renamed from: a */
    public final Rect mo171426a(C113707es esVar) {
        Rect b = mo171428b(esVar);
        if (b == null) {
            return null;
        }
        GeoPoint geoPoint = new GeoPoint(b.top, b.left);
        GeoPoint geoPoint2 = new GeoPoint(b.bottom, b.right);
        C113732fo a = esVar.mo172027a(geoPoint);
        C113732fo a2 = esVar.mo172027a(geoPoint2);
        return new Rect((int) a.f340215a, (int) a.f340216b, (int) a2.f340215a, (int) a2.f340216b);
    }

    /* renamed from: b */
    public final Rect mo171428b(C113707es esVar) {
        ArrayList<GeoPoint> arrayList;
        C113736fs fsVar = this.f341508a;
        if (fsVar == null || (arrayList = fsVar.f340271m) == null || arrayList.isEmpty()) {
            return null;
        }
        Iterator<GeoPoint> it = this.f341508a.f340271m.iterator();
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            GeoPoint next = it.next();
            int latitudeE6 = next.getLatitudeE6();
            int longitudeE6 = next.getLongitudeE6();
            if (latitudeE6 > i3) {
                i3 = latitudeE6;
            }
            if (latitudeE6 < i2) {
                i2 = latitudeE6;
            }
            if (longitudeE6 > i4) {
                i4 = longitudeE6;
            }
            if (longitudeE6 < i) {
                i = longitudeE6;
            }
        }
        return new Rect(i, i3, i4, i2);
    }

    /* renamed from: d */
    public final void mo172012d() {
        C114106a aVar = this.f341514s;
        if (aVar != null) {
            aVar.f341522a = -1;
            mo172606q();
        }
    }

    /* renamed from: f_ */
    public final C113521ap mo171394f_() {
        return this.f341507A;
    }

    public final int getLevel() {
        return this.f341508a.f340267M;
    }

    public final int getZIndex() {
        return this.f341508a.f340261G;
    }

    /* renamed from: h_ */
    public final void mo172595h_() {
        this.f341521z = true;
    }

    public final boolean isSelected() {
        return this.f341516u;
    }

    /* renamed from: j_ */
    public final void mo172596j_() {
        C113960mp mpVar = this.f341520y;
        if (mpVar != null) {
            C113536be beVar = mpVar.f340862a;
            this.f341515t = beVar;
            C114322sx sxVar = (C114322sx) beVar.mo171634b();
            if (sxVar != null) {
                if (!this.f341521z || this.f341513r == -1) {
                    float f = mpVar.f340862a.mo171633a().f339663A.f342783b.f342820p;
                    float f2 = this.f341518w;
                    if (f2 == -1.0f || f2 != f) {
                        this.f341518w = f;
                    }
                    if (this.f341513r == -1) {
                        C114216sq f3 = this.f341515t.mo171638f();
                        this.f341513r = ((Integer) f3.mo172900a(new CallbackRunnable<Integer>(this) {
                            /* renamed from: a */
                            private Integer m159956a() {
                                C114105qf qfVar = r2;
                                if (qfVar == null) {
                                    return -1;
                                }
                                int i = qfVar.f341513r;
                                return i != -1 ? Integer.valueOf(i) : Integer.valueOf(C114216sq.m159724a(C114216sq.this, qfVar));
                            }

                            public final /* synthetic */ Object run() {
                                C114105qf qfVar = r2;
                                if (qfVar == null) {
                                    return -1;
                                }
                                int i = qfVar.f341513r;
                                return i != -1 ? Integer.valueOf(i) : Integer.valueOf(C114216sq.m159724a(C114216sq.this, qfVar));
                            }
                        }, -1)).intValue();
                        C113889km.m157545b(C0949kl.f2236f, "createLine..." + this.f341513r);
                    }
                    if (mo172605p()) {
                        C114216sq f4 = this.f341515t.mo171638f();
                        f4.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(this) {
                            /* renamed from: a */
                            public final void mo54067a(GL10 gl10) {
                                C114105qf qfVar = r2;
                                if (qfVar != null && qfVar.f341513r != -1) {
                                    C114216sq.m159724a(C114216sq.this, qfVar);
                                    C114216sq sqVar = C114216sq.this;
                                    C114105qf qfVar2 = r2;
                                    if (sqVar.f342024e != 0) {
                                        sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(qfVar2) {
                                            /* renamed from: a */
                                            public final void mo54067a(GL10 gl10) {
                                                C114105qf qfVar = r6;
                                                int i = qfVar.f341513r;
                                                if (i != -1) {
                                                    C113736fs fsVar = qfVar.f341508a;
                                                    int[] iArr = {fsVar.f340264J, fsVar.f340265K};
                                                    C114216sq.this.f342023d.nativeSetTurnArrowStyle(C114216sq.this.f342024e, (long) i, iArr[0], iArr[1]);
                                                }
                                            }
                                        });
                                    }
                                    C114216sq sqVar2 = C114216sq.this;
                                    sqVar2.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(r2) {
                                        /* renamed from: a */
                                        public final void mo54067a(GL10 gl10) {
                                            C114105qf.C114106a aVar;
                                            C114105qf qfVar = r2;
                                            int i = qfVar.f341513r;
                                            if (i != -1 && (aVar = qfVar.f341514s) != null) {
                                                C114216sq.this.f342023d.nativeSetTurnArrow(C114216sq.this.f342024e, (long) i, r2.f341508a.f340271m, aVar.f341522a, aVar.f341523b);
                                            }
                                        }
                                    });
                                    C114216sq sqVar3 = C114216sq.this;
                                    C114105qf qfVar3 = r2;
                                    if (sqVar3.f342024e != 0) {
                                        sqVar3.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(qfVar3) {
                                            /* renamed from: a */
                                            public final void mo54067a(GL10 gl10) {
                                                int i = r6.f341513r;
                                                if (i != -1) {
                                                    C114216sq.this.f342023d.nativeSetLineDrawArrow(C114216sq.this.f342024e, (long) i, r6.f341508a.f340281w);
                                                }
                                            }
                                        });
                                    }
                                    C114105qf qfVar4 = r2;
                                    if (qfVar4.f341508a.f340259E) {
                                        C114216sq sqVar4 = C114216sq.this;
                                        if (sqVar4.f342024e != 0) {
                                            sqVar4.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(qfVar4) {
                                                /* renamed from: a */
                                                public final void mo54067a(GL10 gl10) {
                                                    GeoPoint geoPoint;
                                                    C114105qf qfVar = r6;
                                                    int i = qfVar.f341513r;
                                                    if (i != -1 && (geoPoint = qfVar.f341512q) != null) {
                                                        C114216sq.this.f342023d.nativeLineClearPoint(C114216sq.this.f342024e, (long) i, geoPoint, r6.f341511p);
                                                    }
                                                }
                                            });
                                        }
                                    } else {
                                        C114216sq sqVar5 = C114216sq.this;
                                        if (sqVar5.f342024e != 0) {
                                            sqVar5.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(qfVar4) {
                                                /* renamed from: a */
                                                public final void mo54067a(GL10 gl10) {
                                                    GeoPoint geoPoint;
                                                    C114105qf qfVar = r6;
                                                    int i = qfVar.f341513r;
                                                    if (i != -1 && (geoPoint = qfVar.f341512q) != null) {
                                                        C114216sq.this.f342023d.nativeLineInsertPoint(C114216sq.this.f342024e, (long) i, geoPoint, r6.f341511p);
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    C114216sq sqVar6 = C114216sq.this;
                                    C114105qf qfVar5 = r2;
                                    if (sqVar6.f342024e != 0) {
                                        sqVar6.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(qfVar5) {
                                            /* renamed from: a */
                                            public final void mo54067a(GL10 gl10) {
                                                int i = r6.f341513r;
                                                if (i != -1) {
                                                    C114216sq.this.f342023d.nativeSetDrawCap(C114216sq.this.f342024e, (long) i, r6.f341508a.f340284z);
                                                }
                                            }
                                        });
                                    }
                                    if (!C40002he.m42805a(r2.f341508a.f340262H)) {
                                        C114216sq sqVar7 = C114216sq.this;
                                        C114105qf qfVar6 = r2;
                                        if (sqVar7.f342024e != 0) {
                                            sqVar7.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(qfVar6) {
                                                /* renamed from: a */
                                                public final void mo54067a(GL10 gl10) {
                                                    int i = r6.f341513r;
                                                    if (i != -1) {
                                                        C114216sq.this.f342023d.nativeSetLineDirectionArrowTextureName(C114216sq.this.f342024e, (long) i, r6.f341508a.f340262H);
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    C114216sq sqVar8 = C114216sq.this;
                                    sqVar8.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(r2) {
                                        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
                                            r5 = r2;
                                         */
                                        /* renamed from: a */
                                        /* Code decompiled incorrectly, please refer to instructions dump. */
                                        public final void mo54067a(javax.microedition.khronos.opengles.GL10 r5) {
                                            /*
                                                r4 = this;
                                                com.tencent.mapsdk.internal.sq r5 = com.tencent.mapsdk.internal.C114216sq.this
                                                long r0 = r5.f342024e
                                                r2 = 0
                                                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                                                if (r5 != 0) goto L_0x000d
                                                return
                                            L_0x000d:
                                                com.tencent.mapsdk.internal.qf r5 = r2
                                                int r0 = r5.f341513r
                                                r1 = -1
                                                if (r0 != r1) goto L_0x0015
                                                return
                                            L_0x0015:
                                                com.tencent.mapsdk.internal.fs r5 = r5.f341508a
                                                float r1 = r5.f340263I
                                                r2 = 0
                                                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                                                if (r1 >= 0) goto L_0x001f
                                                return
                                            L_0x001f:
                                                int r5 = r5.f340257C
                                                r1 = 3
                                                if (r5 == r1) goto L_0x003d
                                                if (r5 != 0) goto L_0x0027
                                                goto L_0x003d
                                            L_0x0027:
                                                com.tencent.mapsdk.internal.sq r5 = com.tencent.mapsdk.internal.C114216sq.this
                                                com.tencent.mapsdk.engine.jni.JNI r5 = r5.f342023d
                                                com.tencent.mapsdk.internal.sq r1 = com.tencent.mapsdk.internal.C114216sq.this
                                                long r1 = r1.f342024e
                                                com.tencent.mapsdk.internal.qf r3 = r2
                                                com.tencent.mapsdk.internal.fs r3 = r3.f341508a
                                                float r3 = r3.f340263I
                                                r5.nativeSetLineFootPrintSpacing(r1, r0, r3)
                                                return
                                            L_0x003d:
                                                com.tencent.mapsdk.internal.sq r5 = com.tencent.mapsdk.internal.C114216sq.this
                                                com.tencent.mapsdk.engine.jni.JNI r5 = r5.f342023d
                                                com.tencent.mapsdk.internal.sq r1 = com.tencent.mapsdk.internal.C114216sq.this
                                                long r1 = r1.f342024e
                                                com.tencent.mapsdk.internal.qf r3 = r2
                                                com.tencent.mapsdk.internal.fs r3 = r3.f341508a
                                                float r3 = r3.f340263I
                                                r5.nativeSetLineArrowSpacing(r1, r0, r3)
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114216sq.C11424737.mo54067a(javax.microedition.khronos.opengles.GL10):void");
                                        }
                                    });
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                C113889km.m157545b(C0949kl.f2236f, "deleteLine..." + this.f341513r);
                VectorMap vectorMap = (VectorMap) sxVar.f339878e_;
                vectorMap.f342909o.f340903k.mo171688b((C113709et) this);
                vectorMap.f342909o.f340914v = true;
                C114216sq f5 = this.f341515t.mo171638f();
                f5.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(this.f341513r, this.f341508a.f340256B) {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (r2 != -1) {
                            C114216sq.this.f342023d.nativeDeleteLine(C114216sq.this.f342024e, (long) r2, r3);
                        }
                    }
                });
                this.f341513r = -1;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r5 = r0.mo171638f().mo172899a(r5, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTap(float r5, float r6) {
        /*
            r4 = this;
            com.tencent.mapsdk.internal.be r0 = r4.f341515t
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.tencent.mapsdk.internal.sq r0 = r0.mo171638f()
            com.tencent.mapsdk.engine.jni.models.TappedElement r5 = r0.mo172899a((float) r5, (float) r6)
            if (r5 == 0) goto L_0x001b
            long r5 = r5.itemId
            int r0 = r4.f341513r
            long r2 = (long) r0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x001b
            r5 = 1
            return r5
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114105qf.onTap(float, float):boolean");
    }

    public final void setSelected(boolean z) {
        this.f341516u = z;
        C113536be beVar = this.f341515t;
        if (beVar != null && beVar.mo171638f() != null) {
            C114216sq f = this.f341515t.mo171638f();
            f.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(this) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    int i;
                    if (C114216sq.this.f342024e != 0 && (i = r2.f341513r) != -1) {
                        C114216sq.this.f342023d.nativeSetLineSelected(C114216sq.this.f342024e, (long) i, r2.isSelected());
                    }
                }
            });
        }
    }

    public final void setZIndex(int i) {
        this.f341508a.f340261G = i;
        C113536be beVar = this.f341515t;
        if (beVar != null && beVar.mo171638f() != null) {
            this.f341515t.mo171638f().mo172906a(this.f341519x, (float) i);
        }
    }

    @Deprecated
    /* renamed from: c */
    private void m159074c(String str) {
        this.f341508a.f340283y = str;
    }

    /* renamed from: b */
    private void m159070b(float f) {
        this.f341508a.f340279u = f;
    }

    /* renamed from: a */
    public final void mo172711a(int i, GeoPoint geoPoint) {
        this.f341511p = i;
        this.f341512q = geoPoint;
        mo172606q();
    }

    /* renamed from: b */
    private void m159071b(String str) {
        this.f341508a.f340283y = str;
    }

    /* renamed from: b */
    private void m159072b(boolean z) {
        this.f341508a.f340259E = z;
    }

    /* renamed from: a */
    private void m159067a(boolean z) {
        this.f341508a.f340281w = z;
    }

    /* renamed from: b */
    private static Rect m159069b(List<GeoPoint> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        GeoPoint geoPoint = list.get(0);
        int longitudeE6 = geoPoint.getLongitudeE6();
        int longitudeE62 = geoPoint.getLongitudeE6();
        int latitudeE6 = geoPoint.getLatitudeE6();
        int latitudeE62 = geoPoint.getLatitudeE6();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            GeoPoint geoPoint2 = list.get(i);
            if (geoPoint2 != null) {
                int latitudeE63 = geoPoint2.getLatitudeE6();
                int longitudeE63 = geoPoint2.getLongitudeE6();
                if (longitudeE63 < longitudeE6) {
                    longitudeE6 = longitudeE63;
                } else if (longitudeE63 > longitudeE62) {
                    longitudeE62 = longitudeE63;
                }
                if (latitudeE63 < latitudeE62) {
                    latitudeE62 = latitudeE63;
                } else if (latitudeE63 > latitudeE6) {
                    latitudeE6 = latitudeE63;
                }
            }
        }
        return new Rect(longitudeE6, latitudeE6, longitudeE62, latitudeE62);
    }

    /* renamed from: a */
    private void m159062a(float f) {
        this.f341508a.f340282x = f;
    }

    /* renamed from: a */
    private void m159068a(int[] iArr) {
        this.f341508a.f340278t = iArr;
    }

    /* renamed from: a */
    private void m159064a(int i, int i2) {
        C114106a aVar = new C114106a();
        this.f341514s = aVar;
        aVar.f341522a = i;
        aVar.f341523b = i2;
        mo172606q();
    }

    @Deprecated
    /* renamed from: a */
    private void m159065a(String str) {
        this.f341508a.f340283y = str;
    }

    /* renamed from: a */
    private void m159063a(int i) {
        this.f341513r = i;
    }

    /* renamed from: a */
    public final void mo172712a(C113736fs fsVar) {
        if (fsVar == null || !fsVar.mo172102a()) {
            C113889km.m157544b("LineOptions不能为空！");
        } else if (!fsVar.equals(this.f341508a)) {
            mo172606q();
            this.f341508a = fsVar;
            this.f341509n = fsVar.f340275q;
            this.f341510o = fsVar.f340276r;
        }
    }

    /* renamed from: a */
    private void m159066a(List<Integer> list) {
        this.f341508a.mo172103b(list);
    }
}
