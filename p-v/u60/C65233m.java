package u60;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import o40.C61926c;
import v60.C102152a;
import v60.C102156f;
import v60.C102157g;

/* renamed from: u60.m */
public final class C65233m implements C14120b {

    /* renamed from: a */
    public final String f187768a;

    /* renamed from: b */
    public C65222f<C14121l> f187769b = new C65222f<>(new C102156f(new C102152a(1, Integer.MAX_VALUE), new C102157g(1, 5), 1, "SingleTaskExecutor"));

    /* renamed from: c */
    public ConcurrentLinkedDeque<C14121l> f187770c = new ConcurrentLinkedDeque<>();

    /* renamed from: d */
    public boolean f187771d;

    /* renamed from: e */
    public final AtomicInteger f187772e;

    /* renamed from: f */
    public int f187773f;

    /* renamed from: g */
    public final C37342a f187774g;

    /* renamed from: u60.m$a */
    public static final class C37342a implements C65231j<C14121l> {

        /* renamed from: a */
        public final /* synthetic */ C65233m f98739a;

        public C37342a(C65233m mVar) {
            this.f98739a = mVar;
        }

        /* renamed from: a */
        public void mo539a(C65220d dVar, C65234n nVar) {
            C87412m.m108594g((C14121l) dVar, "task");
            C87412m.m108594g(nVar, "status");
            Log.m105924i("Loader.SingleTaskExecutor", "[onLoaderFin] name=" + this.f98739a.f187768a + " status=" + nVar);
            C65233m mVar = this.f98739a;
            mVar.f187771d = false;
            mVar.mo89359b();
        }
    }

    public C65233m(String str) {
        C87412m.m108594g(str, "name");
        this.f187768a = str;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.f187772e = atomicInteger;
        this.f187773f = atomicInteger.get();
        this.f187774g = new C37342a(this);
    }

    /* renamed from: a */
    public void mo11856a(C14121l lVar) {
        C87412m.m108594g(lVar, "task");
        Log.m105924i("Loader.SingleTaskExecutor", "[postTask] name=" + this.f187768a + " isRunningTask=" + this.f187771d + " task=" + lVar);
        lVar.f39521h = this.f187773f;
        this.f187770c.add(lVar);
        mo89359b();
    }

    /* renamed from: b */
    public final synchronized void mo89359b() {
        C14121l poll;
        Log.m105924i("Loader.SingleTaskExecutor", "[checkNextTask] name=" + this.f187768a + " isRunningTask=" + this.f187771d + " waitSize=" + this.f187770c.size());
        if (!this.f187771d && (poll = this.f187770c.poll()) != null) {
            this.f187769b.mo89348b(poll);
            this.f187771d = true;
        }
    }

    /* renamed from: c */
    public final void mo89360c() {
        Log.m105924i("Loader.SingleTaskExecutor", "[clean] name=" + this.f187768a);
        for (C14121l e : this.f187770c) {
            e.mo10270e();
        }
        this.f187770c.clear();
    }

    /* renamed from: d */
    public final void mo89361d() {
        Log.m105924i("Loader.SingleTaskExecutor", "[start] name=" + this.f187768a);
        this.f187769b.mo89353f(this.f187774g);
    }

    /* renamed from: e */
    public final void mo89362e() {
        Log.m105924i("Loader.SingleTaskExecutor", "[stop] name=" + this.f187768a);
        this.f187769b.mo89354g(this.f187774g);
        C65222f<C14121l> fVar = this.f187769b;
        fVar.getClass();
        C61926c.m72668M(new C65228g(fVar));
        Iterator<C14121l> it = this.f187770c.iterator();
        while (it.hasNext()) {
            it.next().mo10270e();
        }
        this.f187770c.clear();
        this.f187771d = false;
    }

    public int getToken() {
        return this.f187773f;
    }

    public void reset() {
        this.f187773f = this.f187772e.incrementAndGet();
        Log.m105924i("Loader.SingleTaskExecutor", "[reset] name=" + this.f187768a);
        C65222f<C14121l> fVar = this.f187769b;
        fVar.getClass();
        C61926c.m72668M(new C65228g(fVar));
        Iterator<C14121l> it = this.f187770c.iterator();
        while (it.hasNext()) {
            it.next().mo10270e();
        }
        this.f187770c.clear();
        this.f187771d = false;
    }
}
