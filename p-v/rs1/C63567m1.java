package rs1;

import a14.C0000n0;
import a14.C53934p0;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import bl3.C0317e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p933be.C113159b;
import p981ie.C117159b;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: rs1.m1 */
public final class C63567m1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    public final /* synthetic */ C101459n1 f180265d;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderDeviceBatteryInfoUIC$alive$1$onActivityResumed$1", mo125469f = "FinderDeviceBatteryInfoUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: rs1.m1$a */
    public static final class C63568a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {
        public C63568a(C15601d<? super C63568a> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63568a(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C63568a((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C113159b.C113163c a = C113159b.m154842h().mo165664a();
            C101459n1.f297133e = (long) a.mo165677b();
            C101459n1.f297134f = C117159b.m165220u(a.f338598b);
            a.mo165680e();
            C101459n1.f297135g = false;
            Log.m105924i("Finder.DeviceBatteryInfoUIC", "batteryPercentage=" + C101459n1.f297133e + " isPowerSaveMode=" + C101459n1.f297134f + " isLowBattery=" + C101459n1.f297135g);
            return C13598b0.f38549a;
        }
    }

    public C63567m1(C101459n1 n1Var) {
        this.f180265d = n1Var;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityPaused(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityResumed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C0317e.launch$default(this.f180265d, (C66212f) null, (C53934p0) null, new C63568a((C15601d<? super C63568a>) null), 3, (Object) null);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityStopped(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }
}
