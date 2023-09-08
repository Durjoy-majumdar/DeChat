package r82;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import h82.C108174c;
import java.nio.ByteBuffer;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: r82.a */
public final class C110551a implements C108174c<C110552b, C110553c> {

    /* renamed from: a */
    public final ThreadLocal<ByteBuffer> f330636a = new ThreadLocal<>();

    /* renamed from: b */
    public final boolean f330637b;

    /* renamed from: c */
    public final boolean f330638c;

    /* renamed from: d */
    public final ThreadLocal<ByteBuffer> f330639d;

    /* renamed from: e */
    public final ThreadLocal<ByteBuffer> f330640e;

    /* renamed from: f */
    public final ThreadLocal<ByteBuffer> f330641f;

    public C110551a() {
        Class cls = C32735h.class;
        boolean z = false;
        boolean z2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_multitalk_use_new_yuv_buffer, 0) == 1;
        Log.m105924i("MicroMsg.MultitalkUtils", "uploadUseYuvBuffer: " + z2);
        this.f330637b = z2;
        z = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_multitalk_upload_disable_finish_call, 0) == 1 ? true : z;
        Log.m105924i("MicroMsg.MultitalkUtils", "disableUploadFinishCall: " + z);
        this.f330638c = z ^ true;
        this.f330639d = new ThreadLocal<>();
        this.f330640e = new ThreadLocal<>();
        this.f330641f = new ThreadLocal<>();
    }

    /* renamed from: a */
    public Object mo158580a(C15601d<? super C13598b0> dVar) {
        return C13598b0.f38549a;
    }

    /* renamed from: b */
    public Object mo158581b(C15601d<? super C13598b0> dVar) {
        return C13598b0.f38549a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        if (r7 < r2.length) goto L_0x0067;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo158582c(r82.C110552b r23, wx3.C15601d<? super r82.C110553c> r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            q82.a$a r2 = r0.f330642a
            r2.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r2.f330170d
            long r3 = r3 - r5
            r5 = 200(0xc8, double:9.9E-322)
            r7 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x001a
            boolean r3 = r2.f330171e
            goto L_0x001e
        L_0x001a:
            r2.mo161890b()
            r3 = 0
        L_0x001e:
            r4 = 0
            if (r3 == 0) goto L_0x0024
            java.nio.ByteBuffer r2 = r2.f330168b
            goto L_0x0025
        L_0x0024:
            r2 = r4
        L_0x0025:
            r9 = 0
            if (r2 == 0) goto L_0x0046
            monitor-enter(r2)
            boolean r3 = r1.f330637b     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x0031
            r1.mo162002f(r2, r0)     // Catch:{ all -> 0x0043 }
            goto L_0x0034
        L_0x0031:
            r1.mo162001e(r2, r0)     // Catch:{ all -> 0x0043 }
        L_0x0034:
            monitor-exit(r2)
            q82.a$a r2 = r0.f330642a
            r2.mo161890b()
            q82.b$c r2 = r0.f330644c
            p82.e r3 = r0.f330643b
            r2.f330191f = r3
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x0099
        L_0x0043:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0046:
            q82.a$a r2 = r0.f330642a
            byte[] r2 = r2.mo161889a()
            if (r2 == 0) goto L_0x0099
            java.lang.ThreadLocal<java.nio.ByteBuffer> r3 = r1.f330636a
            java.lang.Object r3 = r3.get()
            if (r3 == 0) goto L_0x0067
            java.lang.ThreadLocal<java.nio.ByteBuffer> r3 = r1.f330636a
            java.lang.Object r3 = r3.get()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            if (r3 == 0) goto L_0x0064
            int r7 = r3.capacity()
        L_0x0064:
            int r3 = r2.length
            if (r7 >= r3) goto L_0x0071
        L_0x0067:
            java.lang.ThreadLocal<java.nio.ByteBuffer> r3 = r1.f330636a
            int r4 = r2.length
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r4)
            r3.set(r4)
        L_0x0071:
            java.lang.ThreadLocal<java.nio.ByteBuffer> r3 = r1.f330636a
            java.lang.Object r3 = r3.get()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            if (r3 == 0) goto L_0x0091
            r3.clear()
            r3.put(r2)
            q82.a$a r2 = r0.f330642a
            r2.mo161890b()
            boolean r2 = r1.f330637b
            if (r2 == 0) goto L_0x008e
            r1.mo162002f(r3, r0)
            goto L_0x0091
        L_0x008e:
            r1.mo162001e(r3, r0)
        L_0x0091:
            q82.b$c r2 = r0.f330644c
            p82.e r3 = r0.f330643b
            r2.f330191f = r3
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x0099:
            if (r4 != 0) goto L_0x00b1
            java.lang.String r2 = "MicroMsg.MTR.GLUploadMTRTask"
            java.lang.String r3 = "frame timeout"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
            r82.c r2 = new r82.c
            p82.e r10 = r0.f330643b
            q82.b$c r11 = r0.f330644c
            r12 = 0
            r13 = 8
            r14 = 0
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r2
        L_0x00b1:
            r16 = 1
            r82.c r2 = new r82.c
            p82.e r3 = r0.f330643b
            q82.b$c r0 = r0.f330644c
            r19 = 0
            r20 = 8
            r21 = 0
            r15 = r2
            r17 = r3
            r18 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r82.C110551a.mo158582c(r82.b, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040 A[Catch:{ all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[Catch:{ all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072 A[Catch:{ all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e A[Catch:{ all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0099 A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022 A[Catch:{ all -> 0x00a4 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo162001e(java.nio.ByteBuffer r15, r82.C110552b r16) {
        /*
            r14 = this;
            r0 = r15
            r10 = r16
            r15.clear()
            p82.e r11 = r10.f330643b
            q82.b$c r1 = r10.f330644c
            java.util.concurrent.locks.ReentrantLock r12 = r1.f330190e
            r12.lock()
            q82.b$c r1 = r10.f330644c     // Catch:{ all -> 0x00a4 }
            boolean r2 = r1.f330189d     // Catch:{ all -> 0x00a4 }
            r13 = 0
            if (r2 == 0) goto L_0x001f
            q82.b$b r1 = r1.f330186a     // Catch:{ all -> 0x00a4 }
            boolean r2 = r1.f330184b     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x001f
            p80.c r1 = r1.f330183a     // Catch:{ all -> 0x00a4 }
            goto L_0x0020
        L_0x001f:
            r1 = r13
        L_0x0020:
            if (r1 == 0) goto L_0x0031
            int r2 = r11.f329678a     // Catch:{ all -> 0x00a4 }
            int r3 = r11.f329679b     // Catch:{ all -> 0x00a4 }
            r4 = 6409(0x1909, float:8.981E-42)
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            r5 = r15
            p80.C110194c.m149779b(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00a4 }
        L_0x0031:
            int r1 = r11.f329678a     // Catch:{ all -> 0x00a4 }
            int r2 = r11.f329679b     // Catch:{ all -> 0x00a4 }
            int r1 = r1 * r2
            r15.position(r1)     // Catch:{ all -> 0x00a4 }
            q82.b$c r1 = r10.f330644c     // Catch:{ all -> 0x00a4 }
            boolean r2 = r1.f330189d     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x0049
            q82.b$b r1 = r1.f330187b     // Catch:{ all -> 0x00a4 }
            boolean r2 = r1.f330184b     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x0049
            p80.c r1 = r1.f330183a     // Catch:{ all -> 0x00a4 }
            goto L_0x004a
        L_0x0049:
            r1 = r13
        L_0x004a:
            if (r1 == 0) goto L_0x005f
            int r2 = r11.f329678a     // Catch:{ all -> 0x00a4 }
            int r2 = r2 / 2
            int r3 = r11.f329679b     // Catch:{ all -> 0x00a4 }
            int r3 = r3 / 2
            r4 = 6409(0x1909, float:8.981E-42)
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            r5 = r15
            p80.C110194c.m149779b(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00a4 }
        L_0x005f:
            int r1 = r11.f329678a     // Catch:{ all -> 0x00a4 }
            int r2 = r11.f329679b     // Catch:{ all -> 0x00a4 }
            int r1 = r1 * r2
            int r1 = r1 * 5
            int r1 = r1 / 4
            r15.position(r1)     // Catch:{ all -> 0x00a4 }
            q82.b$c r1 = r10.f330644c     // Catch:{ all -> 0x00a4 }
            boolean r2 = r1.f330189d     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x007b
            q82.b$b r1 = r1.f330188c     // Catch:{ all -> 0x00a4 }
            boolean r2 = r1.f330184b     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x007b
            p80.c r1 = r1.f330183a     // Catch:{ all -> 0x00a4 }
            goto L_0x007c
        L_0x007b:
            r1 = r13
        L_0x007c:
            if (r1 == 0) goto L_0x0091
            int r2 = r11.f329678a     // Catch:{ all -> 0x00a4 }
            int r2 = r2 / 2
            int r3 = r11.f329679b     // Catch:{ all -> 0x00a4 }
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
            boolean r0 = r1.f330638c     // Catch:{ all -> 0x00a2 }
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
        throw new UnsupportedOperationException("Method not decompiled: r82.C110551a.mo162001e(java.nio.ByteBuffer, r82.b):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063 A[Catch:{ all -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009e A[Catch:{ all -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d2 A[Catch:{ all -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ef A[Catch:{ all -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0112 A[Catch:{ all -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0162 A[Catch:{ all -> 0x016b }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo162002f(java.nio.ByteBuffer r18, r82.C110552b r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            p82.e r3 = r2.f330643b
            r18.clear()
            java.lang.ThreadLocal<java.nio.ByteBuffer> r4 = r1.f330639d
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L_0x0022
            r5 = r4
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r5 = r5.capacity()
            int r6 = r3.f329678a
            int r7 = r3.f329679b
            int r6 = r6 * r7
            if (r5 >= r6) goto L_0x0031
        L_0x0022:
            int r4 = r3.f329678a
            int r5 = r3.f329679b
            int r4 = r4 * r5
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r4)
            java.lang.ThreadLocal<java.nio.ByteBuffer> r5 = r1.f330639d
            r5.set(r4)
        L_0x0031:
            q82.b$c r5 = r2.f330644c
            java.util.concurrent.locks.ReentrantLock r5 = r5.f330190e
            r5.lock()
            r10 = r4
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10     // Catch:{ all -> 0x016b }
            r4 = 0
            if (r10 == 0) goto L_0x0071
            r10.clear()     // Catch:{ all -> 0x016b }
            int r6 = r3.f329678a     // Catch:{ all -> 0x016b }
            int r7 = r3.f329679b     // Catch:{ all -> 0x016b }
            int r6 = r6 * r7
            r0.limit(r6)     // Catch:{ all -> 0x016b }
            java.nio.ByteBuffer r6 = r10.put(r0)     // Catch:{ all -> 0x016b }
            r6.clear()     // Catch:{ all -> 0x016b }
            q82.b$c r6 = r2.f330644c     // Catch:{ all -> 0x016b }
            boolean r7 = r6.f330189d     // Catch:{ all -> 0x016b }
            if (r7 == 0) goto L_0x0060
            q82.b$b r6 = r6.f330186a     // Catch:{ all -> 0x016b }
            boolean r7 = r6.f330184b     // Catch:{ all -> 0x016b }
            if (r7 == 0) goto L_0x0060
            p80.c r6 = r6.f330183a     // Catch:{ all -> 0x016b }
            goto L_0x0061
        L_0x0060:
            r6 = r4
        L_0x0061:
            if (r6 == 0) goto L_0x0071
            int r7 = r3.f329678a     // Catch:{ all -> 0x016b }
            int r8 = r3.f329679b     // Catch:{ all -> 0x016b }
            r9 = 6409(0x1909, float:8.981E-42)
            r11 = 0
            r12 = 0
            r13 = 48
            r14 = 0
            p80.C110194c.m149779b(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x016b }
        L_0x0071:
            java.lang.ThreadLocal<java.nio.ByteBuffer> r6 = r1.f330640e     // Catch:{ all -> 0x016b }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x016b }
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6     // Catch:{ all -> 0x016b }
            if (r6 == 0) goto L_0x008a
            int r7 = r6.capacity()     // Catch:{ all -> 0x016b }
            int r8 = r3.f329678a     // Catch:{ all -> 0x016b }
            int r9 = r3.f329679b     // Catch:{ all -> 0x016b }
            int r8 = r8 * r9
            if (r7 >= r8) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r12 = r6
            goto L_0x009c
        L_0x008a:
            int r6 = r3.f329678a     // Catch:{ all -> 0x016b }
            int r7 = r3.f329679b     // Catch:{ all -> 0x016b }
            int r6 = r6 * r7
            int r6 = r6 / 4
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocateDirect(r6)     // Catch:{ all -> 0x016b }
            java.lang.ThreadLocal<java.nio.ByteBuffer> r7 = r1.f330640e     // Catch:{ all -> 0x016b }
            r7.set(r6)     // Catch:{ all -> 0x016b }
            goto L_0x0088
        L_0x009c:
            if (r12 == 0) goto L_0x00e5
            int r6 = r3.f329678a     // Catch:{ all -> 0x016b }
            int r7 = r3.f329679b     // Catch:{ all -> 0x016b }
            int r6 = r6 * r7
            java.nio.Buffer r6 = r0.position(r6)     // Catch:{ all -> 0x016b }
            int r7 = r3.f329678a     // Catch:{ all -> 0x016b }
            int r8 = r3.f329679b     // Catch:{ all -> 0x016b }
            int r7 = r7 * r8
            int r7 = r7 * 5
            int r7 = r7 / 4
            r6.limit(r7)     // Catch:{ all -> 0x016b }
            r12.clear()     // Catch:{ all -> 0x016b }
            java.nio.ByteBuffer r6 = r12.put(r0)     // Catch:{ all -> 0x016b }
            r6.clear()     // Catch:{ all -> 0x016b }
            q82.b$c r6 = r2.f330644c     // Catch:{ all -> 0x016b }
            boolean r7 = r6.f330189d     // Catch:{ all -> 0x016b }
            if (r7 == 0) goto L_0x00cf
            q82.b$b r6 = r6.f330187b     // Catch:{ all -> 0x016b }
            boolean r7 = r6.f330184b     // Catch:{ all -> 0x016b }
            if (r7 == 0) goto L_0x00cf
            p80.c r6 = r6.f330183a     // Catch:{ all -> 0x016b }
            r8 = r6
            goto L_0x00d0
        L_0x00cf:
            r8 = r4
        L_0x00d0:
            if (r8 == 0) goto L_0x00e5
            int r6 = r3.f329678a     // Catch:{ all -> 0x016b }
            int r9 = r6 / 2
            int r6 = r3.f329679b     // Catch:{ all -> 0x016b }
            int r10 = r6 / 2
            r11 = 6409(0x1909, float:8.981E-42)
            r13 = 0
            r14 = 0
            r15 = 48
            r16 = 0
            p80.C110194c.m149779b(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x016b }
        L_0x00e5:
            java.lang.ThreadLocal<java.nio.ByteBuffer> r6 = r1.f330640e     // Catch:{ all -> 0x016b }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x016b }
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6     // Catch:{ all -> 0x016b }
            if (r6 == 0) goto L_0x00fe
            int r7 = r6.capacity()     // Catch:{ all -> 0x016b }
            int r8 = r3.f329678a     // Catch:{ all -> 0x016b }
            int r9 = r3.f329679b     // Catch:{ all -> 0x016b }
            int r8 = r8 * r9
            if (r7 >= r8) goto L_0x00fc
            goto L_0x00fe
        L_0x00fc:
            r12 = r6
            goto L_0x0110
        L_0x00fe:
            int r6 = r3.f329678a     // Catch:{ all -> 0x016b }
            int r7 = r3.f329679b     // Catch:{ all -> 0x016b }
            int r6 = r6 * r7
            int r6 = r6 / 4
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocateDirect(r6)     // Catch:{ all -> 0x016b }
            java.lang.ThreadLocal<java.nio.ByteBuffer> r7 = r1.f330641f     // Catch:{ all -> 0x016b }
            r7.set(r6)     // Catch:{ all -> 0x016b }
            goto L_0x00fc
        L_0x0110:
            if (r12 == 0) goto L_0x015b
            int r6 = r3.f329678a     // Catch:{ all -> 0x016b }
            int r7 = r3.f329679b     // Catch:{ all -> 0x016b }
            int r6 = r6 * r7
            int r6 = r6 * 5
            int r6 = r6 / 4
            java.nio.Buffer r6 = r0.position(r6)     // Catch:{ all -> 0x016b }
            int r7 = r3.f329678a     // Catch:{ all -> 0x016b }
            int r8 = r3.f329679b     // Catch:{ all -> 0x016b }
            int r7 = r7 * r8
            int r7 = r7 * 3
            int r7 = r7 / 2
            r6.limit(r7)     // Catch:{ all -> 0x016b }
            r12.clear()     // Catch:{ all -> 0x016b }
            java.nio.ByteBuffer r6 = r12.put(r0)     // Catch:{ all -> 0x016b }
            r6.clear()     // Catch:{ all -> 0x016b }
            q82.b$c r2 = r2.f330644c     // Catch:{ all -> 0x016b }
            boolean r6 = r2.f330189d     // Catch:{ all -> 0x016b }
            if (r6 == 0) goto L_0x0145
            q82.b$b r2 = r2.f330188c     // Catch:{ all -> 0x016b }
            boolean r6 = r2.f330184b     // Catch:{ all -> 0x016b }
            if (r6 == 0) goto L_0x0145
            p80.c r4 = r2.f330183a     // Catch:{ all -> 0x016b }
        L_0x0145:
            r8 = r4
            if (r8 == 0) goto L_0x015b
            int r2 = r3.f329678a     // Catch:{ all -> 0x016b }
            int r9 = r2 / 2
            int r2 = r3.f329679b     // Catch:{ all -> 0x016b }
            int r10 = r2 / 2
            r11 = 6409(0x1909, float:8.981E-42)
            r13 = 0
            r14 = 0
            r15 = 48
            r16 = 0
            p80.C110194c.m149779b(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x016b }
        L_0x015b:
            r18.clear()     // Catch:{ all -> 0x016b }
            boolean r0 = r1.f330638c     // Catch:{ all -> 0x016b }
            if (r0 == 0) goto L_0x0165
            android.opengl.GLES20.glFinish()     // Catch:{ all -> 0x016b }
        L_0x0165:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x016b }
            r5.unlock()
            return
        L_0x016b:
            r0 = move-exception
            r5.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r82.C110551a.mo162002f(java.nio.ByteBuffer, r82.b):void");
    }
}
