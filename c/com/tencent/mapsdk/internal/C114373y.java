package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import android.opengl.Matrix;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.C113707es;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.mapsdk.internal.C114367v;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.y */
public final class C114373y extends C113745fz implements C113707es {

    /* renamed from: a */
    public static final int f342836a = 268435456;

    /* renamed from: e */
    private static final int f342837e = 19;

    /* renamed from: f */
    private static final int f342838f = 14;

    /* renamed from: b */
    public C114367v f342839b;

    /* renamed from: c */
    public C113961mq f342840c;

    /* renamed from: g */
    private C114216sq f342841g;

    public C114373y(C113536be beVar) {
        super(4.007501668E7d);
        this.f342841g = beVar.mo171638f();
        this.f342839b = beVar.mo171637e();
        this.f342840c = (C113961mq) beVar;
    }

    /* renamed from: a */
    private void m160624a(C114367v vVar) {
        this.f342839b = vVar;
    }

    /* renamed from: b */
    private C114367v m160627b() {
        return this.f342839b;
    }

    /* renamed from: c */
    private C113732fo m160631c(C113732fo foVar) {
        if (foVar == null) {
            return null;
        }
        C114367v vVar = this.f342839b;
        C113732fo foVar2 = vVar.f342798q;
        return new C113732fo(((double) (vVar.f342795n.width() / 2)) + (foVar.f340215a - foVar2.f340215a), ((double) (this.f342839b.f342795n.height() / 2)) - (foVar.f340216b - foVar2.f340216b));
    }

    /* renamed from: d */
    private boolean m160633d() {
        C114367v.C114370b bVar = this.f342839b.f342799r;
        if (bVar == null) {
            return false;
        }
        return ((double) Math.abs(bVar.f342822a)) > 0.25d || ((double) Math.abs(bVar.f342823b)) > 0.25d;
    }

    public final LatLng fromScreenLocation(Point point) {
        return mo172025a(new C113732fo((double) point.x, (double) point.y)).toLatLng();
    }

    public final VisibleRegion getVisibleRegion() {
        C113961mq mqVar = this.f342840c;
        C114322sx sxVar = (C114322sx) mqVar.f339859b;
        float t = mqVar.f340899g.mo172958t();
        int height = this.f342839b.f342795n.height();
        Point point = new Point(0, sxVar.f342570am);
        Point point2 = new Point(sxVar.f342569al, sxVar.f342570am);
        double d = (double) (((float) height) - t);
        C113732fo foVar = new C113732fo(0.0d, d);
        C113732fo foVar2 = new C113732fo((double) sxVar.f342569al, d);
        LatLng fromScreenLocation = fromScreenLocation(point);
        LatLng fromScreenLocation2 = fromScreenLocation(point2);
        LatLng latLng = mo172025a(foVar).toLatLng();
        LatLng latLng2 = mo172025a(foVar2).toLatLng();
        return new VisibleRegion(fromScreenLocation, fromScreenLocation2, latLng, latLng2, LatLngBounds.builder().include(fromScreenLocation).include(fromScreenLocation2).include(latLng).include(latLng2).build());
    }

    public final float[] glModelMatrix(PointF pointF, float f) {
        if (pointF == null) {
            return null;
        }
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        float[] nativeGLProjectMatrix = this.f342841g.f342023d.nativeGLProjectMatrix();
        float[] A = this.f342841g.mo172892A();
        GeoPoint o = this.f342841g.mo172953o();
        Matrix.multiplyMM(fArr, 0, nativeGLProjectMatrix, 0, A, 0);
        PointF a = mo172024a(C113883ke.m157466a(o));
        Matrix.translateM(fArr, 0, pointF.x - a.x, a.y - pointF.y, 0.0f);
        Matrix.scaleM(fArr, 0, f, f, f);
        return fArr;
    }

    public final float glPixelRatio() {
        return this.f342841g.f342023d.nativeGLViewScaleRatio();
    }

    public final float[] glProjectionMatrix() {
        return this.f342841g.f342023d.nativeGLProjectMatrix();
    }

    public final PointF glVertexForCoordinate(LatLng latLng) {
        return mo172024a(latLng);
    }

    public final float[] glViewMatrix() {
        return this.f342841g.mo172892A();
    }

    public final double metersPerPixel(double d) {
        return (4.0076E7d / ((Math.pow(2.0d, (double) this.f342839b.mo173058a()) * 256.0d) * ((double) C113798hb.m157097n()))) * Math.cos((d * 3.141592653589793d) / 180.0d);
    }

