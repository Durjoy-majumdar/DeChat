package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.mapsdk.internal.oz */
public final class C114028oz extends C114027oy<C113519an> implements C113519an, C113705eq {

    /* renamed from: n */
    public static final float f341081n = 5.0f;

    /* renamed from: y */
    private static AtomicInteger f341082y = new AtomicInteger(0);

    /* renamed from: A */
    private View f341083A;

    /* renamed from: B */
    private int f341084B;

    /* renamed from: o */
    private C114108qh f341085o;

    /* renamed from: p */
    private Bitmap f341086p = null;

    /* renamed from: q */
    private int f341087q = 0;

    /* renamed from: r */
    private int f341088r = 0;

    /* renamed from: s */
    private GeoPoint f341089s = null;

    /* renamed from: t */
    private C114322sx f341090t;

    /* renamed from: u */
    private C113520ao f341091u;

    /* renamed from: v */
    private boolean f341092v = false;

    /* renamed from: w */
    private float f341093w = 0.5f;

    /* renamed from: x */
    private float f341094x = 0.5f;

    /* renamed from: z */
    private boolean f341095z = false;

    public C114028oz(C114322sx sxVar, C113520ao aoVar) {
        super(sxVar);
        this.f341090t = sxVar;
        this.f341091u = aoVar;
        if (sxVar != null && aoVar != null && aoVar.getOptions() != null) {
            m158558i();
            C114322sx sxVar2 = this.f341090t;
            if (((VectorMap) sxVar2.f339878e_).f342909o.f340904l != null) {
                this.f341085o = new C114108qh(this, sxVar2, m158556b(aoVar.getOptions()));
                C113889km.m157537a("create InfoWindowView:" + this.f341083A);
                m158553a(C104548ha.m139943a(this.f341083A));
            }
        }
    }

    /* renamed from: a */
    public static View m158550a(Context context, C113536be beVar, C113705eq eqVar, TencentMap.InfoWindowAdapter infoWindowAdapter, Marker marker) {
        if (context == null || eqVar == null || marker == null || beVar == null) {
            return null;
        }
        String title = marker.getTitle();
        String snippet = marker.getSnippet();
        if (infoWindowAdapter != null) {
            LinearLayout linearLayout = (LinearLayout) eqVar.mo172015g();
            if (linearLayout == null) {
                linearLayout = m158552a(context);
            }
            C113528aw awVar = (C113528aw) beVar.mo171635c().f339819d.mo171670a(marker.getId(), C113528aw.class);
            if (awVar == null) {
                return null;
            }
            View infoWindow = infoWindowAdapter.getInfoWindow(awVar);
            if (infoWindow == null) {
                View infoContents = infoWindowAdapter.getInfoContents(awVar);
                if (infoContents != null) {
                    if (infoContents.getParent() == linearLayout) {
                        return linearLayout;
                    }
                    if (infoContents.getParent() instanceof ViewGroup) {
                        ((ViewGroup) infoContents.getParent()).removeAllViews();
                    }
                    m158554a((ViewGroup) linearLayout, "marker_infowindow.9.png");
                    linearLayout.removeAllViews();
                    linearLayout.addView(infoContents);
                    return linearLayout;
                } else if (C40002he.m42805a(title) && C40002he.m42805a(snippet)) {
                    return null;
                } else {
                    m158554a((ViewGroup) linearLayout, "marker_infowindow.9.png");
                    linearLayout.removeAllViews();
                    m158555a(beVar, linearLayout, C113705eq.f340172b, title);
                    m158555a(beVar, linearLayout, C113705eq.f340173c, snippet);
                    return linearLayout;
                }
            } else if (infoWindow.getParent() == linearLayout) {
                return linearLayout;
            } else {
                if (infoWindow.getParent() instanceof ViewGroup) {
                    ((ViewGroup) infoWindow.getParent()).removeAllViews();
                }
                linearLayout.setBackgroundDrawable((Drawable) null);
                linearLayout.removeAllViews();
                linearLayout.addView(infoWindow);
                return linearLayout;
            }
        } else if (!C40002he.m42805a(title) || !C40002he.m42805a(snippet)) {
            return m158551a(context, (TencentMapContext) beVar, eqVar, title, snippet);
        } else {
            return null;
        }
    }

