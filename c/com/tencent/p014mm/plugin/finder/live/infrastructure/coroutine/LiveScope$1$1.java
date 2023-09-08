package com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine;

import a14.C53930o0;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/infrastructure/coroutine/LiveScope$1$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onDestroy", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.infrastructure.coroutine.LiveScope$1$1 */
public final class LiveScope$1$1 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ C55908a f159309d;

    public LiveScope$1$1(C55908a aVar) {
        this.f159309d = aVar;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        C53930o0.m60558e(this.f159309d, (CancellationException) null, 1, (Object) null);
        this.f159309d.f159310d.getLifecycle().removeObserver(this);
        this.f159309d.f159313g.dead();
    }
}