    public final Point toScreenLocation(LatLng latLng) {
        Rect rect;
        PointF a = this.f342841g.mo172898a(latLng.latitude, latLng.longitude);
        float f = a.x;
        float f2 = a.y;
        C113961mq mqVar = this.f342840c;
        if (!(mqVar == null || (rect = mqVar.f340873C) == null)) {
            f += (float) rect.left;
            f2 += (float) rect.top;
        }
        C113732fo foVar = new C113732fo((double) f, (double) f2);
        Point point = new Point();
        point.x = (int) Math.round(foVar.f340215a);
        point.y = (int) Math.round(foVar.f340216b);
        return point;
    }

    /* renamed from: b */
    public static C113741fw m160626b(GeoPoint geoPoint) {
        if (geoPoint == null) {
            return null;
        }
        return new C113741fw(((((double) geoPoint.getLongitudeE6()) / 1000000.0d) * 2.003750834E7d) / 180.0d, ((Math.log(Math.tan((((((double) geoPoint.getLatitudeE6()) / 1000000.0d) + 90.0d) * 3.141592653589793d) / 360.0d)) / 0.017453292519943295d) * 2.003750834E7d) / 180.0d);
    }

    /* renamed from: a */
    public final GeoPoint mo172025a(C113732fo foVar) {
        Rect rect;
        if (foVar == null) {
            return null;
        }
        Rect rect2 = this.f342839b.f342795n;
        int height = rect2.height();
        float t = this.f342841g.mo172958t();
        if (String.valueOf(t).equals("960.0")) {
            t = (float) height;
        }
        double d = foVar.f340216b;
        int i = rect2.top;
        if (d >= ((double) i) && d < ((double) (((float) (i + height)) - t))) {
            d = (double) (((float) (i + height)) - t);
        }
        float f = (float) foVar.f340215a;
        float f2 = (float) d;
        C113961mq mqVar = this.f342840c;
        if (!(mqVar == null || (rect = mqVar.f340873C) == null)) {
            f -= (float) rect.left;
            f2 -= (float) rect.top;
        }
        C114216sq sqVar = this.f342841g;
        return (GeoPoint) sqVar.mo172924b(new CallbackRunnable<GeoPoint>((byte[]) null, f, f2) {
            /* renamed from: a */
            private GeoPoint m159942a() {
                if (C114216sq.this.f342024e == 0) {
                    return new GeoPoint();
                }
                double[] dArr = new double[2];
                C114216sq.this.f342023d.nativeFromScreenLocation(C114216sq.this.f342024e, r2, r3, r4, dArr);
                return new GeoPoint((int) (dArr[1] * 1000000.0d), (int) (dArr[0] * 1000000.0d));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return new GeoPoint();
                }
                double[] dArr = new double[2];
                C114216sq.this.f342023d.nativeFromScreenLocation(C114216sq.this.f342024e, r2, r3, r4, dArr);
                return new GeoPoint((int) (dArr[1] * 1000000.0d), (int) (dArr[0] * 1000000.0d));
            }
        }, new GeoPoint());
    }

    /* renamed from: b */
    private static LatLng m160628b(C113741fw fwVar) {
        if (fwVar == null) {
            return null;
        }
        return new LatLng(((Math.atan(Math.exp((((fwVar.mo172090y() / 2.003750834E7d) * 180.0d) * 3.141592653589793d) / 180.0d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d, (fwVar.mo172089x() / 2.003750834E7d) * 180.0d);
    }

    /* renamed from: b */
    private void m160629b(float f) {
        this.f342839b.mo173059a(f);
    }

    /* renamed from: b */
    public final C113741fw mo172032b(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return m160626b(GeoPoint.from(latLng));
    }

    /* renamed from: c */
    public final void mo173092c(GeoPoint geoPoint) {
        int i;
        C114367v vVar = this.f342839b;
        int latitudeE6 = geoPoint.getLatitudeE6();
        int longitudeE6 = geoPoint.getLongitudeE6();
        int i2 = 1 << (20 - vVar.f342783b.f342821q);
        int i3 = 0;
        if (131072 > i2) {
            i3 = ((vVar.f342795n.width() * 131072) - (vVar.f342795n.width() * i2)) / 2;
            i = ((vVar.f342795n.height() * 131072) - (vVar.f342795n.height() * i2)) / 2;
        } else {
            i = 0;
        }
        Rect rect = vVar.f342784c;
        int i4 = rect.left - i3;
        int i5 = rect.right + i3;
        int i6 = rect.top - i;
        int i7 = rect.bottom + i;
        if (latitudeE6 < i6) {
            latitudeE6 = i6;
        }
        if (latitudeE6 <= i7) {
            i7 = latitudeE6;
        }
        if (longitudeE6 < i4) {
            longitudeE6 = i4;
        }
        if (longitudeE6 <= i5) {
            i5 = longitudeE6;
        }
        GeoPoint geoPoint2 = new GeoPoint(i7, i5);
        C114216sq sqVar = vVar.f342797p;
        sqVar.f342029j.mo172432a((C113961mq.C113963a) new C113961mq.C113963a(geoPoint2) {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (0 != C114216sq.this.f342024e && C114216sq.this.f342029j != null) {
                    C114216sq.this.f342023d.nativeSetCenter(C114216sq.this.f342024e, geoPoint, false);
                }
            }
        });
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m160630b(C114373y yVar) {
        C114367v.C114370b bVar = yVar.f342839b.f342799r;
        if (bVar != null) {
            return ((double) Math.abs(bVar.f342822a)) > 0.25d || ((double) Math.abs(bVar.f342823b)) > 0.25d;
        }
        return false;
    }

    /* renamed from: a */
    public final C113732fo mo172027a(GeoPoint geoPoint) {
        Rect rect;
        if (geoPoint == null) {
            return null;
        }
        PointF a = this.f342841g.mo172898a(((double) geoPoint.getLatitudeE6()) / 1000000.0d, ((double) geoPoint.getLongitudeE6()) / 1000000.0d);
        float f = a.x;
        float f2 = a.y;
        C113961mq mqVar = this.f342840c;
        if (!(mqVar == null || (rect = mqVar.f340873C) == null)) {
            f += (float) rect.left;
            f2 += (float) rect.top;
        }
        return new C113732fo((double) f, (double) f2);
    }

    /* renamed from: c */
    private boolean m160632c() {
        C114367v.C114370b bVar = this.f342839b.f342799r;
        if (bVar == null) {
            return false;
        }
        if (bVar.f342822a == 0.0f && bVar.f342823b == 0.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final LatLng mo172028a(PointF pointF) {
        PointF pointF2;
        float s = this.f342840c.f340912t.f342797p.mo172957s();
        Rect rect = this.f342839b.f342795n;
        float width = (float) rect.width();
        float height = (float) rect.height();
        GeoPoint geoPoint = this.f342839b.f342794m;
        if (geoPoint == null) {
            return new LatLng(0.0d, 0.0d);
        }
        C113732fo c = mo172119c(C113883ke.m157466a(geoPoint));
        C114367v.C114370b bVar = this.f342839b.f342799r;
        if (bVar == null) {
            pointF2 = new PointF(width / 2.0f, height / 2.0f);
        } else {
            pointF2 = new PointF((bVar.f342822a + 0.5f) * width, (bVar.f342823b + 0.5f) * height);
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRotate(-s);
        if (bVar == null) {
            matrix.preTranslate(width * -0.5f, -0.5f * height);
            matrix.postTranslate(width * 0.5f, height * 0.5f);
        } else {
            matrix.preTranslate((-0.5f - bVar.f342822a) * width, (-0.5f - bVar.f342823b) * height);
            matrix.postTranslate((bVar.f342822a + 0.5f) * width, (bVar.f342823b + 0.5f) * height);
        }
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, new float[]{pointF.x, pointF.y});
        double n = (2.003750834E7d / ((double) ((1 << this.f342839b.f342783b.f342821q) * 256))) * ((double) C113798hb.m157097n());
        return mo172118b(new C113732fo(c.f340215a + (((double) (fArr[0] - pointF2.x)) * n), c.f340216b + (((double) (fArr[1] - pointF2.y)) * n)));
    }

    /* renamed from: a */
    public final LatLng[] mo172031a() {
        Rect rect = this.f342840c.f340907o;
        float width = (float) rect.width();
        float height = (float) rect.height();
        return new LatLng[]{this.f342840c.f340906n.mo172028a(new PointF(0.0f, 0.0f)), this.f342840c.f340906n.mo172028a(new PointF(width, 0.0f)), this.f342840c.f340906n.mo172028a(new PointF(width, height)), this.f342840c.f340906n.mo172028a(new PointF(0.0f, height))};
    }

    /* renamed from: a */
    public final double mo172022a(Point point, Point point2) {
        GeoPoint a = mo172025a(new C113732fo((double) point.x, (double) point.y));
        GeoPoint a2 = mo172025a(new C113732fo((double) point2.x, (double) point2.y));
        float[] fArr = new float[1];
        Location.distanceBetween(((double) a.getLatitudeE6()) / 1000000.0d, ((double) a.getLongitudeE6()) / 1000000.0d, ((double) a2.getLatitudeE6()) / 1000000.0d, ((double) a2.getLongitudeE6()) / 1000000.0d, fArr);
        return (double) (fArr[0] / ((float) ((int) Math.sqrt(Math.pow((double) (point.x - point2.x), 2.0d) + Math.pow((double) (point.y - point2.y), 2.0d)))));
    }

    /* renamed from: a */
    public final PointF mo172024a(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        double sin = Math.sin(Math.toRadians(latLng.latitude));
        return new PointF((float) (((latLng.longitude / 360.0d) + 0.5d) * 2.68435456E8d), (float) ((((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / -6.283185307179586d) + 0.5d) * 2.68435456E8d));
    }

    /* renamed from: a */
    private void m160623a(int i) {
        this.f342839b.mo173066c(i);
    }

    /* renamed from: a */
    public final void mo173091a(float f) {
        C114367v vVar = this.f342839b;
        C114216sq sqVar = vVar.f342797p;
        if (sqVar != null) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a((double) f) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (0 != C114216sq.this.f342024e && C114216sq.this.f342029j != null) {
                        C114216sq.this.f342023d.nativeSetScale(C114216sq.this.f342024e, r2, false);
                    }
                }
            });
        }
        vVar.f342783b.f342820p = f;
        int i = C113744fy.f340314a;
    }

    /* renamed from: a */
    public final void mo172030a(List<? extends Boundable> list, List<GeoPoint> list2, Rect rect, C113707es.C113708a aVar) {
        Rect rect2 = rect;
        if (!list.isEmpty() || (list2 != null && !list2.isEmpty())) {
            Rect rect3 = new Rect(this.f342840c.f340907o);
            rect3.left += rect2.left;
            rect3.right -= rect2.right;
            rect3.top += rect2.top;
            rect3.bottom -= rect2.bottom;
            final int width = rect3.width();
            final int height = rect3.height();
            C113961mq mqVar = this.f342840c;
            C114375z zVar = mqVar.f340901i.f339685o;
            int i = zVar.f342856e;
            final List<? extends Boundable> list3 = list;
            final List<GeoPoint> list4 = list2;
            final Rect rect4 = rect;
            final int i2 = i;
            final C114375z zVar2 = zVar;
            final C113707es.C113708a aVar2 = aVar;
            mqVar.mo172432a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    C114367v vVar = C114373y.this.f342839b;
                    GeoPoint geoPoint = vVar.f342794m;
                    C114367v.C114369a aVar = vVar.f342783b;
                    float f = aVar.f342820p;
                    float f2 = aVar.f342816l;
                    GeoPoint geoPoint2 = null;
                    float f3 = 4.0f;
                    while (true) {
                        if (f3 < f2) {
                            break;
                        }
                        C114373y.this.mo173091a(f3);
                        Rect a = C114373y.m160615a(C114373y.this, list3, list4);
                        GeoPoint geoPoint3 = new GeoPoint(a.centerY(), a.centerX());
                        C114373y.this.mo173092c(geoPoint3);
                        GeoPoint geoPoint4 = new GeoPoint(a.top, a.left);
                        GeoPoint geoPoint5 = new GeoPoint(a.bottom, a.right);
                        C113732fo a2 = C114373y.this.mo172027a(geoPoint4);
                        C113732fo a3 = C114373y.this.mo172027a(geoPoint5);
                        Rect rect = new Rect();
                        rect.left = (int) Math.min(a2.f340215a, a3.f340215a);
                        rect.right = (int) Math.max(a2.f340215a, a3.f340215a);
                        rect.top = (int) Math.min(a2.f340216b, a3.f340216b);
                        rect.bottom = (int) Math.max(a2.f340216b, a3.f340216b);
                        if (width < rect.width() || height < rect.height()) {
                            f3 /= 1.01f;
                            geoPoint2 = geoPoint3;
                        } else if (!C114373y.m160625a(C114373y.this)) {
                            geoPoint2 = C114373y.m160619a(C114373y.this, geoPoint3, rect4);
                        } else {
                            if (C114373y.m160630b(C114373y.this)) {
                                C114373y yVar = C114373y.this;
                                C114367v.C114370b bVar = yVar.f342839b.f342799r;
                                if (bVar != null) {
                                    geoPoint2 = C114373y.m160620a(yVar, geoPoint3, bVar);
                                }
                            }
                            geoPoint2 = geoPoint3;
                        }
                    }
                    float max = Math.max(f2, f3);
                    int i = i2;
                    if (i != 60) {
                        zVar2.mo173094a(i);
                    }
                    C114373y.this.mo173092c(geoPoint);
                    C114373y.this.mo173091a(f);
                    C113707es.C113708a aVar2 = aVar2;
                    if (aVar2 != null) {
                        try {
                            aVar2.mo171665a(max, geoPoint2);
                        } catch (Exception unused) {
                        }
                    }
                }
            });
            if (i != 60) {
                zVar.f342856e = 60;
            }
        }
    }

    /* renamed from: a */
    private Rect m160616a(List<? extends Boundable> list, List<GeoPoint> list2) {
        int i;
        int i2;
        int i3;
        Rect bound;
        int i4 = 0;
        if (list != null) {
            i3 = 0;
            i2 = 0;
            i = 0;
            for (Boundable boundable : list) {
                if (!(boundable == null || (bound = boundable.getBound(this)) == null)) {
                    if (i4 == 0) {
                        i4 = bound.left;
                    }
                    if (i3 == 0) {
                        i3 = bound.right;
                    }
                    if (i2 == 0) {
                        i2 = bound.top;
                    }
                    if (i == 0) {
                        i = bound.bottom;
                    }
                    int i5 = bound.left;
                    if (i5 < i4) {
                        i4 = i5;
                    }
                    int i6 = bound.right;
                    if (i6 > i3) {
                        i3 = i6;
                    }
                    int i7 = bound.top;
                    if (i7 > i2) {
                        i2 = i7;
                    }
                    int i8 = bound.bottom;
                    if (i8 < i) {
                        i = i8;
                    }
                }
            }
        } else {
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        if (list2 != null) {
            for (GeoPoint next : list2) {
                if (next != null) {
                    if (i4 == 0) {
                        i4 = next.getLongitudeE6();
                    }
                    if (i3 == 0) {
                        i3 = next.getLongitudeE6();
                    }
                    if (i2 == 0) {
                        i2 = next.getLatitudeE6();
                    }
                    if (i == 0) {
                        i = next.getLatitudeE6();
                    }
                    if (next.getLongitudeE6() < i4) {
                        i4 = next.getLongitudeE6();
                    }
                    if (next.getLongitudeE6() > i3) {
                        i3 = next.getLongitudeE6();
                    }
                    if (next.getLatitudeE6() > i2) {
                        i2 = next.getLatitudeE6();
                    }
                    if (next.getLatitudeE6() < i) {
                        i = next.getLatitudeE6();
                    }
                }
            }
        }
        return new Rect(i4, i2, i3, i);
    }

    /* renamed from: a */
    private GeoPoint m160617a(GeoPoint geoPoint, Rect rect) {
        C113732fo a;
        if (geoPoint == null || (a = mo172027a(geoPoint)) == null || rect == null) {
            return null;
        }
        return mo172025a(new C113732fo(a.f340215a - (((double) (rect.left - rect.right)) * 0.5d), a.f340216b - (((double) (rect.top - rect.bottom)) * 0.5d)));
    }

    /* renamed from: a */
    private GeoPoint m160618a(GeoPoint geoPoint, C114367v.C114370b bVar) {
        C113732fo a;
        if (geoPoint == null || (a = mo172027a(geoPoint)) == null || bVar == null) {
            return null;
        }
        double d = a.f340215a;
        double d2 = a.f340216b;
        Rect rect = new Rect(this.f342840c.f340907o);
        int width = rect.width();
        int height = rect.height();
        float f = bVar.f342823b + 0.5f;
        double d3 = (double) (bVar.f342822a + 0.5f);
        if (d3 < 0.25d) {
            d += (0.25d - d3) * ((double) width);
        } else if (d3 > 0.75d) {
            d -= (d3 - 0.75d) * ((double) width);
        }
        double d4 = (double) f;
        if (d4 < 0.25d) {
            d2 += (0.25d - d4) * ((double) height);
        } else if (d4 > 0.75d) {
            d2 -= (d4 - 0.75d) * ((double) height);
        }
        return mo172025a(new C113732fo(d, d2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo172023a(com.tencent.tencentmap.mapsdk.maps.model.LatLng r28, com.tencent.tencentmap.mapsdk.maps.model.LatLng r29, int r30, int r31, int r32, int r33, com.tencent.tencentmap.mapsdk.maps.model.LatLng r34) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r34
            com.tencent.mapsdk.internal.mq r4 = r0.f342840c
            android.content.Context r4 = r4.getContext()
            com.tencent.mapsdk.internal.mq r5 = r0.f342840c
            com.tencent.mapsdk.internal.ad r5 = r5.f340901i
            android.graphics.Rect r5 = r5.mo171221b()
            com.tencent.mapsdk.internal.mq r6 = r0.f342840c
            com.tencent.mapsdk.internal.ad r7 = r6.f340901i
            boolean r7 = r7.f339676N
            int r8 = r5.left
            int r9 = r5.right
            int r10 = r5.top
            int r5 = r5.bottom
            android.graphics.Rect r6 = r6.f340907o
            int r6 = r6.width()
            com.tencent.mapsdk.internal.mq r11 = r0.f342840c
            android.graphics.Rect r11 = r11.f340907o
            int r11 = r11.height()
            com.tencent.mapsdk.internal.mq r12 = r0.f342840c
            com.tencent.mapsdk.internal.v r12 = r12.f340912t
            com.tencent.mapsdk.internal.v$a r13 = r12.f342783b
            int r14 = r13.f342819o
            float r14 = (float) r14
            int r13 = r13.f342818n
            float r13 = (float) r13
            com.tencent.mapsdk.internal.v$b r12 = r12.f342799r
            if (r6 == 0) goto L_0x01ea
            if (r11 == 0) goto L_0x01ea
            if (r1 == 0) goto L_0x01ea
            if (r2 != 0) goto L_0x004a
            goto L_0x01ea
        L_0x004a:
            int r15 = r30 + r31
            int r15 = r15 + r8
            int r15 = r15 + r9
            if (r15 > r6) goto L_0x01e7
            int r15 = r32 + r33
            int r15 = r15 + r10
            int r15 = r15 + r5
            if (r15 <= r11) goto L_0x0058
            goto L_0x01e7
        L_0x0058:
            com.tencent.mapsdk.internal.fo r15 = r0.mo172026a((android.content.Context) r4, (com.tencent.tencentmap.mapsdk.maps.model.LatLng) r1)
            r16 = r12
            com.tencent.mapsdk.internal.fo r12 = r0.mo172026a((android.content.Context) r4, (com.tencent.tencentmap.mapsdk.maps.model.LatLng) r2)
            double r0 = r12.f340215a
            double r2 = r15.f340215a
            double r0 = r0 - r2
            r2 = 0
            int r17 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r17 >= 0) goto L_0x0071
            double r0 = java.lang.Math.abs(r0)
        L_0x0071:
            double r2 = r12.f340216b
            r19 = r13
            double r12 = r15.f340216b
            double r2 = r2 - r12
            r12 = 0
            int r15 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x0082
            double r2 = java.lang.Math.abs(r2)
        L_0x0082:
            int r15 = r6 - r30
            int r15 = r15 - r31
            int r15 = r15 - r8
            int r15 = r15 - r9
            int r17 = r11 - r32
            int r17 = r17 - r33
            int r17 = r17 - r10
            int r17 = r17 - r5
            r18 = 1
            if (r15 > 0) goto L_0x0095
            r15 = 1
        L_0x0095:
            r13 = r5
            if (r17 > 0) goto L_0x009c
            r17 = r6
            r12 = 1
            goto L_0x00a0
        L_0x009c:
            r12 = r17
            r17 = r6
        L_0x00a0:
            double r5 = (double) r15
            double r0 = r0 / r5
            double r5 = (double) r12
            double r2 = r2 / r5
            double r0 = java.lang.Math.max(r0, r2)
            double r5 = java.lang.Math.log(r0)
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r22 = java.lang.Math.log(r2)
            double r5 = r5 / r22
            r20 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r5 = r20 - r5
            float r5 = (float) r5
            r6 = 1101004800(0x41a00000, float:20.0)
            int r12 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r12 >= 0) goto L_0x00c7
            float r0 = r6 - r14
            double r0 = (double) r0
            double r0 = java.lang.Math.pow(r2, r0)
            goto L_0x00c8
        L_0x00c7:
            r14 = r5
        L_0x00c8:
            int r5 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x00d8
            float r6 = r6 - r19
            double r0 = (double) r6
            double r0 = java.lang.Math.pow(r2, r0)
            r5 = r34
            r14 = r19
            goto L_0x00da
        L_0x00d8:
            r5 = r34
        L_0x00da:
            if (r5 == 0) goto L_0x01e4
            r6 = r28
            double r2 = r6.latitude
            r12 = r29
            r20 = r14
            double r14 = r12.latitude
            double r2 = r2 + r14
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 / r14
            double r14 = r6.longitude
            double r5 = r12.longitude
            double r14 = r14 + r5
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = r14 / r5
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r12 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng
            r12.<init>(r2, r14)
            int r2 = r31 - r30
            int r3 = r32 - r33
            double r14 = (double) r2
            double r14 = r14 * r0
            double r14 = r14 / r5
            double r2 = (double) r3
            double r2 = r2 * r0
            double r2 = r2 / r5
            r5 = r27
            com.tencent.mapsdk.internal.fo r6 = r5.mo172026a((android.content.Context) r4, (com.tencent.tencentmap.mapsdk.maps.model.LatLng) r12)
            r12 = r4
            double r4 = r6.f340215a
            double r4 = r4 + r14
            r6.f340215a = r4
            double r14 = r6.f340216b
            double r14 = r14 + r2
            r6.f340216b = r14
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r7 == 0) goto L_0x0187
            int r8 = r8 - r9
            int r10 = r10 - r13
            float r6 = (float) r8
            r7 = r17
            float r9 = (float) r7
            r13 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 * r13
            float r6 = r6 / r9
            r9 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r9
            r28 = r14
            double r13 = (double) r6
            r21 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            r23 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            r25 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            int r6 = (r13 > r25 ? 1 : (r13 == r25 ? 0 : -1))
            if (r6 >= 0) goto L_0x0138
            double r13 = (double) r7
            double r13 = r13 * r21
        L_0x0136:
            int r8 = (int) r13
            goto L_0x0140
        L_0x0138:
            int r6 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r6 <= 0) goto L_0x0140
            double r13 = (double) r7
            double r13 = r13 * r2
            goto L_0x0136
        L_0x0140:
            float r6 = (float) r10
            float r13 = (float) r11
            r14 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 * r14
            float r6 = r6 / r13
            float r6 = r6 + r9
            double r13 = (double) r6
            int r6 = (r13 > r25 ? 1 : (r13 == r25 ? 0 : -1))
            if (r6 >= 0) goto L_0x0152
            double r9 = (double) r11
            double r9 = r9 * r21
        L_0x0150:
            int r10 = (int) r9
            goto L_0x015a
        L_0x0152:
            int r6 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r6 <= 0) goto L_0x015a
            double r9 = (double) r11
            double r9 = r9 * r2
            goto L_0x0150
        L_0x015a:
            double r8 = (double) r8
            double r8 = r8 * r0
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = r8 / r13
            double r2 = (double) r10
            double r2 = r2 * r0
            double r2 = r2 / r13
            if (r16 != 0) goto L_0x016b
            r13 = 0
            r15 = 0
            goto L_0x0174
        L_0x016b:
            r6 = r16
            float r10 = r6.f342822a
            double r13 = (double) r10
            float r6 = r6.f342823b
            r15 = r13
            double r13 = (double) r6
        L_0x0174:
            double r4 = r4 - r8
            double r6 = (double) r7
            double r15 = r15 * r6
            double r15 = r15 * r0
            double r4 = r4 + r15
            r6 = r28
            double r2 = r6 - r2
            double r6 = (double) r11
            double r13 = r13 * r6
            double r13 = r13 * r0
            double r14 = r2 - r13
            goto L_0x0188
        L_0x0187:
            r6 = r14
        L_0x0188:
            com.tencent.mapsdk.internal.fo r0 = new com.tencent.mapsdk.internal.fo
            r0.<init>(r4, r14)
            float r1 = com.tencent.mapsdk.internal.C113801hf.m157135a((android.content.Context) r12)
            r2 = 1300234240(0x4d800000, float:2.68435456E8)
            float r1 = r1 * r2
            double r1 = (double) r1
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = r1 / r3
            r3 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r3 = r1 / r3
            r7 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r1 = r1 / r7
            double r7 = r0.f340215a
            double r7 = r7 - r5
            double r7 = r7 / r3
            r3 = 4613303445314885481(0x4005bf0a8b145769, double:2.718281828459045)
            double r9 = r0.f340216b
            double r9 = r9 - r5
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r9 = r9 / r5
            double r9 = r9 / r1
            double r0 = java.lang.Math.pow(r3, r9)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r4 / r0
            double r2 = r2 - r0
            double r0 = java.lang.Math.asin(r2)
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r0 = r0 * r2
            r2 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r0 = r0 / r2
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r2 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng
            r2.<init>(r0, r7)
            double r0 = r2.latitude
            r3 = r34
            r3.latitude = r0
            double r0 = r2.longitude
            r3.longitude = r0
            goto L_0x01e6
        L_0x01e4:
            r20 = r14
        L_0x01e6:
            return r20
        L_0x01e7:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r0
        L_0x01ea:
            r0 = -1073741824(0xffffffffc0000000, float:-2.0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114373y.mo172023a(com.tencent.tencentmap.mapsdk.maps.model.LatLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng, int, int, int, int, com.tencent.tencentmap.mapsdk.maps.model.LatLng):float");
    }

    /* renamed from: a */
    private static LatLng m160622a(Context context, C113732fo foVar) {
        double a = (double) (C113801hf.m157135a(context) * 2.68435456E8f);
        double d = a / 2.0d;
        double d2 = a / 360.0d;
        return new LatLng((Math.asin(1.0d - (2.0d / (Math.pow(2.718281828459045d, ((foVar.f340216b - d) / 0.5d) / (a / 6.283185307179586d)) + 1.0d))) * 180.0d) / 3.141592653589793d, (foVar.f340215a - d) / d2);
    }

    /* renamed from: a */
    public final C113732fo mo172026a(Context context, LatLng latLng) {
        double a = (double) (C113801hf.m157135a(context) * 2.68435456E8f);
        double d = a / 2.0d;
        double d2 = a / 360.0d;
        double min = Math.min(Math.max(Math.sin(latLng.latitude * 0.017453292519943295d), -0.9999d), 0.9999d);
        return new C113732fo((latLng.longitude * d2) + d, d + (Math.log((min + 1.0d) / (1.0d - min)) * (a / 6.283185307179586d) * 0.5d));
    }

    /* renamed from: a */
    public static C113732fo m160621a(C114367v vVar, GeoPoint geoPoint) {
        if (geoPoint == null) {
            return null;
        }
        double d = vVar.f342786e;
        double d2 = vVar.f342787f;
        double min = Math.min(Math.max(Math.sin((((double) geoPoint.getLatitudeE6()) / 1000000.0d) * 0.017453292519943295d), -0.9999d), 0.9999d);
        double d3 = (double) (vVar.f342785d >> 1);
        return new C113732fo(((((double) geoPoint.getLongitudeE6()) / 1000000.0d) * d) + d3, d3 + (Math.log((min + 1.0d) / (1.0d - min)) * d2 * 0.5d));
    }

    /* renamed from: a */
    public final LatLng mo172029a(C113741fw fwVar) {
        return new LatLng(((Math.atan(Math.exp((((fwVar.mo172090y() / 2.003750834E7d) * 180.0d) * 3.141592653589793d) / 180.0d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d, (fwVar.mo172089x() / 2.003750834E7d) * 180.0d);
    }

    /* renamed from: a */
    public static /* synthetic */ Rect m160615a(C114373y yVar, List list, List list2) {
        int i;
        int i2;
        int i3;
        Rect bound;
        int i4 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            i3 = 0;
            i2 = 0;
            i = 0;
            while (it.hasNext()) {
                Boundable boundable = (Boundable) it.next();
                if (!(boundable == null || (bound = boundable.getBound(yVar)) == null)) {
                    if (i4 == 0) {
                        i4 = bound.left;
                    }
                    if (i3 == 0) {
                        i3 = bound.right;
                    }
                    if (i2 == 0) {
                        i2 = bound.top;
                    }
                    if (i == 0) {
                        i = bound.bottom;
                    }
                    int i5 = bound.left;
                    if (i5 < i4) {
                        i4 = i5;
                    }
                    int i6 = bound.right;
                    if (i6 > i3) {
                        i3 = i6;
                    }
                    int i7 = bound.top;
                    if (i7 > i2) {
                        i2 = i7;
                    }
                    int i8 = bound.bottom;
                    if (i8 < i) {
                        i = i8;
                    }
                }
            }
        } else {
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        if (list2 != null) {
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                GeoPoint geoPoint = (GeoPoint) it4.next();
                if (geoPoint != null) {
                    if (i4 == 0) {
                        i4 = geoPoint.getLongitudeE6();
                    }
                    if (i3 == 0) {
                        i3 = geoPoint.getLongitudeE6();
                    }
                    if (i2 == 0) {
                        i2 = geoPoint.getLatitudeE6();
                    }
                    if (i == 0) {
                        i = geoPoint.getLatitudeE6();
                    }
                    if (geoPoint.getLongitudeE6() < i4) {
                        i4 = geoPoint.getLongitudeE6();
                    }
                    if (geoPoint.getLongitudeE6() > i3) {
                        i3 = geoPoint.getLongitudeE6();
                    }
                    if (geoPoint.getLatitudeE6() > i2) {
                        i2 = geoPoint.getLatitudeE6();
                    }
                    if (geoPoint.getLatitudeE6() < i) {
                        i = geoPoint.getLatitudeE6();
                    }
                }
            }
        }
        return new Rect(i4, i2, i3, i);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m160625a(C114373y yVar) {
        C114367v.C114370b bVar = yVar.f342839b.f342799r;
        if (bVar != null) {
            return (bVar.f342822a == 0.0f && bVar.f342823b == 0.0f) ? false : true;
        }
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ GeoPoint m160619a(C114373y yVar, GeoPoint geoPoint, Rect rect) {
        C113732fo a = yVar.mo172027a(geoPoint);
        if (a == null || rect == null) {
            return null;
        }
        return yVar.mo172025a(new C113732fo(a.f340215a - (((double) (rect.left - rect.right)) * 0.5d), a.f340216b - (((double) (rect.top - rect.bottom)) * 0.5d)));
    }

    /* renamed from: a */
    public static /* synthetic */ GeoPoint m160620a(C114373y yVar, GeoPoint geoPoint, C114367v.C114370b bVar) {
        C113732fo a = yVar.mo172027a(geoPoint);
        if (a == null || bVar == null) {
            return null;
        }
        double d = a.f340215a;
        double d2 = a.f340216b;
        Rect rect = new Rect(yVar.f342840c.f340907o);
        int width = rect.width();
        int height = rect.height();
        float f = bVar.f342823b + 0.5f;
        double d3 = (double) (bVar.f342822a + 0.5f);
        if (d3 < 0.25d) {
            d += (0.25d - d3) * ((double) width);
        } else if (d3 > 0.75d) {
            d -= (d3 - 0.75d) * ((double) width);
        }
        double d4 = (double) f;
        if (d4 < 0.25d) {
            d2 += (0.25d - d4) * ((double) height);
        } else if (d4 > 0.75d) {
            d2 -= (d4 - 0.75d) * ((double) height);
        }
        return yVar.mo172025a(new C113732fo(d, d2));
    }
}
