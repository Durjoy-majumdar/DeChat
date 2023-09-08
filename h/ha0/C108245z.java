package ha0;

import a14.C0000n0;
import a14.C53895h;
import com.tencent.maas.MJMaasCore;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ha0.z */
public final class C108245z implements MJMaasCore.LoginParamsCallback {

    /* renamed from: a */
    public static final C108245z f324117a = new C108245z();

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasManager$initSdk$1$2$1$2$1", mo125469f = "MaasManager.kt", mo125470l = {175}, mo125471m = "invokeSuspend")
    /* renamed from: ha0.z$a */
    public static final class C108246a extends C91594j implements C32227p<C0000n0, C15601d<? super C13604l<? extends String, ? extends String>>, Object> {

        /* renamed from: d */
        public int f324118d;

        public C108246a(C15601d<? super C108246a> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C108246a(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C108246a((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f324118d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C108221t tVar = C108221t.f324032a;
                this.f324118d = 1;
                obj = C108221t.m146550b(tVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public final MJMaasCore.LoginParams onGetLoginParams() {
        C13604l lVar = (C13604l) C53895h.m60468f((C66212f) null, new C108246a((C15601d<? super C108246a>) null), 1, (Object) null);
        return new MJMaasCore.LoginParams((String) lVar.f38555d, (String) lVar.f38556e, MJMaasCore.LoginParams.LoginType.ThirdApp);
    }
}
