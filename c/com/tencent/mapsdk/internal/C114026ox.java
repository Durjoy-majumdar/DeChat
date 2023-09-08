package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.map.lib.models.CircleInfo;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.tencentmap.mapsdk.maps.model.CircleOptions;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.ox */
public final class C114026ox extends C114027oy<C113514ah> implements C113514ah, C114011oe {

    /* renamed from: a */
    private static final int f341053a = 128;

    /* renamed from: n */
    private GeoPoint f341054n = new GeoPoint(39909230, 116397428);

    /* renamed from: o */
    private double f341055o = 0.0d;

    /* renamed from: p */
    private float f341056p = 1000.0f;

    /* renamed from: q */
    private CircleOptions f341057q;

    /* renamed from: r */
    private CircleInfo f341058r = new CircleInfo();

    /* renamed from: s */
    private C113961mq f341059s;

    public C114026ox(C113532ba baVar) {
        super(baVar);
        this.f341059s = baVar.mo171576b();
    }

    /* renamed from: d */
    private double m158516d() {
        return (double) this.f341056p;
    }

    /* renamed from: e */
    private void m158517e() {
        if (mo172002a() == -1) {
            C114216sq sqVar = this.f341059s.f340899g;
            this.f341070k = ((Integer) sqVar.mo172900a(new CallbackRunnable<Integer>(this.f341058r) {
                /* renamed from: a */
                private Integer m160085a() {
                    if (C114216sq.this.f342024e == 0 || r2 == null) {
                        return -1;
                    }
                    return Integer.valueOf(C114216sq.this.f342023d.nativeAddCircle(C114216sq.this.f342024e, r2));
                }

                public final /* synthetic */ Object run() {
                    if (C114216sq.this.f342024e == 0 || r2 == null) {
                        return -1;
                    }
                    return Integer.valueOf(C114216sq.this.f342023d.nativeAddCircle(C114216sq.this.f342024e, r2));
                }
            }, -1)).intValue();
        } else if (mo172605p()) {
            C114216sq sqVar2 = this.f341059s.f340899g;
            int a = mo172002a();
            CircleInfo circleInfo = this.f341058r;
            if (!(sqVar2.f342024e == 0 || circleInfo == null)) {
                sqVar2.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(a, circleInfo) {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        C114216sq.this.f342023d.nativeUpdateCircle(C114216sq.this.f342024e, r6, r7);
                    }
                });
            }
            this.f341059s.f340914v = true;
        }
    }

    /* renamed from: f */
    private C113514ah m158518f() {
        return this;
    }

    /* renamed from: a */
    public final void mo172597a(CircleOptions circleOptions) {
        if (circleOptions != null) {
            this.f341057q = circleOptions;
            LatLng center = circleOptions.getCenter();
            if (center != null) {
                m158515a(GeoPoint.from(center));
            }
            setRadius(circleOptions.getRadius());
            setStrokeWidth(circleOptions.getStrokeWidth());
            setStrokeColor(circleOptions.getStrokeColor());
            setFillColor(circleOptions.getFillColor());
            setZIndex(circleOptions.getZIndex());
            setVisible(circleOptions.isVisible());
            setLevel(circleOptions.getLevel());
            this.f341057q = circleOptions;
            mo172606q();
        }
    }

    /* renamed from: b */
    public final Rect getBound(C113707es esVar) {
        double a = m158512a(this.f341055o, ((double) this.f341054n.getLatitudeE6()) / 1000000.0d);
        C113741fw a2 = m158513a(new LatLng(((double) this.f341054n.getLatitudeE6()) / 1000000.0d, ((double) this.f341054n.getLongitudeE6()) / 1000000.0d));
        C113741fw fwVar = new C113741fw(a2.f340307c - a, a2.f340306b + a);
        C113741fw fwVar2 = new C113741fw(a2.f340307c + a, a2.f340306b - a);
        LatLng a3 = m158514a(fwVar);
        LatLng a4 = m158514a(fwVar2);
        Rect rect = new Rect();
        rect.left = (int) (a3.longitude * 1000000.0d);
        rect.top = (int) (a3.latitude * 1000000.0d);
        rect.right = (int) (a4.longitude * 1000000.0d);
        rect.bottom = (int) (a4.latitude * 1000000.0d);
        return rect;
    }

    public final boolean contains(LatLng latLng) {
        LatLng latLng2 = latLng;
        LatLng center = getCenter();
        double d = center.longitude;
        double d2 = d * 0.01745329251994329d;
        double d3 = center.latitude * 0.01745329251994329d;
        double d4 = latLng2.longitude * 0.01745329251994329d;
        double d5 = latLng2.latitude * 0.01745329251994329d;
        double sin = Math.sin(d2);
        double sin2 = Math.sin(d3);
        double cos = Math.cos(d2);
        double cos2 = Math.cos(d3);
        double sin3 = Math.sin(d4);
        double sin4 = Math.sin(d5);
        double cos3 = Math.cos(d4);
        double cos4 = Math.cos(d5);
        double d6 = sin4;
        double[] dArr = {cos * cos2, cos2 * sin, sin2};
        double d7 = cos3 * cos4;
        double d8 = cos4 * sin3;
        double d9 = dArr[0];
        double d15 = (d9 - d7) * (d9 - d7);
        double d16 = dArr[1];
        double d17 = dArr[2];
        return Math.asin(Math.sqrt((d15 + ((d16 - d8) * (d16 - d8))) + ((d17 - d6) * (d17 - d6))) / 2.0d) * 1.27420015798544E7d < getRadius();
    }

    /* renamed from: f_ */
    public final /* bridge */ /* synthetic */ C113521ap mo171394f_() {
        return this;
    }

    /* renamed from: g_ */
    public final boolean mo172575g_() {
        return false;
    }

    public final LatLng getCenter() {
        GeoPoint geoPoint = this.f341054n;
        if (geoPoint != null) {
            return geoPoint.toLatLng();
        }
        return null;
    }

    public final double getRadius() {
        return this.f341055o;
    }

    /* renamed from: h_ */
    public final void mo172595h_() {
        C113961mq mqVar;
        if (mo172002a() != -1 && (mqVar = this.f341059s) != null) {
            C114216sq sqVar = mqVar.f340899g;
            int a = mo172002a();
            if (!(sqVar.f342024e == 0 || a < 0 || sqVar.f342029j == null)) {
                sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(a) {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        C114216sq.this.f342023d.nativeDeleteCircle(C114216sq.this.f342024e, r6);
                    }
                });
            }
            this.f341070k = -1;
        }
    }

    /* renamed from: j */
    public final void mo172003j() {
        GeoPoint geoPoint;
        if ((mo172002a() <= 0 || mo172605p()) && this.f341059s != null && (geoPoint = this.f341054n) != null) {
            double d = this.f341055o;
            if (d > 0.0d) {
                CircleInfo circleInfo = this.f341058r;
                circleInfo.zIndex = (int) this.f341066g;
                circleInfo.borderColor = this.f341065f;
                circleInfo.borderWidth = this.f341063d;
                circleInfo.fillColor = this.f341064e;
                circleInfo.radius = (float) d;
                circleInfo.centerX = geoPoint.getLongitudeE6();
                this.f341058r.centerY = this.f341054n.getLatitudeE6();
                CircleInfo circleInfo2 = this.f341058r;
                circleInfo2.isVisible = this.f341067h;
                circleInfo2.level = this.f341069j;
                mo172606q();
            }
        }
    }

    /* renamed from: j_ */
    public final void mo172596j_() {
        if (this.f341059s != null) {
            mo172003j();
            if (mo172002a() == -1) {
                C114216sq sqVar = this.f341059s.f340899g;
                this.f341070k = ((Integer) sqVar.mo172900a(new CallbackRunnable<Integer>(this.f341058r) {
                    /* renamed from: a */
                    private Integer m160085a() {
                        if (C114216sq.this.f342024e == 0 || r2 == null) {
                            return -1;
                        }
                        return Integer.valueOf(C114216sq.this.f342023d.nativeAddCircle(C114216sq.this.f342024e, r2));
                    }

                    public final /* synthetic */ Object run() {
                        if (C114216sq.this.f342024e == 0 || r2 == null) {
                            return -1;
                        }
                        return Integer.valueOf(C114216sq.this.f342023d.nativeAddCircle(C114216sq.this.f342024e, r2));
                    }
                }, -1)).intValue();
            } else if (mo172605p()) {
                C114216sq sqVar2 = this.f341059s.f340899g;
                int a = mo172002a();
                CircleInfo circleInfo = this.f341058r;
                if (!(sqVar2.f342024e == 0 || circleInfo == null)) {
                    sqVar2.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(a, circleInfo) {
                        /* renamed from: a */
                        public final void mo54067a(GL10 gl10) {
                            C114216sq.this.f342023d.nativeUpdateCircle(C114216sq.this.f342024e, r6, r7);
                        }
                    });
                }
                this.f341059s.f340914v = true;
            }
        }
    }

    public final boolean onTap(float f, float f2) {
        C113961mq mqVar;
        if (!(this.f341054n == null || (mqVar = this.f341059s) == null)) {
            GeoPoint a = mqVar.f340906n.mo172025a(new C113732fo((double) f, (double) f2));
            if (Math.hypot((double) (a.getLatitudeE6() - this.f341054n.getLatitudeE6()), (double) (a.getLongitudeE6() - this.f341054n.getLongitudeE6())) <= ((double) this.f341056p)) {
                return true;
            }
        }
        return false;
    }

    public final void setCenter(LatLng latLng) {
        m158515a(GeoPoint.from(latLng));
    }

    public final void setOptions(CircleOptions circleOptions) {
        mo172597a(circleOptions);
    }

    public final void setRadius(double d) {
        if (d >= 0.0d) {
            if (d == 0.0d) {
                d = 1.0E-10d;
            }
            CircleOptions circleOptions = this.f341057q;
            if (circleOptions != null && circleOptions.getCenter() != null) {
                this.f341055o = d;
                this.f341056p = (float) C113798hb.m157066a(d, this.f341057q.getCenter().latitude);
                mo172606q();
            }
        }
    }

    /* renamed from: a */
    private void m158515a(GeoPoint geoPoint) {
        if (geoPoint != null) {
            GeoPoint geoPoint2 = this.f341054n;
            if (geoPoint2 == null) {
                this.f341054n = new GeoPoint(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6());
            } else {
                geoPoint2.setLatitudeE6(geoPoint.getLatitudeE6());
                this.f341054n.setLongitudeE6(geoPoint.getLongitudeE6());
            }
            mo172606q();
        }
    }

    /* renamed from: a */
    public final Rect getScreenBound(C113707es esVar) {
        Rect b = getBound(esVar);
        int i = b.left;
        int i2 = b.right;
        int i3 = b.top;
        int i4 = b.bottom;
        GeoPoint geoPoint = new GeoPoint(i3, i);
        GeoPoint geoPoint2 = new GeoPoint(i4, i);
        GeoPoint geoPoint3 = new GeoPoint(i4, i2);
        GeoPoint geoPoint4 = new GeoPoint(i3, i2);
        C113732fo a = esVar.mo172027a(geoPoint);
        C113732fo a2 = esVar.mo172027a(geoPoint2);
        C113732fo a3 = esVar.mo172027a(geoPoint3);
        C113732fo a4 = esVar.mo172027a(geoPoint4);
        return new Rect((int) Math.min(Math.min(a.f340215a, a2.f340215a), Math.min(a3.f340215a, a4.f340215a)), (int) Math.min(Math.min(a.f340216b, a2.f340216b), Math.min(a3.f340216b, a4.f340216b)), (int) Math.max(Math.max(a.f340215a, a2.f340215a), Math.max(a3.f340215a, a4.f340215a)), (int) Math.max(Math.max(a.f340216b, a2.f340216b), Math.max(a3.f340216b, a4.f340216b)));
    }

    /* renamed from: a */
    private static double m158512a(double d, double d2) {
        return d / Math.cos((d2 * 3.141592653589793d) / 180.0d);
    }

    /* renamed from: a */
    private static C113741fw m158513a(LatLng latLng) {
        return new C113741fw((latLng.longitude * 2.003750834E7d) / 180.0d, ((Math.log(Math.tan(((latLng.latitude + 90.0d) * 3.141592653589793d) / 360.0d)) / 0.017453292519943295d) * 2.003750834E7d) / 180.0d);
    }

    /* renamed from: a */
    private static LatLng m158514a(C113741fw fwVar) {
        return new LatLng((double) ((float) (((Math.atan(Math.exp((((double) ((float) ((fwVar.f340306b * 180.0d) / 2.003750834E7d))) * 3.141592653589793d) / 180.0d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d)), (double) ((float) ((fwVar.f340307c * 180.0d) / 2.003750834E7d)));
    }
}
