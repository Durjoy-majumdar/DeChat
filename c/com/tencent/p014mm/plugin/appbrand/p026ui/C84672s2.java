package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81690d1;
import com.tencent.p014mm.plugin.appbrand.C81820e3;
import com.tencent.p014mm.plugin.appbrand.task.C84287e0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import p963fc.C86809e;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.s2 */
public final class C84672s2 extends UIComponent {

    /* renamed from: d */
    public boolean f247026d;

    /* renamed from: e */
    public boolean f247027e;

    /* renamed from: f */
    public final MMHandler f247028f = new MMHandler(Looper.getMainLooper());

    /* renamed from: g */
    public final Runnable f247029g = new C84673a(this);

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.s2$a */
    public static final class C84673a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C84672s2 f247030d;

        public C84673a(C84672s2 s2Var) {
            this.f247030d = s2Var;
        }

        public final void run() {
            if (Log.getLogLevel() <= 1) {
                Log.m105918d("MicroMsg.AppBrandUIBackPressedInterceptorComponent", "assign mEatBackPressed=false, stack:" + android.util.Log.getStackTraceString(new Throwable()));
            }
            this.f247030d.f247027e = false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84672s2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo117389c3() {
        if (!getActivity().isDestroyed() && !getActivity().isFinishing()) {
            this.f247026d = true;
            this.f247028f.postDelayed(this.f247029g, 433);
        }
    }

    public boolean onBackPressed() {
        AppBrandRuntime activeRuntime;
        C84287e0 e0Var = C84287e0.f246157a;
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.AppBrandUI");
        e0Var.mo116975a((AppBrandUI) activity, "onBackPressed(mEatBackPressed:" + this.f247027e + ')');
        if (this.f247027e) {
            return true;
        }
        AppCompatActivity activity2 = getActivity();
        C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.AppBrandUI");
        C81820e3 a8 = ((AppBrandUI) activity2).mo117110a8();
        C86809e eVar = a8 instanceof C86809e ? (C86809e) a8 : null;
        if (eVar == null) {
            return false;
        }
        if (!eVar.mo113152n0() && (activeRuntime = eVar.getActiveRuntime()) != null) {
            try {
                activeRuntime.mo113075q0();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandRuntimeContainer", "onBackPressed e = %s", e);
                MMHandlerThread.postToMainThread(new C81690d1(eVar, e));
            }
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo117389c3();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f247028f.removeCallbacksAndMessages((Object) null);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        mo117389c3();
    }

    public void onStart() {
        super.onStart();
        if (!this.f247026d) {
            this.f247028f.removeCallbacks(this.f247029g);
            ((C84673a) this.f247029g).run();
        }
    }

    public void onStop() {
        super.onStop();
        this.f247028f.removeCallbacks(this.f247029g);
        this.f247027e = true;
        this.f247026d = false;
    }
}
