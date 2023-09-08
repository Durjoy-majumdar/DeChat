package pc0;

import com.tencent.p014mm.booter.C114716m;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

public class e0$$f implements C118010i {

    /* renamed from: d */
    public final /* synthetic */ C118002e0 f352730d;

    /* renamed from: pc0.e0$$f$a */
    public class C118003a implements C118009h {

        /* renamed from: a */
        public final /* synthetic */ int f352731a;

        public C118003a(int i) {
            this.f352731a = i;
        }

        /* renamed from: a */
        public boolean mo182771a(int i) {
            Log.m105925i("MicroMsg.SyncService", "%s onFinishCmd index:%s ", e0$$f.this, Integer.valueOf(this.f352731a));
            int i2 = this.f352731a;
            C86709a0.m107528h();
            C114716m.m161361b(i2, C86709a0.m107523b().mo121110g());
            e0$$f e0__f = e0$$f.this;
            e0__f.f352730d.mo182763g(e0__f);
            return true;
        }
    }

    public e0$$f(C118002e0 e0Var) {
        this.f352730d = e0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00e4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e5  */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo72839G0(java.util.Queue<pc0.C118010i> r19) {
        /*
            r18 = this;
            r8 = r18
            com.tencent.mm.pointers.PInt r0 = new com.tencent.mm.pointers.PInt
            r0.<init>()
            f40.C86709a0.m107528h()
            f40.e r1 = f40.C86709a0.m107523b()
            int r1 = r1.mo121110g()
            byte[] r1 = com.tencent.p014mm.booter.C114716m.m161365f(r0, r1)
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r8
            int r5 = r0.value
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9 = 1
            r3[r9] = r5
            if (r1 == 0) goto L_0x0029
            int r5 = r1.length
            goto L_0x002a
        L_0x0029:
            r5 = -1
        L_0x002a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 2
            r3[r6] = r5
            java.lang.String r5 = "MicroMsg.SyncService"
            java.lang.String r7 = "%s index:%d, buf.len:%d "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r3)
            int r3 = r0.value
            if (r3 == 0) goto L_0x0103
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r1)
            if (r3 == 0) goto L_0x0044
            goto L_0x0103
        L_0x0044:
            int r3 = r0.value
            r7 = 0
            qe3.q0 r0 = new qe3.q0     // Catch:{ Exception -> 0x00b0, Error -> 0x0054 }
            r0.<init>()     // Catch:{ Exception -> 0x00b0, Error -> 0x0054 }
            r0.fromProtoBuf(r1)     // Catch:{ Exception -> 0x00b0, Error -> 0x0054 }
            te3.x33 r0 = r0.f296025a     // Catch:{ Exception -> 0x00b0, Error -> 0x0054 }
            r5 = r0
            goto L_0x00e2
        L_0x0054:
            r0 = move-exception
            kj2.d r10 = kj2.C117407d.INSTANCE
            r11 = 99
            r13 = 39
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            long r10 = r1.freeMemory()
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r12
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            long r14 = r1.totalMemory()
            long r14 = r14 / r12
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r1[r9] = r12
            java.lang.Long r12 = java.lang.Long.valueOf(r10)
            r1[r6] = r12
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            r1[r2] = r6
            r2 = 4
            long r14 = r14 - r10
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            r1[r2] = r6
            r2 = 5
            java.lang.String r0 = r0.getMessage()
            r1[r2] = r0
            java.lang.String r0 = "%s index:%s memoryInfo avail/total, dalvik[%dk, %dk, user:%dk] Error[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r1)
            f40.C86709a0.m107528h()
            f40.e r0 = f40.C86709a0.m107523b()
            int r0 = r0.mo121110g()
            com.tencent.p014mm.booter.C114716m.m161361b(r3, r0)
            goto L_0x00e1
        L_0x00b0:
            r0 = move-exception
            kj2.d r10 = kj2.C117407d.INSTANCE
            r11 = 99
            r13 = 38
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r1[r9] = r2
            java.lang.String r0 = r0.getMessage()
            r1[r6] = r0
            java.lang.String r0 = "%s index:%s Resp fromProtoBuf failed e[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r1)
            f40.C86709a0.m107528h()
            f40.e r0 = f40.C86709a0.m107523b()
            int r0 = r0.mo121110g()
            com.tencent.p014mm.booter.C114716m.m161361b(r3, r0)
        L_0x00e1:
            r5 = r7
        L_0x00e2:
            if (r5 != 0) goto L_0x00e5
            return r4
        L_0x00e5:
            kj2.d r10 = kj2.C117407d.INSTANCE
            r11 = 99
            r13 = 20
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
            pc0.e0$$e r1 = new pc0.e0$$e
            pc0.e0 r2 = r8.f352730d
            r4 = 1
            pc0.e0$$f$a r6 = new pc0.e0$$f$a
            r6.<init>(r3)
            r7 = 0
            r3 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0103:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pc0.e0$$f.mo72839G0(java.util.Queue):boolean");
    }

    public String toString() {
        return "LightPush[" + hashCode() + "]";
    }
}
