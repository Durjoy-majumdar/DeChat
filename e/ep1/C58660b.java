package ep1;

import a14.C53895h;
import a14.C53934p0;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import wx3.C15601d;
import wx3.C66217g;

/* renamed from: ep1.b */
public final class C58660b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    public final /* synthetic */ C58661c f167934d;

    public C58660b(C58661c cVar) {
        this.f167934d = cVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activity instanceof MMFragmentActivity) {
            C58661c cVar = this.f167934d;
            MMFragmentActivity mMFragmentActivity = (MMFragmentActivity) activity;
            cVar.getClass();
            int hashCode = mMFragmentActivity.hashCode();
            Integer num = cVar.f167937b.get(Integer.valueOf(hashCode));
            if (num == null) {
                num = 0;
            }
            if (num.intValue() <= 0) {
                C58663d dVar = new C58663d(mMFragmentActivity, cVar, hashCode, (C15601d<? super C58663d>) null);
                C53895h.m60465c(cVar.f167936a, C66217g.f190253d, C53934p0.DEFAULT, dVar);
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C58661c cVar = this.f167934d;
        int hashCode = activity.hashCode();
        cVar.f167937b.remove(Integer.valueOf(hashCode));
        Log.m105924i("FinderJumpDataManager", "[clearTaskId] activityId=" + hashCode + ", taskIdMap.size=" + cVar.f167937b.size());
    }

    public void onActivityPaused(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityResumed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C58661c cVar = this.f167934d;
        cVar.getClass();
        int hashCode = activity.hashCode();
        Integer num = cVar.f167937b.get(Integer.valueOf(hashCode));
        if (num != null) {
            int intValue = num.intValue();
            C58659a aVar = cVar.f167938c.get(Integer.valueOf(intValue));
            if (aVar != null && aVar.f167933b == hashCode) {
                cVar.f167938c.remove(Integer.valueOf(intValue));
                C58664e eVar = cVar.f167939d.get(Integer.valueOf(hashCode));
                if (eVar != null) {
                    eVar.mo83535a(activity);
                }
                cVar.f167939d.remove(Integer.valueOf(hashCode));
                Log.m105924i("FinderJumpDataManager", "[clearIds] activityId=" + hashCode + ", sourceId=" + aVar.f167932a + " jumpDataMap.size=" + cVar.f167938c.size());
            }
        }
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
