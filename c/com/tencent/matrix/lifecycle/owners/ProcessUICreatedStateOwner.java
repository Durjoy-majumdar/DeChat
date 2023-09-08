package com.tencent.matrix.lifecycle.owners;

import androidx.lifecycle.C0125s;
import com.tencent.matrix.lifecycle.C80403e;
import com.tencent.matrix.lifecycle.C80404f;
import com.tencent.matrix.lifecycle.C80407h;
import com.tencent.matrix.lifecycle.IForegroundStatefulOwner;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002H\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\nH\u0001J\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001J\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\nH\u0001J\t\u0010\u000b\u001a\u00020\u0002H\u0001J\u0011\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0001J\u0019\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0001J\u0011\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001J\u0011\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\nH\u0001J\u0011\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0001¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/owners/ProcessUICreatedStateOwner;", "Lcom/tencent/matrix/lifecycle/IForegroundStatefulOwner;", "", "active", "Landroidx/lifecycle/s;", "lifecycleOwner", "Lcom/tencent/matrix/lifecycle/e;", "callback", "Lrx3/b0;", "addLifecycleCallback", "Lcom/tencent/matrix/lifecycle/f;", "isForeground", "Lcom/tencent/matrix/lifecycle/h;", "observer", "observeForever", "observeWithLifecycle", "removeLifecycleCallback", "removeObserver", "<init>", "()V", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class ProcessUICreatedStateOwner implements IForegroundStatefulOwner {
    public static final ProcessUICreatedStateOwner INSTANCE = new ProcessUICreatedStateOwner();
    private final /* synthetic */ IForegroundStatefulOwner $$delegate_0 = ProcessUILifecycleOwner.f235388m;

    private ProcessUICreatedStateOwner() {
        ProcessUILifecycleOwner.f235399x.getClass();
    }

    public boolean active() {
        return this.$$delegate_0.active();
    }

    public void addLifecycleCallback(C0125s sVar, C80403e eVar) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(eVar, "callback");
        this.$$delegate_0.addLifecycleCallback(sVar, eVar);
    }

    public void addLifecycleCallback(C0125s sVar, C80404f fVar) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(fVar, "callback");
        throw null;
    }

    public void addLifecycleCallback(C80403e eVar) {
        C87412m.m108594g(eVar, "callback");
        this.$$delegate_0.addLifecycleCallback(eVar);
    }

    public void addLifecycleCallback(C80404f fVar) {
        C87412m.m108594g(fVar, "callback");
        throw null;
    }

    public boolean isForeground() {
        return this.$$delegate_0.isForeground();
    }

    public void observeForever(C80407h hVar) {
        C87412m.m108594g(hVar, "observer");
        this.$$delegate_0.observeForever(hVar);
    }

    public void observeWithLifecycle(C0125s sVar, C80407h hVar) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(hVar, "observer");
        this.$$delegate_0.observeWithLifecycle(sVar, hVar);
    }

    public void removeLifecycleCallback(C80403e eVar) {
        C87412m.m108594g(eVar, "callback");
        this.$$delegate_0.removeLifecycleCallback(eVar);
    }

    public void removeLifecycleCallback(C80404f fVar) {
        C87412m.m108594g(fVar, "callback");
        throw null;
    }

    public void removeObserver(C80407h hVar) {
        C87412m.m108594g(hVar, "observer");
        this.$$delegate_0.removeObserver(hVar);
    }
}
