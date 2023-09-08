package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.launching.C83499v;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.x */
public final class C83517x extends C87413o implements C32226l<ICommLibReader, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83499v.C83502c f243999d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83517x(C83499v.C83502c cVar) {
        super(1);
        this.f243999d = cVar;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r7 = (com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader) r7
            java.lang.String r0 = "reader"
            gy3.C87412m.m108594g(r7, r0)
            com.tencent.mm.plugin.appbrand.launching.v$c r0 = r6.f243999d
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f243975b
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x006d
            com.tencent.mm.plugin.appbrand.launching.v$c r0 = r6.f243999d
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r0.f243978e
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.readLock()
            int r3 = r1.getWriteHoldCount()
            r4 = 0
            if (r3 != 0) goto L_0x0026
            int r3 = r1.getReadHoldCount()
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            r5 = 0
        L_0x0028:
            if (r5 >= r3) goto L_0x0030
            r2.unlock()
            int r5 = r5 + 1
            goto L_0x0028
        L_0x0030:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            r0.f243974a = r7     // Catch:{ all -> 0x0060 }
        L_0x0039:
            java.util.concurrent.ConcurrentLinkedDeque<fy3.l<com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader, rx3.b0>> r7 = r0.f243977d     // Catch:{ all -> 0x0060 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0060 }
            if (r7 != 0) goto L_0x0052
            java.util.concurrent.ConcurrentLinkedDeque<fy3.l<com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader, rx3.b0>> r7 = r0.f243977d     // Catch:{ all -> 0x0060 }
            java.lang.Object r7 = r7.poll()     // Catch:{ all -> 0x0060 }
            fy3.l r7 = (fy3.C32226l) r7     // Catch:{ all -> 0x0060 }
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r5 = r0.f243974a     // Catch:{ all -> 0x0060 }
            gy3.C87412m.m108591d(r5)     // Catch:{ all -> 0x0060 }
            r7.invoke(r5)     // Catch:{ all -> 0x0060 }
            goto L_0x0039
        L_0x0052:
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0060 }
        L_0x0054:
            if (r4 >= r3) goto L_0x005c
            r2.lock()
            int r4 = r4 + 1
            goto L_0x0054
        L_0x005c:
            r1.unlock()
            goto L_0x006d
        L_0x0060:
            r7 = move-exception
        L_0x0061:
            if (r4 >= r3) goto L_0x0069
            r2.lock()
            int r4 = r4 + 1
            goto L_0x0061
        L_0x0069:
            r1.unlock()
            throw r7
        L_0x006d:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83517x.invoke(java.lang.Object):java.lang.Object");
    }
}
