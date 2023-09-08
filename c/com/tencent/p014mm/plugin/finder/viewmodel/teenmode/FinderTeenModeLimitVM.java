package com.tencent.p014mm.plugin.finder.viewmodel.teenmode;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import bl3.C0327w;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AgreeAuthorizationChangeEvent;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTeenModeLimitUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fe1.C58966m;
import fe1.C8013f;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C8808v4;
import java.util.Calendar;
import java.util.HashSet;
import java.util.concurrent.Future;
import lc3.C10485b;
import p565ir.C60606n;
import pt1.C35640b;
import ts1.C14080d;
import ts1.C14082f;
import ts1.C14086h;
import ts1.C14087i;
import up1.C37521f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM */
public final class FinderTeenModeLimitVM extends C0327w<C60200t1> implements C114668z, C58966m {

    /* renamed from: e */
    public final C14087i f18819e = new C14087i();

    /* renamed from: f */
    public HashSet<C8013f> f18820f = new HashSet<>();

    /* renamed from: g */
    public boolean f18821g = true;

    /* renamed from: h */
    public long f18822h;

    /* renamed from: i */
    public long f18823i;

    /* renamed from: j */
    public long f18824j;

    /* renamed from: n */
    public int f18825n;

    /* renamed from: o */
    public final C4340a f18826o = new C4340a(this);

    /* renamed from: p */
    public final IListener<AgreeAuthorizationChangeEvent> f18827p = new FinderTeenModeLimitVM$authorAgreeChangeListener$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM$a */
    public static final class C4340a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: d */
        public final /* synthetic */ FinderTeenModeLimitVM f18828d;

