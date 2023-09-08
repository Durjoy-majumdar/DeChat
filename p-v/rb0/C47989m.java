package rb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import ob0.C11385n;
import te3.d45;

/* renamed from: rb0.m */
public class C47989m implements C11385n {

    /* renamed from: d */
    public Object f128704d = new Object();

    /* renamed from: e */
    public C47991b f128705e = new C47991b((C47990a) null);

    /* renamed from: f */
    public boolean f128706f = false;

    /* renamed from: g */
    public Set<String> f128707g = new HashSet();

    /* renamed from: h */
    public LinkedList<C47992c> f128708h = new LinkedList<>();

    /* renamed from: rb0.m$b */
    public static class C47991b {

        /* renamed from: a */
        public boolean f128709a = false;

        /* renamed from: b */
        public String f128710b;

        /* renamed from: c */
        public String f128711c;

        /* renamed from: d */
        public int f128712d;

        public C47991b(C47990a aVar) {
        }

        public String toString() {
            return "BizKFGuideAppBrandInfo{" + this.f128710b + ", " + this.f128711c + ", " + this.f128712d + ", " + this.f128709a + "}";
        }
    }

    /* renamed from: rb0.m$c */
    public interface C47992c {
        /* renamed from: L6 */
        String mo66779L6();

        /* renamed from: g5 */
        void mo66780g5(LinkedList<d45> linkedList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo72774a(rb0.C47989m.C47992c r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f128704d
            monitor-enter(r0)
            java.util.LinkedList<rb0.m$c> r1 = r5.f128708h     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.contains(r6)     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x0050
            java.util.LinkedList<rb0.m$c> r1 = r5.f128708h     // Catch:{ all -> 0x0052 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0052 }
        L_0x0011:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x004b
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0052 }
            rb0.m$c r2 = (rb0.C47989m.C47992c) r2     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0011
            if (r2 == 0) goto L_0x0011
            java.lang.String r3 = r6.mo66779L6()     // Catch:{ all -> 0x0052 }
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = r2.mo66779L6()     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)     // Catch:{ all -> 0x0052 }
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0011
            java.lang.String r1 = "MicroMsg.BizKFService"
            java.lang.String r2 = "the same callbacker %s, return"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0052 }
            r4 = 0
            java.lang.String r6 = r6.mo66779L6()     // Catch:{ all -> 0x0052 }
            r3[r4] = r6     // Catch:{ all -> 0x0052 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)     // Catch:{ all -> 0x0052 }
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            return
        L_0x004b:
            java.util.LinkedList<rb0.m$c> r1 = r5.f128708h     // Catch:{ all -> 0x0052 }
            r1.add(r6)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            return
        L_0x0052:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rb0.C47989m.mo72774a(rb0.m$c):void");
    }

    /* renamed from: b */
    public final void mo72775b(LinkedList<d45> linkedList) {
        synchronized (this.f128704d) {
            ArrayList arrayList = new ArrayList(this.f128708h);
            for (int i = 0; i < arrayList.size(); i++) {
                C47992c cVar = (C47992c) arrayList.get(i);
                if (cVar != null) {
                    cVar.mo66780g5(linkedList);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo72776c(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.BizKFService", "doKFGetBindList null brandname");
            return;
        }
        C86709a0.m107529k().f251779b.mo123460f(new C48002q0(str, str2));
        Log.m105927v("MicroMsg.BizKFService", "doKFGetBindList %s, %d", str, Integer.valueOf(this.f128708h.size()));
    }

    /* renamed from: d */
    public void mo72777d(String str, String str2, int i) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            Log.m105921e("MicroMsg.BizKFService", "doKFGetDefaultList error args, %s, %s", str, str2);
        } else if (((HashSet) this.f128707g).contains(str2)) {
            Log.m105925i("MicroMsg.BizKFService", "doKFGetInfoList: same is running, %s", str2);
        } else {
            ((HashSet) this.f128707g).add(str2);
            LinkedList linkedList = new LinkedList();
            linkedList.add(str2);
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(Integer.valueOf(i));
            C48005s0 s0Var = new C48005s0(str, linkedList, linkedList2);
            s0Var.f128764g = str2;
            C86709a0.m107529k().f251779b.mo123460f(s0Var);
            Log.m105925i("MicroMsg.BizKFService", "doKFGetInfoList %s, %s, %d, kfType: %d", str, str2, Integer.valueOf(this.f128708h.size()), Integer.valueOf(i));
        }
    }

    /* renamed from: e */
    public void mo72778e(C47992c cVar) {
        synchronized (this.f128704d) {
            if (this.f128708h.contains(cVar)) {
                this.f128708h.remove(cVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0091, code lost:
        r11 = r8.f127056b.f127083a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r22, int r23, java.lang.String r24, ob0.C117747y r25) {
        /*
            r21 = this;
            r0 = r21
            java.lang.Class<ln.g> r1 = p196ln.C76706g.class
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            r5 = 0
            r3[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r23)
            r6 = 1
            r3[r6] = r4
            r4 = 2
            r3[r4] = r24
            java.lang.String r7 = "MicroMsg.BizKFService"
            java.lang.String r8 = "onSceneEnd errType = %s, errCode = %s, errMsg = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r3)
            r3 = 0
            if (r25 != 0) goto L_0x002b
            java.lang.String r1 = "scene == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            r0.mo72775b(r3)
            return
        L_0x002b:
            r8 = 675(0x2a3, float:9.46E-43)
            java.lang.String r9 = "scene.getType() = %s"
            if (r22 != 0) goto L_0x0273
            if (r23 == 0) goto L_0x0035
            goto L_0x0273
        L_0x0035:
            java.lang.Object[] r10 = new java.lang.Object[r6]
            int r11 = r25.getType()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r5] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r10)
            di3.d r9 = di3.C86312j.m106911c(r1)
            ln.g r9 = (p196ln.C76706g) r9
            ln.n r9 = r9.mo106832eg()
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            long r19 = java.lang.System.currentTimeMillis()
            int r11 = r25.getType()
            r12 = 672(0x2a0, float:9.42E-43)
            java.lang.String r13 = "resp is null, type = %s"
            if (r11 != r12) goto L_0x0078
            r1 = r25
            rb0.r0 r1 = (rb0.C12968r0) r1
            java.lang.Object[] r1 = new java.lang.Object[r6]
            int r2 = r25.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r5] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r13, r1)
            r0.mo72775b(r3)
            return
        L_0x0078:
            int r11 = r25.getType()
            java.lang.String r12 = "empty workers"
            if (r11 != r8) goto L_0x0157
            java.util.Set<java.lang.String> r8 = r0.f128707g
            r15 = r25
            rb0.s0 r15 = (rb0.C48005s0) r15
            java.lang.String r11 = r15.f128764g
            java.util.HashSet r8 = (java.util.HashSet) r8
            r8.remove(r11)
            ob0.c r8 = r15.f128762e
            if (r8 == 0) goto L_0x009a
            ob0.c$d r11 = r8.f127056b
            pe3.a r11 = r11.f127083a
            if (r11 == 0) goto L_0x009a
            te3.ml2 r11 = (te3.C50420ml2) r11
            goto L_0x009b
        L_0x009a:
            r11 = r3
        L_0x009b:
            if (r11 != 0) goto L_0x00b2
            java.lang.Object[] r1 = new java.lang.Object[r6]
            int r2 = r25.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r5] = r2
            java.lang.String r2 = "KFGetInfoList resp is null, type = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r2, r1)
            r0.mo72775b(r3)
            return
        L_0x00b2:
            if (r8 == 0) goto L_0x00bd
            ob0.c$d r8 = r8.f127056b
            pe3.a r8 = r8.f127083a
            if (r8 == 0) goto L_0x00bd
            te3.ml2 r8 = (te3.C50420ml2) r8
            goto L_0x00be
        L_0x00bd:
            r8 = r3
        L_0x00be:
            java.util.LinkedList<te3.d45> r8 = r8.f138099d
            if (r8 == 0) goto L_0x0150
            int r11 = r8.size()
            if (r11 > 0) goto L_0x00ca
            goto L_0x0150
        L_0x00ca:
            java.util.Iterator r3 = r8.iterator()
        L_0x00ce:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x014d
            java.lang.Object r11 = r3.next()
            r14 = r11
            te3.d45 r14 = (te3.d45) r14
            r11 = 4
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.String r12 = r14.f132111d
            r11[r5] = r12
            java.lang.String r12 = r15.f128764g
            r11[r6] = r12
            int r12 = r14.f132114g
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r4] = r12
            java.lang.String r12 = r14.f132112e
            r11[r2] = r12
            java.lang.String r12 = "onScenEnd: workers=%s, tag=%s, kfType: %d, headUrl: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r12, r11)
            rb0.l r13 = new rb0.l
            java.lang.String r12 = r14.f132111d
            java.lang.String r11 = r15.f128763f
            java.lang.String r4 = r14.f132112e
            java.lang.String r6 = r14.f132113f
            int r2 = r14.f132114g
            r16 = r11
            r11 = r13
            r5 = r13
            r13 = r16
            r22 = r3
            r3 = r14
            r14 = r4
            r4 = r15
            r15 = r6
            r16 = r2
            r17 = r19
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r10.add(r5)
            if (r9 == 0) goto L_0x0145
            com.tencent.mm.modelavatar.n r2 = new com.tencent.mm.modelavatar.n
            r2.<init>()
            java.lang.String r5 = r3.f132111d
            r2.f195728a = r5
            java.lang.String r5 = r3.f132112e
            r2.f195731d = r5
            r5 = 0
            r2.f195733f = r5
            r5 = 3
            r2.f195729b = r5
            r5 = r9
            com.tencent.mm.modelavatar.o r5 = (com.tencent.p014mm.modelavatar.C68098o) r5
            r5.mo93608Yt(r2)
            di3.d r2 = di3.C86312j.m106911c(r1)
            ln.g r2 = (p196ln.C76706g) r2
            ln.j r2 = r2.mo106847uz()
            java.lang.String r3 = r3.f132111d
            com.tencent.mm.modelavatar.g r2 = (com.tencent.p014mm.modelavatar.C68082g) r2
            r2.mo93575b(r3)
        L_0x0145:
            r3 = r22
            r15 = r4
            r2 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            goto L_0x00ce
        L_0x014d:
            r3 = r8
            goto L_0x01fc
        L_0x0150:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r12)
            r0.mo72775b(r3)
            return
        L_0x0157:
            int r2 = r25.getType()
            r4 = 674(0x2a2, float:9.44E-43)
            if (r2 != r4) goto L_0x01fc
            r2 = r25
            rb0.q0 r2 = (rb0.C48002q0) r2
            ob0.c r4 = r2.f128754e
            if (r4 == 0) goto L_0x0170
            ob0.c$d r5 = r4.f127056b
            pe3.a r5 = r5.f127083a
            if (r5 == 0) goto L_0x0170
            te3.kl2 r5 = (te3.C50146kl2) r5
            goto L_0x0171
        L_0x0170:
            r5 = r3
        L_0x0171:
            if (r5 != 0) goto L_0x0188
            r5 = 1
            java.lang.Object[] r1 = new java.lang.Object[r5]
            int r2 = r25.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r1[r4] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r13, r1)
            r0.mo72775b(r3)
            return
        L_0x0188:
            if (r4 == 0) goto L_0x0193
            ob0.c$d r4 = r4.f127056b
            pe3.a r4 = r4.f127083a
            if (r4 == 0) goto L_0x0193
            te3.kl2 r4 = (te3.C50146kl2) r4
            goto L_0x0194
        L_0x0193:
            r4 = r3
        L_0x0194:
            java.util.LinkedList<te3.d45> r4 = r4.f136880d
            if (r4 == 0) goto L_0x01f5
            int r5 = r4.size()
            if (r5 > 0) goto L_0x019f
            goto L_0x01f5
        L_0x019f:
            java.util.Iterator r3 = r4.iterator()
        L_0x01a3:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x01f3
            java.lang.Object r5 = r3.next()
            te3.d45 r5 = (te3.d45) r5
            rb0.l r6 = new rb0.l
            java.lang.String r12 = r5.f132111d
            java.lang.String r13 = r2.f128755f
            java.lang.String r14 = r5.f132112e
            java.lang.String r15 = r5.f132113f
            int r8 = r5.f132114g
            r11 = r6
            r16 = r8
            r17 = r19
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r10.add(r6)
            if (r9 == 0) goto L_0x01a3
            com.tencent.mm.modelavatar.n r6 = new com.tencent.mm.modelavatar.n
            r6.<init>()
            java.lang.String r8 = r5.f132111d
            r6.f195728a = r8
            java.lang.String r8 = r5.f132112e
            r6.f195731d = r8
            r8 = 0
            r6.f195733f = r8
            r8 = 3
            r6.f195729b = r8
            r11 = r9
            com.tencent.mm.modelavatar.o r11 = (com.tencent.p014mm.modelavatar.C68098o) r11
            r11.mo93608Yt(r6)
            di3.d r6 = di3.C86312j.m106911c(r1)
            ln.g r6 = (p196ln.C76706g) r6
            ln.j r6 = r6.mo106847uz()
            java.lang.String r5 = r5.f132111d
            com.tencent.mm.modelavatar.g r6 = (com.tencent.p014mm.modelavatar.C68082g) r6
            r6.mo93575b(r5)
            goto L_0x01a3
        L_0x01f3:
            r3 = r4
            goto L_0x01fc
        L_0x01f5:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r12)
            r0.mo72775b(r3)
            return
        L_0x01fc:
            rb0.n r1 = rb0.C48009v0.Hx0()
            r1.getClass()
            java.lang.String r2 = "MicroMsg.BizKFStorage"
            int r4 = r10.size()
            java.lang.String r5 = "insertOrUpdateBizKFs %d"
            if (r4 > 0) goto L_0x0216
            java.lang.String r1 = "null kfs"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            r1 = 1
            r6 = 0
            r10 = 0
            goto L_0x0264
        L_0x0216:
            r8 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r1.f128717d
            boolean r6 = r4 instanceof zh3.C91753f
            if (r6 == 0) goto L_0x022c
            zh3.f r4 = (zh3.C91753f) r4
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            long r8 = r6.getId()
            long r8 = r4.beginTransaction(r8)
        L_0x022c:
            java.util.Iterator r4 = r10.iterator()
            r6 = 0
        L_0x0231:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0248
            java.lang.Object r10 = r4.next()
            rb0.l r10 = (rb0.C47987l) r10
            if (r10 == 0) goto L_0x0231
            boolean r10 = r1.replace(r10)
            if (r10 == 0) goto L_0x0231
            int r6 = r6 + 1
            goto L_0x0231
        L_0x0248:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r1.f128717d
            boolean r1 = r1 instanceof zh3.C91753f
            if (r1 == 0) goto L_0x0257
            f40.o r1 = f40.C86709a0.m107535s()
            zh3.f r1 = r1.f251811i
            r1.endTransaction(r8)
        L_0x0257:
            r1 = 1
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r10 = 0
            r4[r10] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r4)
        L_0x0264:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r1[r10] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r5, r1)
            r0.mo72775b(r3)
            return
        L_0x0273:
            r1 = 1
            r10 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r25.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r10] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r1)
            r0.mo72775b(r3)
            int r1 = r25.getType()
            if (r1 != r8) goto L_0x029a
            java.util.Set<java.lang.String> r1 = r0.f128707g
            r2 = r25
            rb0.s0 r2 = (rb0.C48005s0) r2
            java.lang.String r2 = r2.f128764g
            java.util.HashSet r1 = (java.util.HashSet) r1
            r1.remove(r2)
        L_0x029a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rb0.C47989m.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
