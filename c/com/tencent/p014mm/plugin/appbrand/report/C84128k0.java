package com.tencent.p014mm.plugin.appbrand.report;

import android.os.PersistableBundle;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110823p;
import u24.C90599h;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.report.k0 */
public final class C84128k0 {

    /* renamed from: a */
    public static final C84128k0 f245602a = new C84128k0();

    /* renamed from: b */
    public static final C13601g f245603b = C36568h.m40985a(C84129a.f245605d);

    /* renamed from: c */
    public static final Integer[] f245604c = {1084, 1046, 1045};

    /* renamed from: com.tencent.mm.plugin.appbrand.report.k0$a */
    public static final class C84129a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C84129a f245605d = new C84129a();

        public C84129a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("MicroMsg.WeAppLaunchOpenSdkAdTracer", 2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.k0$b */
    public static final class C84130b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f245606d;

        /* renamed from: e */
        public final /* synthetic */ AppBrandInitConfigWC f245607e;

        public C84130b(String str, AppBrandInitConfigWC appBrandInitConfigWC) {
            this.f245606d = str;
            this.f245607e = appBrandInitConfigWC;
        }

        public final void run() {
            C84128k0 k0Var = C84128k0.f245602a;
            MultiProcessMMKV a = C84128k0.m103667a(k0Var);
            String str = this.f245606d;
            String str2 = null;
            String decodeString = a.decodeString(str, (String) null);
            if (decodeString != null) {
                a.removeValueForKey(str);
                str2 = decodeString;
            }
            if (!(str2 == null || str2.length() == 0)) {
                String h = C90599h.m113515h(new String[]{str2, this.f245607e.f234837q, this.f245606d, "2"}, ",");
                C87412m.m108593f(h, "join(arrayOf(\n          …                  ), \",\")");
                C84128k0.m103668b(k0Var, h);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.k0$c */
    public static final class C84131c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f245608d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<String> f245609e;

        public C84131c(String str, C8479f0<String> f0Var) {
            this.f245608d = str;
            this.f245609e = f0Var;
        }

        public final void run() {
            C84128k0 k0Var = C84128k0.f245602a;
            C84128k0.m103667a(k0Var).encode(this.f245608d, (String) this.f245609e.f27484d);
            String h = C90599h.m113515h(new String[]{(String) this.f245609e.f27484d, "", this.f245608d, "1"}, ",");
            C87412m.m108593f(h, "join(arrayOf(\n          …                  ), \",\")");
            C84128k0.m103668b(k0Var, h);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.k0$d */
    public static final class C84132d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f245610d;

        /* renamed from: e */
        public final /* synthetic */ AppBrandInitConfigWC f245611e;

        public C84132d(String str, AppBrandInitConfigWC appBrandInitConfigWC) {
            this.f245610d = str;
            this.f245611e = appBrandInitConfigWC;
        }

        public final void run() {
            C84128k0 k0Var = C84128k0.f245602a;
            MultiProcessMMKV a = C84128k0.m103667a(k0Var);
            String str = this.f245610d;
            String str2 = null;
            String decodeString = a.decodeString(str, (String) null);
            if (decodeString != null) {
                a.removeValueForKey(str);
                str2 = decodeString;
            }
            if (!(str2 == null || str2.length() == 0)) {
                String h = C90599h.m113515h(new String[]{str2, this.f245611e.f234837q, this.f245610d, "3"}, ",");
                C87412m.m108593f(h, "join(arrayOf(\n          …                  ), \",\")");
                C84128k0.m103668b(k0Var, h);
            }
        }
    }

    /* renamed from: a */
    public static final MultiProcessMMKV m103667a(C84128k0 k0Var) {
        k0Var.getClass();
        Object value = ((C36570n) f245603b).getValue();
        C87412m.m108593f(value, "<get-mMapInstanceId2TraceKey>(...)");
        return (MultiProcessMMKV) value;
    }

    /* renamed from: b */
    public static final void m103668b(C84128k0 k0Var, String str) {
        k0Var.getClass();
        Log.m105924i("MicroMsg.WeAppLaunchOpenSdkAdTracer", "reportKV key[18460] value[" + str + ']');
        C115669n.INSTANCE.kvStat(18460, str);
    }

    /* renamed from: c */
    public final void mo116793c(AppBrandInitConfigWC appBrandInitConfigWC) {
        C87412m.m108594g(appBrandInitConfigWC, "initConfig");
        QualitySession qualitySession = appBrandInitConfigWC.f239379j1;
        String str = qualitySession != null ? qualitySession.f245832d : null;
        if (!(str == null || str.length() == 0)) {
            ((C119157j) C119157j.f356862d).mo183876g(new C84130b(str, appBrandInitConfigWC), "MicroMsg.WeAppLaunchOpenSdkAdTracer");
        }
    }

    /* renamed from: d */
    public final void mo116794d(LaunchParcel launchParcel, String str) {
        C87412m.m108594g(launchParcel, "parcel");
        C87412m.m108594g(str, "instanceId");
        T t = null;
        if (launchParcel.f243739p == null) {
            Integer[] numArr = f245604c;
            AppBrandStatObject appBrandStatObject = launchParcel.f243738o;
            if (!C110823p.m151009y(numArr, appBrandStatObject != null ? Integer.valueOf(appBrandStatObject.f245533f) : null)) {
                return;
            }
        }
        C8479f0 f0Var = new C8479f0();
        PersistableBundle persistableBundle = launchParcel.f243709A;
        T string = persistableBundle != null ? persistableBundle.getString("KEY_OPENSDK_AD_TRACE_KEY") : null;
        f0Var.f27484d = string;
        CharSequence charSequence = (CharSequence) string;
        boolean z = false;
        if (charSequence == null || charSequence.length() == 0) {
            PersistableBundle persistableBundle2 = launchParcel.f243744u;
            if (persistableBundle2 != null) {
                t = persistableBundle2.getString("adUxInfo");
            }
            f0Var.f27484d = t;
        }
        CharSequence charSequence2 = (CharSequence) f0Var.f27484d;
        if (charSequence2 == null || charSequence2.length() == 0) {
            z = true;
        }
        if (!z) {
            ((C119157j) C119157j.f356862d).mo183876g(new C84131c(str, f0Var), "MicroMsg.WeAppLaunchOpenSdkAdTracer");
        }
    }

    /* renamed from: e */
    public final void mo116795e(AppBrandInitConfigWC appBrandInitConfigWC) {
        C87412m.m108594g(appBrandInitConfigWC, "initConfig");
        QualitySession qualitySession = appBrandInitConfigWC.f239379j1;
        String str = qualitySession != null ? qualitySession.f245832d : null;
        if (!(str == null || str.length() == 0)) {
            ((C119157j) C119157j.f356862d).mo183876g(new C84132d(str, appBrandInitConfigWC), "MicroMsg.WeAppLaunchOpenSdkAdTracer");
        }
    }
}
