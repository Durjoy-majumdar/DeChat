package com.tencent.p014mm.plugin.appbrand.utils;

import android.app.Activity;
import android.view.Window;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81820e3;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.C83243l3;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.c2 */
public final class C84726c2 {

    /* renamed from: a */
    public final AppBrandRuntime f247122a;

    /* renamed from: b */
    public final String f247123b;

    /* renamed from: c */
    public volatile boolean f247124c;

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.c2$a */
    public static final class C84727a implements C83243l3 {

        /* renamed from: a */
        public boolean f247125a;

        /* renamed from: b */
        public final /* synthetic */ C84726c2 f247126b;

        public C84727a(C84726c2 c2Var) {
            this.f247126b = c2Var;
            C81820e3 e3Var = c2Var.f247122a.f238142e;
            if (e3Var != null) {
                mo114252a(e3Var);
            }
        }

        /* renamed from: a */
        public void mo114252a(C81820e3 e3Var) {
            C87412m.m108594g(e3Var, "container");
            if (!this.f247125a) {
                Log.m105924i(this.f247126b.f247123b, "onAttachedToRuntimeContainer, first blood");
                this.f247126b.mo117452a();
                this.f247125a = true;
            }
        }

        /* renamed from: b */
        public void mo114253b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.c2$b */
    public static final class C84728b extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ C84726c2 f247127d;

        public C84728b(C84726c2 c2Var) {
            this.f247127d = c2Var;
        }

        /* renamed from: c */
        public void mo109497c() {
            Log.m105924i(this.f247127d.f247123b, "onDestroy");
            this.f247127d.mo117452a();
        }
    }

    public C84726c2(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        this.f247122a = appBrandRuntime;
        String str = "MicroMsg.AppBrand.SafeScreenShotRecordSwitcher#" + hashCode();
        this.f247123b = str;
        String str2 = appBrandRuntime.f238147j;
        Log.m105924i(str, "<init>, appId: " + str2);
        appBrandRuntime.f238105C.f247244a.add(new C84727a(this));
        C83231l.m102140a(str2, new C84728b(this));
    }

    /* renamed from: a */
    public final boolean mo117452a() {
        Activity R = this.f247122a.mo113026R();
        Window window = R != null ? R.getWindow() : null;
        String str = this.f247123b;
        Log.m105924i(str, "disableSafeScreenShotRecordInner, window: " + window);
        if (window == null) {
            return false;
        }
        window.clearFlags(8192);
        return true;
    }

    /* renamed from: b */
    public final boolean mo117453b() {
        Activity R = this.f247122a.mo113026R();
        Window window = R != null ? R.getWindow() : null;
        String str = this.f247123b;
        Log.m105924i(str, "enableSafeScreenShotRecordInner, window: " + window);
        if (window == null) {
            return false;
        }
        window.addFlags(8192);
        return true;
    }
}
