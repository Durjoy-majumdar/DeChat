package com.tencent.matrix.lifecycle.supervisor;

import androidx.lifecycle.C0125s;
import com.tencent.matrix.lifecycle.C80396b;
import com.tencent.matrix.lifecycle.C80398c;
import com.tencent.matrix.lifecycle.C80403e;
import com.tencent.matrix.lifecycle.C80404f;
import com.tencent.matrix.lifecycle.C80407h;
import com.tencent.matrix.lifecycle.IForegroundStatefulOwner;
import com.tencent.matrix.lifecycle.IStatefulOwner;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, mo182094d2 = {"com/tencent/matrix/lifecycle/supervisor/ProcessSupervisor$appUIForegroundOwner$1", "Lcom/tencent/matrix/lifecycle/supervisor/DispatcherStateOwner;", "Lcom/tencent/matrix/lifecycle/IForegroundStatefulOwner;", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class ProcessSupervisor$appUIForegroundOwner$1 extends DispatcherStateOwner implements IForegroundStatefulOwner {
    public final /* synthetic */ ProcessSupervisor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProcessSupervisor$appUIForegroundOwner$1(ProcessSupervisor processSupervisor, C32226l lVar, IStatefulOwner iStatefulOwner, String str) {
        super(lVar, iStatefulOwner, str);
        this.this$0 = processSupervisor;
    }

    public void addLifecycleCallback(C0125s sVar, C80404f fVar) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(fVar, "callback");
        throw null;
    }

    public void addLifecycleCallback(C80403e eVar) {
        C87412m.m108594g(eVar, "callback");
        C80396b bVar = new C80396b(eVar);
        eVar.f235335a = bVar;
        C13598b0 b0Var = C13598b0.f38549a;
        observeForever(bVar);
    }

    public void addLifecycleCallback(C80404f fVar) {
        C87412m.m108594g(fVar, "callback");
        throw null;
    }

    public boolean isForeground() {
        return active();
    }

    public void removeLifecycleCallback(C80403e eVar) {
        C87412m.m108594g(eVar, "callback");
        C80407h hVar = eVar.f235335a;
        if (hVar != null) {
            removeObserver(hVar);
        }
    }

    public void removeLifecycleCallback(C80404f fVar) {
        C87412m.m108594g(fVar, "callback");
        throw null;
    }

    public void addLifecycleCallback(C0125s sVar, C80403e eVar) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(eVar, "callback");
        C80398c cVar = new C80398c(eVar);
        eVar.f235335a = cVar;
        C13598b0 b0Var = C13598b0.f38549a;
        observeWithLifecycle(sVar, cVar);
    }
}
