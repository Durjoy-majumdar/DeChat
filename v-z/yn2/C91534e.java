package yn2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import f40.C86709a0;
import java.util.HashSet;
import java.util.Iterator;
import lu3.C34379c;
import qh3.C89660a;
import qh3.C89661b;
import qh3.C89664c;
import qh3.C89667e;
import zt3.C119157j;

/* renamed from: yn2.e */
public class C91534e implements C89661b.C89662a<Boolean>, Runnable {

    /* renamed from: e */
    public static final C91534e f262355e = new C91534e();

    /* renamed from: f */
    public static final C89661b.C89663b<Boolean> f262356f;

    /* renamed from: d */
    public C34379c<?> f262357d = null;

    static {
        Class<Boolean> cls = Boolean.class;
        f262356f = new C89664c(C86709a0.m107534r().mo123993a(0, cls), new C89667e(C86709a0.m107534r().mo123993a(1, cls)));
    }

    /* renamed from: b */
    public static void m114871b() {
        HashSet<C89661b.C89662a<T>> hashSet;
        SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.CleanSnsDB");
        C89660a aVar = (C89660a) f262356f;
        synchronized (aVar.f257892g) {
            hashSet = aVar.f257891f;
            aVar.f257891f = new HashSet<>();
        }
        Iterator<C89661b.C89662a<T>> it = hashSet.iterator();
        while (it.hasNext()) {
            aVar.mo123988e(it.next());
        }
        C91534e eVar = f262355e;
        C34379c<?> cVar = eVar.f262357d;
        if (cVar != null) {
            cVar.cancel(false);
            eVar.f262357d = null;
        }
        SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.CleanSnsDB");
    }

