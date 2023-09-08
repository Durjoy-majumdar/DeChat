package com.tencent.matrix.lifecycle;

import androidx.lifecycle.C0125s;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0017J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0017¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/IForegroundStatefulOwner;", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "", "isForeground", "Lcom/tencent/matrix/lifecycle/e;", "callback", "Lrx3/b0;", "addLifecycleCallback", "Landroidx/lifecycle/s;", "lifecycleOwner", "removeLifecycleCallback", "Lcom/tencent/matrix/lifecycle/f;", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public interface IForegroundStatefulOwner extends IStatefulOwner {
    /* synthetic */ boolean active();

    void addLifecycleCallback(C0125s sVar, C80403e eVar);

    void addLifecycleCallback(C0125s sVar, C80404f fVar);

    void addLifecycleCallback(C80403e eVar);

    void addLifecycleCallback(C80404f fVar);

    boolean isForeground();

    /* synthetic */ void observeForever(C80407h hVar);

    /* synthetic */ void observeWithLifecycle(C0125s sVar, C80407h hVar);

    void removeLifecycleCallback(C80403e eVar);

    void removeLifecycleCallback(C80404f fVar);

    /* synthetic */ void removeObserver(C80407h hVar);
}
