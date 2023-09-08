package ct3;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ct3.f */
public abstract class C86142f implements C86134a {

    /* renamed from: a */
    public C86139c f250672a;

    /* renamed from: ct3.f$a */
    public class C86143a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f250673d;

        /* renamed from: e */
        public final /* synthetic */ AtomicReference f250674e;

        /* renamed from: f */
        public final /* synthetic */ AtomicReference f250675f;

        /* renamed from: g */
        public final /* synthetic */ AtomicReference f250676g;

        /* renamed from: h */
        public final /* synthetic */ AtomicReference f250677h;

        /* renamed from: i */
        public final /* synthetic */ Object f250678i;

        public C86143a(Context context, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3, AtomicReference atomicReference4, Object obj) {
            this.f250673d = context;
            this.f250674e = atomicReference;
            this.f250675f = atomicReference2;
            this.f250676g = atomicReference3;
            this.f250677h = atomicReference4;
            this.f250678i = obj;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0044 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                java.lang.String r0 = ""
                ct3.f r1 = ct3.C86142f.this     // Catch:{ all -> 0x0013 }
                android.content.Context r2 = r4.f250673d     // Catch:{ all -> 0x0013 }
                java.util.concurrent.atomic.AtomicReference r3 = r4.f250674e     // Catch:{ all -> 0x0013 }
                java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0013 }
                android.os.IBinder r3 = (android.os.IBinder) r3     // Catch:{ all -> 0x0013 }
                java.lang.String r0 = r1.mo120556b(r2, r3)     // Catch:{ all -> 0x0013 }
                goto L_0x001e
            L_0x0013:
                java.util.concurrent.atomic.AtomicReference r1 = r4.f250675f
                r2 = -102(0xffffffffffffff9a, float:NaN)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.set(r2)
            L_0x001e:
                java.util.concurrent.atomic.AtomicReference r1 = r4.f250676g
                r1.set(r0)
                android.content.Context r0 = r4.f250673d     // Catch:{ all -> 0x0031 }
                java.util.concurrent.atomic.AtomicReference r1 = r4.f250677h     // Catch:{ all -> 0x0031 }
                java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0031 }
                android.content.ServiceConnection r1 = (android.content.ServiceConnection) r1     // Catch:{ all -> 0x0031 }
                r0.unbindService(r1)     // Catch:{ all -> 0x0031 }
                goto L_0x003c
            L_0x0031:
                java.util.concurrent.atomic.AtomicReference r0 = r4.f250675f
                r1 = -103(0xffffffffffffff99, float:NaN)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.set(r1)
            L_0x003c:
                java.lang.Object r0 = r4.f250678i
                monitor-enter(r0)
                java.lang.Object r1 = r4.f250678i     // Catch:{ all -> 0x0044 }
                r1.notifyAll()     // Catch:{ all -> 0x0044 }
            L_0x0044:
                monitor-exit(r0)     // Catch:{ all -> 0x0046 }
                return
            L_0x0046:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0046 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ct3.C86142f.C86143a.run():void");
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0041 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ct3.C86139c mo120551a(android.content.Context r9) {
        /*
            r8 = this;
            ct3.c r0 = r8.f250672a
            if (r0 == 0) goto L_0x0008
            int r0 = r0.f250668b
            if (r0 == 0) goto L_0x0063
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            java.lang.String r1 = ""
            r0.set(r1)
            r1 = -1
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ all -> 0x0056 }
            r2.<init>()     // Catch:{ all -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ all -> 0x0056 }
            r3.<init>()     // Catch:{ all -> 0x0056 }
            java.lang.Object r4 = new java.lang.Object     // Catch:{ all -> 0x0056 }
            r4.<init>()     // Catch:{ all -> 0x0056 }
            android.content.Intent r5 = r8.mo120558d()     // Catch:{ all -> 0x0056 }
            ct3.e r6 = new ct3.e     // Catch:{ all -> 0x0056 }
            r6.<init>(r8, r2, r3, r4)     // Catch:{ all -> 0x0056 }
            r7 = 1
            boolean r5 = r9.bindService(r5, r6, r7)     // Catch:{ all -> 0x0056 }
            if (r5 != 0) goto L_0x0035
            r1 = -100
            goto L_0x0050
        L_0x0035:
            java.lang.Object r5 = r2.get()     // Catch:{ all -> 0x0056 }
            if (r5 != 0) goto L_0x0046
            monitor-enter(r4)     // Catch:{ all -> 0x0056 }
            r5 = 2000(0x7d0, double:9.88E-321)
            r4.wait(r5)     // Catch:{ all -> 0x0041 }
        L_0x0041:
            monitor-exit(r4)     // Catch:{ all -> 0x0043 }
            goto L_0x0046
        L_0x0043:
            r9 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0043 }
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x0046:
            java.lang.Object r1 = r2.get()     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x004f
            r1 = -105(0xffffffffffffff97, float:NaN)
            goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            if (r1 != 0) goto L_0x0056
            int r1 = r8.mo120557c(r9, r2, r3, r0)     // Catch:{ all -> 0x0056 }
        L_0x0056:
            ct3.c r9 = new ct3.c
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r9.<init>(r0, r1)
            r8.f250672a = r9
        L_0x0063:
            ct3.c r9 = r8.f250672a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ct3.C86142f.mo120551a(android.content.Context):ct3.c");
    }

    /* renamed from: b */
    public abstract String mo120556b(Context context, IBinder iBinder);

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x002a */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo120557c(android.content.Context r13, java.util.concurrent.atomic.AtomicReference<android.os.IBinder> r14, java.util.concurrent.atomic.AtomicReference<android.content.ServiceConnection> r15, java.util.concurrent.atomic.AtomicReference<java.lang.String> r16) {
        /*
            r12 = this;
            java.lang.Object r9 = new java.lang.Object
            r9.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1)
            zt3.t r10 = zt3.C119157j.f356862d
            ct3.f$a r11 = new ct3.f$a
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r0
            r6 = r16
            r7 = r15
            r8 = r9
            r1.<init>(r3, r4, r5, r6, r7, r8)
            zt3.j r10 = (zt3.C119157j) r10
            r10.mo183884o(r11)
            monitor-enter(r9)
            r1 = 2000(0x7d0, double:9.88E-321)
            r9.wait(r1)     // Catch:{ all -> 0x002a }
        L_0x002a:
            monitor-exit(r9)     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0036:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0036 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ct3.C86142f.mo120557c(android.content.Context, java.util.concurrent.atomic.AtomicReference, java.util.concurrent.atomic.AtomicReference, java.util.concurrent.atomic.AtomicReference):int");
    }

    /* renamed from: d */
    public abstract Intent mo120558d();
}
