package com.tencent.p014mm.matrix.test;

import android.content.BroadcastReceiver;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32228q;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/matrix/test/PushKillerTest;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-performance_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.matrix.test.PushKillerTest */
public final class PushKillerTest extends BroadcastReceiver {

    /* renamed from: a */
    public static final PushKillerTest f237880a = new PushKillerTest();

    /* renamed from: com.tencent.mm.matrix.test.PushKillerTest$a */
    public static final class C1278a extends C87413o implements C32228q<Integer, String, Integer, C13598b0> {

        /* renamed from: d */
        public static final C1278a f10366d = new C1278a();

        public C1278a() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj).intValue();
            String str = (String) obj2;
            int intValue2 = ((Number) obj3).intValue();
            if (intValue == 1) {
                Log.m105918d("MicroMsg.PushKiller", "kill [" + intValue2 + '-' + str + "] success");
            } else if (intValue == 2) {
                Log.m105918d("MicroMsg.PushKiller", "kill [" + intValue2 + '-' + str + "] rescued");
            } else if (intValue == 3) {
                Log.m105918d("MicroMsg.PushKiller", "kill [" + intValue2 + '-' + str + "] canceled");
            } else if (intValue == 4) {
                Log.m105918d("MicroMsg.PushKiller", "kill [" + intValue2 + '-' + str + "] not found");
            }
            return C13598b0.f38549a;
        }
    }

    private PushKillerTest() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x008e A[EDGE_INSN: B:39:0x008e->B:29:0x008e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            java.lang.String r9 = "MicroMsg.PushKiller"
            java.lang.String r0 = "onReceive !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r0)
            r0 = 0
            if (r10 == 0) goto L_0x000f
            java.lang.String r10 = r10.getAction()
            goto L_0x0010
        L_0x000f:
            r10 = r0
        L_0x0010:
            java.lang.String r1 = "com.tencent.matrix.kill.lru"
            boolean r10 = gy3.C87412m.m108589b(r10, r1)
            if (r10 == 0) goto L_0x00d5
            boolean r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isPushProcess()
            if (r10 == 0) goto L_0x00d5
            java.lang.String r10 = "kill !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r10)
            com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor r9 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235421k
            com.tencent.mm.matrix.test.PushKillerTest$a r10 = com.tencent.p014mm.matrix.test.PushKillerTest.C1278a.f10366d
            r9.getClass()
            java.lang.String r1 = "killedResult"
            gy3.C87412m.m108594g(r10, r1)
            com.tencent.matrix.lifecycle.supervisor.SupervisorService$a r1 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f235443o
            r1.getClass()
            com.tencent.matrix.lifecycle.supervisor.SupervisorService r1 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f235442n
            if (r1 == 0) goto L_0x00d5
            r9.getClass()
            com.tencent.matrix.lifecycle.supervisor.l r9 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235414d
            r2 = 0
            if (r9 == 0) goto L_0x00c9
            boolean r9 = r9.f235498a
            r3 = 1
            if (r3 == r9) goto L_0x0047
            goto L_0x00c9
        L_0x0047:
            boolean r9 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f235440i
            if (r9 == 0) goto L_0x00c1
            com.tencent.matrix.lifecycle.supervisor.SupervisorService r9 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f235442n
            if (r9 == 0) goto L_0x00b9
            r1.f235447g = r10
            java.util.concurrent.ConcurrentLinkedQueue r9 = r1.mo111990b()
            java.util.Iterator r9 = r9.iterator()
        L_0x0059:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x008d
            java.lang.Object r4 = r9.next()
            r5 = r4
            com.tencent.matrix.lifecycle.supervisor.ProcessToken r5 = (com.tencent.matrix.lifecycle.supervisor.ProcessToken) r5
            java.lang.String r6 = r5.f235427f
            java.lang.String r7 = p723vf.C90779e.m113846a(r1)
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x0089
            com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor r6 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235421k
            r6.getClass()
            com.tencent.matrix.lifecycle.supervisor.l r6 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235414d
            gy3.C87412m.m108591d(r6)
            java.util.List<java.lang.String> r6 = r6.f235500c
            java.lang.String r5 = r5.f235427f
            boolean r5 = r6.contains(r5)
            if (r5 != 0) goto L_0x0089
            r5 = 1
            goto L_0x008a
        L_0x0089:
            r5 = 0
        L_0x008a:
            if (r5 == 0) goto L_0x0059
            goto L_0x008e
        L_0x008d:
            r4 = r0
        L_0x008e:
            com.tencent.matrix.lifecycle.supervisor.ProcessToken r4 = (com.tencent.matrix.lifecycle.supervisor.ProcessToken) r4
            if (r4 == 0) goto L_0x00ab
            com.tencent.matrix.lifecycle.supervisor.h r9 = com.tencent.matrix.lifecycle.supervisor.C80481h.f235480f
            com.tencent.matrix.lifecycle.supervisor.h$a r9 = r9.mo112018c()
            java.lang.String r10 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f235441j
            java.lang.String r0 = r4.f235427f
            int r1 = r4.f235426e
            java.util.concurrent.ConcurrentHashMap r2 = r9.mo112021c()
            com.tencent.matrix.lifecycle.supervisor.g r3 = new com.tencent.matrix.lifecycle.supervisor.g
            r3.<init>(r10, r0, r1)
            r9.mo112020b(r2, r3)
            goto L_0x00d3
        L_0x00ab:
            r9 = 4
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.invoke(r9, r0, r1)
            goto L_0x00d3
        L_0x00b9:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "not initialized yet !"
            r9.<init>(r10)
            throw r9
        L_0x00c1:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "backgroundLruKill should only be called in supervisor"
            r9.<init>(r10)
            throw r9
        L_0x00c9:
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.String r10 = "Matrix.ProcessSupervisor.Service"
            java.lang.String r0 = "supervisor was disabled"
            p723vf.C118672d.m167352b(r10, r0, r9)
        L_0x00d3:
            rx3.b0 r9 = rx3.C13598b0.f38549a
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.matrix.test.PushKillerTest.onReceive(android.content.Context, android.content.Intent):void");
    }
}
