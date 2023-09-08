package com.tencent.p014mm.app;

import android.app.Activity;
import android.os.Bundle;
import p261wl.C15510f;

/* renamed from: com.tencent.mm.app.b1 */
public interface C114657b1 extends C15510f {
    void onActivityCreated(Activity activity, Bundle bundle);

    void onActivityDestroyed(Activity activity);

    void onActivityPaused(Activity activity);

    void onActivityPostCreated(Activity activity, Bundle bundle);

    void onActivityPostDestroyed(Activity activity);

    void onActivityPostPaused(Activity activity);

    void onActivityPostResumed(Activity activity);

    void onActivityPostSaveInstanceState(Activity activity, Bundle bundle);

    void onActivityPostStarted(Activity activity);

    void onActivityPostStopped(Activity activity);

    void onActivityPreCreated(Activity activity, Bundle bundle);

    void onActivityPreDestroyed(Activity activity);

    void onActivityPrePaused(Activity activity);

    void onActivityPreResumed(Activity activity);

    void onActivityPreSaveInstanceState(Activity activity, Bundle bundle);

    void onActivityPreStarted(Activity activity);

    void onActivityPreStopped(Activity activity);

    void onActivityResumed(Activity activity);

    void onActivitySaveInstanceState(Activity activity, Bundle bundle);

    void onActivityStarted(Activity activity);

    void onActivityStopped(Activity activity);
}
