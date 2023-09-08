package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.pd */
public final class C114042pd extends C113527av<C113519an> implements C113519an, C113705eq, C114016om {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C114322sx f341213d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public View f341214e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f341215f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f341216g = 0;

    /* renamed from: h */
    private float f341217h = 0.5f;

    /* renamed from: i */
    private float f341218i = 0.5f;

    /* renamed from: j */
    private GeoPoint f341219j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f341220k;

    /* renamed from: l */
    private boolean f341221l;

    /* renamed from: m */
    private boolean f341222m = false;

    /* renamed from: n */
    private final C113732fo f341223n = new C113732fo();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C113520ao f341224o;

    public C114042pd(C114322sx sxVar, C113520ao aoVar) {
        this.f341213d = sxVar;
        this.f341224o = aoVar;
        m158732j();
        C114322sx sxVar2 = this.f341213d;
        if (!(sxVar2 == null || sxVar2.mo171543G() == null)) {
            TencentMap.InfoWindowAdapter infoWindowAdapter = null;
            C113520ao aoVar2 = this.f341224o;
            this.f341214e = C114028oz.m158550a(this.f341213d.mo171543G(), (C113536be) this.f341213d.f339876d_, (C113705eq) this, aoVar2 != null ? aoVar2.mo171380g() : infoWindowAdapter, (Marker) this.f341224o);
            C113520ao aoVar3 = this.f341224o;
            if (aoVar3 != null) {
                mo172007a(aoVar3.getPosition());
            }
        }
        this.f341220k = true;
    }

    /* renamed from: j */
    private void m158732j() {
        M m;
        C114322sx sxVar = this.f341213d;
        if (sxVar != null && (m = sxVar.f339878e_) != null) {
            ((VectorMap) m).mo173443a((C114016om) this);
        }
    }

    /* renamed from: k */
    private void m158733k() {
        M m;
        C114322sx sxVar = this.f341213d;
        if (sxVar != null && (m = sxVar.f339878e_) != null) {
            C113961mq mqVar = ((VectorMap) m).f342909o;
            if (!mqVar.f340879I.isEmpty()) {
                mqVar.f340879I.remove(this);
            }
        }
    }

