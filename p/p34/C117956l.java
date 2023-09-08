package p34;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l34.C117447c;
import l34.C117452d;
import l34.C117453e;
import l34.C117456i;
import l34.C117459k;
import l34.C88379f;
import m34.C117527b;
import n34.C117603a;
import n34.C117605d;
import o34.C117650a;
import o34.C117660f;
import o34.C117670o;
import s34.C118266b;
import t34.C118365c;
import t34.C118375m;
import t34.C118378p;
import u34.C118570a;
import u34.C118571b;
import u34.C118574e;
import v34.C118647c;
import v34.C118649d;

/* renamed from: p34.l */
public class C117956l extends C117456i implements C117459k {

    /* renamed from: h */
    public static final C117459k f352543h = new C117959c();

    /* renamed from: e */
    public final C117456i f352544e;

    /* renamed from: f */
    public final C88379f<C117453e<C117447c>> f352545f;

    /* renamed from: g */
    public final C117459k f352546g;

    /* renamed from: p34.l$a */
    public class C117957a implements C117605d<C117962f, C117447c> {

        /* renamed from: a */
        public final /* synthetic */ C117456i.C117457a f352547a;

        public C117957a(C117956l lVar, C117456i.C117457a aVar) {
            this.f352547a = aVar;
        }

        public Object call(Object obj) {
            try {
                return new C117447c(new C117955k(this, (C117962f) obj));
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                C118375m.m166985a(th);
                int i = C117447c.f351512b;
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        }
    }

    /* renamed from: p34.l$b */
    public class C117958b extends C117456i.C117457a {

        /* renamed from: d */
        public final AtomicBoolean f352548d = new AtomicBoolean();

        /* renamed from: e */
        public final /* synthetic */ C117456i.C117457a f352549e;

        /* renamed from: f */
        public final /* synthetic */ C88379f f352550f;

        public C117958b(C117956l lVar, C117456i.C117457a aVar, C88379f fVar) {
            this.f352549e = aVar;
            this.f352550f = fVar;
        }

        /* renamed from: b */
        public C117459k mo182162b(C117603a aVar) {
            C117961e eVar = new C117961e(aVar);
            this.f352550f.mo122781b(eVar);
            return eVar;
        }

        /* renamed from: c */
        public boolean mo182164c() {
            return this.f352548d.get();
        }

        /* renamed from: d */
        public void mo182165d() {
            if (this.f352548d.compareAndSet(false, true)) {
                this.f352549e.mo182165d();
                this.f352550f.mo122780a();
            }
        }

        /* renamed from: e */
        public C117459k mo182163e(C117603a aVar, long j, TimeUnit timeUnit) {
            C117960d dVar = new C117960d(aVar, j, timeUnit);
            this.f352550f.mo122781b(dVar);
            return dVar;
        }
    }

    /* renamed from: p34.l$c */
    public static class C117959c implements C117459k {
        /* renamed from: c */
        public boolean mo182164c() {
            return false;
        }

        /* renamed from: d */
        public void mo182165d() {
        }
    }

    /* renamed from: p34.l$d */
    public static class C117960d extends C117962f {

        /* renamed from: e */
        public final C117603a f352551e;

        /* renamed from: f */
        public final long f352552f;

        /* renamed from: g */
        public final TimeUnit f352553g;

        public C117960d(C117603a aVar, long j, TimeUnit timeUnit) {
            this.f352551e = aVar;
            this.f352552f = j;
            this.f352553g = timeUnit;
        }

        /* renamed from: a */
        public C117459k mo182718a(C117456i.C117457a aVar) {
            return aVar.mo182163e(this.f352551e, this.f352552f, this.f352553g);
        }
    }

    /* renamed from: p34.l$e */
    public static class C117961e extends C117962f {

        /* renamed from: e */
        public final C117603a f352554e;

        public C117961e(C117603a aVar) {
            this.f352554e = aVar;
        }

        /* renamed from: a */
        public C117459k mo182718a(C117456i.C117457a aVar) {
            return aVar.mo182162b(this.f352554e);
        }
    }

    /* renamed from: p34.l$f */
    public static abstract class C117962f extends AtomicReference<C117459k> implements C117459k {

        /* renamed from: d */
        public static final /* synthetic */ int f352555d = 0;

        public C117962f() {
            super(C117956l.f352543h);
        }

        /* renamed from: a */
        public abstract C117459k mo182718a(C117456i.C117457a aVar);

        /* renamed from: c */
        public boolean mo182164c() {
            return ((C117459k) get()).mo182164c();
        }

        /* renamed from: d */
        public void mo182165d() {
            C117459k kVar;
            C117459k kVar2 = C117956l.f352543h;
            C118649d.C118650a aVar = C118649d.f355040a;
            do {
                kVar = (C117459k) get();
                C117459k kVar3 = C117956l.f352543h;
                if (kVar == C118649d.f355040a) {
                    return;
                }
            } while (!compareAndSet(kVar, aVar));
            if (kVar != C117956l.f352543h) {
                kVar.mo182165d();
            }
        }
    }

    public C117956l(C117605d<C117453e<C117453e<C117447c>>, C117447c> dVar, C117456i iVar) {
        this.f352544e = iVar;
        C118574e eVar = new C118574e();
        eVar.f354860h = new C118570a(eVar);
        C118571b bVar = new C118571b(eVar, eVar);
        this.f352545f = new C118266b(bVar);
        C117447c call = dVar.call(bVar.mo182153d(C117670o.C117672b.f351971a));
        call.getClass();
        C118647c cVar = new C118647c();
        C117452d dVar2 = new C117452d(call, cVar);
        try {
            C117447c.C117450c cVar2 = call.f351513a;
            if (C118375m.f353773e != null) {
                C118378p.f353781e.mo183166a().getClass();
            }
            cVar2.call(dVar2);
            this.f352546g = cVar;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            th = th;
            C117527b.m165774b(th);
            C117605d<Throwable, Throwable> dVar3 = C118375m.f353778j;
            th = dVar3 != null ? (Throwable) ((C118365c) dVar3).call(th) : th;
            C118375m.m166985a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: c */
    public boolean mo182164c() {
        return this.f352546g.mo182164c();
    }

    public C117456i.C117457a createWorker() {
        C117456i.C117457a createWorker = this.f352544e.createWorker();
        C117650a aVar = new C117650a(new C117650a.C117653c());
        C118266b bVar = new C118266b(aVar);
        C117453e c = C117453e.m165660c(new C117660f(aVar, new C117957a(this, createWorker)));
        C117958b bVar2 = new C117958b(this, createWorker, bVar);
        this.f352545f.mo122781b(c);
        return bVar2;
    }

    /* renamed from: d */
    public void mo182165d() {
        this.f352546g.mo182165d();
    }
}
