package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.os.ResultReceiver;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AppBrandHalfScreenCloseAnimationSettingEvent;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWCAccessible;
import com.tencent.p014mm.plugin.appbrand.C83607m3;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83594m;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.utils.C84788u;
import com.tencent.p014mm.plugin.appbrand.weishi.C84905f;
import com.tencent.p014mm.plugin.appbrand.widget.C84933h;
import com.tencent.p014mm.plugin.appbrand.widget.C85007k;
import com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import it0.C76373e;
import l31.C61212e;
import nj3.C88989a;
import nj3.C88990b;
import o31.C11345b;
import o31.C76986a;
import rx3.C13598b0;
import wi0.C91003z;
import ym0.C91516n;

@C88989a(1)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI */
public class AppBrandPluginUI extends AppBrandUI {

    /* renamed from: R */
    public int f246394R = -1;

    /* renamed from: S */
    public int f246395S = -1;

    /* renamed from: T */
    public IListener<AppBrandHalfScreenCloseAnimationSettingEvent> f246396T;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI$a */
    public class C84437a implements C83607m3 {
        public C84437a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI$b */
    public class C84438b extends AnimatorListenerAdapter {
        public C84438b() {
        }

        public void onAnimationEnd(Animator animator) {
            WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener;
            ResultReceiver resultReceiver;
            super.onAnimationEnd(animator);
            AppBrandInitConfigWC Y7 = AppBrandPluginUI.this.mo117109Y7();
            HalfScreenConfig halfScreenConfig = Y7 == null ? null : Y7.f234815R0;
            if (!(halfScreenConfig == null || (weAppHalfScreenStatusChangeListener = halfScreenConfig.f157953p) == null || (resultReceiver = weAppHalfScreenStatusChangeListener.f239428e) == null)) {
                Bundle bundle = new Bundle();
                bundle.putInt("action", 3);
                bundle.putBoolean("isAnimationBegin", false);
                C13598b0 b0Var = C13598b0.f38549a;
                resultReceiver.send(0, bundle);
            }
            AppBrandPluginUI.super.finish();
        }

        public void onAnimationStart(Animator animator) {
            WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener;
            ResultReceiver resultReceiver;
            super.onAnimationStart(animator);
            AppBrandInitConfigWC Y7 = AppBrandPluginUI.this.mo117109Y7();
            HalfScreenConfig halfScreenConfig = Y7 == null ? null : Y7.f234815R0;
            if (halfScreenConfig != null && (weAppHalfScreenStatusChangeListener = halfScreenConfig.f157953p) != null && (resultReceiver = weAppHalfScreenStatusChangeListener.f239428e) != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("action", 3);
                bundle.putBoolean("isAnimationBegin", true);
                C13598b0 b0Var = C13598b0.f38549a;
                resultReceiver.send(0, bundle);
            }
        }
    }

    /* renamed from: c8 */
    public void mo117071c8(AppBrandInitConfigWC appBrandInitConfigWC) {
        int i;
        C84583r2 r2Var = C84583r2.INSTANCE;
        HalfScreenConfig halfScreenConfig = appBrandInitConfigWC == null ? null : appBrandInitConfigWC.f234815R0;
        if (halfScreenConfig != null && halfScreenConfig.mo76931c()) {
            int i2 = this.f246394R;
            if (i2 != -1 && (i = this.f246395S) != -1) {
                overridePendingTransition(i, i2);
                this.f246394R = -1;
                this.f246395S = -1;
            } else if (halfScreenConfig.mo76929a(this) == HalfScreenConfig.C55451a.POPUP) {
                if (mo117078s8()) {
                    overridePendingTransition(0, 0);
                } else {
                    overridePendingTransition(0, C0966R.C0968anim.f2351af);
                }
            } else if (mo117078s8()) {
                super.overridePendingTransition(0, 0);
            } else {
                super.overridePendingTransition(0, MMFragmentActivity$$c.f318647d);
            }
        } else if (appBrandInitConfigWC == null || C91003z.DISABLED == appBrandInitConfigWC.mo111303p()) {
            super.overridePendingTransition(0, 0);
        } else if (appBrandInitConfigWC.f234817S0) {
            overridePendingTransition(C0966R.C0968anim.f2350ae, C0966R.C0968anim.f2351af);
        } else if (appBrandInitConfigWC.f239393x1 && !appBrandInitConfigWC.f239373d1) {
            overridePendingTransition(C0966R.C0968anim.f2350ae, C0966R.C0968anim.f2351af);
        } else if (C91003z.DEFAULT != appBrandInitConfigWC.mo111303p()) {
            r2Var.mo111334b9(this, appBrandInitConfigWC);
        } else if (!C84566n2.m104153b()) {
            r2Var.mo111334b9(this, appBrandInitConfigWC);
        } else {
            super.overridePendingTransition(MMFragmentActivity$$c.f318646c, MMFragmentActivity$$c.f318647d);
        }
    }

