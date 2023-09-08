package ck2;

import a14.C0000n0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC;
import d14.C45253g;
import d14.C58050i1;
import d14.C58052j1;
import fy3.C32227p;
import kotlin.ResultKt;
import rj2.C63451c;
import rx3.C13598b0;
import rx3.C13600d;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC$hookPlayState$1", mo125469f = "RingtoneDataUIC.kt", mo125470l = {154}, mo125471m = "invokeSuspend")
/* renamed from: ck2.b */
public final class C54875b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f153807d;

    /* renamed from: e */
    public final /* synthetic */ RingtoneDataUIC f153808e;

    /* renamed from: ck2.b$a */
    public static final class C54876a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ RingtoneDataUIC f153809d;

        public C54876a(RingtoneDataUIC ringtoneDataUIC) {
            this.f153809d = ringtoneDataUIC;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
            if (r4 != 3) goto L_0x001c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r4, wx3.C15601d r5) {
            /*
                r3 = this;
                rj2.c$a$a r4 = (rj2.C63451c.C63452a.C63453a) r4
                int r4 = r4.f179989b
                r5 = 0
                r0 = -1
                r1 = 1
                if (r4 == r1) goto L_0x0016
                r2 = 2
                if (r4 == r2) goto L_0x0010
                r1 = 3
                if (r4 == r1) goto L_0x0016
                goto L_0x001c
            L_0x0010:
                com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC r4 = r3.f153809d
                r4.mo80834i3(r0, r1, r5)
                goto L_0x001c
            L_0x0016:
                com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC r4 = r3.f153809d
                r1 = 0
                r4.mo80834i3(r0, r1, r5)
            L_0x001c:
                rx3.b0 r4 = rx3.C13598b0.f38549a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ck2.C54875b.C54876a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54875b(RingtoneDataUIC ringtoneDataUIC, C15601d<? super C54875b> dVar) {
        super(2, dVar);
        this.f153808e = ringtoneDataUIC;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54875b(this.f153808e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        ((C54875b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        return C15911a.COROUTINE_SUSPENDED;
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f153807d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58050i1<C63451c.C63452a.C63453a> i1Var = ((C54883d0) C39818r.f106831a.mo62444c(this.f153808e.getActivity()).mo75002a(C54883d0.class)).f153833d.f179977f;
            C54876a aVar2 = new C54876a(this.f153808e);
            this.f153807d = 1;
            if (((C58052j1) i1Var).mo31880a(aVar2, this) == aVar) {
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
