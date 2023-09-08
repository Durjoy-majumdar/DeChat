package fp2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import com.tencent.p014mm.plugin.magicbrush.C30172a0;
import com.tencent.p014mm.plugin.magicbrush.C30183d0;
import com.tencent.p014mm.plugin.magicbrush.C85280q0;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d42.C31067e0;
import d42.C86177e;
import d42.C86195z;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import g70.C87162f;
import g70.C87164i;
import gp2.C87287a;
import gp2.C87288b;
import gp2.C87289c;
import gp2.C87290d;
import gp2.C87291e;
import gp2.C87292f;
import gp2.C87293g;
import gp2.C87294h;
import gp2.C87296i;
import gp2.C87297j;
import gp2.C87299k;
import gp2.C87300l;
import gp2.C87301m;
import gp2.C87302n;
import gp2.C87303o;
import gp2.C87305p;
import gp2.C87306q;
import gp2.C87307r;
import gp2.C87309s;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i70.C87667c;
import i70.C87674f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import l70.C88386a;
import l70.C88388b;
import l70.C88390d;
import m70.C88712h;
import o40.C61926c;
import p005bg.C0277c;
import q52.C62582g;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C110826x0;
import sx3.C64197v;

/* renamed from: fp2.c */
public final class C87067c extends C87667c<View, C87067c> {

    /* renamed from: n */
    public C62582g f252650n;

    /* renamed from: o */
    public FrameLayout f252651o;

    /* renamed from: p */
    public final Reference<Activity> f252652p;

    /* renamed from: q */
    public C87667c<?, ?>.a f252653q;

