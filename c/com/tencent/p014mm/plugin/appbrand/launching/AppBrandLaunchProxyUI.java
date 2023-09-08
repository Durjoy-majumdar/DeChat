package com.tencent.p014mm.plugin.appbrand.launching;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelappbrand.LaunchParamsOptional;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83425m;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83429p;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.FromMMProxyUI;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.weishi.AppBrandThumbFromMMProxyUI;
import com.tencent.p014mm.plugin.appbrand.weishi.AppBrandWeishiUIReadyEvent;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataFragmentActivity;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import cp0.C86078a;
import di3.C86312j;
import f40.C86737h0;
import in3.C87771d;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import l31.C61212e;
import nj3.C88989a;
import o31.C11345b;
import o31.C76986a;

@C86737h0
@C88989a(7)
/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI */
public final class AppBrandLaunchProxyUI extends MMSecDataFragmentActivity implements C83506v1, C87771d.C46280b {

    /* renamed from: t */
    public static final /* synthetic */ int f243123t = 0;

    /* renamed from: j */
    public C83429p f243124j;

    /* renamed from: n */
    public View f243125n;

    /* renamed from: o */
    public final MMHandler f243126o = new MMHandler(Looper.getMainLooper());

    /* renamed from: p */
    public final Runnable f243127p = new C68625a();

    /* renamed from: q */
    public int f243128q = 0;

    /* renamed from: r */
    public MMActivity.C6739d f243129r = null;

