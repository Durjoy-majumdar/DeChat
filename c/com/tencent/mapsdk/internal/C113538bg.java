package com.tencent.mapsdk.internal;

import android.graphics.Color;
import android.location.Location;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.engine.jni.models.TappedElement;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory;
import com.tencent.tencentmap.mapsdk.maps.LocationSource;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.Circle;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle;

/* renamed from: com.tencent.mapsdk.internal.bg */
public final class C113538bg implements C113515ai {

    /* renamed from: a */
    public C113495aa f339746a = null;

    /* renamed from: b */
    public TencentMap.OnMyLocationChangeListener f339747b = null;

    /* renamed from: c */
    public Location f339748c = null;

    /* renamed from: d */
    public C113961mq f339749d;

    /* renamed from: e */
    public TencentMap.OnMyLocationClickListener f339750e;

    /* renamed from: f */
    private LocationSource.OnLocationChangedListener f339751f = null;

    /* renamed from: g */
    private LocationSource f339752g = null;

    /* renamed from: h */
    private boolean f339753h = false;

    /* renamed from: i */
    private Circle f339754i = null;

    /* renamed from: j */
    private MyLocationStyle f339755j = new MyLocationStyle();

    /* renamed from: k */
    private int f339756k = Color.argb(102, 0, 163, 255);

    /* renamed from: l */
    private BitmapDescriptor f339757l;

    /* renamed from: m */
    private BitmapDescriptor f339758m;

    /* renamed from: n */
    private int f339759n;

    /* renamed from: o */
    private BitmapDescriptor f339760o;

    public C113538bg(C113961mq mqVar, C113495aa aaVar) {
        this.f339749d = mqVar;
        this.f339746a = aaVar;
        this.f339751f = m155982h();
    }

    /* renamed from: f */
    private void m155980f() {
        mo171271c();
        this.f339746a = null;
    }

    /* renamed from: g */
    private BitmapDescriptor m155981g() {
        if (this.f339760o == null) {
            this.f339760o = BitmapDescriptorFactory.fromAsset(this.f339749d, "navi_marker_location.png");
        }
        return this.f339760o;
    }

    /* renamed from: h */
    private LocationSource.OnLocationChangedListener m155982h() {
        return new LocationSource.OnLocationChangedListener() {
            public final void onLocationChanged(Location location) {
                if (location != null) {
                    C113538bg bgVar = C113538bg.this;
                    Location location2 = bgVar.f339748c;
                    if (location2 == null) {
                        bgVar.f339748c = new Location(location);
                    } else {
                        location2.setLongitude(location.getLongitude());
                        C113538bg.this.f339748c.setLatitude(location.getLatitude());
                        C113538bg.this.f339748c.setAccuracy(location.getAccuracy());
                        C113538bg.this.f339748c.setProvider(location.getProvider());
                        C113538bg.this.f339748c.setTime(location.getTime());
                        C113538bg.this.f339748c.setSpeed(location.getSpeed());
                        C113538bg.this.f339748c.setAltitude(location.getAltitude());
                    }
                    C113538bg.m155972a(C113538bg.this, location);
                    TencentMap.OnMyLocationChangeListener onMyLocationChangeListener = C113538bg.this.f339747b;
                    if (onMyLocationChangeListener != null) {
                        onMyLocationChangeListener.onMyLocationChange(location);
                    }
                }
            }
        };
    }

    /* renamed from: i */
    private BitmapDescriptor m155983i() {
        return this.f339757l;
    }

