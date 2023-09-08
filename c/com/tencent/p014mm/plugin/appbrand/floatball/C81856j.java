package com.tencent.p014mm.plugin.appbrand.floatball;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81820e3;
import com.tencent.p014mm.plugin.appbrand.C83243l3;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.lang.ref.WeakReference;
import p576jp.C88007b;
import uv0.C22663i;

/* renamed from: com.tencent.mm.plugin.appbrand.floatball.j */
public class C81856j extends C22663i {

    /* renamed from: b */
    public AppBrandRuntimeWC f240140b;

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.j$a */
    public class C81857a implements C83243l3 {
        public C81857a() {
        }

        /* renamed from: a */
        public void mo114252a(C81820e3 e3Var) {
            C81856j jVar = C81856j.this;
            jVar.f65192a = new WeakReference<>(jVar.f240140b.mo113026R());
        }

        /* renamed from: b */
        public void mo114253b() {
            C81856j jVar = C81856j.this;
            jVar.getClass();
            jVar.f65192a = new WeakReference<>((Object) null);
        }
    }

    public C81856j(Activity activity, AppBrandRuntimeWC appBrandRuntimeWC) {
        super(activity);
        this.f240140b = appBrandRuntimeWC;
        appBrandRuntimeWC.f238105C.f247244a.add(new C81857a());
    }

    /* renamed from: c */
    public boolean mo35779c() {
        AppBrandRuntimeWC appBrandRuntimeWC = this.f240140b;
        return !(appBrandRuntimeWC != null ? appBrandRuntimeWC.mo121254q1() : false) && !((C88007b) C86312j.m106911c(C88007b.class)).Ym0();
    }

    /* renamed from: d */
    public void mo23513d(boolean z) {
        if (this.f240140b != null) {
            if (getActivity() instanceof AppBrandUI) {
                ((AppBrandUI) getActivity()).f246506z = !z;
            }
            this.f240140b.mo113172C1();
        }
    }

    /* renamed from: g */
    public boolean mo23516g() {
        return false;
    }

    public Activity getActivity() {
        return this.f240140b.mo113026R();
    }

    public Bitmap getBitmap() {
        try {
            AppBrandRuntimeWC appBrandRuntimeWC = this.f240140b;
            if (!(appBrandRuntimeWC == null || appBrandRuntimeWC.mo113212m1() == null || this.f240140b.mo113212m1().getCurrentPage() == null || this.f240140b.mo113212m1().getCurrentPage().getCurrentPageView() == null)) {
                return this.f240140b.mo113212m1().getCurrentPage().getCurrentPageView().mo116159N0();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrandFloatBallPageAdapter", e, "appbrand getBitmap fail exception:%s", e.getMessage());
        }
        return super.getBitmap();
    }

    public View getContentView() {
        AppBrandRuntimeWC appBrandRuntimeWC = this.f240140b;
        if (appBrandRuntimeWC != null) {
            return appBrandRuntimeWC.f238153r;
        }
        return null;
    }

    public View getMaskView() {
        return getContentView();
    }
}
