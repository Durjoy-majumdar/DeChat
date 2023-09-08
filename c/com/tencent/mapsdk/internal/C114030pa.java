package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.ReturnCallback;
import com.tencent.map.tools.Util;
import com.tencent.mapsdk.internal.C113814ho;
import com.tencent.mapsdk.internal.C113820hz;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.Projection;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Collision;
import com.tencent.tencentmap.mapsdk.maps.model.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.AnimationListener;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.pa */
public final class C114030pa extends C114027oy<C113520ao> implements C113520ao {

    /* renamed from: A */
    public GeoPoint f341097A = null;

    /* renamed from: B */
    public float f341098B = 1.0f;

    /* renamed from: C */
    public float f341099C = 1.0f;

    /* renamed from: D */
    public float f341100D = 1.0f;

    /* renamed from: E */
    public boolean f341101E = false;

    /* renamed from: F */
    public C114322sx f341102F = null;

    /* renamed from: G */
    public C113705eq f341103G;

    /* renamed from: H */
    private boolean f341104H = false;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public int f341105I = 0;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public int f341106J = 0;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f341107K = false;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public GeoPoint f341108L = null;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C114108qh f341109M;

    /* renamed from: N */
    private AnimationListener f341110N = null;

    /* renamed from: O */
    private C113820hz f341111O = null;

    /* renamed from: P */
    private TencentMap.OnMarkerClickListener f341112P;

    /* renamed from: Q */
    private boolean f341113Q;

    /* renamed from: R */
    private LatLng f341114R;

    /* renamed from: S */
    private Collision[] f341115S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public int f341116T;

    /* renamed from: U */
    private final C113820hz.C113822b f341117U = new C113820hz.C113822b() {
        /* renamed from: a */
        public final void mo172210a(float f, float f2, float f3, float f4) {
            C114030pa.this.setRotation(f);
            C114030pa paVar = C114030pa.this;
            paVar.f341125t = f2;
            paVar.f341126u = f3;
            paVar.f341127v = f4;
            paVar.f341124s = true;
            if (paVar.f341109M != null) {
                C114030pa.this.f341109M.mo172716a((int) C114030pa.this.getRotation());
            }
        }

        /* renamed from: b */
        public final void mo172212b(float f) {
        }

        /* renamed from: a */
        public final void mo172208a(float f) {
            C114030pa paVar = C114030pa.this;
            paVar.f341098B = f;
            if (paVar.f341109M != null) {
                C114030pa.this.f341109M.mo172714a(C114030pa.this.f341098B);
                C114030pa paVar2 = C114030pa.this;
                paVar2.f341128w.alpha(paVar2.f341098B);
            }
            C114030pa paVar3 = C114030pa.this;
            C113705eq eqVar = paVar3.f341103G;
            if (eqVar != null) {
                eqVar.mo172008a(paVar3.f341128w);
            }
        }

        /* renamed from: a */
        public final void mo172211a(int i, int i2) {
            if (C114030pa.this.f341102F != null && C114030pa.this.f341130y != null) {
                GeoPoint geoPoint = new GeoPoint();
                if (!C114030pa.this.f341107K || C114030pa.this.f341108L == null || C114030pa.this.f341102F.f339878e_ == null) {
                    C114030pa.this.f341130y.setLatitudeE6(i + 0);
                    C114030pa.this.f341130y.setLongitudeE6(i2 + 0);
                } else {
                    GeoPoint a = ((VectorMap) C114030pa.this.f341102F.f339878e_).getProjection().mo172025a(new C113732fo((double) C114030pa.this.f341105I, (double) C114030pa.this.f341106J));
                    geoPoint.setLatitudeE6(i + (a.getLatitudeE6() - C114030pa.this.f341108L.getLatitudeE6()));
                    geoPoint.setLongitudeE6(i2 + (a.getLongitudeE6() - C114030pa.this.f341108L.getLongitudeE6()));
                    C113732fo a2 = ((VectorMap) C114030pa.this.f341102F.f339878e_).getProjection().mo172027a(geoPoint);
                    C114030pa.this.f341130y.setLatitudeE6((int) a2.f340216b);
                    C114030pa.this.f341130y.setLongitudeE6((int) a2.f340215a);
                }
                C114030pa paVar = C114030pa.this;
                MarkerOptions markerOptions = paVar.f341128w;
                if (markerOptions != null) {
                    markerOptions.position(C113883ke.m157466a(paVar.f341130y));
                }
                if (C114030pa.this.f341109M != null) {
                    C114030pa.this.f341109M.mo172717a(C114030pa.this.f341130y);
                }
                C114030pa paVar2 = C114030pa.this;
                C113705eq eqVar = paVar2.f341103G;
                if (eqVar != null) {
                    eqVar.mo172007a(C113883ke.m157466a(paVar2.f341130y));
                }
            }
        }

        /* renamed from: a */
        public final void mo172209a(float f, float f2) {
            C114030pa.this.m158585a(f, f2);
        }
    };

    /* renamed from: a */
    public Object f341118a = null;

    /* renamed from: n */
    public Bitmap f341119n = null;

    /* renamed from: o */
    public boolean f341120o = false;

    /* renamed from: p */
    public final Object f341121p = new Object();

    /* renamed from: q */
    public float f341122q = 0.5f;

    /* renamed from: r */
    public float f341123r = 0.5f;

    /* renamed from: s */
    public boolean f341124s = false;

    /* renamed from: t */
    public float f341125t = 0.0f;

    /* renamed from: u */
    public float f341126u = 0.0f;

    /* renamed from: v */
    public float f341127v = -1.0f;

    /* renamed from: w */
    public MarkerOptions f341128w;

    /* renamed from: x */
    public String f341129x = null;