    /* renamed from: d8 */
    public void mo117072d8(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        C84583r2 r2Var = C84583r2.INSTANCE;
        if (C83594m.m102619a(this, appBrandInitConfigWC, appBrandStatObject)) {
            C88990b.m111194c(this, (C88990b.C61771c) null);
            Log.m105924i("MicroMsg.AppBrandPluginUI", "init convertActivityToTranslucent");
        } else if (C91003z.DISABLED == appBrandInitConfigWC.mo111302o()) {
            super.overridePendingTransition(0, 0);
        } else {
            AppBrandInitConfigWC Y7 = mo117109Y7();
            if (C84788u.m104468b(appBrandInitConfigWC.f239376g1)) {
                super.overridePendingTransition(0, 0);
            } else if (C84905f.m104620a(mo117076q8())) {
                if (C91516n.m114822a(appBrandInitConfigWC.f239362d)) {
                    overridePendingTransition(0, 0);
                }
            } else if (appBrandInitConfigWC.f234815R0.mo76931c()) {
                if (appBrandInitConfigWC.f234815R0.mo76929a(this) == HalfScreenConfig.C55451a.POPUP) {
                    if (mo117078s8()) {
                        overridePendingTransition(0, 0);
                    } else {
                        overridePendingTransition(C0966R.C0968anim.f2352ag, 0);
                    }
                } else if (mo117078s8()) {
                    super.overridePendingTransition(0, 0);
                } else {
                    super.overridePendingTransition(MMFragmentActivity$$c.f318644a, 0);
                }
            } else if (Y7 != null && Y7.f234817S0) {
                super.mo117072d8(appBrandInitConfigWC, appBrandStatObject);
            } else if (Y7.f239393x1 && !Y7.f239373d1) {
                super.mo117072d8(appBrandInitConfigWC, appBrandStatObject);
            } else if (C91003z.DEFAULT != Y7.mo111302o()) {
                r2Var.mo111331Gm(this, Y7);
            } else if (!C84566n2.m104153b()) {
                r2Var.mo111331Gm(this, Y7);
            } else {
                super.overridePendingTransition(MMFragmentActivity$$c.f318644a, MMFragmentActivity$$c.f318645b);
            }
        }
    }

    /* renamed from: e8 */
    public void mo117073e8(AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime != null && (AppBrandRuntimeWCAccessible.m99328d(appBrandRuntime) || ((AppBrandInitConfigWC) appBrandRuntime.mo113036W()).f234815R0.mo76931c())) {
            if (((AppBrandInitConfigWC) appBrandRuntime.mo113036W()).f234814R) {
                appBrandRuntime.mo113029S0(false);
                appBrandRuntime.f238132X = null;
            } else {
                appBrandRuntime.mo113029S0(true);
                appBrandRuntime.f238132X = new C84437a();
            }
        }
        if (appBrandRuntime instanceof AppBrandRuntimeWC) {
            AppBrandInitConfigWC M1 = ((AppBrandRuntimeWC) appBrandRuntime).mo113210l1();
            if (C91003z.DISABLED == M1.mo111302o() && !mo117077r8()) {
                Log.m105925i("MicroMsg.AppBrandPluginUI", "onRuntimeLoaded, appId:%s, disableEnterAnimation && !keepOpaque, convertActivityToTranslucent", M1.f239362d);
                C88990b.m111194c(this, (C88990b.C61771c) null);
            }
        }
    }

    public void finish() {
        AppBrandRuntimeWC q8 = mo117076q8();
        if (!mo117078s8() || q8 == null) {
            super.finish();
            return;
        }
        HalfScreenManger halfScreenManger = q8.f238298z1;
        C84438b bVar = new C84438b();
        halfScreenManger.getClass();
        C76373e eVar = new C76373e(bVar, halfScreenManger);
        C85007k kVar = halfScreenManger.f247571d;
        if (kVar != null) {
            kVar.mo117953h(C84933h.DISMISS_AND_NOT_CLOSE_RUNTIME, eVar);
        }
    }

    public Object getSystemService(String str) {
        return (getApplicationContext() == null || !"autofill".equals(str)) ? super.getSystemService(str) : getApplicationContext().getSystemService(str);
    }

