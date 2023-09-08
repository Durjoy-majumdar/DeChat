package com.tencent.wxa.p1187ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C39623j;
import java.util.Arrays;
import p172io.flutter.embedding.android.ExclusiveAppComponent;
import p172io.flutter.embedding.android.FlutterEngineConfigurator;
import p172io.flutter.embedding.android.FlutterView;
import p172io.flutter.embedding.android.RenderMode;
import p172io.flutter.embedding.android.SplashScreen;
import p172io.flutter.embedding.android.SplashScreenProvider;
import p172io.flutter.embedding.android.TransparencyMode;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import p172io.flutter.plugin.common.MethodChannel;
import p172io.flutter.plugin.platform.PlatformPlugin;
import tw3.C118551c;
import tw3.C118552d;
import tw3.C118554e;
import vw3.C118707a;
import vw3.C118708b;
import vw3.C118709c;
import ww3.C118789a;

/* renamed from: com.tencent.wxa.ui.a */
public class C116506a {

    /* renamed from: a */
    public int f349458a = 0;

    /* renamed from: b */
    public C116510d f349459b;

    /* renamed from: c */
    public WxaFlutterSplashView f349460c;

    /* renamed from: d */
    public FlutterView f349461d;

    /* renamed from: e */
    public PlatformPlugin f349462e;

    /* renamed from: f */
    public C118709c f349463f;

    /* renamed from: g */
    public boolean f349464g = true;

    /* renamed from: h */
    public C116509c f349465h = new C116509c();

    /* renamed from: i */
    public final FlutterUiDisplayListener f349466i = new C116507a();

    /* renamed from: com.tencent.wxa.ui.a$a */
    public class C116507a implements FlutterUiDisplayListener {
        public C116507a() {
        }

        public void onFlutterUiDisplayed() {
            C116506a.this.f349459b.onFlutterUiDisplayed();
        }

        public void onFlutterUiNoLongerDisplayed() {
        }
    }

    /* renamed from: com.tencent.wxa.ui.a$b */
    public class C116508b implements MethodChannel.Result {
        public C116508b() {
        }

        public void error(String str, String str2, Object obj) {
            C118789a.m167474e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Invoked onBackPressed() error. s:%s s1:%s", str, str2);
            if (C116506a.this.f349459b.getActivity() != null) {
                C116506a.this.f349459b.getActivity().finish();
            }
        }

        public void notImplemented() {
            C118789a.m167474e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Invoked onBackPressed() notImplemented.", new Object[0]);
            if (C116506a.this.f349459b.getActivity() != null) {
                C116506a.this.f349459b.getActivity().finish();
            }
        }

        public void success(Object obj) {
            if (obj != null && (obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                C118789a.m167474e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Invoked onBackPressed() back press comsumed .", new Object[0]);
            } else if (C116506a.this.f349459b.getActivity() != null) {
                C116506a.this.f349459b.getActivity().finish();
            }
        }
    }

    /* renamed from: com.tencent.wxa.ui.a$c */
    public class C116509c implements ExclusiveAppComponent<Activity> {
        public C116509c() {
        }

        public void detachFromFlutterEngine() {
        }

        public Object getAppComponent() {
            return C116506a.this.f349459b.getActivity();
        }
    }

    /* renamed from: com.tencent.wxa.ui.a$d */
    public interface C116510d extends SplashScreenProvider, FlutterEngineConfigurator {
        void configureFlutterEngine(FlutterEngine flutterEngine);

        Activity getActivity();

        String getAppBundlePath();

        String getCachedEngineId();

        Context getContext();

        String getDartEntrypointFunctionName();

        C118708b getFlutterActivity();

        String getInitialRoute();

        C39623j getLifecycle();

        RenderMode getRenderMode();

        TransparencyMode getTransparencyMode();

        void onFlutterUiDisplayed();

        PlatformPlugin providePlatformPlugin(Activity activity, FlutterEngine flutterEngine);

        SplashScreen provideSplashScreen();

        boolean shouldAttachEngineToActivity();
    }

    public C116506a(C116510d dVar) {
        this.f349459b = dVar;
        C118789a.m167470a("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.", new Object[0]);
        mo180437a();
        this.f349458a = C118552d.m167207g().mo183270j(Boolean.FALSE);
        if (mo180438b() == null) {
            C118789a.m167472c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "flutter engine is null.", new Object[0]);
        }
        this.f349463f = new C118707a(this.f349459b.getFlutterActivity(), this.f349458a);
    }

