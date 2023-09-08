package o34;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import l34.C117445a;
import l34.C117446b;
import l34.C117453e;
import l34.C117458j;
import n34.C117603a;
import q34.C118151b;

/* renamed from: o34.o */
public class C117670o<T> implements C117453e.C88377b<T, T> {

    /* renamed from: a */
    public final C117446b f351962a = C117445a.f351511a;

    /* renamed from: o34.o$a */
    public static final class C117671a<T> extends C117458j<T> implements C118151b.C118152a {

        /* renamed from: h */
        public final ConcurrentLinkedQueue<Object> f351963h = new ConcurrentLinkedQueue<>();

        /* renamed from: i */
        public final AtomicLong f351964i;

        /* renamed from: j */
        public final C117458j<? super T> f351965j;

        /* renamed from: n */
        public final AtomicBoolean f351966n = new AtomicBoolean(false);

        /* renamed from: o */
        public final C118151b f351967o;

        /* renamed from: p */
        public final C117655d<T> f351968p = C117655d.f351922a;

        /* renamed from: q */
        public final C117603a f351969q;

        /* renamed from: r */
        public final C117446b f351970r;

        public C117671a(C117458j<? super T> jVar, Long l, C117603a aVar, C117446b bVar) {
            this.f351965j = jVar;
            this.f351964i = l != null ? new AtomicLong(l.longValue()) : null;
            this.f351969q = aVar;
            this.f351967o = new C118151b(this);
            this.f351970r = bVar;
        }

        /* renamed from: a */
        public void mo122780a() {
            if (!this.f351966n.get()) {
                C118151b bVar = this.f351967o;
                bVar.f353175e = true;
                bVar.mo182948a();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0044 A[SYNTHETIC, Splitter:B:20:0x0044] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0062 A[EDGE_INSN: B:35:0x0062->B:28:0x0062 ?: BREAK  , SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo122781b(T r8) {
            /*
                r7 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r7.f351964i
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x0007
                goto L_0x0061
            L_0x0007:
                java.util.concurrent.atomic.AtomicLong r0 = r7.f351964i
                long r3 = r0.get()
                r5 = 0
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 > 0) goto L_0x0055
                l34.b r0 = r7.f351970r     // Catch:{ c -> 0x002e }
                boolean r0 = r0.mo182150a()     // Catch:{ c -> 0x002e }
                if (r0 == 0) goto L_0x003f
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> r0 = r7.f351963h     // Catch:{ c -> 0x002e }
                java.lang.Object r0 = r0.poll()     // Catch:{ c -> 0x002e }
                java.util.concurrent.atomic.AtomicLong r5 = r7.f351964i     // Catch:{ c -> 0x002e }
                if (r5 == 0) goto L_0x002a
                if (r0 == 0) goto L_0x002a
                r5.incrementAndGet()     // Catch:{ c -> 0x002e }
            L_0x002a:
                if (r0 == 0) goto L_0x003f
                r0 = 1
                goto L_0x0040
            L_0x002e:
                r0 = move-exception
                java.util.concurrent.atomic.AtomicBoolean r5 = r7.f351966n
                boolean r5 = r5.compareAndSet(r1, r2)
                if (r5 == 0) goto L_0x003f
                r7.mo182165d()
                l34.j<? super T> r5 = r7.f351965j
                r5.onError(r0)
            L_0x003f:
                r0 = 0
            L_0x0040:
                n34.a r5 = r7.f351969q
                if (r5 == 0) goto L_0x0052
                r5.call()     // Catch:{ all -> 0x0048 }
                goto L_0x0052
            L_0x0048:
                r0 = move-exception
                m34.C117527b.m165774b(r0)
                q34.b r2 = r7.f351967o
                r2.mo182949b(r0)
                goto L_0x0062
            L_0x0052:
                if (r0 != 0) goto L_0x0055
                goto L_0x0062
            L_0x0055:
                java.util.concurrent.atomic.AtomicLong r0 = r7.f351964i
                r5 = 1
                long r5 = r3 - r5
                boolean r0 = r0.compareAndSet(r3, r5)
                if (r0 == 0) goto L_0x0007
            L_0x0061:
                r1 = 1
            L_0x0062:
                if (r1 != 0) goto L_0x0065
                return
            L_0x0065:
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> r0 = r7.f351963h
                o34.d<T> r1 = r7.f351968p
                r1.getClass()
                if (r8 != 0) goto L_0x0070
                java.lang.Object r8 = o34.C117655d.f351924c
            L_0x0070:
                r0.offer(r8)
                q34.b r8 = r7.f351967o
                r8.mo182948a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o34.C117670o.C117671a.mo122781b(java.lang.Object):void");
        }

        /* renamed from: f */
        public void mo182167f() {
            mo182168g(MAlarmHandler.NEXT_FIRE_INTERVAL);
        }

        public void onError(Throwable th) {
            if (!this.f351966n.get()) {
                this.f351967o.mo182949b(th);
            }
        }
    }

    /* renamed from: o34.o$b */
    public static final class C117672b {

        /* renamed from: a */
        public static final C117670o<?> f351971a = new C117670o<>();
    }

    public Object call(Object obj) {
        C117458j jVar = (C117458j) obj;
        C117671a aVar = new C117671a(jVar, (Long) null, (C117603a) null, this.f351962a);
        jVar.mo182166e(aVar);
        jVar.mo182169h(aVar.f351967o);
        return aVar;
    }
}
