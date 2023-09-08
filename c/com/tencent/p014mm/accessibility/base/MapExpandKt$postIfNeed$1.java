package com.tencent.p014mm.accessibility.base;

import fy3.C32224a;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.base.MapExpandKt$postIfNeed$1 */
public final class MapExpandKt$postIfNeed$1 implements Runnable {
    public final /* synthetic */ C32224a<C13598b0> $invoke;

    public MapExpandKt$postIfNeed$1(C32224a<C13598b0> aVar) {
        this.$invoke = aVar;
    }

    public final void run() {
        this.$invoke.invoke();
    }
}