    /* renamed from: a */
    public final void mo180437a() {
        if (this.f349459b == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    /* renamed from: b */
    public FlutterEngine mo180438b() {
        return C118552d.m167207g().mo183267f(this.f349458a);
    }

    /* renamed from: c */
    public void mo180439c(int i, int i2, Intent intent) {
        mo180437a();
        FlutterEngine b = mo180438b();
        if (b != null) {
            C118789a.m167473d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i + "\nresultCode: " + i2 + "\ndata: " + intent, new Object[0]);
            b.getActivityControlSurface().onActivityResult(i, i2, intent);
            return;
        }
        C118789a.m167474e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.", new Object[0]);
    }

    /* renamed from: d */
    public void mo180440d(Context context) {
        C118789a.m167472c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onAttach.", new Object[0]);
        mo180437a();
        C118552d.m167207g().mo183263b(this.f349459b.getFlutterActivity(), this.f349458a);
        C116510d dVar = this.f349459b;
        this.f349462e = dVar.providePlatformPlugin(dVar.getActivity(), mo180438b());
        this.f349459b.configureFlutterEngine(mo180438b());
    }

    /* renamed from: e */
    public void mo180441e(boolean z) {
        C118789a.m167470a("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onBackPressed", new Object[0]);
        FlutterEngine b = mo180438b();
        mo180437a();
        if (b != null) {
            C118789a.m167473d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.", new Object[0]);
            C118709c cVar = this.f349463f;
            C116508b bVar = new C116508b();
            C118707a aVar = (C118707a) cVar;
            aVar.getClass();
            C118789a.m167470a("WxaRouter.DefaultFlutterViewLifecycle", "onBackPressed", new Object[0]);
            C118552d g = C118552d.m167207g();
            int i = aVar.f355217b;
            Boolean valueOf = Boolean.valueOf(z);
            if (g.f354803g.indexOfKey(i) > -1) {
                C118554e eVar = (C118554e) g.mo183267f(i).getPlugins().get(C118554e.class);
                if (eVar != null) {
                    eVar.f354815d.mo183359a("onBackPressed", valueOf, bVar);
                    return;
                }
                return;
            }
            C118789a.m167474e("WxaRouter.WxaRouter", "engine is null.", new Object[0]);
            return;
        }
        C118789a.m167474e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.", new Object[0]);
        if (this.f349459b.getActivity() != null) {
            this.f349459b.getActivity().finish();
        }
    }

    /* renamed from: f */
    public View mo180442f(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C118789a.m167473d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Creating FlutterView.", new Object[0]);
        mo180437a();
        mo180438b().getActivityControlSurface().attachToActivity(this.f349465h, this.f349459b.getLifecycle());
        C118707a aVar = (C118707a) this.f349463f;
        aVar.getClass();
        C118552d.m167207g().mo183268h(aVar.f355217b, "onCreateView", aVar.mo183459a());
        FlutterView flutterView = new FlutterView((Context) this.f349459b.getActivity(), this.f349459b.getRenderMode(), this.f349459b.getTransparencyMode());
        this.f349461d = flutterView;
        flutterView.addOnFirstFrameRenderedListener(this.f349466i);
        WxaFlutterSplashView wxaFlutterSplashView = new WxaFlutterSplashView(this.f349459b.getContext(), (AttributeSet) null, 0);
        this.f349460c = wxaFlutterSplashView;
        wxaFlutterSplashView.setId(View.generateViewId());
        this.f349460c.mo180428a(this.f349461d, this.f349459b.provideSplashScreen());
        return this.f349460c;
    }

    /* renamed from: g */
    public void mo180443g() {
        C118789a.m167473d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onDestroyView()", new Object[0]);
        C118707a aVar = (C118707a) this.f349463f;
        aVar.getClass();
        C118552d.m167207g().mo183268h(aVar.f355217b, "onDestroyView", aVar.mo183459a());
        mo180437a();
    }

    /* renamed from: h */
    public void mo180444h() {
        C118789a.m167473d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onDetach()", new Object[0]);
        mo180438b();
        mo180437a();
        PlatformPlugin platformPlugin = this.f349462e;
        if (platformPlugin != null) {
            platformPlugin.destroy();
            this.f349462e = null;
        }
        C118552d g = C118552d.m167207g();
        C118708b flutterActivity = this.f349459b.getFlutterActivity();
        int i = this.f349458a;
        C116510d dVar = this.f349459b;
        g.getClass();
        C118789a.m167472c("WxaRouter.WxaRouter", "detach activityId:%s engineId:%d", flutterActivity.getFlutterViewId(), Integer.valueOf(i));
        if (g.f354803g.indexOfKey(i) < 0) {
            C118789a.m167471b("WxaRouter.WxaRouter", "detach fail", new Object[0]);
            return;
        }
        FlutterEngine f = g.mo183267f(i);
        if (f == g.f354799c) {
            C118789a.m167472c("WxaRouter.WxaRouter", "detach engine == mDefaultFlutterEngine", new Object[0]);
            g.f354799c = null;
            g.f354805i = Boolean.FALSE;
            g.f354798b = null;
        }
        if (dVar.shouldAttachEngineToActivity()) {
            C118789a.m167470a("WxaRouter.WxaRouter", "detachFromActivity", new Object[0]);
            if (dVar.getActivity().isChangingConfigurations()) {
                f.getActivityControlSurface().detachFromActivityForConfigChanges();
            } else {
                f.getActivityControlSurface().detachFromActivity();
            }
        }
        g.f354803g.remove(i);
        g.f354806j.postDelayed(new C118551c(g, i, f), 300);
        g.f354802f.remove(flutterActivity.getFlutterViewId());
        C118708b bVar = g.f354801e;
        if (bVar != null && bVar == flutterActivity) {
            C118789a.m167472c("WxaRouter.WxaRouter", "detach current activity. set CurrentActivity null", new Object[0]);
            g.f354801e = null;
        }
    }

    /* renamed from: i */
    public void mo180445i(Intent intent) {
        mo180437a();
        FlutterEngine b = mo180438b();
        if (b != null) {
            C118789a.m167473d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine.", new Object[0]);
            b.getActivityControlSurface().onNewIntent(intent);
            return;
        }
        C118789a.m167474e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.", new Object[0]);
    }

    /* renamed from: j */
    public void mo180446j() {
        C118789a.m167473d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onPause()", new Object[0]);
        mo180438b();
        this.f349464g = true;
        C118707a aVar = (C118707a) this.f349463f;
        aVar.getClass();
        C118552d.m167207g().mo183268h(aVar.f355217b, "onPauseView", aVar.mo183459a());
        C118552d g = C118552d.m167207g();
        FlutterView flutterView = this.f349461d;
        int i = this.f349458a;
        g.getClass();
        C118789a.m167472c("WxaRouter.WxaRouter", "appIsInactive view:%d engineId:%d", Integer.valueOf(flutterView.hashCode()), Integer.valueOf(i));
        if (g.f354804h.indexOfKey(i) < 0) {
            C118789a.m167471b("WxaRouter.WxaRouter", "please attach activity first.", new Object[0]);
        } else if (flutterView == g.f354804h.get(i)) {
            g.mo183267f(i).getLifecycleChannel().appIsInactive();
        }
        mo180437a();
    }

    /* renamed from: k */
    public void mo180447k() {
        C118789a.m167473d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onPostResume()", new Object[0]);
        FlutterEngine b = mo180438b();
        mo180437a();
        if (b != null) {
            PlatformPlugin platformPlugin = this.f349462e;
            if (platformPlugin != null) {
                platformPlugin.updateSystemUiOverlays();
                return;
            }
            return;
        }
        C118789a.m167474e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.", new Object[0]);
    }

    /* renamed from: l */
    public void mo180448l(int i, String[] strArr, int[] iArr) {
        mo180437a();
        FlutterEngine b = mo180438b();
        if (b != null) {
            C118789a.m167473d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr), new Object[0]);
            b.getActivityControlSurface().onRequestPermissionsResult(i, strArr, iArr);
            return;
        }
        C118789a.m167474e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.", new Object[0]);
    }

    /* renamed from: m */
    public void mo180449m() {
        C118789a.m167473d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onResume()", new Object[0]);
        mo180438b();
        if (this.f349464g) {
            C118552d.m167207g().mo183263b(this.f349459b.getFlutterActivity(), this.f349458a);
            C118552d.m167207g().mo183264c(this.f349461d, this.f349458a);
            C118552d.m167207g().mo183262a(this.f349461d, this.f349458a);
            C118789a.m167472c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "attachViewToFlutterEngine", new Object[0]);
            this.f349464g = false;
        }
        C118707a aVar = (C118707a) this.f349463f;
        aVar.getClass();
        C118552d.m167207g().mo183268h(aVar.f355217b, "onResumeView", aVar.mo183459a());
        mo180437a();
    }

    /* renamed from: n */
    public void mo180450n() {
        C118789a.m167473d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onStart()", new Object[0]);
        mo180437a();
        mo180438b();
        C118789a.m167473d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.", new Object[0]);
        C118552d.m167207g().mo183263b(this.f349459b.getFlutterActivity(), this.f349458a);
        C118552d.m167207g().mo183264c(this.f349461d, this.f349458a);
        if (this.f349459b.getCachedEngineId() == null) {
            FlutterEngine b = mo180438b();
            if (!b.getDartExecutor().isExecutingDart()) {
                C118789a.m167470a("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Executing Dart entrypoint: " + this.f349459b.getDartEntrypointFunctionName() + ", and sending initial route: " + this.f349459b.getInitialRoute(), new Object[0]);
                if (this.f349459b.getInitialRoute() != null) {
                    b.getNavigationChannel().setInitialRoute(this.f349459b.getInitialRoute());
                }
                b.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint(this.f349459b.getAppBundlePath(), this.f349459b.getDartEntrypointFunctionName()));
            }
        }
        C118789a.m167472c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "attachViewToFlutterEngine", new Object[0]);
        this.f349464g = false;
        C118552d.m167207g().mo183262a(this.f349461d, this.f349458a);
    }

    /* renamed from: o */
    public void mo180451o() {
        C118789a.m167473d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onStop()", new Object[0]);
        mo180438b();
        mo180437a();
        C118552d g = C118552d.m167207g();
        FlutterView flutterView = this.f349461d;
        int i = this.f349458a;
        g.getClass();
        C118789a.m167472c("WxaRouter.WxaRouter", "appIsPause view:%d engineId:%d", Integer.valueOf(flutterView.hashCode()), Integer.valueOf(i));
        if (g.f354803g.indexOfKey(i) < 0) {
            C118789a.m167471b("WxaRouter.WxaRouter", "please attach activity first.", new Object[0]);
        } else if (flutterView == g.f354804h.get(i)) {
            g.mo183267f(i).getLifecycleChannel().appIsPaused();
        }
        C118552d g2 = C118552d.m167207g();
        FlutterView flutterView2 = this.f349461d;
        int i2 = this.f349458a;
        g2.getClass();
        C118789a.m167472c("WxaRouter.WxaRouter", "detachViewFromFlutterEngine view:%d engineId:%d", Integer.valueOf(flutterView2.hashCode()), Integer.valueOf(i2));
        if (g2.f354803g.indexOfKey(i2) < 0) {
            C118789a.m167471b("WxaRouter.WxaRouter", "please attach activity first.", new Object[0]);
        } else if (flutterView2 == g2.f354804h.get(i2)) {
            flutterView2.detachFromFlutterEngine();
            g2.f354804h.remove(i2);
        }
        C118789a.m167472c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "detachViewFromFlutterEngine", new Object[0]);
    }

    /* renamed from: p */
    public void mo180452p(int i) {
        mo180437a();
        FlutterEngine b = mo180438b();
        if (b == null) {
            C118789a.m167474e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onTrimMemory() invoked before FlutterFragment was attached to an Activity.", new Object[0]);
        } else if (i == 10) {
            C118789a.m167473d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Forwarding onTrimMemory() to FlutterEngine. Level: " + i, new Object[0]);
            b.getSystemChannel().sendMemoryPressureWarning();
        }
    }

    /* renamed from: q */
    public void mo180453q() {
        mo180437a();
        FlutterEngine b = mo180438b();
        if (b != null) {
            C118789a.m167473d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.", new Object[0]);
            b.getActivityControlSurface().onUserLeaveHint();
            return;
        }
        C118789a.m167474e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.", new Object[0]);
    }
}
