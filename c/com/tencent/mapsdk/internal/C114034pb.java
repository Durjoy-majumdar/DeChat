package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.lib.models.PolygonInfo;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.tencent.mapsdk.internal.pb */
public final class C114034pb extends C114027oy<C113522aq> implements C113522aq, C113722fg {

    /* renamed from: L */
    private static final double f341136L = 1.0E-10d;

    /* renamed from: n */
    private static final int f341137n = 180;

    /* renamed from: o */
    private static final int f341138o = 1;

    /* renamed from: A */
    private GeoPoint f341139A = new GeoPoint();

    /* renamed from: B */
    private Rect f341140B = new Rect();

    /* renamed from: C */
    private GeoPoint[] f341141C;

    /* renamed from: D */
    private boolean f341142D = false;

    /* renamed from: E */
    private boolean f341143E = false;

    /* renamed from: F */
    private ArrayList<C114108qh> f341144F;

    /* renamed from: G */
    private ArrayList<C114108qh> f341145G;

    /* renamed from: H */
    private PolygonOptions f341146H;

    /* renamed from: I */
    private C113961mq f341147I;

    /* renamed from: J */
    private String f341148J;

    /* renamed from: K */
    private BitmapDescriptor f341149K;

    /* renamed from: a */
    public final PolygonInfo f341150a;

    /* renamed from: p */
    private List<GeoPoint> f341151p = new CopyOnWriteArrayList();

    /* renamed from: q */
    private List<LatLng> f341152q;

    /* renamed from: r */
    private List<List<LatLng>> f341153r;

    /* renamed from: s */
    private C113741fw[] f341154s;

    /* renamed from: t */
    private GeoPoint f341155t;

    /* renamed from: u */
    private Rect f341156u;

    /* renamed from: v */
    private Rect f341157v;

    /* renamed from: w */
    private C114108qh f341158w;

    /* renamed from: x */
    private final byte[] f341159x = new byte[0];

    /* renamed from: y */
    private C67646b f341160y = new C67646b((byte) 0);

    /* renamed from: z */
    private String f341161z;

    /* renamed from: com.tencent.mapsdk.internal.pb$a */
    public class C114035a {

        /* renamed from: a */
        public LatLng[] f341162a;

        public C114035a(LatLng latLng, LatLng latLng2) {
            LatLng[] latLngArr = new LatLng[2];
            this.f341162a = latLngArr;
            latLngArr[0] = latLng;
            latLngArr[1] = latLng2;
        }

        public final String toString() {
            return this.f341162a[0].toString() + "    " + this.f341162a[1].toString();
        }
    }

    public C114034pb(C113532ba baVar, PolygonOptions polygonOptions) {
        super(baVar);
        PolygonInfo polygonInfo = new PolygonInfo();
        this.f341150a = polygonInfo;
        polygonInfo.polygonId = -1;
        this.f341146H = polygonOptions;
        this.f341147I = baVar.mo171576b();
        if (polygonOptions != null && !C40002he.m42805a(this.f341148J)) {
            this.f341147I.f340901i.mo171213a((C113722fg) this);
        }
        mo171383a(polygonOptions);
    }

    /* renamed from: a */
    private static double m158638a(double d, double d2, double d3, double d4, double d5, double d6) {
        return ((d3 - d) * (d6 - d2)) - ((d5 - d) * (d4 - d2));
    }

