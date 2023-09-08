package p443as;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f62.C116805e1;
import p248ug.C37461n0;
import p676rl.C36332a;

/* renamed from: as.e */
public class C28122e implements C116805e1 {
    /* renamed from: N5 */
    public void mo55803N5(Object obj) {
        ((C36332a) ((C37461n0) C86312j.m106911c(C37461n0.class)).mo61108WF()).getClass();
        Log.m105925i("FunctionMsg.FunctionMsgEngine", "[afterSyncDoCmd] check time:%s", Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f4, code lost:
        cy3.C58003b.m67160a(r0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f7, code lost:
        throw r1;
     */
    /* renamed from: U4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo55804U4(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Class<ug.n0> r12 = p248ug.C37461n0.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            ug.n0 r12 = (p248ug.C37461n0) r12
            f62.h0 r12 = r12.mo61108WF()
            rl.a r12 = (p676rl.C36332a) r12
            r12.getClass()
            r12 = 1
            p676rl.C36332a.f96698b = r12
            boolean r0 = p676rl.C36332a.f96699c
            java.lang.String r1 = "FunctionMsg.FunctionMsgEngine"
            if (r0 == 0) goto L_0x00f8
            java.lang.String r0 = "[checkFromDb] begin!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.storage.r3 r0 = com.tencent.p014mm.storage.C30774r3.f82750d
            r0.getClass()
            zh3.f r2 = com.tencent.p014mm.storage.C30774r3.f82752f
            java.lang.String[] r4 = com.tencent.p014mm.storage.C30774r3.f82751e
            java.lang.String r0 = "2"
            java.lang.String[] r6 = new java.lang.String[]{r0}
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 2
            java.lang.String r3 = "FunctionMsgItem"
            java.lang.String r5 = "status<=? and opCode!= -1"
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00f1 }
            r2.<init>()     // Catch:{ all -> 0x00f1 }
            r0.moveToFirst()     // Catch:{ all -> 0x00f1 }
        L_0x0042:
            boolean r3 = r0.isAfterLast()     // Catch:{ all -> 0x00f1 }
            if (r3 != 0) goto L_0x0057
            ug.u r3 = new ug.u     // Catch:{ all -> 0x00f1 }
            r3.<init>()     // Catch:{ all -> 0x00f1 }
            r3.convertFrom(r0)     // Catch:{ all -> 0x00f1 }
            r2.add(r3)     // Catch:{ all -> 0x00f1 }
            r0.moveToNext()     // Catch:{ all -> 0x00f1 }
            goto L_0x0042
        L_0x0057:
            r3 = 0
            cy3.C58003b.m67160a(r0, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x005f:
            boolean r2 = r0.hasNext()
            r4 = 0
            if (r2 == 0) goto L_0x00b1
            java.lang.Object r2 = r0.next()
            ug.u r2 = (p248ug.C37467u) r2
            java.lang.Object[] r5 = new java.lang.Object[r12]
            r5[r4] = r2
            java.lang.String r4 = "[checkFromDb] item:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r5)
            int r4 = r2.field_opCode
            r5 = -1
            if (r4 == r5) goto L_0x005f
            if (r4 == 0) goto L_0x00a2
            if (r4 == r12) goto L_0x009c
            r5 = 2
            if (r4 == r5) goto L_0x0096
            r5 = 3
            if (r4 == r5) goto L_0x0090
            r5 = 101(0x65, float:1.42E-43)
            if (r4 == r5) goto L_0x008a
            r4 = r3
            goto L_0x00a7
        L_0x008a:
            tl.b r4 = new tl.b
            r4.<init>()
            goto L_0x00a7
        L_0x0090:
            tl.e r4 = new tl.e
            r4.<init>()
            goto L_0x00a7
        L_0x0096:
            tl.d r4 = new tl.d
            r4.<init>()
            goto L_0x00a7
        L_0x009c:
            tl.c r4 = new tl.c
            r4.<init>()
            goto L_0x00a7
        L_0x00a2:
            tl.f r4 = new tl.f
            r4.<init>()
        L_0x00a7:
            if (r4 == 0) goto L_0x005f
            rl.e r5 = p676rl.C36332a.f96701e
            int r6 = r2.field_opCode
            r5.mo60630a(r6, r2, r4)
            goto L_0x005f
        L_0x00b1:
            com.tencent.mm.storage.r3 r12 = com.tencent.p014mm.storage.C30774r3.f82750d
            r12.getClass()
            zh3.f r12 = com.tencent.p014mm.storage.C30774r3.f82752f
            java.lang.String r0 = "100"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r2 = "FunctionMsgItem"
            java.lang.String r3 = "status=?"
            int r0 = r12.delete(r2, r3, r0)
            java.lang.String r5 = "3"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            int r12 = r12.delete(r2, r3, r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[deleteAllHandleFunctionMsg] ret1:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " ret2:"
            r2.append(r0)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            java.lang.String r0 = "FunctionMsg.FunctionMsgStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
            p676rl.C36332a.f96699c = r4
            goto L_0x00f8
        L_0x00f1:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r1 = move-exception
            cy3.C58003b.m67160a(r0, r12)
            throw r1
        L_0x00f8:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "[beforeSyncDoCmd] isInit:"
            r12.append(r0)
            boolean r0 = p676rl.C36332a.f96699c
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p443as.C28122e.mo55804U4(java.lang.Object):void");
    }

    /* renamed from: j5 */
    public void mo55805j5(Object obj) {
        C36332a aVar = (C36332a) ((C37461n0) C86312j.m106911c(C37461n0.class)).mo61108WF();
        aVar.getClass();
        C36332a.f96698b = false;
        aVar.mo60621b();
        Log.m105925i("FunctionMsg.FunctionMsgEngine", "[finishSyncDoCmd] check time:%s", Long.valueOf(System.currentTimeMillis()));
    }
}
