package xm0;

import android.content.DialogInterface;
import bp0.C79745a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81821e4;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPreInitTask;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPreInitTask$$e;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gt0.C87325b;
import kr0.C88267e;
import org.json.JSONObject;
import wi0.C90981g;

/* renamed from: xm0.a */
public final class C91284a extends C82268c<C88267e> {
    private static final int CTRL_INDEX = 359;
    public static final String NAME = "updateApp";

    /* renamed from: xm0.a$a */
    public class C91285a implements AppBrandPreInitTask$$e {

        /* renamed from: a */
        public final /* synthetic */ C88267e f261880a;

        /* renamed from: b */
        public final /* synthetic */ int f261881b;

        /* renamed from: xm0.a$a$a */
        public class C91286a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ AppBrandInitConfigWC f261883d;

            /* renamed from: xm0.a$a$a$a */
            public class C91287a implements Runnable {
                public C91287a() {
                }

                public void run() {
                    AppBrandRuntimeWC N0 = C91285a.this.f261880a.getRuntime();
                    AppBrandInitConfigWC appBrandInitConfigWC = C91286a.this.f261883d;
                    C79745a aVar = C79745a.UpdateApp;
                    if (N0 == null || appBrandInitConfigWC == null) {
                        Log.m105920e("MicroMsg.AppBrand.RuntimeRestartHelper", "restart skip with Null runtime");
                    } else {
                        N0.mo113024P0(new C81821e4(N0, aVar, appBrandInitConfigWC));
                    }
                }
            }

            /* renamed from: xm0.a$a$a$b */
            public class C91288b implements DialogInterface.OnClickListener {

                /* renamed from: d */
                public final /* synthetic */ Runnable f261886d;

                public C91288b(C91286a aVar, Runnable runnable) {
                    this.f261886d = runnable;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    this.f261886d.run();
                }
            }

            /* renamed from: xm0.a$a$a$c */
            public class C91289c implements DialogInterface.OnClickListener {
                public C91289c() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    C91285a aVar = C91285a.this;
                    aVar.f261880a.mo109647a(aVar.f261881b, C91284a.this.mo115109j("fail user canceled updateApp"));
                }
            }

            public C91286a(AppBrandInitConfigWC appBrandInitConfigWC) {
                this.f261883d = appBrandInitConfigWC;
            }

            public void run() {
                C91287a aVar = new C91287a();
                if (BuildInfo.CLIENT_VERSION_INT < 654315264 || !C81289m.C81290a.m99664b(C91285a.this.f261880a.getRuntime().f238149o.f239365g)) {
                    C87325b bVar = new C87325b(C91285a.this.f261880a.getContext());
                    bVar.setCanceledOnTouchOutside(false);
                    bVar.setCancelable(false);
                    bVar.mo107533r(C91285a.this.f261880a.getContext().getString(C91285a.this.f261880a.getRuntime().mo121254q1() ? C0966R.string.f7738pv : C0966R.string.f7739pw, new Object[]{C91285a.this.f261880a.getRuntime().mo113210l1().f239363e}));
                    C91288b bVar2 = new C91288b(this, aVar);
                    if (C91285a.this.f261880a.getRuntime().mo113213o1().f261072r.f238585d != 0) {
                        bVar.mo107541v(C0966R.string.f7737pu, bVar2);
                        bVar.mo107534s(C0966R.string.f7735ps, new C91289c());
                    } else {
                        bVar.mo107541v(C0966R.string.f7736pt, bVar2);
                    }
                    C91285a.this.f261880a.getDialogContainer().mo121778b(bVar);
                    return;
                }
                C91285a.this.f261880a.getRuntime().mo113020N0(aVar);
            }
        }

        public C91285a(C88267e eVar, int i) {
            this.f261880a = eVar;
            this.f261881b = i;
        }

        /* renamed from: a */
        public void mo114042a(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
            if (appBrandInitConfigWC == null) {
                this.f261880a.mo109647a(this.f261881b, C91284a.this.mo115109j("fail sync error"));
            } else if (this.f261880a.getRuntime() == null || this.f261880a.getRuntime().f238117P || this.f261880a.getRuntime().mo113064k0()) {
                Log.m105921e("MicroMsg.AppBrand.JsApiUpdateApp", "onResult with newConfig(%s %d %d) but runtime destroyed", appBrandInitConfigWC.f239362d, Integer.valueOf(appBrandInitConfigWC.f239365g), Integer.valueOf(appBrandInitConfigWC.f234802F));
            } else {
                this.f261880a.mo109673t(new C91286a(appBrandInitConfigWC));
            }
        }
    }

    /* renamed from: w */
    public void mo1505u(C88267e eVar, JSONObject jSONObject, int i) {
        LaunchParcel a = C90981g.m114148a(eVar.getRuntime().mo113210l1());
        a.mo115684d();
        AppBrandPreInitTask appBrandPreInitTask = new AppBrandPreInitTask(eVar.getContext(), a, false, new C91285a(eVar, i));
        appBrandPreInitTask.f243144n = true;
        appBrandPreInitTask.mo115494v();
    }
}