    /* renamed from: s */
    public final IListener<AppBrandWeishiUIReadyEvent> f243130s = new IListener<AppBrandWeishiUIReadyEvent>(this) {
        {
            this.__eventId = -1339599398;
        }

        public boolean callback(IEvent iEvent) {
            if (((AppBrandWeishiUIReadyEvent) iEvent) == null) {
                return false;
            }
            Log.m105924i("MicroMsg.AppBrandLaunchProxyUI", "[weishi] video play, close launch proxy ui");
            AppBrandLaunchProxyUI.this.finish();
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI$a */
    public class C68625a implements Runnable {
        public C68625a() {
        }

        public void run() {
            C83429p pVar;
            if (!AppBrandLaunchProxyUI.this.isDestroyed() && !AppBrandLaunchProxyUI.this.isFinishing() && (pVar = AppBrandLaunchProxyUI.this.f243124j) != null && pVar.mo115700c()) {
                try {
                    AppBrandLaunchProxyUI appBrandLaunchProxyUI = AppBrandLaunchProxyUI.this;
                    View view = appBrandLaunchProxyUI.f243125n;
                    if (view == null) {
                        View inflate = View.inflate(AppBrandLaunchProxyUI.this, C0966R.C0971layout.bfd, (ViewGroup) null);
                        ((FrameLayout) appBrandLaunchProxyUI.findViewById(16908290)).addView(inflate, new FrameLayout.LayoutParams(-2, -2, 17));
                        ((TextView) inflate.findViewById(C0966R.C0970id.gvj)).setText(C0966R.string.gas);
                        AppBrandLaunchProxyUI.this.f243125n = inflate;
                    } else {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    AppBrandLaunchProxyUI appBrandLaunchProxyUI2 = AppBrandLaunchProxyUI.this;
                    appBrandLaunchProxyUI2.mo6344U3(appBrandLaunchProxyUI2.f243128q);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandLaunchProxyUI", "attach dialog View e=%s", e);
                }
            }
        }
    }

    /* renamed from: N7 */
    public static boolean m102164N7(Context context, String str, String str2, String str3, int i, int i2, AppBrandStatObject appBrandStatObject, AppBrandLaunchReferrer appBrandLaunchReferrer, LaunchParamsOptional launchParamsOptional) {
        if (!Util.isNullOrNil(str) || !Util.isNullOrNil(str2)) {
            return ((C83285a) C83428o.f243800a).mo115583c(context, str, str2, str3, i, i2, appBrandStatObject, appBrandLaunchReferrer, launchParamsOptional);
        }
        return false;
    }

    /* renamed from: M7 */
    public final void mo115487M7(String str) {
        Log.m105925i("MicroMsg.AppBrandLaunchProxyUI", "onLifecycle:%s, instance:%d", str, Integer.valueOf(hashCode()));
    }

    /* renamed from: U3 */
    public void mo6344U3(int i) {
        if (!isFinishing() && !isDestroyed()) {
            this.f243128q = i;
            View view = this.f243125n;
            if (view != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ((ViewGroup.MarginLayoutParams) this.f243125n.getLayoutParams()).topMargin = i;
                this.f243125n.requestLayout();
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isFinishing()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void finish() {
        if (isFinishing() || isDestroyed()) {
            Log.m105928w("MicroMsg.AppBrandLaunchProxyUI", "AppBrandLaunchProxyUI finish() already finishing");
            return;
        }
        super.finish();
        Log.m105924i("MicroMsg.AppBrandLaunchProxyUI", "AppBrandLaunchProxyUI finish");
    }

    public void initActivityCloseAnimation() {
        overridePendingTransition(0, 0);
    }

    public void initActivityOpenAnimation(Intent intent) {
        overridePendingTransition(0, 0);
    }

    public boolean isSupportNavigationSwipeBack() {
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        MMActivity.C6739d dVar = this.f243129r;
        if (dVar != null) {
            dVar.mmOnActivityResult(i, i2, intent);
        }
        this.f243129r = null;
    }

    public void onBackPressed() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        mo115487M7("onCreate-start");
        try {
            if (getIntent().hasExtra("extra_from_activity_status_bar_color")) {
                getWindow().setStatusBarColor(getIntent().getIntExtra("extra_from_activity_status_bar_color", 0));
            }
            if (getIntent().hasExtra("extra_from_activity_navigation_bar_color")) {
                getWindow().setNavigationBarColor(getIntent().getIntExtra("extra_from_activity_navigation_bar_color", 0));
            }
            Rect rect = C85875k4.f250155a;
            C85875k4.m106177d0(getWindow());
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        } catch (Exception unused) {
        }
        Intent intent = getIntent();
        this.f243124j = !intent.getBooleanExtra("extra_from_mm", true) ? new C83425m(this, false) : intent.getBooleanExtra("extra_launch_weishi_video", false) ? new AppBrandThumbFromMMProxyUI(this) : new FromMMProxyUI(this);
        Log.m105925i("MicroMsg.AppBrandLaunchProxyUI", "onCreate, instance:%d, uiDelegate %s", Integer.valueOf(hashCode()), this.f243124j.getClass().getCanonicalName());
        this.f243124j.mo115699b(getIntent(), bundle);
        if (!isFinishing() && this.f243124j.mo115700c()) {
            this.f243126o.postDelayed(this.f243127p, 500);
        }
        this.f243130s.alive();
        mo115487M7("onCreate-end");
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.AppBrandUI).mo86179qs(this, C76986a.MiniProgram);
    }

    public void onDestroy() {
        super.onDestroy();
        mo115487M7("onDestroy");
        this.f243126o.removeCallbacksAndMessages((Object) null);
        C83429p pVar = this.f243124j;
        if (pVar != null) {
            pVar.onDestroy();
            if (this.f243124j.mo115700c()) {
                try {
                    ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
                    viewGroup.setVisibility(4);
                    viewGroup.removeAllViews();
                } catch (NullPointerException unused) {
                }
            }
        }
        IListener<AppBrandWeishiUIReadyEvent> iListener = this.f243130s;
        if (iListener != null) {
            iListener.dead();
        }
        ServiceConnection serviceConnection = C86078a.f250549h;
        if (serviceConnection != null) {
            try {
                unbindService(serviceConnection);
                C86078a.f250549h = null;
                Log.m105924i("MicroMsg.AppBrandLaunchProxyUI", "onDestroy: unbindService");
            } catch (Exception e) {
                Log.m105919d("MicroMsg.AppBrandLaunchProxyUI", "onDestroy: ", e);
            }
        }
    }

    public void onPause() {
        super.onPause();
        mo115487M7("onPause");
        C83429p pVar = this.f243124j;
        if (pVar != null) {
            pVar.onPause();
        } else {
            super.finish();
        }
    }

    public void onResume() {
        super.onResume();
        mo115487M7("onResume");
        C83429p pVar = this.f243124j;
        if (pVar != null) {
            pVar.onResume();
        } else {
            super.finish();
        }
    }

    public void onStart() {
        super.onStart();
        mo115487M7("onStart");
    }

    public void onStop() {
        super.onStop();
        mo115487M7("onStop");
    }
}
