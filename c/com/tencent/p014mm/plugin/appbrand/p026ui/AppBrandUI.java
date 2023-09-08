package com.tencent.p014mm.plugin.appbrand.p026ui;

import ai0.C79553f;
import ak0.C79584a;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import bl3.C39818r;
import com.tencent.luggage.sdk.config.AppBrandInitWindowConfig;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.AppBrandCloseReasonStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityAndroidMMKernelStartupCostStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityAndroidProcessStartCostStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityAndroidWebViewPreInitCostStruct;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainerWC;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWCAccessible;
import com.tencent.p014mm.plugin.appbrand.C81598c1;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.C81820e3;
import com.tencent.p014mm.plugin.appbrand.C81974j3;
import com.tencent.p014mm.plugin.appbrand.C83606m1;
import com.tencent.p014mm.plugin.appbrand.C85036x2;
import com.tencent.p014mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle;
import com.tencent.p014mm.plugin.appbrand.app.AppBrandProcessSuicideLogic;
import com.tencent.p014mm.plugin.appbrand.app.C81176n;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83166i0;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81116f;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81118g;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUIMoveTaskToBackStubUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84672s2;
import com.tencent.p014mm.plugin.appbrand.p026ui.wxa_container.AppBrandContainerFragmentActivity;
import com.tencent.p014mm.plugin.appbrand.performance.C84004i;
import com.tencent.p014mm.plugin.appbrand.performance.C84007j;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.model.C84137a;
import com.tencent.p014mm.plugin.appbrand.report.model.C84142f;
import com.tencent.p014mm.plugin.appbrand.report.model.C84174u;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84180a;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84186b0;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84218r;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.plugin.appbrand.task.C84275c0;
import com.tencent.p014mm.plugin.appbrand.task.C84287e0;
import com.tencent.p014mm.plugin.appbrand.utils.C2049t;
import com.tencent.p014mm.plugin.appbrand.utils.C84767n0;
import com.tencent.p014mm.plugin.appbrand.utils.C84788u;
import com.tencent.p014mm.plugin.appbrand.utils.C84800z1;
import com.tencent.p014mm.plugin.appbrand.widget.C84933h;
import com.tencent.p014mm.plugin.appbrand.widget.C85007k;
import com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84944a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.AccessibilityUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.xweb.WebView;
import cr0.C45150a;
import cr0.C86117l;
import cr0.C86127t;
import di0.C86292a;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import gy3.C87412m;
import h81.C32735h;
import in3.C87771d;
import is0.C87794b;
import it0.C87801f;
import j20.C117292a;
import j40.C87829b;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import jt0.C88029d;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kr0.C88267e;
import l31.C61212e;
import li0.C88509c;
import li0.C88514d;
import li0.C88534g;
import li0.C88535h;
import nj3.C76879j;
import nj3.C88989a;
import nj3.C88990b;
import o31.C11345b;
import o31.C76986a;
import p170ic.C87690d;
import p225rc.C89916g;
import p225rc.g$$h;
import p385u2.C111105a;
import p680ru.C77570i;
import p823sg.C77710q;
import p910lj.C76701a;
import p963fc.C86806b;
import p963fc.C86812g;
import qo3.C77389a;
import qo3.C77398g;
import rx3.C13598b0;
import rx3.C36570n;
import u24.C90599h;
import wq0.C91085v;
import yr0.C91577a;
import zt3.C119157j;

@C88989a(71)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUI */
public class AppBrandUI extends AppBrandContainerFragmentActivity implements g$$h, C45150a, C88990b.C88992b {

    /* renamed from: N */
    public static final boolean f246480N;

    /* renamed from: P */
    public static final int[] f246481P = {0, 11, 6, 8};

    /* renamed from: Q */
    public static boolean f246482Q = false;

    /* renamed from: A */
    public boolean f246483A;

    /* renamed from: B */
    public boolean f246484B;

    /* renamed from: C */
    public final MMHandler f246485C;

    /* renamed from: D */
    public final Runnable f246486D;

    /* renamed from: E */
    public final AppBrandContainerFragmentActivity.C84705a f246487E;

    /* renamed from: F */
    public final Object f246488F;

    /* renamed from: G */
    public LayoutInflater f246489G;

    /* renamed from: H */
    public Resources f246490H;

    /* renamed from: I */
    public C84527f3 f246491I;

    /* renamed from: J */
    public C77398g f246492J;

    /* renamed from: K */
    public final Set<C45150a.C45151a> f246493K;

    /* renamed from: L */
    public Boolean f246494L;

    /* renamed from: M */
    public final C84275c0 f246495M;
    /* access modifiers changed from: private */
    public AppBrandRuntimeContainerWC mRuntimeContainer;

    /* renamed from: p */
    public final C84944a f246496p = new C84944a(this);

    /* renamed from: q */
    public final AppBrandUITranslucentWorkaroundDelegate f246497q = new AppBrandUITranslucentWorkaroundDelegate(this);

    /* renamed from: r */
    public final C84580q2 f246498r;

    /* renamed from: s */
    public C88535h f246499s;

    /* renamed from: t */
    public boolean f246500t;

    /* renamed from: u */
    public boolean f246501u;

    /* renamed from: v */
    public Boolean f246502v;

    /* renamed from: w */
    public Configuration f246503w;

    /* renamed from: x */
    public boolean f246504x;

    /* renamed from: y */
    public boolean f246505y;

    /* renamed from: z */
    public boolean f246506z;

