package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.engine.jni.JNI;
import com.tencent.mapsdk.engine.jni.models.TappedElement;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.qh */
public final class C114108qh extends C114027oy {

    /* renamed from: a */
    public C114109qi f341526a;

    /* renamed from: n */
    public C114021ot f341527n;

    /* renamed from: o */
    public Selectable.OnSelectedListener f341528o;

    /* renamed from: p */
    public C113732fo f341529p = new C113732fo();

    /* renamed from: q */
    public C113814ho f341530q;

    /* renamed from: r */
    private C113960mp f341531r;

    /* renamed from: s */
    private C113536be f341532s;

    /* renamed from: t */
    private C113814ho f341533t = null;

    /* renamed from: u */
    private final C113521ap f341534u;

    public C114108qh(C113521ap apVar, C113532ba baVar, C114109qi qiVar) {
        super(baVar);
        this.f341534u = apVar;
        this.f341531r = baVar.mo171585c();
        this.f341532s = (C113536be) baVar.getMapContext();
        this.f341526a = qiVar;
        this.f341527n = new C114021ot(qiVar);
        this.f341067h = true;
        mo172718a(qiVar);
    }

    /* renamed from: A */
    private C114021ot m159097A() {
        return this.f341527n;
    }

    /* renamed from: B */
    private boolean m159098B() {
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            return otVar.f341019w;
        }
        return false;
    }

    /* renamed from: C */
    private float m159099C() {
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            return otVar.f341012p;
        }
        return 0.0f;
    }

    /* renamed from: D */
    private float m159100D() {
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            return otVar.f341013q;
        }
        return 0.0f;
    }

    /* renamed from: E */
    private float m159101E() {
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            return otVar.f341014r;
        }
        return 0.0f;
    }

    /* renamed from: F */
    private float m159102F() {
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            return otVar.f341015s;
        }
        return 0.0f;
    }

    /* renamed from: G */
    private boolean m159103G() {
        C114109qi qiVar = this.f341526a;
        if (qiVar != null) {
            return qiVar.f341549n;
        }
        return false;
    }

    /* renamed from: H */
    private static boolean m159104H() {
        return false;
    }

    /* renamed from: I */
    private boolean m159105I() {
        C114109qi qiVar = this.f341526a;
        if (qiVar != null) {
            return qiVar.f341561z;
        }
        return true;
    }

    /* renamed from: a */
    private void m159107a(C113814ho hoVar) {
        this.f341530q = hoVar;
    }

    /* renamed from: b */
    private void m159108b(C113814ho hoVar) {
        if (hoVar != null) {
            this.f341533t = hoVar;
            hoVar.mo172192a();
        }
    }

    /* renamed from: t */
    private void m159111t() {
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            otVar.f341011o = true;
        }
    }

    /* renamed from: u */
    private GeoPoint m159112u() {
        return this.f341526a.f341544i;
    }

    /* renamed from: v */
    private int m159113v() {
        return this.f341526a.f341550o;
    }

    /* renamed from: w */
    private float m159114w() {
        return this.f341526a.f341548m;
    }

    /* renamed from: x */
    private float m159115x() {
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            return otVar.f341017u;
        }
        return 1.0f;
    }

    /* renamed from: y */
    private float m159116y() {
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            return otVar.f341018v;
        }
        return 1.0f;
    }

    /* renamed from: z */
    private C114109qi m159117z() {
        return this.f341526a;
    }

    /* renamed from: c */
    public final void mo172723c(boolean z) {
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            otVar.f341022z = z;
            otVar.f341011o = true;
        }
    }

    /* renamed from: d */
    public final float mo172012d() {
        return this.f341526a.f341546k;
    }

    /* renamed from: e */
    public final float mo172013e() {
        return this.f341526a.f341547l;
    }

    /* renamed from: f */
    public final int mo172014f() {
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            return otVar.f341002f;
        }
        return -1;
    }

    /* renamed from: f_ */
    public final C113521ap mo171394f_() {
        return this.f341534u;
    }

    /* renamed from: g */
    public final void mo172015g() {
        C114109qi qiVar = this.f341526a;
        if (qiVar != null) {
            qiVar.f341560y = false;
        }
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            otVar.mo172591c(false);
            this.f341527n.f341011o = true;
        }
    }

    public final int getZIndex() {
        return this.f341526a.f341554s;
    }

    /* renamed from: h */
    public final void mo171381h() {
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            otVar.f341002f = 0;
        }
        C113814ho hoVar = this.f341530q;
        if (hoVar != null) {
            hoVar.f340545b = false;
        }
    }

    /* renamed from: i */
    public final boolean mo172724i() {
        C114021ot otVar = this.f341527n;
        if (otVar == null) {
            return false;
        }
        return otVar.f341022z;
    }

    public final boolean isSelected() {
        return this.f341527n.f341030H == 1;
    }

    /* renamed from: j_ */
    public final void mo172596j_() {
        if (this.f341531r != null) {
            if (!isVisible()) {
                C114021ot otVar = this.f341527n;
                if (otVar != null) {
                    otVar.f341002f = -1;
                    return;
                }
                return;
            }
            C113814ho hoVar = this.f341533t;
            if (hoVar != null) {
                if (!hoVar.f340547d) {
                    hoVar.mo172194b();
                } else {
                    this.f341533t = null;
                }
            }
            C113814ho hoVar2 = this.f341530q;
            if (hoVar2 != null && !hoVar2.f340547d) {
                hoVar2.mo172194b();
            }
            C114021ot otVar2 = this.f341527n;
            if (otVar2 != null) {
                C113960mp mpVar = this.f341531r;
                int i = otVar2.f341002f;
                if (i <= 0 || !mpVar.f340864c.containsKey(Integer.valueOf(i))) {
                    C114216sq sqVar = mpVar.f340863b;
                    int intValue = ((Integer) sqVar.mo172900a(new CallbackRunnable<Integer>(otVar2) {
                        /* renamed from: a */
                        private Integer m159981a() {
                            if (0 == C114216sq.this.f342024e) {
                                return 0;
                            }
                            JNI c = C114216sq.this.f342023d;
                            long b = C114216sq.this.f342024e;
                            C114021ot otVar = r2;
                            String str = otVar.f341003g;
                            double d = otVar.f341005i;
                            double d2 = otVar.f341006j;
                            float f = otVar.f341009m;
                            float f2 = otVar.f341010n;
                            float f3 = otVar.f341017u;
                            float f4 = otVar.f341018v;
                            float f5 = otVar.f341016t;
                            float a = otVar.mo172582a();
                            C114021ot otVar2 = r2;
                            return Integer.valueOf(c.nativeAddMarker(b, str, d, d2, f, f2, f3, f4, f5, a, otVar2.f341020x, otVar2.f341019w, otVar2.f341022z, otVar2.f340991A, otVar2.f340992B, otVar2.f340994D, otVar2.f340993C));
                        }

                        public final /* synthetic */ Object run() {
                            if (0 == C114216sq.this.f342024e) {
                                return 0;
                            }
                            JNI c = C114216sq.this.f342023d;
                            long b = C114216sq.this.f342024e;
                            C114021ot otVar = r2;
                            String str = otVar.f341003g;
                            double d = otVar.f341005i;
                            double d2 = otVar.f341006j;
                            float f = otVar.f341009m;
                            float f2 = otVar.f341010n;
                            float f3 = otVar.f341017u;
                            float f4 = otVar.f341018v;
                            float f5 = otVar.f341016t;
                            float a = otVar.mo172582a();
                            C114021ot otVar2 = r2;
                            return Integer.valueOf(c.nativeAddMarker(b, str, d, d2, f, f2, f3, f4, f5, a, otVar2.f341020x, otVar2.f341019w, otVar2.f341022z, otVar2.f340991A, otVar2.f340992B, otVar2.f340994D, otVar2.f340993C));
                        }
                    }, 0)).intValue();
                    otVar2.f341002f = intValue;
                    if (intValue > 0) {
                        C104548ha.f309920b.mo147863a(otVar2.f341003g, otVar2.mo147886d());
                        otVar2.mo172588a(false);
                        otVar2.f341011o = false;
                        mpVar.f340865d.put(Integer.valueOf(otVar2.f341002f), otVar2);
                    }
                } else {
                    if (otVar2.f341011o) {
                        C114216sq sqVar2 = mpVar.f340863b;
                        if (0 != sqVar2.f342024e) {
                            sqVar2.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(otVar2) {
                                /* renamed from: a */
                                public final void mo54067a(GL10 gl10) {
                                    if (C114216sq.this.f342024e != 0) {
                                        JNI c = C114216sq.this.f342023d;
                                        long b = C114216sq.this.f342024e;
                                        C114021ot otVar = r6;
                                        int i = otVar.f341002f;
                                        String str = otVar.f341003g;
                                        double d = otVar.f341005i;
                                        double d2 = otVar.f341006j;
                                        float f = otVar.f341009m;
                                        float f2 = otVar.f341010n;
                                        float f3 = otVar.f341017u;
                                        float f4 = otVar.f341018v;
                                        float f5 = otVar.f341016t;
                                        float a = otVar.mo172582a();
                                        C114021ot otVar2 = r6;
                                        c.nativeUpdateMarkerInfo(b, i, str, d, d2, f, f2, f3, f4, f5, a, otVar2.f341020x, otVar2.f341019w, otVar2.f341022z, otVar2.f340991A, otVar2.f340992B, otVar2.f340994D, otVar2.f340993C);
                                    }
                                }
                            });
                        }
                        if (otVar2.f341021y) {
                            C104548ha.f309920b.mo147863a(otVar2.f341003g, otVar2.mo147886d());
                            otVar2.mo172588a(false);
                        }
                    }
                    otVar2.f341011o = false;
                    mpVar.f340865d.put(Integer.valueOf(otVar2.f341002f), otVar2);
                }
                int i2 = this.f341527n.f341002f;
                if (i2 != 0) {
                    this.f341070k = i2;
                }
            }
        }
    }

    public final boolean onTap(float f, float f2) {
        C113536be beVar;
        Selectable.OnSelectedListener onSelectedListener;
        if (!isVisible() || this.f341526a.f341544i == null || (beVar = this.f341532s) == null) {
            return false;
        }
        TappedElement a = beVar.mo171638f().mo172899a(f, f2);
        boolean z = a != null && a.itemId == ((long) mo172014f());
        if (z) {
            this.f341527n.mo172589b(1);
        } else {
            this.f341527n.mo172589b(0);
        }
        if (z && (onSelectedListener = this.f341528o) != null) {
            onSelectedListener.onSelected(this);
        }
        return z;
    }

    public final void setLevel(int i) {
        C114109qi qiVar = this.f341526a;
        qiVar.f341555t = i;
        this.f341526a = qiVar;
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            otVar.f340993C = i;
            otVar.f341011o = true;
        }
    }

    public final void setSelected(boolean z) {
        if (z) {
            this.f341527n.mo172589b(1);
        } else {
            this.f341527n.mo172589b(0);
        }
    }

    public final void setSelectedListener(Selectable.OnSelectedListener onSelectedListener) {
        this.f341528o = onSelectedListener;
    }

    public final void setZIndex(int i) {
        C114109qi qiVar = this.f341526a;
        qiVar.f341554s = i;
        this.f341526a = qiVar;
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            otVar.f340994D = i;
            otVar.f341011o = true;
        }
    }

    /* renamed from: a */
    public final void mo172718a(C114109qi qiVar) {
        if (qiVar != null) {
            this.f341526a = qiVar;
            C114021ot otVar = this.f341527n;
            if (otVar == null) {
                this.f341527n = new C114021ot(qiVar);
            } else {
                otVar.mo172586a(qiVar);
            }
        }
    }

    /* renamed from: d */
    private void m159110d(boolean z) {
        this.f341526a.f341551p = z;
    }

    /* renamed from: b */
    public final Rect mo171428b(C113707es esVar) {
        C114109qi qiVar;
        if (this.f341527n == null || (qiVar = this.f341526a) == null || qiVar.f341544i == null) {
            return null;
        }
        if (m159098B()) {
            GeoPoint geoPoint = this.f341526a.f341544i;
            C113732fo foVar = new C113732fo(0.0d, 0.0d);
            if (geoPoint != null) {
                foVar.f340215a = (double) geoPoint.getLongitudeE6();
                foVar.f340216b = (double) geoPoint.getLatitudeE6();
            }
            this.f341529p = foVar;
        } else {
            this.f341529p = esVar.mo172027a(this.f341526a.f341544i);
        }
        C113732fo foVar2 = new C113732fo();
        C113732fo foVar3 = new C113732fo();
        Bitmap d = this.f341527n.mo147886d();
        if (d == null) {
            return null;
        }
        int width = d.getWidth();
        int height = d.getHeight();
        C113732fo foVar4 = this.f341529p;
        foVar2.f340215a = foVar4.f340215a;
        foVar3.f340215a = foVar4.f340215a + ((double) width);
        foVar2.f340216b = foVar4.f340216b;
        foVar3.f340216b = foVar4.f340216b + ((double) height);
        C114109qi qiVar2 = this.f341526a;
        int i = (int) (qiVar2.f341546k * ((float) width));
        int i2 = (int) (qiVar2.f341547l * ((float) height));
        double d2 = (double) i;
        foVar2.f340215a -= d2;
        foVar3.f340215a -= d2;
        double d3 = (double) i2;
        foVar2.f340216b -= d3;
        foVar3.f340216b -= d3;
        int i3 = qiVar2.f341552q;
        int i4 = qiVar2.f341553r;
        double d4 = (double) i3;
        foVar2.f340215a += d4;
        foVar3.f340215a += d4;
        double d5 = (double) i4;
        foVar2.f340216b += d5;
        foVar3.f340216b += d5;
        GeoPoint a = esVar.mo172025a(foVar2);
        GeoPoint a2 = esVar.mo172025a(foVar3);
        return new Rect(a.getLongitudeE6(), a.getLatitudeE6(), a2.getLongitudeE6(), a2.getLatitudeE6());
    }

    /* renamed from: a */
    public final Rect mo171426a(C113707es esVar) {
        C114109qi qiVar;
        int i;
        if (this.f341527n == null || (qiVar = this.f341526a) == null || qiVar.f341544i == null) {
            return null;
        }
        if (m159098B()) {
            GeoPoint geoPoint = this.f341526a.f341544i;
            C113732fo foVar = new C113732fo(0.0d, 0.0d);
            if (geoPoint != null) {
                foVar.f340215a = (double) geoPoint.getLongitudeE6();
                foVar.f340216b = (double) geoPoint.getLatitudeE6();
            }
            this.f341529p = foVar;
        } else {
            this.f341529p = esVar.mo172027a(this.f341526a.f341544i);
        }
        C113732fo foVar2 = new C113732fo();
        C113732fo foVar3 = new C113732fo();
        Bitmap d = this.f341527n.mo147886d();
        int i2 = 0;
        if (d != null) {
            i2 = d.getWidth();
            i = d.getHeight();
        } else {
            i = 0;
        }
        C113732fo foVar4 = this.f341529p;
        foVar2.f340215a = foVar4.f340215a;
        foVar3.f340215a = foVar4.f340215a + ((double) i2);
        foVar2.f340216b = foVar4.f340216b;
        foVar3.f340216b = foVar4.f340216b + ((double) i);
        C114109qi qiVar2 = this.f341526a;
        int i3 = (int) (qiVar2.f341546k * ((float) i2));
        int i4 = (int) (qiVar2.f341547l * ((float) i));
        double d2 = (double) i3;
        foVar2.f340215a -= d2;
        foVar3.f340215a -= d2;
        double d3 = (double) i4;
        foVar2.f340216b -= d3;
        foVar3.f340216b -= d3;
        int i5 = qiVar2.f341552q;
        int i6 = qiVar2.f341553r;
        double d4 = (double) i5;
        foVar2.f340215a += d4;
        foVar3.f340215a += d4;
        double d5 = (double) i6;
        foVar2.f340216b += d5;
        foVar3.f340216b += d5;
        return new Rect((int) foVar2.f340215a, (int) foVar2.f340216b, (int) foVar3.f340215a, (int) foVar3.f340216b);
    }

    /* renamed from: b */
    private void m159109b(String str, Bitmap... bitmapArr) {
        mo172719a(str, bitmapArr);
    }

    /* renamed from: a */
    private void m159106a(int i, int i2) {
        C114109qi qiVar = this.f341526a;
        qiVar.f341552q = i;
        qiVar.f341553r = i2;
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            otVar.f341007k = i;
            otVar.f341008l = i2;
            otVar.f341011o = true;
            otVar.f341011o = true;
        }
    }

    /* renamed from: b */
    public final void mo172721b(float f, float f2) {
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            otVar.f341017u = f;
            otVar.f341018v = f2;
            otVar.f341011o = true;
            otVar.f341011o = true;
        }
    }

    /* renamed from: b */
    public final void mo172722b(boolean z) {
        C114109qi qiVar = this.f341526a;
        if (qiVar != null) {
            qiVar.f341559x = z;
        }
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            otVar.mo172590b(z);
            this.f341527n.f341011o = true;
        }
    }

    /* renamed from: a */
    public final void mo172719a(String str, Bitmap... bitmapArr) {
        this.f341526a = this.f341526a.mo172726a(str, bitmapArr);
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            otVar.mo172587a(str, bitmapArr);
            this.f341527n.f341011o = true;
        }
    }

    /* renamed from: a */
    public final void mo172717a(GeoPoint geoPoint) {
        C114109qi qiVar = this.f341526a;
        qiVar.f341544i = geoPoint;
        this.f341526a = qiVar;
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            if (geoPoint != null) {
                double d = otVar.f341019w ? 1.0d : 1000000.0d;
                otVar.f341005i = ((double) geoPoint.getLongitudeE6()) / d;
                otVar.f341006j = ((double) geoPoint.getLatitudeE6()) / d;
                otVar.f341011o = true;
            }
            this.f341527n.f341011o = true;
        }
    }

    /* renamed from: a */
    public final void mo172716a(int i) {
        C114109qi qiVar = this.f341526a;
        qiVar.f341550o = i;
        this.f341526a = qiVar;
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            otVar.mo172585a(i);
            this.f341527n.f341011o = true;
        }
    }

    /* renamed from: a */
    public final void mo172714a(float f) {
        C114109qi qiVar = this.f341526a;
        qiVar.f341548m = f;
        this.f341526a = qiVar;
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            otVar.mo172583a(f);
            this.f341527n.f341011o = true;
        }
    }

    /* renamed from: a */
    public final void mo172715a(float f, float f2) {
        this.f341526a = this.f341526a.mo172725a(f, f2);
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            otVar.mo172584a(f, f2);
            this.f341527n.f341011o = true;
        }
    }

    /* renamed from: a */
    public final void mo172720a(boolean z) {
        C114021ot otVar = this.f341527n;
        if (otVar != null) {
            otVar.f341019w = z;
            otVar.f341011o = true;
        }
    }
}
