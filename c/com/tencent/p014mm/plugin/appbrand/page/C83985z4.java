package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.appbrand.menu.C83657c0;
import com.tencent.p014mm.plugin.appbrand.menu.C83699y;
import com.tencent.p014mm.plugin.appbrand.page.C83942u4;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C11184p0;
import nj3.C76875f0;
import rx3.C13598b0;
import wc3.C15133e0;

/* renamed from: com.tencent.mm.plugin.appbrand.page.z4 */
public final class C83985z4 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C15133e0 f245197d;

    /* renamed from: e */
    public final /* synthetic */ C83942u4 f245198e;

    /* renamed from: f */
    public final /* synthetic */ Context f245199f;

    /* renamed from: g */
    public final /* synthetic */ C83928t1 f245200g;

    /* renamed from: h */
    public final /* synthetic */ C83942u4.C55544b f245201h;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.z4$a */
    public static final class C83986a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C83942u4 f245202d;

        /* renamed from: e */
        public final /* synthetic */ Context f245203e;

        /* renamed from: f */
        public final /* synthetic */ C83928t1 f245204f;

        /* renamed from: g */
        public final /* synthetic */ C83942u4.C55544b f245205g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83986a(C83942u4 u4Var, Context context, C83928t1 t1Var, C83942u4.C55544b bVar) {
            super(1);
            this.f245202d = u4Var;
            this.f245203e = context;
            this.f245204f = t1Var;
            this.f245205g = bVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "username");
            C83942u4 u4Var = this.f245202d;
            Context context = this.f245203e;
            C83928t1 t1Var = this.f245204f;
            String str2 = u4Var.f245079a;
            Log.m105924i(str2, "performRecentlyForwardClick, toUser: " + str);
            C84240s.m103840f(t1Var.getAppId(), t1Var.mo116162Q0(), 50, "", Util.nowSecond(), 1, 0);
            C83699y J0 = t1Var.mo116155J0(3);
            C83657c0.m102699b(context, t1Var, J0, new C83972x4(J0, str));
            C83942u4.C55544b bVar = this.f245205g;
            bVar.getClass();
            String str3 = bVar.f158149b;
            Log.m105924i(str3, "onRecentForwardClick, username: " + str);
            bVar.f158150c = str;
            bVar.mo77067a(true);
            return C13598b0.f38549a;
        }
    }

    public C83985z4(C15133e0 e0Var, C83942u4 u4Var, Context context, C83928t1 t1Var, C83942u4.C55544b bVar) {
        this.f245197d = e0Var;
        this.f245198e = u4Var;
        this.f245199f = context;
        this.f245200g = t1Var;
        this.f245201h = bVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem instanceof C76875f0) {
            this.f245197d.xc0((C76875f0) menuItem, new C83986a(this.f245198e, this.f245199f, this.f245200g, this.f245201h));
        }
    }
}