    /* renamed from: b */
    private C114109qi m158556b(MarkerOptions markerOptions) {
        int infoWindowOffsetX = markerOptions.getInfoWindowOffsetX();
        int infowindowOffsetY = markerOptions.getInfowindowOffsetY();
        mo172012d();
        mo172013e();
        float f = this.f341093w - ((((float) infoWindowOffsetX) * 1.0f) / ((float) this.f341087q));
        float f2 = this.f341094x - ((((float) infowindowOffsetY) * 1.0f) / ((float) this.f341088r));
        C114109qi qiVar = new C114109qi();
        qiVar.f341544i = GeoPoint.from(markerOptions.getPosition());
        qiVar.f341548m = markerOptions.getAlpha();
        C114109qi a = qiVar.mo172725a(f, f2);
        a.f341549n = false;
        a.f341554s = (int) markerOptions.getZIndex();
        a.f341555t = markerOptions.getLevel();
        a.f341556u = this.f341092v;
        a.f341557v = true;
        return a;
    }

    /* renamed from: h */
    private void m158557h() {
        C113520ao aoVar = this.f341091u;
        if (this.f341090t != null && aoVar != null && aoVar.getOptions() != null) {
            m158558i();
            C114322sx sxVar = this.f341090t;
            if (((VectorMap) sxVar.f339878e_).f342909o.f340904l != null) {
                this.f341085o = new C114108qh(this, sxVar, m158556b(aoVar.getOptions()));
                C113889km.m157537a("create InfoWindowView:" + this.f341083A);
                m158553a(C104548ha.m139943a(this.f341083A));
            }
        }
    }

    /* renamed from: i */
    private void m158558i() {
        C114322sx sxVar = this.f341090t;
        if (sxVar != null && sxVar.mo171543G() != null) {
            TencentMap.InfoWindowAdapter infoWindowAdapter = null;
            C113520ao aoVar = this.f341091u;
            if (aoVar != null) {
                infoWindowAdapter = aoVar.mo171380g();
            }
            View a = m158550a(sxVar.mo171543G(), (C113536be) sxVar.f339876d_, (C113705eq) this, infoWindowAdapter, (Marker) aoVar);
            this.f341083A = a;
            if (a != null) {
                a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                this.f341087q = this.f341083A.getMeasuredWidth();
                this.f341088r = this.f341083A.getMeasuredHeight();
                View view = this.f341083A;
                view.layout(0, 0, view.getMeasuredWidth(), this.f341083A.getMeasuredHeight());
            }
        }
    }

    /* renamed from: t */
    private C113519an m158559t() {
        return this;
    }

    /* renamed from: c */
    public final boolean mo172011c() {
        return this.f341095z && this.f341086p != null;
    }

    /* renamed from: d */
    public final void mo172012d() {
        C113520ao aoVar = this.f341091u;
        C114322sx sxVar = this.f341090t;
        if (aoVar != null && sxVar != null && sxVar.mo171543G() != null) {
            int width = aoVar.getWidth(sxVar.mo171543G());
            float infoWindowAnchorU = aoVar.getOptions() != null ? aoVar.getOptions().getInfoWindowAnchorU() : 0.5f;
            int i = this.f341087q;
            if (i == 0) {
                i = 1;
            }
            this.f341093w = infoWindowAnchorU + ((((float) width) * (aoVar.getAnchorU() - 0.5f)) / ((float) i));
        }
    }

