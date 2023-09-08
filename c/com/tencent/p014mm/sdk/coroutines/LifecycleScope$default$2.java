package com.tencent.p014mm.sdk.coroutines;

import a14.C53935p1;
import a14.C53939q1;
import fy3.C32224a;
import gy3.C87413o;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"La14/p1;", "invoke", "()La14/p1;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.coroutines.LifecycleScope$default$2 */
public final class LifecycleScope$default$2 extends C87413o implements C32224a<C53935p1> {
    public final /* synthetic */ LifecycleScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleScope$default$2(LifecycleScope lifecycleScope) {
        super(0);
        this.this$0 = lifecycleScope;
    }

    public final C53935p1 invoke() {
        if (this.this$0.getThreadCount() <= 1) {
            return new C53939q1(((C119157j) C119157j.f356862d).mo183883n(this.this$0.getName()));
        }
        return new C53939q1(((C119157j) C119157j.f356862d).mo183882m(this.this$0.getName(), this.this$0.getThreadCount(), this.this$0.getThreadCount(), new LinkedBlockingQueue()));
    }
}
