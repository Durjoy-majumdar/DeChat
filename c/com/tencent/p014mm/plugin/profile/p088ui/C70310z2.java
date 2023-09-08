package com.tencent.p014mm.plugin.profile.p088ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.z2 */
public class C70310z2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f203089d;

    /* renamed from: e */
    public final /* synthetic */ SayHiWithSnsPermissionUI3 f203090e;

    public C70310z2(SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3, boolean z) {
        this.f203090e = sayHiWithSnsPermissionUI3;
        this.f203089d = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b4, code lost:
        r12 = 10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r19 = this;
            r0 = r19
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r1 = r0.f203090e
            boolean r2 = r1.f202957z
            r3 = 3
            r5 = 1
            if (r2 == 0) goto L_0x000c
            r2 = 1
            goto L_0x0013
        L_0x000c:
            boolean r2 = r0.f203089d
            if (r2 == 0) goto L_0x0012
            r2 = 2
            goto L_0x0013
        L_0x0012:
            r2 = 3
        L_0x0013:
            java.lang.String r1 = r1.mo96718O7()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x001f
            r1 = 3
            goto L_0x0043
        L_0x001f:
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r1 = r0.f203090e
            java.lang.String r1 = r1.mo96718O7()
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r6 = r0.f203090e
            java.lang.String r6 = r6.f202952w
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0042
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r1 = r0.f203090e
            java.lang.String r1 = r1.mo96718O7()
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r6 = r0.f203090e
            java.lang.String r6 = r6.f202951v
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r1 = 1
            goto L_0x0043
        L_0x0042:
            r1 = 2
        L_0x0043:
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r6 = r0.f203090e
            boolean r7 = r6.f202898J
            r9 = 6
            r10 = 4
            r11 = 0
            if (r7 == 0) goto L_0x004e
            r7 = 6
            goto L_0x006c
        L_0x004e:
            int r7 = r6.f202926c1
            r12 = r7 & 8
            if (r12 == 0) goto L_0x0056
            r7 = 5
            goto L_0x006c
        L_0x0056:
            r12 = r7 & 1
            if (r12 == 0) goto L_0x0060
            r12 = r7 & 2
            if (r12 == 0) goto L_0x0060
            r7 = 4
            goto L_0x006c
        L_0x0060:
            r12 = r7 & 2
            if (r12 == 0) goto L_0x0066
            r7 = 3
            goto L_0x006c
        L_0x0066:
            r7 = r7 & r5
            if (r7 == 0) goto L_0x006b
            r7 = 2
            goto L_0x006c
        L_0x006b:
            r7 = 0
        L_0x006c:
            int r12 = r6.f202955y
            r16 = 7
            r14 = 18
            r13 = 17
            r15 = 10
            r17 = 8
            if (r12 == r5) goto L_0x00cc
            if (r12 == r3) goto L_0x00ca
            if (r12 == r9) goto L_0x00c8
            if (r12 == r15) goto L_0x00c8
            r15 = 52
            if (r12 == r15) goto L_0x00c8
            if (r12 == r13) goto L_0x00c6
            if (r12 == r14) goto L_0x00c3
            r15 = 44
            if (r12 == r15) goto L_0x00c3
            r15 = 45
            if (r12 == r15) goto L_0x00c1
            r15 = 48
            if (r12 == r15) goto L_0x00be
            r15 = 49
            if (r12 == r15) goto L_0x00c1
            r15 = 78
            if (r12 == r15) goto L_0x00bb
            r15 = 79
            if (r12 == r15) goto L_0x00bb
            r15 = 181(0xb5, float:2.54E-43)
            if (r12 == r15) goto L_0x00bb
            r15 = 182(0xb6, float:2.55E-43)
            if (r12 == r15) goto L_0x00bb
            switch(r12) {
                case 13: goto L_0x00c8;
                case 14: goto L_0x00b9;
                case 15: goto L_0x00b7;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            switch(r12) {
                case 21: goto L_0x00c8;
                case 22: goto L_0x00b4;
                case 23: goto L_0x00b4;
                case 24: goto L_0x00b4;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            switch(r12) {
                case 26: goto L_0x00b4;
                case 27: goto L_0x00b4;
                case 28: goto L_0x00b4;
                case 29: goto L_0x00b4;
                case 30: goto L_0x00c1;
                default: goto L_0x00b1;
            }
        L_0x00b1:
            r12 = 11
            goto L_0x00cd
        L_0x00b4:
            r12 = 10
            goto L_0x00cd
        L_0x00b7:
            r12 = 2
            goto L_0x00cd
        L_0x00b9:
            r12 = 7
            goto L_0x00cd
        L_0x00bb:
            r12 = 12
            goto L_0x00cd
        L_0x00be:
            r12 = 8
            goto L_0x00cd
        L_0x00c1:
            r12 = 6
            goto L_0x00cd
        L_0x00c3:
            r12 = 9
            goto L_0x00cd
        L_0x00c6:
            r12 = 5
            goto L_0x00cd
        L_0x00c8:
            r12 = 1
            goto L_0x00cd
        L_0x00ca:
            r12 = 3
            goto L_0x00cd
        L_0x00cc:
            r12 = 4
        L_0x00cd:
            java.util.ArrayList<java.lang.String> r6 = r6.f202904Q
            int r15 = r6.size()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r13 = r0.f203090e
            java.util.ArrayList<java.lang.String> r13 = r13.f202908S
            int r13 = r13.size()
            java.lang.String r9 = "#"
            if (r13 <= 0) goto L_0x00ff
            r8 = 0
        L_0x00e5:
            if (r8 >= r13) goto L_0x00ff
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r3 = r0.f203090e
            java.util.ArrayList<java.lang.String> r3 = r3.f202908S
            java.lang.Object r3 = r3.get(r8)
            java.lang.String r3 = (java.lang.String) r3
            r14.append(r3)
            int r3 = r13 + -1
            if (r8 >= r3) goto L_0x00fb
            r14.append(r9)
        L_0x00fb:
            int r8 = r8 + 1
            r3 = 3
            goto L_0x00e5
        L_0x00ff:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r8 = r6.size()
            if (r8 <= 0) goto L_0x0122
            r13 = 0
        L_0x010b:
            if (r13 >= r8) goto L_0x0122
            java.lang.Object r18 = r6.get(r13)
            r4 = r18
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            int r4 = r8 + -1
            if (r13 >= r4) goto L_0x011f
            r3.append(r9)
        L_0x011f:
            int r13 = r13 + 1
            goto L_0x010b
        L_0x0122:
            java.lang.String r3 = r3.toString()
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r4 = r4.mo105907v()
            java.lang.String[] r6 = eb0.C45628s0.f123409o
            java.lang.String[] r8 = new java.lang.String[r10]
            java.lang.String r9 = eb0.C75592q0.m90789s()
            r8[r11] = r9
            java.lang.String r9 = "weixin"
            r8[r5] = r9
            java.lang.String r9 = "helper_entry"
            r13 = 2
            r8[r13] = r9
            java.lang.String r9 = "filehelper"
            r13 = 3
            r8[r13] = r9
            int r4 = r4.mo69711l3(r6, r8)
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 18713(0x4919, float:2.6222E-41)
            r9 = 23
            java.lang.Object[] r9 = new java.lang.Object[r9]
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r13 = r0.f203090e
            java.lang.String r13 = r13.f202950u
            r9[r11] = r13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9[r5] = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r9[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r7 = 3
            r9[r7] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r9[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r2 = 5
            r9[r2] = r1
            long r1 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r7 = r0.f203090e
            long r12 = r7.f202925b1
            long r1 = r1 - r12
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 6
            r9[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r9[r16] = r1
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r1 = r0.f203090e
            int r1 = r1.f202928d1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9[r17] = r1
            r1 = 9
            r9[r1] = r3
            r1 = 10
            r9[r1] = r14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r2 = 11
            r9[r2] = r1
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r1 = r0.f203090e
            int r1 = r1.f202930e1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 12
            r9[r2] = r1
            r1 = 13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r9[r1] = r2
            r1 = 14
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r2 = r0.f203090e
            int[] r2 = r2.f202893E
            r2 = r2[r11]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9[r1] = r2
            r1 = 15
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r2 = r0.f203090e
            int[] r2 = r2.f202893E
            r2 = r2[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9[r1] = r2
            r1 = 16
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r2 = r0.f203090e
            int[] r2 = r2.f202893E
            r3 = 2
            r2 = r2[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9[r1] = r2
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r1 = r0.f203090e
            int[] r1 = r1.f202893E
            r2 = 3
            r1 = r1[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 17
            r9[r2] = r1
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r1 = r0.f203090e
            int[] r1 = r1.f202893E
            r1 = r1[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 18
            r9[r2] = r1
            r1 = 19
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r2 = r0.f203090e
            int[] r2 = r2.f202893E
            r3 = 5
            r2 = r2[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9[r1] = r2
            r1 = 20
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r2 = r0.f203090e
            int[] r2 = r2.f202894F
            r2 = r2[r11]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9[r1] = r2
            r1 = 21
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r2 = r0.f203090e
            int[] r2 = r2.f202894F
            r2 = r2[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9[r1] = r2
            r1 = 22
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r2 = r0.f203090e
            int[] r2 = r2.f202894F
            r3 = 2
            r2 = r2[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9[r1] = r2
            r6.mo160131h(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.C70310z2.run():void");
    }
}
