package com.tencent.matrix.lifecycle.owners;

import androidx.lifecycle.C0125s;
import com.tencent.matrix.lifecycle.C28657g0;
import com.tencent.matrix.lifecycle.C28660i;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.C80404f;
import com.tencent.matrix.lifecycle.C80407h;
import com.tencent.matrix.lifecycle.IBackgroundStatefulOwner;
import com.tencent.matrix.lifecycle.IStatefulOwner;
import com.tencent.matrix.lifecycle.StatefulOwner;
import com.tencent.matrix.lifecycle.StatefulOwnerKt$reverse$1;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Collection;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u0001\r\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/owners/ProcessDeepBackgroundOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Lcom/tencent/matrix/lifecycle/IBackgroundStatefulOwner;", "", "active", "Lcom/tencent/matrix/lifecycle/h;", "observer", "Lrx3/b0;", "observeForever", "Landroidx/lifecycle/s;", "lifecycleOwner", "observeWithLifecycle", "removeObserver", "com/tencent/matrix/lifecycle/owners/ProcessDeepBackgroundOwner$delegate$1", "delegate", "Lcom/tencent/matrix/lifecycle/owners/ProcessDeepBackgroundOwner$delegate$1;", "<init>", "()V", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class ProcessDeepBackgroundOwner extends StatefulOwner implements IBackgroundStatefulOwner {
    public static final ProcessDeepBackgroundOwner INSTANCE = new ProcessDeepBackgroundOwner();
    private static final ProcessDeepBackgroundOwner$delegate$1 delegate;

    static {
        C32226l<Collection<? extends C28660i>, Boolean> lVar = C28657g0.f78631b;
        ProcessUICreatedStateOwner processUICreatedStateOwner = ProcessUICreatedStateOwner.INSTANCE;
        C87412m.m108594g(processUICreatedStateOwner, "$this$reverse");
        ProcessStagedBackgroundOwner processStagedBackgroundOwner = ProcessStagedBackgroundOwner.INSTANCE;
        C87412m.m108594g(processStagedBackgroundOwner, "$this$reverse");
        delegate = new ProcessDeepBackgroundOwner$delegate$1(lVar, new IStatefulOwner[]{new StatefulOwnerKt$reverse$1(processUICreatedStateOwner), ProcessExplicitBackgroundOwner.INSTANCE, new StatefulOwnerKt$reverse$1(processStagedBackgroundOwner)});
    }

    private ProcessDeepBackgroundOwner() {
        super(false, 1, (C8480h) null);
    }

    public boolean active() {
        return delegate.active();
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

    public void observeForever(C80407h hVar) {
        C87412m.m108594g(hVar, "observer");
        delegate.observeForever(hVar);
    }

    public void observeWithLifecycle(C0125s sVar, C80407h hVar) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(hVar, "observer");
        delegate.observeWithLifecycle(sVar, hVar);
    }

    public void removeLifecycleCallback(C80401d dVar) {
        C87412m.m108594g(dVar, "callback");
        IBackgroundStatefulOwner.C80384a.m97974c(this, dVar);
    }

    public void removeLifecycleCallback(C80404f fVar) {
        C87412m.m108594g(fVar, "callback");
        throw null;
    }

    public void removeObserver(C80407h hVar) {
        C87412m.m108594g(hVar, "observer");
        delegate.removeObserver(hVar);
    }

    public void addLifecycleCallback(C80401d dVar) {
        C87412m.m108594g(dVar, "callback");
        IBackgroundStatefulOwner.C80384a.m97973b(this, dVar);
    }
}
