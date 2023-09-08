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

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.trands.trace.TraceScheduler$beforeIn$1", mo125469f = "TraceScheduler.kt", mo125470l = {90}, mo125471m = "invokeSuspend")
/* renamed from: zp1.g */
public final class C112651g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f337322d;

    /* renamed from: e */
    public Object f337323e;

    /* renamed from: f */
    public Object f337324f;

    /* renamed from: g */
    public Object f337325g;

    /* renamed from: h */
    public int f337326h;

    /* renamed from: i */
    public final /* synthetic */ C61570q f337327i;

    /* renamed from: j */
    public final /* synthetic */ String f337328j;

    /* renamed from: n */
    public final /* synthetic */ C112654j f337329n;

    /* renamed from: o */
    public final /* synthetic */ String f337330o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112651g(C61570q qVar, String str, C112654j jVar, String str2, C15601d<? super C112651g> dVar) {
        super(2, dVar);
        this.f337327i = qVar;
        this.f337328j = str;
        this.f337329n = jVar;
        this.f337330o = str2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C112651g(this.f337327i, this.f337328j, this.f337329n, this.f337330o, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112651g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C112648e eVar;
        C60942d dVar;
        C112654j jVar;
        String str;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f337326h;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C112648e eVar2 = new C112648e(this.f337327i, C112648e.C112649a.OPERATOR_TYPE_ENTER, this.f337328j, (C112648e) null, 8, (C8480h) null);
            jVar = this.f337329n;
            C99088c cVar = jVar.f337349c;
            String str2 = this.f337330o;
            this.f337322d = eVar2;
            this.f337323e = cVar;
            this.f337324f = jVar;
            this.f337325g = str2;
            this.f337326h = 1;
            C60942d dVar2 = (C60942d) cVar;
            if (dVar2.mo85908b((Object) null, this) == aVar) {
                return aVar;
            }
            eVar = eVar2;
            str = str2;
            dVar = dVar2;
        } else if (i == 1) {
            str = (String) this.f337325g;
            jVar = (C112654j) this.f337324f;
            eVar = (C112648e) this.f337322d;
            ResultKt.throwOnFailure(obj);
            dVar = (C99088c) this.f337323e;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            jVar.f337347a.mo164394a(eVar, str);
        } catch (Throwable th) {
            dVar.mo85909c((Object) null);
            throw th;
        }
        C13598b0 b0Var = C13598b0.f38549a;
        dVar.mo85909c((Object) null);
        return C13598b0.f38549a;
    }
}