    /* renamed from: l */
    private void m158734l() {
        C114322sx sxVar = this.f341213d;
        if (sxVar != null && sxVar.mo171543G() != null) {
            TencentMap.InfoWindowAdapter infoWindowAdapter = null;
            C113520ao aoVar = this.f341224o;
            if (aoVar != null) {
                infoWindowAdapter = aoVar.mo171380g();
            }
            this.f341214e = C114028oz.m158550a(this.f341213d.mo171543G(), (C113536be) this.f341213d.f339876d_, (C113705eq) this, infoWindowAdapter, (Marker) this.f341224o);
            C113520ao aoVar2 = this.f341224o;
            if (aoVar2 != null) {
                mo172007a(aoVar2.getPosition());
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r1 = r3.f341214e;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m158735m() {
        /*
            r3 = this;
            com.tencent.mapsdk.internal.sx r0 = r3.f341213d
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.view.View r1 = r3.f341214e
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            M r0 = r0.f339878e_
            com.tencent.mapsdk.vector.VectorMap r0 = (com.tencent.mapsdk.vector.VectorMap) r0
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            com.tencent.mapsdk.internal.es r0 = r0.getProjection()
            if (r0 != 0) goto L_0x0018
            return
        L_0x0018:
            android.view.ViewGroup r0 = r3.m158737o()
            if (r0 == 0) goto L_0x0026
            com.tencent.mapsdk.internal.pd$1 r2 = new com.tencent.mapsdk.internal.pd$1
            r2.<init>(r1)
            r0.post(r2)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114042pd.m158735m():void");
    }

    /* renamed from: n */
    private C113519an m158736n() {
        return this;
    }

    /* renamed from: o */
    private ViewGroup m158737o() {
        C114322sx sxVar = this.f341213d;
        if (sxVar == null) {
            return null;
        }
        return sxVar.f339875d;
    }

    /* renamed from: a */
    public final void mo172008a(MarkerOptions markerOptions) {
    }

    /* renamed from: a */
    public final void mo171427a(GL10 gl10) {
    }

    /* renamed from: e */
    public final void mo172013e() {
        if (this.f341224o != null && this.f341213d.mo171543G() != null) {
            int height = (int) (((float) this.f341224o.getHeight(this.f341213d.mo171543G())) * this.f341224o.getAnchorV());
            int i = this.f341216g;
            float f = 1.0f;
            if (this.f341224o.getOptions() != null) {
                f = this.f341224o.getOptions().getInfoWindowAnchorV();
            }
            if (i == 0) {
                i = 1;
            }
            float f2 = (float) i;
            this.f341218i = (((float) height) + (f * f2)) / f2;
        }
    }

    /* renamed from: f */
    public final void mo172014f() {
        C114322sx sxVar = this.f341213d;
        if (sxVar != null) {
            C113520ao aoVar = this.f341224o;
            final TencentMap.InfoWindowAdapter g = aoVar != null ? aoVar.mo171380g() : null;
            final Context G = sxVar.mo171543G();
            final C113536be beVar = (C113536be) sxVar.f339876d_;
            ViewGroup o = m158737o();
            if (o != null) {
                o.post(new Runnable() {
                    public final void run() {
                        C114042pd pdVar = C114042pd.this;
                        View unused = pdVar.f341214e = C114028oz.m158550a(G, beVar, (C113705eq) pdVar, g, (Marker) pdVar.f341224o);
                        C114042pd.this.m158735m();
                    }
                });
            }
        }
    }

    /* renamed from: f_ */
    public final /* bridge */ /* synthetic */ C113521ap mo171394f_() {
        return this;
    }

    /* renamed from: g */
    public final View mo172015g() {
        return this.f341214e;
    }

    /* renamed from: h */
    public final void mo172578h() {
        m158735m();
    }

    /* renamed from: i */
    public final void mo172579i() {
        m158735m();
    }

    /* renamed from: i_ */
    public final void mo172016i_() {
        m158735m();
    }

    public final boolean isRemoved() {
        return this.f341221l;
    }

    public final boolean isVisible() {
        return mo172011c();
    }

    public final boolean onTap(float f, float f2) {
        C114322sx sxVar;
        M m;
        Rect a;
        if (this.f341214e == null || !this.f341220k || (sxVar = this.f341213d) == null || (m = sxVar.f339878e_) == null || ((VectorMap) m).getProjection() == null || (a = getScreenBound(((VectorMap) this.f341213d.f339878e_).getProjection())) == null || a.isEmpty()) {
            return false;
        }
        return a.contains((int) f, (int) f2);
    }

    public final void releaseData() {
        m158733k();
    }

    public final void remove() {
        final View view = this.f341214e;
        if (view != null) {
            final ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).post(new Runnable() {
                    public final void run() {
                        ((ViewGroup) parent).removeView(view);
                        View view = view;
                        if (view instanceof ViewGroup) {
                            ((ViewGroup) view).removeAllViews();
                        }
                        C114042pd.this.releaseData();
                    }
                });
            }
            this.f341221l = true;
        }
    }

    public final void setVisible(boolean z) {
        mo172010b(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f341214e;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo172011c() {
        /*
            r1 = this;
            boolean r0 = r1.f341220k
            if (r0 == 0) goto L_0x0010
            android.view.View r0 = r1.f341214e
            if (r0 == 0) goto L_0x0010
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114042pd.mo172011c():boolean");
    }

    /* renamed from: d */
    public final void mo172012d() {
        if (this.f341224o != null && this.f341213d.mo171543G() != null) {
            int width = this.f341224o.getWidth(this.f341213d.mo171543G());
            float infoWindowAnchorU = this.f341224o.getOptions() != null ? this.f341224o.getOptions().getInfoWindowAnchorU() : 0.5f;
            int i = this.f341215f;
            if (i == 0) {
                i = 1;
            }
            this.f341217h = infoWindowAnchorU + ((((float) width) * (this.f341224o.getAnchorU() - 0.5f)) / ((float) i));
        }
    }

    /* renamed from: b */
    public final void mo172010b(boolean z) {
        if (this.f341214e != null) {
            this.f341220k = z;
            m158735m();
        }
    }

    /* renamed from: a */
    public final void mo172007a(LatLng latLng) {
        if (latLng != null) {
            GeoPoint geoPoint = this.f341219j;
            if (geoPoint == null) {
                this.f341219j = GeoPoint.from(latLng);
            } else {
                geoPoint.setLatitudeE6((int) (latLng.latitude * 1000000.0d));
                this.f341219j.setLongitudeE6((int) (latLng.longitude * 1000000.0d));
            }
            m158735m();
        }
    }

    /* renamed from: b */
    public final Rect getBound(C113707es esVar) {
        Rect a = getScreenBound(esVar);
        if (!(a == null || esVar == null)) {
            GeoPoint a2 = esVar.mo172025a(new C113732fo((double) a.left, (double) a.top));
            GeoPoint a3 = esVar.mo172025a(new C113732fo((double) a.right, (double) a.bottom));
            if (!(a2 == null || a3 == null)) {
                return new Rect(a2.getLongitudeE6(), a2.getLatitudeE6(), a3.getLongitudeE6(), a3.getLatitudeE6());
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo172009a(boolean z) {
        this.f341222m = z;
        if (z) {
            m158733k();
        } else {
            m158732j();
        }
    }

    /* renamed from: a */
    public final void mo172006a(int i, int i2) {
        mo172009a(true);
        this.f341223n.mo172083a((double) i, (double) i2);
        m158735m();
    }

    /* renamed from: a */
    public final Rect getScreenBound(C113707es esVar) {
        C113732fo foVar;
        int i;
        if (esVar == null || this.f341214e == null) {
            return null;
        }
        if (this.f341222m) {
            foVar = this.f341223n;
        } else {
            foVar = esVar.mo172027a(this.f341219j);
        }
        if (foVar == null) {
            return null;
        }
        C113520ao aoVar = this.f341224o;
        int i2 = 0;
        if (aoVar == null || aoVar.getOptions() == null) {
            i = 0;
        } else {
            i2 = this.f341224o.getOptions().getInfoWindowOffsetX();
            i = this.f341224o.getOptions().getInfowindowOffsetY();
        }
        mo172012d();
        mo172013e();
        float f = this.f341217h;
        int i3 = this.f341215f;
        float f2 = f - ((((float) i2) * 1.0f) / ((float) i3));
        float f3 = this.f341218i;
        int i4 = this.f341216g;
        float f4 = f3 - ((((float) i) * 1.0f) / ((float) i4));
        int i5 = (int) (foVar.f340215a - ((double) (((float) i3) * f2)));
        int i6 = (int) (foVar.f340216b - ((double) (((float) i4) * f4)));
        return new Rect(i5, i6, i3 + i5, i4 + i6);
    }
}
