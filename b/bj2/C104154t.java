package bj2;

import a10.C112711a0;
import a10.C112726y;
import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.app.Activity;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.flutter.p837ui.FlutterPageStyle;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.pigeon.C26954h;
import com.tencent.pigeon.FlutterViewDemoPigeon;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import kotlin.ResultKt;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: bj2.t */
public final class C104154t implements FlutterPlugin, FlutterViewDemoPigeon.FlutterViewDemoHost, ActivityAware {

    /* renamed from: d */
    public final AppCompatActivity f308172d;

    /* renamed from: e */
    public final C112726y f308173e;

    /* renamed from: f */
    public Activity f308174f;

    /* renamed from: g */
    public C112711a0 f308175g;

    /* renamed from: h */
    public View f308176h;

    /* renamed from: i */
    public final C0000n0 f308177i = C53930o0.m60555b();

    /* renamed from: bj2.t$a */
    public static final class C104155a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C104154t f308178d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104155a(C104154t tVar) {
            super(0);
            this.f308178d = tVar;
        }

        public Object invoke() {
            C104154t tVar = this.f308178d;
            tVar.f308175g = null;
            if (tVar.f308176h != null) {
                tVar.f308172d.getWindowManager().removeView(this.f308178d.f308176h);
                this.f308178d.f308176h = null;
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.repairer.ui.demo.FlutterViewDemoPlugin$switchToActivity$2", mo125469f = "RepairerFlutterWeUIDemoUI.kt", mo125470l = {130, 133}, mo125471m = "invokeSuspend")
    /* renamed from: bj2.t$b */
    public static final class C104156b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f308179d;

        /* renamed from: e */
        public final /* synthetic */ C104154t f308180e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104156b(C104154t tVar, C15601d<? super C104156b> dVar) {
            super(2, dVar);
            this.f308180e = tVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C104156b(this.f308180e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C104156b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f308179d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C112726y yVar = this.f308180e.f308173e;
                this.f308179d = 1;
                if (yVar.mo164471g("view_demo_activity", (Map<String, Object>) null, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FlutterPageStyle flutterPageStyle = new FlutterPageStyle(0, 0, (FlutterActivityLaunchConfigs.BackgroundMode) null, false, false, false, (Integer) null, 0, false, false, 1023, (C8480h) null);
            flutterPageStyle.f310669e = -1;
            C104154t tVar = this.f308180e;
            C112726y yVar2 = tVar.f308173e;
            AppCompatActivity appCompatActivity = tVar.f308172d;
            this.f308179d = 2;
            if (yVar2.mo164473j(appCompatActivity, flutterPageStyle, (Class<? extends Activity>) null, this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.repairer.ui.demo.FlutterViewDemoPlugin$switchToView$1", mo125469f = "RepairerFlutterWeUIDemoUI.kt", mo125470l = {114, 115}, mo125471m = "invokeSuspend")
    /* renamed from: bj2.t$c */
    public static final class C104157c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f308181d;

        /* renamed from: e */
        public Object f308182e;

        /* renamed from: f */
        public int f308183f;

        /* renamed from: g */
        public final /* synthetic */ C104154t f308184g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104157c(C104154t tVar, C15601d<? super C104157c> dVar) {
            super(2, dVar);
            this.f308184g = tVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C104157c(this.f308184g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C104157c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            FrameLayout frameLayout;
            C104154t tVar;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f308183f;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Activity activity = this.f308184g.f308174f;
                if (activity != null) {
                    activity.finish();
                }
                frameLayout = new FrameLayout(this.f308184g.f308172d);
                frameLayout.setBackgroundColor(1879048447);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(1003, 8, 1);
                layoutParams.width = 400;
                layoutParams.height = 600;
                layoutParams.x = 0;
                layoutParams.y = 300 - C75044y4.m89994f(this.f308184g.f308172d);
                layoutParams.gravity = 51;
                this.f308184g.f308172d.getWindowManager().addView(frameLayout, layoutParams);
                C112726y yVar = this.f308184g.f308173e;
                this.f308181d = frameLayout;
                this.f308183f = 1;
                if (yVar.mo164471g("view_demo_view", (Map<String, Object>) null, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                frameLayout = (FrameLayout) this.f308181d;
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                tVar = (C104154t) this.f308182e;
                frameLayout = (FrameLayout) this.f308181d;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                tVar.f308175g = (C112711a0) obj2;
                this.f308184g.f308176h = frameLayout;
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C104154t tVar2 = this.f308184g;
            C112726y yVar2 = tVar2.f308173e;
            C39623j lifecycle = tVar2.f308172d.getLifecycle();
            C87412m.m108593f(lifecycle, "startActivity.lifecycle");
            this.f308181d = frameLayout;
            this.f308182e = tVar2;
            this.f308183f = 2;
            obj2 = yVar2.mo164474k(frameLayout, lifecycle, new FlutterPageStyle(0, 0, (FlutterActivityLaunchConfigs.BackgroundMode) null, false, false, false, (Integer) null, 0, false, false, 511, (C8480h) null), this);
            if (obj2 == aVar) {
                return aVar;
            }
            tVar = tVar2;
            tVar.f308175g = (C112711a0) obj2;
            this.f308184g.f308176h = frameLayout;
            return C13598b0.f38549a;
        }
    }

    public C104154t(AppCompatActivity appCompatActivity, C112726y yVar) {
        C87412m.m108594g(appCompatActivity, "startActivity");
        C87412m.m108594g(yVar, "instance");
        this.f308172d = appCompatActivity;
        this.f308173e = yVar;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
        this.f308174f = activityPluginBinding.getActivity();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C26954h.m35911d(flutterPluginBinding.getBinaryMessenger(), this);
    }

    public void onDetachedFromActivity() {
        this.f308174f = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f308174f = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C26954h.m35911d(flutterPluginBinding.getBinaryMessenger(), (FlutterViewDemoPigeon.FlutterViewDemoHost) null);
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
        this.f308174f = activityPluginBinding.getActivity();
    }

    public void switchToActivity() {
        C112711a0 a0Var = this.f308175g;
        if (a0Var != null) {
            a0Var.f337453g = new C104155a(this);
        }
        C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C104156b(this, (C15601d<? super C104156b>) null), 3, (Object) null);
    }

    public void switchToView() {
        C53895h.m60466d(this.f308177i, (C66212f) null, (C53934p0) null, new C104157c(this, (C15601d<? super C104157c>) null), 3, (Object) null);
    }
}
