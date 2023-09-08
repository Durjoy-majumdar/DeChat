package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import junit.framework.Assert;
import p225rc.C89925n;
import u24.C90599h;

/* renamed from: com.tencent.mm.plugin.appbrand.page.d2 */
public class C83781d2 extends C83820i0 {

    /* renamed from: L */
    public C83780d1 f244616L;

    /* renamed from: M */
    public String f244617M;

    /* renamed from: N */
    public final AtomicBoolean f244618N = new AtomicBoolean(false);

    public C83781d2(Context context, C83849m0 m0Var) {
        super(context, m0Var);
    }

    /* renamed from: B */
    public void mo114316B(long j, String str, C83817h4 h4Var) {
        Assert.assertTrue(TextUtils.isEmpty(this.f244617M) || C90599h.m113509b(this.f244617M, str));
        Log.m105925i("MicroMsg.AppBrandSinglePage", "AppBrandPageProfile| loadUrl, appId:%s, url:%s", getAppId(), str);
        this.f244617M = str;
        if (!this.f244618N.getAndSet(true)) {
            this.f244616L.mo116169X0(j, str, h4Var);
        }
    }

    /* renamed from: C */
    public void mo116223C() {
        this.f244616L.getClass();
    }

    /* renamed from: D */
    public void mo116224D() {
        super.mo116224D();
        this.f244616L.mo116171Z0();
    }

    /* renamed from: E */
    public void mo116225E() {
        super.mo116225E();
        this.f244616L.mo116174c1();
    }

    /* renamed from: F */
    public void mo116226F() {
        super.mo116226F();
        this.f244616L.mo116175d1();
    }

    /* renamed from: J */
    public void mo116227J(long j, String str) {
        this.f244617M = str;
        this.f244618N.set(true);
        this.f244616L.mo116169X0(j, str, C83817h4.REWRITE_ROUTE);
    }

    /* renamed from: N */
    public void mo116228N(String str, C83780d1 d1Var) {
        this.f244617M = str;
        this.f244618N.set(true);
    }

    /* renamed from: f */
    public void mo116229f() {
        this.f244616L.mo114329F();
    }

    /* renamed from: g */
    public View mo114317g() {
        if (this.f244616L == null) {
            C83780d1 p = getContainer().mo116364p(C89925n.m112488a(this.f244617M));
            this.f244616L = p;
            p.f244572U = this;
        }
        return this.f244616L.f244552D;
    }

    public C83780d1 getCurrentPageView() {
        return this.f244616L;
    }

    public String getCurrentUrl() {
        return this.f244617M;
    }

    /* renamed from: n */
    public void mo116232n(String str, String str2, int[] iArr) {
        if (mo116309y(iArr, this.f244616L.getComponentId())) {
            this.f244616L.mo109652f(str, str2, 0);
        }
    }

    /* renamed from: s */
    public C83780d1 mo116233s(int i, boolean z) {
        if (!z || !this.f244616L.mo116205x1()) {
            if (this.f244616L.getComponentId() == i) {
                return this.f244616L;
            }
            return null;
        } else if (this.f244616L.mo116190q0(i)) {
            return this.f244616L;
        } else {
            return null;
        }
    }

    public void setInitialUrl(String str) {
        this.f244617M = str;
    }

    /* renamed from: v */
    public boolean mo116235v(String str) {
        return C89925n.m112488a(this.f244617M).equals(C89925n.m112488a(str));
    }
}
