package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import android.util.Pair;
import com.tencent.map.tools.IndexCallback;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate;
import com.tencent.tencentmap.mapsdk.maps.model.ArcOptions;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Polyline;
import com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions;
import com.tencent.wxmm.v2helper;
import java.util.ArrayList;

/* renamed from: com.tencent.mapsdk.internal.ow */
public final class C114024ow extends C114027oy<C113513ag> implements C113513ag {

    /* renamed from: a */
    public C113523ar f341039a;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C113961mq f341040n;

    /* renamed from: o */
    private LatLng f341041o;

    /* renamed from: p */
    private LatLng f341042p;

    /* renamed from: q */
    private LatLng f341043q;

    /* renamed from: r */
    private float f341044r;

    /* renamed from: s */
    private LatLng f341045s;

    /* renamed from: t */
    private double f341046t;

    /* renamed from: u */
    private double f341047u;

    /* renamed from: v */
    private int f341048v = -16776961;

    /* renamed from: w */
    private float f341049w = 10.0f;

    /* renamed from: x */
    private boolean f341050x;

    public C114024ow(ArcOptions arcOptions, C113532ba baVar) {
        super(baVar);
        C113961mq b = baVar.mo171576b();
        this.f341040n = b;
        if (b != null && arcOptions != null) {
            LatLng startLatLng = arcOptions.getStartLatLng();
            LatLng passLatLng = arcOptions.getPassLatLng();
            LatLng endLatLng = arcOptions.getEndLatLng();
            float angle = arcOptions.getAngle() >= 0.0f ? arcOptions.getAngle() % 360.0f : (arcOptions.getAngle() % 360.0f) + 360.0f;
            if (startLatLng != null && endLatLng != null && !startLatLng.equals(endLatLng)) {
                if (passLatLng != null || (angle != 0.0f && angle != 180.0f)) {
                    if (passLatLng == null || (!passLatLng.equals(startLatLng) && !passLatLng.equals(endLatLng))) {
                        if (this.f341041o != startLatLng) {
                            this.f341041o = startLatLng;
                            mo172606q();
                        }
                        if (this.f341042p != endLatLng) {
                            this.f341042p = endLatLng;
                            mo172606q();
                        }
                        if (this.f341043q != passLatLng) {
                            this.f341043q = passLatLng;
                            mo172606q();
                        }
                        if (this.f341044r != angle) {
                            this.f341044r = angle;
                            mo172606q();
                        }
                        setColor(arcOptions.getColor());
                        setWidth(arcOptions.getWidth());
                        setStrokeWidth(arcOptions.getStrokeWidth());
                        setStrokeColor(arcOptions.getStrokeColor());
                        this.f341050x = arcOptions.isShowArrow();
                        if (mo172605p()) {
                            m158505e();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m158502b(LatLng latLng) {
        if (this.f341042p != latLng) {
            this.f341042p = latLng;
            mo172606q();
        }
    }

    /* renamed from: c */
    private void m158503c(LatLng latLng) {
        if (this.f341043q != latLng) {
            this.f341043q = latLng;
            mo172606q();
        }
    }

    /* renamed from: d */
    private C113513ag m158504d() {
        return this;
    }

    /* renamed from: e */
    private void m158505e() {
        boolean z;
        double d;
        LatLng latLng = this.f341041o;
        LatLng latLng2 = this.f341043q;
        LatLng latLng3 = this.f341042p;
        float f = this.f341044r;
        C113741fw b = this.f341040n.f340906n.mo172032b(latLng);
        C113741fw b2 = this.f341040n.f340906n.mo172032b(latLng3);
        C113741fw fwVar = new C113741fw(0.0d, 0.0d);
        if (f == 0.0f) {
            C113741fw b3 = this.f341040n.f340906n.mo172032b(latLng2);
            double a = C113904kw.m157747a((Coordinate) b, (Coordinate) b3, (Coordinate) b2, (Coordinate) fwVar);
            z = C113904kw.m157742a(b.mo172089x(), b.mo172090y(), b2.mo172089x(), b2.mo172090y(), b3.mo172089x(), b3.mo172090y()) > 0.0d;
            d = a;
        } else {
            boolean z2 = f < 180.0f;
            if (f > 180.0f) {
                f = 360.0f - f;
            }
            d = C113904kw.m157745a(b, b2, (double) (f * 2.0f), z2, fwVar);
            z = z2;
        }
        this.f341045s = this.f341040n.f340906n.mo172029a(fwVar);
        this.f341046t = C113904kw.m157764b((Coordinate) b, (Coordinate) b2, (Coordinate) fwVar);
        this.f341047u = C113904kw.m157744a((Coordinate) b, (Coordinate) fwVar);
        final LatLng[] latLngArr = new LatLng[v2helper.VOIP_ENC_HEIGHT_LV1];
        C113904kw.m157759a(fwVar, d, b, b2, z, (IndexCallback<Pair<Double, Double>>) new IndexCallback<Pair<Double, Double>>() {
            /* renamed from: a */
            private void m158511a(int i, Pair<Double, Double> pair) {
                latLngArr[i] = C114024ow.this.f341040n.f340906n.mo172029a(new C113741fw(((Double) pair.first).doubleValue(), ((Double) pair.second).doubleValue()));
            }

            public final /* synthetic */ void callback(int i, Object obj) {
                Pair pair = (Pair) obj;
                latLngArr[i] = C114024ow.this.f341040n.f340906n.mo172029a(new C113741fw(((Double) pair.first).doubleValue(), ((Double) pair.second).doubleValue()));
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f341041o);
        for (int i = 0; i < 360; i++) {
            LatLng latLng4 = latLngArr[i];
            if (latLng4 != null) {
                arrayList.add(latLng4);
            }
        }
        arrayList.add(this.f341042p);
        C113523ar arVar = this.f341039a;
        if (arVar != null) {
            arVar.remove();
        }
        Polyline a2 = this.f341040n.mo172420a(new PolylineOptions().addAll(arrayList).color(this.f341048v).width(this.f341049w).borderWidth(getStrokeWidth()).borderColor(getStrokeColor()).zIndex(getZIndex()).level(getLevel()).arrow(this.f341050x).lineCap(true));
        if (a2 instanceof C113530ay) {
            this.f341039a = ((C113530ay) a2).f339738i;
        }
        this.f341040n.f340914v = true;
    }

    /* renamed from: f_ */
    public final /* bridge */ /* synthetic */ C113521ap mo171394f_() {
        return this;
    }

    public final LatLng getCenter() {
        return this.f341045s;
    }

    public final int getColor() {
        return this.f341048v;
    }

    public final double getLength() {
        return this.f341046t;
    }

    public final double getRadius() {
        return this.f341047u;
    }

    public final float getWidth() {
        return this.f341049w;
    }

    /* renamed from: h_ */
    public final void mo172595h_() {
        super.mo172595h_();
        C113523ar arVar = this.f341039a;
        if (arVar != null) {
            arVar.remove();
            this.f341039a = null;
        }
    }

    /* renamed from: j_ */
    public final void mo172596j_() {
        if (this.f341040n != null && this.f341039a != null) {
            if (!isVisible()) {
                this.f341039a.remove();
            } else if (mo172605p()) {
                m158505e();
                C113523ar arVar = this.f341039a;
                if (arVar instanceof C113704ep) {
                    C113704ep epVar = (C113704ep) arVar;
                    if (mo172002a() == -1) {
                        this.f341070k = epVar.mo172002a();
                    } else {
                        epVar.mo172003j();
                    }
                }
            }
        }
    }

    public final void setColor(int i) {
        if (this.f341048v != i) {
            this.f341048v = i;
            mo172606q();
        }
    }

    public final void setWidth(float f) {
        if (this.f341049w != f) {
            this.f341049w = f;
            mo172606q();
        }
    }

    /* renamed from: a */
    private void m158500a(LatLng latLng) {
        if (this.f341041o != latLng) {
            this.f341041o = latLng;
            mo172606q();
        }
    }

    /* renamed from: b */
    public final Rect getBound(C113707es esVar) {
        LatLng latLng = this.f341045s;
        if (latLng == null) {
            return super.getBound(esVar);
        }
        C113741fw b = esVar.mo172032b(latLng);
        double d = b.f340307c;
        double d2 = this.f341047u;
        C113741fw fwVar = new C113741fw(d - d2, b.f340306b - d2);
        double d3 = b.f340307c;
        double d4 = this.f341047u;
        C113741fw fwVar2 = new C113741fw(d3 + d4, b.f340306b + d4);
        LatLng a = esVar.mo172029a(fwVar);
        LatLng a2 = esVar.mo172029a(fwVar2);
        Rect rect = new Rect();
        rect.left = (int) (a.longitude * 1000000.0d);
        rect.top = (int) (a.latitude * 1000000.0d);
        rect.right = (int) (a2.longitude * 1000000.0d);
        rect.bottom = (int) (a2.latitude * 1000000.0d);
        return rect;
    }

    /* renamed from: a */
    private void m158499a(float f) {
        if (this.f341044r != f) {
            this.f341044r = f;
            mo172606q();
        }
    }

    /* renamed from: a */
    public final void mo171266a(ArcOptions arcOptions) {
        if (this.f341040n != null && arcOptions != null) {
            LatLng startLatLng = arcOptions.getStartLatLng();
            LatLng passLatLng = arcOptions.getPassLatLng();
            LatLng endLatLng = arcOptions.getEndLatLng();
            float angle = arcOptions.getAngle() >= 0.0f ? arcOptions.getAngle() % 360.0f : (arcOptions.getAngle() % 360.0f) + 360.0f;
            if (startLatLng != null && endLatLng != null && !startLatLng.equals(endLatLng)) {
                if (passLatLng != null || (angle != 0.0f && angle != 180.0f)) {
                    if (passLatLng == null || (!passLatLng.equals(startLatLng) && !passLatLng.equals(endLatLng))) {
                        if (this.f341041o != startLatLng) {
                            this.f341041o = startLatLng;
                            mo172606q();
                        }
                        if (this.f341042p != endLatLng) {
                            this.f341042p = endLatLng;
                            mo172606q();
                        }
                        if (this.f341043q != passLatLng) {
                            this.f341043q = passLatLng;
                            mo172606q();
                        }
                        if (this.f341044r != angle) {
                            this.f341044r = angle;
                            mo172606q();
                        }
                        setColor(arcOptions.getColor());
                        setWidth(arcOptions.getWidth());
                        setStrokeWidth(arcOptions.getStrokeWidth());
                        setStrokeColor(arcOptions.getStrokeColor());
                        this.f341050x = arcOptions.isShowArrow();
                        if (mo172605p()) {
                            m158505e();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m158501a(boolean z) {
        this.f341050x = z;
    }
}
