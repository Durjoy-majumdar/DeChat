package s34;

import l34.C88379f;
import m34.C117527b;
import o34.C117655d;

/* renamed from: s34.b */
public class C118266b<T> implements C88379f<T> {

    /* renamed from: d */
    public final C88379f<? super T> f353475d;

    /* renamed from: e */
    public boolean f353476e;

    /* renamed from: f */
    public volatile boolean f353477f;

    /* renamed from: g */
    public C118267a f353478g;

    /* renamed from: s34.b$a */
    public static final class C118267a {

        /* renamed from: a */
        public Object[] f353479a;

        /* renamed from: b */
        public int f353480b;

        /* renamed from: a */
        public void mo183051a(Object obj) {
            int i = this.f353480b;
            Object[] objArr = this.f353479a;
            if (objArr == null) {
                objArr = new Object[16];
                this.f353479a = objArr;
            } else if (i == objArr.length) {
                Object[] objArr2 = new Object[((i >> 2) + i)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                this.f353479a = objArr2;
                objArr = objArr2;
            }
            objArr[i] = obj;
            this.f353480b = i + 1;
        }
    }

    public C118266b(C88379f<? super T> fVar) {
        this.f353475d = fVar;
    }

    /* renamed from: a */
    public void mo122780a() {
        if (!this.f353477f) {
            synchronized (this) {
                if (!this.f353477f) {
                    this.f353477f = true;
                    if (this.f353476e) {
                        C118267a aVar = this.f353478g;
                        if (aVar == null) {
                            aVar = new C118267a();
                            this.f353478g = aVar;
                        }
                        aVar.mo183051a(C117655d.f351923b);
                        return;
                    }
                    this.f353476e = true;
                    this.f353475d.mo122780a();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r10.f353475d.mo122781b(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002d, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1 = r10.f353478g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0031, code lost:
        if (r1 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0033, code lost:
        r10.f353476e = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0035, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0037, code lost:
        r10.f353478g = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x003a, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x003b, code lost:
        r1 = r1.f353479a;
        r4 = r1.length;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x003f, code lost:
        if (r5 >= r4) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0041, code lost:
        r6 = r1[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0043, code lost:
        if (r6 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r7 = r10.f353475d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x004a, code lost:
        if (r6 != o34.C117655d.f351923b) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x004c, code lost:
        r7.mo122780a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x004f, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0053, code lost:
        if (r6 != o34.C117655d.f351924c) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0055, code lost:
        r7.mo122781b(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0058, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0060, code lost:
        if (r6.getClass() != o34.C117655d.C117658c.class) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0062, code lost:
        r7.onError(((o34.C117655d.C117658c) r6).f351925d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006a, code lost:
        r7.mo122781b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x006e, code lost:
        if (r6 == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0070, code lost:
        r10.f353477f = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0073, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0076, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0077, code lost:
        r10.f353477f = true;
        m34.C117527b.m165774b(r1);
        r10.f353475d.onError(m34.C117531g.m165777a(r1, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0085, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0089, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x008a, code lost:
        r10.f353477f = true;
        m34.C117527b.m165776d(r1, r10.f353475d, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0091, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo122781b(T r11) {
        /*
            r10 = this;
            boolean r0 = r10.f353477f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r10)
            boolean r0 = r10.f353477f     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r10)     // Catch:{ all -> 0x0092 }
            return
        L_0x000c:
            boolean r0 = r10.f353476e     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0024
            s34.b$a r0 = r10.f353478g     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x001b
            s34.b$a r0 = new s34.b$a     // Catch:{ all -> 0x0092 }
            r0.<init>()     // Catch:{ all -> 0x0092 }
            r10.f353478g = r0     // Catch:{ all -> 0x0092 }
        L_0x001b:
            if (r11 != 0) goto L_0x001f
            java.lang.Object r11 = o34.C117655d.f351924c     // Catch:{ all -> 0x0092 }
        L_0x001f:
            r0.mo183051a(r11)     // Catch:{ all -> 0x0092 }
            monitor-exit(r10)     // Catch:{ all -> 0x0092 }
            return
        L_0x0024:
            r0 = 1
            r10.f353476e = r0     // Catch:{ all -> 0x0092 }
            monitor-exit(r10)     // Catch:{ all -> 0x0092 }
            l34.f<? super T> r1 = r10.f353475d     // Catch:{ all -> 0x0089 }
            r1.mo122781b(r11)     // Catch:{ all -> 0x0089 }
        L_0x002d:
            monitor-enter(r10)
            s34.b$a r1 = r10.f353478g     // Catch:{ all -> 0x0086 }
            r2 = 0
            if (r1 != 0) goto L_0x0037
            r10.f353476e = r2     // Catch:{ all -> 0x0086 }
            monitor-exit(r10)     // Catch:{ all -> 0x0086 }
            return
        L_0x0037:
            r3 = 0
            r10.f353478g = r3     // Catch:{ all -> 0x0086 }
            monitor-exit(r10)     // Catch:{ all -> 0x0086 }
            java.lang.Object[] r1 = r1.f353479a
            int r4 = r1.length
            r5 = 0
        L_0x003f:
            if (r5 >= r4) goto L_0x002d
            r6 = r1[r5]
            if (r6 != 0) goto L_0x0046
            goto L_0x002d
        L_0x0046:
            l34.f<? super T> r7 = r10.f353475d     // Catch:{ all -> 0x0076 }
            java.lang.Object r8 = o34.C117655d.f351923b     // Catch:{ all -> 0x0076 }
            if (r6 != r8) goto L_0x0051
            r7.mo122780a()     // Catch:{ all -> 0x0076 }
        L_0x004f:
            r6 = 1
            goto L_0x006e
        L_0x0051:
            java.lang.Object r8 = o34.C117655d.f351924c     // Catch:{ all -> 0x0076 }
            if (r6 != r8) goto L_0x005a
            r7.mo122781b(r3)     // Catch:{ all -> 0x0076 }
        L_0x0058:
            r6 = 0
            goto L_0x006e
        L_0x005a:
            java.lang.Class r8 = r6.getClass()     // Catch:{ all -> 0x0076 }
            java.lang.Class<o34.d$c> r9 = o34.C117655d.C117658c.class
            if (r8 != r9) goto L_0x006a
            o34.d$c r6 = (o34.C117655d.C117658c) r6     // Catch:{ all -> 0x0076 }
            java.lang.Throwable r6 = r6.f351925d     // Catch:{ all -> 0x0076 }
            r7.onError(r6)     // Catch:{ all -> 0x0076 }
            goto L_0x004f
        L_0x006a:
            r7.mo122781b(r6)     // Catch:{ all -> 0x0076 }
            goto L_0x0058
        L_0x006e:
            if (r6 == 0) goto L_0x0073
            r10.f353477f = r0     // Catch:{ all -> 0x0076 }
            return
        L_0x0073:
            int r5 = r5 + 1
            goto L_0x003f
        L_0x0076:
            r1 = move-exception
            r10.f353477f = r0
            m34.C117527b.m165774b(r1)
            l34.f<? super T> r0 = r10.f353475d
            java.lang.Throwable r11 = m34.C117531g.m165777a(r1, r11)
            r0.onError(r11)
            return
        L_0x0086:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0086 }
            throw r11
        L_0x0089:
            r1 = move-exception
            r10.f353477f = r0
            l34.f<? super T> r0 = r10.f353475d
            m34.C117527b.m165776d(r1, r0, r11)
            return
        L_0x0092:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0092 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: s34.C118266b.mo122781b(java.lang.Object):void");
    }

    public void onError(Throwable th) {
        C117527b.m165774b(th);
        if (!this.f353477f) {
            synchronized (this) {
                if (!this.f353477f) {
                    this.f353477f = true;
                    if (this.f353476e) {
                        C118267a aVar = this.f353478g;
                        if (aVar == null) {
                            aVar = new C118267a();
                            this.f353478g = aVar;
                        }
                        aVar.mo183051a(new C117655d.C117658c(th));
                        return;
                    }
                    this.f353476e = true;
                    this.f353475d.onError(th);
                }
            }
        }
    }
}
