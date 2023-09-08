package cj1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53965x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f14.C58901s;
import fj1.C45795b;
import fy3.C32227p;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C48978cb0;
import te3.C49712hj1;
import tf0.C64916p1;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: cj1.b */
public final class C54735b {

    /* renamed from: a */
    public final C49712hj1 f153397a;

    /* renamed from: b */
    public C0000n0 f153398b;

    /* renamed from: c */
    public long f153399c;

    /* renamed from: d */
    public long f153400d;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.BubbleExposeReportHelper$onBubbleExposed$2", mo125469f = "BubbleExposeReportHelper.kt", mo125470l = {33}, mo125471m = "invokeSuspend")
    /* renamed from: cj1.b$a */
    public static final class C54736a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f153401d;

        /* renamed from: e */
        public final /* synthetic */ C54735b f153402e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54736a(C54735b bVar, C15601d<? super C54736a> dVar) {
            super(2, dVar);
            this.f153402e = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54736a(this.f153402e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54736a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f153401d;
            if (i == 0 || i == 1) {
                ResultKt.throwOnFailure(obj);
                do {
                    this.f153402e.mo75631b();
                    this.f153402e.getClass();
                    this.f153401d = 1;
                } while (C53965x0.m60607b(120000, this) != aVar);
                return aVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C54735b(C49712hj1 hj12) {
        this.f153397a = hj12;
    }

    /* renamed from: a */
    public final void mo75630a(long j) {
        Log.m105924i("Finder.ShoppingBubbleReport", "product " + j + " start report");
        this.f153399c = System.currentTimeMillis();
        this.f153400d = j;
        C0000n0 n0Var = this.f153398b;
        if (n0Var != null) {
            if (n0Var != null) {
                C53930o0.m60558e(n0Var, (CancellationException) null, 1, (Object) null);
            } else {
                C87412m.m108603p("coroutineScope");
                throw null;
            }
        }
        C53896h0 h0Var = C53872d1.f151117a;
        C0000n0 a = C53930o0.m60554a(C58901s.f168555a);
        this.f153398b = a;
        C53895h.m60466d(a, (C66212f) null, (C53934p0) null, new C54736a(this, (C15601d<? super C54736a>) null), 3, (Object) null);
    }

    /* renamed from: b */
    public final void mo75631b() {
        C49712hj1 hj12;
        C45795b.C32059a aVar = C45795b.f123697j;
        C45795b bVar = C45795b.f123698n;
        if (bVar != null && (hj12 = this.f153397a) != null) {
            int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f153399c) / ((long) 1000));
            C48978cb0 U = C62042e.f176370a.mo87045U(bVar, 33, String.valueOf(this.f153400d), currentTimeMillis);
            Log.m105924i("Finder.ShoppingBubbleReport", "report product " + this.f153400d + " exposed for " + currentTimeMillis);
            ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76728y(hj12, 18054, U);
        }
    }
}