    /* renamed from: e */
    public final void mo172013e() {
        C113520ao aoVar = this.f341091u;
        C114322sx sxVar = this.f341090t;
        if (aoVar != null && sxVar != null && sxVar.mo171543G() != null) {
            int height = (int) (((float) aoVar.getHeight(sxVar.mo171543G())) * aoVar.getAnchorV());
            int i = this.f341088r;
            float f = 1.0f;
            if (aoVar.getOptions() != null) {
                f = aoVar.getOptions().getInfoWindowAnchorV();
            }
            if (i == 0) {
                i = 1;
            }
            float f2 = (float) height;
            float f3 = (float) i;
            this.f341094x = (f2 + (f * f3)) / f3;
        }
    }

    /* renamed from: f */
    public final void mo172014f() {
        C113520ao aoVar = this.f341091u;
        if (aoVar != null) {
            mo172008a(aoVar.getOptions());
        }
    }

    /* renamed from: f_ */
    public final /* bridge */ /* synthetic */ C113521ap mo171394f_() {
        return this;
    }

    /* renamed from: g */
    public final View mo172015g() {
        return this.f341083A;
    }

    /* renamed from: h_ */
    public final void mo172595h_() {
        releaseData();
    }

    /* renamed from: i_ */
    public final void mo172016i_() {
        int i;
        C113520ao aoVar = this.f341091u;
        int i2 = 0;
        if (aoVar == null || aoVar.getOptions() == null) {
            i = 0;
        } else {
            i2 = aoVar.getOptions().getInfoWindowOffsetX();
            i = aoVar.getOptions().getInfowindowOffsetY();
        }
        mo172012d();
        mo172013e();
        float f = this.f341093w - ((((float) i2) * 1.0f) / ((float) this.f341087q));
        float f2 = this.f341094x - ((((float) i) * 1.0f) / ((float) this.f341088r));
        C114108qh qhVar = this.f341085o;
        if (qhVar != null) {
            qhVar.mo172715a(f, f2);
        }
    }

    /* renamed from: j */
    public final void mo172003j() {
    }

    /* renamed from: j_ */
    public final void mo172596j_() {
        C114108qh qhVar;
        if (this.f341067h && (qhVar = this.f341085o) != null) {
            qhVar.mo172596j_();
        }
    }

    public final boolean onTap(float f, float f2) {
        C114108qh qhVar = this.f341085o;
        if (qhVar == null) {
            return false;
        }
        return qhVar.onTap(f, f2);
    }

    public final void releaseData() {
        Bitmap bitmap = this.f341086p;
        if (bitmap != null) {
            bitmap.recycle();
            this.f341086p = null;
        }
        this.f341091u = null;
        this.f341090t = null;
    }

    /* renamed from: s */
    public final void mo172608s() {
        super.mo172608s();
        C114108qh qhVar = this.f341085o;
        if (qhVar != null && qhVar.mo172014f() != this.f341084B) {
            C113889km.m157545b(C0949kl.f2236f, "设置主从绑定关系：" + this.f341091u.mo171367a() + "|" + this.f341085o.mo172014f());
            this.f341084B = this.f341085o.mo172014f();
        }
    }

    /* renamed from: b */
    public final void mo172010b(boolean z) {
        M m;
        this.f341095z = z;
        C114322sx sxVar = this.f341090t;
        if (sxVar != null && (m = sxVar.f339878e_) != null) {
            ((VectorMap) m).f342909o.f340914v = true;
        }
    }

    /* renamed from: b */
    public final Rect getBound(C113707es esVar) {
        C114108qh qhVar = this.f341085o;
        if (qhVar != null) {
            return qhVar.mo171428b(esVar);
        }
        return new Rect(0, 0, 0, 0);
    }

    /* renamed from: a */
    private static View m158551a(Context context, TencentMapContext tencentMapContext, C113705eq eqVar, String str, String str2) {
        LinearLayout linearLayout = (LinearLayout) eqVar.mo172015g();
        if (linearLayout == null) {
            linearLayout = m158552a(context);
        } else {
            linearLayout.removeAllViews();
        }
        m158554a((ViewGroup) linearLayout, "marker_infowindow.9.png");
        m158555a(tencentMapContext, linearLayout, C113705eq.f340172b, str);
        m158555a(tencentMapContext, linearLayout, C113705eq.f340173c, str2);
        return linearLayout;
    }

