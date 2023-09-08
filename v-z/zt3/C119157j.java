package zt3;

import android.os.SystemClock;
import cu3.C116540a;
import gu3.C107916a;
import gu3.C107917d;
import iu3.C117277g;
import iu3.C117279h;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ju3.C117365a;
import ku3.C117420e;
import lu3.C117478d;
import lu3.C117479j;
import lu3.C34379c;
import mu3.C109639a;
import zt3.C119143b;

/* renamed from: zt3.j */
public class C119157j implements C119179t, C119145c {

    /* renamed from: d */
    public static C119179t f356862d;

    /* renamed from: e */
    public static C119145c f356863e;

    /* renamed from: a */
    public AtomicBoolean f356864a = new AtomicBoolean(false);

    /* renamed from: b */
    public C119140a f356865b;

    /* renamed from: c */
    public final C117420e f356866c;

    /* renamed from: zt3.j$a */
    public class C119158a implements C107916a<C117479j, C34379c<?>> {

        /* renamed from: a */
        public final /* synthetic */ boolean f356867a;

        public C119158a(boolean z) {
            this.f356867a = z;
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            C117479j jVar = (C117479j) obj;
            C119157j.this.f356866c.mo182116a(jVar, this.f356867a);
            return jVar;
        }
    }

    /* renamed from: zt3.j$b */
    public class C119159b implements C107916a<Runnable, C117479j> {

        /* renamed from: a */
        public final /* synthetic */ long f356869a;

        /* renamed from: b */
        public final /* synthetic */ String f356870b;

        public C119159b(C119157j jVar, long j, String str) {
            this.f356869a = j;
            this.f356870b = str;
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            Runnable runnable = (Runnable) obj;
            C117479j<?> a = C116540a.m164347a(runnable, this.f356869a, this.f356870b);
            if (runnable instanceof C117478d) {
                ((C117478d) runnable).mo121152g(a);
            }
            return a;
        }
    }

    /* renamed from: zt3.j$c */
    public class C119160c implements C107916a<C117479j, C34379c<?>> {
        public C119160c() {
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            C117479j jVar = (C117479j) obj;
            C119157j.this.f356866c.mo182116a(jVar, false);
            return jVar;
        }
    }

    /* renamed from: zt3.j$d */
    public class C119161d implements C107916a<Runnable, C117479j> {

        /* renamed from: a */
        public final /* synthetic */ long f356872a;

        /* renamed from: b */
        public final /* synthetic */ long f356873b;

        /* renamed from: c */
        public final /* synthetic */ boolean f356874c;

        public C119161d(C119157j jVar, long j, long j2, boolean z) {
            this.f356872a = j;
            this.f356873b = j2;
            this.f356874c = z;
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            Runnable runnable = (Runnable) obj;
            long j = this.f356872a;
            long j2 = this.f356873b;
            boolean z = this.f356874c;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long convert = timeUnit.convert(j2, timeUnit2);
            C117479j jVar = new C117479j(runnable, C116540a.m164350d(j, timeUnit2), z ? -convert : convert, C116540a.m164349c(runnable));
            if (runnable instanceof C117478d) {
                ((C117478d) runnable).mo121152g(jVar);
            }
            return jVar;
        }
    }

    /* renamed from: zt3.j$e */
    public class C119162e implements C107916a<C117479j<T>, C34379c<T>> {
        public C119162e() {
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            C117479j jVar = (C117479j) obj;
            C117420e eVar = C119157j.this.f356866c;
            eVar.mo182117b(jVar, false, eVar.f351463a);
            return jVar;
        }
    }

    /* renamed from: zt3.j$f */
    public class C119163f implements C107916a<Callable<T>, C117479j<T>> {

        /* renamed from: a */
        public final /* synthetic */ long f356876a;

        /* renamed from: b */
        public final /* synthetic */ String f356877b;

        public C119163f(C119157j jVar, long j, String str) {
            this.f356876a = j;
            this.f356877b = str;
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            Callable callable = (Callable) obj;
            C117479j b = C116540a.m164348b(callable, this.f356876a, this.f356877b);
            if (callable instanceof C117478d) {
                ((C117478d) callable).mo121152g(b);
            }
            return b;
        }
    }

    /* renamed from: zt3.j$g */
    public class C119164g implements C107916a<C117479j<T>, C34379c<T>> {
        public C119164g() {
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            C117479j jVar = (C117479j) obj;
            C117420e eVar = C119157j.this.f356866c;
            eVar.mo182117b(jVar, false, eVar.f351464b);
            return jVar;
        }
    }

    /* renamed from: zt3.j$h */
    public class C119165h implements C107916a<Callable<T>, C117479j<T>> {

        /* renamed from: a */
        public final /* synthetic */ long f356879a;

        /* renamed from: b */
        public final /* synthetic */ String f356880b;

        public C119165h(C119157j jVar, long j, String str) {
            this.f356879a = j;
            this.f356880b = str;
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            Callable callable = (Callable) obj;
            C117479j b = C116540a.m164348b(callable, this.f356879a, this.f356880b);
            if (callable instanceof C117478d) {
                ((C117478d) callable).mo121152g(b);
            }
            return b;
        }
    }

