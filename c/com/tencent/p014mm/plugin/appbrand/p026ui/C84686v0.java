package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.C83608m4;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84690v2;
import com.tencent.p014mm.plugin.appbrand.page.C83818i;
import com.tencent.p014mm.plugin.appbrand.page.C83830j;
import com.tencent.p014mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar;
import com.tencent.p014mm.plugin.appbrand.weishi.C84899c;
import com.tencent.p014mm.plugin.appbrand.weishi.C84905f;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import gs0.C87324b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import lg3.C88494d;
import p1042u.C111055b;
import p225rc.C89925n;
import qq0.C89807l;
import wi0.C66117m;
import wi0.C90973a0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.v0 */
public class C84686v0 {

    /* renamed from: a */
    public static final ThreadLocal<Boolean> f247051a = new C84689c();

    /* renamed from: b */
    public static final C111055b<AppBrandRuntime, Bitmap> f247052b = new C111055b<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.v0$a */
    public class C84687a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntimeWC f247053d;

        public C84687a(AppBrandRuntimeWC appBrandRuntimeWC) {
            this.f247053d = appBrandRuntimeWC;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandLoadingSplashFactory$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C83231l.m102146g(this.f247053d.f238147j, C83231l.C83235e.CLOSE);
            this.f247053d.mo113006E();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandLoadingSplashFactory$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.v0$b */
    public class C84688b implements C84690v2.C84698e {

        /* renamed from: a */
        public final /* synthetic */ AppBrandRuntimeWC f247054a;

        public C84688b(AppBrandRuntimeWC appBrandRuntimeWC) {
            this.f247054a = appBrandRuntimeWC;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.v0$c */
    public class C84689c extends ThreadLocal<Boolean> {
        public Object initialValue() {
            boolean z = false;
            if ((!C88494d.m110347c() && C88494d.m110354k()) && !C88494d.m110351h()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static C84560k4 m104332a(Context context, AppBrandRuntimeWC appBrandRuntimeWC) {
        Bitmap remove = f247052b.remove(appBrandRuntimeWC);
        if (remove != null && !remove.isRecycled()) {
            return new C1998j2(context, remove);
        }
        C84537h4 c = m104334c(context, appBrandRuntimeWC.mo113210l1());
        if (c != null) {
            c.setRuntime(appBrandRuntimeWC);
            return c;
        } else if (appBrandRuntimeWC.mo113210l1().mo111304q() == C90973a0.TRANSPARENT) {
            return new C84535h3(m104333b(context));
        } else {
            if ("wxb1320569c2a2b6d2".equals(appBrandRuntimeWC.f238147j) && 1190 == appBrandRuntimeWC.mo113208k1()) {
                return new C84535h3(m104333b(context));
            }
            if (C84905f.m104620a(appBrandRuntimeWC)) {
                return new C84899c(m104333b(context), appBrandRuntimeWC);
            }
            if (C84583r2.m104183g(appBrandRuntimeWC) || C83608m4.m102642a(appBrandRuntimeWC) || appBrandRuntimeWC.mo113067m0()) {
                C84706x0 d0Var = appBrandRuntimeWC.mo121254q1() ? new C84520d0(m104333b(context), appBrandRuntimeWC, appBrandRuntimeWC.mo113210l1().f234804H) : new C84706x0(m104333b(context), appBrandRuntimeWC, appBrandRuntimeWC.mo113210l1().f234804H);
                if (appBrandRuntimeWC.mo113067m0()) {
                    HalfScreenConfig halfScreenConfig = appBrandRuntimeWC.mo113210l1().f234815R0;
                    if (halfScreenConfig.f157954q == HalfScreenConfig.C55456f.NORMAL) {
                        C84690v2 d = m104335d(context, appBrandRuntimeWC, halfScreenConfig.mo76930b());
                        BaseAppBrandSingleCloseCapsuleBar a = C89807l.f258213a.mo124096a(appBrandRuntimeWC, m104333b(context), true);
                        HalfScreenConfig.CustomSubjectInfo customSubjectInfo = halfScreenConfig.f157934E;
                        if (customSubjectInfo != HalfScreenConfig.CustomSubjectInfo.f157973f) {
                            a.setTitle(customSubjectInfo.f157974d);
                            a.setWxaIconUrl(customSubjectInfo.f157975e);
                            d.mo1912q(customSubjectInfo.f157975e, customSubjectInfo.f157974d);
                        } else {
                            a.setTitle(appBrandRuntimeWC.mo113210l1().f239363e);
                            a.setWxaIconUrl(appBrandRuntimeWC.mo113210l1().f239364f);
                        }
                        a.setCloseBtnListener(new C84687a(appBrandRuntimeWC));
                        if (halfScreenConfig.f157932C != HalfScreenConfig.C55455e.EMBED) {
                            d.setActionBar(a);
                        } else {
                            View findViewById = d.f247056B.findViewById(C0966R.C0970id.f6024v6);
                            if (findViewById != null) {
                                d.f247056B.removeView(findViewById);
                            }
                        }
                        d.mo122166H(true);
                        return d;
                    }
                    d0Var.setBackButtonVisibility(halfScreenConfig.f157930A);
                    d0Var.mo122166H(true);
                }
                return d0Var;
            } else if (appBrandRuntimeWC.mo121254q1()) {
                C84552k0 k0Var = new C84552k0(m104333b(context), appBrandRuntimeWC);
                return appBrandRuntimeWC.mo113038X() ? new C84518d(m104333b(context), appBrandRuntimeWC, k0Var, appBrandRuntimeWC.f238294v1) : k0Var;
            } else {
                C84690v2 d2 = m104335d(context, appBrandRuntimeWC, appBrandRuntimeWC.mo113210l1().f239372B1);
                d2.setLabelInjector(new C84688b(appBrandRuntimeWC));
                return appBrandRuntimeWC.mo113038X() ? new C84518d(m104333b(context), appBrandRuntimeWC, d2, appBrandRuntimeWC.f238294v1) : d2;
            }
        }
    }

    /* renamed from: b */
    public static Context m104333b(Context context) {
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        return MMApplicationContext.isMainProcess() ? false : f247051a.get().booleanValue() ? C83830j.m103116a(context) : context;
    }

    /* renamed from: c */
    public static C84537h4 m104334c(Context context, AppBrandInitConfigWC appBrandInitConfigWC) {
        if (appBrandInitConfigWC.mo111304q() == C90973a0.TRANSPARENT || !appBrandInitConfigWC.f239373d1 || !TextUtils.isEmpty(C89925n.m112488a(appBrandInitConfigWC.f239367i))) {
            return null;
        }
        if (!C87324b.f253068f.mo58669a()) {
            Log.m105925i("MicroMsg.AppBrandLoadingSplashFactory", "createSnapshotDisplayLoadingSplash but switch off, appId:%s", appBrandInitConfigWC.f239362d);
            return null;
        }
        String str = appBrandInitConfigWC.f239385p1;
        if (C86013q1.m106450k(str)) {
            Log.m105925i("MicroMsg.AppBrandLoadingSplashFactory", "createScreenshotSplash with appId:%s, path:%s", appBrandInitConfigWC.f239362d, str);
            Bitmap decodeFile = BitmapUtil.decodeFile(str);
            if (decodeFile != null && !decodeFile.isRecycled()) {
                return new C84537h4(context, decodeFile);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static C84690v2 m104335d(Context context, AppBrandRuntimeWC appBrandRuntimeWC, C66117m mVar) {
        C83818i K1 = appBrandRuntimeWC.mo113028S();
        Class<C84690v2> cls = C84690v2.class;
        K1.getClass();
        C83818i.C83819a aVar = K1.f244674c;
        Context context2 = context == null ? MMApplicationContext.getContext() : context;
        C87412m.m108593f(context2, "ctx ?: MMApplicationContext.getContext()");
        C84690v2 v2Var = (C84690v2) aVar.mo116282a(cls, K1.mo116280c(context2, cls));
        if (v2Var != null) {
            C68651k2.m80887a(v2Var.f247068y, v2Var.f247055A, v2Var.f247069z);
            v2Var.setTheme(mVar);
            v2Var.mo117408Y(appBrandRuntimeWC);
            return v2Var;
        }
        C84690v2 v2Var2 = new C84690v2(m104333b(context), appBrandRuntimeWC);
        v2Var2.setTheme(mVar);
        return v2Var2;
    }
}