    /* renamed from: c */
    public final void mo171271c() {
        Circle circle = this.f339754i;
        if (circle != null) {
            circle.setVisible(false);
            this.f339754i.remove();
            this.f339754i = null;
        }
        if (this.f339753h) {
            this.f339753h = false;
            this.f339749d.mo172455e(true);
            this.f339749d.mo172456f(true);
            this.f339749d.mo172457g(true);
            this.f339759n = 0;
            this.f339751f = null;
            LocationSource locationSource = this.f339752g;
            if (locationSource != null) {
                locationSource.deactivate();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo171272d() {
        return this.f339753h;
    }

    /* renamed from: e */
    public final Location mo171273e() {
        if (this.f339748c == null) {
            return null;
        }
        return new Location(this.f339748c);
    }

    /* renamed from: a */
    public final void mo171267a() {
        Circle circle = this.f339754i;
        if (circle != null) {
            circle.setVisible(false);
            this.f339754i.remove();
            this.f339754i = null;
        }
    }

    /* renamed from: b */
    public final void mo171270b() {
        if (!this.f339753h) {
            this.f339753h = true;
            if (this.f339751f == null) {
                this.f339751f = m155982h();
            }
            this.f339749d.mo172455e(false);
            this.f339749d.mo172456f(false);
            this.f339749d.mo172457g(false);
            Circle circle = this.f339754i;
            if (circle != null) {
                circle.setVisible(true);
            }
            LocationSource locationSource = this.f339752g;
            if (locationSource != null) {
                locationSource.activate(this.f339751f);
            }
        }
    }

    /* renamed from: a */
    public final void mo171268a(LocationSource locationSource) {
        this.f339752g = locationSource;
        if (this.f339753h && locationSource != null) {
            locationSource.activate(this.f339751f);
        }
    }

    /* renamed from: a */
    private void m155975a(MyLocationStyle myLocationStyle, Location location) {
        if (location != null && myLocationStyle != null) {
            LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
            Circle circle = this.f339754i;
            if (circle != null) {
                circle.setCenter(latLng);
                this.f339754i.setRadius((double) location.getAccuracy());
            }
            this.f339749d.mo172429a(GeoPoint.from(latLng), 0.0f, 0.0f, false);
            int myLocationType = myLocationStyle.getMyLocationType();
            if (myLocationType == 1) {
                this.f339749d.mo172423a(location.getBearing());
            } else if (myLocationType == 2) {
            } else {
                if (myLocationType != 3) {
                    this.f339749d.mo172423a(location.getBearing());
                    C113495aa aaVar = this.f339746a;
                    if (aaVar != null) {
                        aaVar.mo171182a(CameraUpdateFactory.newLatLng(latLng));
                        return;
                    }
                    return;
                }
                C113495aa aaVar2 = this.f339746a;
                if (aaVar2 != null) {
                    this.f339746a.mo171182a(CameraUpdateFactory.rotateTo(location.getBearing(), aaVar2.mo171184a().tilt));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009c, code lost:
        r0 = r11.getCompassImage();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m155979b(android.location.Location r11) {
        /*
            r10 = this;
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r0 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng
            double r1 = r11.getLatitude()
            double r3 = r11.getLongitude()
            r0.<init>(r1, r3)
            com.tencent.tencentmap.mapsdk.maps.model.Circle r1 = r10.f339754i
            if (r1 != 0) goto L_0x004e
            com.tencent.tencentmap.mapsdk.maps.model.CircleOptions r1 = new com.tencent.tencentmap.mapsdk.maps.model.CircleOptions
            r1.<init>()
            float r11 = r11.getAccuracy()
            double r2 = (double) r11
            com.tencent.tencentmap.mapsdk.maps.model.CircleOptions r11 = r1.radius(r2)
            com.tencent.tencentmap.mapsdk.maps.model.CircleOptions r11 = r11.center(r0)
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r0 = r10.f339755j
            int r0 = r0.getFillColor()
            com.tencent.tencentmap.mapsdk.maps.model.CircleOptions r11 = r11.fillColor(r0)
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r0 = r10.f339755j
            int r0 = r0.getStrokeColor()
            com.tencent.tencentmap.mapsdk.maps.model.CircleOptions r11 = r11.strokeColor(r0)
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r0 = r10.f339755j
            float r0 = r0.getStrokeWidth()
            r11.strokeWidth(r0)
            com.tencent.mapsdk.internal.mq r11 = r10.f339749d
            com.tencent.mapsdk.internal.bi r11 = r11.f340880J
            if (r11 != 0) goto L_0x0048
            r11 = 0
            goto L_0x004c
        L_0x0048:
            com.tencent.tencentmap.mapsdk.maps.model.Circle r11 = r11.mo171671a((com.tencent.tencentmap.mapsdk.maps.model.CircleOptions) r1)
        L_0x004c:
            r10.f339754i = r11
        L_0x004e:
            int r11 = r10.f339759n
            if (r11 != 0) goto L_0x0125
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r11 = r10.f339755j
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r11 = r11.getMyLocationIcon()
            if (r11 != 0) goto L_0x005e
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r11 = r10.m155981g()
        L_0x005e:
            com.tencent.mapsdk.internal.mq r0 = r10.f339749d
            android.content.Context r0 = r0.getContext()
            android.graphics.Bitmap r0 = r11.getBitmap(r0)
            if (r0 == 0) goto L_0x008e
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L_0x008e
            r10.f339757l = r11
            com.tencent.mapsdk.internal.mq r0 = r10.f339749d
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r11 = r11.getFormater()
            java.lang.String r11 = r11.getBitmapId()
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r1 = r10.f339755j
            float r1 = r1.getAnchorU()
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r2 = r10.f339755j
            float r2 = r2.getAnchorV()
            int r11 = r0.mo172418a((java.lang.String) r11, (float) r1, (float) r2)
            r10.f339759n = r11
        L_0x008e:
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r11 = r10.f339755j
            com.tencent.tencentmap.mapsdk.maps.model.LocationCompass r11 = r11.getLocationCompass()
            if (r11 == 0) goto L_0x010c
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r0 = r11.getCompassImage()
            if (r0 == 0) goto L_0x010c
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r0 = r11.getCompassImage()
            com.tencent.mapsdk.internal.mq r1 = r10.f339749d
            android.content.Context r1 = r1.getContext()
            android.graphics.Bitmap r1 = r0.getBitmap(r1)
            if (r1 == 0) goto L_0x010c
            boolean r1 = r1.isRecycled()
            if (r1 != 0) goto L_0x010c
            r10.f339758m = r0
            com.tencent.mapsdk.internal.mq r1 = r10.f339749d
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r2 = r0.getFormater()
            java.lang.String r2 = r2.getBitmapId()
            r1.mo172452c((java.lang.String) r2)
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor[] r11 = r11.getCompassGroupImages()
            if (r11 == 0) goto L_0x010c
            int r1 = r11.length
            r2 = 4
            if (r1 != r2) goto L_0x010c
            int r1 = r11.length
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            r3 = 0
        L_0x00d0:
            int r4 = r11.length
            if (r3 >= r4) goto L_0x00f4
            r4 = r11[r3]
            if (r4 == 0) goto L_0x00ed
            com.tencent.mapsdk.internal.mq r5 = r10.f339749d
            android.content.Context r5 = r5.getContext()
            r4.getBitmap(r5)
            r4 = r11[r3]
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r4 = r4.getFormater()
            java.lang.String r4 = r4.getBitmapId()
            r1[r3] = r4
            goto L_0x00f1
        L_0x00ed:
            java.lang.String r4 = ""
            r1[r3] = r4
        L_0x00f1:
            int r3 = r3 + 1
            goto L_0x00d0
        L_0x00f4:
            com.tencent.mapsdk.internal.mq r4 = r10.f339749d
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r11 = r0.getFormater()
            java.lang.String r5 = r11.getBitmapId()
            r6 = r1[r2]
            r11 = 1
            r7 = r1[r11]
            r11 = 2
            r8 = r1[r11]
            r11 = 3
            r9 = r1[r11]
            r4.mo172439a((java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9)
        L_0x010c:
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r11 = r10.f339755j
            com.tencent.tencentmap.mapsdk.maps.model.LocationNavigationGravityline r11 = r11.getLocationNavigationGravityline()
            if (r11 == 0) goto L_0x0125
            com.tencent.mapsdk.internal.mq r0 = r10.f339749d
            float r1 = r11.getWidth()
            int r2 = r11.getColor()
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r11 = r11.getDestination()
            r0.mo172425a((float) r1, (int) r2, (com.tencent.tencentmap.mapsdk.maps.model.LatLng) r11)
        L_0x0125:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113538bg.m155979b(android.location.Location):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        r1 = r0.getCompassImage();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo171269a(com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L_0x0003
            return
        L_0x0003:
            r9.f339755j = r10
            com.tencent.tencentmap.mapsdk.maps.model.Circle r0 = r9.f339754i
            if (r0 == 0) goto L_0x0022
            int r1 = r10.getFillColor()
            r0.setFillColor(r1)
            com.tencent.tencentmap.mapsdk.maps.model.Circle r0 = r9.f339754i
            int r1 = r10.getStrokeColor()
            r0.setStrokeColor(r1)
            com.tencent.tencentmap.mapsdk.maps.model.Circle r0 = r9.f339754i
            float r1 = r10.getStrokeWidth()
            r0.setStrokeWidth(r1)
        L_0x0022:
            int r0 = r9.f339759n
            if (r0 == 0) goto L_0x0113
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r0 = r9.f339757l
            if (r0 == 0) goto L_0x0113
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r0 = r10.getMyLocationIcon()
            if (r0 != 0) goto L_0x0034
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r0 = r9.m155981g()
        L_0x0034:
            com.tencent.mapsdk.internal.mq r1 = r9.f339749d
            android.content.Context r1 = r1.getContext()
            android.graphics.Bitmap r1 = r0.getBitmap(r1)
            if (r1 == 0) goto L_0x0074
            boolean r1 = r1.isRecycled()
            if (r1 != 0) goto L_0x0074
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r0 = r0.getFormater()
            java.lang.String r0 = r0.getBitmapId()
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r1 = r9.f339757l
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r1 = r1.getFormater()
            java.lang.String r1 = r1.getBitmapId()
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0074
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r1 = r10.getMyLocationIcon()
            r9.f339757l = r1
            com.tencent.mapsdk.internal.mq r1 = r9.f339749d
            float r2 = r10.getAnchorU()
            float r3 = r10.getAnchorV()
            int r0 = r1.mo172418a((java.lang.String) r0, (float) r2, (float) r3)
            r9.f339759n = r0
        L_0x0074:
            com.tencent.tencentmap.mapsdk.maps.model.LocationCompass r0 = r10.getLocationCompass()
            if (r0 == 0) goto L_0x00fc
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r1 = r0.getCompassImage()
            if (r1 == 0) goto L_0x00fc
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r1 = r0.getCompassImage()
            com.tencent.mapsdk.internal.mq r2 = r9.f339749d
            android.content.Context r2 = r2.getContext()
            android.graphics.Bitmap r2 = r1.getBitmap(r2)
            if (r2 == 0) goto L_0x00fc
            boolean r2 = r2.isRecycled()
            if (r2 != 0) goto L_0x00fc
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r2 = r1.getFormater()
            java.lang.String r4 = r2.getBitmapId()
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r2 = r9.f339758m
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x00ad
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r2 = r2.getFormater()
            java.lang.String r2 = r2.getBitmapId()
            goto L_0x00ae
        L_0x00ad:
            r2 = r3
        L_0x00ae:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00bb
            r9.f339758m = r1
            com.tencent.mapsdk.internal.mq r1 = r9.f339749d
            r1.mo172452c((java.lang.String) r4)
        L_0x00bb:
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor[] r0 = r0.getCompassGroupImages()
            if (r0 == 0) goto L_0x00fc
            int r1 = r0.length
            r2 = 4
            if (r1 != r2) goto L_0x00fc
            int r1 = r0.length
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            r5 = 0
        L_0x00ca:
            int r6 = r0.length
            if (r5 >= r6) goto L_0x00ec
            r6 = r0[r5]
            if (r6 == 0) goto L_0x00e7
            com.tencent.mapsdk.internal.mq r7 = r9.f339749d
            android.content.Context r7 = r7.getContext()
            r6.getBitmap(r7)
            r6 = r0[r5]
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r6 = r6.getFormater()
            java.lang.String r6 = r6.getBitmapId()
            r1[r5] = r6
            goto L_0x00e9
        L_0x00e7:
            r1[r5] = r3
        L_0x00e9:
            int r5 = r5 + 1
            goto L_0x00ca
        L_0x00ec:
            com.tencent.mapsdk.internal.mq r3 = r9.f339749d
            r5 = r1[r2]
            r0 = 1
            r6 = r1[r0]
            r0 = 2
            r7 = r1[r0]
            r0 = 3
            r8 = r1[r0]
            r3.mo172439a((java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8)
        L_0x00fc:
            com.tencent.tencentmap.mapsdk.maps.model.LocationNavigationGravityline r10 = r10.getLocationNavigationGravityline()
            if (r10 == 0) goto L_0x0113
            com.tencent.mapsdk.internal.mq r0 = r9.f339749d
            float r1 = r10.getWidth()
            int r2 = r10.getColor()
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r10 = r10.getDestination()
            r0.mo172425a((float) r1, (int) r2, (com.tencent.tencentmap.mapsdk.maps.model.LatLng) r10)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113538bg.mo171269a(com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle):void");
    }

    /* renamed from: a */
    private void m155973a(TencentMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        this.f339747b = onMyLocationChangeListener;
    }

    /* renamed from: a */
    private boolean m155976a(float f, float f2) {
        TappedElement a = this.f339749d.f340903k.f339816a.mo171638f().mo172899a(f, f2);
        boolean z = a != null && a.type == 6;
        if (!z || this.f339750e == null) {
            return z;
        }
        LatLng latLng = new LatLng();
        Location location = this.f339748c;
        if (location != null) {
            latLng.setAltitude(location.getAltitude());
            latLng.setLongitude(this.f339748c.getLongitude());
            latLng.setLatitude(this.f339748c.getLatitude());
        }
        return this.f339750e.onMyLocationClicked(latLng);
    }

    /* renamed from: a */
    private void m155974a(TencentMap.OnMyLocationClickListener onMyLocationClickListener) {
        this.f339750e = onMyLocationClickListener;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a3, code lost:
        r5 = r0.getCompassImage();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m155971a(android.location.Location r15) {
        /*
            r14 = this;
            if (r15 != 0) goto L_0x0003
            return
        L_0x0003:
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r0 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng
            double r1 = r15.getLatitude()
            double r3 = r15.getLongitude()
            r0.<init>(r1, r3)
            com.tencent.tencentmap.mapsdk.maps.model.Circle r1 = r14.f339754i
            if (r1 != 0) goto L_0x0051
            com.tencent.tencentmap.mapsdk.maps.model.CircleOptions r1 = new com.tencent.tencentmap.mapsdk.maps.model.CircleOptions
            r1.<init>()
            float r2 = r15.getAccuracy()
            double r2 = (double) r2
            com.tencent.tencentmap.mapsdk.maps.model.CircleOptions r2 = r1.radius(r2)
            com.tencent.tencentmap.mapsdk.maps.model.CircleOptions r0 = r2.center(r0)
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r2 = r14.f339755j
            int r2 = r2.getFillColor()
            com.tencent.tencentmap.mapsdk.maps.model.CircleOptions r0 = r0.fillColor(r2)
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r2 = r14.f339755j
            int r2 = r2.getStrokeColor()
            com.tencent.tencentmap.mapsdk.maps.model.CircleOptions r0 = r0.strokeColor(r2)
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r2 = r14.f339755j
            float r2 = r2.getStrokeWidth()
            r0.strokeWidth(r2)
            com.tencent.mapsdk.internal.mq r0 = r14.f339749d
            com.tencent.mapsdk.internal.bi r0 = r0.f340880J
            if (r0 != 0) goto L_0x004b
            r0 = 0
            goto L_0x004f
        L_0x004b:
            com.tencent.tencentmap.mapsdk.maps.model.Circle r0 = r0.mo171671a((com.tencent.tencentmap.mapsdk.maps.model.CircleOptions) r1)
        L_0x004f:
            r14.f339754i = r0
        L_0x0051:
            int r0 = r14.f339759n
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0128
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r0 = r14.f339755j
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r0 = r0.getMyLocationIcon()
            if (r0 != 0) goto L_0x0065
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r0 = r14.m155981g()
        L_0x0065:
            com.tencent.mapsdk.internal.mq r5 = r14.f339749d
            android.content.Context r5 = r5.getContext()
            android.graphics.Bitmap r5 = r0.getBitmap(r5)
            if (r5 == 0) goto L_0x0095
            boolean r5 = r5.isRecycled()
            if (r5 != 0) goto L_0x0095
            r14.f339757l = r0
            com.tencent.mapsdk.internal.mq r5 = r14.f339749d
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r0 = r0.getFormater()
            java.lang.String r0 = r0.getBitmapId()
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r6 = r14.f339755j
            float r6 = r6.getAnchorU()
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r7 = r14.f339755j
            float r7 = r7.getAnchorV()
            int r0 = r5.mo172418a((java.lang.String) r0, (float) r6, (float) r7)
            r14.f339759n = r0
        L_0x0095:
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r0 = r14.f339755j
            com.tencent.tencentmap.mapsdk.maps.model.LocationCompass r0 = r0.getLocationCompass()
            if (r0 == 0) goto L_0x010f
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r5 = r0.getCompassImage()
            if (r5 == 0) goto L_0x010f
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r5 = r0.getCompassImage()
            com.tencent.mapsdk.internal.mq r6 = r14.f339749d
            android.content.Context r6 = r6.getContext()
            android.graphics.Bitmap r6 = r5.getBitmap(r6)
            if (r6 == 0) goto L_0x010f
            boolean r6 = r6.isRecycled()
            if (r6 != 0) goto L_0x010f
            r14.f339758m = r5
            com.tencent.mapsdk.internal.mq r6 = r14.f339749d
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r7 = r5.getFormater()
            java.lang.String r7 = r7.getBitmapId()
            r6.mo172452c((java.lang.String) r7)
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor[] r0 = r0.getCompassGroupImages()
            if (r0 == 0) goto L_0x010f
            int r6 = r0.length
            r7 = 4
            if (r6 != r7) goto L_0x010f
            int r6 = r0.length
            java.lang.String[] r6 = new java.lang.String[r6]
            r7 = 0
        L_0x00d6:
            int r8 = r0.length
            if (r7 >= r8) goto L_0x00fa
            r8 = r0[r7]
            if (r8 == 0) goto L_0x00f3
            com.tencent.mapsdk.internal.mq r9 = r14.f339749d
            android.content.Context r9 = r9.getContext()
            r8.getBitmap(r9)
            r8 = r0[r7]
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r8 = r8.getFormater()
            java.lang.String r8 = r8.getBitmapId()
            r6[r7] = r8
            goto L_0x00f7
        L_0x00f3:
            java.lang.String r8 = ""
            r6[r7] = r8
        L_0x00f7:
            int r7 = r7 + 1
            goto L_0x00d6
        L_0x00fa:
            com.tencent.mapsdk.internal.mq r8 = r14.f339749d
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r0 = r5.getFormater()
            java.lang.String r9 = r0.getBitmapId()
            r10 = r6[r4]
            r11 = r6[r3]
            r12 = r6[r2]
            r13 = r6[r1]
            r8.mo172439a((java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13)
        L_0x010f:
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r0 = r14.f339755j
            com.tencent.tencentmap.mapsdk.maps.model.LocationNavigationGravityline r0 = r0.getLocationNavigationGravityline()
            if (r0 == 0) goto L_0x0128
            com.tencent.mapsdk.internal.mq r5 = r14.f339749d
            float r6 = r0.getWidth()
            int r7 = r0.getColor()
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r0 = r0.getDestination()
            r5.mo172425a((float) r6, (int) r7, (com.tencent.tencentmap.mapsdk.maps.model.LatLng) r0)
        L_0x0128:
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r0 = r14.f339755j
            if (r0 != 0) goto L_0x012d
            return
        L_0x012d:
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r5 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng
            double r6 = r15.getLatitude()
            double r8 = r15.getLongitude()
            r5.<init>(r6, r8)
            com.tencent.tencentmap.mapsdk.maps.model.Circle r6 = r14.f339754i
            if (r6 == 0) goto L_0x014b
            r6.setCenter(r5)
            com.tencent.tencentmap.mapsdk.maps.model.Circle r6 = r14.f339754i
            float r7 = r15.getAccuracy()
            double r7 = (double) r7
            r6.setRadius(r7)
        L_0x014b:
            com.tencent.mapsdk.internal.mq r6 = r14.f339749d
            com.tencent.map.lib.models.GeoPoint r7 = com.tencent.map.lib.models.GeoPoint.from((com.tencent.tencentmap.mapsdk.maps.model.LatLng) r5)
            r8 = 0
            r6.mo172429a((com.tencent.map.lib.models.GeoPoint) r7, (float) r8, (float) r8, (boolean) r4)
            int r0 = r0.getMyLocationType()
            if (r0 == r3) goto L_0x018c
            if (r0 == r2) goto L_0x018b
            if (r0 == r1) goto L_0x0174
            com.tencent.mapsdk.internal.mq r0 = r14.f339749d
            float r15 = r15.getBearing()
            r0.mo172423a((float) r15)
            com.tencent.mapsdk.internal.aa r15 = r14.f339746a
            if (r15 == 0) goto L_0x018b
            com.tencent.tencentmap.mapsdk.maps.CameraUpdate r0 = com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLng(r5)
            r15.mo171182a((com.tencent.tencentmap.mapsdk.maps.CameraUpdate) r0)
            goto L_0x018b
        L_0x0174:
            com.tencent.mapsdk.internal.aa r0 = r14.f339746a
            if (r0 == 0) goto L_0x018b
            com.tencent.tencentmap.mapsdk.maps.model.CameraPosition r0 = r0.mo171184a()
            com.tencent.mapsdk.internal.aa r1 = r14.f339746a
            float r15 = r15.getBearing()
            float r0 = r0.tilt
            com.tencent.tencentmap.mapsdk.maps.CameraUpdate r15 = com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.rotateTo(r15, r0)
            r1.mo171182a((com.tencent.tencentmap.mapsdk.maps.CameraUpdate) r15)
        L_0x018b:
            return
        L_0x018c:
            com.tencent.mapsdk.internal.mq r0 = r14.f339749d
            float r15 = r15.getBearing()
            r0.mo172423a((float) r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113538bg.m155971a(android.location.Location):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a2, code lost:
        r5 = r0.getCompassImage();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m155972a(com.tencent.mapsdk.internal.C113538bg r14, android.location.Location r15) {
        /*
            if (r15 == 0) goto L_0x0194
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r0 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng
            double r1 = r15.getLatitude()
            double r3 = r15.getLongitude()
            r0.<init>(r1, r3)
            com.tencent.tencentmap.mapsdk.maps.model.Circle r1 = r14.f339754i
            if (r1 != 0) goto L_0x0050
            com.tencent.tencentmap.mapsdk.maps.model.CircleOptions r1 = new com.tencent.tencentmap.mapsdk.maps.model.CircleOptions
            r1.<init>()
            float r2 = r15.getAccuracy()
            double r2 = (double) r2
            com.tencent.tencentmap.mapsdk.maps.model.CircleOptions r2 = r1.radius(r2)
            com.tencent.tencentmap.mapsdk.maps.model.CircleOptions r0 = r2.center(r0)
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r2 = r14.f339755j
            int r2 = r2.getFillColor()
            com.tencent.tencentmap.mapsdk.maps.model.CircleOptions r0 = r0.fillColor(r2)
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r2 = r14.f339755j
            int r2 = r2.getStrokeColor()
            com.tencent.tencentmap.mapsdk.maps.model.CircleOptions r0 = r0.strokeColor(r2)
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r2 = r14.f339755j
            float r2 = r2.getStrokeWidth()
            r0.strokeWidth(r2)
            com.tencent.mapsdk.internal.mq r0 = r14.f339749d
            com.tencent.mapsdk.internal.bi r0 = r0.f340880J
            if (r0 != 0) goto L_0x004a
            r0 = 0
            goto L_0x004e
        L_0x004a:
            com.tencent.tencentmap.mapsdk.maps.model.Circle r0 = r0.mo171671a((com.tencent.tencentmap.mapsdk.maps.model.CircleOptions) r1)
        L_0x004e:
            r14.f339754i = r0
        L_0x0050:
            int r0 = r14.f339759n
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0127
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r0 = r14.f339755j
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r0 = r0.getMyLocationIcon()
            if (r0 != 0) goto L_0x0064
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r0 = r14.m155981g()
        L_0x0064:
            com.tencent.mapsdk.internal.mq r5 = r14.f339749d
            android.content.Context r5 = r5.getContext()
            android.graphics.Bitmap r5 = r0.getBitmap(r5)
            if (r5 == 0) goto L_0x0094
            boolean r5 = r5.isRecycled()
            if (r5 != 0) goto L_0x0094
            r14.f339757l = r0
            com.tencent.mapsdk.internal.mq r5 = r14.f339749d
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r0 = r0.getFormater()
            java.lang.String r0 = r0.getBitmapId()
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r6 = r14.f339755j
            float r6 = r6.getAnchorU()
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r7 = r14.f339755j
            float r7 = r7.getAnchorV()
            int r0 = r5.mo172418a((java.lang.String) r0, (float) r6, (float) r7)
            r14.f339759n = r0
        L_0x0094:
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r0 = r14.f339755j
            com.tencent.tencentmap.mapsdk.maps.model.LocationCompass r0 = r0.getLocationCompass()
            if (r0 == 0) goto L_0x010e
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r5 = r0.getCompassImage()
            if (r5 == 0) goto L_0x010e
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r5 = r0.getCompassImage()
            com.tencent.mapsdk.internal.mq r6 = r14.f339749d
            android.content.Context r6 = r6.getContext()
            android.graphics.Bitmap r6 = r5.getBitmap(r6)
            if (r6 == 0) goto L_0x010e
            boolean r6 = r6.isRecycled()
            if (r6 != 0) goto L_0x010e
            r14.f339758m = r5
            com.tencent.mapsdk.internal.mq r6 = r14.f339749d
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r7 = r5.getFormater()
            java.lang.String r7 = r7.getBitmapId()
            r6.mo172452c((java.lang.String) r7)
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor[] r0 = r0.getCompassGroupImages()
            if (r0 == 0) goto L_0x010e
            int r6 = r0.length
            r7 = 4
            if (r6 != r7) goto L_0x010e
            int r6 = r0.length
            java.lang.String[] r6 = new java.lang.String[r6]
            r7 = 0
        L_0x00d5:
            int r8 = r0.length
            if (r7 >= r8) goto L_0x00f9
            r8 = r0[r7]
            if (r8 == 0) goto L_0x00f2
            com.tencent.mapsdk.internal.mq r9 = r14.f339749d
            android.content.Context r9 = r9.getContext()
            r8.getBitmap(r9)
            r8 = r0[r7]
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r8 = r8.getFormater()
            java.lang.String r8 = r8.getBitmapId()
            r6[r7] = r8
            goto L_0x00f6
        L_0x00f2:
            java.lang.String r8 = ""
            r6[r7] = r8
        L_0x00f6:
            int r7 = r7 + 1
            goto L_0x00d5
        L_0x00f9:
            com.tencent.mapsdk.internal.mq r8 = r14.f339749d
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r0 = r5.getFormater()
            java.lang.String r9 = r0.getBitmapId()
            r10 = r6[r4]
            r11 = r6[r3]
            r12 = r6[r2]
            r13 = r6[r1]
            r8.mo172439a((java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13)
        L_0x010e:
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r0 = r14.f339755j
            com.tencent.tencentmap.mapsdk.maps.model.LocationNavigationGravityline r0 = r0.getLocationNavigationGravityline()
            if (r0 == 0) goto L_0x0127
            com.tencent.mapsdk.internal.mq r5 = r14.f339749d
            float r6 = r0.getWidth()
            int r7 = r0.getColor()
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r0 = r0.getDestination()
            r5.mo172425a((float) r6, (int) r7, (com.tencent.tencentmap.mapsdk.maps.model.LatLng) r0)
        L_0x0127:
            com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle r0 = r14.f339755j
            if (r0 != 0) goto L_0x012c
            return
        L_0x012c:
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r5 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng
            double r6 = r15.getLatitude()
            double r8 = r15.getLongitude()
            r5.<init>(r6, r8)
            com.tencent.tencentmap.mapsdk.maps.model.Circle r6 = r14.f339754i
            if (r6 == 0) goto L_0x014a
            r6.setCenter(r5)
            com.tencent.tencentmap.mapsdk.maps.model.Circle r6 = r14.f339754i
            float r7 = r15.getAccuracy()
            double r7 = (double) r7
            r6.setRadius(r7)
        L_0x014a:
            com.tencent.mapsdk.internal.mq r6 = r14.f339749d
            com.tencent.map.lib.models.GeoPoint r7 = com.tencent.map.lib.models.GeoPoint.from((com.tencent.tencentmap.mapsdk.maps.model.LatLng) r5)
            r8 = 0
            r6.mo172429a((com.tencent.map.lib.models.GeoPoint) r7, (float) r8, (float) r8, (boolean) r4)
            int r0 = r0.getMyLocationType()
            if (r0 == r3) goto L_0x018b
            if (r0 == r2) goto L_0x018a
            if (r0 == r1) goto L_0x0173
            com.tencent.mapsdk.internal.mq r0 = r14.f339749d
            float r15 = r15.getBearing()
            r0.mo172423a((float) r15)
            com.tencent.mapsdk.internal.aa r14 = r14.f339746a
            if (r14 == 0) goto L_0x0194
            com.tencent.tencentmap.mapsdk.maps.CameraUpdate r15 = com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLng(r5)
            r14.mo171182a((com.tencent.tencentmap.mapsdk.maps.CameraUpdate) r15)
            goto L_0x0194
        L_0x0173:
            com.tencent.mapsdk.internal.aa r0 = r14.f339746a
            if (r0 == 0) goto L_0x0194
            com.tencent.tencentmap.mapsdk.maps.model.CameraPosition r0 = r0.mo171184a()
            com.tencent.mapsdk.internal.aa r14 = r14.f339746a
            float r15 = r15.getBearing()
            float r0 = r0.tilt
            com.tencent.tencentmap.mapsdk.maps.CameraUpdate r15 = com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.rotateTo(r15, r0)
            r14.mo171182a((com.tencent.tencentmap.mapsdk.maps.CameraUpdate) r15)
        L_0x018a:
            return
        L_0x018b:
            com.tencent.mapsdk.internal.mq r14 = r14.f339749d
            float r15 = r15.getBearing()
            r14.mo172423a((float) r15)
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113538bg.m155972a(com.tencent.mapsdk.internal.bg, android.location.Location):void");
    }
}