    /* renamed from: l8 */
    public boolean mo117074l8() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C844361 r2 = new IListener<AppBrandHalfScreenCloseAnimationSettingEvent>(C40008f.f107254d) {
            {
                this.__eventId = -858972213;
            }

            public boolean callback(IEvent iEvent) {
                AppBrandHalfScreenCloseAnimationSettingEvent appBrandHalfScreenCloseAnimationSettingEvent = (AppBrandHalfScreenCloseAnimationSettingEvent) iEvent;
                if (appBrandHalfScreenCloseAnimationSettingEvent.f236130d.f236131a != AppBrandPluginUI.this.hashCode()) {
                    return false;
                }
                AppBrandPluginUI appBrandPluginUI = AppBrandPluginUI.this;
                appBrandPluginUI.f246394R = appBrandHalfScreenCloseAnimationSettingEvent.f236130d.f236132b;
                appBrandPluginUI.f246395S = 0;
                return true;
            }
        };
        this.f246396T = r2;
        r2.alive();
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.AppBrandPluginUI).mo86179qs(this, C76986a.DiningNearby);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f246396T.dead();
    }

    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        if (mo117077r8()) {
            AppBrandRuntimeWC q8 = mo117076q8();
            if (q8 != null) {
                q8.mo113029S0(false);
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.AppBrandPluginUI", "onEnterAnimationComplete convert PluginUI to translucent");
        C88990b.m111194c(this, (C88990b.C61771c) null);
        Log.m105924i("MicroMsg.AppBrandPluginUI", "onEnter convertActivityToTranslucent");
    }

    public void onPause() {
        super.onPause();
        if (C84905f.m104620a(mo117076q8())) {
            C103928o.m138642b();
        }
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (C84905f.m104620a(mo117076q8())) {
            C84545i3.m104130g(getWindow(), true, false);
            C103928o.m138641a(true, true, true);
            C88990b.m111194c(this, (C88990b.C61771c) null);
        }
    }

    public void onResume() {
        super.onResume();
        if (C84905f.m104620a(mo117076q8())) {
            C84545i3.m104130g(getWindow(), true, false);
            C103928o.m138641a(true, true, true);
            C88990b.m111194c(this, (C88990b.C61771c) null);
        }
    }

    /* renamed from: q8 */
    public final AppBrandRuntimeWC mo117076q8() {
        if (mo117110a8() == null) {
            return null;
        }
        return (AppBrandRuntimeWC) mo117110a8().getActiveRuntime();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        r1 = r1.baseActivity;
     */
    /* renamed from: r8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo117077r8() {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.AppBrandPluginUI"
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r9.mo117076q8()
            boolean r1 = com.tencent.p014mm.plugin.appbrand.weishi.C84905f.m104620a(r1)
            r2 = 0
            if (r1 == 0) goto L_0x000e
            return r2
        L_0x000e:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r9.mo117076q8()
            boolean r3 = r1 instanceof com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC
            r4 = 1
            if (r3 == 0) goto L_0x002d
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r1.mo113210l1()
            wi0.a0 r3 = r1.mo111304q()
            wi0.a0 r5 = wi0.C90973a0.OPAQUE
            if (r3 != r5) goto L_0x0024
            return r4
        L_0x0024:
            wi0.a0 r1 = r1.mo111304q()
            wi0.a0 r3 = wi0.C90973a0.TRANSPARENT
            if (r1 != r3) goto L_0x002d
            return r2
        L_0x002d:
            int r1 = r9.getTaskId()     // Catch:{ Exception -> 0x008c }
            android.app.ActivityManager$RunningTaskInfo r1 = com.tencent.p014mm.sdk.platformtools.Util.getCurrentTaskInfo(r9, r1)     // Catch:{ Exception -> 0x008c }
            if (r1 == 0) goto L_0x0074
            android.content.ComponentName r3 = r1.baseActivity
            if (r3 == 0) goto L_0x0074
            android.content.ComponentName r5 = r9.getComponentName()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x004c
            java.lang.String r1 = "shouldKeepPluginUIOpaque return true, task.baseActivity=self, keep PluginUI opaque"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return r4
        L_0x004c:
            r3 = 2
            java.lang.String r5 = "WXBizEntryActivity"
            java.lang.String r6 = "AppBrandLaunchProxyUI"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            r6 = 0
        L_0x0056:
            if (r6 >= r3) goto L_0x0074
            r7 = r5[r6]
            android.content.ComponentName r8 = r1.baseActivity
            java.lang.String r8 = r8.getShortClassName()
            boolean r8 = r8.endsWith(r7)
            if (r8 == 0) goto L_0x0071
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r2] = r7
            java.lang.String r2 = "shouldKeepPluginUIOpaque return true, task.baseActivity=[%s], keep PluginUI opaque"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r1)
            return r4
        L_0x0071:
            int r6 = r6 + 1
            goto L_0x0056
        L_0x0074:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            if (r1 == 0) goto L_0x0081
            android.content.ComponentName r1 = r1.baseActivity
            if (r1 == 0) goto L_0x0081
            java.lang.String r1 = r1.getShortClassName()
            goto L_0x0083
        L_0x0081:
            java.lang.String r1 = "null"
        L_0x0083:
            r3[r2] = r1
            java.lang.String r1 = "shouldKeepPluginUIOpaque return false, task.baseActivity=[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)
            return r2
        L_0x008c:
            r1 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r2] = r1
            java.lang.String r1 = "shouldKeepPluginUIOpaque return false, get e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI.mo117077r8():boolean");
    }

    /* renamed from: s8 */
    public final boolean mo117078s8() {
        AppBrandRuntimeWC q8 = mo117076q8();
        if (q8 == null) {
            return false;
        }
        return q8.f238298z1.mo117792o();
    }
}
