package p257w;

import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import p175j0.C108494d2;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.animation.core.Animatable$runAnimation$2", mo125469f = "Animatable.kt", mo125470l = {291}, mo125471m = "invokeSuspend")
/* renamed from: w.a */
public final class C111624a extends C91594j implements C32226l<C15601d<? super C37899f<Object, C37919o>>, Object> {

    /* renamed from: d */
    public Object f334152d;

    /* renamed from: e */
    public Object f334153e;

    /* renamed from: f */
    public int f334154f;

    /* renamed from: g */
    public final /* synthetic */ C111626b<Object, C37919o> f334155g;

    /* renamed from: h */
    public final /* synthetic */ Object f334156h;

    /* renamed from: i */
    public final /* synthetic */ C111636d<Object, C37919o> f334157i;

    /* renamed from: j */
    public final /* synthetic */ long f334158j;

    /* renamed from: n */
    public final /* synthetic */ C32226l<C111626b<Object, C37919o>, C13598b0> f334159n;

    /* renamed from: w.a$a */
    public static final class C111625a extends C87413o implements C32226l<C111640g<Object, C37919o>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111626b<Object, C37919o> f334160d;

        /* renamed from: e */
        public final /* synthetic */ C111647j<Object, C37919o> f334161e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<C111626b<Object, C37919o>, C13598b0> f334162f;

        /* renamed from: g */
        public final /* synthetic */ C8477a0 f334163g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111625a(C111626b<Object, C37919o> bVar, C111647j<Object, C37919o> jVar, C32226l<? super C111626b<Object, C37919o>, C13598b0> lVar, C8477a0 a0Var) {
            super(1);
            this.f334160d = bVar;
            this.f334161e = jVar;
            this.f334162f = lVar;
            this.f334163g = a0Var;
        }

        public Object invoke(Object obj) {
            C111640g gVar = (C111640g) obj;
            C87412m.m108594g(gVar, "$this$animate");
            C111671y0.m152198f(gVar, this.f334160d.f334166c);
            Object a = C111626b.m152136a(this.f334160d, gVar.mo163316b());
            if (!C87412m.m108589b(a, gVar.mo163316b())) {
                ((C108494d2) this.f334160d.f334166c.f334235e).setValue(a);
                ((C108494d2) this.f334161e.f334235e).setValue(a);
                C32226l<C111626b<Object, C37919o>, C13598b0> lVar = this.f334162f;
                if (lVar != null) {
                    lVar.invoke(this.f334160d);
                }
                gVar.mo163315a();
                this.f334163g.f27482d = true;
            } else {
                C32226l<C111626b<Object, C37919o>, C13598b0> lVar2 = this.f334162f;
                if (lVar2 != null) {
                    lVar2.invoke(this.f334160d);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111624a(C111626b<Object, C37919o> bVar, Object obj, C111636d<Object, C37919o> dVar, long j, C32226l<? super C111626b<Object, C37919o>, C13598b0> lVar, C15601d<? super C111624a> dVar2) {
        super(1, dVar2);
        this.f334155g = bVar;
        this.f334156h = obj;
        this.f334157i = dVar;
        this.f334158j = j;
        this.f334159n = lVar;
    }

    public final C15601d<C13598b0> create(C15601d<?> dVar) {
        return new C111624a(this.f334155g, this.f334156h, this.f334157i, this.f334158j, this.f334159n, dVar);
    }

    public Object invoke(Object obj) {
        return ((C111624a) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C111647j jVar;
        C8477a0 a0Var;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f334154f;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C111626b<Object, C37919o> bVar = this.f334155g;
            C111647j<T, V> jVar2 = bVar.f334166c;
            V v = (C37919o) bVar.f334164a.mo61399a().invoke(this.f334156h);
            jVar2.getClass();
            C87412m.m108594g(v, "<set-?>");
            jVar2.f334236f = v;
            ((C108494d2) this.f334155g.f334168e).setValue(this.f334157i.mo61386f());
            ((C108494d2) this.f334155g.f334167d).setValue(Boolean.TRUE);
            C111647j<T, V> jVar3 = this.f334155g.f334166c;
            C111647j jVar4 = new C111647j(jVar3.f334234d, jVar3.getValue(), C37921p.m41619a(jVar3.f334236f), jVar3.f334237g, Long.MIN_VALUE, jVar3.f334239i);
            C8477a0 a0Var2 = new C8477a0();
            C111636d<Object, C37919o> dVar = this.f334157i;
            long j = this.f334158j;
            C111625a aVar2 = new C111625a(this.f334155g, jVar4, this.f334159n, a0Var2);
            this.f334152d = jVar4;
            this.f334153e = a0Var2;
            this.f334154f = 1;
            C111625a aVar3 = aVar2;
            C111647j jVar5 = jVar4;
            if (C111671y0.m152193a(jVar4, dVar, j, aVar3, this) == aVar) {
                return aVar;
            }
            a0Var = a0Var2;
            jVar = jVar5;
        } else if (i == 1) {
            a0Var = (C8477a0) this.f334153e;
            jVar = (C111647j) this.f334152d;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (CancellationException e) {
                C111626b<Object, C37919o> bVar2 = this.f334155g;
                C111647j<T, V> jVar6 = bVar2.f334166c;
                jVar6.f334236f.mo61404d();
                jVar6.f334237g = Long.MIN_VALUE;
                ((C108494d2) bVar2.f334167d).setValue(Boolean.FALSE);
                throw e;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C37897e eVar = a0Var.f27482d ? C37897e.BoundReached : C37897e.Finished;
        C111626b<Object, C37919o> bVar3 = this.f334155g;
        C111647j<T, V> jVar7 = bVar3.f334166c;
        jVar7.f334236f.mo61404d();
        jVar7.f334237g = Long.MIN_VALUE;
        ((C108494d2) bVar3.f334167d).setValue(Boolean.FALSE);
        return new C37899f(jVar, eVar);
    }
}
