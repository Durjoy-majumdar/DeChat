package u34;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import l34.C117453e;
import l34.C117458j;
import l34.C88379f;
import n34.C117604b;
import n34.C88900c;
import o34.C117655d;
import v34.C118644a;

/* renamed from: u34.e */
public final class C118574e<T> extends AtomicReference<C118575a<T>> implements C117453e.C88376a<T> {

    /* renamed from: d */
    public volatile Object f354856d;

    /* renamed from: e */
    public boolean f354857e = true;

    /* renamed from: f */
    public C117604b<C118576b<T>> f354858f;

    /* renamed from: g */
    public C117604b<C118576b<T>> f354859g;

    /* renamed from: h */
    public C117604b<C118576b<T>> f354860h;

    /* renamed from: i */
    public final C117655d<T> f354861i;

    /* renamed from: u34.e$a */
    public static final class C118575a<T> {

        /* renamed from: c */
        public static final C118576b[] f354862c;

        /* renamed from: d */
        public static final C118575a f354863d;

        /* renamed from: e */
        public static final C118575a f354864e;

        /* renamed from: a */
        public final boolean f354865a;

        /* renamed from: b */
        public final C118576b[] f354866b;

        static {
            C118576b[] bVarArr = new C118576b[0];
            f354862c = bVarArr;
            f354863d = new C118575a(true, bVarArr);
            f354864e = new C118575a(false, bVarArr);
        }

        public C118575a(boolean z, C118576b[] bVarArr) {
            this.f354865a = z;
            this.f354866b = bVarArr;
        }
    }

    /* renamed from: u34.e$b */
    public static final class C118576b<T> implements C88379f<T> {

        /* renamed from: d */
        public final C117458j<? super T> f354867d;

        /* renamed from: e */
        public boolean f354868e = true;

        /* renamed from: f */
        public boolean f354869f;

        /* renamed from: g */
        public List<Object> f354870g;

        /* renamed from: h */
        public boolean f354871h;

        public C118576b(C117458j<? super T> jVar) {
            this.f354867d = jVar;
        }

        /* renamed from: a */
        public void mo122780a() {
            this.f354867d.mo122780a();
        }

        /* renamed from: b */
        public void mo122781b(T t) {
            this.f354867d.mo122781b(t);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
            r1.f354871h = true;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo183331c(java.lang.Object r2, o34.C117655d<T> r3) {
            /*
                r1 = this;
                boolean r0 = r1.f354871h
                if (r0 != 0) goto L_0x0026
                monitor-enter(r1)
                r0 = 0
                r1.f354868e = r0     // Catch:{ all -> 0x0023 }
                boolean r0 = r1.f354869f     // Catch:{ all -> 0x0023 }
                if (r0 == 0) goto L_0x001e
                java.util.List<java.lang.Object> r3 = r1.f354870g     // Catch:{ all -> 0x0023 }
                if (r3 != 0) goto L_0x0017
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0023 }
                r3.<init>()     // Catch:{ all -> 0x0023 }
                r1.f354870g = r3     // Catch:{ all -> 0x0023 }
            L_0x0017:
                java.util.List<java.lang.Object> r3 = r1.f354870g     // Catch:{ all -> 0x0023 }
                r3.add(r2)     // Catch:{ all -> 0x0023 }
                monitor-exit(r1)     // Catch:{ all -> 0x0023 }
                return
            L_0x001e:
                monitor-exit(r1)     // Catch:{ all -> 0x0023 }
                r0 = 1
                r1.f354871h = r0
                goto L_0x0026
            L_0x0023:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0023 }
                throw r2
            L_0x0026:
                l34.j<? super T> r0 = r1.f354867d
                r3.mo182372a(r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u34.C118574e.C118576b.mo183331c(java.lang.Object, o34.d):void");
        }

        public void onError(Throwable th) {
            this.f354867d.onError(th);
        }
    }

    public C118574e() {
        super(C118575a.f354864e);
        C88900c.C88901a aVar = C88900c.f256399a;
        this.f354858f = aVar;
        this.f354859g = aVar;
        this.f354860h = aVar;
        this.f354861i = C117655d.f351922a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo183329a(u34.C118574e.C118576b<T> r11) {
        /*
            r10 = this;
        L_0x0000:
            java.lang.Object r0 = r10.get()
            u34.e$a r0 = (u34.C118574e.C118575a) r0
            boolean r1 = r0.f354865a
            if (r1 == 0) goto L_0x000b
            return
        L_0x000b:
            u34.e$b[] r1 = r0.f354866b
            int r2 = r1.length
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L_0x0019
            r4 = r1[r3]
            if (r4 != r11) goto L_0x0019
            u34.e$a r1 = u34.C118574e.C118575a.f354864e
            goto L_0x0048
        L_0x0019:
            if (r2 != 0) goto L_0x001d
        L_0x001b:
            r1 = r0
            goto L_0x0048
        L_0x001d:
            int r4 = r2 + -1
            u34.e$b[] r5 = new u34.C118574e.C118576b[r4]
            r6 = 0
            r7 = 0
        L_0x0023:
            if (r6 >= r2) goto L_0x0034
            r8 = r1[r6]
            if (r8 == r11) goto L_0x0031
            if (r7 != r4) goto L_0x002c
            goto L_0x001b
        L_0x002c:
            int r9 = r7 + 1
            r5[r7] = r8
            r7 = r9
        L_0x0031:
            int r6 = r6 + 1
            goto L_0x0023
        L_0x0034:
            if (r7 != 0) goto L_0x0039
            u34.e$a r1 = u34.C118574e.C118575a.f354864e
            goto L_0x0048
        L_0x0039:
            if (r7 >= r4) goto L_0x0041
            u34.e$b[] r1 = new u34.C118574e.C118576b[r7]
            java.lang.System.arraycopy(r5, r3, r1, r3, r7)
            r5 = r1
        L_0x0041:
            u34.e$a r1 = new u34.e$a
            boolean r2 = r0.f354865a
            r1.<init>(r2, r5)
        L_0x0048:
            if (r1 == r0) goto L_0x0050
            boolean r0 = r10.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0000
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u34.C118574e.mo183329a(u34.e$b):void");
    }

    /* renamed from: b */
    public C118576b<T>[] mo183330b(Object obj) {
        this.f354856d = obj;
        this.f354857e = false;
        return ((C118575a) get()).f354865a ? C118575a.f354862c : ((C118575a) getAndSet(C118575a.f354863d)).f354866b;
    }

    public void call(Object obj) {
        boolean z;
        C117458j jVar = (C117458j) obj;
        C118576b bVar = new C118576b(jVar);
        jVar.mo182166e(new C118644a(new C118573d(this, bVar)));
        this.f354858f.getClass();
        if (!jVar.f351524d.f353197e) {
            while (true) {
                C118575a aVar = (C118575a) get();
                z = false;
                if (!aVar.f354865a) {
                    C118576b[] bVarArr = aVar.f354866b;
                    int length = bVarArr.length;
                    C118576b[] bVarArr2 = new C118576b[(length + 1)];
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                    bVarArr2[length] = bVar;
                    if (compareAndSet(aVar, new C118575a(aVar.f354865a, bVarArr2))) {
                        this.f354859g.getClass();
                        z = true;
                        break;
                    }
                } else {
                    this.f354860h.call(bVar);
                    break;
                }
            }
            if (z && jVar.f351524d.f353197e) {
                mo183329a(bVar);
            }
        }
    }
}
