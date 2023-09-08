package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import ml2.C34590d;

/* renamed from: com.tencent.mm.plugin.scanner.model.o1 */
public final class C30384o1 implements C34590d {

    /* renamed from: a */
    public boolean f81980a;

    public C30384o1() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_scan_code_multi_code_direct_jump, 0);
        this.f81980a = Qe != 0;
        Log.m105925i("MicroMsg.WxScanCodeResultFilter", "alvinluo WxScanCodeResultFilter init config: %d, directJumpWhiteCode: %b", Integer.valueOf(Qe), Boolean.valueOf(this.f81980a));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x001d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.tencent.qbar.C19931a.C19932a> filter(java.util.List<? extends com.tencent.qbar.C19931a.C19932a> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "codeResultList"
            gy3.C87412m.m108594g(r12, r0)
            int r0 = r12.size()
            r1 = 1
            if (r0 > r1) goto L_0x000d
            return r12
        L_0x000d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r12.iterator()
            r4 = 0
            r5 = 0
        L_0x001d:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0068
            java.lang.Object r6 = r3.next()
            com.tencent.qbar.a$a r6 = (com.tencent.qbar.C19931a.C19932a) r6
            java.lang.String r7 = r6.f56829f
            boolean r7 = qs3.C36079a.m40902a(r7)
            if (r7 == 0) goto L_0x0034
            int r5 = r5 + 1
            goto L_0x001d
        L_0x0034:
            r0.add(r6)
            java.lang.String r7 = r6.f56829f
            if (r7 != 0) goto L_0x003d
        L_0x003b:
            r7 = 0
            goto L_0x0062
        L_0x003d:
            java.lang.String r7 = r7.toLowerCase()
            java.util.List<java.lang.String> r8 = qs3.C36079a.f96166b
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x0049:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x003b
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r10 != 0) goto L_0x0049
            boolean r9 = r7.startsWith(r9)
            if (r9 == 0) goto L_0x0049
            r7 = 1
        L_0x0062:
            if (r7 == 0) goto L_0x001d
            r2.add(r6)
            goto L_0x001d
        L_0x0068:
            int r3 = r12.size()
            if (r5 != r3) goto L_0x006f
            goto L_0x0089
        L_0x006f:
            int r3 = r2.size()
            if (r3 != r1) goto L_0x0089
            int r3 = r12.size()
            int r6 = r2.size()
            int r3 = r3 - r6
            if (r5 != r3) goto L_0x0081
            goto L_0x0087
        L_0x0081:
            if (r5 != 0) goto L_0x0089
            boolean r3 = r11.f81980a
            if (r3 == 0) goto L_0x0089
        L_0x0087:
            r3 = r2
            goto L_0x008a
        L_0x0089:
            r3 = r12
        L_0x008a:
            r6 = 7
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6[r4] = r5
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6[r1] = r2
            r2 = 2
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r2] = r0
            r0 = 3
            int r2 = r12.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6[r0] = r2
            r0 = 4
            int r2 = r3.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6[r0] = r2
            r0 = 5
            int r2 = r3.size()
            if (r2 != r1) goto L_0x00c7
            r2 = 1
            goto L_0x00c8
        L_0x00c7:
            r2 = 0
        L_0x00c8:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6[r0] = r2
            r0 = 6
            int r2 = r3.size()
            int r12 = r12.size()
            if (r2 != r12) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            r1 = 0
        L_0x00db:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)
            r6[r0] = r12
            java.lang.String r12 = "MicroMsg.WxScanCodeResultFilter"
            java.lang.String r0 = "alvinluo filter badCodeNum: %d, whiteCodeNum: %d, commonCodeNum: %d, originNum: %d, finalNum: %d, directJump: %b, showMultiCode: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.model.C30384o1.filter(java.util.List):java.util.List");
    }
}
