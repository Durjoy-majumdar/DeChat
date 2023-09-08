package com.tencent.p014mm.plugin.datapreloader;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import fy3.C32227p;
import i31.C117132b;
import i31.C117134d;
import i31.C117139g;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.datapreloader.FutureTask$1", mo125469f = "FutureTask.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.datapreloader.FutureTask$1 */
public final class FutureTask$1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0125s f345788d;

    /* renamed from: e */
    public final /* synthetic */ C117134d<Object, Object, C117139g<Object, Object>> f345789e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FutureTask$1(C0125s sVar, C117134d<Object, Object, C117139g<Object, Object>> dVar, C15601d<? super FutureTask$1> dVar2) {
        super(2, dVar2);
        this.f345788d = sVar;
        this.f345789e = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new FutureTask$1(this.f345788d, this.f345789e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((FutureTask$1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C39623j lifecycle;
        ResultKt.throwOnFailure(obj);
        C0125s sVar = this.f345788d;
        if (!(sVar == null || (lifecycle = sVar.getLifecycle()) == null)) {
            if (!(lifecycle.getCurrentState() != C39623j.C39626c.DESTROYED)) {
                lifecycle = null;
            }
            if (lifecycle != null) {
                final C117134d<Object, Object, C117139g<Object, Object>> dVar = this.f345789e;
                final C0125s sVar2 = this.f345788d;
                lifecycle.addObserver(new C0124r() {
                    @C112974b0(C39623j.C39625b.ON_DESTROY)
                    public final void onDestroy() {
                        C0000n0 c = dVar.mo181069c();
                        C53930o0.m60557d(c, dVar.mo384e() + ", onDestroy", (Throwable) null, 2, (Object) null);
                        C117134d<Object, Object, C117139g<Object, Object>> dVar = dVar;
                        if (dVar.f350949b != null) {
                            dVar.mo181068b().mo10079a();
                        } else {
                            C53895h.m60466d(dVar.mo181069c(), (C66212f) null, (C53934p0) null, new C117132b(dVar, (C15601d<? super C117132b>) null), 3, (Object) null);
                        }
                        sVar2.getLifecycle().removeObserver(this);
                    }
                });
            }
        }
        return C13598b0.f38549a;
    }
}
