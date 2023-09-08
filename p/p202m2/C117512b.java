package p202m2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p1167z8.C112608f;
import p202m2.C117502a;

/* renamed from: m2.b */
public final class C117512b {

    /* renamed from: m2.b$a */
    public static final class C117513a<T> {

        /* renamed from: a */
        public Object f351634a;

        /* renamed from: b */
        public C117516d<T> f351635b;

        /* renamed from: c */
        public C117518e<Void> f351636c = new C117518e<>();

        /* renamed from: d */
        public boolean f351637d;

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
            if (r6 != false) goto L_0x0024;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo182231a(T r6) {
            /*
                r5 = this;
                r0 = 1
                r5.f351637d = r0
                m2.b$d<T> r1 = r5.f351635b
                r2 = 0
                r3 = 0
                if (r1 == 0) goto L_0x0023
                m2.a<T> r1 = r1.f351639e
                r1.getClass()
                if (r6 != 0) goto L_0x0012
                java.lang.Object r6 = p202m2.C117502a.f351614j
            L_0x0012:
                m2.a$b r4 = p202m2.C117502a.f351613i
                boolean r6 = r4.mo182226b(r1, r2, r6)
                if (r6 == 0) goto L_0x001f
                p202m2.C117502a.m165738c(r1)
                r6 = 1
                goto L_0x0020
            L_0x001f:
                r6 = 0
            L_0x0020:
                if (r6 == 0) goto L_0x0023
                goto L_0x0024
            L_0x0023:
                r0 = 0
            L_0x0024:
                if (r0 == 0) goto L_0x002c
                r5.f351634a = r2
                r5.f351635b = r2
                r5.f351636c = r2
            L_0x002c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p202m2.C117512b.C117513a.mo182231a(java.lang.Object):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
            if (r6 != false) goto L_0x0028;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo182232b(java.lang.Throwable r6) {
            /*
                r5 = this;
                r0 = 1
                r5.f351637d = r0
                m2.b$d<T> r1 = r5.f351635b
                r2 = 0
                r3 = 0
                if (r1 == 0) goto L_0x0027
                m2.a<T> r1 = r1.f351639e
                r1.getClass()
                m2.a$d r4 = new m2.a$d
                r6.getClass()
                r4.<init>(r6)
                m2.a$b r6 = p202m2.C117502a.f351613i
                boolean r6 = r6.mo182226b(r1, r2, r4)
                if (r6 == 0) goto L_0x0023
                p202m2.C117502a.m165738c(r1)
                r6 = 1
                goto L_0x0024
            L_0x0023:
                r6 = 0
            L_0x0024:
                if (r6 == 0) goto L_0x0027
                goto L_0x0028
            L_0x0027:
                r0 = 0
            L_0x0028:
                if (r0 == 0) goto L_0x0030
                r5.f351634a = r2
                r5.f351635b = r2
                r5.f351636c = r2
            L_0x0030:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p202m2.C117512b.C117513a.mo182232b(java.lang.Throwable):boolean");
        }

        public void finalize() {
            C117518e<Void> eVar;
            C117516d<T> dVar = this.f351635b;
            if (dVar != null && !dVar.isDone()) {
                C117514b bVar = new C117514b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f351634a);
                C117502a<T> aVar = dVar.f351639e;
                aVar.getClass();
                if (C117502a.f351613i.mo182226b(aVar, (Object) null, new C117502a.C117506d(bVar))) {
                    C117502a.m165738c(aVar);
                }
            }
            if (!this.f351637d && (eVar = this.f351636c) != null) {
                eVar.mo182241i(null);
            }
        }
    }

    /* renamed from: m2.b$b */
    public static final class C117514b extends Throwable {
        public C117514b(String str) {
            super(str);
        }

        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: m2.b$c */
    public interface C117515c<T> {
        Object attachCompleter(C117513a<T> aVar);
    }

    /* renamed from: m2.b$d */
    public static final class C117516d<T> implements C112608f<T> {

        /* renamed from: d */
        public final WeakReference<C117513a<T>> f351638d;

        /* renamed from: e */
        public final C117502a<T> f351639e = new C117517a();

        /* renamed from: m2.b$d$a */
        public class C117517a extends C117502a<T> {
            public C117517a() {
            }

            /* renamed from: g */
            public String mo182218g() {
                C117513a aVar = C117516d.this.f351638d.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f351634a + "]";
            }
        }

        public C117516d(C117513a<T> aVar) {
            this.f351638d = new WeakReference<>(aVar);
        }

        public void addListener(Runnable runnable, Executor executor) {
            this.f351639e.addListener(runnable, executor);
        }

        public boolean cancel(boolean z) {
            C117513a aVar = this.f351638d.get();
            boolean cancel = this.f351639e.cancel(z);
            if (cancel && aVar != null) {
                aVar.f351634a = null;
                aVar.f351635b = null;
                aVar.f351636c.mo182241i(null);
            }
            return cancel;
        }

        public T get() {
            return this.f351639e.get();
        }

        public boolean isCancelled() {
            return this.f351639e.f351615d instanceof C117502a.C117505c;
        }

        public boolean isDone() {
            return this.f351639e.isDone();
        }

        public String toString() {
            return this.f351639e.toString();
        }

        public T get(long j, TimeUnit timeUnit) {
            return this.f351639e.get(j, timeUnit);
        }
    }

    /* renamed from: a */
    public static <T> C112608f<T> m165760a(C117515c<T> cVar) {
        C117513a aVar = new C117513a();
        C117516d<T> dVar = new C117516d<>(aVar);
        aVar.f351635b = dVar;
        aVar.f351634a = cVar.getClass();
        try {
            Object attachCompleter = cVar.attachCompleter(aVar);
            if (attachCompleter != null) {
                aVar.f351634a = attachCompleter;
            }
        } catch (Exception e) {
            C117502a<T> aVar2 = dVar.f351639e;
            aVar2.getClass();
            if (C117502a.f351613i.mo182226b(aVar2, (Object) null, new C117502a.C117506d(e))) {
                C117502a.m165738c(aVar2);
            }
        }
        return dVar;
    }
}
