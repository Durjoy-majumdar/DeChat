package pl1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import rx3.C13598b0;
import u60.C14120b;
import u60.C14121l;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: pl1.m0 */
public final class C11981m0 implements C14120b {

    /* renamed from: a */
    public final String f34964a;

    /* renamed from: b */
    public ConcurrentLinkedDeque<C14121l> f34965b = new ConcurrentLinkedDeque<>();

    /* renamed from: c */
    public boolean f34966c;

    /* renamed from: d */
    public final AtomicInteger f34967d;

    /* renamed from: e */
    public int f34968e;

    /* renamed from: f */
    public final C0000n0 f34969f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.loader.FinderSingleTaskExecutor$checkNextTask$1", mo125469f = "FinderSingleTaskExecutor.kt", mo125470l = {49}, mo125471m = "invokeSuspend")
    /* renamed from: pl1.m0$a */
    public static final class C11982a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f34970d;

        /* renamed from: e */
        public Object f34971e;

        /* renamed from: f */
        public Object f34972f;

        /* renamed from: g */
        public int f34973g;

        /* renamed from: h */
        public final /* synthetic */ C11981m0 f34974h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11982a(C11981m0 m0Var, C15601d<? super C11982a> dVar) {
            super(2, dVar);
            this.f34974h = m0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C11982a(this.f34974h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C11982a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C11981m0 m0Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f34973g;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C14121l poll = this.f34974h.f34965b.poll();
                if (poll != null) {
                    C11981m0 m0Var2 = this.f34974h;
                    m0Var2.f34966c = true;
                    this.f34970d = m0Var2;
                    this.f34971e = poll;
                    this.f34972f = this;
                    this.f34973g = 1;
                    C66218h hVar = new C66218h(C66447b.m78392b(this));
                    C11980l0 l0Var = poll instanceof C11980l0 ? (C11980l0) poll : null;
                    if (l0Var != null) {
                        l0Var.f34963i = hVar;
                    }
                    poll.mo11852a();
                    if (hVar.mo90314b() == aVar) {
                        return aVar;
                    }
                    m0Var = m0Var2;
                }
                return C13598b0.f38549a;
            } else if (i == 1) {
                C11982a aVar2 = (C11982a) this.f34972f;
                C14121l lVar = (C14121l) this.f34971e;
                m0Var = (C11981m0) this.f34970d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m0Var.f34966c = false;
            m0Var.mo11857b();
            return C13598b0.f38549a;
        }
    }

    public C11981m0(String str) {
        C87412m.m108594g(str, "name");
        this.f34964a = str;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.f34967d = atomicInteger;
        this.f34968e = atomicInteger.get();
        this.f34969f = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c));
    }

    /* renamed from: a */
    public void mo11856a(C14121l lVar) {
        C87412m.m108594g(lVar, "task");
        Log.m105924i("FinderSingleTaskExecutor", "[postTask] name=" + this.f34964a + " isRunningTask=" + this.f34966c + " task=" + lVar);
        lVar.f39521h = this.f34968e;
        this.f34965b.add(lVar);
        mo11857b();
    }

    /* renamed from: b */
    public final synchronized void mo11857b() {
        Log.m105924i("FinderSingleTaskExecutor", "[checkNextTask] name=" + this.f34964a + " isRunningTask=" + this.f34966c + " waitSize=" + this.f34965b.size());
        if (!this.f34966c) {
            C53895h.m60466d(this.f34969f, (C66212f) null, (C53934p0) null, new C11982a(this, (C15601d<? super C11982a>) null), 3, (Object) null);
        }
    }

    public int getToken() {
        return this.f34968e;
    }

    public void reset() {
        this.f34968e = this.f34967d.incrementAndGet();
        Log.m105924i("FinderSingleTaskExecutor", "[reset] name=" + this.f34964a);
        for (C14121l e : this.f34965b) {
            e.mo10270e();
        }
        this.f34965b.clear();
        C0000n0 n0Var = this.f34969f;
        C53930o0.m60557d(n0Var, "reset: name=" + this.f34964a, (Throwable) null, 2, (Object) null);
        this.f34966c = false;
    }
}
