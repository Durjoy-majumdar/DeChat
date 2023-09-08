package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mapsdk.core.MapDelegate;
import com.tencent.mapsdk.internal.C113563bm;
import com.tencent.mapsdk.internal.C113565bo;
import com.tencent.mapsdk.internal.C113749ge;
import com.tencent.mapsdk.internal.C113865kb;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.MapViewType;

/* renamed from: com.tencent.mapsdk.internal.bp */
public abstract class C113568bp<C extends C113565bo, M extends C113563bm> implements MapDelegate<C, M, C113572bv> {

    /* renamed from: c */
    public C113572bv f339874c;

    /* renamed from: d */
    public ViewGroup f339875d;

    /* renamed from: d_ */
    public C f339876d_;

    /* renamed from: e */
    public final Context f339877e;

    /* renamed from: e_ */
    public M f339878e_;

    /* renamed from: f */
    public TencentMapOptions f339879f;

    /* renamed from: g */
    private C113865kb.C113873c f339880g;

    public C113568bp(Context context, TencentMapOptions tencentMapOptions, ViewGroup viewGroup) {
        this.f339877e = context;
        this.f339875d = viewGroup;
        this.f339879f = tencentMapOptions;
        if (this.f339880g == null) {
            this.f339880g = C113865kb.m157397a();
        }
        C113865kb.m157401b();
        C113865kb.m157398a(this.f339880g);
        C113891ko koVar = new C113891ko(context, tencentMapOptions);
        if (C113889km.f340717a != koVar) {
            C113889km.f340717a = koVar;
        }
        C113896kq.m157663b(C0950kp.f2277W);
        C113896kq.m157663b(C0950kp.f2279y);
        if (tencentMapOptions != null) {
            C113896kq.m157655a(C0950kp.f2277W, "options", (Object) C113896kq.m157649a(tencentMapOptions.toString()));
        }
    }

    /* renamed from: S */
    private static void mo172974S() {
    }

    /* renamed from: U */
    private MapViewType mo172976U() {
        return this.f339876d_.f339858a.getMapViewType();
    }

    /* renamed from: V */
    private M mo172977V() {
        return this.f339878e_;
    }

    /* renamed from: W */
    private C mo172978W() {
        return this.f339876d_;
    }

    /* renamed from: c */
    private void m156333c(float f) {
        C113572bv bvVar = this.f339874c;
        if (bvVar != null) {
            bvVar.mo171858a(f);
        }
    }

    /* renamed from: L */
    public final ViewGroup mo171819L() {
        return this.f339875d;
    }

    /* renamed from: O */
    public void mo171820O() {
        C c = this.f339876d_;
        if (c != null) {
            c.mo171804p();
        }
    }

    /* renamed from: P */
    public void mo171821P() {
    }

    /* renamed from: Q */
    public void mo171822Q() {
    }

    /* renamed from: a */
    public final M mo171823a(C c) {
        return createMap(c);
    }

    /* renamed from: a */
    public abstract C mo171824a(Context context, TencentMapOptions tencentMapOptions);

    /* renamed from: b */
    public abstract M createMap(C c);

    /* renamed from: b */
    public abstract C113572bv createMapView(C c, ViewGroup viewGroup);

    public /* bridge */ /* synthetic */ TencentMap getMap() {
        return this.f339878e_;
    }

    public /* bridge */ /* synthetic */ TencentMapContext getMapContext() {
        return this.f339876d_;
    }

    public C113572bv getMapRenderView() {
        return this.f339874c;
    }

    public boolean isOpaque() {
        C113572bv bvVar = this.f339874c;
        if (bvVar != null) {
            return bvVar.mo171863e();
        }
        return true;
    }

    public boolean isTouchable() {
        M m = this.f339878e_;
        return m != null && m.mo171703a();
    }

    /* renamed from: m */
    public void mo171831m(boolean z) {
        C c = this.f339876d_;
        if (c != null) {
            c.f339863f = z;
        }
    }

