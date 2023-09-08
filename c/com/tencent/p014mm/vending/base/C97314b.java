package com.tencent.p014mm.vending.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.vending.base.Vending;

/* renamed from: com.tencent.mm.vending.base.b */
public final class C97314b {

    /* renamed from: a */
    public Looper f285605a;

    /* renamed from: b */
    public Looper f285606b;

    /* renamed from: c */
    public Handler f285607c;

    /* renamed from: d */
    public Handler f285608d;

    /* renamed from: e */
    public byte[] f285609e = new byte[0];

    /* renamed from: f */
    public C97317c f285610f;

    /* renamed from: com.tencent.mm.vending.base.b$a */
    public class C97315a extends Handler {
        public C97315a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C97314b.this.mo136394a(message.what, message.obj);
        }
    }

    /* renamed from: com.tencent.mm.vending.base.b$b */
    public class C97316b extends Handler {
        public C97316b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            synchronized (C97314b.this.f285609e) {
                C97317c cVar = C97314b.this.f285610f;
                if (cVar != null) {
                    ((Vending.C97294d) cVar).mo136383a(message.what, message.obj);
                }
                C97314b.this.f285609e.notify();
            }
        }
    }

    /* renamed from: com.tencent.mm.vending.base.b$c */
    public interface C97317c {
    }

    public C97314b(Looper looper, Looper looper2) {
        this.f285605a = looper;
        this.f285606b = looper2;
        this.f285607c = new C97315a(this.f285605a);
        this.f285608d = new C97316b(this.f285606b);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0041 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136394a(int r7, java.lang.Object r8) {
        /*
            r6 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = r6.f285605a
            if (r0 != r1) goto L_0x006f
            com.tencent.mm.vending.base.b$c r0 = r6.f285610f
            r1 = 0
            if (r0 != 0) goto L_0x0017
            java.lang.String r7 = "Vending.VendingSync"
            java.lang.String r8 = "This call is pointless."
            java.lang.Object[] r0 = new java.lang.Object[r1]
            kp3.C88253a.m109904c(r7, r8, r0)
            return
        L_0x0017:
            com.tencent.mm.vending.base.Vending$d r0 = (com.tencent.p014mm.vending.base.Vending.C97294d) r0
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.mm.vending.base.Vending r4 = com.tencent.p014mm.vending.base.Vending.this
            r3[r1] = r4
            java.lang.String r4 = "Vending"
            java.lang.String r5 = "%s beforeSynchronize"
            kp3.C88253a.m109903b(r4, r5, r3)
            com.tencent.mm.vending.base.Vending r0 = com.tencent.p014mm.vending.base.Vending.this
            com.tencent.mm.vending.base.Vending$n r0 = r0.mLoader
            r0.mo136388a()
            byte[] r0 = r6.f285609e
            monitor-enter(r0)
            android.os.Handler r3 = r6.f285608d     // Catch:{ all -> 0x006c }
            android.os.Message r7 = r3.obtainMessage(r7, r8)     // Catch:{ all -> 0x006c }
            r3.sendMessageAtFrontOfQueue(r7)     // Catch:{ all -> 0x006c }
            byte[] r7 = r6.f285609e     // Catch:{ InterruptedException -> 0x0041 }
            r7.wait()     // Catch:{ InterruptedException -> 0x0041 }
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            com.tencent.mm.vending.base.b$c r7 = r6.f285610f
            com.tencent.mm.vending.base.Vending$d r7 = (com.tencent.p014mm.vending.base.Vending.C97294d) r7
            java.lang.String r8 = "Vending"
            java.lang.String r0 = "%s afterSynchronize"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mm.vending.base.Vending r3 = com.tencent.p014mm.vending.base.Vending.this
            r2[r1] = r3
            kp3.C88253a.m109903b(r8, r0, r2)
            com.tencent.mm.vending.base.Vending r8 = com.tencent.p014mm.vending.base.Vending.this
            gp3.c r8 = r8.mDataChangedCallback
            if (r8 == 0) goto L_0x006b
            com.tencent.mm.vending.base.Vending r7 = com.tencent.p014mm.vending.base.Vending.this
            gp3.c r7 = r7.mDataChangedCallback
            monitor-enter(r7)
            r8 = 0
            r7.mo121711n(r8)     // Catch:{ all -> 0x0068 }
            monitor-exit(r7)
            goto L_0x006b
        L_0x0068:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x006b:
            return
        L_0x006c:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            throw r7
        L_0x006f:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = r6.f285606b
            if (r0 != r1) goto L_0x0080
            android.os.Handler r0 = r6.f285607c
            android.os.Message r7 = r0.obtainMessage(r7, r8)
            r0.sendMessageAtFrontOfQueue(r7)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vending.base.C97314b.mo136394a(int, java.lang.Object):void");
    }
}