    /* renamed from: a */
    public void mo123994a(C89661b.C89663b bVar, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onChange", "com.tencent.mm.plugin.sns.CleanSnsDB");
        SnsMethodCalculate.markStartTimeMs("onChange", "com.tencent.mm.plugin.sns.CleanSnsDB");
        if (!((Boolean) obj).booleanValue()) {
            C34379c<?> cVar = this.f262357d;
            if (cVar != null) {
                cVar.cancel(false);
                this.f262357d = null;
            }
        } else if (this.f262357d == null) {
            this.f262357d = ((C119157j) C119157j.f356862d).mo183878i(this, 360000);
        }
        SnsMethodCalculate.markEndTimeMs("onChange", "com.tencent.mm.plugin.sns.CleanSnsDB");
        SnsMethodCalculate.markEndTimeMs("onChange", "com.tencent.mm.plugin.sns.CleanSnsDB");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a3 A[Catch:{ RuntimeException -> 0x01b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x016f A[Catch:{ RuntimeException -> 0x01b4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r29 = this;
            java.lang.String r0 = "SnsMicroMsg.db"
            java.lang.String r1 = "MicroMsg.CleanSnsDB"
            java.lang.String r2 = "run"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.CleanSnsDB"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r4 = 0
            oa1.d r5 = oa1.C117731d.m166007c()     // Catch:{ RuntimeException -> 0x01b7 }
            java.lang.String r6 = "clicfg_clean_delete_oversize_sns_db"
            java.lang.String r7 = "0"
            r8 = 1
            java.lang.String r5 = r5.mo182444f(r6, r7, r4, r8)     // Catch:{ RuntimeException -> 0x01b7 }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ RuntimeException -> 0x01b7 }
            if (r5 <= 0) goto L_0x0022
            r5 = 1
            goto L_0x0023
        L_0x0022:
            r5 = 0
        L_0x0023:
            if (r5 == 0) goto L_0x01bf
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x01b7 }
            r5.<init>()     // Catch:{ RuntimeException -> 0x01b7 }
            f40.C86709a0.m107528h()     // Catch:{ RuntimeException -> 0x01b7 }
            f40.o r6 = f40.C86709a0.m107535s()     // Catch:{ RuntimeException -> 0x01b7 }
            java.lang.String r6 = r6.f251807e     // Catch:{ RuntimeException -> 0x01b4 }
            r5.append(r6)     // Catch:{ RuntimeException -> 0x01b7 }
            r5.append(r0)     // Catch:{ RuntimeException -> 0x01b7 }
            java.lang.String r5 = r5.toString()     // Catch:{ RuntimeException -> 0x01b7 }
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.String r6 = r5.getPath()     // Catch:{ RuntimeException -> 0x01b4 }
            if (r6 == 0) goto L_0x0061
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r4, r4)     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.String r7 = r5.getPath()     // Catch:{ RuntimeException -> 0x01b4 }
            boolean r7 = r7.equals(r6)     // Catch:{ RuntimeException -> 0x01b4 }
            if (r7 != 0) goto L_0x0061
            android.net.Uri$Builder r5 = r5.buildUpon()     // Catch:{ RuntimeException -> 0x01b4 }
            android.net.Uri$Builder r5 = r5.path(r6)     // Catch:{ RuntimeException -> 0x01b4 }
            android.net.Uri r5 = r5.build()     // Catch:{ RuntimeException -> 0x01b4 }
        L_0x0061:
            com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ RuntimeException -> 0x01b4 }
            r7 = 0
            com.tencent.mm.vfs.f0$h r5 = r6.mo177799l(r5, r7)     // Catch:{ RuntimeException -> 0x01b4 }
            boolean r6 = r5.mo177810a()     // Catch:{ RuntimeException -> 0x01b4 }
            if (r6 != 0) goto L_0x006f
            goto L_0x0079
        L_0x006f:
            com.tencent.mm.vfs.FileSystem$c r6 = r5.f348991a     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.String r5 = r5.f348992b     // Catch:{ RuntimeException -> 0x01b4 }
            com.tencent.mm.vfs.b0 r5 = r6.mo119945q(r5)     // Catch:{ RuntimeException -> 0x01b4 }
            if (r5 != 0) goto L_0x007c
        L_0x0079:
            r5 = 0
            goto L_0x007e
        L_0x007c:
            long r5 = r5.f250473c     // Catch:{ RuntimeException -> 0x01b4 }
        L_0x007e:
            oa1.d r11 = oa1.C117731d.m166007c()     // Catch:{ RuntimeException -> 0x01b7 }
            java.lang.String r12 = "clicfg_clean_db_count"
            r13 = 50000(0xc350, double:2.47033E-319)
            java.lang.String r15 = java.lang.Long.toString(r13)     // Catch:{ RuntimeException -> 0x01b7 }
            java.lang.String r11 = r11.mo182444f(r12, r15, r4, r8)     // Catch:{ RuntimeException -> 0x01b7 }
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r11, r13)     // Catch:{ RuntimeException -> 0x01b7 }
            os2.e0 r13 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()     // Catch:{ RuntimeException -> 0x01b7 }
            long r13 = r13.h30()     // Catch:{ RuntimeException -> 0x01b7 }
            r16 = 4
            r9 = 5
            r10 = 2
            int r19 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r19 <= 0) goto L_0x016f
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ RuntimeException -> 0x01b7 }
            r12 = 150(0x96, float:2.1E-43)
            r15 = 101(0x65, float:1.42E-43)
            r11.mo175911u(r12, r15)     // Catch:{ RuntimeException -> 0x01b7 }
            mr2.a r12 = com.tencent.p014mm.plugin.sns.model.C94866e1.Sx0()     // Catch:{ RuntimeException -> 0x01b7 }
            r12.mo139304a()     // Catch:{ RuntimeException -> 0x01b7 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x01b7 }
            r12.<init>()     // Catch:{ RuntimeException -> 0x01b7 }
            f40.C86709a0.m107528h()     // Catch:{ RuntimeException -> 0x01b7 }
            f40.o r15 = f40.C86709a0.m107535s()     // Catch:{ RuntimeException -> 0x01b7 }
            java.lang.String r15 = r15.f251807e     // Catch:{ RuntimeException -> 0x01b4 }
            r12.append(r15)     // Catch:{ RuntimeException -> 0x01b7 }
            r12.append(r0)     // Catch:{ RuntimeException -> 0x01b7 }
            java.lang.String r0 = r12.toString()     // Catch:{ RuntimeException -> 0x01b7 }
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.String r12 = r0.getPath()     // Catch:{ RuntimeException -> 0x01b4 }
            if (r12 == 0) goto L_0x00ef
            java.lang.String r12 = com.tencent.p014mm.vfs.C116299g2.m163855k(r12, r4, r4)     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.String r15 = r0.getPath()     // Catch:{ RuntimeException -> 0x01b4 }
            boolean r15 = r15.equals(r12)     // Catch:{ RuntimeException -> 0x01b4 }
            if (r15 != 0) goto L_0x00ef
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ RuntimeException -> 0x01b4 }
            android.net.Uri$Builder r0 = r0.path(r12)     // Catch:{ RuntimeException -> 0x01b4 }
            android.net.Uri r0 = r0.build()     // Catch:{ RuntimeException -> 0x01b4 }
        L_0x00ef:
            com.tencent.mm.vfs.f0 r12 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ RuntimeException -> 0x01b4 }
            com.tencent.mm.vfs.f0$h r0 = r12.mo177799l(r0, r7)     // Catch:{ RuntimeException -> 0x01b4 }
            boolean r7 = r0.mo177810a()     // Catch:{ RuntimeException -> 0x01b4 }
            if (r7 != 0) goto L_0x00fc
            goto L_0x0106
        L_0x00fc:
            com.tencent.mm.vfs.FileSystem$c r7 = r0.f348991a     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.String r0 = r0.f348992b     // Catch:{ RuntimeException -> 0x01b4 }
            com.tencent.mm.vfs.b0 r0 = r7.mo119945q(r0)     // Catch:{ RuntimeException -> 0x01b4 }
            if (r0 != 0) goto L_0x010b
        L_0x0106:
            r17 = r5
            r4 = 0
            goto L_0x010f
        L_0x010b:
            r17 = r5
            long r4 = r0.f250473c     // Catch:{ RuntimeException -> 0x01b4 }
        L_0x010f:
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()     // Catch:{ RuntimeException -> 0x01b4 }
            long r27 = r0.h30()     // Catch:{ RuntimeException -> 0x01b4 }
            r21 = 150(0x96, double:7.4E-322)
            r23 = 102(0x66, double:5.04E-322)
            long r25 = r13 - r27
            r20 = r11
            r20.mo175913w(r21, r23, r25)     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ RuntimeException -> 0x01b4 }
            r7 = 0
            r0[r7] = r6     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.Long r6 = java.lang.Long.valueOf(r17)     // Catch:{ RuntimeException -> 0x01b4 }
            r0[r8] = r6     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch:{ RuntimeException -> 0x01b4 }
            r0[r10] = r6     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.Long r6 = java.lang.Long.valueOf(r4)     // Catch:{ RuntimeException -> 0x01b4 }
            r12 = 3
            r0[r12] = r6     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.Long r6 = java.lang.Long.valueOf(r27)     // Catch:{ RuntimeException -> 0x01b4 }
            r0[r16] = r6     // Catch:{ RuntimeException -> 0x01b4 }
            r6 = 22134(0x5676, float:3.1016E-41)
            r11.mo160131h(r6, r0)     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.String r0 = "cleanSnsDb:%b, snsCount:%s, newSnsCount:%s, snsDbSize:%s, newSnsDbSize:%s"
            java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ RuntimeException -> 0x01b4 }
            r7 = 0
            r6[r7] = r9     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ RuntimeException -> 0x01b4 }
            r6[r8] = r9     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.Long r8 = java.lang.Long.valueOf(r27)     // Catch:{ RuntimeException -> 0x01b4 }
            r6[r10] = r8     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r17)     // Catch:{ RuntimeException -> 0x01b4 }
            r9 = 3
            r6[r9] = r8     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r4)     // Catch:{ RuntimeException -> 0x01b4 }
            r6[r16] = r4     // Catch:{ RuntimeException -> 0x01b4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r6)     // Catch:{ RuntimeException -> 0x01b4 }
            goto L_0x01bf
        L_0x016f:
            r17 = r5
            java.lang.String r0 = "cleanSnsDb:%b, snsCount:%s, snsDbSize:%s"
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ RuntimeException -> 0x01b4 }
            r6 = 0
            r5[r6] = r4     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.Long r4 = java.lang.Long.valueOf(r13)     // Catch:{ RuntimeException -> 0x01b4 }
            r5[r8] = r4     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r17)     // Catch:{ RuntimeException -> 0x01b4 }
            r5[r10] = r4     // Catch:{ RuntimeException -> 0x01b4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r5)     // Catch:{ RuntimeException -> 0x01b4 }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ RuntimeException -> 0x01b4 }
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ RuntimeException -> 0x01b4 }
            r4[r5] = r6     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.Long r6 = java.lang.Long.valueOf(r17)     // Catch:{ RuntimeException -> 0x01b4 }
            r4[r8] = r6     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch:{ RuntimeException -> 0x01b4 }
            r4[r10] = r6     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ RuntimeException -> 0x01b4 }
            r7 = 3
            r4[r7] = r6     // Catch:{ RuntimeException -> 0x01b4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ RuntimeException -> 0x01b4 }
            r4[r16] = r6     // Catch:{ RuntimeException -> 0x01b4 }
            r5 = 22134(0x5676, float:3.1016E-41)
            r0.mo160131h(r5, r4)     // Catch:{ RuntimeException -> 0x01b4 }
            goto L_0x01bf
        L_0x01b4:
            r0 = move-exception
            r4 = 0
            goto L_0x01b8
        L_0x01b7:
            r0 = move-exception
        L_0x01b8:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "Cannot clean sns db"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r5, r4)
        L_0x01bf:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yn2.C91534e.run():void");
    }
}
