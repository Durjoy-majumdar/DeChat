package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jp2.C98961m;
import lo2.C99525b0;
import lo2.C99552l;
import qs2.C101256b;
import qs2.C101271i0;
import vr2.C102239c;
import vr2.C102259p;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u */
public class C95217u extends C95108i0 {

    /* renamed from: M */
    public static C95219b f276299M;

    /* renamed from: N */
    public static Runnable f276300N = new C95218a();

    /* renamed from: B */
    public C101256b f276301B;

    /* renamed from: C */
    public String f276302C;

    /* renamed from: D */
    public boolean f276303D;

    /* renamed from: E */
    public String f276304E;

    /* renamed from: F */
    public String f276305F;

    /* renamed from: G */
    public String f276306G;

    /* renamed from: H */
    public String f276307H;

    /* renamed from: I */
    public String f276308I;

    /* renamed from: J */
    public String f276309J;

    /* renamed from: K */
    public int f276310K;

    /* renamed from: L */
    public C95220c f276311L;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u$a */
    public class C95218a implements Runnable {
        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$2");
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            synchronized (C95217u.class) {
                SnsMethodCalculate.markStartTimeMs("unregisterPkgReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                try {
                    if (C95217u.f276299M != null) {
                        MMApplicationContext.getContext().unregisterReceiver(C95217u.f276299M);
                        C95217u.f276299M = null;
                        Log.m105924i("MicroMsg.AdLandingPageAppMarketBtnComp", "the broadcast receiver unregister");
                    }
                } catch (Throwable unused) {
                    Log.m105928w("MicroMsg.AdLandingPageAppMarketBtnComp", "unregister broadcast receiver failed");
                }
                SnsMethodCalculate.markEndTimeMs("unregisterPkgReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            }
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u$b */
    public static class C95219b extends BroadcastReceiver {

        /* renamed from: a */
        public final List<WeakReference<C95217u>> f276312a = new LinkedList();

        /* renamed from: b */
        public final Map<String, C101271i0> f276313b = new ConcurrentHashMap();

        /* renamed from: c */
        public final Map<String, C95220c> f276314c = new ConcurrentHashMap();

        public C95219b(C95215t tVar) {
        }

        /* renamed from: a */
        public final synchronized void mo131720a(C95217u uVar) {
            SnsMethodCalculate.markStartTimeMs("add", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
            for (WeakReference<C95217u> weakReference : this.f276312a) {
                if (weakReference.get() == uVar) {
                    Log.m105918d("MicroMsg.AdLandingPageAppMarketBtnComp", "refs contains the btn comp");
                    SnsMethodCalculate.markEndTimeMs("add", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
                    return;
                }
            }
            ((LinkedList) this.f276312a).add(new WeakReference(uVar));
            ((ConcurrentHashMap) this.f276313b).put(C95217u.m121169b0(uVar), uVar.mo131854m());
            SnsMethodCalculate.markEndTimeMs("add", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        }

        /* renamed from: b */
        public void mo131721b(C95217u uVar) {
            SnsMethodCalculate.markStartTimeMs("addMarketBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
            if (uVar == null || TextUtils.isEmpty(C95217u.m121169b0(uVar))) {
                Log.m105928w("MicroMsg.AdLandingPageAppMarketBtnComp", "the btn comp is null or target apk pkg is empty");
                SnsMethodCalculate.markEndTimeMs("addMarketBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
                return;
            }
            try {
                mo131722c();
                mo131720a(uVar);
            } catch (Throwable unused) {
                Log.m105928w("MicroMsg.AdLandingPageAppMarketBtnComp", "add market btn has some error");
            }
            SnsMethodCalculate.markEndTimeMs("addMarketBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        }

        /* renamed from: c */
        public final synchronized void mo131722c() {
            SnsMethodCalculate.markStartTimeMs("cleanNullRef", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
            Iterator<WeakReference<C95217u>> it = this.f276312a.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                if (next == null || next.get() == null) {
                    it.remove();
                }
            }
            SnsMethodCalculate.markEndTimeMs("cleanNullRef", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        }

        /* renamed from: d */
        public final String mo131723d(Intent intent) {
            SnsMethodCalculate.markStartTimeMs("getAppPackage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
            try {
                String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                SnsMethodCalculate.markEndTimeMs("getAppPackage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
                return schemeSpecificPart;
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.AdLandingPageAppMarketBtnComp", "getAppPackage, exp=" + th.toString());
                SnsMethodCalculate.markEndTimeMs("getAppPackage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
                return "";
            }
        }

        /* renamed from: e */
        public final void mo131724e(Context context, Intent intent) {
            SnsMethodCalculate.markStartTimeMs("onPackageAdd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
            String d = mo131723d(intent);
            Log.m105924i("MicroMsg.AdLandingPageAppMarketBtnComp", "onPackageAdd, pkg=" + d);
            if (TextUtils.isEmpty(d)) {
                SnsMethodCalculate.markEndTimeMs("onPackageAdd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
                return;
            }
            mo131726g(d, true, context.getString(C0966R.string.j_4));
            SnsMethodCalculate.markStartTimeMs("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
            try {
                C101271i0 i0Var = (C101271i0) ((ConcurrentHashMap) this.f276313b).get(d);
                if (i0Var != null) {
                    C95217u.m121172h0(i0Var, 3, "0", "");
                    C102239c cVar = new C102239c(i0Var.mo140745l(), i0Var.mo140737d(), i0Var.mo140742i(), i0Var.mo140734a(), i0Var.mo140735b(), i0Var.mo140743j(), i0Var.mo140746m());
                    if (!Util.isNullOrNil(d)) {
                        C95220c cVar2 = (C95220c) ((ConcurrentHashMap) this.f276314c).get(d);
                        if (cVar2 != null) {
                            SnsMethodCalculate.markStartTimeMs("setCostTime", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                            cVar.f301056h = (int) (System.currentTimeMillis() - cVar2.f276315a);
                            SnsMethodCalculate.markEndTimeMs("setCostTime", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                        }
                        C99552l.m129928d(cVar, 3);
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.AdLandingPageAppMarketBtnComp", "report error, exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
            C115669n.INSTANCE.mo175911u(1958, 3);
            SnsMethodCalculate.markEndTimeMs("onPackageAdd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        }

        /* renamed from: f */
        public final void mo131725f(Context context, Intent intent) {
            SnsMethodCalculate.markStartTimeMs("onPackageRemove", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
            String d = mo131723d(intent);
            Log.m105924i("MicroMsg.AdLandingPageAppMarketBtnComp", "onPackageRemove, pkg=" + d);
            if (TextUtils.isEmpty(d)) {
                SnsMethodCalculate.markEndTimeMs("onPackageRemove", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
                return;
            }
            mo131726g(d, false, "");
            SnsMethodCalculate.markEndTimeMs("onPackageRemove", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        }

        /* renamed from: g */
        public final synchronized void mo131726g(String str, boolean z, String str2) {
            SnsMethodCalculate.markStartTimeMs("setAppMarketBtnCmpText", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
            for (WeakReference next : this.f276312a) {
                if (!(next == null || next.get() == null)) {
                    C95217u uVar = (C95217u) next.get();
                    if (str.equals(C95217u.m121169b0(uVar))) {
                        SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                        uVar.f276303D = z;
                        SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                        if (!z) {
                            String str3 = C95217u.m121170c0(uVar).f296714z;
                            SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                            uVar.mo131717i0(str3);
                            SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                        } else if (Util.isNullOrNil(C95217u.m121170c0(uVar).f296520A0)) {
                            SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                            uVar.mo131717i0(str2);
                            SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                        } else {
                            String str4 = C95217u.m121170c0(uVar).f296520A0;
                            SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                            uVar.mo131717i0(str4);
                            SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                        }
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("setAppMarketBtnCmpText", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        }

        public void onReceive(Context context, Intent intent) {
            SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
            if (intent != null) {
                try {
                    String action = intent.getAction();
                    if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                        mo131724e(context, intent);
                    } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                        mo131725f(context, intent);
                    }
                } catch (Throwable unused) {
                    Log.m105920e("MicroMsg.AdLandingPageAppMarketBtnComp", "there is a exception in receiver");
                }
            }
            SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u$c */
    public static class C95220c {

        /* renamed from: a */
        public long f276315a;
    }

    public C95217u(Context context, C101256b bVar, ViewGroup viewGroup) {
        super(context, bVar, viewGroup);
        String str;
        boolean z;
        int i;
        this.f276301B = bVar;
        SnsMethodCalculate.markStartTimeMs("obtainTargetApkPkg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        if (bVar != null) {
            Intent intent = bVar.f296547z0;
            str = intent != null ? intent.getStringExtra("target_app_id") : "";
            if (TextUtils.isEmpty(str)) {
                str = bVar.f296529h0;
            }
        } else {
            str = "";
        }
        SnsMethodCalculate.markEndTimeMs("obtainTargetApkPkg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        this.f276302C = str;
        SnsMethodCalculate.markStartTimeMs("isApkInstalled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        try {
            z = AdLandingPagesProxy.getInstance().isPkgInstalled(str);
            SnsMethodCalculate.markEndTimeMs("isApkInstalled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        } catch (Throwable unused) {
            Log.m105928w("MicroMsg.AdLandingPageAppMarketBtnComp", "isApkInstalled occur something wrong!");
            SnsMethodCalculate.markEndTimeMs("isApkInstalled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            z = false;
        }
        this.f276303D = z;
        SnsMethodCalculate.markStartTimeMs("getMarketPriority", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        try {
            i = IntentUtil.getIntExtra(this.f276301B.f296547z0, "market_priority", 1);
            SnsMethodCalculate.markEndTimeMs("getMarketPriority", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        } catch (Throwable unused2) {
            Log.m105920e("MicroMsg.AdLandingPageAppMarketBtnComp", "getMarketPriority has something wrong");
            SnsMethodCalculate.markEndTimeMs("getMarketPriority", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            i = 0;
        }
        Log.m105924i("MicroMsg.AdLandingPageAppMarketBtnComp", "init, pkg=" + this.f276302C + ", priority=" + i + ", IsInstalled=" + this.f276303D);
        if (i == 3) {
            mo131716g0(4, 1, "");
        } else {
            mo131716g0(4, 0, "");
        }
        mo131716g0(1, 0, "");
        try {
            this.f276304E = Util.nullAsNil(mo131854m().mo140745l());
            this.f276305F = Util.nullAsNil(mo131854m().mo140734a());
            this.f276306G = Util.nullAsNil(mo131854m().mo140735b());
            this.f276307H = Util.nullAsNil(mo131854m().mo140746m());
            this.f276310K = mo131854m().mo140742i();
            this.f276308I = Util.nullAsNil(mo131854m().mo140743j());
            this.f276309J = Util.nullAsNil(mo131854m().mo140737d());
            this.f276311L = new C95220c();
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.AdLandingPageAppMarketBtnComp", th.toString());
        }
    }

    /* renamed from: b0 */
    public static /* synthetic */ String m121169b0(C95217u uVar) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        String str = uVar.f276302C;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        return str;
    }

    /* renamed from: c0 */
    public static /* synthetic */ C101256b m121170c0(C95217u uVar) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        C101256b bVar = uVar.f276301B;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        return bVar;
    }

    /* renamed from: e0 */
    public static synchronized void m121171e0() {
        synchronized (C95217u.class) {
            SnsMethodCalculate.markStartTimeMs("registerPkgReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            try {
                if (f276299M == null) {
                    f276299M = new C95219b((C95215t) null);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addDataScheme("package");
                    MMApplicationContext.getContext().registerReceiver(f276299M, intentFilter);
                    Log.m105924i("MicroMsg.AdLandingPageAppMarketBtnComp", "the broadcast receiver register");
                }
            } catch (Throwable unused) {
                Log.m105928w("MicroMsg.AdLandingPageAppMarketBtnComp", "register broadcast receiver failed");
            }
            SnsMethodCalculate.markEndTimeMs("registerPkgReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        }
    }

    /* renamed from: h0 */
    public static void m121172h0(C101271i0 i0Var, int i, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        try {
            String nullAsNil = Util.nullAsNil(i0Var.mo140741h());
            String a = C102259p.m134828a(i0Var.mo140745l());
            String nullAsNil2 = Util.nullAsNil(i0Var.mo140734a());
            C115669n.INSTANCE.mo160131h(19790, nullAsNil, a, nullAsNil2, Integer.valueOf(i), str, str2);
            Log.m105924i("MicroMsg.AdLandingPageAppMarketBtnComp", "report19790 snsId=" + nullAsNil + ", uxInfo=" + a + ", adExtInfo =" + nullAsNil2 + ", actType =" + i + ", actValue = " + str + ", extInfo = " + str2);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.AdLandingPageAppMarketBtnComp", "report19790 exp:" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        super.mo124360B();
        try {
            Log.m105924i("MicroMsg.AdLandingPageAppMarketBtnComp", "viewWillAppear is called");
            MMHandlerThread.removeRunnable(f276300N);
            m121171e0();
            C95219b bVar = f276299M;
            if (bVar != null) {
                bVar.mo131721b(this);
            }
        } catch (Throwable unused) {
            Log.m105920e("MicroMsg.AdLandingPageAppMarketBtnComp", "processor registerPkgReceiver error");
        }
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        super.mo67235C();
        try {
            Log.m105924i("MicroMsg.AdLandingPageAppMarketBtnComp", "viewWillDestroy is called");
            Runnable runnable = f276300N;
            MMHandlerThread.removeRunnable(runnable);
            MMHandlerThread.postToMainThreadDelayed(runnable, 300000);
            C115669n.INSTANCE.mo175913w(1958, 5, (long) mo131851j());
        } catch (Throwable unused) {
            Log.m105920e("MicroMsg.AdLandingPageAppMarketBtnComp", "remove mProcessorForUnregisterPkgReceiver error");
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
    }

    /* renamed from: K */
    public void mo130177K() {
        String str;
        int i;
        SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        if (this.f276303D) {
            SnsMethodCalculate.markStartTimeMs("startTargetAppActivity", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            Context context = this.f276579d;
            try {
                String nullAs = Util.nullAs(this.f276302C, "");
                String nullAs2 = Util.nullAs(this.f276301B.f296542u0, "");
                String nullAs3 = Util.nullAs(this.f276301B.f296528g0, "");
                String nullAs4 = Util.nullAs(this.f276301B.f296523b0, "");
                C101271i0 m = mo131854m();
                str = "doBtnClick";
                try {
                    C98961m mVar = new C98961m(this.f276309J, this.f276310K, this.f276306G, this.f276308I, this.f276307H);
                    Log.m105924i("MicroMsg.AdLandingPageAppMarketBtnComp", "startTargetAppActivity, pkg=" + nullAs + ", appId=" + nullAs4 + ", appName=" + nullAs3 + ", pageUrl=" + nullAs2);
                    C102260r.m134849R(context, nullAs4, nullAs, nullAs3, nullAs2, m.mo140745l(), m.mo140734a(), m.mo140741h(), 1, 2, mVar);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
                str = "doBtnClick";
                Log.m105920e("MicroMsg.AdLandingPageAppMarketBtnComp", "startTargetAppActivity, exp=" + th.toString());
                SnsMethodCalculate.markEndTimeMs("startTargetAppActivity", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                C115669n.INSTANCE.mo175911u(1958, 4);
                SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            }
            SnsMethodCalculate.markEndTimeMs("startTargetAppActivity", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            C115669n.INSTANCE.mo175911u(1958, 4);
        } else {
            str = "doBtnClick";
            SnsMethodCalculate.markStartTimeMs("startMarketActivity", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            Intent intent = this.f276301B.f296547z0;
            Context context2 = this.f276579d;
            try {
                if (!(context2 instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                String nullAs5 = Util.nullAs(IntentUtil.getStringExtra(intent, "market_app_name"), "");
                C102239c cVar = new C102239c(this.f276304E, this.f276309J, this.f276310K, this.f276305F, this.f276306G, this.f276308I, this.f276307H);
                C99552l.m129930f(cVar, 3);
                Log.m105924i("MicroMsg.AdLandingPageAppMarketBtnComp", "startMarketActivity, appName=" + nullAs5 + ", marketIntent=" + intent);
                C95198o2.m121131c(context2, intent.getPackage(), "", intent, nullAs5, new C95215t(this, cVar), 2);
                i = 1;
            } catch (Throwable th5) {
                Log.m105920e("MicroMsg.AdLandingPageAppMarketBtnComp", "onLaunchApp, exp=" + th5.toString());
                i = 1;
                mo131716g0(2, 1, "");
            }
            SnsMethodCalculate.markEndTimeMs("startMarketActivity", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            C115669n.INSTANCE.mo175911u(1958, i);
        }
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
    }

    /* renamed from: d0 */
    public final void mo131715d0() {
        SnsMethodCalculate.markStartTimeMs("configDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        SnsMethodCalculate.markStartTimeMs("presetDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        HashMap hashMap = new HashMap();
        hashMap.put("fontNormalColor", mo131718k0(this.f276301B.f296539r0, "#FFFFFF"));
        hashMap.put("fontDisableColor", mo131718k0(this.f276301B.f296540s0, "#4CFFFFFF"));
        hashMap.put("fontPressedColor", mo131718k0(this.f276301B.f296541t0, "#99FFFFFF"));
        hashMap.put("NormalColor", mo131718k0(this.f276301B.f296533l0, "#1AAD19"));
        hashMap.put("PressedColor", mo131718k0(this.f276301B.f296535n0, "#179B16"));
        hashMap.put("DisableColor", mo131718k0(this.f276301B.f296534m0, "#661AAD19"));
        hashMap.put("borderNormalColor", mo131718k0(this.f276301B.f296536o0, "#179E16"));
        hashMap.put("borderPressedColor", mo131718k0(this.f276301B.f296538q0, "#158E14"));
        hashMap.put("borderDisableColor", mo131718k0(this.f276301B.f296537p0, "#00179E16"));
        SnsMethodCalculate.markEndTimeMs("presetDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        int parseColor = Color.parseColor((String) hashMap.get("fontNormalColor"));
        int parseColor2 = Color.parseColor((String) hashMap.get("fontDisableColor"));
        int parseColor3 = Color.parseColor((String) hashMap.get("fontPressedColor"));
        int parseColor4 = Color.parseColor((String) hashMap.get("NormalColor"));
        int parseColor5 = Color.parseColor((String) hashMap.get("PressedColor"));
        int parseColor6 = Color.parseColor((String) hashMap.get("DisableColor"));
        int i = (int) mo131626O().f296693E;
        int parseColor7 = Color.parseColor((String) hashMap.get("borderNormalColor"));
        int parseColor8 = Color.parseColor((String) hashMap.get("borderPressedColor"));
        int parseColor9 = Color.parseColor((String) hashMap.get("borderDisableColor"));
        int dimensionPixelSize = this.f276579d.getResources().getDimensionPixelSize(C0966R.dimen.f3642a0);
        if (mo131626O().f296706R > 0.0f) {
            dimensionPixelSize = (int) mo131626O().f296706R;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float f = (float) dimensionPixelSize;
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(parseColor6);
        gradientDrawable.setStroke(i, parseColor9);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(f);
        gradientDrawable2.setColor(parseColor5);
        gradientDrawable2.setStroke(i, parseColor8);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(f);
        gradientDrawable3.setColor(parseColor4);
        gradientDrawable3.setStroke(i, parseColor7);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, gradientDrawable);
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(new int[]{16842910}, gradientDrawable3);
        this.f276027v.setBackground(stateListDrawable);
        int[] iArr = {parseColor2, parseColor3, parseColor};
        this.f276027v.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{16842919}, new int[]{16842910}}, iArr));
        float f2 = this.f276301B.f296692D;
        if (f2 > 0.0f) {
            this.f276027v.setTextSize(0, f2);
        }
        SnsMethodCalculate.markEndTimeMs("configDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        super.mo67238e();
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        try {
            super.mo67240g();
            mo131715d0();
            if (this.f276303D) {
                if (Util.isNullOrNil(this.f276301B.f296520A0)) {
                    SnsMethodCalculate.markStartTimeMs("setBtnText", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                    Button button = this.f276027v;
                    if (button != null) {
                        button.setText(C0966R.string.j_4);
                        C99525b0.m129881d(this.f276579d, mo131626O(), this.f276027v);
                    }
                    SnsMethodCalculate.markEndTimeMs("setBtnText", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                } else {
                    mo131717i0(this.f276301B.f296520A0);
                }
            }
        } catch (Throwable unused) {
            Log.m105928w("MicroMsg.AdLandingPageAppMarketBtnComp", "fill item data occur something wrong!");
        }
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
    }

    /* renamed from: g0 */
    public final void mo131716g0(int i, int i2, String str) {
        SnsMethodCalculate.markStartTimeMs("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        try {
            m121172h0(mo131854m(), i, String.valueOf(i2), str);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.AdLandingPageAppMarketBtnComp", "report19790 exp:" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
    }

    /* renamed from: i0 */
    public final void mo131717i0(String str) {
        SnsMethodCalculate.markStartTimeMs("setBtnText", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        Button button = this.f276027v;
        if (button != null) {
            button.setText(str);
            C99525b0.m129881d(this.f276579d, mo131626O(), this.f276027v);
        }
        SnsMethodCalculate.markEndTimeMs("setBtnText", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
    }

    /* renamed from: k0 */
    public final String mo131718k0(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("validColorDefaultAs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("validColorDefaultAs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            return str2;
        }
        if (!str.matches("#[0-9A-Fa-f]{6}([0-9A-Fa-f]{2})?")) {
            str = str2;
        }
        SnsMethodCalculate.markEndTimeMs("validColorDefaultAs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        return str;
    }
}
