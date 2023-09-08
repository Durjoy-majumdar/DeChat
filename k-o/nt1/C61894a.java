package nt1;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import te3.C64227aa0;
import te3.C64440i90;
import z04.C112551y;

/* renamed from: nt1.a */
public final class C61894a {

    /* renamed from: a */
    public static final C61894a f175995a = new C61894a();

    /* renamed from: b */
    public static boolean f175996b;

    /* renamed from: c */
    public static C64440i90 f175997c;

    /* renamed from: d */
    public static String f175998d = "";

    /* renamed from: nt1.a$a */
    public static final class C61895a implements C114668z {
        public void onAppBackground(String str) {
            C61894a.f175995a.mo86820c(C61894a.f175998d);
        }

        public void onAppForeground(String str) {
            C61894a.f175995a.mo86819b(C61894a.f175998d);
        }
    }

    /* renamed from: nt1.a$b */
    public static final class C61896b implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            String shortClassName = activity.getComponentName().getShortClassName();
            C87412m.m108593f(shortClassName, "activity.componentName.shortClassName");
            if (C112551y.m153808h(shortClassName, "FinderHomeAffinityUI", false, 2, (Object) null)) {
                C61894a.f175998d = "finder";
                C61894a.f175995a.mo86819b("finder");
                return;
            }
            String shortClassName2 = activity.getComponentName().getShortClassName();
            C87412m.m108593f(shortClassName2, "activity.componentName.shortClassName");
            if (C112551y.m153808h(shortClassName2, "FinderLiveSquareNewEntranceUI", false, 2, (Object) null)) {
                C61894a.f175998d = WeChatBrands.Business.GROUP_LIVE;
                C61894a.f175995a.mo86819b(WeChatBrands.Business.GROUP_LIVE);
                return;
            }
            String shortClassName3 = activity.getComponentName().getShortClassName();
            C87412m.m108593f(shortClassName3, "activity.componentName.shortClassName");
            if (C112551y.m153808h(shortClassName3, "SnsTimeLineUI", false, 2, (Object) null)) {
                C61894a.f175998d = "sns";
                C61894a.f175995a.mo86819b("sns");
            }
        }

        public void onActivityDestroyed(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            String shortClassName = activity.getComponentName().getShortClassName();
            C87412m.m108593f(shortClassName, "activity.componentName.shortClassName");
            if (C112551y.m153808h(shortClassName, "FinderHomeAffinityUI", false, 2, (Object) null)) {
                C61894a.f175995a.mo86820c("finder");
                C61894a.f175998d = "";
                return;
            }
            String shortClassName2 = activity.getComponentName().getShortClassName();
            C87412m.m108593f(shortClassName2, "activity.componentName.shortClassName");
            if (C112551y.m153808h(shortClassName2, "FinderLiveSquareNewEntranceUI", false, 2, (Object) null)) {
                C61894a.f175995a.mo86820c(WeChatBrands.Business.GROUP_LIVE);
                C61894a.f175998d = "";
                return;
            }
            String shortClassName3 = activity.getComponentName().getShortClassName();
            C87412m.m108593f(shortClassName3, "activity.componentName.shortClassName");
            if (C112551y.m153808h(shortClassName3, "SnsTimeLineUI", false, 2, (Object) null)) {
                C61894a.f175995a.mo86820c("sns");
                C61894a.f175998d = "";
            }
        }

        public void onActivityPaused(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public void onActivityResumed(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
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

    static {
        C64440i90 i902 = new C64440i90();
        i902.f183637d = new C64227aa0();
        i902.f183639f = new C64227aa0();
        i902.f183638e = new C64227aa0();
        f175997c = i902;
        AppForegroundDelegate.INSTANCE.mo174208a(new C61895a());
        Context context = MMApplicationContext.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Application");
        ((Application) context).registerActivityLifecycleCallbacks(new C61896b());
    }

    /* renamed from: a */
    public static final void m72626a(String str) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C64227aa0 e = f175995a.mo86821e(str);
        if (e != null) {
            e.f182042e++;
        }
    }

    /* renamed from: d */
    public static final void m72627d(String str) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C64227aa0 e = f175995a.mo86821e(str);
        if (e != null) {
            e.f182043f++;
        }
    }

    /* renamed from: b */
    public final void mo86819b(String str) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C64227aa0 e = mo86821e(str);
        if (e != null && e.f182045h == 0) {
            e.f182045h = System.currentTimeMillis();
        }
    }

    /* renamed from: c */
    public final void mo86820c(String str) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C64227aa0 e = mo86821e(str);
        if (e != null && e.f182045h > 0) {
            e.f182044g += (int) ((System.currentTimeMillis() - e.f182045h) / 1000);
            e.f182045h = 0;
        }
    }

    /* renamed from: e */
    public final C64227aa0 mo86821e(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1274447834) {
            if (hashCode != 114040) {
                if (hashCode == 3322092 && str.equals(WeChatBrands.Business.GROUP_LIVE)) {
                    return f175997c.f183639f;
                }
            } else if (str.equals("sns")) {
                return f175997c.f183637d;
            }
        } else if (str.equals("finder")) {
            return f175997c.f183638e;
        }
        return null;
    }
}
