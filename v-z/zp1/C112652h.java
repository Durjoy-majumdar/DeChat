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

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.trands.trace.TraceScheduler$beforeOut$1", mo125469f = "TraceScheduler.kt", mo125470l = {90}, mo125471m = "invokeSuspend")
/* renamed from: zp1.h */
public final class C112652h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f337331d;

    /* renamed from: e */
    public Object f337332e;

    /* renamed from: f */
    public Object f337333f;

    /* renamed from: g */
    public Object f337334g;

    /* renamed from: h */
    public int f337335h;

    /* renamed from: i */
    public final /* synthetic */ C61570q f337336i;

    /* renamed from: j */
    public final /* synthetic */ String f337337j;

    /* renamed from: n */
    public final /* synthetic */ C112654j f337338n;

    /* renamed from: o */
    public final /* synthetic */ String f337339o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112652h(C61570q qVar, String str, C112654j jVar, String str2, C15601d<? super C112652h> dVar) {
        super(2, dVar);
        this.f337336i = qVar;
        this.f337337j = str;
        this.f337338n = jVar;
        this.f337339o = str2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C112652h(this.f337336i, this.f337337j, this.f337338n, this.f337339o, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112652h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C112648e eVar;
        C60942d dVar;
        C112654j jVar;
        String str;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f337335h;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C112648e eVar2 = new C112648e(this.f337336i, C112648e.C112649a.OPERATOR_TYPE_LEAVE, this.f337337j, (C112648e) null, 8, (C8480h) null);
            jVar = this.f337338n;
            C99088c cVar = jVar.f337349c;
            String str2 = this.f337339o;
            this.f337331d = eVar2;
            this.f337332e = cVar;
            this.f337333f = jVar;
            this.f337334g = str2;
            this.f337335h = 1;
            C60942d dVar2 = (C60942d) cVar;
            if (dVar2.mo85908b((Object) null, this) == aVar) {
                return aVar;
            }
            eVar = eVar2;
            str = str2;
            dVar = dVar2;
        } else if (i == 1) {
            str = (String) this.f337334g;
            jVar = (C112654j) this.f337333f;
            eVar = (C112648e) this.f337331d;
            ResultKt.throwOnFailure(obj);
            dVar = (C99088c) this.f337332e;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            jVar.f337347a.mo164395b(eVar, str);
        } catch (Throwable th) {
            dVar.mo85909c((Object) null);
            throw th;
        }
        C13598b0 b0Var = C13598b0.f38549a;
        dVar.mo85909c((Object) null);
        return C13598b0.f38549a;
    }
}
