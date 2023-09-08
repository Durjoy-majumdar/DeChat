package com.tencent.p014mm.plugin.luckymoney.p073ui;

import hp3.C87581a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.x4 */
public final class C69723x4<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneySpareActivityFirst f201145a;

    /* renamed from: b */
    public final /* synthetic */ String f201146b;

    public C69723x4(LuckyMoneySpareActivityFirst luckyMoneySpareActivityFirst, String str) {
        this.f201145a = luckyMoneySpareActivityFirst;
        this.f201146b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r11) {
        /*
            r10 = this;
            ob0.b$c r11 = (ob0.C89132b.C89134c) r11
            int r0 = r11.f256793a
            int r1 = r11.f256794b
            T r2 = r11.f256796d
            te3.jn3 r2 = (te3.C50014jn3) r2
            java.lang.String r3 = ", "
            java.lang.String r4 = "MicroMsg.LuckyMoneySpareActivityFirst"
            if (r0 != 0) goto L_0x01b6
            if (r1 != 0) goto L_0x01b6
            if (r2 != 0) goto L_0x0016
            goto L_0x01b6
        L_0x0016:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "VerifyGuardianResponse resp retcode: "
            r11.append(r0)
            int r0 = r2.f136211d
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            int r11 = r2.f136211d
            if (r11 == 0) goto L_0x0039
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneySpareActivityFirst r11 = r10.f201145a
            java.lang.String r0 = r2.f136212e
            com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneySpareActivityFirst.m81970i8(r11, r0)
            goto L_0x01d7
        L_0x0039:
            te3.n4 r11 = r2.f136214g
            if (r11 == 0) goto L_0x009f
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneySpareActivityFirst r0 = r10.f201145a
            int r1 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneySpareActivityFirst.f200800E
            r0.getClass()
            java.lang.String r1 = r11.f138401d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x004e
            goto L_0x01d7
        L_0x004e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "show alert: "
            r1.append(r2)
            java.lang.String r2 = r11.f138401d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            androidx.appcompat.app.AppCompatActivity r1 = r0.getContext()
            qo3.a r2 = new qo3.a
            r2.<init>()
            java.lang.String r3 = r11.f138401d
            r2.f225660q = r3
            te3.al r3 = r11.f138402e
            if (r3 == 0) goto L_0x0080
            java.lang.String r4 = r3.f130606h
            r2.f225664u = r4
            com.tencent.mm.plugin.luckymoney.ui.b5 r4 = new com.tencent.mm.plugin.luckymoney.ui.b5
            r4.<init>(r0, r3)
            r2.f225621D = r4
        L_0x0080:
            te3.al r11 = r11.f138403f
            if (r11 == 0) goto L_0x008f
            java.lang.String r3 = r11.f130606h
            r2.f225663t = r3
            com.tencent.mm.plugin.luckymoney.ui.c5 r3 = new com.tencent.mm.plugin.luckymoney.ui.c5
            r3.<init>(r0, r11)
            r2.f225620C = r3
        L_0x008f:
            qo3.g r11 = new qo3.g
            r0 = 2131887328(0x7f1204e0, float:1.940926E38)
            r11.<init>(r1, r0)
            r11.mo107525e(r2)
            r11.show()
            goto L_0x01d7
        L_0x009f:
            te3.hj r11 = r2.f136213f
            if (r11 == 0) goto L_0x01d7
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneySpareActivityFirst r0 = r10.f201145a
            java.lang.String r1 = r10.f201146b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "will send bubble msg: "
            r5.append(r6)
            java.lang.String r6 = r11.f227564d
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r11.f227569i
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            int r3 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneySpareActivityFirst.f200800E
            r0.getClass()
            java.lang.String r3 = r11.f227569i
            java.lang.String r5 = "bubble.weapp_username"
            gy3.C87412m.m108593f(r3, r5)
            java.lang.String r5 = "@app"
            r6 = 2
            r7 = 0
            r8 = 0
            boolean r3 = z04.C112551y.m153808h(r3, r5, r8, r6, r7)
            if (r3 != 0) goto L_0x00f0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = r11.f227569i
            r3.append(r9)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r11.f227569i = r3
        L_0x00f0:
            com.tencent.mm.message.l$b r3 = new com.tencent.mm.message.l$b
            r3.<init>()
            java.lang.String r5 = r11.f227564d
            r3.f195570f = r5
            java.lang.String r5 = r11.f227565e
            r3.f195574g = r5
            r5 = 44
            r3.f195582i = r5
            r5 = 1
            r3.f195597l2 = r5
            java.lang.String r9 = r11.f227569i
            r3.f195573f2 = r9
            java.lang.String r9 = r11.f227570j
            r3.f195569e2 = r9
            r3.f195581h2 = r6
            java.lang.String r6 = r11.f227568h
            if (r6 == 0) goto L_0x0123
            int r9 = r6.length()
            if (r9 <= 0) goto L_0x011a
            r9 = 1
            goto L_0x011b
        L_0x011a:
            r9 = 0
        L_0x011b:
            if (r9 == 0) goto L_0x011e
            goto L_0x011f
        L_0x011e:
            r6 = r7
        L_0x011f:
            if (r6 == 0) goto L_0x0123
            r3.f195646y = r6
        L_0x0123:
            java.lang.String r6 = r11.f227566f
            if (r6 == 0) goto L_0x0138
            int r9 = r6.length()
            if (r9 <= 0) goto L_0x012f
            r9 = 1
            goto L_0x0130
        L_0x012f:
            r9 = 0
        L_0x0130:
            if (r9 == 0) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r6 = r7
        L_0x0134:
            if (r6 == 0) goto L_0x0138
            r3.f195613p2 = r6
        L_0x0138:
            java.lang.String r6 = r11.f227567g
            if (r6 == 0) goto L_0x0153
            int r9 = r6.length()
            if (r9 <= 0) goto L_0x0144
            r9 = 1
            goto L_0x0145
        L_0x0144:
            r9 = 0
        L_0x0145:
            if (r9 == 0) goto L_0x0148
            goto L_0x0149
        L_0x0148:
            r6 = r7
        L_0x0149:
            if (r6 == 0) goto L_0x0153
            r3.f195609o2 = r6
            r3.f195638w = r6
            java.lang.String r6 = "gh_3dfda90e39d6"
            r3.f195634v = r6
        L_0x0153:
            r3.f195605n2 = r5
            com.tencent.mm.plugin.luckymoney.ui.a5 r6 = new com.tencent.mm.plugin.luckymoney.ui.a5
            r6.<init>(r3, r1, r0, r11)
            java.lang.String r3 = r11.f227568h
            if (r3 == 0) goto L_0x016b
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x0166
            r3 = 1
            goto L_0x0167
        L_0x0166:
            r3 = 0
        L_0x0167:
            if (r3 != r5) goto L_0x016b
            r3 = 1
            goto L_0x016c
        L_0x016b:
            r3 = 0
        L_0x016c:
            if (r3 == 0) goto L_0x0188
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneySpareActivityFirst$b r0 = r0.f200802D
            java.lang.String r11 = r11.f227568h
            java.lang.String r3 = "bubble.icon_url"
            gy3.C87412m.m108593f(r11, r3)
            com.tencent.mm.plugin.luckymoney.ui.y4 r3 = new com.tencent.mm.plugin.luckymoney.ui.y4
            r3.<init>(r6)
            r0.getClass()
            com.tencent.mm.plugin.luckymoney.ui.w4 r6 = new com.tencent.mm.plugin.luckymoney.ui.w4
            r6.<init>(r0, r11, r3)
            o40.C61926c.m72656A(r7, r6)
            goto L_0x018b
        L_0x0188:
            r6.invoke(r7)
        L_0x018b:
            java.lang.String r11 = r2.f136215h
            if (r11 == 0) goto L_0x01d7
            int r0 = r11.length()
            if (r0 <= 0) goto L_0x0197
            r0 = 1
            goto L_0x0198
        L_0x0197:
            r0 = 0
        L_0x0198:
            if (r0 == 0) goto L_0x019b
            r7 = r11
        L_0x019b:
            if (r7 == 0) goto L_0x01d7
            java.lang.String r11 = "will send text message"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            com.tencent.mm.autogen.events.SendMsgEvent r11 = new com.tencent.mm.autogen.events.SendMsgEvent
            r11.<init>()
            com.tencent.mm.autogen.events.SendMsgEvent$a r0 = r11.f9496d
            r0.f9497a = r1
            r0.f9498b = r7
            r0.f9499c = r5
            r0.f9500d = r8
            r11.publish()
            goto L_0x01d7
        L_0x01b6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "VerifyGuardianResponse error: "
            r2.append(r5)
            r2.append(r0)
            r2.append(r3)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneySpareActivityFirst r0 = r10.f201145a
            java.lang.String r11 = r11.f256795c
            com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneySpareActivityFirst.m81970i8(r0, r11)
        L_0x01d7:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.C69723x4.call(java.lang.Object):java.lang.Object");
    }
}
