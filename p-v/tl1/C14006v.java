package tl1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53934p0;
import al1.C0082q;
import android.content.Context;
import bh0.C113174b;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import nk1.C11207i;
import o40.C61926c;
import qo3.C47883u;
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

/* renamed from: tl1.v */
public final class C14006v implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ C14012y f39334a;

    /* renamed from: b */
    public final /* synthetic */ C113174b f39335b;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.lottery.card.VisitorLotteryCardDoneWidget$onActivityResult$1$1$1", mo125469f = "VisitorLotteryCardDoneWidget.kt", mo125470l = {324}, mo125471m = "invokeSuspend")
    /* renamed from: tl1.v$a */
    public static final class C14007a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f39336d;

        /* renamed from: e */
        public final /* synthetic */ C14012y f39337e;

        /* renamed from: f */
        public final /* synthetic */ C113174b f39338f;

        /* renamed from: g */
        public final /* synthetic */ C52204z21 f39339g;

        /* renamed from: tl1.v$a$a */
        public static final class C14008a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C14012y f39340d;

            /* renamed from: e */
            public final /* synthetic */ C51633v21 f39341e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C14008a(C14012y yVar, C51633v21 v212) {
                super(0);
                this.f39340d = yVar;
                this.f39341e = v212;
            }

            public Object invoke() {
                ((C13022d0) this.f39340d.f39350a.mo87696x0(C13022d0.class)).mo12548o3(this.f39341e);
                C14012y yVar = this.f39340d;
                yVar.mo13439a(yVar.f39362m, this.f39341e);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14007a(C14012y yVar, C113174b bVar, C52204z21 z212, C15601d<? super C14007a> dVar) {
            super(2, dVar);
            this.f39337e = yVar;
            this.f39338f = bVar;
            this.f39339g = z212;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C14007a(this.f39337e, this.f39338f, this.f39339g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C14007a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C13598b0 b0Var;
            Class cls = C55001u.class;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f39336d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C13064o0 o0Var = C13064o0.f37206a;
                long j = ((C55001u) this.f39337e.f39350a.mo87696x0(cls)).f154416j;
                byte[] bArr = ((C55001u) this.f39337e.f39350a.mo87696x0(cls)).f154417n;
                Context context = this.f39337e.f39351b.getContext();
                C87412m.m108593f(context, "doneContainer.context");
                C48914bw bwVar = new C48914bw();
                C113174b bVar = this.f39338f;
                bwVar.f131337d = bVar.f338621n;
                bwVar.f131338e = bVar.f338622o;
                bwVar.f131339f = o0Var.mo12565d(bVar);
                C13598b0 b0Var2 = C13598b0.f38549a;
                C52204z21 z212 = this.f39339g;
                this.f39336d = 1;
                obj = o0Var.mo12569h(j, bArr, context, "claim addr:" + this.f39338f.f338620j, bwVar, z212, this);
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
                C61926c.m72668M(new C14008a(this.f39337e, v212));
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105920e("VisitorLotteryCardDoneWidget", "claim addr:" + this.f39338f.f338620j + " but resp is null!");
            }
            return C13598b0.f38549a;
        }
    }

    public C14006v(C14012y yVar, C113174b bVar) {
        this.f39334a = yVar;
        this.f39335b = bVar;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        C52204z21 z212;
        if (z) {
            C0082q qVar = ((C13022d0) this.f39334a.f39350a.mo87696x0(C13022d0.class)).f37098n;
            if (qVar == null || (z212 = qVar.f509d) == null) {
                Log.m105920e("VisitorLotteryCardDoneWidget", "post addr but lotteryInfo is empty!");
                C13598b0 b0Var = C13598b0.f38549a;
                return;
            }
            C14012y yVar = this.f39334a;
            C11207i.m11067c(yVar.f39350a, C53872d1.f151119c, (C53934p0) null, new C14007a(yVar, this.f39335b, z212, (C15601d<? super C14007a>) null), 2, (Object) null);
        }
    }
}
