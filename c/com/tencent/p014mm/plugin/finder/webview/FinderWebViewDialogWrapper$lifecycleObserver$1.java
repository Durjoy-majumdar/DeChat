package com.tencent.p014mm.plugin.finder.webview;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007¨\u0006\u0007"}, mo182094d2 = {"com/tencent/mm/plugin/finder/webview/FinderWebViewDialogWrapper$lifecycleObserver$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onResume", "onPause", "onStop", "onDestroy", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.webview.FinderWebViewDialogWrapper$lifecycleObserver$1 */
public final class FinderWebViewDialogWrapper$lifecycleObserver$1 implements C0124r {
    public FinderWebViewDialogWrapper$lifecycleObserver$1(C41638n nVar) {
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        Log.m105924i("Finder.AdCenterDialog", "OnLifecycleEvent onDestroy");
        throw null;
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public final void onPause() {
        Log.m105924i("Finder.AdCenterDialog", "OnLifecycleEvent onPause");
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public final void onResume() {
        Log.m105924i("Finder.AdCenterDialog", "OnLifecycleEvent onResume");
    }

    @C112974b0(C39623j.C39625b.ON_STOP)
    public final void onStop() {
        Log.m105924i("Finder.AdCenterDialog", "OnLifecycleEvent onStop");
    }
}