        public C4340a(FinderTeenModeLimitVM finderTeenModeLimitVM) {
            this.f18828d = finderTeenModeLimitVM;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activity instanceof MMFinderUI) {
                FinderTeenModeLimitVM finderTeenModeLimitVM = this.f18828d;
                MMFinderUI mMFinderUI = (MMFinderUI) activity;
                if (!finderTeenModeLimitVM.mo5191c3()) {
                    C85801v1 i = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_TEEN_MODE_ENJOY_IS_CURFEW_CLOSE_BOOLEAN_SYNC;
                    if (i.mo119686g(aVar, false) && !finderTeenModeLimitVM.mo5192d3()) {
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.FALSE);
                    }
                } else if (C35640b.f95284a.mo60347a(mMFinderUI)) {
                    finderTeenModeLimitVM.mo5195m0();
                }
            }
        }

        public void onActivityDestroyed(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activity instanceof MMFinderUI) {
                if (C35640b.f95284a.mo60347a(activity) && this.f18828d.mo5191c3() && ((C60606n) C86312j.m106911c(C60606n.class)).mo85017L5()) {
                    Log.m105924i("FinderTeenModeLimitVM", "IPluginFinderLive isVisitorLiving");
                    this.f18828d.f18824j = C31543z5.m39453c();
                }
                FinderTeenModeLimitVM finderTeenModeLimitVM = this.f18828d;
                if (finderTeenModeLimitVM.f18825n <= 0) {
                    AppForegroundDelegate.INSTANCE.mo174215k(finderTeenModeLimitVM);
                }
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
            this.f18828d.getClass();
            if ((activity instanceof MMFinderUI) && !(activity instanceof FinderShareFeedRelUI) && !(activity instanceof FinderTeenModeLimitUI)) {
                FinderTeenModeLimitVM finderTeenModeLimitVM = this.f18828d;
                if (!finderTeenModeLimitVM.mo5191c3()) {
                    finderTeenModeLimitVM.mo5194f3();
                    return;
                }
                finderTeenModeLimitVM.f18825n++;
                Log.m105924i("FinderTeenModeLimitVM", "handleFinderUIStart enjoyFinderMs:" + finderTeenModeLimitVM.f18822h + ", enterRefCount:" + finderTeenModeLimitVM.f18825n);
                if (finderTeenModeLimitVM.f18825n == 1) {
                    finderTeenModeLimitVM.f18823i = C31543z5.m39453c();
                    finderTeenModeLimitVM.f18822h = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_TEEN_MODE_ENJOY_TIME_LONG_SYNC, 0);
                    AppForegroundDelegate.INSTANCE.mo174208a(finderTeenModeLimitVM);
                    Log.m105924i("FinderTeenModeLimitVM", "startCheckTeenModeTimer enjoyFinderMs:" + finderTeenModeLimitVM.f18822h);
                    finderTeenModeLimitVM.f18819e.f39498b = new C14082f(finderTeenModeLimitVM);
                    C14087i iVar = finderTeenModeLimitVM.f18819e;
                    if (iVar.f39497a == null) {
                        iVar.f39497a = ((C119157j) C119157j.f356862d).mo183872c(new C14086h(iVar), 500, 60000);
                    }
                }
            }
        }

        public void onActivityStopped(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            this.f18828d.getClass();
            if ((activity instanceof MMFinderUI) && !(activity instanceof FinderShareFeedRelUI) && !(activity instanceof FinderTeenModeLimitUI)) {
                FinderTeenModeLimitVM finderTeenModeLimitVM = this.f18828d;
                if (!finderTeenModeLimitVM.mo5191c3()) {
                    finderTeenModeLimitVM.mo5194f3();
                    return;
                }
                finderTeenModeLimitVM.f18825n--;
                Log.m105924i("FinderTeenModeLimitVM", "handleFinderUIStop enjoyFinderMs:" + finderTeenModeLimitVM.f18822h + ", enterRefCount:" + finderTeenModeLimitVM.f18825n);
                if (finderTeenModeLimitVM.f18825n <= 0) {
                    if (finderTeenModeLimitVM.f18823i > 0) {
                        finderTeenModeLimitVM.f18822h += C31543z5.m39453c() - finderTeenModeLimitVM.f18823i;
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TEEN_MODE_ENJOY_TIME_LONG_SYNC, Long.valueOf(finderTeenModeLimitVM.f18822h));
                    }
                    finderTeenModeLimitVM.mo5194f3();
                }
            }
        }
    }

    /* renamed from: c3 */
    public final boolean mo5191c3() {
        boolean z;
        if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderOpenCheckAntiAddictSwitch", 1) != 1) {
            C37521f.f99374d.getClass();
            if (!(C37521f.f99434j6.mo60266n().intValue() == 1)) {
                z = false;
                boolean zX = ((C8808v4) C86312j.m106911c(C8808v4.class)).mo9636zX();
                Log.m105924i("FinderTeenModeLimitVM", "isEnableLimit switch:" + z + ", teenModeAndViewAll:" + zX);
                return !z && zX;
            }
        }
        z = true;
        boolean zX2 = ((C8808v4) C86312j.m106911c(C8808v4.class)).mo9636zX();
        Log.m105924i("FinderTeenModeLimitVM", "isEnableLimit switch:" + z + ", teenModeAndViewAll:" + zX2);
        if (!z) {
        }
    }

    /* renamed from: d3 */
    public final boolean mo5192d3() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(C31543z5.m39453c());
        int i = instance.get(11);
        C14080d dVar = C14080d.f39488a;
        int b = dVar.mo13495b();
        int a = dVar.mo13494a();
        int i2 = a >= 1 ? a - 1 : 0;
        Log.m105924i("FinderTeenModeLimitVM", "isInDayHour22_6 now hour:" + i + ", start:" + b + ", end:" + a + ", realEnd:" + i2);
        if (b <= i && i < 25) {
            return true;
        }
        return i >= 0 && i <= i2;
    }

    /* renamed from: e3 */
    public final void mo5193e3(boolean z) {
        this.f18823i = C31543z5.m39453c();
        if (z) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TEEN_MODE_ENJOY_IS_CURFEW_CLOSE_BOOLEAN_SYNC, Boolean.TRUE);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TEEN_MODE_ENJOY_CURFEW_CLOSE_TIME_LONG_SYNC, Long.valueOf(this.f18823i));
        }
        this.f18822h = 0;
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TEEN_MODE_ENJOY_TIME_LONG_SYNC, Long.valueOf(this.f18822h));
    }

    /* renamed from: f3 */
    public final void mo5194f3() {
        C14087i iVar = this.f18819e;
        Future<?> future = iVar.f39497a;
        boolean z = false;
        if (future != null) {
            future.cancel(false);
            iVar.f39497a = null;
            z = true;
        }
        if (z) {
            Log.m105924i("FinderTeenModeLimitVM", "stopCheckTeenModeTimer enjoyFinderMs" + this.f18822h);
        }
    }

    /* renamed from: m0 */
    public void mo5195m0() {
        if (mo5191c3()) {
            Log.m105924i("FinderTeenModeLimitVM", "recordLiveEnjoyTime start enjoyFinderMs:" + this.f18822h);
            if (this.f18824j > 0) {
                this.f18822h += C31543z5.m39453c() - this.f18824j;
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TEEN_MODE_ENJOY_TIME_LONG_SYNC, Long.valueOf(this.f18822h));
                this.f18824j = 0;
            }
            Log.m105924i("FinderTeenModeLimitVM", "recordLiveEnjoyTime end enjoyFinderMs:" + this.f18822h);
        }
    }

    public void onAppBackground(String str) {
        Log.m105924i("FinderTeenModeLimitVM", "FinderTeenModeLimitVM onAppBackground");
        mo5194f3();
    }

    public void onAppForeground(String str) {
    }
}
