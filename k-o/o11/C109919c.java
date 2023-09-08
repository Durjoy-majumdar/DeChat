package o11;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105137e;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C36568h;
import y11.C112358a;

/* renamed from: o11.c */
public final class C109919c {

    /* renamed from: a */
    public final C109917a f328889a;

    /* renamed from: b */
    public final C112358a f328890b;

    /* renamed from: c */
    public final C105137e f328891c = new C109920a(this);

    /* renamed from: o11.c$a */
    public static final class C109920a implements C105137e {

        /* renamed from: a */
        public final /* synthetic */ C109919c f328892a;

        public C109920a(C109919c cVar) {
            this.f328892a = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
            r9 = (java.lang.ref.WeakReference) r7.poll();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo149450a(int r17, java.nio.ByteBuffer r18, int r19, int r20, int r21) {
            /*
                r16 = this;
                r1 = r16
                r0 = r17
                r5 = r19
                r6 = r20
                r2 = r21
                o11.c r3 = r1.f328892a
                y11.a r8 = r3.f328890b
                int r3 = r5 * r6
                int r3 = r3 * 3
                r4 = 2
                int r3 = r3 / r4
                android.util.SparseArray<java.util.concurrent.ConcurrentLinkedDeque<java.lang.ref.WeakReference<java.nio.ByteBuffer>>> r7 = r8.f336386e
                java.lang.Object r7 = r7.get(r3)
                java.util.concurrent.ConcurrentLinkedDeque r7 = (java.util.concurrent.ConcurrentLinkedDeque) r7
            L_0x001c:
                r13 = 0
                if (r7 == 0) goto L_0x002e
                java.lang.Object r9 = r7.poll()
                java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
                if (r9 == 0) goto L_0x002e
                java.lang.Object r9 = r9.get()
                java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9
                goto L_0x002f
            L_0x002e:
                r9 = r13
            L_0x002f:
                r14 = 0
                if (r7 == 0) goto L_0x0037
                int r10 = r7.size()
                goto L_0x0038
            L_0x0037:
                r10 = 0
            L_0x0038:
                if (r10 <= 0) goto L_0x003c
                if (r9 == 0) goto L_0x001c
            L_0x003c:
                int r7 = r8.f336387f
                int r10 = r7 + 1
                r8.f336387f = r10
                int r7 = r7 % 200
                if (r7 != 0) goto L_0x0052
                java.lang.String r7 = "MicroMsg.MTR.BufferManager"
                java.lang.String r10 = "clear cache"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
                android.util.SparseArray<java.util.concurrent.ConcurrentLinkedDeque<java.lang.ref.WeakReference<java.nio.ByteBuffer>>> r7 = r8.f336386e
                r7.clear()
            L_0x0052:
                y11.a$a r15 = new y11.a$a
                r10 = 0
                if (r9 != 0) goto L_0x005c
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r3)
                goto L_0x005d
            L_0x005c:
                r3 = r9
            L_0x005d:
                r11 = 1
                r12 = 0
                r7 = r15
                r9 = r10
                r10 = r3
                r7.<init>(r8, r9, r10, r11, r12)
                long r7 = java.lang.System.currentTimeMillis()
                long r9 = r15.f336390c
                long r7 = r7 - r9
                r9 = 200(0xc8, double:9.9E-322)
                int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r3 > 0) goto L_0x0075
                boolean r3 = r15.f336391d
                goto L_0x0079
            L_0x0075:
                r15.mo164081a()
                r3 = 0
            L_0x0079:
                if (r3 == 0) goto L_0x007d
                java.nio.ByteBuffer r13 = r15.f336389b
            L_0x007d:
                if (r13 == 0) goto L_0x0123
                monitor-enter(r13)
                r13.clear()     // Catch:{ all -> 0x0120 }
                java.nio.Buffer r3 = r18.clear()     // Catch:{ all -> 0x0120 }
                int r7 = r13.capacity()     // Catch:{ all -> 0x0120 }
                r3.limit(r7)     // Catch:{ all -> 0x0120 }
                r3 = r18
                r13.put(r3)     // Catch:{ all -> 0x0120 }
                monitor-exit(r13)
                o11.c r3 = r1.f328892a
                r7 = r2 & 128(0x80, float:1.794E-43)
                r8 = 128(0x80, float:1.794E-43)
                r9 = 1
                if (r7 != r8) goto L_0x009f
                r7 = 1
                goto L_0x00a0
            L_0x009f:
                r7 = 0
            L_0x00a0:
                if (r7 == 0) goto L_0x00b9
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r10 = ""
                r8.append(r10)
                r8.append(r0)
                java.lang.String r0 = "_screen"
                r8.append(r0)
                java.lang.String r0 = r8.toString()
                goto L_0x00cf
            L_0x00b9:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r10 = ""
                r8.append(r10)
                r8.append(r0)
                java.lang.String r0 = "_video"
                r8.append(r0)
                java.lang.String r0 = r8.toString()
            L_0x00cf:
                java.lang.String r8 = "MicroMsg.MTR.OpenVoiceEngineOp"
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "weiranli: framecallback, "
                r10.append(r11)
                r10.append(r5)
                r11 = 120(0x78, float:1.68E-43)
                r10.append(r11)
                r10.append(r6)
                java.lang.String r11 = ", viewname:"
                r10.append(r11)
                r10.append(r0)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
                o11.a r10 = r3.f328889a
                o11.d r11 = new o11.d
                if (r7 == 0) goto L_0x0110
                r3 = r2 & 256(0x100, float:3.59E-43)
                if (r3 != 0) goto L_0x010e
                r3 = r2 & 512(0x200, float:7.175E-43)
                if (r3 == 0) goto L_0x0105
                goto L_0x0106
            L_0x0105:
                r4 = 1
            L_0x0106:
                r2 = r2 & 1024(0x400, float:1.435E-42)
                if (r2 == 0) goto L_0x010c
                int r4 = r4 + 2
            L_0x010c:
                r8 = r4
                goto L_0x0112
            L_0x010e:
                r8 = 1
                goto L_0x0112
            L_0x0110:
                r2 = -1
                r8 = -1
            L_0x0112:
                r2 = r11
                r3 = r0
                r4 = r15
                r5 = r19
                r6 = r20
                r2.<init>(r3, r4, r5, r6, r7, r8)
                r10.mo160899a(r11)
                goto L_0x0123
            L_0x0120:
                r0 = move-exception
                monitor-exit(r13)
                throw r0
            L_0x0123:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o11.C109919c.C109920a.mo149450a(int, java.nio.ByteBuffer, int, int, int):void");
        }
    }

    /* renamed from: o11.c$b */
    public static final class C109921b extends C87413o implements C32224a<C109918b> {

        /* renamed from: d */
        public final /* synthetic */ C109919c f328893d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109921b(C109919c cVar) {
            super(0);
            this.f328893d = cVar;
        }

        public Object invoke() {
            return new C109918b(this.f328893d.f328890b);
        }
    }

    public C109919c(C109917a aVar, C112358a aVar2) {
        C87412m.m108594g(aVar, "decodeResultHandler");
        C87412m.m108594g(aVar2, "bufferManager");
        this.f328889a = aVar;
        this.f328890b = aVar2;
        C36568h.m40985a(new C109921b(this));
    }
}