    /* renamed from: zt3.j$i */
    public class C119166i implements C107916a<C117479j, C34379c<?>> {

        /* renamed from: a */
        public final /* synthetic */ boolean f356881a;

        public C119166i(boolean z) {
            this.f356881a = z;
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            C117479j jVar = (C117479j) obj;
            C117420e eVar = C119157j.this.f356866c;
            boolean z = this.f356881a;
            jVar.f351581r = eVar.f351465c;
            SystemClock.uptimeMillis();
            if (!z) {
                return eVar.f351465c.mo182101c(jVar);
            }
            eVar.f351465c.f351466e.f351467d.postAtFrontOfQueue(jVar);
            return jVar;
        }
    }

    /* renamed from: zt3.j$j */
    public class C119167j implements C107916a<Runnable, C117479j> {

        /* renamed from: a */
        public final /* synthetic */ long f356883a;

        public C119167j(C119157j jVar, long j) {
            this.f356883a = j;
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            Runnable runnable = (Runnable) obj;
            C117479j<?> a = C116540a.m164347a(runnable, this.f356883a, (String) null);
            if (runnable instanceof C117478d) {
                ((C117478d) runnable).mo121152g(a);
            }
            return a;
        }
    }

    /* renamed from: zt3.j$k */
    public class C119168k implements C107916a<C117479j, C34379c<?>> {
        public C119168k() {
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            C117479j jVar = (C117479j) obj;
            C117420e eVar = C119157j.this.f356866c;
            eVar.mo182117b(jVar, false, eVar.f351463a);
            return jVar;
        }
    }

    /* renamed from: zt3.j$l */
    public class C119169l implements C107916a<Runnable, C117479j> {

        /* renamed from: a */
        public final /* synthetic */ long f356885a;

        /* renamed from: b */
        public final /* synthetic */ String f356886b;

        public C119169l(C119157j jVar, long j, String str) {
            this.f356885a = j;
            this.f356886b = str;
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            Runnable runnable = (Runnable) obj;
            C117479j<?> a = C116540a.m164347a(runnable, this.f356885a, this.f356886b);
            if (runnable instanceof C117478d) {
                ((C117478d) runnable).mo121152g(a);
            }
            return a;
        }
    }

    /* renamed from: zt3.j$m */
    public class C119170m implements C107916a<C117479j, C34379c<?>> {
        public C119170m() {
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            C117479j jVar = (C117479j) obj;
            C117420e eVar = C119157j.this.f356866c;
            eVar.mo182117b(jVar, false, eVar.f351464b);
            return jVar;
        }
    }

    /* renamed from: zt3.j$n */
    public class C119171n implements C107916a<Runnable, C117479j> {

        /* renamed from: a */
        public final /* synthetic */ long f356888a;

        /* renamed from: b */
        public final /* synthetic */ String f356889b;

        public C119171n(C119157j jVar, long j, String str) {
            this.f356888a = j;
            this.f356889b = str;
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            Runnable runnable = (Runnable) obj;
            C117479j<?> a = C116540a.m164347a(runnable, this.f356888a, this.f356889b);
            if (runnable instanceof C117478d) {
                ((C117478d) runnable).mo121152g(a);
            }
            return a;
        }
    }

    public C119157j(C119140a aVar) {
        this.f356865b = aVar;
        this.f356866c = new C117420e(aVar);
    }

    /* renamed from: A */
    public <T> C34379c<T> mo183867A(Callable<T> callable) {
        Objects.requireNonNull(callable);
        return (C34379c) new C107917d(callable).mo158345f(new C119173l(this, 0)).mo158345f(new C119172k(this, false)).mo158346g();
    }

    /* renamed from: B */
    public C34379c<?> mo183868B(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return mo183892w(runnable, 0, true);
    }

    /* renamed from: C */
    public C34379c<?> mo183869C(Runnable runnable, long j) {
        Objects.requireNonNull(runnable);
        return mo183892w(runnable, j, false);
    }

    /* renamed from: a */
    public C34379c<?> mo183870a(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return mo183889t(runnable, 0, (String) null);
    }

    /* renamed from: b */
    public C34379c<?> mo183871b(Runnable runnable, String str) {
        Objects.requireNonNull(runnable);
        return mo183889t(runnable, 0, str);
    }

    /* renamed from: c */
    public C34379c<?> mo183872c(Runnable runnable, long j, long j2) {
        Objects.requireNonNull(runnable);
        return mo183888s(runnable, j, j2, false);
    }

    /* renamed from: d */
    public C34379c<?> mo183873d(Runnable runnable, long j, long j2) {
        Objects.requireNonNull(runnable);
        return mo183888s(runnable, j, j2, true);
    }

