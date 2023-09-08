package e14;

import a14.C0000n0;
import c14.C54649x;
import d14.C45253g;
import d14.C58061m;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", mo125469f = "ChannelFlow.kt", mo125470l = {123}, mo125471m = "invokeSuspend")
/* renamed from: e14.e */
public final class C58480e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f167466d;

    /* renamed from: e */
    public /* synthetic */ Object f167467e;

    /* renamed from: f */
    public final /* synthetic */ C45253g<Object> f167468f;

    /* renamed from: g */
    public final /* synthetic */ C58482g<Object> f167469g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58480e(C45253g<Object> gVar, C58482g<Object> gVar2, C15601d<? super C58480e> dVar) {
        super(2, dVar);
        this.f167468f = gVar;
        this.f167469g = gVar2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C58480e eVar = new C58480e(this.f167468f, this.f167469g, dVar);
        eVar.f167467e = obj;
        return eVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C58480e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f167466d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45253g<Object> gVar = this.f167468f;
            C54649x<Object> j = this.f167469g.mo82818j((C0000n0) this.f167467e);
            this.f167466d = 1;
            Object a = C58061m.m67219a(gVar, j, true, this);
            if (a != aVar) {
                a = C13598b0.f38549a;
            }
            if (a == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
