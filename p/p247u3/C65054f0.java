package p247u3;

import a14.C0001s1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53943r1;
import androidx.lifecycle.C54204d;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.concurrent.Executor;
import p247u3.C65035c1;
import p247u3.C65145q1;
import p247u3.C65153r;
import p856m.C61417a;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: u3.f0 */
public final class C65054f0 extends C54204d<C65035c1<Object>> {

    /* renamed from: g */
    public C65035c1<Object> f187242g;

    /* renamed from: h */
    public C65153r<Object, Object> f187243h;

    /* renamed from: i */
    public final C65153r.C65156c f187244i = new C65055a();

    /* renamed from: j */
    public final /* synthetic */ Object f187245j;

    /* renamed from: k */
    public final /* synthetic */ C65153r.C65155b f187246k;

    /* renamed from: l */
    public final /* synthetic */ C65035c1.C65038c f187247l;

    /* renamed from: m */
    public final /* synthetic */ Executor f187248m;

    /* renamed from: n */
    public final /* synthetic */ Executor f187249n;

    /* renamed from: o */
    public final /* synthetic */ C65035c1.C65036a f187250o;

    /* renamed from: u3.f0$a */
    public class C65055a implements C65153r.C65156c {
        public C65055a() {
        }

        /* renamed from: b */
        public void mo89246b() {
            C65054f0 f0Var = C65054f0.this;
            f0Var.getClass();
            C61417a a = C61417a.m72117a();
            Runnable runnable = f0Var.f152174f;
            if (a.mo86363b()) {
                ((C54204d.C54207c) runnable).run();
            } else {
                a.mo86364c(runnable);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65054f0(Executor executor, Object obj, C65153r.C65155b bVar, C65035c1.C65038c cVar, Executor executor2, Executor executor3, C65035c1.C65036a aVar) {
        super(executor);
        this.f187245j = obj;
        this.f187246k = bVar;
        this.f187247l = cVar;
        this.f187248m = executor2;
        this.f187249n = executor3;
        this.f187250o = aVar;
    }

    /* renamed from: a */
    public Object mo74998a() {
        C65124q qVar;
        Object obj = this.f187245j;
        C65035c1<Object> c1Var = this.f187242g;
        if (c1Var != null) {
            obj = c1Var.mo89236i();
        }
        do {
            C65153r<Object, Object> rVar = this.f187243h;
            if (rVar != null) {
                C65153r.C65156c cVar = this.f187244i;
                C87412m.m108594g(cVar, "onInvalidatedCallback");
                rVar.f187567a.remove(cVar);
            }
            C65153r<Object, Object> a = this.f187246k.mo79078a();
            this.f187243h = a;
            C65153r.C65156c cVar2 = this.f187244i;
            a.getClass();
            C87412m.m108594g(cVar2, "onInvalidatedCallback");
            a.f187567a.add(cVar2);
            C65153r<Object, Object> rVar2 = this.f187243h;
            C65035c1.C65038c cVar3 = this.f187247l;
            C87412m.m108594g(rVar2, "dataSource");
            C87412m.m108594g(cVar3, "config");
            C0001s1 s1Var = C0001s1.f0d;
            Executor executor = this.f187248m;
            C87412m.m108594g(executor, "notifyExecutor");
            C53896h0 a2 = C53943r1.m60574a(executor);
            Executor executor2 = this.f187249n;
            C87412m.m108594g(executor2, "fetchExecutor");
            C53896h0 a3 = C53943r1.m60574a(executor2);
            C65035c1.C65036a aVar = this.f187250o;
            C65030c0 c0Var = new C65030c0(a3, rVar2);
            c0Var.mo89233e(cVar3.f187209a);
            int i = C65035c1.f187202j;
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = new C65145q1.C65146a.C65149c(obj, cVar3.f187212d, cVar3.f187211c);
            qVar = new C65124q(c0Var, s1Var, a2, a3, aVar, cVar3, (C65145q1.C65150b.C65152b) C53895h.m60468f((C66212f) null, new C65047d1(c0Var, f0Var, (C15601d) null), 1, (Object) null), obj);
            this.f187242g = qVar;
        } while (qVar.mo89238l());
        return this.f187242g;
    }
}
