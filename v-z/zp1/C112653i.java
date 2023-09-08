package zp1;

import a14.C0000n0;
import fy3.C32227p;
import gy3.C8480h;
import k14.C60942d;
import k14.C99088c;
import kotlin.ResultKt;
import p204mr.C61570q;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zp1.C112648e;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.trands.trace.TraceScheduler$justOnce$1", mo125469f = "TraceScheduler.kt", mo125470l = {90}, mo125471m = "invokeSuspend")
/* renamed from: zp1.i */
public final class C112653i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f337340d;

    /* renamed from: e */
    public Object f337341e;

    /* renamed from: f */
    public Object f337342f;

    /* renamed from: g */
    public int f337343g;

    /* renamed from: h */
    public final /* synthetic */ C61570q f337344h;

    /* renamed from: i */
    public final /* synthetic */ String f337345i;

    /* renamed from: j */
    public final /* synthetic */ C112654j f337346j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112653i(C61570q qVar, String str, C112654j jVar, C15601d<? super C112653i> dVar) {
        super(2, dVar);
        this.f337344h = qVar;
        this.f337345i = str;
        this.f337346j = jVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C112653i(this.f337344h, this.f337345i, this.f337346j, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112653i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C112648e eVar;
        C99088c cVar;
        C112654j jVar;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f337343g;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C112648e eVar2 = new C112648e(this.f337344h, C112648e.C112649a.OPERATOR_TYPE_ONCE, this.f337345i, (C112648e) null, 8, (C8480h) null);
            C112654j jVar2 = this.f337346j;
            C99088c cVar2 = jVar2.f337349c;
            this.f337340d = eVar2;
            this.f337341e = cVar2;
            this.f337342f = jVar2;
            this.f337343g = 1;
            C60942d dVar = (C60942d) cVar2;
            if (dVar.mo85908b((Object) null, this) == aVar) {
                return aVar;
            }
            jVar = jVar2;
            cVar = dVar;
            eVar = eVar2;
        } else if (i == 1) {
            jVar = (C112654j) this.f337342f;
            cVar = (C99088c) this.f337341e;
            eVar = (C112648e) this.f337340d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            jVar.f337347a.mo164396c(eVar);
        } catch (Throwable th) {
            cVar.mo85909c((Object) null);
            throw th;
        }
        C13598b0 b0Var = C13598b0.f38549a;
        cVar.mo85909c((Object) null);
        return C13598b0.f38549a;
    }
}
