package p236sn;

import com.tencent.p014mm.storage.C30783v3;

/* renamed from: sn.c */
public class C48421c implements C30783v3.C30789f {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r9 = r8.getUsername();
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo57713A(com.tencent.p014mm.storage.C72976h2 r8, com.tencent.p014mm.storage.C30783v3 r9) {
        /*
            r7 = this;
            java.lang.Object r9 = rb0.C48009v0.f128770y
            if (r8 == 0) goto L_0x00b4
            java.lang.String r9 = r8.getUsername()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x00b4
            java.lang.String r9 = r8.getUsername()
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            com.tencent.mm.storage.z1 r0 = r0.get(r9)
            if (r0 != 0) goto L_0x0026
            goto L_0x00b4
        L_0x0026:
            boolean r0 = r0.mo62916m3()
            if (r0 == 0) goto L_0x00b4
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85793A5(r9)
            if (r0 != 0) goto L_0x00b4
            rb0.j r0 = rb0.C48009v0.Fx0()
            ug.c r0 = r0.mo72757SE(r9)
            long r1 = r0.systemRowid
            r3 = -1
            java.lang.String r5 = "MicroMsg.SubCoreBiz"
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x004a
            java.lang.String r8 = "onMsgChangeNotify: no bizInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
            goto L_0x00b4
        L_0x004a:
            boolean r1 = r0.mo73502t2()
            r2 = 0
            if (r1 == 0) goto L_0x0098
            r9 = 0
            ug.c$b r1 = r0.mo73500r2(r9)
            if (r1 != 0) goto L_0x0061
            r8.mo108807c3(r2)
            java.lang.String r8 = "getExtInfo() == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r8)
            goto L_0x00b4
        L_0x0061:
            ug.c$b r1 = r0.mo73500r2(r9)
            ug.c$b$c$a r1 = r1.mo73511d()
            if (r1 != 0) goto L_0x0074
            r8.mo108807c3(r2)
            java.lang.String r8 = "enterpriseBizInfo == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r8)
            goto L_0x00b4
        L_0x0074:
            java.lang.String r1 = r0.mo73498p2()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r8.mo108807c3(r1)
            java.lang.String r0 = r0.mo73498p2()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x00b4
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r8 = r8.getUsername()
            r0[r9] = r8
            java.lang.String r8 = "Enterprise belong is null:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r8, r0)
            goto L_0x00b4
        L_0x0098:
            boolean r1 = r0.mo73506x2()
            if (r1 != 0) goto L_0x00b1
            boolean r0 = r0.mo72811g1()
            if (r0 != 0) goto L_0x00b1
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85842m5(r9)
            if (r9 == 0) goto L_0x00ab
            goto L_0x00b1
        L_0x00ab:
            java.lang.String r9 = "officialaccounts"
            r8.mo108807c3(r9)
            goto L_0x00b4
        L_0x00b1:
            r8.mo108807c3(r2)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p236sn.C48421c.mo57713A(com.tencent.mm.storage.h2, com.tencent.mm.storage.v3):void");
    }
}
