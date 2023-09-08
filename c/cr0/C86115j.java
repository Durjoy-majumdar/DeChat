package cr0;

import android.app.Activity;
import android.util.SparseArray;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import js0.C88015a;
import rx3.C13598b0;

/* renamed from: cr0.j */
public final class C86115j extends C88015a {
    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        int hashCode = activity.hashCode();
        SparseArray<C86117l> sparseArray = C86117l.f250629g;
        synchronized (sparseArray) {
            sparseArray.remove(hashCode);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
