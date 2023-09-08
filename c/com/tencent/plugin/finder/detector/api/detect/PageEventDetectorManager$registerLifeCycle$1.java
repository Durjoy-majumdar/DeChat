package com.tencent.plugin.finder.detector.api.detect;

import android.app.Activity;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.Log;
import gs3.C59698c;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0005"}, mo182094d2 = {"com/tencent/plugin/finder/detector/api/detect/PageEventDetectorManager$registerLifeCycle$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onCreate", "onDestroy", "plugin-finder-detector_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class PageEventDetectorManager$registerLifeCycle$1 implements C0124r {

    /* renamed from: d */
    public final String f165814d;

    /* renamed from: e */
    public final /* synthetic */ C39623j f165815e;

    public PageEventDetectorManager$registerLifeCycle$1(Activity activity, C39623j jVar) {
        this.f165815e = jVar;
        C59698c cVar = C59698c.f170541a;
        String str = activity.getClass().getSimpleName() + '_' + activity.hashCode();
        this.f165814d = str;
        Log.m105924i("PageEventDetectorManager", "registerLifeCycle activityKey: " + str);
    }

    @C112974b0(C39623j.C39625b.ON_CREATE)
    public final void onCreate() {
        Log.m105924i("PageEventDetectorManager", "onCreate activityKey: " + this.f165814d);
        C59698c.f170542b.add(this.f165814d);
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        Log.m105924i("PageEventDetectorManager", "onDestroy activityKey: " + this.f165814d);
        C59698c.f170542b.remove(this.f165814d);
        this.f165815e.removeObserver(this);
    }
}
