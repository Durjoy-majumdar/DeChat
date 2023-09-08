package p51;

import a14.C0000n0;
import a14.C53860b3;
import a14.C53975z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import p821rk.C48037j;
import q51.C47755b;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.eggspring.EggRedEnvelopeHelper$checkShowEgg$1", mo125469f = "EggRedEnvelopeHelper.kt", mo125470l = {50}, mo125471m = "invokeSuspend")
/* renamed from: p51.e */
public final class C110181e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f329610d;

    /* renamed from: e */
    public final /* synthetic */ C110183f f329611e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.eggspring.EggRedEnvelopeHelper$checkShowEgg$1$resp$1", mo125469f = "EggRedEnvelopeHelper.kt", mo125470l = {51}, mo125471m = "invokeSuspend")
    /* renamed from: p51.e$a */
    public static final class C110182a extends C91594j implements C32227p<C0000n0, C15601d<? super C48037j>, Object> {

        /* renamed from: d */
        public int f329612d;

        public C110182a(C15601d<? super C110182a> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C110182a(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C110182a((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f329612d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C47755b bVar = new C47755b("");
                this.f329612d = 1;
                obj = C110175b.m149770a(bVar, this);
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110181e(C110183f fVar, C15601d<? super C110181e> dVar) {
        super(2, dVar);
        this.f329611e = fVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C110181e(this.f329611e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C110181e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        C32227p<? super Boolean, ? super String, C13598b0> pVar;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f329610d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C110182a aVar2 = new C110182a((C15601d<? super C110182a>) null);
            this.f329610d = 1;
            obj = C53860b3.m60374b(10000, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (C110174a e) {
                this.f329611e.getClass();
                Log.m105928w("MicroMsg.EggRedEnvelopeHelper", "Cgi error: " + e.getMessage());
            } catch (C53975z2 unused) {
                this.f329611e.getClass();
                Log.m105928w("MicroMsg.EggRedEnvelopeHelper", "Cgi Timeout: ");
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C48037j jVar = (C48037j) obj;
        this.f329611e.f329616d = jVar.f128848f * 1000;
        Log.m105924i("MicroMsg.EggRedEnvelopeHelper", "checkShowEgg: " + jVar.f128846d + ", " + jVar.f128847e + ", " + jVar.f128848f);
        if (!(!jVar.f128846d || (str = jVar.f128847e) == null || (pVar = this.f329611e.f329617e) == null)) {
            pVar.invoke(Boolean.TRUE, str);
        }
        return C13598b0.f38549a;
    }
}