    public void onCreated() {
        C113896kq.m157663b(C0950kp.f2265K);
        this.f339876d_ = mo171824a(this.f339877e, this.f339879f);
        mo171820O();
        C113896kq.m157671d(C0950kp.f2265K);
        C113896kq.m157663b(C0950kp.f2266L);
        C113572bv b = createMapView(this.f339876d_, this.f339875d);
        this.f339874c = b;
        View view = b.getView();
        view.setEnabled(true);
        view.setClickable(true);
        C113896kq.m157671d(C0950kp.f2266L);
        C113896kq.m157663b(C0950kp.f2264J);
        this.f339878e_ = createMap(this.f339876d_);
        mo171821P();
        this.f339878e_.mo922b(C113565bo.m156304t());
        mo171822Q();
        C113896kq.m157671d(C0950kp.f2264J);
        C113896kq.m157671d(C0950kp.f2279y);
    }

    public void onDestroy() {
        ViewGroup viewGroup = this.f339875d;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        M m = this.f339878e_;
        if (m != null) {
            m.mo928m();
        }
        C c = this.f339876d_;
        if (c != null) {
            C113749ge geVar = c.f339860c;
            C113792gv gvVar = c.f339861d;
            gvVar.f340427b = System.currentTimeMillis() - gvVar.f340426a;
            geVar.f340329a--;
            synchronized (geVar) {
                geVar.f340330b.add(gvVar);
            }
            if (geVar.f340329a == 0 && !geVar.f340330b.isEmpty()) {
                geVar.mo172126a(C113749ge.m156935a(geVar.f340330b, (C113749ge.C113759e) null), (C113749ge.C113755a<Boolean>) new C113749ge.C113755a<Boolean>() {
                    /* renamed from: a */
                    public final /* synthetic */ void mo172128a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        C113749ge.m156931a(C113749ge.this, bool.booleanValue());
                        if (bool.booleanValue()) {
                            C113749ge.this.f340330b.clear();
                        }
                    }

                    /* renamed from: a */
                    private void m156951a(Boolean bool) {
                        C113749ge.m156931a(C113749ge.this, bool.booleanValue());
                        if (bool.booleanValue()) {
                            C113749ge.this.f340330b.clear();
                        }
                    }
                });
            }
            Bundle bundle = new Bundle();
            if (bundle.size() > 0) {
                Parcel obtain = Parcel.obtain();
                bundle.writeToParcel(obtain, 0);
                C113884kf.m157491a(C113884kf.m157494b(C113884kf.f340711d, "map-context.cache"), obtain.marshall());
                obtain.recycle();
            }
            c.mo171808u();
            BitmapDescriptorFactory.detachMapContext(c);
        }
        C113865kb.m157403c();
        C113865kb.m157404d();
    }

    public void onPause() {
        M m = this.f339878e_;
        if (m != null) {
            m.mo925j();
        }
    }

    public void onRestart() {
        if (this.f339878e_ != null) {
            C113896kq.m157663b(C0950kp.f2270P);
            C113896kq.m157671d(C0950kp.f2270P);
        }
    }

    public void onResume() {
        M m = this.f339878e_;
        if (m != null) {
            m.mo924i();
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        C113572bv bvVar = this.f339874c;
        if (bvVar != null) {
            bvVar.onSizeChanged(i, i2, i3, i4);
        }
    }

    public void onStart() {
        M m = this.f339878e_;
        if (m != null) {
            m.mo923h();
        }
    }

    public void onStop() {
        M m = this.f339878e_;
        if (m != null) {
            m.mo927l();
        }
    }

    public void onSurfaceChanged(Object obj, int i, int i2) {
        C113572bv bvVar = this.f339874c;
        if (bvVar != null) {
            bvVar.mo171859a(obj, i, i2);
        }
    }

    public void onUpdateOptions(TencentMapOptions tencentMapOptions) {
    }

    public void setOnTop(boolean z) {
        M m = this.f339878e_;
        if (m != null) {
            m.mo171702a(z);
        }
    }

    public void setOpaque(boolean z) {
        C113572bv bvVar = this.f339874c;
        if (bvVar != null) {
            bvVar.setMapOpaque(z);
        }
    }

    /* renamed from: a */
    public final C113572bv mo171825a(C c, ViewGroup viewGroup) {
        return createMapView(c, viewGroup);
    }
}
