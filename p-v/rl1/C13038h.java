package rl1;

import a14.C0000n0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import te3.C48914bw;
import te3.C51633v21;
import te3.C52204z21;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.lottery.FinderLiveLotteryAudienceUIC$onCustomizeClaimClick$1$1", mo125469f = "FinderLiveLotteryAudienceUIC.kt", mo125470l = {448}, mo125471m = "invokeSuspend")
/* renamed from: rl1.h */
public final class C13038h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f37139d;

    /* renamed from: e */
    public final /* synthetic */ C63463e f37140e;

    /* renamed from: f */
    public final /* synthetic */ String f37141f;

    /* renamed from: g */
    public final /* synthetic */ C52204z21 f37142g;

    /* renamed from: rl1.h$a */
    public static final class C13039a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63463e f37143d;

        /* renamed from: e */
        public final /* synthetic */ C51633v21 f37144e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13039a(C63463e eVar, C51633v21 v212) {
            super(0);
            this.f37143d = eVar;
            this.f37144e = v212;
        }

        public Object invoke() {
            this.f37143d.mo88337f3(this.f37144e);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13038h(C63463e eVar, String str, C52204z21 z212, C15601d<? super C13038h> dVar) {
        super(2, dVar);
        this.f37140e = eVar;
        this.f37141f = str;
        this.f37142g = z212;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C13038h(this.f37140e, this.f37141f, this.f37142g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C13038h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f37139d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C13064o0 o0Var = C13064o0.f37206a;
            C63463e eVar = this.f37140e;
            C48914bw bwVar = new C48914bw();
            bwVar.f131340g = this.f37141f;
            C13598b0 b0Var = C13598b0.f38549a;
            C52204z21 z212 = this.f37142g;
            this.f37139d = 1;
            obj = o0Var.mo12569h(eVar.f180053y, (byte[]) null, eVar.getActivity(), "claimByCustomize: " + this.f37141f, bwVar, z212, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C51633v21 v212 = (C51633v21) obj;
        if (v212 != null) {
            C61926c.m72668M(new C13039a(this.f37140e, v212));
        }
        return C13598b0.f38549a;
    }
}
