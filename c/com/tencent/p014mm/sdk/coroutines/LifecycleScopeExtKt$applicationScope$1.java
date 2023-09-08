package com.tencent.p014mm.sdk.coroutines;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53896h0;
import a14.C53915k2;
import f14.C58901s;
import gy3.C87412m;
import kotlin.Metadata;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"com/tencent/mm/sdk/coroutines/LifecycleScopeExtKt$applicationScope$1", "La14/n0;", "Lwx3/f;", "coroutineContext", "Lwx3/f;", "getCoroutineContext", "()Lwx3/f;", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.coroutines.LifecycleScopeExtKt$applicationScope$1 */
public final class LifecycleScopeExtKt$applicationScope$1 implements C0000n0 {
    private final C66212f coroutineContext;

    public LifecycleScopeExtKt$applicationScope$1() {
        C53896h0 h0Var = C53872d1.f151117a;
        C53915k2 i0 = C58901s.f168555a.mo74590i0();
        C87412m.m108594g(i0, "context");
        this.coroutineContext = i0;
    }

    public C66212f getCoroutineContext() {
        return this.coroutineContext;
    }
}