    /* renamed from: a */
    private void m158643a(List<GeoPoint> list) {
        if (!list.isEmpty()) {
            List<GeoPoint> list2 = this.f341151p;
            if (list2 == null) {
                this.f341151p = new ArrayList();
            } else {
                list2.clear();
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                GeoPoint geoPoint = list.get(i);
                if (geoPoint != null) {
                    mo172606q();
                    this.f341151p.add(geoPoint);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m158644a(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d3 - d;
        double d9 = d7 - d6;
        double d15 = d4 - d2;
        double d16 = 180.0d - d5;
        double d17 = (d8 * d9) - (d15 * d16);
        if (d17 != 0.0d) {
            double d18 = d2 - d6;
            double d19 = d - d5;
            double d25 = ((d16 * d18) - (d9 * d19)) / d17;
            double d26 = ((d18 * d8) - (d19 * d15)) / d17;
            return d25 >= 0.0d && d25 <= 1.0d && d26 >= 0.0d && d26 <= 1.0d;
        }
    }

    /* renamed from: e */
    private void m158653e() {
        PolygonInfo polygonInfo = this.f341150a;
        if (-1 == polygonInfo.polygonId) {
            polygonInfo.polygonId = this.f341147I.mo172417a(polygonInfo);
        } else if (mo172605p()) {
            this.f341147I.mo172447b(this.f341150a);
        }
    }

    /* renamed from: f */
    private Rect m158654f() {
        Rect rect = this.f341156u;
        if (rect != null) {
            return rect;
        }
        List<GeoPoint> list = this.f341151p;
        if (list == null || list.isEmpty() || this.f341151p.size() < 3) {
            return null;
        }
        GeoPoint geoPoint = this.f341151p.get(0);
        int latitudeE6 = geoPoint.getLatitudeE6();
        int longitudeE6 = geoPoint.getLongitudeE6();
        int size = this.f341151p.size();
        int i = latitudeE6;
        int i2 = i;
        int i3 = longitudeE6;
        for (int i4 = 1; i4 < size; i4++) {
            GeoPoint geoPoint2 = this.f341151p.get(i4);
            int latitudeE62 = geoPoint2.getLatitudeE6();
            int longitudeE62 = geoPoint2.getLongitudeE6();
            longitudeE6 = Math.min(longitudeE6, longitudeE62);
            i3 = Math.max(i3, longitudeE62);
            i = Math.max(i, latitudeE62);
            i2 = Math.min(i2, latitudeE62);
        }
        Rect rect2 = new Rect(longitudeE6, i, i3, i2);
        this.f341156u = rect2;
        return rect2;
    }

    /* renamed from: g */
    private Rect m158655g() {
        Rect rect = this.f341157v;
        if (rect != null) {
            return rect;
        }
        List<GeoPoint> list = this.f341151p;
        if (list == null || list.isEmpty() || this.f341151p.size() < 3) {
            return null;
        }
        C113741fw b = this.f341147I.f340906n.mo172032b(this.f341151p.get(0).toLatLng());
        int x = (int) b.mo172089x();
        int x2 = (int) b.mo172089x();
        int y = (int) b.mo172090y();
        int y2 = (int) b.mo172090y();
        int size = this.f341151p.size();
        for (int i = 1; i < size; i++) {
            C113741fw b2 = this.f341147I.f340906n.mo172032b(this.f341151p.get(i).toLatLng());
            x = (int) Math.min((double) x, b2.mo172089x());
            x2 = (int) Math.max((double) x2, b2.mo172089x());
            y = (int) Math.min((double) y, b2.mo172090y());
            y2 = (int) Math.max((double) y2, b2.mo172090y());
        }
        Rect rect2 = new Rect(x, y, x2, y2);
        this.f341157v = rect2;
        return rect2;
    }

    /* renamed from: h */
    private C113522aq m158656h() {
        return this;
    }

    /* renamed from: i */
    private Rect m158657i() {
        if (this.f341147I == null) {
            return null;
        }
        C113741fw b = this.f341147I.f340906n.mo172032b(this.f341147I.f340906n.mo172025a(new C113732fo(0.0d, 0.0d)).toLatLng());
        C113741fw b2 = this.f341147I.f340906n.mo172032b(this.f341147I.f340906n.mo172025a(new C113732fo((double) this.f341147I.f340907o.width(), (double) this.f341147I.f340907o.height())).toLatLng());
        C113741fw b3 = this.f341147I.f340906n.mo172032b(this.f341147I.f340906n.mo172025a(new C113732fo(0.0d, (double) this.f341147I.f340907o.height())).toLatLng());
        C113741fw b4 = this.f341147I.f340906n.mo172032b(this.f341147I.f340906n.mo172025a(new C113732fo((double) this.f341147I.f340907o.width(), 0.0d)).toLatLng());
        return new Rect((int) Math.min(Math.min(Math.min(b.mo172089x(), b3.mo172089x()), b2.mo172089x()), b4.mo172089x()), (int) Math.min(Math.min(Math.min(b.mo172090y(), b3.mo172090y()), b2.mo172090y()), b4.mo172090y()), (int) Math.max(Math.max(Math.max(b.mo172089x(), b3.mo172089x()), b2.mo172089x()), b4.mo172089x()), (int) Math.max(Math.max(Math.max(b.mo172090y(), b3.mo172090y()), b2.mo172090y()), b4.mo172090y()));
    }

    /* renamed from: t */
    private static int m158658t() {
        return 1;
    }

    /* renamed from: u */
    private C114035a[] m158659u() {
        List<GeoPoint> list = this.f341151p;
        List<LatLng> a = C113883ke.m157467a(list);
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (i < i2) {
                i++;
                arrayList.add(new C114035a(a.get(i), a.get(i)));
            } else {
                arrayList.add(new C114035a(a.get(i2), a.get(0)));
                return (C114035a[]) arrayList.toArray(new C114035a[arrayList.size()]);
            }
        }
    }

    /* renamed from: b */
    public final PolygonInfo mo171384b() {
        return this.f341150a;
    }

    /* renamed from: c */
    public final List<GeoPoint> mo171385c() {
        ArrayList arrayList = new ArrayList(49);
        Rect f = m158654f();
        int i = f.left;
        int i2 = f.top;
        double d = (double) i;
        double abs = (double) Math.abs(f.width());
        double d2 = d - (abs * 0.125d);
        double d3 = (double) i2;
        double abs2 = (double) Math.abs(f.height());
        double d4 = d3 - (0.125d * abs2);
        ArrayList arrayList2 = arrayList;
        double d5 = d - (abs * 0.25d);
        double d6 = d3 - (0.25d * abs2);
        double d7 = d - (abs * 0.375d);
        double d8 = d3 - (0.375d * abs2);
        double d9 = d - (abs * 0.5d);
        double d15 = d3 - (0.5d * abs2);
        double d16 = d - (abs * 0.625d);
        double d17 = d3 - (0.625d * abs2);
        double d18 = d - (abs * 0.75d);
        double d19 = d3 - (0.75d * abs2);
        double d25 = d - (abs * 0.825d);
        double d26 = d3 - (abs2 * 0.825d);
        int i3 = (int) d4;
        int i4 = (int) d2;
        GeoPoint geoPoint = new GeoPoint(new GeoPoint(i3, i4));
        if (m158646a(geoPoint)) {
            arrayList2.add(geoPoint);
        }
        int i5 = (int) d6;
        GeoPoint geoPoint2 = new GeoPoint(new GeoPoint(i5, i4));
        if (m158646a(geoPoint2)) {
            arrayList2.add(geoPoint2);
        }
        int i6 = (int) d8;
        GeoPoint geoPoint3 = new GeoPoint(new GeoPoint(i6, i4));
        if (m158646a(geoPoint3)) {
            arrayList2.add(geoPoint3);
        }
        int i7 = (int) d15;
        GeoPoint geoPoint4 = new GeoPoint(new GeoPoint(i7, i4));
        if (m158646a(geoPoint4)) {
            arrayList2.add(geoPoint4);
        }
        double d27 = d25;
        int i8 = (int) d17;
        GeoPoint geoPoint5 = new GeoPoint(new GeoPoint(i8, i4));
        if (m158646a(geoPoint5)) {
            arrayList2.add(geoPoint5);
        }
        int i9 = (int) d19;
        GeoPoint geoPoint6 = new GeoPoint(new GeoPoint(i9, i4));
        if (m158646a(geoPoint6)) {
            arrayList2.add(geoPoint6);
        }
        int i15 = (int) d26;
        GeoPoint geoPoint7 = new GeoPoint(new GeoPoint(i15, i4));
        if (m158646a(geoPoint7)) {
            arrayList2.add(geoPoint7);
        }
        int i16 = (int) d5;
        GeoPoint geoPoint8 = new GeoPoint(new GeoPoint(i3, i16));
        if (m158646a(geoPoint8)) {
            arrayList2.add(geoPoint8);
        }
        GeoPoint geoPoint9 = new GeoPoint(new GeoPoint(i5, i16));
        if (m158646a(geoPoint9)) {
            arrayList2.add(geoPoint9);
        }
        GeoPoint geoPoint10 = new GeoPoint(new GeoPoint(i6, i16));
        if (m158646a(geoPoint10)) {
            arrayList2.add(geoPoint10);
        }
        GeoPoint geoPoint11 = new GeoPoint(new GeoPoint(i7, i16));
        if (m158646a(geoPoint11)) {
            arrayList2.add(geoPoint11);
        }
        GeoPoint geoPoint12 = new GeoPoint(new GeoPoint(i8, i16));
        if (m158646a(geoPoint12)) {
            arrayList2.add(geoPoint12);
        }
        GeoPoint geoPoint13 = new GeoPoint(new GeoPoint(i9, i16));
        if (m158646a(geoPoint13)) {
            arrayList2.add(geoPoint13);
        }
        GeoPoint geoPoint14 = new GeoPoint(new GeoPoint(i15, i16));
        if (m158646a(geoPoint14)) {
            arrayList2.add(geoPoint14);
        }
        int i17 = (int) d7;
        GeoPoint geoPoint15 = new GeoPoint(new GeoPoint(i3, i17));
        if (m158646a(geoPoint15)) {
            arrayList2.add(geoPoint15);
        }
        GeoPoint geoPoint16 = new GeoPoint(new GeoPoint(i5, i17));
        if (m158646a(geoPoint16)) {
            arrayList2.add(geoPoint16);
        }
        GeoPoint geoPoint17 = new GeoPoint(new GeoPoint(i6, i17));
        if (m158646a(geoPoint17)) {
            arrayList2.add(geoPoint17);
        }
        GeoPoint geoPoint18 = new GeoPoint(new GeoPoint(i7, i17));
        if (m158646a(geoPoint18)) {
            arrayList2.add(geoPoint18);
        }
        GeoPoint geoPoint19 = new GeoPoint(new GeoPoint(i8, i17));
        if (m158646a(geoPoint19)) {
            arrayList2.add(geoPoint19);
        }
        GeoPoint geoPoint20 = new GeoPoint(new GeoPoint(i9, i17));
        if (m158646a(geoPoint20)) {
            arrayList2.add(geoPoint20);
        }
        GeoPoint geoPoint21 = new GeoPoint(new GeoPoint(i15, i17));
        if (m158646a(geoPoint21)) {
            arrayList2.add(geoPoint21);
        }
        int i18 = (int) d9;
        GeoPoint geoPoint22 = new GeoPoint(new GeoPoint(i3, i18));
        if (m158646a(geoPoint22)) {
            arrayList2.add(geoPoint22);
        }
        GeoPoint geoPoint23 = new GeoPoint(new GeoPoint(i5, i18));
        if (m158646a(geoPoint23)) {
            arrayList2.add(geoPoint23);
        }
        GeoPoint geoPoint24 = new GeoPoint(new GeoPoint(i6, i18));
        if (m158646a(geoPoint24)) {
            arrayList2.add(geoPoint24);
        }
        GeoPoint geoPoint25 = new GeoPoint(new GeoPoint(i7, i18));
        if (m158646a(geoPoint25)) {
            arrayList2.add(geoPoint25);
        }
        GeoPoint geoPoint26 = new GeoPoint(new GeoPoint(i8, i18));
        if (m158646a(geoPoint26)) {
            arrayList2.add(geoPoint26);
        }
        GeoPoint geoPoint27 = new GeoPoint(new GeoPoint(i9, i18));
        if (m158646a(geoPoint27)) {
            arrayList2.add(geoPoint27);
        }
        GeoPoint geoPoint28 = new GeoPoint(new GeoPoint(i15, i18));
        if (m158646a(geoPoint28)) {
            arrayList2.add(geoPoint28);
        }
        int i19 = (int) d16;
        GeoPoint geoPoint29 = new GeoPoint(new GeoPoint(i3, i19));
        if (m158646a(geoPoint29)) {
            arrayList2.add(geoPoint29);
        }
        GeoPoint geoPoint30 = new GeoPoint(new GeoPoint(i5, i19));
        if (m158646a(geoPoint30)) {
            arrayList2.add(geoPoint30);
        }
        GeoPoint geoPoint31 = new GeoPoint(new GeoPoint(i6, i19));
        if (m158646a(geoPoint31)) {
            arrayList2.add(geoPoint31);
        }
        GeoPoint geoPoint32 = new GeoPoint(new GeoPoint(i7, i19));
        if (m158646a(geoPoint32)) {
            arrayList2.add(geoPoint32);
        }
        GeoPoint geoPoint33 = new GeoPoint(new GeoPoint(i8, i19));
        if (m158646a(geoPoint33)) {
            arrayList2.add(geoPoint33);
        }
        GeoPoint geoPoint34 = new GeoPoint(new GeoPoint(i9, i19));
        if (m158646a(geoPoint34)) {
            arrayList2.add(geoPoint34);
        }
        GeoPoint geoPoint35 = new GeoPoint(new GeoPoint(i15, i19));
        if (m158646a(geoPoint35)) {
            arrayList2.add(geoPoint35);
        }
        int i25 = (int) d18;
        GeoPoint geoPoint36 = new GeoPoint(new GeoPoint(i3, i25));
        if (m158646a(geoPoint36)) {
            arrayList2.add(geoPoint36);
        }
        GeoPoint geoPoint37 = new GeoPoint(new GeoPoint(i5, i25));
        if (m158646a(geoPoint37)) {
            arrayList2.add(geoPoint37);
        }
        GeoPoint geoPoint38 = new GeoPoint(new GeoPoint(i6, i25));
        if (m158646a(geoPoint38)) {
            arrayList2.add(geoPoint38);
        }
        GeoPoint geoPoint39 = new GeoPoint(new GeoPoint(i7, i25));
        if (m158646a(geoPoint39)) {
            arrayList2.add(geoPoint39);
        }
        GeoPoint geoPoint40 = new GeoPoint(new GeoPoint(i8, i25));
        if (m158646a(geoPoint40)) {
            arrayList2.add(geoPoint40);
        }
        GeoPoint geoPoint41 = new GeoPoint(new GeoPoint(i9, i25));
        if (m158646a(geoPoint41)) {
            arrayList2.add(geoPoint41);
        }
        GeoPoint geoPoint42 = new GeoPoint(new GeoPoint(i15, i25));
        if (m158646a(geoPoint42)) {
            arrayList2.add(geoPoint42);
        }
        int i26 = (int) d27;
        GeoPoint geoPoint43 = new GeoPoint(new GeoPoint(i3, i26));
        if (m158646a(geoPoint43)) {
            arrayList2.add(geoPoint43);
        }
        GeoPoint geoPoint44 = new GeoPoint(new GeoPoint(i5, i26));
        if (m158646a(geoPoint44)) {
            arrayList2.add(geoPoint44);
        }
        GeoPoint geoPoint45 = new GeoPoint(new GeoPoint(i6, i26));
        if (m158646a(geoPoint45)) {
            arrayList2.add(geoPoint45);
        }
        GeoPoint geoPoint46 = new GeoPoint(new GeoPoint(i7, i26));
        if (m158646a(geoPoint46)) {
            arrayList2.add(geoPoint46);
        }
        GeoPoint geoPoint47 = new GeoPoint(new GeoPoint(i8, i26));
        if (m158646a(geoPoint47)) {
            arrayList2.add(geoPoint47);
        }
        GeoPoint geoPoint48 = new GeoPoint(new GeoPoint(i9, i26));
        if (m158646a(geoPoint48)) {
            arrayList2.add(geoPoint48);
        }
        GeoPoint geoPoint49 = new GeoPoint(new GeoPoint(i15, i26));
        if (m158646a(geoPoint49)) {
            arrayList2.add(geoPoint49);
        }
        return arrayList2;
    }

    public final boolean contains(LatLng latLng) {
        LatLng latLng2 = latLng;
        List<LatLng> points = getPoints();
        if (points == null || points.size() < 3 || latLng2 == null) {
            return false;
        }
        int size = points.size() - 1;
        for (int i = 0; i < points.size(); i++) {
            if (points.get(i).equals(latLng2)) {
                return true;
            }
        }
        int i2 = size;
        boolean z = false;
        for (int i3 = 0; i3 < points.size(); i3++) {
            if (((points.get(i3).latitude < latLng2.latitude && points.get(i2).latitude >= latLng2.latitude) || (points.get(i2).latitude < latLng2.latitude && points.get(i3).latitude >= latLng2.latitude)) && (points.get(i3).longitude <= latLng2.longitude || points.get(i2).longitude <= latLng2.longitude)) {
                z ^= points.get(i3).longitude + (((latLng2.latitude - points.get(i3).latitude) / (points.get(i2).latitude - points.get(i3).latitude)) * (points.get(i2).longitude - points.get(i3).longitude)) <= latLng2.longitude;
            }
            i2 = i3;
        }
        return z;
    }

    /* renamed from: d */
    public final GeoPoint mo172012d() {
        Rect f = m158654f();
        return new GeoPoint(f.centerY(), f.centerX());
    }

    /* renamed from: f_ */
    public final /* bridge */ /* synthetic */ C113521ap mo171394f_() {
        return this;
    }

    public final List<LatLng> getPoints() {
        List<LatLng> list = this.f341152q;
        return list != null ? list : C113883ke.m157467a(this.f341151p);
    }

    /* renamed from: h_ */
    public final void mo172595h_() {
        C113961mq mqVar = this.f341147I;
        if (mqVar != null) {
            mqVar.f340901i.mo171229b((C113722fg) this);
            PolygonInfo polygonInfo = this.f341150a;
            if (polygonInfo != null) {
                this.f341147I.mo172426a(polygonInfo.polygonId);
            }
            List<GeoPoint> list = this.f341151p;
            if (list != null) {
                list.clear();
            }
            synchronized (this.f341159x) {
                C67646b bVar = this.f341160y;
                if (bVar != null) {
                    Bitmap bitmap = bVar.f193426a;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bVar.f193426a.recycle();
                        bVar.f193426a = null;
                    }
                    this.f341160y = null;
                }
            }
            C114108qh qhVar = this.f341158w;
            if (qhVar != null) {
                this.f341147I.f340903k.mo171688b((C113709et) qhVar);
                this.f341147I.f340914v = true;
                this.f341158w = null;
            }
            this.f341142D = false;
        }
    }

    public final boolean handleOnTap() {
        return true;
    }

    public final boolean isSelected() {
        return false;
    }

    /* renamed from: j */
    public final void mo172003j() {
        List<GeoPoint> list;
        if (this.f341147I != null) {
            if ((this.f341150a.polygonId < 0 || mo172605p()) && (list = this.f341151p) != null && list.size() > 2) {
                PolygonInfo polygonInfo = this.f341150a;
                polygonInfo.color = this.f341064e;
                polygonInfo.borderColor = this.f341065f;
                polygonInfo.borderWidth = this.f341063d;
                polygonInfo.zIndex = (float) getZIndex();
                this.f341150a.level = getLevel();
                int size = this.f341151p.size();
                this.f341150a.points = new LatLng[size];
                for (int i = 0; i < size; i++) {
                    this.f341150a.points[i] = this.f341151p.get(i).toLatLng();
                }
                int size2 = this.f341153r.size();
                this.f341150a.holePoints = new LatLng[size2][];
                for (int i2 = 0; i2 < size2; i2++) {
                    this.f341150a.holePoints[i2] = (LatLng[]) this.f341153r.get(i2).toArray(new LatLng[0]);
                }
                this.f341147I.f340914v = true;
                mo172606q();
            }
        }
    }

    /* renamed from: j_ */
    public final void mo172596j_() {
        C113961mq mqVar = this.f341147I;
        if (mqVar != null) {
            int i = -1;
            if (!isVisible()) {
                mqVar.mo172426a(this.f341150a.polygonId);
                this.f341150a.polygonId = -1;
                return;
            }
            if (C40002he.m42805a(this.f341148J)) {
                mo172003j();
            }
            PolygonInfo polygonInfo = this.f341150a;
            if (-1 == polygonInfo.polygonId) {
                polygonInfo.polygonId = this.f341147I.mo172417a(polygonInfo);
            } else if (mo172605p()) {
                this.f341147I.mo172447b(this.f341150a);
            }
            C114108qh qhVar = this.f341158w;
            if (qhVar != null) {
                qhVar.mo172596j_();
                StringBuilder sb = new StringBuilder();
                sb.append(this.f341158w.mo172014f());
                this.f341161z = sb.toString();
                if (!this.f341143E) {
                    int f = this.f341158w.mo172014f();
                    PolygonInfo polygonInfo2 = this.f341150a;
                    if (polygonInfo2 != null) {
                        i = polygonInfo2.polygonId;
                    }
                    mqVar.mo172427a(f, i);
                    this.f341143E = true;
                }
            }
        }
    }

    /* renamed from: k_ */
    public final int mo171387k_() {
        PolygonInfo polygonInfo = this.f341150a;
        if (polygonInfo == null) {
            return -1;
        }
        return polygonInfo.polygonId;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x020d, code lost:
        if (r8 <= (r4 / 2.0d)) goto L_0x0211;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTap(float r16, float r17) {
        /*
            r15 = this;
            r0 = r15
            com.tencent.mapsdk.internal.mq r1 = r0.f341147I
            r2 = 0
            if (r1 == 0) goto L_0x0238
            boolean r1 = r15.isVisible()
            if (r1 != 0) goto L_0x000e
            goto L_0x0238
        L_0x000e:
            android.graphics.Rect r1 = r0.f341157v
            r3 = 1
            if (r1 != 0) goto L_0x009e
            java.util.List<com.tencent.map.lib.models.GeoPoint> r1 = r0.f341151p
            if (r1 == 0) goto L_0x009e
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x009e
            java.util.List<com.tencent.map.lib.models.GeoPoint> r1 = r0.f341151p
            int r1 = r1.size()
            r4 = 3
            if (r1 >= r4) goto L_0x0027
            goto L_0x009e
        L_0x0027:
            java.util.List<com.tencent.map.lib.models.GeoPoint> r1 = r0.f341151p
            java.lang.Object r1 = r1.get(r2)
            com.tencent.map.lib.models.GeoPoint r1 = (com.tencent.map.lib.models.GeoPoint) r1
            com.tencent.mapsdk.internal.mq r4 = r0.f341147I
            com.tencent.mapsdk.internal.es r4 = r4.f340906n
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r1 = r1.toLatLng()
            com.tencent.mapsdk.internal.fw r1 = r4.mo172032b(r1)
            double r4 = r1.mo172089x()
            int r4 = (int) r4
            double r5 = r1.mo172089x()
            int r5 = (int) r5
            double r6 = r1.mo172090y()
            int r6 = (int) r6
            double r7 = r1.mo172090y()
            int r1 = (int) r7
            java.util.List<com.tencent.map.lib.models.GeoPoint> r7 = r0.f341151p
            int r7 = r7.size()
            r8 = 1
        L_0x0056:
            if (r8 >= r7) goto L_0x0097
            com.tencent.mapsdk.internal.mq r9 = r0.f341147I
            com.tencent.mapsdk.internal.es r9 = r9.f340906n
            java.util.List<com.tencent.map.lib.models.GeoPoint> r10 = r0.f341151p
            java.lang.Object r10 = r10.get(r8)
            com.tencent.map.lib.models.GeoPoint r10 = (com.tencent.map.lib.models.GeoPoint) r10
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r10 = r10.toLatLng()
            com.tencent.mapsdk.internal.fw r9 = r9.mo172032b(r10)
            double r10 = (double) r4
            double r12 = r9.mo172089x()
            double r10 = java.lang.Math.min(r10, r12)
            int r4 = (int) r10
            double r10 = (double) r5
            double r12 = r9.mo172089x()
            double r10 = java.lang.Math.max(r10, r12)
            int r5 = (int) r10
            double r10 = (double) r6
            double r12 = r9.mo172090y()
            double r10 = java.lang.Math.min(r10, r12)
            int r6 = (int) r10
            double r10 = (double) r1
            double r12 = r9.mo172090y()
            double r9 = java.lang.Math.max(r10, r12)
            int r1 = (int) r9
            int r8 = r8 + 1
            goto L_0x0056
        L_0x0097:
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r4, r6, r5, r1)
            r0.f341157v = r7
        L_0x009e:
            com.tencent.mapsdk.internal.mq r1 = r0.f341147I
            if (r1 == 0) goto L_0x01a6
            com.tencent.mapsdk.internal.fo r1 = new com.tencent.mapsdk.internal.fo
            r4 = 0
            r1.<init>(r4, r4)
            com.tencent.mapsdk.internal.mq r6 = r0.f341147I
            com.tencent.mapsdk.internal.es r6 = r6.f340906n
            com.tencent.map.lib.models.GeoPoint r1 = r6.mo172025a((com.tencent.mapsdk.internal.C113732fo) r1)
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r1 = r1.toLatLng()
            com.tencent.mapsdk.internal.mq r6 = r0.f341147I
            com.tencent.mapsdk.internal.es r6 = r6.f340906n
            com.tencent.mapsdk.internal.fw r1 = r6.mo172032b(r1)
            com.tencent.mapsdk.internal.fo r6 = new com.tencent.mapsdk.internal.fo
            com.tencent.mapsdk.internal.mq r7 = r0.f341147I
            android.graphics.Rect r7 = r7.f340907o
            int r7 = r7.width()
            double r7 = (double) r7
            com.tencent.mapsdk.internal.mq r9 = r0.f341147I
            android.graphics.Rect r9 = r9.f340907o
            int r9 = r9.height()
            double r9 = (double) r9
            r6.<init>(r7, r9)
            com.tencent.mapsdk.internal.mq r7 = r0.f341147I
            com.tencent.mapsdk.internal.es r7 = r7.f340906n
            com.tencent.map.lib.models.GeoPoint r6 = r7.mo172025a((com.tencent.mapsdk.internal.C113732fo) r6)
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r6 = r6.toLatLng()
            com.tencent.mapsdk.internal.mq r7 = r0.f341147I
            com.tencent.mapsdk.internal.es r7 = r7.f340906n
            com.tencent.mapsdk.internal.fw r6 = r7.mo172032b(r6)
            com.tencent.mapsdk.internal.fo r7 = new com.tencent.mapsdk.internal.fo
            com.tencent.mapsdk.internal.mq r8 = r0.f341147I
            android.graphics.Rect r8 = r8.f340907o
            int r8 = r8.height()
            double r8 = (double) r8
            r7.<init>(r4, r8)
            com.tencent.mapsdk.internal.mq r8 = r0.f341147I
            com.tencent.mapsdk.internal.es r8 = r8.f340906n
            com.tencent.map.lib.models.GeoPoint r7 = r8.mo172025a((com.tencent.mapsdk.internal.C113732fo) r7)
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r7 = r7.toLatLng()
            com.tencent.mapsdk.internal.mq r8 = r0.f341147I
            com.tencent.mapsdk.internal.es r8 = r8.f340906n
            com.tencent.mapsdk.internal.fw r7 = r8.mo172032b(r7)
            com.tencent.mapsdk.internal.fo r8 = new com.tencent.mapsdk.internal.fo
            com.tencent.mapsdk.internal.mq r9 = r0.f341147I
            android.graphics.Rect r9 = r9.f340907o
            int r9 = r9.width()
            double r9 = (double) r9
            r8.<init>(r9, r4)
            com.tencent.mapsdk.internal.mq r4 = r0.f341147I
            com.tencent.mapsdk.internal.es r4 = r4.f340906n
            com.tencent.map.lib.models.GeoPoint r4 = r4.mo172025a((com.tencent.mapsdk.internal.C113732fo) r8)
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r4 = r4.toLatLng()
            com.tencent.mapsdk.internal.mq r5 = r0.f341147I
            com.tencent.mapsdk.internal.es r5 = r5.f340906n
            com.tencent.mapsdk.internal.fw r4 = r5.mo172032b(r4)
            android.graphics.Rect r5 = new android.graphics.Rect
            double r8 = r1.mo172089x()
            double r10 = r7.mo172089x()
            double r8 = java.lang.Math.min(r8, r10)
            double r10 = r6.mo172089x()
            double r8 = java.lang.Math.min(r8, r10)
            double r10 = r4.mo172089x()
            double r8 = java.lang.Math.min(r8, r10)
            int r8 = (int) r8
            double r9 = r1.mo172090y()
            double r11 = r7.mo172090y()
            double r9 = java.lang.Math.min(r9, r11)
            double r11 = r6.mo172090y()
            double r9 = java.lang.Math.min(r9, r11)
            double r11 = r4.mo172090y()
            double r9 = java.lang.Math.min(r9, r11)
            int r9 = (int) r9
            double r10 = r1.mo172089x()
            double r12 = r7.mo172089x()
            double r10 = java.lang.Math.max(r10, r12)
            double r12 = r6.mo172089x()
            double r10 = java.lang.Math.max(r10, r12)
            double r12 = r4.mo172089x()
            double r10 = java.lang.Math.max(r10, r12)
            int r10 = (int) r10
            double r11 = r1.mo172090y()
            double r13 = r7.mo172090y()
            double r11 = java.lang.Math.max(r11, r13)
            double r6 = r6.mo172090y()
            double r6 = java.lang.Math.max(r11, r6)
            double r11 = r4.mo172090y()
            double r6 = java.lang.Math.max(r6, r11)
            int r1 = (int) r6
            r5.<init>(r8, r9, r10, r1)
            goto L_0x01a7
        L_0x01a6:
            r5 = 0
        L_0x01a7:
            android.graphics.Rect r1 = r0.f341157v
            if (r1 == 0) goto L_0x0210
            if (r5 == 0) goto L_0x0210
            int r4 = r1.left
            int r1 = r1.right
            int r4 = r4 + r1
            int r4 = r4 / 2
            int r1 = r5.left
            int r6 = r5.right
            int r1 = r1 + r6
            int r1 = r1 / 2
            int r4 = r4 - r1
            int r1 = java.lang.Math.abs(r4)
            double r6 = (double) r1
            android.graphics.Rect r1 = r0.f341157v
            int r4 = r1.top
            int r1 = r1.bottom
            int r4 = r4 + r1
            int r4 = r4 / 2
            int r1 = r5.top
            int r8 = r5.bottom
            int r1 = r1 + r8
            int r1 = r1 / 2
            int r4 = r4 - r1
            int r1 = java.lang.Math.abs(r4)
            double r8 = (double) r1
            android.graphics.Rect r1 = r0.f341157v
            int r4 = r1.left
            int r1 = r1.right
            int r4 = r4 - r1
            int r1 = java.lang.Math.abs(r4)
            int r4 = r5.left
            int r10 = r5.right
            int r4 = r4 - r10
            int r4 = java.lang.Math.abs(r4)
            int r1 = r1 + r4
            double r10 = (double) r1
            android.graphics.Rect r1 = r0.f341157v
            int r4 = r1.top
            int r1 = r1.bottom
            int r4 = r4 - r1
            int r1 = java.lang.Math.abs(r4)
            int r4 = r5.top
            int r5 = r5.bottom
            int r4 = r4 - r5
            int r4 = java.lang.Math.abs(r4)
            int r1 = r1 + r4
            double r4 = (double) r1
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = r10 / r12
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0210
            double r4 = r4 / r12
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0210
            goto L_0x0211
        L_0x0210:
            r3 = 0
        L_0x0211:
            if (r3 != 0) goto L_0x0214
            return r2
        L_0x0214:
            com.tencent.mapsdk.internal.mq r1 = r0.f341147I
            com.tencent.mapsdk.internal.es r1 = r1.f340906n
            com.tencent.mapsdk.internal.fo r2 = new com.tencent.mapsdk.internal.fo
            r3 = r16
            double r3 = (double) r3
            r5 = r17
            double r5 = (double) r5
            r2.<init>(r3, r5)
            com.tencent.map.lib.models.GeoPoint r1 = r1.mo172025a((com.tencent.mapsdk.internal.C113732fo) r2)
            com.tencent.mapsdk.internal.mq r2 = r0.f341147I
            com.tencent.mapsdk.internal.es r2 = r2.f340906n
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r1 = r1.toLatLng()
            com.tencent.mapsdk.internal.fw r1 = r2.mo172032b(r1)
            boolean r1 = r15.m158647a((com.tencent.mapsdk.internal.C113741fw) r1)
            return r1
        L_0x0238:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114034pb.onTap(float, float):boolean");
    }

    public final void setHolePoints(List<List<LatLng>> list) {
        if (list != null && list.size() > 0) {
            PolygonOptions polygonOptions = this.f341146H;
            if (polygonOptions != null) {
                polygonOptions.setHolePoints(list);
            }
            this.f341153r.clear();
            for (List next : list) {
                if (next != null && next.size() >= 3) {
                    this.f341153r.add(next);
                }
            }
        }
    }

    public final void setOptions(PolygonOptions polygonOptions) {
        mo171383a(polygonOptions);
    }

    public final void setPoints(List<LatLng> list) {
        int size;
        GeoPoint from;
        this.f341152q = list;
        if (list != null && (size = list.size()) > 0) {
            PolygonOptions polygonOptions = this.f341146H;
            if (polygonOptions != null) {
                polygonOptions.setPoints(new ArrayList(list));
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                LatLng latLng = list.get(i);
                if (!(latLng == null || (from = GeoPoint.from(latLng)) == null)) {
                    arrayList.add(from);
                }
            }
            m158643a((List<GeoPoint>) arrayList);
        }
    }

    public final void setSelected(boolean z) {
    }

    public final void setSelectedListener(Selectable.OnSelectedListener onSelectedListener) {
    }

    /* renamed from: b */
    private static boolean m158649b(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.abs(m158638a(d, d2, d3, d4, d5, d6)) < 1.0E-9d && (d - d3) * (d - d5) <= 0.0d && (d2 - d4) * (d2 - d6) <= 0.0d;
    }

    /* renamed from: d */
    private void m158651d(C113707es esVar) {
        if (this.f341147I != null && !C40002he.m42805a(this.f341148J)) {
            synchronized (this.f341159x) {
                if (this.f341160y == null) {
                    this.f341160y = new C67646b((byte) 0);
                }
            }
            Rect rect = this.f341140B;
            GeoPoint geoPoint = new GeoPoint(rect.top, rect.left);
            Rect rect2 = this.f341140B;
            GeoPoint geoPoint2 = new GeoPoint(rect2.top, rect2.right);
            Rect rect3 = this.f341140B;
            GeoPoint geoPoint3 = new GeoPoint(rect3.bottom, rect3.right);
            Rect rect4 = this.f341140B;
            GeoPoint geoPoint4 = new GeoPoint(rect4.bottom, rect4.left);
            C113732fo[] a = m158648a(new C113732fo[]{esVar.mo172027a(geoPoint), esVar.mo172027a(geoPoint2), esVar.mo172027a(geoPoint3), esVar.mo172027a(geoPoint4)});
            C113732fo foVar = a[0];
            C113732fo foVar2 = a[1];
            new Rect((int) foVar.f340215a, (int) foVar.f340216b, (int) foVar2.f340215a, (int) foVar2.f340216b);
        }
    }

    /* renamed from: b */
    public final Rect getBound(C113707es esVar) {
        Rect rect = new Rect();
        new Rect();
        if (this.f341150a != null) {
            rect = m158654f();
        }
        C114108qh qhVar = this.f341158w;
        if (qhVar != null) {
            Rect b = qhVar.mo171428b(esVar);
            rect.left = Math.min(rect.left, b.left);
            rect.top = Math.min(rect.top, b.top);
            rect.right = Math.max(rect.right, b.right);
            rect.bottom = Math.max(rect.bottom, b.bottom);
        }
        return rect;
    }

    /* renamed from: e */
    private int m158652e(C113707es esVar) {
        Rect rect = this.f341140B;
        GeoPoint geoPoint = new GeoPoint(rect.top, rect.left);
        Rect rect2 = this.f341140B;
        GeoPoint geoPoint2 = new GeoPoint(rect2.top, rect2.right);
        Rect rect3 = this.f341140B;
        GeoPoint geoPoint3 = new GeoPoint(rect3.bottom, rect3.right);
        Rect rect4 = this.f341140B;
        GeoPoint geoPoint4 = new GeoPoint(rect4.bottom, rect4.left);
        C113732fo[] a = m158648a(new C113732fo[]{esVar.mo172027a(geoPoint), esVar.mo172027a(geoPoint2), esVar.mo172027a(geoPoint3), esVar.mo172027a(geoPoint4)});
        C113732fo foVar = a[0];
        C113732fo foVar2 = a[1];
        new Rect((int) foVar.f340215a, (int) foVar.f340216b, (int) foVar2.f340215a, (int) foVar2.f340216b);
        return 1;
    }

    /* renamed from: com.tencent.mapsdk.internal.pb$b */
    public static class C67646b {

        /* renamed from: b */
        private static final int f193424b = 900;

        /* renamed from: c */
        private static final int f193425c = 180;

        /* renamed from: a */
        public Bitmap f193426a;

        /* renamed from: d */
        private TextPaint f193427d;

        /* renamed from: e */
        private int f193428e;

        /* renamed from: f */
        private int f193429f;

        /* renamed from: g */
        private int f193430g;

        /* renamed from: h */
        private HashMap<String, Integer> f193431h;

        private C67646b() {
            this.f193426a = null;
            this.f193427d = null;
            this.f193428e = f193424b;
            this.f193429f = 180;
            this.f193430g = -1;
            this.f193431h = new HashMap<>();
        }

        /* renamed from: a */
        private int m79850a(Rect rect, String str, int i, Typeface typeface, int i2, int i3) {
            int i4;
            int i5;
            if (rect == null) {
                return i3;
            }
            int abs = Math.abs(rect.height());
            int abs2 = Math.abs(rect.width());
            Rect rect2 = new Rect(0, 0, 0, 0);
            m79854a(i2, i, typeface);
            int ceil = (int) Math.ceil((double) (1.0f / C113798hb.m157097n()));
            int i6 = i2 / 2;
            int[] a = m79856a(str, i6, rect2);
            int i7 = a[0];
            int i8 = a[1];
            if (i7 <= abs2 && i8 <= abs) {
                do {
                    i4 = i6;
                    i6 += ceil;
                    if (i6 >= i2) {
                        break;
                    }
                    int[] a2 = m79856a(str, i6, rect2);
                    int i9 = a2[0];
                    i5 = a2[1];
                    if (i9 > abs2) {
                        break;
                    }
                } while (i5 <= abs);
            } else {
                i4 = i6 - ceil;
                while (true) {
                    if (i4 < i3) {
                        i4 = i3;
                        break;
                    }
                    int[] a3 = m79856a(str, i4, rect2);
                    int i15 = a3[0];
                    int i16 = a3[1];
                    if (i15 <= abs2 && i16 <= abs) {
                        break;
                    }
                    i4 -= ceil;
                }
            }
            if (i4 >= i3) {
                i3 = i4;
            }
            return i3 > i2 ? i2 : i3;
        }

        public /* synthetic */ C67646b(byte b) {
            this();
        }

        /* renamed from: a */
        private int[] m79856a(String str, int i, Rect rect) {
            m79853a(i);
            this.f193427d.getTextBounds(str, 0, str.length(), rect);
            return new int[]{Math.abs(rect.width()), Math.abs(rect.height())};
        }

        /* renamed from: a */
        private void m79852a() {
            Bitmap bitmap = this.f193426a;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f193426a.recycle();
                this.f193426a = null;
            }
        }

        /* renamed from: a */
        private void m79855a(String str, int i, int i2, Typeface typeface) {
            if (this.f193426a == null) {
                try {
                    this.f193426a = Bitmap.createBitmap(this.f193428e, this.f193429f, Bitmap.Config.ARGB_8888);
                } catch (OutOfMemoryError unused) {
                    return;
                }
            }
            m79854a(i, i2, typeface);
            Rect rect = new Rect();
            this.f193427d.getTextBounds(str, 0, str.length(), rect);
            int abs = Math.abs(rect.width());
            int abs2 = Math.abs(rect.height());
            int i3 = this.f193428e;
            if (abs > i3 || abs2 > this.f193429f) {
                this.f193428e = Math.max(abs, i3);
                int max = Math.max(abs2, this.f193429f);
                this.f193429f = max;
                this.f193426a = Bitmap.createBitmap(this.f193428e, max, Bitmap.Config.ARGB_8888);
            }
            this.f193426a.eraseColor(0);
            new Canvas(this.f193426a).drawText(str, ((float) this.f193428e) / 2.0f, (((float) this.f193429f) / 2.0f) - ((this.f193427d.descent() + this.f193427d.ascent()) / 2.0f), this.f193427d);
        }

        /* renamed from: a */
        private void m79854a(int i, int i2, Typeface typeface) {
            if (this.f193427d == null) {
                TextPaint textPaint = new TextPaint(65);
                this.f193427d = textPaint;
                textPaint.setStyle(Paint.Style.FILL);
                this.f193427d.setTextAlign(Paint.Align.CENTER);
            }
            this.f193427d.setColor(i2);
            this.f193427d.setTextSize((float) i);
            this.f193427d.setTypeface(typeface);
        }

        /* renamed from: a */
        private void m79853a(int i) {
            TextPaint textPaint = this.f193427d;
            if (textPaint != null) {
                textPaint.setTextSize((float) i);
            }
        }

        /* renamed from: a */
        private static String m79851a(String str, String str2, int i) {
            return str + "_" + str2 + "_" + i;
        }

        /* renamed from: a */
        private Object[] m79857a(String str, String str2, int i, int i2, Typeface typeface) {
            String str3 = str + "_" + str2 + "_" + i;
            if (i > 180) {
                i = 180;
            }
            if (i != this.f193430g) {
                if (this.f193426a == null) {
                    try {
                        this.f193426a = Bitmap.createBitmap(this.f193428e, this.f193429f, Bitmap.Config.ARGB_8888);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                m79854a(i, i2, typeface);
                Rect rect = new Rect();
                this.f193427d.getTextBounds(str2, 0, str2.length(), rect);
                int abs = Math.abs(rect.width());
                int abs2 = Math.abs(rect.height());
                int i3 = this.f193428e;
                if (abs > i3 || abs2 > this.f193429f) {
                    this.f193428e = Math.max(abs, i3);
                    int max = Math.max(abs2, this.f193429f);
                    this.f193429f = max;
                    this.f193426a = Bitmap.createBitmap(this.f193428e, max, Bitmap.Config.ARGB_8888);
                }
                this.f193426a.eraseColor(0);
                new Canvas(this.f193426a).drawText(str2, ((float) this.f193428e) / 2.0f, (((float) this.f193429f) / 2.0f) - ((this.f193427d.descent() + this.f193427d.ascent()) / 2.0f), this.f193427d);
                this.f193430g = i;
            }
            return new Object[]{str3, this.f193426a};
        }
    }

    /* renamed from: a */
    public final void mo171383a(PolygonOptions polygonOptions) {
        if (polygonOptions != null) {
            setFillColor(polygonOptions.getFillColor());
            setStrokeColor(polygonOptions.getStrokeColor());
            setStrokeWidth(polygonOptions.getStrokeWidth());
            setZIndex(polygonOptions.getZIndex());
            setVisible(polygonOptions.isVisible());
            setLevel(polygonOptions.getLevel());
            setClickable(polygonOptions.isClickable());
            setPoints(polygonOptions.getPoints());
            List<Integer> pattern = polygonOptions.getPattern();
            if (pattern != null && !pattern.isEmpty()) {
                int[] iArr = new int[pattern.size()];
                for (int i = 0; i < pattern.size(); i++) {
                    iArr[i] = pattern.get(i).intValue();
                }
                this.f341150a.pattern = iArr;
            }
            BitmapDescriptor texture = polygonOptions.getTexture();
            if (this.f341149K != texture) {
                this.f341149K = texture;
                texture.getBitmap(this.f341147I.getContext());
                this.f341150a.textureName = this.f341149K.getFormater().getBitmapId();
            }
            this.f341150a.textureSpacing = polygonOptions.getTextureSpacing();
            this.f341153r = polygonOptions.getHolePoints();
            mo172606q();
        }
    }

    /* renamed from: b */
    public final void mo171191b(int i) {
        C113961mq mqVar;
        if (i != C113744fy.f340314a && (mqVar = this.f341147I) != null) {
            C113707es esVar = mqVar.f340906n;
            if (mqVar != null && !C40002he.m42805a(this.f341148J)) {
                synchronized (this.f341159x) {
                    if (this.f341160y == null) {
                        this.f341160y = new C67646b((byte) 0);
                    }
                }
                Rect rect = this.f341140B;
                GeoPoint geoPoint = new GeoPoint(rect.top, rect.left);
                Rect rect2 = this.f341140B;
                GeoPoint geoPoint2 = new GeoPoint(rect2.top, rect2.right);
                Rect rect3 = this.f341140B;
                GeoPoint geoPoint3 = new GeoPoint(rect3.bottom, rect3.right);
                Rect rect4 = this.f341140B;
                GeoPoint geoPoint4 = new GeoPoint(rect4.bottom, rect4.left);
                C113732fo[] a = m158648a(new C113732fo[]{esVar.mo172027a(geoPoint), esVar.mo172027a(geoPoint2), esVar.mo172027a(geoPoint3), esVar.mo172027a(geoPoint4)});
                C113732fo foVar = a[0];
                C113732fo foVar2 = a[1];
                new Rect((int) foVar.f340215a, (int) foVar.f340216b, (int) foVar2.f340215a, (int) foVar2.f340216b);
            }
        }
    }

    /* renamed from: a */
    private boolean m158647a(C113741fw fwVar) {
        int i;
        C113741fw fwVar2 = fwVar;
        List<LatLng> list = this.f341152q;
        if (list == null || list.size() <= 2) {
            return false;
        }
        int i2 = 1;
        this.f341154s = new C113741fw[(this.f341152q.size() + 1)];
        for (int i3 = 0; i3 < this.f341152q.size(); i3++) {
            this.f341154s[i3] = this.f341147I.f340906n.mo172032b(this.f341152q.get(i3));
            C113741fw fwVar3 = this.f341154s[i3];
            fwVar3.setX(fwVar3.f340307c - fwVar2.f340307c);
            C113741fw fwVar4 = this.f341154s[i3];
            fwVar4.setY(fwVar4.f340306b - fwVar2.f340306b);
        }
        this.f341154s[this.f341152q.size()] = this.f341147I.f340906n.mo172032b(this.f341152q.get(0));
        this.f341154s[this.f341152q.size()].setX(this.f341154s[this.f341152q.size()].f340307c - fwVar2.f340307c);
        this.f341154s[this.f341152q.size()].setY(this.f341154s[this.f341152q.size()].f340306b - fwVar2.f340306b);
        C113741fw fwVar5 = this.f341154s[0];
        if (fwVar5.f340307c >= 0.0d) {
            i = fwVar5.f340306b >= 0.0d ? 0 : 3;
        } else {
            i = fwVar5.f340306b >= 0.0d ? 1 : 2;
        }
        int i4 = 1;
        int i5 = 0;
        while (true) {
            C113741fw[] fwVarArr = this.f341154s;
            if (i4 > fwVarArr.length - i2) {
                break;
            }
            C113741fw fwVar6 = fwVarArr[i4];
            double d = fwVar6.f340307c;
            if (d != 0.0d || fwVar6.f340306b != 0.0d) {
                double d2 = fwVar6.f340306b;
                C113741fw fwVar7 = fwVarArr[i4 - 1];
                double d3 = fwVar7.f340307c;
                double d4 = fwVar7.f340306b;
                int i6 = (((d2 * d3) - (d * d4)) > 0.0d ? 1 : (((d2 * d3) - (d * d4)) == 0.0d ? 0 : -1));
                if (i6 == 0 && d3 * d <= 0.0d && d4 * d2 <= 0.0d) {
                    break;
                }
                int i7 = d >= 0.0d ? d2 >= 0.0d ? 0 : 3 : d2 >= 0.0d ? 1 : 2;
                if (i7 == (i + 1) % 4) {
                    i5++;
                } else if (i7 == (i + 3) % 4) {
                    i5--;
                } else if (i7 == (i + 2) % 4) {
                    i5 = i6 > 0 ? i5 + 2 : i5 - 2;
                }
                i4++;
                i = i7;
                i2 = 1;
            } else {
                break;
            }
        }
        return i4 <= this.f341152q.size() || i5 != 0;
    }

    /* renamed from: a */
    private boolean m158645a(Rect rect) {
        Rect rect2 = this.f341157v;
        if (rect2 == null || rect == null) {
            return false;
        }
        Rect rect3 = this.f341157v;
        double abs = (double) Math.abs(((rect3.top + rect3.bottom) / 2) - ((rect.top + rect.bottom) / 2));
        Rect rect4 = this.f341157v;
        Rect rect5 = this.f341157v;
        return ((double) Math.abs(((rect2.left + rect2.right) / 2) - ((rect.left + rect.right) / 2))) <= ((double) (Math.abs(rect4.left - rect4.right) + Math.abs(rect.left - rect.right))) / 2.0d && abs <= ((double) (Math.abs(rect5.top - rect5.bottom) + Math.abs(rect.top - rect.bottom))) / 2.0d;
    }

    /* renamed from: a */
    private boolean m158646a(GeoPoint geoPoint) {
        List<GeoPoint> list = this.f341151p;
        if (list == null || list.size() <= 1) {
            return false;
        }
        double longitudeE6 = (double) geoPoint.getLongitudeE6();
        double latitudeE6 = (double) geoPoint.getLatitudeE6();
        int size = this.f341151p.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = size - 1;
            if (i < i3) {
                GeoPoint geoPoint2 = this.f341151p.get(i);
                int i4 = i + 1;
                GeoPoint geoPoint3 = this.f341151p.get(i4);
                double longitudeE62 = (double) geoPoint2.getLongitudeE6();
                double latitudeE62 = (double) geoPoint2.getLatitudeE6();
                double longitudeE63 = (double) geoPoint3.getLongitudeE6();
                double latitudeE63 = (double) geoPoint3.getLatitudeE6();
                double d = latitudeE62;
                double d2 = longitudeE62;
                int i5 = i4;
                double d3 = latitudeE6;
                double d4 = longitudeE6;
                if (m158649b(longitudeE6, latitudeE6, longitudeE62, d, longitudeE63, latitudeE63)) {
                    return true;
                }
                if (Math.abs(latitudeE63 - d) >= 1.0E-9d) {
                    if (m158649b(d2, d, d4, d3, 180.0d, d3)) {
                        if (d <= latitudeE63) {
                        }
                    } else if (m158649b(longitudeE63, latitudeE63, d4, d3, 180.0d, d3)) {
                        if (latitudeE63 <= d) {
                        }
                    } else if (!m158644a(d2, d, longitudeE63, latitudeE63, d4, d3, d3)) {
                    }
                    i2++;
                }
                i = i5;
                latitudeE6 = d3;
                longitudeE6 = d4;
            } else {
                double d5 = latitudeE6;
                double d6 = longitudeE6;
                GeoPoint geoPoint4 = this.f341151p.get(i3);
                GeoPoint geoPoint5 = this.f341151p.get(0);
                double longitudeE64 = (double) geoPoint4.getLongitudeE6();
                double latitudeE64 = (double) geoPoint4.getLatitudeE6();
                double longitudeE65 = (double) geoPoint5.getLongitudeE6();
                double latitudeE65 = (double) geoPoint5.getLatitudeE6();
                double d7 = longitudeE65;
                double d8 = latitudeE64;
                double d9 = longitudeE64;
                if (m158649b(d6, d5, longitudeE64, latitudeE64, d7, latitudeE65)) {
                    return true;
                }
                if (Math.abs(latitudeE65 - d8) >= 1.0E-9d && (!m158649b(d9, d8, d6, d5, 180.0d, d5) ? !(!m158649b(d7, latitudeE65, d6, d5, 180.0d, d5) ? !m158644a(d9, d8, d7, latitudeE65, d6, d5, d5) : latitudeE65 <= d8) : d8 > latitudeE65)) {
                    i2++;
                }
                return i2 % 2 == 1;
            }
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
    private static C113732fo[] m158648a(C113732fo[] foVarArr) {
        C113732fo foVar = foVarArr[0];
        double d = foVar.f340215a;
        double d2 = foVar.f340216b;
        double d3 = d2;
        double d4 = d;
        for (int i = 1; i < 4; i++) {
            C113732fo foVar2 = foVarArr[i];
            double d5 = foVar2.f340215a;
            double d6 = foVar2.f340216b;
            if (d5 < d) {
                d = d5;
            }
            if (d5 > d4) {
                d4 = d5;
            }
            if (d6 < d2) {
                d2 = d6;
            }
            if (d6 > d3) {
                d3 = d6;
            }
        }
        return new C113732fo[]{new C113732fo(d, d2), new C113732fo(d4, d3)};
    }

    /* renamed from: a */
    private Rect m158642a(C114035a[] aVarArr) {
        LatLng latLng = new LatLng(0.0d, 0.0d);
        double a = m158640a(aVarArr, latLng);
        double d = latLng.longitude;
        double d2 = latLng.latitude;
        return new Rect((int) ((d + a) * 1000000.0d), (int) ((d2 + a) * 1000000.0d), (int) ((d - a) * 1000000.0d), (int) ((d2 - a) * 1000000.0d));
    }

    /* renamed from: a */
    private double m158640a(C114035a[] aVarArr, LatLng latLng) {
        List<LatLng> a;
        List<GeoPoint> c = mo171385c();
        if (c.isEmpty() || (a = C113883ke.m157467a(c)) == null || a.isEmpty()) {
            return 0.0d;
        }
        int size = a.size();
        LatLng[] latLngArr = new LatLng[size];
        double[] dArr = new double[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            latLngArr[i2] = new LatLng(0.0d, 0.0d);
            double a2 = m158639a(a.get(i2), aVarArr, latLngArr[i2]);
            dArr[i2] = a2;
            if (Double.isNaN(a2)) {
                dArr[i2] = 0.0d;
            }
        }
        double d = dArr[0];
        for (int i3 = 1; i3 < size; i3++) {
            double d2 = dArr[i3];
            if (d2 > d) {
                i = i3;
                d = d2;
            }
        }
        LatLng latLng2 = latLngArr[i];
        latLng.latitude = latLng2.latitude;
        latLng.longitude = latLng2.longitude;
        return dArr[i];
    }

    /* renamed from: a */
    private static double m158639a(LatLng latLng, C114035a[] aVarArr, LatLng latLng2) {
        LatLng latLng3 = latLng;
        C114035a[] aVarArr2 = aVarArr;
        LatLng latLng4 = latLng2;
        int length = aVarArr2.length;
        double d = 0.0d;
        LatLng latLng5 = new LatLng(0.0d, 0.0d);
        LatLng latLng6 = new LatLng(0.0d, 0.0d);
        LatLng[] latLngArr = aVarArr2[0].f341162a;
        LatLng latLng7 = latLngArr[0];
        LatLng latLng8 = latLngArr[1];
        double a = C113904kw.m157746a((Coordinate) latLng3, (Coordinate) latLng7, (Coordinate) latLng8);
        latLng5.latitude = latLng7.latitude;
        latLng5.longitude = latLng7.longitude;
        latLng6.latitude = latLng8.latitude;
        latLng6.longitude = latLng8.longitude;
        for (int i = 1; i < length; i++) {
            LatLng[] latLngArr2 = aVarArr2[i].f341162a;
            LatLng latLng9 = latLngArr2[0];
            LatLng latLng10 = latLngArr2[1];
            double a2 = C113904kw.m157746a((Coordinate) latLng3, (Coordinate) latLng9, (Coordinate) latLng10);
            if (a2 < a) {
                latLng5.latitude = latLng9.latitude;
                latLng5.longitude = latLng9.longitude;
                latLng6.latitude = latLng10.latitude;
                latLng6.longitude = latLng10.longitude;
                a = a2;
            }
        }
        LatLng a3 = C113904kw.m157755a(latLng3, latLng5, latLng6);
        LatLng latLng11 = new LatLng(0.0d, 0.0d);
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (!z) {
            LatLng a4 = C113904kw.m157754a(latLng3, a3, i2);
            double a5 = C113904kw.m157744a((Coordinate) a4, (Coordinate) a3);
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                LatLng[] latLngArr3 = aVarArr2[i4].f341162a;
                if (C113904kw.m157760a(a4, a5, latLngArr3[0], latLngArr3[1])) {
                    z = true;
                    break;
                }
                i4++;
                LatLng latLng12 = latLng;
                aVarArr2 = aVarArr;
            }
            if (!z) {
                latLng11.latitude = a4.latitude;
                latLng11.longitude = a4.longitude;
                i2 += 5;
            } else if (i3 == 0) {
                latLng11.latitude = a4.latitude;
                latLng11.longitude = a4.longitude;
            } else {
                i3++;
                latLng3 = latLng;
                aVarArr2 = aVarArr;
            }
            d = a5;
            i3++;
            latLng3 = latLng;
            aVarArr2 = aVarArr;
        }
        latLng4.latitude = latLng11.latitude;
        latLng4.longitude = latLng11.longitude;
        return d;
    }

    /* renamed from: c */
    private boolean m158650c(C113707es esVar) {
        PolygonOptions polygonOptions;
        Rect f;
        if (this.f341150a == null || (polygonOptions = this.f341146H) == null || !polygonOptions.isValid() || (f = m158654f()) == null) {
            return false;
        }
        GeoPoint geoPoint = new GeoPoint(f.top, f.left);
        GeoPoint geoPoint2 = new GeoPoint(f.bottom, f.right);
        GeoPoint geoPoint3 = new GeoPoint(f.bottom, f.left);
        GeoPoint geoPoint4 = new GeoPoint(f.top, f.right);
        C113732fo a = esVar.mo172027a(geoPoint);
        C113732fo a2 = esVar.mo172027a(geoPoint2);
        C113732fo a3 = esVar.mo172027a(geoPoint3);
        C113732fo[] a4 = m158648a(new C113732fo[]{a, esVar.mo172027a(geoPoint4), a2, a3});
        C113732fo foVar = a4[0];
        C113732fo foVar2 = a4[1];
        Rect rect = new Rect((int) foVar.f340215a, (int) foVar.f340216b, (int) foVar2.f340215a, (int) foVar2.f340216b);
        if (Math.abs(rect.width()) <= 5 || Math.abs(rect.height()) <= 5) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private int m158641a(GeoPoint geoPoint, C113707es esVar) {
        GeoPoint geoPoint2 = geoPoint;
        C113707es esVar2 = esVar;
        List<GeoPoint> list = this.f341151p;
        List<LatLng> a = C113883ke.m157467a(list);
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (i < i2) {
                i++;
                arrayList.add(new C114035a(a.get(i), a.get(i)));
            } else {
                arrayList.add(new C114035a(a.get(i2), a.get(0)));
                LatLng latLng = new LatLng(0.0d, 0.0d);
                double a2 = m158640a((C114035a[]) arrayList.toArray(new C114035a[arrayList.size()]), latLng);
                double d = latLng.longitude;
                double d2 = latLng.latitude;
                Rect rect = new Rect((int) ((d + a2) * 1000000.0d), (int) ((d2 + a2) * 1000000.0d), (int) ((d - a2) * 1000000.0d), (int) ((d2 - a2) * 1000000.0d));
                this.f341140B = rect;
                geoPoint2.setLatitudeE6(rect.centerY());
                geoPoint2.setLongitudeE6(this.f341140B.centerX());
                Rect rect2 = this.f341140B;
                GeoPoint geoPoint3 = new GeoPoint(rect2.top, rect2.left);
                Rect rect3 = this.f341140B;
                GeoPoint geoPoint4 = new GeoPoint(rect3.top, rect3.right);
                Rect rect4 = this.f341140B;
                GeoPoint geoPoint5 = new GeoPoint(rect4.bottom, rect4.right);
                Rect rect5 = this.f341140B;
                C113732fo[] a3 = m158648a(new C113732fo[]{esVar2.mo172027a(geoPoint3), esVar2.mo172027a(geoPoint4), esVar2.mo172027a(geoPoint5), esVar2.mo172027a(new GeoPoint(rect5.bottom, rect5.left))});
                C113732fo foVar = a3[0];
                C113732fo foVar2 = a3[1];
                new Rect((int) foVar.f340215a, (int) foVar.f340216b, (int) foVar2.f340215a, (int) foVar2.f340216b);
                return 1;
            }
        }
    }
}
