package tl1;

import a14.C0000n0;
import android.content.Context;
import cl1.C55001u;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import o40.C61926c;
import rl1.C13022d0;
import rl1.C13064o0;
import rx3.C13598b0;
import te3.C48914bw;
import te3.C51633v21;
import te3.C52204z21;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.lottery.card.VisitorLotteryCardDoneWidget$onCustomizeClaimClick$1$1", mo125469f = "VisitorLotteryCardDoneWidget.kt", mo125470l = {142}, mo125471m = "invokeSuspend")
/* renamed from: tl1.w */
public final class C14009w extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f39342d;

    /* renamed from: e */
    public final /* synthetic */ C14012y f39343e;

    /* renamed from: f */
    public final /* synthetic */ String f39344f;

    /* renamed from: g */
    public final /* synthetic */ C52204z21 f39345g;

    /* renamed from: tl1.w$a */
    public static final class C14010a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C14012y f39346d;

        /* renamed from: e */
        public final /* synthetic */ C51633v21 f39347e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14010a(C14012y yVar, C51633v21 v212) {
            super(0);
            this.f39346d = yVar;
            this.f39347e = v212;
        }

        public Object invoke() {
            ((C13022d0) this.f39346d.f39350a.mo87696x0(C13022d0.class)).mo12548o3(this.f39347e);
            C14012y yVar = this.f39346d;
            yVar.mo13439a(yVar.f39362m, this.f39347e);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14009w(C14012y yVar, String str, C52204z21 z212, C15601d<? super C14009w> dVar) {
        super(2, dVar);
        this.f39343e = yVar;
        this.f39344f = str;
        this.f39345g = z212;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C14009w(this.f39343e, this.f39344f, this.f39345g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C14009w) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Class cls = C55001u.class;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f39342d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C13064o0 o0Var = C13064o0.f37206a;
            long j = ((C55001u) this.f39343e.f39350a.mo87684A0().mo71262a(cls)).f154416j;
            byte[] bArr = ((C55001u) this.f39343e.f39350a.mo87684A0().mo71262a(cls)).f154417n;
            Context context = this.f39343e.f39351b.getContext();
            C87412m.m108593f(context, "doneContainer.context");
            C48914bw bwVar = new C48914bw();
            bwVar.f131340g = this.f39344f;
            C13598b0 b0Var = C13598b0.f38549a;
            C52204z21 z212 = this.f39345g;
            this.f39342d = 1;
            obj = o0Var.mo12569h(j, bArr, context, "claimByCustomize: " + this.f39344f, bwVar, z212, this);
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
            C61926c.m72668M(new C14010a(this.f39343e, v212));
        }
        return C13598b0.f38549a;
    }
}
