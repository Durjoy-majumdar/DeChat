package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.os.Bundle;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appcache.C81243g;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandProfileUI;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.protocal.protobuf.AppCommentModule;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import dm0.C86343a;
import java.util.HashMap;
import li0.C88508b;
import li0.C88509c;
import p1044ub.C90630c;
import p963fc.C86812g;
import tj0.C90504b;

/* renamed from: com.tencent.mm.plugin.appbrand.page.r */
public class C83897r {

    /* renamed from: d */
    public static final HashMap<AppBrandRuntime, C83897r> f244954d = new HashMap<>();

    /* renamed from: e */
    public static final C83897r f244955e = new C83898a((AppBrandRuntime) null);

    /* renamed from: a */
    public AppBrandRuntime f244956a;

    /* renamed from: b */
    public String f244957b;

    /* renamed from: c */
    public AppCommentModule f244958c;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.r$e */
    public interface C40516e {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.r$a */
    public class C83898a extends C83897r {

        /* renamed from: com.tencent.mm.plugin.appbrand.page.r$a$a */
        public class C83899a implements Runnable {
            public C83899a(C83898a aVar) {
            }

            public void run() {
            }
        }

        public C83898a(AppBrandRuntime appBrandRuntime) {
            super(appBrandRuntime);
        }

        /* renamed from: a */
        public String mo116478a() {
            return "";
        }

        /* renamed from: b */
        public String mo116479b() {
            return "";
        }

        /* renamed from: c */
        public Runnable mo116480c(C90630c cVar) {
            return new C83899a(this);
        }

        /* renamed from: d */
        public String mo116481d() {
            return null;
        }

        /* renamed from: e */
        public boolean mo116482e() {
            return false;
        }

        /* renamed from: f */
        public C83903f mo116483f(int i) {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.r$b */
    public class C83900b implements C88509c.C88512b {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntime f244959d;

        public C83900b(C83897r rVar, AppBrandRuntime appBrandRuntime) {
            this.f244959d = appBrandRuntime;
        }

        /* renamed from: b */
        public void mo113102b(String str, C88508b bVar) {
            C83897r.f244954d.remove(this.f244959d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.r$c */
    public class C83901c implements Runnable {
        public C83901c(C83897r rVar) {
        }

        public void run() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.r$d */
    public class C83902d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandInitConfigLU f244960d;

        /* renamed from: e */
        public final /* synthetic */ C90630c f244961e;

        /* renamed from: f */
        public final /* synthetic */ AppBrandSysConfigLU f244962f;

        public C83902d(AppBrandInitConfigLU appBrandInitConfigLU, C90630c cVar, AppBrandSysConfigLU appBrandSysConfigLU) {
            this.f244960d = appBrandInitConfigLU;
            this.f244961e = cVar;
            this.f244962f = appBrandSysConfigLU;
        }

        public void run() {
            String str = "";
            String str2 = ((C86812g) C83897r.this.f244956a).mo121253n1() != null ? this.f244960d.f234837q : str;
            new C90504b().mo124672s(this.f244961e.mo116160O0(), C90504b.C90506b.BeforeJumpToProfile, 0);
            C90630c cVar = this.f244961e;
            MMToClientEvent.m100655q(cVar.getAppId(), new C86343a(cVar));
            WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
            bVar.f239557a = this.f244962f.f261062e;
            bVar.f239566j = 3;
            C90630c cVar2 = this.f244961e;
            if (cVar2.f244558J != null) {
                str = cVar2.mo116162Q0();
            }
            bVar.f239567k = str;
            bVar.f239564h = this.f244962f.f261072r.f238585d;
            bVar.f239563g = this.f244962f.f261072r.pkgVersion;
            AppBrandProfileUI.m104016Q7(this.f244961e.getContext(), this.f244960d.f234839s, 3, 1236, str2, true, bVar.mo113977a(), (Bundle) null, ActivityStarterIpcDelegate.m893a(this.f244961e.getContext()), -1);
            C84240s.m103840f(this.f244961e.getAppId(), this.f244961e.mo116162Q0(), 6, "", Util.nowSecond(), 1, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.r$f */
    public static final class C83903f {

        /* renamed from: a */
        public int f244964a;

        /* renamed from: b */
        public int f244965b;

        /* renamed from: c */
        public String f244966c;
    }

    public C83897r(AppBrandRuntime appBrandRuntime) {
        this.f244956a = appBrandRuntime;
        if (appBrandRuntime != null) {
            appBrandRuntime.f238113K.mo122978a(new C83900b(this, appBrandRuntime));
        }
    }

    /* renamed from: a */
    public String mo116478a() {
        return this.f244956a.mo113051d0().f261061d;
    }

    /* renamed from: b */
    public String mo116479b() {
        return C81243g.m99551a(this.f244956a.mo113051d0().f261072r.f238585d);
    }

    /* renamed from: c */
    public Runnable mo116480c(C90630c cVar) {
        C83901c cVar2 = new C83901c(this);
        AppBrandSysConfigLU appBrandSysConfigLU = (AppBrandSysConfigLU) this.f244956a.mo113051d0();
        AppBrandInitConfigLU appBrandInitConfigLU = (AppBrandInitConfigLU) this.f244956a.mo113036W();
        return (appBrandSysConfigLU == null || appBrandInitConfigLU == null) ? cVar2 : new C83902d(appBrandInitConfigLU, cVar, appBrandSysConfigLU);
    }

    /* renamed from: d */
    public String mo116481d() {
        return this.f244956a.mo113051d0().f261063f;
    }

    /* renamed from: e */
    public boolean mo116482e() {
        return this.f244956a.mo113036W().f239368j == 1;
    }

    /* renamed from: f */
    public C83903f mo116483f(int i) {
        if (i == 0) {
            return null;
        }
        C83903f fVar = new C83903f();
        Context context = MMApplicationContext.getContext();
        if (i == 1) {
            fVar.f244966c = context.getString(C0966R.string.a7a);
            fVar.f244965b = C0966R.raw.appbrand_menu_header_lbs;
            fVar.f244964a = C0966R.C0969drawable.f4446cs;
        } else if (i != 2) {
            return null;
        } else {
            fVar.f244966c = context.getString(C0966R.string.a7c);
            fVar.f244965b = C0966R.raw.appbrand_menu_header_record_voice;
            fVar.f244964a = C0966R.C0969drawable.f4447ct;
        }
        return fVar;
    }
}
