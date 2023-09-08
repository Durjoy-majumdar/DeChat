package com.tencent.p014mm.sdk.coroutines;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.coroutines.LifecycleScope$1$1 */
public final class LifecycleScope$1$1 extends C87413o implements C32224a<C13598b0> {
    public final /* synthetic */ C0125s $owner;
    public final /* synthetic */ LifecycleScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleScope$1$1(C0125s sVar, LifecycleScope lifecycleScope) {
        super(0);
        this.$owner = sVar;
        this.this$0 = lifecycleScope;
    }

    public final void invoke() {
        if (this.$owner.getLifecycle().getCurrentState() != C39623j.C39626c.DESTROYED) {
            this.$owner.getLifecycle().addObserver(this.this$0);
        } else {
            Log.m105924i(LifecycleScope.TAG, "leak this scope, because lifecycle is already destroy");
        }
    }
}