    /* renamed from: fp2.c$a */
    public static final class C87068a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87067c f252654d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87068a(C87067c cVar) {
            super(0);
            this.f252654d = cVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz$destroy$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz$destroy$1");
            C87067c cVar = this.f252654d;
            SnsMethodCalculate.markStartTimeMs("access$getVConsoleInspectorContainer$p", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            FrameLayout frameLayout = cVar.f252651o;
            SnsMethodCalculate.markEndTimeMs("access$getVConsoleInspectorContainer$p", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            if (frameLayout != null) {
                C87067c cVar2 = this.f252654d;
                SnsMethodCalculate.markStartTimeMs("access$getVConsoleInspector$p", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
                C62582g gVar = cVar2.f252650n;
                SnsMethodCalculate.markEndTimeMs("access$getVConsoleInspector$p", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
                if (gVar != null) {
                    gVar.mo87641e(frameLayout);
                }
                SnsMethodCalculate.markStartTimeMs("access$setVConsoleInspectorContainer$p", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
                cVar2.f252651o = null;
                SnsMethodCalculate.markEndTimeMs("access$setVConsoleInspectorContainer$p", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            }
            C87067c cVar3 = this.f252654d;
            SnsMethodCalculate.markStartTimeMs("access$getVConsoleInspector$p", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            C62582g gVar2 = cVar3.f252650n;
            SnsMethodCalculate.markEndTimeMs("access$getVConsoleInspector$p", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            if (gVar2 != null) {
                gVar2.mo87640d();
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz$destroy$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz$destroy$1");
            return b0Var;
        }
    }

    /* renamed from: fp2.c$b */
    public static final class C87069b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87164i f252655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87069b(C87164i iVar) {
            super(0);
            this.f252655d = iVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz$onInit$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz$onInit$1");
            Log.m105924i("SnsAdMB", "the layout callback, width is " + this.f252655d.f252790f + ", and height is " + this.f252655d.f252791g);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz$onInit$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz$onInit$1");
            return b0Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87067c(Activity activity) {
        super((C87674f) null, 1, (C8480h) null);
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f252652p = new WeakReference(activity);
    }

    /* renamed from: C0 */
    public final void mo121536C0(C87164i iVar) {
        SnsMethodCalculate.markStartTimeMs("addCustomViewToMgr", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        MagicSclViewContainer magicSclViewContainer = iVar.f252796l;
        if (magicSclViewContainer == null) {
            Log.m105920e("SnsAdMB", "sclView empty, addCustomView error");
            SnsMethodCalculate.markEndTimeMs("addCustomViewToMgr", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            return;
        }
        if (iVar.f252800p == 0) {
            C87412m.m108591d(magicSclViewContainer);
            int f0 = mo120836f0(magicSclViewContainer);
            iVar.f252800p = f0;
            Log.m105924i("SnsAdMB", "viewId is assigned:" + f0);
        } else {
            Log.m105924i("SnsAdMB", "viewId is already assigned:" + iVar.f252800p);
        }
        SnsMethodCalculate.markEndTimeMs("addCustomViewToMgr", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    /* renamed from: D0 */
    public final void mo121537D0(FrameLayout frameLayout) {
        SnsMethodCalculate.markStartTimeMs("launch", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        if (frameLayout != null) {
            this.f252651o = frameLayout;
            Context context = frameLayout.getContext();
            C87412m.m108593f(context, "it.context");
            C62582g t7 = ((C30172a0) C86312j.m106911c(C30172a0.class)).mo57195t7(context);
            t7.mo87639c(frameLayout);
            this.f252650n = t7;
        }
        mo118863q0();
        mo121029B0();
        SnsMethodCalculate.markEndTimeMs("launch", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    /* renamed from: b */
    public void mo109587b() {
        SnsMethodCalculate.markStartTimeMs("onMainScriptInjected", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        super.mo109587b();
        if (this.f252651o != null) {
            SnsMethodCalculate.markStartTimeMs("evaluate$plugin_sns_release", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            C86195z.C86196a.m106752a(mo122095o0(), "mb.switchVConsole(true);", (C32226l) null, 2, (Object) null);
            SnsMethodCalculate.markEndTimeMs("evaluate$plugin_sns_release", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        }
        SnsMethodCalculate.markEndTimeMs("onMainScriptInjected", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    /* renamed from: d0 */
    public void mo109589d0(int i) {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        super.mo109589d0(i);
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    /* renamed from: e0 */
    public Activity mo8720e0() {
        SnsMethodCalculate.markStartTimeMs("provideActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        Activity activity = this.f252652p.get();
        SnsMethodCalculate.markEndTimeMs("provideActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        return activity;
    }

    /* renamed from: g0 */
    public C86177e<View, ? extends Object> mo118860g0(String str) {
        SnsMethodCalculate.markStartTimeMs("findContainerDelegate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        C87412m.m108594g(str, "containerTag");
        C88712h hVar = new C88712h();
        SnsMethodCalculate.markEndTimeMs("findContainerDelegate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        return hVar;
    }

    /* renamed from: j0 */
    public void mo118861j0() {
        SnsMethodCalculate.markStartTimeMs("destroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        C61926c.m72668M(new C87068a(this));
        super.mo118861j0();
        C87667c<?, ?>.a aVar = this.f252653q;
        if (aVar != null) {
            aVar.mo122100c();
        }
        SnsMethodCalculate.markEndTimeMs("destroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    /* renamed from: l0 */
    public String mo118862l0() {
        SnsMethodCalculate.markStartTimeMs("getBizName", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        SnsMethodCalculate.markEndTimeMs("getBizName", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        return MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_LAND_PAGE;
    }

    public void onCreated() {
        SnsMethodCalculate.markStartTimeMs("onCreated", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        super.onCreated();
        SnsMethodCalculate.markEndTimeMs("onCreated", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        super.onPause();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        super.onResume();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    /* renamed from: q0 */
    public void mo118863q0() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        super.mo118863q0();
        SnsMethodCalculate.markStartTimeMs("provideSnsAdJsApis", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdJsApiFactory");
        HashSet b = C110826x0.m151014b(new C87287a(), new C87288b(), new C87289c(), new C87290d(), new C87291e(), new C87292f(), new C87293g(), new C87294h(), new C87296i(), new C87297j(), new C87299k(), new C87300l(), new C87301m(), new C87302n(), new C87303o(), new C87305p(), new C87306q(), new C87307r(), new C87309s());
        b.addAll(((C30183d0) C86312j.m106911c(C30183d0.class)).Ep0(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_LAND_PAGE));
        HashSet hashSet = new HashSet();
        SnsMethodCalculate.markEndTimeMs("provideSnsAdJsApis", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdJsApiFactory");
        C31067e0 S = ((C0277c) C86312j.m106911c(C0277c.class)).mo554S(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_LAND_PAGE);
        MBBuildConfig mBBuildConfig = new MBBuildConfig((HashSet) null, (HashSet) null, (String) null, (String) null, false, false, 63, (C8480h) null);
        mBBuildConfig.f248378q = this;
        SnsMethodCalculate.markStartTimeMs("getMbJsApiSet", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdJsApiGroup");
        SnsMethodCalculate.markEndTimeMs("getMbJsApiSet", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdJsApiGroup");
        mBBuildConfig.mo118367a(C110818d0.m150933e0(C110818d0.m150933e0(b, S.f83320a), C64197v.m75537f(new C88390d(), new C88386a(), new C88388b())));
        HashSet hashSet2 = new HashSet();
        SnsMethodCalculate.markStartTimeMs("getAppBrandJsApi", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdJsApiGroup");
        SnsMethodCalculate.markEndTimeMs("getAppBrandJsApi", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdJsApiGroup");
        hashSet2.addAll(hashSet);
        hashSet2.addAll(S.f83321b);
        C13598b0 b0Var = C13598b0.f38549a;
        C85280q0.m105251b(mBBuildConfig, hashSet2);
        C62582g gVar = this.f252650n;
        if (gVar != null) {
            mBBuildConfig.f248377p = gVar;
        }
        mo121036A0(mBBuildConfig);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    /* renamed from: r0 */
    public void mo118864r0(C87667c<?, ?>.a aVar, C87164i iVar, String str) {
        SnsMethodCalculate.markStartTimeMs("onBind", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        C87412m.m108594g(aVar, "root");
        C87412m.m108594g(iVar, "frameSet");
        C87412m.m108594g(str, "info");
        mo121536C0(iVar);
        super.mo118864r0(aVar, iVar, str);
        Log.m105924i("SnsAdMB", "onBind:: info is " + str);
        SnsMethodCalculate.markEndTimeMs("onBind", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    /* renamed from: s0 */
    public void mo121538s0(C87162f fVar) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        C87412m.m108594g(fVar, "appContext");
        super.mo121538s0(fVar);
        Log.m105924i("SnsAdMB", "the magic brush scl app context created");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    /* renamed from: t0 */
    public void mo121539t0(C87667c<?, ?>.a aVar) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        C87412m.m108594g(aVar, "root");
        super.mo121539t0(aVar);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    /* renamed from: u0 */
    public void mo121037u0(C87667c<?, ?>.a aVar) {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        C87412m.m108594g(aVar, "root");
        super.mo121037u0(aVar);
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    /* renamed from: v0 */
    public void mo121540v0(C87667c<?, ?>.a aVar, C87164i iVar) {
        SnsMethodCalculate.markStartTimeMs("onInit", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        C87412m.m108594g(aVar, "root");
        C87412m.m108594g(iVar, "frameSet");
        mo121536C0(iVar);
        super.mo121540v0(aVar, iVar);
        iVar.f252792h = new C87069b(iVar);
        SnsMethodCalculate.markEndTimeMs("onInit", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    /* renamed from: w0 */
    public void mo121541w0(C87667c<?, ?>.a aVar) {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        C87412m.m108594g(aVar, "root");
        super.mo121541w0(aVar);
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    /* renamed from: x0 */
    public void mo121542x0(C87667c<?, ?>.a aVar) {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        C87412m.m108594g(aVar, "root");
        super.mo121542x0(aVar);
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }
}
