package z11;

import java.nio.ByteBuffer;
import p11.C110103c;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: z11.a */
public final class C112566a implements C110103c<C112567b, C112568c> {

    /* renamed from: a */
    public final ThreadLocal<ByteBuffer> f337025a = new ThreadLocal<>();

    /* renamed from: b */
    public final boolean f337026b = true;

    public C112566a() {
        new ThreadLocal();
        new ThreadLocal();
        new ThreadLocal();
    }

    /* renamed from: a */
    public Object mo161500a(C15601d<? super C13598b0> dVar) {
        return C13598b0.f38549a;
    }

    /* renamed from: b */
    public Object mo161501b(C15601d<? super C13598b0> dVar) {
        return C13598b0.f38549a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0075, code lost:
        if (r7 < r2.length) goto L_0x0077;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo161502c(z11.C112567b r23, wx3.C15601d<? super z11.C112568c> r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            y11.a$a r2 = r0.f337027a
            r2.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r2.f336390c
            long r3 = r3 - r5
            r5 = 200(0xc8, double:9.9E-322)
            r7 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x001a
            boolean r3 = r2.f336391d
            goto L_0x001e
        L_0x001a:
            r2.mo164081a()
            r3 = 0
        L_0x001e:
            r4 = 0
            if (r3 == 0) goto L_0x0024
            java.nio.ByteBuffer r2 = r2.f336389b
            goto L_0x0025
        L_0x0024:
            r2 = r4
        L_0x0025:
            r9 = 0
            if (r2 == 0) goto L_0x003f
            monitor-enter(r2)
            r1.mo164300e(r2, r0)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)
            y11.a$a r2 = r0.f337027a
            r2.mo164081a()
            y11.b$c r2 = r0.f337029c
            x11.e r3 = r0.f337028b
            r2.f336411f = r3
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x00a1
        L_0x003b:
            r0 = move-exception
            r3 = r0
            monitor-exit(r2)
            throw r3
        L_0x003f:
            y11.a$a r2 = r0.f337027a
            r2.getClass()
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = r2.f336390c
            long r10 = r10 - r12
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0052
            boolean r3 = r2.f336391d
            goto L_0x0056
        L_0x0052:
            r2.mo164081a()
            r3 = 0
        L_0x0056:
            if (r3 == 0) goto L_0x005b
            byte[] r2 = r2.f336388a
            goto L_0x005c
        L_0x005b:
            r2 = r4
        L_0x005c:
            if (r2 == 0) goto L_0x00a1
            java.lang.ThreadLocal<java.nio.ByteBuffer> r3 = r1.f337025a
            java.lang.Object r3 = r3.get()
            if (r3 == 0) goto L_0x0077
            java.lang.ThreadLocal<java.nio.ByteBuffer> r3 = r1.f337025a
            java.lang.Object r3 = r3.get()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            if (r3 == 0) goto L_0x0074
            int r7 = r3.capacity()
        L_0x0074:
            int r3 = r2.length
            if (r7 >= r3) goto L_0x0081
        L_0x0077:
            java.lang.ThreadLocal<java.nio.ByteBuffer> r3 = r1.f337025a
            int r4 = r2.length
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r4)
            r3.set(r4)
        L_0x0081:
            java.lang.ThreadLocal<java.nio.ByteBuffer> r3 = r1.f337025a
            java.lang.Object r3 = r3.get()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            if (r3 == 0) goto L_0x0099
            r3.clear()
            r3.put(r2)
            y11.a$a r2 = r0.f337027a
            r2.mo164081a()
            r1.mo164300e(r3, r0)
        L_0x0099:
            y11.b$c r2 = r0.f337029c
            x11.e r3 = r0.f337028b
            r2.f336411f = r3
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x00a1:
            if (r4 != 0) goto L_0x00b9
            java.lang.String r2 = "MicroMsg.MTR.GLUploadMTRTask"
            java.lang.String r3 = "frame timeout"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
            z11.c r2 = new z11.c
            x11.e r10 = r0.f337028b
            y11.b$c r11 = r0.f337029c
            r12 = 0
            r13 = 8
            r14 = 0
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r2
        L_0x00b9:
            r16 = 1
            z11.c r2 = new z11.c
            x11.e r3 = r0.f337028b
            y11.b$c r0 = r0.f337029c
            r19 = 0
            r20 = 8
            r21 = 0
            r15 = r2
            r17 = r3
            r18 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z11.C112566a.mo161502c(z11.b, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040 A[Catch:{ all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[Catch:{ all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072 A[Catch:{ all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e A[Catch:{ all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0099 A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022 A[Catch:{ all -> 0x00a4 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo164300e(java.nio.ByteBuffer r15, z11.C112567b r16) {
        /*
            r14 = this;
            r0 = r15
            r10 = r16
            r15.clear()
            x11.e r11 = r10.f337028b
            y11.b$c r1 = r10.f337029c
            java.util.concurrent.locks.ReentrantLock r12 = r1.f336410e
            r12.lock()
            y11.b$c r1 = r10.f337029c     // Catch:{ all -> 0x00a4 }
            boolean r2 = r1.f336409d     // Catch:{ all -> 0x00a4 }
            r13 = 0
            if (r2 == 0) goto L_0x001f
            y11.b$b r1 = r1.f336406a     // Catch:{ all -> 0x00a4 }
            boolean r2 = r1.f336404b     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x001f
            p80.c r1 = r1.f336403a     // Catch:{ all -> 0x00a4 }
            goto L_0x0020
        L_0x001f:
            r1 = r13
        L_0x0020:
            if (r1 == 0) goto L_0x0031
            int r2 = r11.f335321a     // Catch:{ all -> 0x00a4 }
            int r3 = r11.f335322b     // Catch:{ all -> 0x00a4 }
            r4 = 6409(0x1909, float:8.981E-42)
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            r5 = r15
            p80.C110194c.m149779b(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00a4 }
        L_0x0031:
            int r1 = r11.f335321a     // Catch:{ all -> 0x00a4 }
            int r2 = r11.f335322b     // Catch:{ all -> 0x00a4 }
            int r1 = r1 * r2
            r15.position(r1)     // Catch:{ all -> 0x00a4 }
            y11.b$c r1 = r10.f337029c     // Catch:{ all -> 0x00a4 }
            boolean r2 = r1.f336409d     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x0049
            y11.b$b r1 = r1.f336407b     // Catch:{ all -> 0x00a4 }
            boolean r2 = r1.f336404b     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x0049
            p80.c r1 = r1.f336403a     // Catch:{ all -> 0x00a4 }
            goto L_0x004a
        L_0x0049:
            r1 = r13
        L_0x004a:
            if (r1 == 0) goto L_0x005f
            int r2 = r11.f335321a     // Catch:{ all -> 0x00a4 }
            int r2 = r2 / 2
            int r3 = r11.f335322b     // Catch:{ all -> 0x00a4 }
            int r3 = r3 / 2
            r4 = 6409(0x1909, float:8.981E-42)
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            r5 = r15
            p80.C110194c.m149779b(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00a4 }
        L_0x005f:
            int r1 = r11.f335321a     // Catch:{ all -> 0x00a4 }
            int r2 = r11.f335322b     // Catch:{ all -> 0x00a4 }
            int r1 = r1 * r2
            int r1 = r1 * 5
            int r1 = r1 / 4
            r15.position(r1)     // Catch:{ all -> 0x00a4 }
            y11.b$c r1 = r10.f337029c     // Catch:{ all -> 0x00a4 }
            boolean r2 = r1.f336409d     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x007b
            y11.b$b r1 = r1.f336408c     // Catch:{ all -> 0x00a4 }
            boolean r2 = r1.f336404b     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x007b
            p80.c r1 = r1.f336403a     // Catch:{ all -> 0x00a4 }
            goto L_0x007c
        L_0x007b:
            r1 = r13
        L_0x007c:
            if (r1 == 0) goto L_0x0091
            int r2 = r11.f335321a     // Catch:{ all -> 0x00a4 }
            int r2 = r2 / 2
            int r3 = r11.f335322b     // Catch:{ all -> 0x00a4 }
            int r3 = r3 / 2
            r4 = 6409(0x1909, float:8.981E-42)
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            r5 = r15
            p80.C110194c.m149779b(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00a4 }
        L_0x0091:
            r15.clear()     // Catch:{ all -> 0x00a4 }
            r1 = r14
            boolean r0 = r1.f337026b     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x009c
            android.opengl.GLES20.glFinish()     // Catch:{ all -> 0x00a2 }
        L_0x009c:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00a2 }
            r12.unlock()
            return
        L_0x00a2:
            r0 = move-exception
            goto L_0x00a6
        L_0x00a4:
            r0 = move-exception
            r1 = r14
        L_0x00a6:
            r12.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z11.C112566a.mo164300e(java.nio.ByteBuffer, z11.b):void");
    }
}
