package com.tencent.p014mm.p136ui.anim.transition;

import android.app.Activity;
import android.app.Instrumentation;
import android.app.SharedElementCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.p136ui.anim.transition.MMTransitionHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0005"}, mo182094d2 = {"com/tencent/mm/ui/anim/transition/MMTransitionHelper$tryRegisterObserver$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onStop", "onDestroy", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.anim.transition.MMTransitionHelper$tryRegisterObserver$1 */
public final class MMTransitionHelper$tryRegisterObserver$1 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ MMTransitionHelper.C57657a f165043d;

    /* renamed from: e */
    public final /* synthetic */ Activity f165044e;

    public MMTransitionHelper$tryRegisterObserver$1(MMTransitionHelper.C57657a aVar, Activity activity) {
        this.f165043d = aVar;
        this.f165044e = activity;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        Log.m105918d("MM.Transition", "initCallbackAndListener " + this.f165044e.getClass().getSimpleName() + " onDestroy() called");
        Activity activity = this.f165044e;
        MMTransitionHelper mMTransitionHelper = MMTransitionHelper.f165034a;
        SharedElementCallback sharedElementCallback = MMTransitionHelper.f165036c;
        activity.setEnterSharedElementCallback(sharedElementCallback);
        this.f165044e.setExitSharedElementCallback(sharedElementCallback);
        StringBuilder sb = new StringBuilder();
        for (WeakReference weakReference : mMTransitionHelper.mo81991b(this.f165044e).f165039c) {
            ResultReceiver resultReceiver = (ResultReceiver) weakReference.get();
            if (resultReceiver != null) {
                resultReceiver.send(106, (Bundle) null);
                sb.append("c:" + resultReceiver + ' ');
            }
        }
        if (sb.length() > 0) {
            Log.m105924i("MM.Transition", "onDestroy() act:" + this.f165044e + " coordinator is not null " + sb);
            return;
        }
        Log.m105924i("MM.Transition", "onDestroy() act:" + this.f165044e + " coordinator is null");
    }

    @C112974b0(C39623j.C39625b.ON_STOP)
    public final void onStop() {
        if (this.f165043d.f165038b && Build.VERSION.SDK_INT >= 29 && !((AppCompatActivity) this.f165044e).isFinishing()) {
            new Instrumentation().callActivityOnSaveInstanceState(this.f165044e, new Bundle());
        }
    }
}