    /* renamed from: e */
    public Map<String, Integer> mo183874e() {
        ((C117365a) C117279h.f351135a).getClass();
        HashMap hashMap = new HashMap();
        HashMap<String, C117277g.C117278a> hashMap2 = C117365a.f351357a;
        synchronized (hashMap2) {
            for (C117277g.C117278a next : hashMap2.values()) {
                int i = next.f351134c.get();
                if (i > 0) {
                    hashMap.put(next.f351133b, Integer.valueOf(i));
                }
            }
        }
        return hashMap;
    }

    /* renamed from: f */
    public C34379c<?> mo183875f(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return mo183878i(runnable, 0);
    }

    /* renamed from: g */
    public C34379c<?> mo183876g(Runnable runnable, String str) {
        Objects.requireNonNull(runnable);
        return mo183879j(runnable, 0, str);
    }

    /* renamed from: h */
    public C34379c<?> mo183877h(Runnable runnable, String str) {
        Objects.requireNonNull(runnable);
        return mo183891v(runnable, 0, str, true);
    }

    /* renamed from: i */
    public C34379c<?> mo183878i(Runnable runnable, long j) {
        Objects.requireNonNull(runnable);
        return (C34379c) new C107917d(runnable).mo158345f(new C119156i(this, j)).mo158345f(new C119178s(this)).mo158346g();
    }

    /* renamed from: j */
    public C34379c<?> mo183879j(Runnable runnable, long j, String str) {
        Objects.requireNonNull(runnable);
        return mo183891v(runnable, j, str, false);
    }

    /* renamed from: k */
    public <T> C34379c<T> mo183880k(Callable<T> callable, long j) {
        Objects.requireNonNull(callable);
        return (C34379c) new C107917d(callable).mo158345f(new C119175o(this, j)).mo158345f(new C119174m(this)).mo158346g();
    }

    /* renamed from: l */
    public <T> C34379c<T> mo183881l(Callable<T> callable, long j, String str) {
        Objects.requireNonNull(callable);
        return (C34379c) new C107917d(callable).mo158345f(new C119177q(this, j, str)).mo158345f(new C119176p(this, false)).mo158346g();
    }

    /* renamed from: m */
    public C119143b mo183882m(String str, int i, int i2, BlockingQueue<Runnable> blockingQueue) {
        return new C119143b(str, i, i2, blockingQueue, new C119143b.C91935a());
    }

    /* renamed from: n */
    public C119143b mo183883n(String str) {
        return new C119143b(str, 1, 1, new LinkedBlockingQueue(), new C119143b.C91935a());
    }

    /* renamed from: o */
    public C34379c<?> mo183884o(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return mo183886q(runnable, 0, (String) null);
    }

    /* renamed from: p */
    public C34379c<?> mo183885p(Runnable runnable, String str) {
        Objects.requireNonNull(runnable);
        return mo183886q(runnable, 0, str);
    }

    /* renamed from: q */
    public final C34379c<?> mo183886q(Runnable runnable, long j, String str) {
        return (C34379c) new C107917d(runnable).mo158345f(new C119169l(this, j, str)).mo158345f(new C119168k()).mo158346g();
    }

    /* renamed from: r */
    public final <T> C34379c<T> mo183887r(Callable<T> callable, long j, String str) {
        return (C34379c) new C107917d(callable).mo158345f(new C119163f(this, j, str)).mo158345f(new C119162e()).mo158346g();
    }

    /* renamed from: s */
    public final C34379c<?> mo183888s(Runnable runnable, long j, long j2, boolean z) {
        return (C34379c) new C107917d(runnable).mo158345f(new C119161d(this, j, j2, z)).mo158345f(new C119160c()).mo158346g();
    }

    /* renamed from: t */
    public final C34379c<?> mo183889t(Runnable runnable, long j, String str) {
        return (C34379c) new C107917d(runnable).mo158345f(new C119171n(this, j, str)).mo158345f(new C119170m()).mo158346g();
    }

    /* renamed from: u */
    public final <T> C34379c<T> mo183890u(Callable<T> callable, long j, String str) {
        return (C34379c) new C107917d(callable).mo158345f(new C119165h(this, j, str)).mo158345f(new C119164g()).mo158346g();
    }

    /* renamed from: v */
    public final C34379c<?> mo183891v(Runnable runnable, long j, String str, boolean z) {
        return (C34379c) new C107917d(runnable).mo158345f(new C119159b(this, j, str)).mo158345f(new C119158a(z)).mo158346g();
    }

    /* renamed from: w */
    public final C34379c<?> mo183892w(Runnable runnable, long j, boolean z) {
        return (C34379c) new C107917d(runnable).mo158345f(new C119167j(this, j)).mo158345f(new C119166i(z)).mo158346g();
    }

    /* renamed from: x */
    public C34379c<?> mo183893x(Runnable runnable) {
        return mo183884o(runnable);
    }

    /* renamed from: y */
    public boolean mo183894y(String str) {
        Objects.requireNonNull(str);
        C109639a aVar = C109639a.f328235e.get(str);
        if (aVar == null) {
            return false;
        }
        aVar.f328238b.mo182308a();
        return true;
    }

    /* renamed from: z */
    public C34379c<?> mo183895z(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return mo183892w(runnable, 0, false);
    }
}
