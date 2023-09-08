package p865v3;

import a14.C0000n0;
import a14.C53884f2;
import a14.C53973z1;
import c14.C54636p;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p865v3.C65512c;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.multicast.SharedFlowProducer$start$1", mo125469f = "SharedFlowProducer.kt", mo125470l = {75, 80, 80}, mo125471m = "invokeSuspend")
/* renamed from: v3.j */
public final class C65542j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f188576d;

    /* renamed from: e */
    public int f188577e;

    /* renamed from: f */
    public final /* synthetic */ C65537i f188578f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65542j(C65537i iVar, C15601d dVar) {
        super(2, dVar);
        this.f188578f = iVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        return new C65542j(this.f188578f, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C65542j) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Throwable th;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f188577e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C53973z1 z1Var = this.f188578f.f188562a;
            this.f188577e = 1;
            if (((C53884f2) z1Var).mo74521O(this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th4) {
                try {
                    C65537i iVar = this.f188578f;
                    C32227p<C65512c.C65520c.C65522b<T>, C15601d<? super C13598b0>, Object> pVar = iVar.f188565d;
                    C65512c.C65520c.C65522b.C65524b bVar = new C65512c.C65520c.C65522b.C65524b(iVar);
                    this.f188576d = th4;
                    this.f188577e = 3;
                    if (pVar.invoke(bVar, this) == aVar) {
                        return aVar;
                    }
                } catch (C54636p unused) {
                }
                th = th4;
            }
        } else if (i == 2) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (C54636p unused2) {
            }
            return C13598b0.f38549a;
        } else if (i != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            th = (Throwable) this.f188576d;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (C54636p unused3) {
            }
            throw th;
        }
        C65537i iVar2 = this.f188578f;
        C32227p<C65512c.C65520c.C65522b<T>, C15601d<? super C13598b0>, Object> pVar2 = iVar2.f188565d;
        C65512c.C65520c.C65522b.C65524b bVar2 = new C65512c.C65520c.C65522b.C65524b(iVar2);
        this.f188577e = 2;
        if (pVar2.invoke(bVar2, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
