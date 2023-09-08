package com.tencent.p014mm.sdk.p134kt;

import a14.C53973z1;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"T", "", "it", "Lrx3/b0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.kt.CommonKt$syncFlow$4$1$2 */
public final class CommonKt$syncFlow$4$1$2 extends C87413o implements C32226l<Throwable, C13598b0> {
    public final /* synthetic */ C8479f0<C53973z1> $job;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonKt$syncFlow$4$1$2(C8479f0<C53973z1> f0Var) {
        super(1);
        this.$job = f0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C13598b0.f38549a;
    }

    public final void invoke(Throwable th) {
        C53973z1 z1Var = (C53973z1) this.$job.f27484d;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
    }
}
