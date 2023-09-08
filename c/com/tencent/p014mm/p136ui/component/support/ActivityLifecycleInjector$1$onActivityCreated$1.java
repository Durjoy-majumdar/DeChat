package com.tencent.p014mm.p136ui.component.support;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0005"}, mo182094d2 = {"com/tencent/mm/ui/component/support/ActivityLifecycleInjector$1$onActivityCreated$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onPostCreate", "onPreDestroy", "plugin-uic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.component.support.ActivityLifecycleInjector$1$onActivityCreated$1 */
public final class ActivityLifecycleInjector$1$onActivityCreated$1 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ Activity f348356d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f348357e;

    public ActivityLifecycleInjector$1$onActivityCreated$1(Activity activity, Bundle bundle) {
        this.f348356d = activity;
        this.f348357e = bundle;
    }

    @C112974b0(C39623j.C39625b.ON_CREATE)
    public final void onPostCreate() {
        ActivityLifecycleInjector.f348355c.mo177385a(this.f348356d, this.f348357e);
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onPreDestroy() {
        ActivityLifecycleInjector.f348355c.mo177388d(this.f348356d);
    }
}