    static {
        Class cls = C32735h.class;
        if (((Boolean) ((C36570n) C2049t.f11994a).getValue()).booleanValue()) {
            ((C119157j) C119157j.f356862d).mo183884o(C83166i0.f242980d);
        }
        C81682d.m100227g();
        boolean z = true;
        C88509c.f255665d = 1 == ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32738b.clicfg_android_appbrand_keep_suspend_not_suicde_on_screen_off, (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_BLUE) ? 1 : 0);
        if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_move_task_to_back_android12_workaround, 1) != 1) {
            z = false;
        }
        f246480N = z;
    }

    public AppBrandUI() {
        this.f246498r = (!f246480N || Build.VERSION.SDK_INT < 31) ? null : new C84580q2();
        boolean z = false;
        this.f246500t = false;
        this.f246501u = false;
        this.f246502v = null;
        this.f246503w = null;
        this.f246504x = false;
        this.f246505y = false;
        this.f246506z = false;
        this.f246483A = false;
        this.f246484B = false;
        this.f246485C = new MMHandler(Looper.getMainLooper());
        this.f246486D = new AppBrandUI$$a(this);
        this.f246487E = new AppBrandUI$$e(this);
        this.f246488F = new byte[0];
        this.f246492J = null;
        this.f246493K = new HashSet();
        this.f246495M = new AppBrandUI$$b(this);
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if ("android.app.Instrumentation".equals(stackTraceElement.getClassName()) && "newActivity".equals(stackTraceElement.getMethodName())) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            C84287e0.f246157a.mo116975a(this, "<init>");
            AtomicBoolean atomicBoolean = AppBrandProcessSuicideLogic.f238430g;
            if (!atomicBoolean.get() && (MMApplicationContext.getContext() instanceof Application)) {
                ((Application) MMApplicationContext.getContext()).registerActivityLifecycleCallbacks(AppBrandProcessSuicideLogic.f238431h);
                atomicBoolean.set(true);
            }
            AppBrandProcessSuicideLogic appBrandProcessSuicideLogic = AppBrandProcessSuicideLogic.f238431h;
            if (((HashSet) appBrandProcessSuicideLogic.f238434f).add(this)) {
                appBrandProcessSuicideLogic.f238432d.incrementAndGet();
            }
            this.f246502v = Boolean.valueOf(!C81176n.f238501c);
        }
    }

    /* renamed from: Q7 */
    public static void m104031Q7(AppBrandUI appBrandUI) {
        AppBrandRuntime activeRuntime = appBrandUI.mRuntimeContainer.getActiveRuntime();
        if (activeRuntime != null) {
            activeRuntime.f238113K.f255667a.mo122987s(C88514d.C88522g.ON_SYSTEM_SCREEN_OFF, (Object) null);
        }
    }

    /* renamed from: Z7 */
    public static Configuration m104035Z7(Activity activity) {
        if (activity instanceof MMFragmentActivity) {
            return ((MMFragmentActivity) activity).getOriginalResources().getConfiguration();
        }
        if (activity instanceof MMBaseActivity) {
            return ((MMBaseActivity) activity).getOriginalResources().getConfiguration();
        }
        Resources resources = null;
        try {
            resources = activity.getResources();
        } catch (NullPointerException e) {
            Log.m105921e("MicroMsg.AppBrandUI", "getIntrinsicActivityConfiguration(%s) getResources npe %s", activity, e);
        }
        if (resources == null) {
            resources = MMApplicationContext.getResources();
        }
        return resources.getConfiguration();
    }

    /* renamed from: A6 */
    public void mo117102A6() {
        this.f246497q.f246539e = false;
    }

    /* renamed from: F1 */
    public void mo117103F1() {
        this.f246497q.f246539e = true;
    }

    /* renamed from: K2 */
    public void mo70653K2(C45150a.C45151a aVar) {
        if (aVar != null) {
            this.f246493K.add(aVar);
        }
    }

    /* renamed from: N2 */
    public void mo70654N2(C45150a.C45151a aVar) {
        if (aVar != null) {
            this.f246493K.remove(aVar);
        }
    }

    /* renamed from: O7 */
    public final void mo117104O7() {
        getIntent().removeExtra("android.view.autofill.extra.RESTORE_SESSION_TOKEN");
        super.finishAndRemoveTask();
    }

    /* renamed from: U7 */
    public final void mo117105U7(AppBrandStatObject appBrandStatObject) {
        if (appBrandStatObject == null) {
            Log.m105920e("MicroMsg.AppBrandUI", "adjustWindowFlag, statObj is null");
        } else if (1225 == appBrandStatObject.f245533f) {
            Log.m105924i("MicroMsg.WMPFVoip.WmpfVoipWindowFlags", "add, activity: " + this);
            Window window = getWindow();
            if (window != null) {
                window.addFlags(6815744);
            }
        } else {
            Log.m105924i("MicroMsg.WMPFVoip.WmpfVoipWindowFlags", "clear, activity: " + this);
            Window window2 = getWindow();
            if (window2 != null) {
                window2.clearFlags(6815744);
            }
        }
    }

    /* renamed from: V7 */
    public final void mo117106V7() {
        AppBrandContainerFragmentActivity.C84705a aVar = this.f246487E;
        if (aVar != null) {
            this.f247091o.remove(aVar);
        }
        this.f246485C.removeCallbacks(this.f246486D);
    }

    /* renamed from: W7 */
    public final void mo117107W7() {
        if (!isFinishing() && !isDestroyed()) {
            AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
            int stackSize = appBrandRuntimeContainerWC == null ? -1 : appBrandRuntimeContainerWC.getStackSize();
            Log.m105925i("MicroMsg.AppBrandUI", "%s.closeIfNoActiveRuntimes %d,", getLocalClassName(), Integer.valueOf(stackSize));
            AppBrandRuntimeContainerWC appBrandRuntimeContainerWC2 = this.mRuntimeContainer;
            if (appBrandRuntimeContainerWC2 instanceof AppBrandRuntimeContainerWC) {
                appBrandRuntimeContainerWC2.mo113152n0();
            } else if (stackSize <= 0) {
                finish();
            }
        }
    }

    /* renamed from: X7 */
    public void mo117108X7() {
        AppBrandRuntime activeRuntime;
        int i = AppBrandUI$$d.f246514b[getLifecycle().getCurrentState().ordinal()];
        if (i != 1 && i != 2) {
            AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
            if (appBrandRuntimeContainerWC == null || (activeRuntime = appBrandRuntimeContainerWC.getActiveRuntime()) == null || activeRuntime.mo113064k0() || activeRuntime.f238117P) {
                finish();
                return;
            }
            int i2 = activeRuntime instanceof AppBrandRuntimeWC ? ((AppBrandRuntimeWC) activeRuntime).mo121253n1().f245533f : 0;
            if (i2 == 1225) {
                Log.m105929w("MicroMsg.AppBrandUI", "forceMoveTaskToBack, hash:%d, name:%s, appId:%s, scene:%d, skip.", Integer.valueOf(hashCode()), getLocalClassName(), activeRuntime.f238147j, Integer.valueOf(i2));
            } else if (mo117121n8(false)) {
                activeRuntime.f238113K.f255667a.mo122987s(C88514d.C88522g.ON_CONTAINER_FORCED_MOVE_TO_BACK, (Object) null);
                C81820e3 e3Var = activeRuntime.f238142e;
                if (e3Var != null && e3Var.getActiveRuntime() == activeRuntime) {
                    activeRuntime.mo113090y();
                }
            }
        } else if (!this.f246483A) {
            Log.m105929w("MicroMsg.AppBrandUI", "forceMoveTaskToBack, hash:%d, name:%s, state:%s, skip.", Integer.valueOf(hashCode()), getLocalClassName(), getLifecycle().getCurrentState());
        }
    }

    /* renamed from: Y7 */
    public final AppBrandInitConfigWC mo117109Y7() {
        try {
            return (AppBrandInitConfigWC) mo117119k8(getIntent()).first;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a8 */
    public final C81820e3 mo117110a8() {
        return this.mRuntimeContainer;
    }

    /* renamed from: b8 */
    public final void mo117111b8(WeAppOpenDeclarePromptBundle weAppOpenDeclarePromptBundle, String str) {
        AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
        AppBrandRuntime activeRuntime = appBrandRuntimeContainerWC != null ? appBrandRuntimeContainerWC.getActiveRuntime() : null;
        if (activeRuntime == null || !Util.isEqual(activeRuntime.f238147j, str)) {
            Log.m105921e("MicroMsg.AppBrandUI", "handleDeclarePrompt: try dismiss last dialog, activeRuntime(%s) newAppId(%s)", activeRuntime, str);
            C77398g gVar = this.f246492J;
            if (gVar != null) {
                gVar.dismiss();
            }
        }
        if (weAppOpenDeclarePromptBundle == null) {
            Log.m105925i("MicroMsg.AppBrandUI", "handleDeclarePrompt with null bundle: appid(%s) try dismiss last dialog", Util.nullAs(str, ""));
            C77398g gVar2 = this.f246492J;
            if (gVar2 != null) {
                gVar2.dismiss();
                return;
            }
            return;
        }
        Log.m105925i("MicroMsg.AppBrandUI", "handleDeclarePrompt bundle:%s appid:%s", weAppOpenDeclarePromptBundle, Util.nullAs(str, ""));
        C77398g gVar3 = this.f246492J;
        if (gVar3 != null) {
            gVar3.dismiss();
        }
        C77389a aVar = new C77389a();
        aVar.f225644a = weAppOpenDeclarePromptBundle.f157921f;
        aVar.f225660q = weAppOpenDeclarePromptBundle.f157922g;
        String str2 = weAppOpenDeclarePromptBundle.f157923h;
        if (TextUtils.isEmpty(str2)) {
            str2 = getString(C0966R.string.a18);
        }
        aVar.f225663t = str2;
        aVar.f225620C = new AppBrandUI$$h(this, weAppOpenDeclarePromptBundle);
        aVar.f225668y = weAppOpenDeclarePromptBundle.f157924i;
        aVar.f225622E = new AppBrandUI$$i(this, weAppOpenDeclarePromptBundle);
        C77398g gVar4 = new C77398g(this, C0966R.style.a66);
        gVar4.mo107525e(aVar);
        this.f246492J = gVar4;
        gVar4.show();
    }

    /* renamed from: c8 */
    public void mo117071c8(AppBrandInitConfigWC appBrandInitConfigWC) {
        C84583r2.INSTANCE.mo111334b9(this, appBrandInitConfigWC);
    }

    /* renamed from: d8 */
    public void mo117072d8(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        appBrandInitConfigWC.f234834c1 = appBrandStatObject;
        if (C84788u.m104468b(appBrandInitConfigWC.f239376g1)) {
            overridePendingTransition(0, 0);
        } else {
            C84583r2.INSTANCE.mo111331Gm(this, appBrandInitConfigWC);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AppBrandRuntime activeRuntime;
        boolean z;
        AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
        if (!(appBrandRuntimeContainerWC == null || (activeRuntime = appBrandRuntimeContainerWC.getActiveRuntime()) == null)) {
            Set<C81974j3> set = activeRuntime.f238139b1.get(keyEvent.getKeyCode());
            if (set == null) {
                z = false;
            } else {
                z = false;
                for (C81974j3 j3Var : set) {
                    int i = j3Var.f240378b;
                    if (i == -1 || i == keyEvent.getAction()) {
                        z |= j3Var.mo107509a(keyEvent);
                    }
                }
            }
            if (z) {
                return true;
            }
        }
        Log.m105919d("MicroMsg.AppBrandUI", "onKeyDown: keyCode = [%d], keyAction =[%d]", Integer.valueOf(keyEvent.getKeyCode()), Integer.valueOf(keyEvent.getAction()));
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: e8 */
    public void mo117073e8(AppBrandRuntime appBrandRuntime) {
    }

    /* renamed from: f8 */
    public final void mo117112f8(Intent intent, String str) {
        Intent intent2 = intent;
        String str2 = str;
        long currentTicks = Util.currentTicks();
        setIntent(intent);
        try {
            Pair<AppBrandInitConfigWC, AppBrandStatObject> k8 = mo117119k8(intent);
            final AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) k8.first;
            final AppBrandStatObject appBrandStatObject = (AppBrandStatObject) k8.second;
            if (!(appBrandInitConfigWC == null || appBrandStatObject == null)) {
                try {
                    if (appBrandInitConfigWC.f234846y != null) {
                        intent2.setExtrasClassLoader(getClassLoader());
                        mo117105U7(appBrandStatObject);
                        AppBrandInitWindowConfig appBrandInitWindowConfig = appBrandInitConfigWC.f234828Y;
                        if (appBrandInitWindowConfig != null && appBrandInitWindowConfig.f234849d) {
                            AppBrandContainerFragmentActivity.m104355N7(this, appBrandInitWindowConfig.f234850e);
                        } else if (appBrandInitConfigWC.f234815R0.f157948h) {
                            AppBrandContainerFragmentActivity.m104355N7(this, getResources().getColor(C0966R.color.f2975b6));
                        } else {
                            AppBrandContainerFragmentActivity.m104355N7(this, getResources().getColor(C0966R.color.f2928b));
                        }
                        if (C81682d.m100222b(appBrandInitConfigWC.f239362d) == null) {
                            C84218r.m103812b(appBrandInitConfigWC.f234838r, appBrandInitConfigWC.f239362d, appBrandInitConfigWC.f234839s, String.valueOf(appBrandInitConfigWC.f234802F), CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL, appBrandInitConfigWC.mo111300k());
                            C83606m1.m102638b(1, appBrandInitConfigWC);
                        }
                        appBrandInitConfigWC.f234834c1 = appBrandStatObject;
                        try {
                            C84142f.m103712a(this, appBrandInitConfigWC, str2);
                            int intExtra = IntentUtil.getIntExtra(intent2, "key_launch_app_client_version", BuildInfo.CLIENT_VERSION_INT);
                            int i = BuildInfo.CLIENT_VERSION_INT;
                            if (i != intExtra) {
                                Log.m105921e("MicroMsg.AppBrandUI", "load(intent) mismatch client_version now_version[%d], intent_version[%d]", Integer.valueOf(i), Integer.valueOf(intExtra));
                                C83606m1.m102638b(5, appBrandInitConfigWC);
                                C83606m1.m102638b(3, appBrandInitConfigWC);
                                finish();
                                Log.m105925i("MicroMsg.AppBrandUI", "performLoadRuntime(%s) cost:%dms", str2, Long.valueOf(Util.currentTicks() - currentTicks));
                                return;
                            }
                            int h = C86718e.m107549h();
                            if (h == 0) {
                                C76701a.makeText((Context) this, (int) C0966R.string.f7586ke, 1).show();
                                C115669n.INSTANCE.mo175912v((long) 1294, (long) 0);
                                Log.m105921e("MicroMsg.AppBrandUI", "load() recreate by system history, nowUin==INVALID_UIN, just finish, config.appId:%s", appBrandInitConfigWC.f239362d);
                                finish();
                                Log.m105925i("MicroMsg.AppBrandUI", "performLoadRuntime(%s) cost:%dms", str2, Long.valueOf(Util.currentTicks() - currentTicks));
                                return;
                            } else if (h != appBrandInitConfigWC.f234818T) {
                                C115669n.INSTANCE.mo175912v((long) 1294, (long) 1);
                                Log.m105921e("MicroMsg.AppBrandUI", "load() recreate by system history, nowUin[%s] != config.uin[%s], reset config appId:%s", C77710q.m93738a(h), C77710q.m93738a(appBrandInitConfigWC.f234818T), appBrandInitConfigWC.f239362d);
                                finish();
                                Log.m105925i("MicroMsg.AppBrandUI", "performLoadRuntime(%s) cost:%dms", str2, Long.valueOf(Util.currentTicks() - currentTicks));
                                return;
                            } else {
                                if ((intent.getFlags() & 1048576) > 0) {
                                    Log.m105925i("MicroMsg.AppBrandUI", "load() recreate by system history, old initConfig[%s]", appBrandInitConfigWC.toString());
                                    appBrandInitConfigWC.f234800D = Util.nowMilliSecond();
                                    appBrandInitConfigWC.f239374e1 = Util.nowMilliSecond();
                                    appBrandInitConfigWC.f234835p = 1;
                                    appBrandInitConfigWC.f239379j1 = new QualitySession(C84788u.m104467a(appBrandInitConfigWC.f234818T), appBrandInitConfigWC, appBrandStatObject);
                                    appBrandInitConfigWC.mo111299j();
                                } else {
                                    appBrandInitConfigWC.f234835p = 0;
                                }
                                if (TextUtils.isEmpty(appBrandInitConfigWC.f234838r) && appBrandInitConfigWC.f239379j1 != null) {
                                    appBrandInitConfigWC.mo111298i(appBrandInitConfigWC.f239379j1.f245832d);
                                }
                                if (appBrandInitConfigWC.f239379j1 != null) {
                                    C84186b0.f245919a.mo116883k(appBrandInitConfigWC.f239362d, appBrandInitConfigWC.f239379j1.f245832d);
                                }
                                mo117118j8(appBrandInitConfigWC, appBrandStatObject);
                                Log.m105925i("MicroMsg.AppBrandUI", "load() config %s , stat %s", appBrandInitConfigWC, appBrandStatObject);
                                C83226n.m102128e(appBrandInitConfigWC.f239362d, KSProcessWeAppLaunch.stepContainerUILaunch);
                                try {
                                    mo117111b8(appBrandInitConfigWC.f239391v1, appBrandInitConfigWC.f239362d);
                                } catch (Throwable th) {
                                    Log.m105921e("MicroMsg.AppBrandUI", "handleDeclarePrompt appId:%s, exception:%s", appBrandInitConfigWC.f239362d, th);
                                    C77398g gVar = this.f246492J;
                                    if (gVar != null) {
                                        gVar.dismiss();
                                    }
                                }
                                AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
                                appBrandRuntimeContainerWC.getClass();
                                appBrandRuntimeContainerWC.mo120548w().runOnUiThread(new C86806b(appBrandRuntimeContainerWC, (C86812g) null, appBrandInitConfigWC, appBrandStatObject));
                                mo117073e8(this.mRuntimeContainer.getActiveRuntime());
                                if ("onNewIntent".equals(str2)) {
                                    getLifecycle().addObserver(new C0124r() {
                                        @C112974b0(C39623j.C39625b.ON_PAUSE)
                                        public void onPaused() {
                                            AppBrandUI.this.getLifecycle().removeObserver(this);
                                        }

                                        @C112974b0(C39623j.C39625b.ON_RESUME)
                                        public void onResumed() {
                                            AppBrandUI.this.mo117072d8(appBrandInitConfigWC, appBrandStatObject);
                                            AppBrandUI.this.getLifecycle().removeObserver(this);
                                        }
                                    });
                                } else {
                                    mo117072d8(appBrandInitConfigWC, appBrandStatObject);
                                }
                                mo117106V7();
                                AppBrandContainerFragmentActivity.C84705a aVar = this.f246487E;
                                if (aVar != null) {
                                    this.f247091o.add(aVar);
                                }
                                Log.m105925i("MicroMsg.AppBrandUI", "performLoadRuntime(%s) cost:%dms", str2, Long.valueOf(Util.currentTicks() - currentTicks));
                                return;
                            }
                        } catch (C84137a unused) {
                            C83606m1.m102638b(35, appBrandInitConfigWC);
                            C84142f.m103713b();
                            finish();
                            Log.m105925i("MicroMsg.AppBrandUI", "performLoadRuntime(%s) cost:%dms", str2, Long.valueOf(Util.currentTicks() - currentTicks));
                            return;
                        }
                    }
                } catch (Throwable th4) {
                    Log.m105925i("MicroMsg.AppBrandUI", "performLoadRuntime(%s) cost:%dms", str2, Long.valueOf(Util.currentTicks() - currentTicks));
                    throw th4;
                }
            }
            AppBrandRuntimeContainerWC appBrandRuntimeContainerWC2 = this.mRuntimeContainer;
            if (appBrandRuntimeContainerWC2 == null || appBrandRuntimeContainerWC2.getActiveRuntime() == null) {
                finish();
            }
            Log.m105925i("MicroMsg.AppBrandUI", "performLoadRuntime(%s) cost:%dms", str2, Long.valueOf(Util.currentTicks() - currentTicks));
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandUI", "performLoadRuntime-retrieveLaunchParams get exception %s", e);
            finish();
            Log.m105925i("MicroMsg.AppBrandUI", "performLoadRuntime(%s) cost:%dms", str2, Long.valueOf(Util.currentTicks() - currentTicks));
        }
    }

    public void finish() {
        String str;
        boolean z;
        if (!isFinishing() && !isDestroyed()) {
            AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
            AppBrandInitConfigWC appBrandInitConfigWC = null;
            AppBrandRuntimeWC appBrandRuntimeWC = appBrandRuntimeContainerWC == null ? null : (AppBrandRuntimeWC) appBrandRuntimeContainerWC.getActiveRuntime();
            if (appBrandRuntimeWC != null) {
                HalfScreenManger halfScreenManger = appBrandRuntimeWC.f238298z1;
                C88029d dVar = halfScreenManger.f247572e;
                dVar.mo122474e(dVar.mo122472c(), 0, 100);
                if (halfScreenManger.mo117782e().mo76931c()) {
                    if (halfScreenManger.mo117792o()) {
                        halfScreenManger.f247569b = false;
                        halfScreenManger.f247570c = false;
                    }
                    if (halfScreenManger.f247568a.f238159x != null) {
                        halfScreenManger.mo117789l();
                    }
                }
            }
            C84287e0.f246157a.mo116975a(this, "finish");
            C2027y2.m1979c(this);
            try {
                AppBrandRuntimeContainerWC appBrandRuntimeContainerWC2 = this.mRuntimeContainer;
                if (appBrandRuntimeContainerWC2 != null) {
                    AppBrandInitConfigWC appBrandInitConfigWC2 = (AppBrandInitConfigWC) ((C86812g) appBrandRuntimeContainerWC2.getActiveRuntime()).mo113036W();
                    C84580q2 q2Var = this.f246498r;
                    if (q2Var == null || !q2Var.mo117270c(this, appBrandInitConfigWC2)) {
                        appBrandInitConfigWC = appBrandInitConfigWC2;
                        z = false;
                        this.mRuntimeContainer.mo113157t0();
                        this.mRuntimeContainer.mo113160v0(AppBrandRuntimeContainerWC.C81084d.Finish, this.f246483A);
                    } else {
                        appBrandInitConfigWC = appBrandInitConfigWC2;
                        z = true;
                        this.mRuntimeContainer.mo113157t0();
                        this.mRuntimeContainer.mo113160v0(AppBrandRuntimeContainerWC.C81084d.Finish, this.f246483A);
                    }
                } else {
                    z = false;
                }
            } catch (Exception unused) {
                C84580q2 q2Var2 = this.f246498r;
                if (q2Var2 != null && q2Var2.mo117270c(this, (AppBrandInitConfigWC) null)) {
                }
            } catch (Exception e) {
                try {
                    Log.m105921e("MicroMsg.AppBrandUI", "finish e = %s", e);
                    C29675u2.m38852a(WeChatProcess.PROCESS_MAIN, getClass().getCanonicalName());
                    str = ((AppBrandInitConfigWC) mo117119k8(getIntent()).first).f239375f1;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        C29675u2.m38852a(WeChatProcess.PROCESS_MAIN, getClass().getCanonicalName());
                        String str2 = ((AppBrandInitConfigWC) mo117119k8(getIntent()).first).f239375f1;
                        if (!TextUtils.isEmpty(str2)) {
                            C29675u2.m38852a(str2, getClass().getCanonicalName());
                        }
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                C84580q2 q2Var3 = this.f246498r;
                if (q2Var3 != null) {
                    q2Var3.mo117270c(this, (AppBrandInitConfigWC) null);
                }
                throw th4;
            }
            if (!z) {
                mo117104O7();
                if (!this.f246506z) {
                    mo117071c8(appBrandInitConfigWC);
                }
                try {
                    C29675u2.m38852a(WeChatProcess.PROCESS_MAIN, getClass().getCanonicalName());
                    str = ((AppBrandInitConfigWC) mo117119k8(getIntent()).first).f239375f1;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    C29675u2.m38852a(str, getClass().getCanonicalName());
                } catch (Exception unused3) {
                }
            } else {
                try {
                    C29675u2.m38852a(WeChatProcess.PROCESS_MAIN, getClass().getCanonicalName());
                    String str3 = ((AppBrandInitConfigWC) mo117119k8(getIntent()).first).f239375f1;
                    if (!TextUtils.isEmpty(str3)) {
                        C29675u2.m38852a(str3, getClass().getCanonicalName());
                    }
                } catch (Exception unused4) {
                }
            }
        }
    }

    /* renamed from: g8 */
    public final void mo117113g8() {
        C81176n.C81177a aVar = C81176n.f238499a;
        if (aVar.f238502a) {
            C81176n.C81177a.m99462a(aVar, this);
        }
        try {
            String str = ((AppBrandInitConfigWC) mo117119k8(getIntent()).first).f239375f1;
            if (!TextUtils.isEmpty(str)) {
                C29673t2.f80631a.mo56894a(str, getClass().getCanonicalName());
            }
            if (!C90599h.m113509b(MMApplicationContext.getMainProcessName(), str)) {
                C29673t2.f80631a.mo56894a(MMApplicationContext.getMainProcessName(), getClass().getCanonicalName());
            }
        } catch (Throwable unused) {
        }
        AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
        AppBrandRuntimeWC appBrandRuntimeWC = appBrandRuntimeContainerWC == null ? null : (AppBrandRuntimeWC) appBrandRuntimeContainerWC.getActiveRuntime();
        if (appBrandRuntimeWC != null) {
            HalfScreenManger halfScreenManger = appBrandRuntimeWC.f238298z1;
            if (halfScreenManger.mo117782e().mo76931c() && halfScreenManger.mo117792o() && halfScreenManger.f247569b) {
                halfScreenManger.f247569b = false;
                C87801f fVar = new C87801f(halfScreenManger);
                C85007k kVar = halfScreenManger.f247571d;
                if (kVar != null) {
                    kVar.mo117953h(C84933h.APPEAR, fVar);
                }
            }
        }
    }

    public ContentResolver getContentResolver() {
        return getApplicationContext() != null ? getApplicationContext().getContentResolver() : super.getContentResolver();
    }

    public LayoutInflater getLayoutInflater() {
        return mo117120m8();
    }

    public final String getLocalClassName() {
        if (getComponentName() != null) {
            return super.getLocalClassName();
        }
        String packageName = MMApplicationContext.getPackageName();
        String name = getClass().getName();
        int length = packageName.length();
        return (!name.startsWith(packageName) || name.length() <= length || name.charAt(length) != '.') ? name : name.substring(length + 1);
    }

    public final Resources getResources() {
        if (this.f246490H == null) {
            this.f246490H = super.getResources();
        }
        return this.f246490H;
    }

    public Object getSystemService(String str) {
        return "layout_inflater".equals(str) ? mo117120m8() : "accessibility".equals(str) ? getApplicationContext().getSystemService(str) : super.getSystemService(str);
    }

    /* renamed from: i8 */
    public void mo117117i8(String str, int i) {
        if (this.f246504x || this.f246505y) {
            Log.m105924i("MicroMsg.AppBrandUI", "has recreateProcess!");
            return;
        }
        if (i == 1) {
            try {
                this.f246505y = true;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandUI", e, "recreate Activity exception", new Object[0]);
                finish();
                return;
            }
        } else if (i == 0) {
            this.f246504x = true;
        }
        Pair<AppBrandInitConfigWC, AppBrandStatObject> k8 = mo117119k8(getIntent());
        AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) k8.first;
        appBrandInitConfigWC.f239374e1 = Util.nowMilliSecond();
        appBrandInitConfigWC.f234800D = Util.nowMilliSecond();
        Intent intent = getIntent();
        intent.putExtra("key_appbrand_init_config", appBrandInitConfigWC);
        intent.putExtra("key_appbrand_stat_object", (AppBrandStatObject) k8.second);
        setIntent(intent);
        AppBrandProcessSuicideLogic.f238431h.f238433e.set(true);
        Log.m105925i("MicroMsg.AppBrandUI", "recreate Activity[%s] by %s", getClass().getSimpleName(), str);
        recreate();
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return new AppBrandUI$$c(this, super.importUIComponents());
    }

    public final void initActivityCloseAnimation() {
    }

    public final void initActivityOpenAnimation(Intent intent) {
        if (intent == null || intent.getComponent() == null || !intent.getComponent().equals(getComponentName())) {
            super.initActivityOpenAnimation(intent);
        }
    }

    public boolean isCallSuperOnSaveInstanceState() {
        return true;
    }

    /* renamed from: j8 */
    public final void mo117118j8(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        AppBrandInitConfigWC appBrandInitConfigWC2 = appBrandInitConfigWC;
        AppBrandStatObject appBrandStatObject2 = appBrandStatObject;
        if (this.f246502v == null) {
            this.f246502v = Boolean.FALSE;
        }
        if (this.f246502v.booleanValue() && !f246482Q && appBrandInitConfigWC2.f239379j1 != null && !appBrandInitConfigWC2.f239377h1) {
            f246482Q = true;
            C87829b a = C86709a0.m107531m().mo58407a();
            WeAppQualityAndroidProcessStartCostStruct weAppQualityAndroidProcessStartCostStruct = new WeAppQualityAndroidProcessStartCostStruct();
            weAppQualityAndroidProcessStartCostStruct.f236700d = weAppQualityAndroidProcessStartCostStruct.mo86045b("InstanceId", appBrandInitConfigWC2.f239379j1.f245832d, true);
            weAppQualityAndroidProcessStartCostStruct.f236701e = weAppQualityAndroidProcessStartCostStruct.mo86045b("AppId", appBrandInitConfigWC2.f239362d, true);
            weAppQualityAndroidProcessStartCostStruct.f236702f = (long) appBrandInitConfigWC2.f234802F;
            int i = appBrandInitConfigWC2.f239365g + 1;
            weAppQualityAndroidProcessStartCostStruct.f236703g = i != 1 ? i != 2 ? i != 3 ? null : WeAppQualityAndroidProcessStartCostStruct.C80760a.demo : WeAppQualityAndroidProcessStartCostStruct.C80760a.debug : WeAppQualityAndroidProcessStartCostStruct.C80760a.release;
            weAppQualityAndroidProcessStartCostStruct.f236704h = (long) (appBrandInitConfigWC2.f234841u + 1000);
            weAppQualityAndroidProcessStartCostStruct.f236706j = (long) appBrandStatObject2.f245533f;
            long j = appBrandInitConfigWC2.f239374e1;
            weAppQualityAndroidProcessStartCostStruct.f236707k = j;
            weAppQualityAndroidProcessStartCostStruct.mo86048e("StartTimeStampMs", j);
            long j2 = a.f124992e.f124993a;
            weAppQualityAndroidProcessStartCostStruct.f236708l = j2;
            weAppQualityAndroidProcessStartCostStruct.mo86048e("EndTimeStampMs", j2);
            long j3 = weAppQualityAndroidProcessStartCostStruct.f236708l - weAppQualityAndroidProcessStartCostStruct.f236707k;
            weAppQualityAndroidProcessStartCostStruct.f236705i = j3;
            weAppQualityAndroidProcessStartCostStruct.mo86046c("CostTimeMs", j3);
            weAppQualityAndroidProcessStartCostStruct.f236709m = (long) appBrandInitConfigWC2.f234835p;
            weAppQualityAndroidProcessStartCostStruct.mo86054n();
            WeAppQualityAndroidWebViewPreInitCostStruct weAppQualityAndroidWebViewPreInitCostStruct = new WeAppQualityAndroidWebViewPreInitCostStruct();
            weAppQualityAndroidWebViewPreInitCostStruct.f236715d = weAppQualityAndroidWebViewPreInitCostStruct.mo86045b("InstanceId", appBrandInitConfigWC2.f239379j1.f245832d, true);
            weAppQualityAndroidWebViewPreInitCostStruct.f236716e = weAppQualityAndroidWebViewPreInitCostStruct.mo86045b("AppId", appBrandInitConfigWC2.f239362d, true);
            weAppQualityAndroidWebViewPreInitCostStruct.f236717f = (long) appBrandInitConfigWC2.f234802F;
            int i2 = appBrandInitConfigWC2.f239365g + 1;
            weAppQualityAndroidWebViewPreInitCostStruct.f236718g = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : WeAppQualityAndroidWebViewPreInitCostStruct.C80761a.demo : WeAppQualityAndroidWebViewPreInitCostStruct.C80761a.debug : WeAppQualityAndroidWebViewPreInitCostStruct.C80761a.release;
            weAppQualityAndroidWebViewPreInitCostStruct.f236719h = (long) (appBrandInitConfigWC2.f234841u + 1000);
            weAppQualityAndroidWebViewPreInitCostStruct.f236721j = (long) appBrandStatObject2.f245533f;
            long j4 = C86292a.f250909a;
            weAppQualityAndroidWebViewPreInitCostStruct.f236722k = j4;
            weAppQualityAndroidWebViewPreInitCostStruct.mo86048e("StartTimeStampMs", j4);
            long j5 = C86292a.f250910b;
            weAppQualityAndroidWebViewPreInitCostStruct.f236723l = j5;
            weAppQualityAndroidWebViewPreInitCostStruct.mo86048e("EndTimeStampMs", j5);
            C87829b bVar = a;
            long j6 = weAppQualityAndroidWebViewPreInitCostStruct.f236723l - weAppQualityAndroidWebViewPreInitCostStruct.f236722k;
            weAppQualityAndroidWebViewPreInitCostStruct.f236720i = j6;
            weAppQualityAndroidWebViewPreInitCostStruct.mo86046c("CostTimeMs", j6);
            int i3 = AppBrandUI$$d.f246513a[WebView.getCurrentModuleWebCoreType().ordinal()];
            if (i3 == 1) {
                weAppQualityAndroidWebViewPreInitCostStruct.f236724m = 3;
            } else if (i3 == 2) {
                weAppQualityAndroidWebViewPreInitCostStruct.f236724m = 3;
            } else if (i3 == 3) {
                weAppQualityAndroidWebViewPreInitCostStruct.f236724m = 4;
            } else if (i3 == 4) {
                weAppQualityAndroidWebViewPreInitCostStruct.f236724m = 2;
            }
            weAppQualityAndroidWebViewPreInitCostStruct.mo86054n();
            WeAppQualityAndroidMMKernelStartupCostStruct weAppQualityAndroidMMKernelStartupCostStruct = new WeAppQualityAndroidMMKernelStartupCostStruct();
            weAppQualityAndroidMMKernelStartupCostStruct.f236656d = weAppQualityAndroidMMKernelStartupCostStruct.mo86045b("InstanceId", appBrandInitConfigWC2.f239379j1.f245832d, true);
            weAppQualityAndroidMMKernelStartupCostStruct.f236657e = weAppQualityAndroidMMKernelStartupCostStruct.mo86045b("AppId", appBrandInitConfigWC2.f239362d, true);
            weAppQualityAndroidMMKernelStartupCostStruct.f236658f = (long) appBrandInitConfigWC2.f234802F;
            int i4 = appBrandInitConfigWC2.f239365g + 1;
            weAppQualityAndroidMMKernelStartupCostStruct.f236659g = i4 != 1 ? i4 != 2 ? i4 != 3 ? null : WeAppQualityAndroidMMKernelStartupCostStruct.C80757a.demo : WeAppQualityAndroidMMKernelStartupCostStruct.C80757a.debug : WeAppQualityAndroidMMKernelStartupCostStruct.C80757a.release;
            weAppQualityAndroidMMKernelStartupCostStruct.f236660h = (long) (appBrandInitConfigWC2.f234841u + 1000);
            weAppQualityAndroidMMKernelStartupCostStruct.f236662j = (long) appBrandStatObject2.f245533f;
            C87829b bVar2 = bVar;
            long j7 = bVar2.f124992e.f124993a;
            weAppQualityAndroidMMKernelStartupCostStruct.f236663k = j7;
            weAppQualityAndroidMMKernelStartupCostStruct.mo86048e("StartTimeStampMs", j7);
            long j8 = bVar2.f124992e.f125000h;
            weAppQualityAndroidMMKernelStartupCostStruct.f236664l = j8;
            weAppQualityAndroidMMKernelStartupCostStruct.mo86048e("EndTimeStampMs", j8);
            long j9 = weAppQualityAndroidMMKernelStartupCostStruct.f236664l - weAppQualityAndroidMMKernelStartupCostStruct.f236663k;
            weAppQualityAndroidMMKernelStartupCostStruct.f236661i = j9;
            weAppQualityAndroidMMKernelStartupCostStruct.mo86046c("CostTimeMs", j9);
            weAppQualityAndroidMMKernelStartupCostStruct.f236665m = C86292a.f250911c ? 1 : 0;
            weAppQualityAndroidMMKernelStartupCostStruct.mo86054n();
        }
    }

    /* renamed from: k8 */
    public Pair<AppBrandInitConfigWC, AppBrandStatObject> mo117119k8(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.setClassLoader(AppBrandInitConfigWC.class.getClassLoader());
            AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) extras.getParcelable("key_appbrand_init_config");
            extras.setClassLoader(AppBrandStatObject.class.getClassLoader());
            AppBrandStatObject appBrandStatObject = (AppBrandStatObject) extras.getParcelable("key_appbrand_stat_object");
            if (appBrandInitConfigWC == null || appBrandStatObject == null) {
                Log.m105921e("MicroMsg.AppBrandUI", "retrieveLaunchParams, config:(%b)%s, stat:(%b)%s", Boolean.valueOf(extras.containsKey("key_appbrand_init_config")), appBrandInitConfigWC, Boolean.valueOf(extras.containsKey("key_appbrand_stat_object")), appBrandStatObject);
            }
            if (appBrandInitConfigWC == null) {
                throw new NullPointerException("config is NULL");
            } else if (appBrandStatObject != null) {
                return Pair.create(appBrandInitConfigWC, appBrandStatObject);
            } else {
                throw new NullPointerException("stat is NULL");
            }
        } else {
            throw new NullPointerException("intent.getExtras() returns NULL");
        }
    }

    /* renamed from: l8 */
    public boolean mo117074l8() {
        Boolean bool = this.f246494L;
        if (bool != null) {
            return bool.booleanValue();
        }
        PackageManager packageManager = MMApplicationContext.getContext().getPackageManager();
        ActivityInfo activityInfo = null;
        try {
            ComponentName componentName = getComponentName();
            if (componentName == null) {
                componentName = new ComponentName(MMApplicationContext.getContext(), getClass());
            }
            activityInfo = packageManager.getActivityInfo(componentName, 128);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandUI", "runInStandaloneTask, resolve info e = %s", e);
        }
        if (activityInfo == null) {
            return true;
        }
        Boolean valueOf = Boolean.valueOf(!MMApplicationContext.getPackageName().equals(activityInfo.taskAffinity));
        this.f246494L = valueOf;
        return valueOf.booleanValue();
    }

    /* renamed from: m8 */
    public final LayoutInflater mo117120m8() {
        LayoutInflater layoutInflater;
        LayoutInflater layoutInflater2 = this.f246489G;
        if (layoutInflater2 != null) {
            return layoutInflater2;
        }
        synchronized (this.f246488F) {
            if (this.f246489G == null) {
                LayoutInflater layoutInflater3 = (LayoutInflater) C111105a.m151502d(getApplicationContext(), LayoutInflater.class);
                Objects.requireNonNull(layoutInflater3);
                LayoutInflater cloneInContext = layoutInflater3.cloneInContext(this);
                this.f246489G = cloneInContext;
                C76577a.m92165p(cloneInContext.getContext());
                C85868k2.C85870b bVar = new C85868k2.C85870b((C85868k2.C85869a) null);
                bVar.f250144d = cloneInContext;
                cloneInContext.setFactory(bVar);
            }
            layoutInflater = this.f246489G;
        }
        return layoutInflater;
    }

    public final boolean moveTaskToBack(boolean z) {
        AppBrandInitConfigWC appBrandInitConfigWC;
        C84287e0.f246157a.mo116975a(this, String.format(Locale.ENGLISH, "moveTaskToBack(%b)", new Object[]{Boolean.valueOf(z)}));
        Log.m105924i("MicroMsg.AppBrandUI", "moveTaskToBack stack:" + android.util.Log.getStackTraceString(new Throwable()));
        C2027y2.m1979c(this);
        try {
            appBrandInitConfigWC = (AppBrandInitConfigWC) this.mRuntimeContainer.getActiveRuntime().mo113036W();
        } catch (Exception unused) {
            appBrandInitConfigWC = null;
        }
        try {
            C84580q2 q2Var = this.f246498r;
            if (q2Var != null) {
                if (q2Var.mo117268a(this, appBrandInitConfigWC) ? AppBrandUIMoveTaskToBackStubUI.f246524g.mo117145c(this, AppBrandUIMoveTaskToBackStubUI.C84460a.C84461a.MoveTaskToBack) : false) {
                    C84287e0.f246157a.mo116975a(this, "moveTaskToBack use android12 workaround");
                    if (!isFinishing() && !this.f246506z && appBrandInitConfigWC != null) {
                        mo117071c8(appBrandInitConfigWC);
                    }
                    return true;
                }
            }
            boolean moveTaskToBack = super.moveTaskToBack(z);
            if (!isFinishing() && !this.f246506z && appBrandInitConfigWC != null) {
                mo117071c8(appBrandInitConfigWC);
            }
            return moveTaskToBack;
        } catch (NullPointerException e) {
            Log.m105921e("MicroMsg.AppBrandUI", "moveTaskToBack() get exception %s, invoke finish()", e);
            finish();
            if (!isFinishing() && !this.f246506z && appBrandInitConfigWC != null) {
                mo117071c8(appBrandInitConfigWC);
            }
            return true;
        } catch (Throwable th) {
            if (!isFinishing() && !this.f246506z && appBrandInitConfigWC != null) {
                mo117071c8(appBrandInitConfigWC);
            }
            throw th;
        }
    }

    /* renamed from: n8 */
    public final boolean mo117121n8(boolean z) {
        C84287e0.f246157a.mo116975a(this, String.format(Locale.ENGLISH, "super_moveTaskToBack(%b)", new Object[]{Boolean.valueOf(z)}));
        Log.m105924i("MicroMsg.AppBrandUI", "super_moveTaskToBack stack:" + android.util.Log.getStackTraceString(new Throwable()));
        return super.moveTaskToBack(z);
    }

    /* renamed from: o8 */
    public void mo117122o8(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C89916g.m112446a(this).mo124233g(i, i2, intent);
        if (intent != null && "jsapi_pay_onActivityResult".equals(intent.getStringExtra("key_jsapi_pay_onActivityResult")) && i2 == 5) {
            C76879j.m92711E(this, intent.getStringExtra("key_jsapi_pay_err_msg"), "", intent.getStringExtra("key_jsapi_pay_err_dialog_confirm"), false, new AppBrandUI$$l(this));
        }
    }

    public void onBackPressed() {
        C84287e0.f246157a.mo116975a(this, "onBackPressed");
        super.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2;
        boolean z = true;
        Log.m105925i("MicroMsg.AppBrandUI", "onConfigurationChanged newConfig: %s", Integer.valueOf(configuration.orientation));
        super.onConfigurationChanged(configuration);
        Configuration configuration3 = this.f246503w;
        if (configuration3 != null) {
            if (configuration.smallestScreenWidthDp != configuration3.smallestScreenWidthDp && AppBrandRuntimeWCAccessible.isGame(this.mRuntimeContainer.getActiveRuntime())) {
                Log.m105925i("MicroMsg.AppBrandUI", "onConfigurationChanged by fold or unfold, last.smallestScreenWidthDp[%d], new.smallestScreenWidthDp[%d]", Integer.valueOf(this.f246503w.smallestScreenWidthDp), Integer.valueOf(configuration.smallestScreenWidthDp));
                mo117117i8("multiWindowMode", 1);
                return;
            }
        }
        AppBrandRuntime activeRuntime = this.mRuntimeContainer.getActiveRuntime();
        if (activeRuntime == null || (configuration2 = this.f246503w) == null || !C91577a.m114917a((AppBrandRuntimeWC) activeRuntime, configuration2, configuration)) {
            this.f246503w = new Configuration(configuration);
            C84944a aVar = this.f246496p;
            aVar.getClass();
            Log.m105925i("MicroMsg.AppBrandFixInputIssuesActivityHelper", "onActivityConfigurationChanged, orientation %d", Integer.valueOf(configuration.orientation));
            if (aVar.f247592b) {
                aVar.f247591a.isFinishing();
            }
            AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
            Configuration configuration4 = appBrandRuntimeContainerWC.f250648d.getResources().getConfiguration();
            if (configuration4 != null && configuration4.screenWidthDp == configuration.screenWidthDp && configuration4.screenHeightDp == configuration.screenHeightDp && configuration4.smallestScreenWidthDp == configuration.smallestScreenWidthDp) {
                z = false;
            }
            if (z) {
                synchronized (appBrandRuntimeContainerWC.f250652h) {
                    appBrandRuntimeContainerWC.f250652h.clear();
                }
            }
            appBrandRuntimeContainerWC.f250648d.getResources().getConfiguration().updateFrom(configuration);
            appBrandRuntimeContainerWC.getOrientationHandler().onConfigurationChanged(configuration);
            appBrandRuntimeContainerWC.f250649e.mo120542b(configuration);
            appBrandRuntimeContainerWC.mo113155r0(configuration);
            AppBrandRuntime activeRuntime2 = this.mRuntimeContainer.getActiveRuntime();
            if (activeRuntime2 != null) {
                try {
                    activeRuntime2.mo113042Z().getCurrentPage().onConfigurationChanged(configuration);
                } catch (NullPointerException unused) {
                }
            }
        } else {
            mo117117i8("darkModeTheme", 2);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        boolean z;
        Bundle bundle2 = bundle;
        long currentTicks = Util.currentTicks();
        C84287e0 e0Var = C84287e0.f246157a;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        objArr[0] = bundle2 == null ? "null" : Integer.valueOf(bundle.hashCode());
        e0Var.mo116975a(this, String.format(locale, "onCreate(%s)", objArr));
        C81176n.C81177a aVar = C81176n.f238499a;
        aVar.f238503b.put(hashCode(), 1);
        Log.m105925i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "setSkipMiscPreload %b", Boolean.TRUE);
        C81176n.f238500b = true;
        Log.m105925i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "alive activity count %d", Integer.valueOf(aVar.f238503b.size()));
        if (IntentUtil.getBooleanExtra(getIntent(), "key_disable_animation", false)) {
            setTheme(C84532g3.m104119a(false));
        } else {
            setTheme(C84532g3.m104119a(mo117074l8()));
        }
        if (!DebuggerShell.f239772d) {
            AccessibilityUtil.smartDisableAccessibility();
        }
        try {
            C87690d.m109091b("[AppBrandUILifeCycleSpeedProfile] AppBrandUI.super.onCreate", new AppBrandUI$$f(this, bundle2));
            if (bundle2 != null && bundle2.containsKey("com.tencent.mm.plugin.appbrand.ui.AppBrandUI.SAVED_INSTANCE_STATE_KEY_OVERRIDE_INTENT")) {
                try {
                    Intent intent = (Intent) bundle2.getParcelable("com.tencent.mm.plugin.appbrand.ui.AppBrandUI.SAVED_INSTANCE_STATE_KEY_OVERRIDE_INTENT");
                    if (intent != null) {
                        if (!mo117074l8()) {
                            str = "!runInStandaloneTask";
                            z = false;
                        } else if (getIntent() == null) {
                            str = "NULL==getIntent()";
                            z = true;
                        } else {
                            z = ((AppBrandInitConfigWC) mo117119k8(intent).first).f234800D > ((AppBrandInitConfigWC) mo117119k8(getIntent()).first).f234800D;
                            str = "override.clickTimestamp() > original.clickTimestamp()";
                        }
                        if (z) {
                            Log.m105925i("MicroMsg.AppBrandUI", "onCreate %d, overrideIntent is applied, reason:%s", Integer.valueOf(hashCode()), str);
                            setIntent(intent);
                        }
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandUI", "onCreate %d, try use overrideIntent, exception:%s", Integer.valueOf(hashCode()), e);
                }
            }
            if (getIntent() == null) {
                Log.m105921e("MicroMsg.AppBrandUI", "onCreate %d, null intent", Integer.valueOf(hashCode()));
                finish();
                return;
            }
            Log.m105925i("MicroMsg.AppBrandUI", "[AppBrandUILifeCycleSpeedProfile] onCreate %d, intent.flags = %d, super.onCreate() cost %dms", Integer.valueOf(hashCode()), Integer.valueOf(getIntent().getFlags()), Long.valueOf(Util.currentTicks() - currentTicks));
            this.f246500t = true;
            C87690d.m109091b("[AppBrandUILifeCycleSpeedProfile] onCreate stuffs " + getLocalClassName(), new AppBrandUI$$g(this));
            View view = this.f247089j;
            if (view instanceof C87794b) {
                ((C87794b) view).setRuntimeContainer(this.mRuntimeContainer);
            }
            C2027y2.m1978b(this);
            mo117112f8(getIntent(), "onCreate");
            C84580q2 q2Var = this.f246498r;
            if (q2Var != null) {
                q2Var.mo117269b(this, getIntent());
            }
            C84007j jVar = C84007j.C84008a.f245257a;
            if (System.currentTimeMillis() % 100 == 1 || WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv() || BuildInfo.IS_FLAVOR_RED) {
                Log.m105924i("MicroMsg.MemoryNegativeFeedbackReporter", "register");
                C84004i iVar = new C84004i(jVar);
                jVar.f245256a = iVar;
                registerComponentCallbacks(iVar);
            }
            getLifecycle().addObserver(this.f246497q);
            AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) this.mRuntimeContainer.getActiveRuntime();
            if (appBrandRuntimeWC != null) {
                HalfScreenManger halfScreenManger = appBrandRuntimeWC.f238298z1;
                halfScreenManger.f247572e.reset();
                halfScreenManger.mo117795r(100);
                if (halfScreenManger.mo117782e().mo76931c() && halfScreenManger.mo117792o()) {
                    halfScreenManger.f247569b = true;
                    ViewParent parent = halfScreenManger.f247568a.f238153r.getParent();
                    C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
                    View view2 = (View) parent;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(4);
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger", "onActivityCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger", "onActivityCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.AppBrandUI).mo86179qs(this, C76986a.MiniProgram);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.AppBrandUI", th, "%s.onCreate", getLocalClassName());
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                if (!((Boolean) declaredField.get(this)).booleanValue()) {
                    super.onCreate(bundle);
                }
            } catch (Exception unused) {
            }
            finish();
        }
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        C84944a aVar = this.f246496p;
        Activity activity = aVar.f247591a;
        if (activity != null && activity.getWindow() != null) {
            aVar.f247591a.getWindow().setSoftInputMode(16);
        }
    }

    public void onDestroy() {
        C84174u uVar;
        long j;
        AppBrandRuntimeContainerWC appBrandRuntimeContainerWC;
        C84287e0.f246157a.mo116975a(this, "onDestroy");
        C81176n.C81177a.m99462a(C81176n.f238499a, this);
        C2027y2.m1979c(this);
        AppBrandUIMoveTaskToBackStubUI.C84460a aVar = AppBrandUIMoveTaskToBackStubUI.f246524g;
        int hashCode = hashCode();
        Bitmap bitmap = (Bitmap) C84767n0.m104424a(AppBrandUIMoveTaskToBackStubUI.f246525h, hashCode);
        if (bitmap != null) {
            bitmap.recycle();
        }
        AppBrandUIMoveTaskToBackStubUI.f246526i.remove(hashCode);
        mo117106V7();
        if (!this.f246504x && !isChangingConfigurations() && (appBrandRuntimeContainerWC = this.mRuntimeContainer) != null) {
            appBrandRuntimeContainerWC.mo113160v0(AppBrandRuntimeContainerWC.C81084d.OnDestroy, this.f246483A);
        }
        AppBrandRuntimeContainerWC appBrandRuntimeContainerWC2 = this.mRuntimeContainer;
        if (appBrandRuntimeContainerWC2 != null) {
            Iterator it = new LinkedList(appBrandRuntimeContainerWC2.f238205j).iterator();
            while (it.hasNext()) {
                C86812g gVar = (C86812g) it.next();
                if ((gVar instanceof AppBrandRuntimeWC) && (uVar = ((AppBrandRuntimeWC) gVar).f238268D1) != null) {
                    AppBrandCloseReasonStruct appBrandCloseReasonStruct = new AppBrandCloseReasonStruct();
                    Long l = uVar.f245822a;
                    appBrandCloseReasonStruct.f236339e = l != null ? l.longValue() : -1;
                    appBrandCloseReasonStruct.f236338d = appBrandCloseReasonStruct.mo86045b("appId", uVar.f245823b, true);
                    appBrandCloseReasonStruct.f236342h = appBrandCloseReasonStruct.mo86045b("flags", C84180a.f245866a.mo116874a(), true);
                    appBrandCloseReasonStruct.f236341g = 1;
                    appBrandCloseReasonStruct.f236343i = appBrandCloseReasonStruct.mo86045b("sessionId", uVar.f245824c, true);
                    if (uVar.f245825d == null) {
                        j = 0;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        Long l2 = uVar.f245825d;
                        C87412m.m108591d(l2);
                        j = currentTimeMillis - l2.longValue();
                    }
                    appBrandCloseReasonStruct.f236340f = j;
                    Log.m105919d("MicroMsg.kv_21804", "onDestroyReport: process[%s]" + appBrandCloseReasonStruct.mo1006q(), MMApplicationContext.getProcessName());
                    appBrandCloseReasonStruct.mo86054n();
                }
            }
            LinkedList linkedList = new LinkedList();
            linkedList.addAll(appBrandRuntimeContainerWC2.f238205j);
            linkedList.addAll(appBrandRuntimeContainerWC2.f238206n.values());
            appBrandRuntimeContainerWC2.mo113117M((String) null);
            Iterator it4 = linkedList.iterator();
            while (it4.hasNext()) {
                AppBrandRuntime appBrandRuntime = (AppBrandRuntime) it4.next();
                appBrandRuntime.f238136Z = false;
                appBrandRuntimeContainerWC2.mo113134k(appBrandRuntime);
            }
            Log.m105924i("MicroMsg.AppBrandRuntimeContainer", "cleanup");
            appBrandRuntimeContainerWC2.mo113126f0();
            Context context = appBrandRuntimeContainerWC2.f250648d;
            if (context instanceof C84543i2) {
                ((C84543i2) context).setBaseContext(MMApplicationContext.getContext());
            }
            appBrandRuntimeContainerWC2.mo120546A(MMApplicationContext.getContext());
        }
        C88535h hVar = this.f246499s;
        if (hVar != null) {
            try {
                MMApplicationContext.getContext().unregisterReceiver(hVar.f255737a);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.BaseAppBrandUIHomePressReceiver", "unregister screen off receiver e = " + e);
            }
        }
        C77398g gVar2 = this.f246492J;
        if (gVar2 != null) {
            gVar2.dismiss();
        }
        super.onDestroy();
        ((ViewGroup) this.f247089j).removeAllViews();
        C87771d c = C87771d.m109204c(this);
        if (c != null) {
            c.mo122179a();
        }
        ComponentCallbacks2 componentCallbacks2 = C84007j.C84008a.f245257a.f245256a;
        if (componentCallbacks2 != null) {
            unregisterComponentCallbacks(componentCallbacks2);
        }
        C89916g.m112447b(this);
        AndroidContextUtil.fixInputMethodManagerLeak(this);
    }

    public void onEnterAnimationComplete() {
        C84287e0.f246157a.mo116975a(this, "onEnterAnimationComplete");
        C84672s2 s2Var = (C84672s2) C39818r.f106831a.mo62444c(this).mo75002a(C84672s2.class);
        s2Var.f247028f.removeCallbacks(s2Var.f247029g);
        ((C84672s2.C84673a) s2Var.f247029g).run();
        mo117106V7();
        AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
        if (appBrandRuntimeContainerWC != null && appBrandRuntimeContainerWC.getStackSize() == 1) {
            ((AppBrandRuntimeWC) appBrandRuntimeContainerWC.getActiveRuntime()).mo113199d2();
        }
        AppBrandUIMoveTaskToBackStubUI.f246524g.mo117143a();
        mo117113g8();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x009f A[LOOP:0: B:22:0x009f->B:25:0x00af, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNewIntent(android.content.Intent r9) {
        /*
            r8 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r9
            int r2 = r8.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r0[r3] = r2
            boolean r2 = r8.isFinishing()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4 = 2
            r0[r4] = r2
            java.lang.String r2 = "MicroMsg.AppBrandUI"
            java.lang.String r4 = "onNewIntent %s, %d, isFinishing:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r0)
            com.tencent.mm.plugin.appbrand.task.e0 r0 = com.tencent.p014mm.plugin.appbrand.task.C84287e0.f246157a
            java.lang.String r4 = "onNewIntent"
            r0.mo116975a(r8, r4)
            com.tencent.mm.plugin.appbrand.app.n$a r0 = com.tencent.p014mm.plugin.appbrand.app.C81176n.f238499a
            android.util.SparseIntArray r5 = r0.f238503b
            int r6 = r8.hashCode()
            r5.put(r6, r3)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5[r1] = r6
            java.lang.String r6 = "MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]"
            java.lang.String r7 = "setSkipMiscPreload %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r5)
            com.tencent.p014mm.plugin.appbrand.app.C81176n.f238500b = r3
            java.lang.Object[] r5 = new java.lang.Object[r3]
            android.util.SparseIntArray r0 = r0.f238503b
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r1] = r0
            java.lang.String r0 = "alive activity count %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r5)
            boolean r0 = r8.isFinishing()
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r8.isDestroyed()
            if (r0 != 0) goto L_0x00d4
            if (r9 != 0) goto L_0x0067
            goto L_0x00d4
        L_0x0067:
            r8.f246501u = r3
            java.lang.String r0 = "key_appbrand_bring_ui_to_front"
            boolean r0 = r9.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0075
            r8.mo117107W7()
            return
        L_0x0075:
            com.tencent.p014mm.plugin.appbrand.p026ui.C2027y2.m1978b(r8)
            java.lang.String r0 = "key_appbrand_init_config"
            android.os.Parcelable r0 = r9.getParcelableExtra(r0)
            if (r0 == 0) goto L_0x0082
            r0 = 1
            goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            if (r0 != 0) goto L_0x00b2
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r0 = r8.mRuntimeContainer
            if (r0 != 0) goto L_0x008b
            r0 = 0
            goto L_0x008f
        L_0x008b:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r0.getActiveRuntime()
        L_0x008f:
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = r0.f238147j
            js0.l<java.lang.String, com.tencent.mm.plugin.appbrand.l$b> r1 = com.tencent.p014mm.plugin.appbrand.C83231l.f243085e
            java.util.Set r0 = r1.mo122463d(r0)
            if (r0 == 0) goto L_0x00b1
            java.util.Iterator r0 = r0.iterator()
        L_0x009f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b1
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.appbrand.l$b r1 = (com.tencent.p014mm.plugin.appbrand.C83231l.C83232b) r1
            boolean r1 = r1.onNewIntent(r9)
            if (r1 == 0) goto L_0x009f
        L_0x00b1:
            return
        L_0x00b2:
            super.onNewIntent(r9)     // Catch:{ all -> 0x00c3 }
            nj3.C88990b.m111193b(r8)
            r8.mo117112f8(r9, r4)
            com.tencent.mm.plugin.appbrand.ui.q2 r0 = r8.f246498r
            if (r0 == 0) goto L_0x00c2
            r0.mo117269b(r8, r9)
        L_0x00c2:
            return
        L_0x00c3:
            r9 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = r8.getLocalClassName()
            r0[r1] = r3
            java.lang.String r1 = "%s.onNewIntent"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r9, r1, r0)
            r8.mo117107W7()
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI.onNewIntent(android.content.Intent):void");
    }

    public void onPause() {
        C84287e0.f246157a.mo116975a(this, "onPause");
        mo117106V7();
        super.onPause();
        MMHandlerThread.postToMainThread(new C29666j3(this, new AppBrandUI$$k(this)));
        this.f246500t = false;
        this.f246501u = false;
        AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
        appBrandRuntimeContainerWC.getClass();
        Log.m105925i("MicroMsg.AppBrandRuntimeContainer", "onPause tid = %d", Long.valueOf(Thread.currentThread().getId()));
        appBrandRuntimeContainerWC.mo113135k0(new C81598c1(appBrandRuntimeContainerWC));
        C86117l b = C86117l.m106615b(this);
        Log.m105918d(b.f250631a, "onPause");
        synchronized (b.f250634d) {
            C84800z1 z1Var = b.f250635e;
            if (z1Var != null) {
                z1Var.disable();
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        AppBrandRuntime activeRuntime = this.mRuntimeContainer.getActiveRuntime();
        Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
        if ((activeRuntime instanceof AppBrandRuntimeWC) && activeRuntime.mo113071o0()) {
            C81116f fVar = new C81116f();
            fVar.f238391i = "launch";
            fVar.mo113281s((C88267e) ((AppBrandRuntimeWC) activeRuntime).f238150p);
        }
        try {
            if (this.mRuntimeContainer.getActiveRuntime() != null) {
                ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(4, "AppBrandUI_" + ((C86812g) this.mRuntimeContainer.getActiveRuntime()).f238147j, hashCode());
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.AppBrandUI", th, "[oneliang]AppBrandUI click flow exception.", new Object[0]);
        }
        AppBrandRuntimeWCAccessible.isGame(this.mRuntimeContainer.getActiveRuntime());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Iterator<RUNTIME> it = this.mRuntimeContainer.f238205j.iterator();
        while (it.hasNext()) {
            C91085v.m114269d(((AppBrandRuntime) it.next()).f238147j, i, strArr, iArr, false);
        }
        C89916g.m112446a(this).mo124234h(i, strArr, iArr);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C84287e0.f246157a.mo116975a(this, "onRestoreInstanceState");
    }

    public void onResume() {
        C84287e0.f246157a.mo116975a(this, "onResume");
        try {
            C87690d.m109091b("[AppBrandUILifeCycleSpeedProfile] AppBrandUI.super.onResume()", new AppBrandUI$$j(this));
            Log.m105925i("MicroMsg.AppBrandUI", "onResume %d", Integer.valueOf(hashCode()));
            int i = (!mo117074l8() || this.f246500t || this.f246501u) ? 0 : 2;
            AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) this.mRuntimeContainer.getActiveRuntime();
            if (appBrandRuntimeWC != null) {
                Log.m105925i("MicroMsg.AppBrandUI", "onResume, appId = %s, systemRecentsReason = %d", appBrandRuntimeWC.f238147j, Integer.valueOf(i));
                appBrandRuntimeWC.mo113210l1().f234835p = i;
            }
            this.f246501u = false;
            this.f246500t = false;
            this.f246484B = false;
            this.mRuntimeContainer.mo113123d0();
            C86117l b = C86117l.m106615b(this);
            Log.m105918d(b.f250631a, "onResume");
            b.mo120539a(false);
            AppBrandRuntime activeRuntime = this.mRuntimeContainer.getActiveRuntime();
            Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
            if (activeRuntime instanceof AppBrandRuntimeWC) {
                C88267e eVar = (C88267e) ((AppBrandRuntimeWC) activeRuntime).f238150p;
                if (activeRuntime.mo113071o0() && eVar != null) {
                    C81118g gVar = new C81118g();
                    gVar.f238395i = "launch";
                    gVar.mo113282s(eVar);
                }
            }
            try {
                if (this.mRuntimeContainer.getActiveRuntime() != null) {
                    ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(3, "AppBrandUI_" + ((C86812g) this.mRuntimeContainer.getActiveRuntime()).f238147j, hashCode());
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.AppBrandUI", th, "[oneliang]AppBrandUI click flow exception.", new Object[0]);
            }
            AppBrandRuntimeWCAccessible.isGame(this.mRuntimeContainer.getActiveRuntime());
            mo117107W7();
            C84287e0.f246157a.mo116975a(this, "onResumed");
        } catch (BadParcelableException unused) {
            Log.m105920e("MicroMsg.AppBrandUI", "onResume BadParcelableException occurs, just finish");
            finish();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C84287e0.f246157a.mo116975a(this, "onSaveInstanceState");
        try {
            mo117119k8(getIntent());
            bundle.putParcelable("com.tencent.mm.plugin.appbrand.ui.AppBrandUI.SAVED_INSTANCE_STATE_KEY_OVERRIDE_INTENT", getIntent());
            Log.m105925i("MicroMsg.AppBrandUI", "onSaveInstanceState override intent is saved, instance:%d", Integer.valueOf(hashCode()));
        } catch (Exception unused) {
        }
    }

    public void onStart() {
        C84287e0 e0Var = C84287e0.f246157a;
        e0Var.mo116975a(this, "onStart");
        super.onStart();
        boolean z = false;
        this.f246483A = false;
        this.f246484B = false;
        AppBrandUIMoveTaskToBackStubUI.f246524g.mo117143a();
        AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) this.mRuntimeContainer.getActiveRuntime();
        if (appBrandRuntimeWC != null) {
            String str = appBrandRuntimeWC.f238147j;
            C87412m.m108594g(str, "appId");
            String str2 = WeChatProcess.PROCESS_MAIN;
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                XIPCInvoker.m98748a(str2, new IPCString(str), C84481a3.class, (C1256g) null);
            }
        }
        mo117107W7();
        e0Var.mo116975a(this, "onStarted");
    }

    public void onStop() {
        AppBrandRuntimeWC a;
        C84287e0.f246157a.mo116975a(this, "onStop");
        C81176n.C81177a.m99462a(C81176n.f238499a, this);
        super.onStop();
        this.f246483A = true;
        AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
        AppBrandRuntime activeRuntime = appBrandRuntimeContainerWC.getActiveRuntime();
        if (activeRuntime != null && activeRuntime.f238116N && !activeRuntime.f238117P && !activeRuntime.mo113064k0()) {
            activeRuntime.mo113052e("reportContainerActivityStopped", new Object[0]);
            if (activeRuntime.mo113054f0() instanceof C86127t) {
                activeRuntime.f238113K.f255667a.mo122987s(C88514d.C88522g.ON_CONTAINER_ACTIVITY_STOPPED, (Object) null);
            }
        }
        C86812g gVar = (C86812g) appBrandRuntimeContainerWC.getActiveRuntime();
        if (gVar != null) {
            AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) gVar;
            C79584a.C79585a aVar = C79584a.f233382a;
            if (aVar.mo109699b(appBrandRuntimeWC) && (a = aVar.mo109698a(appBrandRuntimeWC)) != null) {
                C85036x2 x2Var = a.f238266B1;
                x2Var.getClass();
                Log.m105924i("MicroMsg.EmbedHalfScreenWxaManager", "[onStop] mark down embedded wxa appid for re-show when host back to the front");
                x2Var.mo118004b(appBrandRuntimeWC);
            }
        }
        if (gVar != null && gVar.f238113K != null) {
            AppBrandSysConfigLU o1 = gVar.mo113051d0();
            long j = o1 == null ? 0 : (((long) o1.f261070p) * 1000) + 500;
            C88514d dVar = gVar.f238113K.f255667a;
            C88514d.C88522g gVar2 = C88514d.C88522g.CHECK_PROCESS_IMPORTANCE;
            if (j <= 0) {
                dVar.mo122987s(gVar2, (Object) null);
            } else {
                dVar.getHandler().postDelayed(new C88534g(dVar, gVar2, (Object) null), j);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
        AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
        if (appBrandRuntimeContainerWC != null) {
            appBrandRuntimeContainerWC.f250649e.mo120541a(layoutParams);
            appBrandRuntimeContainerWC.mo113154q0(layoutParams);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C84287e0 e0Var = C84287e0.f246157a;
        e0Var.mo116975a(this, "onWindowFocusChanged:" + z);
    }

    public void recreate() {
        C84287e0.f246157a.mo116975a(this, "recreate");
        super.recreate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b7, code lost:
        if (getResources().getConfiguration().orientation == 2) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c0, code lost:
        if (u24.C90595a.m113497a(f246481P, r11) != false) goto L_0x00c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRequestedOrientation(int r11) {
        /*
            r10 = this;
            java.util.Set<cr0.a$a> r0 = r10.f246493K
            java.util.HashSet r0 = (java.util.HashSet) r0
            int r0 = r0.size()
            r1 = 3
            r2 = 4
            r3 = 2
            java.lang.String r4 = "MicroMsg.AppBrandUI"
            r5 = 1
            r6 = 0
            if (r0 <= 0) goto L_0x004f
            java.util.LinkedList r0 = new java.util.LinkedList
            java.util.Set<cr0.a$a> r7 = r10.f246493K
            r0.<init>(r7)
            java.util.Iterator r7 = r0.iterator()
        L_0x001c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x004f
            java.lang.Object r8 = r7.next()
            cr0.a$a r8 = (cr0.C45150a.C45151a) r8
            boolean r9 = r8.mo70655a(r11)
            if (r9 == 0) goto L_0x001c
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r7 = r10.getLocalClassName()
            r2[r6] = r7
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r2[r5] = r11
            int r11 = r0.size()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r2[r3] = r11
            r2[r1] = r8
            java.lang.String r11 = "setRequestedOrientation name[%s], request[%d], hooks.size[%d] intercept by %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r11, r2)
            return
        L_0x004f:
            boolean r0 = r10.isFinishing()
            if (r0 != 0) goto L_0x0115
            boolean r0 = r10.isDestroyed()
            if (r0 == 0) goto L_0x005d
            goto L_0x0115
        L_0x005d:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r0 = r10.mRuntimeContainer
            if (r0 == 0) goto L_0x0072
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r0.getActiveRuntime()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC
            if (r0 == 0) goto L_0x0072
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r0 = r10.mRuntimeContainer
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r0.getActiveRuntime()
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r0
            goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            if (r0 == 0) goto L_0x0099
            boolean r7 = r0.mo113064k0()
            if (r7 != 0) goto L_0x0099
            boolean r7 = r0.f238117P
            if (r7 != 0) goto L_0x0099
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r7 = r0.mo113210l1()
            if (r7 == 0) goto L_0x0099
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r7 = r0.mo113210l1()
            com.tencent.luggage.sdk.config.AppBrandInitWindowConfig r7 = r7.f234828Y
            if (r7 == 0) goto L_0x0099
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r7 = r0.mo113210l1()
            com.tencent.luggage.sdk.config.AppBrandInitWindowConfig r7 = r7.f234828Y
            boolean r7 = r7.f234853h
            if (r7 == 0) goto L_0x0099
            r7 = 1
            goto L_0x009a
        L_0x0099:
            r7 = 0
        L_0x009a:
            if (r7 == 0) goto L_0x00c3
            r8 = -1
            if (r8 != r11) goto L_0x00ba
            android.content.res.Resources r8 = r10.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            int r8 = r8.orientation
            if (r8 != r5) goto L_0x00ad
            r11 = 1
            goto L_0x00c3
        L_0x00ad:
            android.content.res.Resources r8 = r10.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            int r8 = r8.orientation
            if (r8 != r3) goto L_0x00c3
            goto L_0x00c2
        L_0x00ba:
            int[] r8 = f246481P
            boolean r8 = u24.C90595a.m113497a(r8, r11)
            if (r8 == 0) goto L_0x00c3
        L_0x00c2:
            r11 = 0
        L_0x00c3:
            if (r0 == 0) goto L_0x00ec
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r8 = r0.mo113210l1()     // Catch:{ all -> 0x00e2 }
            if (r8 == 0) goto L_0x00ec
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r8 = r0.mo113210l1()     // Catch:{ all -> 0x00e2 }
            com.tencent.luggage.sdk.launching.c<?> r8 = r8.f234822V     // Catch:{ all -> 0x00e2 }
            if (r8 == 0) goto L_0x00ec
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.mo113210l1()     // Catch:{ all -> 0x00e2 }
            com.tencent.luggage.sdk.launching.c<?> r0 = r0.f234822V     // Catch:{ all -> 0x00e2 }
            com.tencent.mm.ipcinvoker.type.IPCInteger r8 = new com.tencent.mm.ipcinvoker.type.IPCInteger     // Catch:{ all -> 0x00e2 }
            r8.<init>(r11)     // Catch:{ all -> 0x00e2 }
            r0.mo111345a(r8)     // Catch:{ all -> 0x00e2 }
            goto L_0x00ec
        L_0x00e2:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r8[r6] = r0
            java.lang.String r0 = "onOrientationChanged call onWxAppRequestOrientationListener get exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r8)
        L_0x00ec:
            super.setRequestedOrientation(r11)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = r10.getLocalClassName()
            r0[r6] = r2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0[r5] = r11
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)
            r0[r3] = r11
            java.lang.Throwable r11 = new java.lang.Throwable
            r11.<init>()
            java.lang.String r11 = android.util.Log.getStackTraceString(r11)
            r0[r1] = r11
            java.lang.String r11 = "setRequestedOrientation name[%s], request[%d], windowScreenOrientationLocked[%b] stack %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r11, r0)
            return
        L_0x0115:
            super.setRequestedOrientation(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI.setRequestedOrientation(int):void");
    }

    public final void setTaskDescription(ActivityManager.TaskDescription taskDescription) {
        if (mo117074l8()) {
            try {
                super.setTaskDescription(taskDescription);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandUI", e, "setTaskDescription ", new Object[0]);
                if (taskDescription != null) {
                    try {
                        super.setTaskDescription(new ActivityManager.TaskDescription(taskDescription.getLabel(), (Bitmap) null, taskDescription.getPrimaryColor()));
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(17:5|(1:7)|8|(1:13)(1:12)|(1:18)(1:17)|19|(3:21|22|(10:29|(3:33|34|(8:38|41|(1:49)|50|(3:52|(1:(1:60))(1:61)|(2:63|64))|65|66|70))|39|41|49|50|(0)|65|66|70))|30|(0)|39|41|49|50|(0)|65|66|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0.f246538d.mo117074l8() == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ea, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00eb, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.AppBrandUI", r10, "startActivityForResult", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00e6 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077 A[SYNTHETIC, Splitter:B:33:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startActivityForResult(android.content.Intent r10, int r11, android.os.Bundle r12) {
        /*
            r9 = this;
            com.tencent.mm.plugin.appbrand.ui.AppBrandUITranslucentWorkaroundDelegate r0 = r9.f246497q
            r0.getClass()
            r1 = 1
            com.tencent.mm.plugin.appbrand.ui.AppBrandUI r2 = r0.f246538d     // Catch:{ Exception -> 0x000f }
            boolean r2 = r2.mo117074l8()     // Catch:{ Exception -> 0x000f }
            if (r2 != 0) goto L_0x0010
            goto L_0x001b
        L_0x000f:
        L_0x0010:
            boolean r2 = r0.f246539e
            if (r2 == 0) goto L_0x001b
            r0.f246540f = r1
            com.tencent.mm.plugin.appbrand.ui.AppBrandUI r0 = r0.f246538d
            nj3.C88990b.m111193b(r0)
        L_0x001b:
            com.tencent.mm.plugin.appbrand.task.e0 r0 = com.tencent.p014mm.plugin.appbrand.task.C84287e0.f246157a
            java.lang.String r2 = "startActivityForResult"
            r0.mo116975a(r9, r2)
            r0 = 0
            if (r10 == 0) goto L_0x0031
            int r3 = r10.getFlags()
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 & r4
            if (r3 <= 0) goto L_0x0031
            r3 = 1
            goto L_0x0032
        L_0x0031:
            r3 = 0
        L_0x0032:
            if (r10 == 0) goto L_0x004c
            android.content.ComponentName r4 = r10.getComponent()
            java.lang.String r4 = com.tencent.p014mm.plugin.appbrand.utils.C84737f0.m104394a(r4)
            android.content.ComponentName r5 = r9.getComponentName()
            java.lang.String r5 = com.tencent.p014mm.plugin.appbrand.utils.C84737f0.m104394a(r5)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x004c
            r4 = 1
            goto L_0x004d
        L_0x004c:
            r4 = 0
        L_0x004d:
            int r5 = com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.f240314o
            if (r10 == 0) goto L_0x0074
            android.content.ComponentName r5 = r10.getComponent()     // Catch:{ Exception -> 0x0074 }
            if (r5 == 0) goto L_0x0074
            android.content.ComponentName r5 = r10.getComponent()     // Catch:{ Exception -> 0x0074 }
            java.lang.String r5 = r5.getShortClassName()     // Catch:{ Exception -> 0x0074 }
            java.lang.String r6 = ".plugin.appbrand.ipc.AppBrandProcessProxyUI"
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x0074 }
            if (r5 == 0) goto L_0x0074
            java.lang.String r5 = "key_running_mode"
            r6 = -1
            int r5 = r10.getIntExtra(r5, r6)     // Catch:{ Exception -> 0x0074 }
            r6 = 10000(0x2710, float:1.4013E-41)
            if (r5 != r6) goto L_0x0074
            r5 = 1
            goto L_0x0075
        L_0x0074:
            r5 = 0
        L_0x0075:
            if (r10 == 0) goto L_0x008f
            android.content.ComponentName r6 = r10.getComponent()     // Catch:{ Exception -> 0x008f }
            if (r6 == 0) goto L_0x008f
            android.content.ComponentName r6 = r10.getComponent()     // Catch:{ Exception -> 0x008f }
            java.lang.String r6 = r6.getShortClassName()     // Catch:{ Exception -> 0x008f }
            java.lang.String r7 = ".plugin.appbrand.launching.AppBrandLaunchProxyUI"
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x008f }
            if (r6 == 0) goto L_0x008f
            r6 = 1
            goto L_0x0090
        L_0x008f:
            r6 = 0
        L_0x0090:
            com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI$a r7 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUIMoveTaskToBackStubUI.f246524g
            if (r10 == 0) goto L_0x00a9
            android.content.ComponentName r7 = r10.getComponent()
            if (r7 == 0) goto L_0x00a9
            java.lang.String r7 = r7.getShortClassName()
            if (r7 == 0) goto L_0x00a9
            java.lang.String r8 = ".AppBrandUIMoveTaskToBackStubUI"
            boolean r7 = z04.C112550d0.m153801u(r7, r8, r0)
            if (r1 != r7) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r1 = 0
        L_0x00aa:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r7 = r9.mRuntimeContainer
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r7.getActiveRuntime()
            if (r7 == 0) goto L_0x00e6
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r7 = r9.mRuntimeContainer
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r7.getActiveRuntime()
            fc.g r7 = (p963fc.C86812g) r7
            java.lang.String r7 = r7.f238147j
            if (r6 != 0) goto L_0x00d4
            if (r3 == 0) goto L_0x00c4
            if (r4 != 0) goto L_0x00c4
            if (r5 == 0) goto L_0x00d9
        L_0x00c4:
            if (r1 != 0) goto L_0x00d9
            com.tencent.mm.plugin.appbrand.l$e r3 = com.tencent.p014mm.plugin.appbrand.C83231l.C83235e.HIDE
            com.tencent.mm.plugin.appbrand.l$e r4 = com.tencent.p014mm.plugin.appbrand.C83231l.m102143d(r7)
            if (r3 != r4) goto L_0x00d9
            com.tencent.mm.plugin.appbrand.l$e r3 = com.tencent.p014mm.plugin.appbrand.C83231l.C83235e.LAUNCH_NATIVE_PAGE
            com.tencent.p014mm.plugin.appbrand.C83231l.m102146g(r7, r3)
            goto L_0x00d9
        L_0x00d4:
            com.tencent.mm.plugin.appbrand.l$e r3 = com.tencent.p014mm.plugin.appbrand.C83231l.C83235e.LAUNCH_MINI_PROGRAM
            com.tencent.p014mm.plugin.appbrand.C83231l.m102146g(r7, r3)
        L_0x00d9:
            if (r1 != 0) goto L_0x00e6
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r1 = r9.mRuntimeContainer     // Catch:{ Exception -> 0x00e6 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r1.getActiveRuntime()     // Catch:{ Exception -> 0x00e6 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r1     // Catch:{ Exception -> 0x00e6 }
            r1.mo113198c2(r10)     // Catch:{ Exception -> 0x00e6 }
        L_0x00e6:
            super.startActivityForResult(r10, r11, r12)     // Catch:{ all -> 0x00ea }
            goto L_0x00f2
        L_0x00ea:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "MicroMsg.AppBrandUI"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r10, r2, r11)
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI.startActivityForResult(android.content.Intent, int, android.os.Bundle):void");
    }

    public void unbindService(ServiceConnection serviceConnection) {
        try {
            super.unbindService(serviceConnection);
        } catch (IllegalArgumentException e) {
            Log.m105921e("MicroMsg.AppBrandUI", "unbindService IllegalArgumentException %s", e);
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e) {
            Log.m105921e("MicroMsg.AppBrandUI", "unregisterReceiver IllegalArgumentException %s", e);
        }
    }
}
