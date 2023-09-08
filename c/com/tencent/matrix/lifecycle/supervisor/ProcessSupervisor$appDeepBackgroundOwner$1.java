package com.tencent.matrix.lifecycle.supervisor;

import androidx.lifecycle.C0125s;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.C80404f;
import com.tencent.matrix.lifecycle.IBackgroundStatefulOwner;
import com.tencent.matrix.lifecycle.IStatefulOwner;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, mo182094d2 = {"com/tencent/matrix/lifecycle/supervisor/ProcessSupervisor$appDeepBackgroundOwner$1", "Lcom/tencent/matrix/lifecycle/supervisor/DispatcherStateOwner;", "Lcom/tencent/matrix/lifecycle/IBackgroundStatefulOwner;", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class ProcessSupervisor$appDeepBackgroundOwner$1 extends DispatcherStateOwner implements IBackgroundStatefulOwner {
    public final /* synthetic */ ProcessSupervisor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProcessSupervisor$appDeepBackgroundOwner$1(ProcessSupervisor processSupervisor, C32226l lVar, IStatefulOwner iStatefulOwner, String str) {
        super(lVar, iStatefulOwner, str);
        this.this$0 = processSupervisor;
    }

    public void addLifecycleCallback(C0125s sVar, C80401d dVar) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(dVar, "callback");
        IBackgroundStatefulOwner.C80384a.m97972a(this, sVar, dVar);
    }

    public void addLifecycleCallback(C0125s sVar, C80404f fVar) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(fVar, "callback");
        throw null;
    }

    public void addLifecycleCallback(C80404f fVar) {
        C87412m.m108594g(fVar, "callback");
        throw null;
    }

    public boolean isBackground() {
        return active();
    }

    public void removeLifecycleCallback(C80401d dVar) {
        C87412m.m108594g(dVar, "callback");
        IBackgroundStatefulOwner.C80384a.m97974c(this, dVar);
    }

    public void removeLifecycleCallback(C80404f fVar) {
        C87412m.m108594g(fVar, "callback");
        throw null;
    }

    public void addLifecycleCallback(C80401d dVar) {
        C87412m.m108594g(dVar, "callback");
        IBackgroundStatefulOwner.C80384a.m97973b(this, dVar);
    }
}
