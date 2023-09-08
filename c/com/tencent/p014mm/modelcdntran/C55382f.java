package com.tencent.p014mm.modelcdntran;

import a14.C0000n0;
import d14.C45253g;
import d14.C58097y0;
import fy3.C32227p;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13600d;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.modelcdntran.CdnFSCJavaHelper$Companion$startCdnUpload$1$1", mo125469f = "CdnFSCJavaHelper.kt", mo125470l = {45}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.modelcdntran.f */
public final class C55382f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f157715d;

    /* renamed from: e */
    public final /* synthetic */ C58097y0<C92798v> f157716e;

    /* renamed from: f */
    public final /* synthetic */ WeakReference<C55384i> f157717f;

    /* renamed from: com.tencent.mm.modelcdntran.f$a */
    public static final class C55383a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ WeakReference<C55384i> f157718d;

        public C55383a(WeakReference<C55384i> weakReference) {
            this.f157718d = weakReference;
        }

        public Object emit(Object obj, C15601d dVar) {
            C92798v vVar = (C92798v) obj;
            C55384i iVar = this.f157718d.get();
            if (iVar != null) {
                iVar.mo11363a(vVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55382f(C58097y0<C92798v> y0Var, WeakReference<C55384i> weakReference, C15601d<? super C55382f> dVar) {
        super(2, dVar);
        this.f157716e = y0Var;
        this.f157717f = weakReference;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C55382f(this.f157716e, this.f157717f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        ((C55382f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        return C15911a.COROUTINE_SUSPENDED;
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f157715d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58097y0<C92798v> y0Var = this.f157716e;
            C55383a aVar2 = new C55383a(this.f157717f);
            this.f157715d = 1;
            if (y0Var.mo31880a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        throw new C13600d();
    }
}
