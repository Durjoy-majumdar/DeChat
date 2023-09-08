package uf1;

import a14.C0000n0;
import com.tencent.p014mm.plugin.finder.feed.model.loader.DataLoader;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import tf1.C13914m;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.model.loader.DataLoader$load$1", mo125469f = "DataLoader.kt", mo125470l = {23, 24}, mo125471m = "invokeSuspend")
/* renamed from: uf1.c */
public final class C65344c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f188098d;

    /* renamed from: e */
    public /* synthetic */ Object f188099e;

    /* renamed from: f */
    public final /* synthetic */ DataLoader<C13914m> f188100f;

    /* renamed from: g */
    public final /* synthetic */ C65345d<C13914m> f188101g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65344c(DataLoader<C13914m> dataLoader, C65345d<C13914m> dVar, C15601d<? super C65344c> dVar2) {
        super(2, dVar2);
        this.f188100f = dataLoader;
        this.f188101g = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C65344c cVar = new C65344c(this.f188100f, this.f188101g, dVar);
        cVar.f188099e = obj;
        return cVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C65344c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C13598b0 b0Var;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f188098d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f188099e;
            this.f188100f.getClass();
            b0Var = null;
        } else if (i == 1) {
            C0000n0 n0Var2 = (C0000n0) this.f188099e;
            ResultKt.throwOnFailure(obj);
            b0Var = C13598b0.f38549a;
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (b0Var == null) {
            C65345d<C13914m> dVar = this.f188101g;
            this.f188099e = null;
            this.f188098d = 2;
            if (dVar.mo89454b(this) == aVar) {
                return aVar;
            }
        }
        return C13598b0.f38549a;
    }
}