    /* renamed from: a */
    private static LinearLayout m158552a(Context context) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag(C113705eq.f340171a);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        return linearLayout;
    }

    /* renamed from: a */
    private static void m158554a(ViewGroup viewGroup, String str) {
        if (TextUtils.isEmpty(str)) {
            viewGroup.setBackgroundDrawable((Drawable) null);
        }
        Bitmap b = C104548ha.m139952b(viewGroup.getContext(), str);
        if (b != null) {
            viewGroup.setBackgroundDrawable(new NinePatchDrawable(viewGroup.getContext().getResources(), b, b.getNinePatchChunk(), new Rect(10, 10, 10, 30), (String) null));
        }
    }

    /* renamed from: a */
    private static void m158555a(TencentMapContext tencentMapContext, LinearLayout linearLayout, String str, String str2) {
        if (linearLayout != null && linearLayout.getContext() != null) {
            Context context = linearLayout.getContext();
            TextView textView = (TextView) linearLayout.findViewWithTag(str);
            if (!TextUtils.isEmpty(str2)) {
                if (textView == null) {
                    textView = new C104559mn(context, tencentMapContext);
                    textView.setTag(str);
                    textView.setGravity(3);
                    textView.setTextColor(-16777216);
                    linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
                }
                textView.setText(str2);
            } else if (textView != null) {
                linearLayout.removeView(textView);
            }
        }
    }

    /* renamed from: a */
    public final void mo172008a(MarkerOptions markerOptions) {
        if (markerOptions != null && this.f341085o != null) {
            setVisible(markerOptions.isVisible());
            setLevel(markerOptions.getLevel());
            m158558i();
            C114109qi b = m158556b(markerOptions);
            if (b != null) {
                this.f341085o.mo172718a(b);
                m158553a(C104548ha.m139943a(this.f341083A));
            }
        }
    }

    /* renamed from: a */
    public final void mo172007a(LatLng latLng) {
        if (latLng != null) {
            GeoPoint geoPoint = this.f341089s;
            if (geoPoint == null) {
                this.f341089s = GeoPoint.from(latLng);
            } else {
                geoPoint.setLatitudeE6((int) (latLng.latitude * 1000000.0d));
                this.f341089s.setLongitudeE6((int) (latLng.longitude * 1000000.0d));
            }
            C114108qh qhVar = this.f341085o;
            if (qhVar != null) {
                qhVar.mo172717a(this.f341089s);
            }
        }
    }

    /* renamed from: a */
    public final Rect getScreenBound(C113707es esVar) {
        C114108qh qhVar = this.f341085o;
        if (qhVar == null) {
            return null;
        }
        return qhVar.mo171426a(esVar);
    }

    /* renamed from: a */
    public final void mo172009a(boolean z) {
        this.f341092v = z;
        C114108qh qhVar = this.f341085o;
        if (qhVar != null) {
            qhVar.mo172720a(z);
        }
    }

    /* renamed from: a */
    public final void mo172006a(int i, int i2) {
        if (this.f341085o != null) {
            mo172009a(true);
            this.f341085o.mo172717a(new GeoPoint(i2, i));
        }
    }

    /* renamed from: a */
    private void m158553a(Bitmap bitmap) {
        this.f341086p = bitmap;
        if (bitmap != null) {
            C113889km.m157537a("setBitmapAssist:".concat(String.valueOf(bitmap)));
            StringBuilder sb = new StringBuilder();
            sb.append(bitmap.hashCode() + f341082y.getAndIncrement());
            String sb4 = sb.toString();
            C114108qh qhVar = this.f341085o;
            if (qhVar != null) {
                qhVar.mo172719a(sb4, bitmap);
            }
        }
    }
}
