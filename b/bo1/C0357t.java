package bo1;

import a14.C0000n0;
import a14.C53973z1;
import androidx.lifecycle.C0125s;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87413o;
import i31.C117134d;
import it1.C60625c;
import je1.C46511c0;
import kotlin.ResultKt;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C50294lp0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.preload.FinderShareRelPreloadCore$checkPreloadLandscapeRelFeedList$1", mo125469f = "FinderShareRelPreloadCore.kt", mo125470l = {58}, mo125471m = "invokeSuspend")
/* renamed from: bo1.t */
public final class C0357t extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f951d;

    /* renamed from: e */
    public /* synthetic */ Object f952e;

    /* renamed from: f */
    public final /* synthetic */ long f953f;

    /* renamed from: g */
    public final /* synthetic */ String f954g;

    /* renamed from: h */
    public final /* synthetic */ int f955h;

    /* renamed from: bo1.t$a */
    public static final class C0358a extends C87413o implements C32224a<C60625c<C50294lp0>> {

        /* renamed from: d */
        public final /* synthetic */ long f956d;

        /* renamed from: e */
        public final /* synthetic */ String f957e;

        /* renamed from: f */
        public final /* synthetic */ int f958f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0358a(long j, String str, int i) {
            super(0);
            this.f956d = j;
            this.f957e = str;
            this.f958f = i;
        }

        public Object invoke() {
            long j = this.f956d;
            String str = this.f957e;
            C49712hj1 hj12 = r1;
            C49712hj1 hj13 = new C49712hj1();
            hj13.f134675i = 162;
            C13598b0 b0Var = C13598b0.f38549a;
            C46511c0 c0Var = r1;
            C46511c0 c0Var2 = new C46511c0(j, str, 301, (C89349b) null, (String) null, 31, (String) null, (String) null, (String) null, (C89349b) null, hj12, 0.0f, 0.0f, 0, this.f958f, (Integer) null, 48064, (C8480h) null);
            C46511c0 c0Var3 = c0Var;
            c0Var3.f125308x = 0;
            return c0Var3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0357t(long j, String str, int i, C15601d<? super C0357t> dVar) {
        super(2, dVar);
        this.f953f = j;
        this.f954g = str;
        this.f955h = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C0357t tVar = new C0357t(this.f953f, this.f954g, this.f955h, dVar);
        tVar.f952e = obj;
        return tVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0357t) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f951d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0358a aVar2 = new C0358a(this.f953f, this.f954g, this.f955h);
            C66212f coroutineContext = ((C0000n0) this.f952e).getCoroutineContext();
            int i2 = C53973z1.f151221b0;
            C0343f fVar = new C0343f(aVar2, (C53973z1) coroutineContext.get(C53973z1.C0004b.f3d), (C0125s) null);
            this.f951d = 1;
            if (C117134d.m165172f(fVar, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