    /* renamed from: y */
    public GeoPoint f341130y = null;

    /* renamed from: z */
    public GeoPoint f341131z = null;

    public C114030pa(C114322sx sxVar) {
        super(sxVar);
        this.f341102F = sxVar;
        setClickable(true);
    }

    /* renamed from: A */
    private boolean m158578A() {
        return this.f341107K;
    }

    /* renamed from: B */
    private Boundable<C113707es> m158579B() {
        return this.f341109M;
    }

    /* renamed from: C */
    private C113520ao m158580C() {
        return this;
    }

    /* renamed from: D */
    private boolean m158581D() {
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions == null || !markerOptions.isInfoWindowEnable()) {
            return false;
        }
        C113705eq eqVar = this.f341103G;
        return !(eqVar == null || eqVar.mo172015g() == null) || !C40002he.m42805a(markerOptions.getTitle()) || !C40002he.m42805a(markerOptions.getSnippet());
    }

    /* renamed from: E */
    private boolean m158582E() {
        if (this.f341102F == null) {
            return false;
        }
        Rect i = mo171382i();
        return i.left >= 0 && i.top >= 0 && i.right <= this.f341102F.mo172993X() && i.bottom <= this.f341102F.mo172994Y();
    }

    /* renamed from: t */
    private void m158601t() {
        C114322sx sxVar = this.f341102F;
        if (sxVar != null && this.f341101E) {
            m158587a(sxVar.mo171620s());
        }
    }

    /* renamed from: u */
    private void m158602u() {
        synchronized (this.f341121p) {
            Bitmap bitmap = this.f341119n;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f341120o = true;
            }
        }
    }

    /* renamed from: v */
    private String m158603v() {
        return "GLMarkerOverlay-" + this.f341061b_;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r1 = (r1 = r2.f341102F).f339878e_;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Rect m158604w() {
        /*
            r2 = this;
            com.tencent.mapsdk.internal.qh r0 = r2.f341109M
            if (r0 == 0) goto L_0x0017
            com.tencent.mapsdk.internal.sx r1 = r2.f341102F
            if (r1 == 0) goto L_0x0017
            M r1 = r1.f339878e_
            if (r1 == 0) goto L_0x0017
            com.tencent.mapsdk.vector.VectorMap r1 = (com.tencent.mapsdk.vector.VectorMap) r1
            com.tencent.mapsdk.internal.es r1 = r1.getProjection()
            android.graphics.Rect r0 = r0.mo171428b((com.tencent.mapsdk.internal.C113707es) r1)
            return r0
        L_0x0017:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114030pa.m158604w():android.graphics.Rect");
    }

    /* renamed from: x */
    private boolean m158605x() {
        M m;
        boolean z = false;
        if (this.f341102F == null) {
            return false;
        }
        C113820hz hzVar = this.f341111O;
        if (hzVar != null) {
            hzVar.mo172207b();
            boolean z2 = this.f341111O.f340556b;
            this.f341107K = z2;
            z = true;
            if (z2 && (m = this.f341102F.f339878e_) != null) {
                ((VectorMap) m).f342909o.f340914v = true;
            }
        }
        return z;
    }

    /* renamed from: y */
    private boolean m158606y() {
        return this.f341104H;
    }

    /* renamed from: z */
    private int m158607z() {
        Bitmap bitmap = this.f341119n;
        if (bitmap == null || this.f341109M == null) {
            return 0;
        }
        float width = (float) bitmap.getWidth();
        return (int) ((this.f341109M.mo172012d() * width) - (width * 0.5f));
    }

    /* renamed from: f_ */
    public final /* bridge */ /* synthetic */ C113521ap mo171394f_() {
        return this;
    }

    public final float getAlpha() {
        return this.f341098B;
    }

    public final float getAnchorU() {
        return this.f341128w.getAnchorU();
    }

    public final float getAnchorV() {
        return this.f341128w.getAnchorV();
    }

    public final /* synthetic */ Rect getBound(Projection projection) {
        return m158604w();
    }

    public final String getContentDescription() {
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions == null) {
            return null;
        }
        return markerOptions.getContentDescription();
    }

    @Deprecated
    public final int getDisplayLevel() {
        return getLevel();
    }

    public final float getEqualScale() {
        return this.f341099C;
    }

    public final int getHeight(Context context) {
        Bitmap bitmap;
        BitmapDescriptor icon = this.f341128w.getIcon();
        if (icon == null || (bitmap = icon.getFormater().getBitmap(context)) == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    @Deprecated
    public final TencentMap.OnMarkerDragListener getOnDragListener() {
        return null;
    }

    public final MarkerOptions getOptions() {
        return this.f341128w;
    }

    public final LatLng getPosition() {
        return this.f341114R;
    }

    public final float[] getScale() {
        return new float[]{this.f341099C, this.f341100D};
    }

    public final String getSnippet() {
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions != null) {
            return markerOptions.getSnippet();
        }
        return null;
    }

    public final Object getTag() {
        return this.f341118a;
    }

    public final String getTitle() {
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions != null) {
            return markerOptions.getTitle();
        }
        return null;
    }

    public final int getWidth(Context context) {
        Bitmap bitmap;
        BitmapDescriptor icon = this.f341128w.getIcon();
        if (icon == null || (bitmap = icon.getFormater().getBitmap(context)) == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    /* renamed from: h */
    public final C113705eq mo171381h() {
        return this.f341103G;
    }

    /* renamed from: h_ */
    public final void mo172595h_() {
        C114322sx sxVar = this.f341102F;
        if (sxVar != null) {
            if (getId().equals(sxVar.f342581h)) {
                sxVar.mo171582b("");
            }
        }
        C114108qh qhVar = this.f341109M;
        if (qhVar != null) {
            qhVar.mo171381h();
        }
        C113705eq eqVar = this.f341103G;
        if (eqVar != null) {
            eqVar.remove();
        }
        this.f341102F = null;
    }

    public final boolean handleOnTap() {
        return true;
    }

    public final void hideInfoWindow() {
        C114322sx sxVar = this.f341102F;
        if (sxVar != null) {
            sxVar.mo171582b("");
            ((VectorMap) sxVar.f339878e_).f342909o.f340914v = true;
            synchronized (sxVar.f342580g) {
                C113705eq eqVar = this.f341103G;
                if (eqVar != null) {
                    eqVar.mo172010b(false);
                    this.f341113Q = false;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r1 = (r1 = r2.f341102F).f339878e_;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Rect mo171382i() {
        /*
            r2 = this;
            com.tencent.mapsdk.internal.qh r0 = r2.f341109M
            if (r0 == 0) goto L_0x0017
            com.tencent.mapsdk.internal.sx r1 = r2.f341102F
            if (r1 == 0) goto L_0x0017
            M r1 = r1.f339878e_
            if (r1 == 0) goto L_0x0017
            com.tencent.mapsdk.vector.VectorMap r1 = (com.tencent.mapsdk.vector.VectorMap) r1
            com.tencent.mapsdk.internal.es r1 = r1.getProjection()
            android.graphics.Rect r0 = r0.mo171426a((com.tencent.mapsdk.internal.C113707es) r1)
            return r0
        L_0x0017:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114030pa.mo171382i():android.graphics.Rect");
    }

    public final boolean isCollisionBy(final Collision collision) {
        Collision[] collisionArr = this.f341115S;
        if (collisionArr != null) {
            return Util.where((T[]) collisionArr, new ReturnCallback<Boolean, Collision>() {
                /* renamed from: a */
                private Boolean m158637a(Collision collision) {
                    return Boolean.valueOf(collision == collision);
                }

                public final /* synthetic */ Object callback(Object obj) {
                    return Boolean.valueOf(((Collision) obj) == collision);
                }
            });
        }
        return false;
    }

    public final boolean isFastLoad() {
        C114108qh qhVar = this.f341109M;
        if (qhVar == null) {
            return false;
        }
        return qhVar.mo172724i();
    }

    public final boolean isInMapCenterState() {
        return this.f341101E;
    }

    @Deprecated
    public final boolean isInfoWindowAutoOverturn() {
        return false;
    }

    public final boolean isInfoWindowEnable() {
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions != null) {
            return markerOptions.isInfoWindowEnable();
        }
        return false;
    }

    public final boolean isInfoWindowShown() {
        C113705eq eqVar;
        if (this.f341102F == null || this.f341128w == null || (eqVar = this.f341103G) == null) {
            return false;
        }
        return eqVar.mo172011c();
    }

    /* renamed from: j */
    public final void mo172003j() {
    }

    /* renamed from: j_ */
    public final void mo172596j_() {
        M m;
        C113705eq eqVar;
        C114108qh qhVar;
        C113820hz hzVar;
        M m2;
        if (this.f341102F != null) {
            if (!isVisible()) {
                releaseData();
                return;
            }
            C114322sx sxVar = this.f341102F;
            if (sxVar != null && this.f341101E) {
                m158587a(sxVar.mo171620s());
            }
            if (!(this.f341102F == null || (hzVar = this.f341111O) == null)) {
                hzVar.mo172207b();
                boolean z = this.f341111O.f340556b;
                this.f341107K = z;
                if (z && (m2 = this.f341102F.f339878e_) != null) {
                    ((VectorMap) m2).f342909o.f340914v = true;
                }
            }
            C114322sx sxVar2 = this.f341102F;
            if (sxVar2 != null && (m = sxVar2.f339878e_) != null) {
                if (!(((VectorMap) m).f342909o.f340904l == null || (qhVar = this.f341109M) == null)) {
                    qhVar.mo172596j_();
                }
                if (this.f341113Q && ((eqVar = this.f341103G) == null || !eqVar.mo172011c())) {
                    showInfoWindow();
                }
                C113705eq eqVar2 = this.f341103G;
                if (eqVar2 != null && eqVar2.mo172011c()) {
                    this.f341103G.mo171427a((GL10) null);
                }
            }
        }
    }

    /* renamed from: k */
    public final boolean mo172004k() {
        Object obj = this.f341118a;
        return obj != null && C114065pl.f341304c.equals(obj.toString());
    }

    public final boolean onTap(float f, float f2) {
        C114108qh qhVar;
        TencentMap.OnMarkerClickListener onMarkerClickListener;
        if (this.f341102F == null || !isClickable() || (qhVar = this.f341109M) == null) {
            return false;
        }
        boolean onTap = qhVar.onTap(f, f2);
        if (onTap && (onMarkerClickListener = this.f341112P) != null) {
            onMarkerClickListener.onMarkerClick(this);
        }
        return onTap;
    }

    @Deprecated
    public final boolean onTapMapViewBubbleHidden() {
        return false;
    }

    public final void refreshInfoWindow() {
        C113705eq eqVar;
        if (isInfoWindowEnable() && (eqVar = this.f341103G) != null && eqVar.mo172011c()) {
            this.f341103G.mo172014f();
        }
    }

    public final void releaseData() {
        C113705eq eqVar = this.f341103G;
        if (eqVar != null) {
            eqVar.remove();
            this.f341103G = null;
        }
        C114108qh qhVar = this.f341109M;
        if (qhVar != null) {
            qhVar.mo171381h();
        }
    }

    public final void setAlpha(float f) {
        this.f341098B = f;
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions != null) {
            markerOptions.alpha(f);
        }
        C114108qh qhVar = this.f341109M;
        if (qhVar != null) {
            qhVar.mo172714a(f);
        }
        mo172606q();
    }

    public final void setAnchor(float f, float f2) {
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions != null) {
            markerOptions.anchor(f, f2);
        }
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        } else if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.f341122q = f;
        this.f341123r = f2;
        C114108qh qhVar = this.f341109M;
        if (qhVar != null) {
            qhVar.mo172715a(f, f2);
        }
        C113705eq eqVar = this.f341103G;
        if (eqVar != null) {
            eqVar.mo172016i_();
        }
    }

    public final void setAnimation(Animation animation) {
        C113805hi a;
        C114322sx sxVar = this.f341102F;
        if (sxVar != null && (a = C113829ih.m157227a((C113565bo) sxVar.f339876d_, animation)) != null) {
            C113820hz hzVar = a.f340538a;
            this.f341111O = hzVar;
            if (hzVar != null) {
                hzVar.mo172205a(this.f341117U);
            }
        }
    }

    public final void setCollisions(Collision... collisionArr) {
        this.f341115S = collisionArr;
        C114108qh qhVar = this.f341109M;
        if (qhVar != null) {
            qhVar.mo172722b(isCollisionBy(MarkerCollisionItem.POI));
            qhVar.mo172015g();
        }
    }

    public final void setContentDescription(String str) {
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions != null) {
            markerOptions.contentDescription(str);
        }
    }

    public final void setDraggable(boolean z) {
        super.setDraggable(z);
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions != null) {
            markerOptions.draggable(z);
        }
    }

    public final void setEqualScale(float f) {
        m158585a(f, f);
    }

    public final void setFastLoad(boolean z) {
        C114108qh qhVar = this.f341109M;
        if (qhVar != null) {
            qhVar.mo172723c(z);
            mo172606q();
        }
    }

    public final void setFixingPoint(int i, int i2) {
        this.f341105I = i;
        this.f341106J = i2;
        if (this.f341109M != null) {
            setFixingPointEnable(true);
            this.f341109M.mo172717a(new GeoPoint(this.f341106J, this.f341105I));
        }
        C113705eq eqVar = this.f341103G;
        if (eqVar != null) {
            eqVar.mo172006a(i, i2);
        }
    }

    public final void setFixingPointEnable(boolean z) {
        this.f341104H = z;
        C114108qh qhVar = this.f341109M;
        if (qhVar != null) {
            qhVar.mo172720a(z);
        }
        C113705eq eqVar = this.f341103G;
        if (eqVar != null) {
            if (z) {
                eqVar.mo172006a(this.f341105I, this.f341106J);
            } else {
                eqVar.mo172009a(false);
            }
        }
        mo172606q();
    }

    public final void setIcon(BitmapDescriptor bitmapDescriptor) {
        C114322sx sxVar = this.f341102F;
        if (sxVar != null) {
            BitmapDescriptor defaultMarker = BitmapDescriptorFactory.defaultMarker((TencentMapContext) sxVar.f339876d_);
            C114322sx sxVar2 = this.f341102F;
            if (sxVar2 != null) {
                if (bitmapDescriptor == null && defaultMarker != null) {
                    bitmapDescriptor = defaultMarker;
                }
                if (bitmapDescriptor != null) {
                    if (this.f341109M != null) {
                        m158586a(sxVar2.mo171543G(), bitmapDescriptor.getFormater());
                    }
                    MarkerOptions markerOptions = this.f341128w;
                    if (markerOptions != null) {
                        markerOptions.icon(bitmapDescriptor);
                    }
                    C113705eq eqVar = this.f341103G;
                    if (eqVar != null) {
                        eqVar.mo172014f();
                    }
                }
            }
        }
    }

    public final void setIconLooper(BitmapDescriptor bitmapDescriptor, boolean z, int i) {
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions != null) {
            markerOptions.icon(bitmapDescriptor);
            this.f341128w.iconLooper(z, i);
        }
        boolean isIconLooperEnable = this.f341128w.isIconLooperEnable();
        int activeSize = this.f341128w.getIcon().getFormater().activeSize();
        C113889km.m157545b(C0949kl.f2233c, "iconLooper totalSize:".concat(String.valueOf(activeSize)));
        if (activeSize > 1) {
            this.f341116T = -1;
            C113814ho hoVar = new C113814ho();
            hoVar.mo172190a((long) this.f341128w.getIconLooperDuration());
            hoVar.mo172191a((C113814ho.C113815a) new C113814ho.C113815a() {
                /* renamed from: a */
                public final void mo172195a(float f) {
                    MarkerOptions markerOptions;
                    super.mo172195a(f);
                    if (C114030pa.this.f341109M != null && C114030pa.this.f341102F != null && (markerOptions = C114030pa.this.f341128w) != null) {
                        BitmapDescriptor icon = markerOptions.getIcon();
                        int activeSize = icon.getFormater().activeSize();
                        C113889km.m157545b(C0949kl.f2233c, "current Marker iconLooper getValue:".concat(String.valueOf(f)));
                        int round = Math.round(((float) activeSize) * f);
                        C113889km.m157545b(C0949kl.f2233c, "current Marker iconLooper activeIndex:".concat(String.valueOf(round)));
                        if (round != C114030pa.this.f341116T) {
                            C114030pa paVar = C114030pa.this;
                            paVar.m158586a(paVar.f341102F.mo171543G(), icon.getFormater());
                            icon.getFormater().nextActiveIndex();
                            int unused = C114030pa.this.f341116T = round;
                        }
                    }
                }
            });
            this.f341109M.f341530q = hoVar;
            hoVar.mo172193a(isIconLooperEnable);
        }
    }

    public final void setInMapCenterState(boolean z) {
        this.f341101E = z;
    }

    public final void setInfoWindowAnchor(float f, float f2) {
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions != null) {
            markerOptions.infoWindowAnchor(f, f2);
        }
        C113705eq eqVar = this.f341103G;
        if (eqVar != null) {
            eqVar.mo172014f();
        }
        mo172606q();
    }

    public final void setInfoWindowEnable(boolean z) {
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions != null) {
            markerOptions.infoWindowEnable(z);
        }
        C113705eq eqVar = this.f341103G;
        if (eqVar != null && eqVar.mo172011c()) {
            this.f341103G.mo172010b(z);
        }
    }

    public final void setInfoWindowOffset(int i, int i2) {
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions != null) {
            markerOptions.infoWindowOffset(i, i2);
        }
        C113705eq eqVar = this.f341103G;
        if (eqVar != null) {
            eqVar.mo172014f();
        }
        mo172606q();
    }

    public final void setLevel(int i) {
        super.setLevel(i);
        C114108qh qhVar = this.f341109M;
        if (qhVar != null) {
            qhVar.setLevel(i);
        }
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions != null) {
            markerOptions.level(i);
        }
    }

    public final void setMarkerOptions(MarkerOptions markerOptions) {
        if (this.f341102F != null && markerOptions != null) {
            this.f341128w = markerOptions;
            this.f341072m = true;
            setTitle(markerOptions.getTitle());
            setDraggable(markerOptions.isDraggable());
            setPosition(markerOptions.getPosition());
            setSnippet(markerOptions.getSnippet());
            setAnchor(markerOptions.getAnchorU(), markerOptions.getAnchorV());
            setVisible(markerOptions.isVisible());
            setRotation(markerOptions.getRotation());
            setIcon(markerOptions.getIcon());
            setAlpha(markerOptions.getAlpha());
            setZIndex(markerOptions.getZIndex());
            setLevel(markerOptions.getLevel());
            mo172018a(markerOptions.getIndoorInfo());
            setTag(markerOptions.getTag());
            setCollisions(markerOptions.getCollisions());
            MarkerOptions options = getOptions();
            if (!(this.f341102F == null || options == null || this.f341109M != null)) {
                C114109qi qiVar = new C114109qi();
                qiVar.f341544i = GeoPoint.from(options.getPosition());
                qiVar.f341548m = options.getAlpha();
                qiVar.mo172725a(options.getAnchorU(), options.getAnchorV());
                byte[] bArr = new byte[20];
                new SecureRandom().nextBytes(bArr);
                String str = new String(bArr);
                Bitmap bitmap = null;
                try {
                    bitmap = options.getIcon().getBitmap(this.f341102F.mo171543G());
                    str = options.getIcon().getFormater().getBitmapId();
                } catch (NullPointerException unused) {
                }
                C114109qi a = qiVar.mo172726a(str, bitmap);
                a.f341550o = (int) options.getRotation();
                a.f341549n = options.isFlat();
                a.f341554s = (int) options.getZIndex();
                a.f341556u = this.f341104H;
                a.f341560y = false;
                a.f341559x = isCollisionBy(MarkerCollisionItem.POI);
                a.f341561z = options.isClockwise();
                a.f341557v = options.isFastLoad();
                a.f341555t = options.getLevel();
                this.f341109M = new C114108qh(this, this.f341102F, qiVar);
                setIconLooper(options.getIcon(), options.isIconLooperEnable(), options.getIconLooperDuration());
            }
            mo172607r();
        }
    }

    @Deprecated
    public final void setOnTapMapViewBubbleHidden(boolean z) {
    }

    public final void setPosition(LatLng latLng) {
        this.f341114R = latLng;
        if (latLng != null) {
            m158587a(GeoPoint.from(latLng));
        }
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions != null) {
            markerOptions.position(latLng);
        }
    }

    public final void setRotation(float f) {
        super.setRotation(f);
        C114108qh qhVar = this.f341109M;
        if (qhVar != null) {
            qhVar.mo172716a((int) getRotation());
        }
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions != null) {
            markerOptions.rotation(f);
        }
    }

    public final void setScale(float f, float f2) {
        m158585a(f, f2);
    }

    public final void setSnippet(String str) {
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions != null) {
            markerOptions.snippet(str);
        }
        C113705eq eqVar = this.f341103G;
        if (eqVar != null) {
            eqVar.mo172014f();
        }
    }

    public final void setTag(Object obj) {
        this.f341118a = obj;
    }

    public final void setTitle(String str) {
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions != null) {
            markerOptions.title(str);
        }
        C113705eq eqVar = this.f341103G;
        if (eqVar != null) {
            eqVar.mo172014f();
        }
    }

    public final void setVisible(boolean z) {
        M m;
        super.setVisible(z);
        C114108qh qhVar = this.f341109M;
        if (qhVar != null) {
            qhVar.setVisible(z);
        }
        C114322sx sxVar = this.f341102F;
        if (sxVar != null && (m = sxVar.f339878e_) != null) {
            ((VectorMap) m).f342909o.f340914v = true;
        }
    }

    public final void setZIndex(float f) {
        this.f341066g = f;
        MarkerOptions markerOptions = this.f341128w;
        if (markerOptions != null) {
            markerOptions.zIndex(f);
        }
        C114108qh qhVar = this.f341109M;
        if (qhVar != null) {
            qhVar.setZIndex((int) f);
        }
        mo172606q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        r3 = r8.f341103G;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void showInfoWindow() {
        /*
            r8 = this;
            com.tencent.mapsdk.internal.sx r0 = r8.f341102F
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions r1 = r8.f341128w
            if (r0 == 0) goto L_0x00bf
            if (r1 != 0) goto L_0x000a
            goto L_0x00bf
        L_0x000a:
            byte[] r2 = r0.f342580g
            monitor-enter(r2)
            boolean r3 = r0.f342572ao     // Catch:{ all -> 0x00bc }
            if (r3 != 0) goto L_0x005b
            com.tencent.mapsdk.internal.mq r3 = r0.f342647aD     // Catch:{ all -> 0x00bc }
            com.tencent.mapsdk.internal.bi r3 = r3.f340880J     // Catch:{ all -> 0x00bc }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x00bc }
            r4.<init>()     // Catch:{ all -> 0x00bc }
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.et> r5 = r3.f339804a     // Catch:{ all -> 0x00bc }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x00bc }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00bc }
        L_0x0024:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x00bc }
            if (r6 == 0) goto L_0x003a
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x00bc }
            com.tencent.mapsdk.internal.et r6 = (com.tencent.mapsdk.internal.C113709et) r6     // Catch:{ all -> 0x00bc }
            boolean r7 = r6 instanceof com.tencent.mapsdk.internal.C113528aw     // Catch:{ all -> 0x00bc }
            if (r7 == 0) goto L_0x0024
            com.tencent.mapsdk.internal.aw r6 = (com.tencent.mapsdk.internal.C113528aw) r6     // Catch:{ all -> 0x00bc }
            r4.add(r6)     // Catch:{ all -> 0x00bc }
            goto L_0x0024
        L_0x003a:
            java.util.Comparator<com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable> r3 = r3.f339810g     // Catch:{ all -> 0x00bc }
            java.util.Collections.sort(r4, r3)     // Catch:{ all -> 0x00bc }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x00bc }
        L_0x0043:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00bc }
            if (r4 == 0) goto L_0x005b
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00bc }
            com.tencent.tencentmap.mapsdk.maps.model.Marker r4 = (com.tencent.tencentmap.mapsdk.maps.model.Marker) r4     // Catch:{ all -> 0x00bc }
            if (r4 == 0) goto L_0x0043
            boolean r5 = r4.isInfoWindowShown()     // Catch:{ all -> 0x00bc }
            if (r5 == 0) goto L_0x0043
            r4.hideInfoWindow()     // Catch:{ all -> 0x00bc }
            goto L_0x0043
        L_0x005b:
            com.tencent.mapsdk.internal.eq r3 = r8.f341103G     // Catch:{ all -> 0x00bc }
            if (r3 != 0) goto L_0x0075
            boolean r1 = r1.isViewInfowindow()     // Catch:{ all -> 0x00bc }
            if (r1 == 0) goto L_0x006d
            com.tencent.mapsdk.internal.pd r1 = new com.tencent.mapsdk.internal.pd     // Catch:{ all -> 0x00bc }
            r1.<init>(r0, r8)     // Catch:{ all -> 0x00bc }
            r8.f341103G = r1     // Catch:{ all -> 0x00bc }
            goto L_0x0078
        L_0x006d:
            com.tencent.mapsdk.internal.oz r1 = new com.tencent.mapsdk.internal.oz     // Catch:{ all -> 0x00bc }
            r1.<init>(r0, r8)     // Catch:{ all -> 0x00bc }
            r8.f341103G = r1     // Catch:{ all -> 0x00bc }
            goto L_0x0078
        L_0x0075:
            r3.mo172014f()     // Catch:{ all -> 0x00bc }
        L_0x0078:
            boolean r0 = r8.f341104H     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0085
            com.tencent.mapsdk.internal.eq r0 = r8.f341103G     // Catch:{ all -> 0x00bc }
            int r1 = r8.f341105I     // Catch:{ all -> 0x00bc }
            int r3 = r8.f341106J     // Catch:{ all -> 0x00bc }
            r0.mo172006a(r1, r3)     // Catch:{ all -> 0x00bc }
        L_0x0085:
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions r0 = r8.f341128w     // Catch:{ all -> 0x00bc }
            r1 = 1
            if (r0 == 0) goto L_0x00b0
            boolean r3 = r0.isInfoWindowEnable()     // Catch:{ all -> 0x00bc }
            if (r3 == 0) goto L_0x00b0
            com.tencent.mapsdk.internal.eq r3 = r8.f341103G     // Catch:{ all -> 0x00bc }
            if (r3 == 0) goto L_0x009a
            android.view.View r3 = r3.mo172015g()     // Catch:{ all -> 0x00bc }
            if (r3 != 0) goto L_0x00ae
        L_0x009a:
            java.lang.String r3 = r0.getTitle()     // Catch:{ all -> 0x00bc }
            boolean r3 = com.tencent.mapsdk.internal.C40002he.m42805a((java.lang.String) r3)     // Catch:{ all -> 0x00bc }
            if (r3 == 0) goto L_0x00ae
            java.lang.String r0 = r0.getSnippet()     // Catch:{ all -> 0x00bc }
            boolean r0 = com.tencent.mapsdk.internal.C40002he.m42805a((java.lang.String) r0)     // Catch:{ all -> 0x00bc }
            if (r0 != 0) goto L_0x00b0
        L_0x00ae:
            r0 = 1
            goto L_0x00b1
        L_0x00b0:
            r0 = 0
        L_0x00b1:
            if (r0 == 0) goto L_0x00ba
            com.tencent.mapsdk.internal.eq r0 = r8.f341103G     // Catch:{ all -> 0x00bc }
            r0.mo172010b(r1)     // Catch:{ all -> 0x00bc }
            r8.f341113Q = r1     // Catch:{ all -> 0x00bc }
        L_0x00ba:
            monitor-exit(r2)     // Catch:{ all -> 0x00bc }
            return
        L_0x00bc:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00bc }
            throw r0
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114030pa.showInfoWindow():void");
    }

    public final boolean startAnimation() {
        M m;
        C114322sx sxVar = this.f341102F;
        if (sxVar == null || this.f341111O == null) {
            return false;
        }
        GeoPoint geoPoint = this.f341130y;
        if (this.f341104H && (m = sxVar.f339878e_) != null) {
            geoPoint = ((VectorMap) m).getProjection().mo172025a(new C113732fo((double) this.f341105I, (double) this.f341106J));
            this.f341108L = new GeoPoint(geoPoint);
        }
        return this.f341111O.mo172206a(geoPoint, this.f341097A);
    }

    /* renamed from: b */
    private void m158594b(Bitmap bitmap) {
        synchronized (this.f341121p) {
            this.f341119n = bitmap;
            if (this.f341129x == null) {
                this.f341129x = bitmap.toString();
            }
            C114108qh qhVar = this.f341109M;
            if (qhVar != null) {
                qhVar.mo172719a(this.f341129x, this.f341119n);
            }
        }
    }

    /* renamed from: c */
    public final Point mo171376c() {
        return new Point(this.f341105I, this.f341106J);
    }

    /* renamed from: d */
    public final TencentMap.OnMarkerClickListener mo172012d() {
        return this.f341112P;
    }

    /* renamed from: e */
    public final List<LatLng> mo172013e() {
        VectorMap vectorMap;
        Rect bound;
        C114322sx sxVar = this.f341102F;
        if (sxVar == null || (vectorMap = (VectorMap) sxVar.f339878e_) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Rect w = m158604w();
        if (w != null) {
            LatLng latLng = new LatLng(((double) w.top) / 1000000.0d, ((double) w.left) / 1000000.0d);
            LatLng latLng2 = new LatLng(((double) w.bottom) / 1000000.0d, ((double) w.left) / 1000000.0d);
            LatLng latLng3 = new LatLng(((double) w.top) / 1000000.0d, ((double) w.right) / 1000000.0d);
            LatLng latLng4 = new LatLng(((double) w.bottom) / 1000000.0d, ((double) w.right) / 1000000.0d);
            arrayList.add(latLng);
            arrayList.add(latLng2);
            arrayList.add(latLng3);
            arrayList.add(latLng4);
        }
        C113705eq eqVar = this.f341103G;
        if (!(eqVar == null || !eqVar.mo172011c() || (bound = eqVar.getBound(vectorMap.getProjection())) == null)) {
            LatLng latLng5 = new LatLng(((double) bound.top) / 1000000.0d, ((double) bound.left) / 1000000.0d);
            LatLng latLng6 = new LatLng(((double) bound.bottom) / 1000000.0d, ((double) bound.left) / 1000000.0d);
            LatLng latLng7 = new LatLng(((double) bound.top) / 1000000.0d, ((double) bound.right) / 1000000.0d);
            LatLng latLng8 = new LatLng(((double) bound.bottom) / 1000000.0d, ((double) bound.right) / 1000000.0d);
            arrayList.add(latLng5);
            arrayList.add(latLng6);
            arrayList.add(latLng7);
            arrayList.add(latLng8);
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List<Boundable<C113707es>> mo172014f() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f341109M);
        C113705eq eqVar = this.f341103G;
        if (eqVar != null && eqVar.mo172011c()) {
            arrayList.add(this.f341103G);
        }
        return arrayList;
    }

    /* renamed from: g */
    public final TencentMap.InfoWindowAdapter mo172015g() {
        C114322sx sxVar = this.f341102F;
        if (sxVar != null) {
            return sxVar.f342654aK;
        }
        return null;
    }

    /* renamed from: c */
    private int m158595c(boolean z) {
        float f;
        float e;
        Bitmap bitmap = this.f341119n;
        if (bitmap == null || this.f341109M == null) {
            return 0;
        }
        int height = bitmap.getHeight();
        if (!z) {
            f = (float) height;
            e = this.f341109M.mo172013e();
        } else {
            f = (float) height;
            e = 1.0f - this.f341109M.mo172013e();
        }
        return (int) (f * e);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m158585a(float f, float f2) {
        int i;
        if (f >= 0.0f) {
            this.f341099C = f;
        }
        if (f2 >= 0.0f) {
            this.f341100D = f2;
        }
        C114108qh qhVar = this.f341109M;
        if (qhVar != null) {
            qhVar.mo172721b(this.f341099C, this.f341100D);
            int height = getHeight(this.f341102F.mo171543G());
            float width = (float) getWidth(this.f341102F.mo171543G());
            float f3 = this.f341099C * width;
            if (f3 >= width) {
                float f4 = f3 - width;
                i = (int) ((0.5f * f4) - (getAnchorU() * f4));
            } else {
                float f5 = width - f3;
                i = (int) ((getAnchorU() * f5) - (f5 * 0.5f));
            }
            float f6 = (float) height;
            this.f341128w.infoWindowOffset(i, (int) (getAnchorV() * (f6 - (this.f341100D * f6))));
        }
        if (this.f341103G != null) {
            refreshInfoWindow();
        }
    }

    /* renamed from: b */
    public final Rect mo171428b(C113707es esVar) {
        return m158604w();
    }

    public final void startAnimation(Animation animation) {
        setAnimation(animation);
        startAnimation();
    }

    /* renamed from: b */
    public final void mo171374b(boolean z) {
        this.f341101E = z;
    }

    /* renamed from: b */
    public final boolean mo171375b() {
        return this.f341104H;
    }

    /* renamed from: a */
    public final int mo172002a() {
        C114108qh qhVar = this.f341109M;
        if (qhVar != null) {
            return qhVar.mo172002a();
        }
        return super.mo172002a();
    }

    /* renamed from: a */
    public final void mo171371a(BitmapDescriptor bitmapDescriptor, BitmapDescriptor bitmapDescriptor2) {
        C114322sx sxVar = this.f341102F;
        if (sxVar != null) {
            if (bitmapDescriptor == null && bitmapDescriptor2 != null) {
                bitmapDescriptor = bitmapDescriptor2;
            }
            if (bitmapDescriptor != null) {
                if (this.f341109M != null) {
                    m158586a(sxVar.mo171543G(), bitmapDescriptor.getFormater());
                }
                MarkerOptions markerOptions = this.f341128w;
                if (markerOptions != null) {
                    markerOptions.icon(bitmapDescriptor);
                }
                C113705eq eqVar = this.f341103G;
                if (eqVar != null) {
                    eqVar.mo172014f();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m158586a(Context context, BitmapDescriptor.BitmapFormator bitmapFormator) {
        if (bitmapFormator != null) {
            Bitmap bitmap = bitmapFormator.getBitmap(context);
            String str = this.f341129x;
            if (str == null || !str.equals(bitmapFormator.getBitmapId())) {
                m158592a(bitmapFormator.getBitmapId());
                mo171368a(bitmap);
            }
        }
    }

    /* renamed from: a */
    private void m158587a(GeoPoint geoPoint) {
        if (geoPoint != null) {
            GeoPoint geoPoint2 = this.f341130y;
            if (geoPoint2 == null) {
                this.f341130y = new GeoPoint(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6());
            } else {
                geoPoint2.setLatitudeE6(geoPoint.getLatitudeE6());
                this.f341130y.setLongitudeE6(geoPoint.getLongitudeE6());
            }
            C114108qh qhVar = this.f341109M;
            if (qhVar != null) {
                qhVar.mo172717a(this.f341130y);
            }
            C113705eq eqVar = this.f341103G;
            if (eqVar != null) {
                eqVar.mo172007a(C113883ke.m157466a(this.f341130y));
            }
        }
    }

    /* renamed from: a */
    private void m158592a(String str) {
        synchronized (this.f341121p) {
            this.f341129x = str;
        }
    }

    /* renamed from: a */
    public final void mo171372a(LatLng latLng) {
        C113705eq eqVar;
        C114322sx sxVar = this.f341102F;
        setPosition(latLng);
        if (getId().equals(sxVar != null ? sxVar.f342581h : "") && (eqVar = this.f341103G) != null) {
            eqVar.mo172007a(latLng);
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo171373a(boolean z) {
        C114322sx sxVar = this.f341102F;
        if (sxVar != null) {
            sxVar.f342582i = z;
        }
    }

    /* renamed from: a */
    public final void mo171368a(Bitmap bitmap) {
        if (bitmap != null) {
            m158594b(bitmap);
            m158602u();
        }
    }

    /* renamed from: a */
    private void m158588a(C113820hz hzVar) {
        this.f341111O = hzVar;
        if (hzVar != null) {
            hzVar.mo172205a(this.f341117U);
        }
    }

    /* renamed from: a */
    public final void mo171370a(AnimationListener animationListener) {
        this.f341110N = animationListener;
    }

    /* renamed from: a */
    public final void mo171369a(TencentMap.OnMarkerClickListener onMarkerClickListener) {
        this.f341112P = onMarkerClickListener;
    }

    /* renamed from: a */
    public final Rect getScreenBound(C113707es esVar) {
        C114108qh qhVar = this.f341109M;
        Rect rect = null;
        if (qhVar == null) {
            return null;
        }
        Rect a = qhVar.mo171426a(esVar);
        C113705eq eqVar = this.f341103G;
        if (eqVar != null) {
            rect = eqVar.getScreenBound(esVar);
        }
        if (a == null) {
            return rect;
        }
        if (rect == null) {
            return a;
        }
        return new Rect(Math.min(a.left, rect.left), Math.min(a.top, rect.top), Math.max(a.right, rect.right), Math.max(a.bottom, rect.bottom));
    }

    /* renamed from: a */
    private void m158591a(MarkerOptions markerOptions) {
        if (this.f341102F != null && markerOptions != null && this.f341109M == null) {
            C114109qi qiVar = new C114109qi();
            qiVar.f341544i = GeoPoint.from(markerOptions.getPosition());
            qiVar.f341548m = markerOptions.getAlpha();
            qiVar.mo172725a(markerOptions.getAnchorU(), markerOptions.getAnchorV());
            byte[] bArr = new byte[20];
            new SecureRandom().nextBytes(bArr);
            String str = new String(bArr);
            Bitmap bitmap = null;
            try {
                bitmap = markerOptions.getIcon().getBitmap(this.f341102F.mo171543G());
                str = markerOptions.getIcon().getFormater().getBitmapId();
            } catch (NullPointerException unused) {
            }
            C114109qi a = qiVar.mo172726a(str, bitmap);
            a.f341550o = (int) markerOptions.getRotation();
            a.f341549n = markerOptions.isFlat();
            a.f341554s = (int) markerOptions.getZIndex();
            a.f341556u = this.f341104H;
            a.f341560y = false;
            a.f341559x = isCollisionBy(MarkerCollisionItem.POI);
            a.f341561z = markerOptions.isClockwise();
            a.f341557v = markerOptions.isFastLoad();
            a.f341555t = markerOptions.getLevel();
            this.f341109M = new C114108qh(this, this.f341102F, qiVar);
            setIconLooper(markerOptions.getIcon(), markerOptions.isIconLooperEnable(), markerOptions.getIconLooperDuration());
        }
    }
}
