package hm3;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.lifecycle.C28654a;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: hm3.b */
public final class C32954b extends C28654a {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C32951a.f89541c = new WeakReference<>(activity);
    }

    public void onActivityResumed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C32951a.f89541c = new WeakReference<>(activity);
    }
}
