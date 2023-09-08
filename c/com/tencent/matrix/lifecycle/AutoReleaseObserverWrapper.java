package com.tencent.matrix.lifecycle;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/AutoReleaseObserverWrapper;", "Lcom/tencent/matrix/lifecycle/f0;", "Landroidx/lifecycle/r;", "Lrx3/b0;", "release", "Landroidx/lifecycle/s;", "lifecycleOwner", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "targetObservable", "Lcom/tencent/matrix/lifecycle/h;", "observer", "<init>", "(Landroidx/lifecycle/s;Lcom/tencent/matrix/lifecycle/StatefulOwner;Lcom/tencent/matrix/lifecycle/h;)V", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
final class AutoReleaseObserverWrapper extends C80405f0 implements C0124r {

    /* renamed from: f */
    public final C0125s f235312f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoReleaseObserverWrapper(C0125s sVar, StatefulOwner statefulOwner, C80407h hVar) {
        super(hVar, statefulOwner);
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(statefulOwner, "targetObservable");
        C87412m.m108594g(hVar, "observer");
        this.f235312f = sVar;
        C39623j lifecycle = sVar.getLifecycle();
        C87412m.m108593f(lifecycle, "lifecycleOwner.lifecycle");
        if (lifecycle.getCurrentState() != C39623j.C39626c.DESTROYED) {
            sVar.getLifecycle().addObserver(this);
            return;
        }
        throw new IllegalStateException("NOT allow to observe with DESTROYED lifecycle owner");
    }

    /* renamed from: a */
    public boolean mo111851a(C0125s sVar) {
        return C87412m.m108589b(this.f235312f, sVar);
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void release() {
        this.f235337e.removeObserver(this.f235336d);
    }
}
