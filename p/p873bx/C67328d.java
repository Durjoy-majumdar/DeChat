package p873bx;

import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import gy3.C87412m;
import java.util.HashMap;
import pc0.C77068x;

/* renamed from: bx.d */
public final class C67328d {

    /* renamed from: a */
    public static final C67328d f193168a = new C67328d();

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r1 > 0) goto L_0x0032;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m79664b(int r10, com.tencent.p014mm.storage.C72963f4 r11, int r12) {
        /*
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r11, r0)
            pc0.x r0 = pc0.C77068x.f225120a
            java.util.HashMap<java.lang.Long, pc0.x$a> r0 = pc0.C77068x.f225121b
            monitor-enter(r0)
            long r1 = r11.getMsgId()     // Catch:{ all -> 0x00c0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x00c0 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x00c0 }
            pc0.x$a r1 = (pc0.C77068x.C77069a) r1     // Catch:{ all -> 0x00c0 }
            r2 = -1
            if (r1 == 0) goto L_0x001f
            long r4 = r1.f225124c     // Catch:{ all -> 0x00c0 }
            goto L_0x0020
        L_0x001f:
            r4 = r2
        L_0x0020:
            monitor-exit(r0)
            r6 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0031
            long r1 = eb0.C31543z5.m39453c()
            long r1 = r1 - r4
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r1 = r6
        L_0x0032:
            java.lang.String r3 = r11.getContent()
            java.lang.String r4 = r11.mo108775z2()
            com.tencent.mm.message.l$b r3 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r3, r4)
            if (r3 == 0) goto L_0x0043
            int r3 = r3.f195582i
            long r6 = (long) r3
        L_0x0043:
            int r3 = r11.getType()
            int r3 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85061c(r3)
            com.tencent.mm.autogen.mmdata.rpt.MsgRevokeReportStruct r4 = new com.tencent.mm.autogen.mmdata.rpt.MsgRevokeReportStruct
            r4.<init>()
            long r8 = (long) r10
            r4.f194277d = r8
            long r8 = r11.mo108774y2()
            r4.f194278e = r8
            r4.f194279f = r1
            long r1 = (long) r12
            r4.f194280g = r1
            long r1 = (long) r3
            r4.f194281h = r1
            r4.f194282i = r6
            r4.mo86054n()
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r1 = r4.mo1004j()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r12[r2] = r1
            java.lang.String r1 = r4.mo1006q()
            java.lang.String r3 = "struct.toShowString()"
            gy3.C87412m.m108593f(r1, r3)
            java.lang.String r3 = "\r\n"
            java.lang.String r4 = " "
            java.lang.String r1 = z04.C112551y.m153814n(r1, r3, r4, r2)
            r2 = 1
            r12[r2] = r1
            java.lang.String r1 = "MMRevoke.Report"
            java.lang.String r3 = "report%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r12)
            if (r10 == r2) goto L_0x00bf
            monitor-enter(r0)
            long r1 = r11.getMsgId()     // Catch:{ all -> 0x00bc }
            java.lang.Long r10 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x00bc }
            r0.remove(r10)     // Catch:{ all -> 0x00bc }
            java.lang.String r10 = "MMRevoke.RevokeMsgManager"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            r12.<init>()     // Catch:{ all -> 0x00bc }
            java.lang.String r1 = "removeMsg() called msg:"
            r12.append(r1)     // Catch:{ all -> 0x00bc }
            long r1 = r11.getMsgId()     // Catch:{ all -> 0x00bc }
            r12.append(r1)     // Catch:{ all -> 0x00bc }
            java.lang.String r11 = r12.toString()     // Catch:{ all -> 0x00bc }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)     // Catch:{ all -> 0x00bc }
            rx3.b0 r10 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00bc }
            monitor-exit(r0)
            goto L_0x00bf
        L_0x00bc:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L_0x00bf:
            return
        L_0x00c0:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p873bx.C67328d.m79664b(int, com.tencent.mm.storage.f4, int):void");
    }

    /* renamed from: a */
    public final void mo91458a(C72963f4 f4Var, int i) {
        C77068x.C77069a aVar;
        C87412m.m108594g(f4Var, "msg");
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(f4Var.getMsgId());
        C77068x xVar = C77068x.f225120a;
        HashMap<Long, C77068x.C77069a> hashMap = C77068x.f225121b;
        synchronized (hashMap) {
            aVar = hashMap.get(Long.valueOf(b002.getMsgId()));
        }
        boolean z = true;
        if (aVar == null || !aVar.f225125d) {
            z = false;
        }
        m79664b(z ? 3 : 2, b002, i);
    }
}
