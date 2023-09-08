package com.tencent.p014mm.plugin.appbrand.ipc;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.app.C40008f;
import eb0.C86484b;
import f40.C86709a0;
import f40.C86718e;
import fy3.C32227p;
import kotlin.Metadata;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ipc/AccountScopedMainProcessTask;", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ipc.AccountScopedMainProcessTask */
public abstract class AccountScopedMainProcessTask extends MainProcessTask {

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.ipc.AccountScopedMainProcessTask$runInMainProcess$1", mo125469f = "AccountScopedMainProcessTask.kt", mo125470l = {68, 70}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AccountScopedMainProcessTask$a */
    public static final class C29493a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f80355d;

        /* renamed from: e */
        public final /* synthetic */ AccountScopedMainProcessTask f80356e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29493a(AccountScopedMainProcessTask accountScopedMainProcessTask, C15601d<? super C29493a> dVar) {
            super(2, dVar);
            this.f80356e = accountScopedMainProcessTask;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C29493a(this.f80356e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C29493a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f80355d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountScopedMainProcessTask accountScopedMainProcessTask = this.f80356e;
                this.f80355d = 1;
                accountScopedMainProcessTask.getClass();
                if (C86709a0.m107528h().f251724a.f251792d) {
                    obj2 = C13598b0.f38549a;
                } else {
                    C66218h hVar = new C66218h(C66447b.m78392b(this));
                    C86709a0.m107528h().mo121097c(new C1536b(hVar));
                    obj2 = hVar.mo90314b();
                    if (obj2 != aVar) {
                        obj2 = C13598b0.f38549a;
                    }
                }
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                try {
                    ResultKt.throwOnFailure(obj);
                    this.f80356e.mo56736u();
                } catch (C86484b unused) {
                    this.f80356e.mo56735t();
                }
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AccountScopedMainProcessTask accountScopedMainProcessTask2 = this.f80356e;
            this.f80355d = 2;
            if (AccountScopedMainProcessTask.m38750q(accountScopedMainProcessTask2, this) == aVar) {
                return aVar;
            }
            this.f80356e.mo56736u();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q */
    public static final Object m38750q(AccountScopedMainProcessTask accountScopedMainProcessTask, C15601d dVar) {
        accountScopedMainProcessTask.getClass();
        if (C86709a0.m107523b().f251765p) {
            return C13598b0.f38549a;
        }
        boolean m = C86709a0.m107523b().mo121115m();
        boolean r = C86718e.m107551r();
        if (!m || r) {
            throw new C86484b();
        }
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        new AccountScopedMainProcessTask$waitForAccount$2$1(hVar, C40008f.f107254d).alive();
        Object b = hVar.mo90314b();
        return b == C15911a.COROUTINE_SUSPENDED ? b : C13598b0.f38549a;
    }

    /* renamed from: j */
    public final void mo1553j() {
        C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C29493a(this, (C15601d<? super C29493a>) null), 3, (Object) null);
    }

    /* renamed from: t */
    public void mo56735t() {
        C61926c.m72668M(C1535a.f10907d);
    }

    /* renamed from: u */
    public abstract void mo56736u();
}
