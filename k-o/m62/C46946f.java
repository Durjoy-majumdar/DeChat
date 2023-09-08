package m62;

import com.tencent.p014mm.p136ui.MMFragmentActivity$$j;

/* renamed from: m62.f */
public final class C46946f implements MMFragmentActivity$$j {

    /* renamed from: d */
    public final String f126228d = "MicroMsg.SecurityMsgIntercept";

    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7676d(android.content.Context r22, java.lang.String r23, android.content.Intent r24) {
        /*
            r21 = this;
            r12 = r21
            r8 = r22
            r9 = r24
            r0 = -1
            if (r9 == 0) goto L_0x0011
            java.lang.String r2 = "Retr_Security_Msg_Id"
            long r2 = r9.getLongExtra(r2, r0)
            goto L_0x0012
        L_0x0011:
            r2 = r0
        L_0x0012:
            r13 = 1
            r14 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x020d
            java.lang.String r0 = "Retr_Security_Is_Intercept"
            if (r9 == 0) goto L_0x0024
            boolean r1 = r9.getBooleanExtra(r0, r14)
            if (r1 != 0) goto L_0x0024
            r1 = 1
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 == 0) goto L_0x020d
            if (r8 == 0) goto L_0x020d
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            if (r9 == 0) goto L_0x0030
            r9.putExtra(r0, r13)
        L_0x0030:
            if (r4 != 0) goto L_0x003c
            java.lang.String r0 = r12.f126228d
            java.lang.String r1 = "doCgi, msgId is -1"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x0039:
            r15 = 0
            goto L_0x020a
        L_0x003c:
            k40.a r0 = f40.C86709a0.m107533q(r1)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r6 = r0.b00(r2)
            boolean r0 = r6.mo100980S3()
            if (r0 != r13) goto L_0x0054
            r0 = 1
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = r12.f126228d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "intercept msg, disable open, msgId: "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r0 = 2131835465(0x7f113a49, float:1.930407E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131821556(0x7f1103f4, float:1.9275859E38)
            java.lang.String r3 = r8.getString(r0)
            r4 = 0
            r5 = 0
            java.lang.String r2 = ""
            r0 = r22
            nj3.C76879j.m92711E(r0, r1, r2, r3, r4, r5)
            r15 = 1
            goto L_0x020a
        L_0x0087:
            int r0 = r6.f230723F
            r2 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0090
            r0 = 1
            goto L_0x0091
        L_0x0090:
            r0 = 0
        L_0x0091:
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = r12.f126228d
            java.lang.String r1 = "doCgi, skip is open"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x0039
        L_0x009b:
            java.lang.String r0 = r6.f230724G
            if (r0 == 0) goto L_0x00a8
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r0 = 0
            goto L_0x00a9
        L_0x00a8:
            r0 = 1
        L_0x00a9:
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = r12.f126228d
            java.lang.String r2 = "doCgi, msgSource is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            r6.mo101014q4(r13)
            k40.a r0 = f40.C86709a0.m107533q(r1)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            long r1 = r6.getMsgId()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r0.xy0(r1, r6)
            goto L_0x0039
        L_0x00ca:
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_android_forwardmsgspaminfo_switch
            java.lang.String r3 = ""
            java.lang.String r15 = r0.Y60(r2, r3)
            if (r15 == 0) goto L_0x00e5
            int r0 = r15.length()
            if (r0 != 0) goto L_0x00e3
            goto L_0x00e5
        L_0x00e3:
            r0 = 0
            goto L_0x00e6
        L_0x00e5:
            r0 = 1
        L_0x00e6:
            if (r0 == 0) goto L_0x011b
            java.lang.String r0 = r12.f126228d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "doCgi, swt["
            r2.append(r3)
            r2.append(r15)
            java.lang.String r3 = "] is empty"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            r6.mo101014q4(r13)
            k40.a r0 = f40.C86709a0.m107533q(r1)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            long r1 = r6.getMsgId()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r0.xy0(r1, r6)
            goto L_0x0039
        L_0x011b:
            java.lang.String r0 = r6.getContent()
            r11 = 0
            com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r11)
            if (r0 == 0) goto L_0x012a
            int r0 = r0.f195582i
            r7 = r0
            goto L_0x012b
        L_0x012a:
            r7 = 0
        L_0x012b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            int r2 = r6.getType()
            r0.append(r2)
            r2 = 95
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "swt"
            gy3.C87412m.m108593f(r15, r2)
            java.lang.String r2 = ","
            java.lang.String[] r16 = new java.lang.String[]{r2}
            r17 = 0
            r18 = 0
            r19 = 6
            r20 = 0
            java.util.List r2 = z04.C112550d0.m153785U(r15, r16, r17, r18, r19, r20)
            boolean r2 = r2.contains(r0)
            if (r2 != 0) goto L_0x0191
            r6.mo101014q4(r13)
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            long r2 = r6.getMsgId()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            r1.xy0(r2, r6)
            java.lang.String r1 = r12.f126228d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "doCgi, skip currentType and set msg open: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            goto L_0x0039
        L_0x0191:
            if (r9 == 0) goto L_0x019b
            java.lang.String r0 = "Retr_Security_Is_Intercept_Block"
            boolean r0 = r9.getBooleanExtra(r0, r13)
            r15 = r0
            goto L_0x019c
        L_0x019b:
            r15 = 1
        L_0x019c:
            if (r9 == 0) goto L_0x01a9
            java.lang.String r0 = "Retr_Security_Intercept_Activity_PackageName"
            java.lang.String r0 = r9.getStringExtra(r0)
            if (r0 != 0) goto L_0x01a7
            goto L_0x01a9
        L_0x01a7:
            r10 = r0
            goto L_0x01aa
        L_0x01a9:
            r10 = r3
        L_0x01aa:
            gy3.f0 r5 = new gy3.f0
            r5.<init>()
            if (r15 == 0) goto L_0x01cf
            r0 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r2 = r8.getString(r0)
            r3 = 1
            r4 = 1
            r16 = 0
            r0 = r22
            r11 = r5
            r5 = r16
            qo3.i0 r0 = nj3.C76879j.m92723Q(r0, r1, r2, r3, r4, r5)
            r11.f27484d = r0
            goto L_0x01d0
        L_0x01cf:
            r11 = r5
        L_0x01d0:
            int r0 = r6.getType()
            r1 = 65535(0xffff, float:9.1834E-41)
            r5 = r0 & r1
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r0 = r0.mo62443b(r8)
            java.lang.Class<wb2.a> r1 = wb2.C65946a.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            wb2.a r0 = (wb2.C65946a) r0
            com.tencent.mm.sdk.coroutines.LifecycleScope r4 = r0.mo89983c3()
            m62.e r3 = new m62.e
            r16 = 0
            r0 = r3
            r1 = r21
            r2 = r4
            r14 = r3
            r3 = r15
            r12 = r4
            r4 = r6
            r6 = r7
            r7 = r11
            r8 = r22
            r9 = r24
            r18 = r15
            r15 = 0
            r11 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.tencent.p014mm.sdk.coroutines.LifecycleScope.launchDefault$default(r12, r15, r14, r13, r15)
            r15 = r18
        L_0x020a:
            if (r15 == 0) goto L_0x020d
            goto L_0x020e
        L_0x020d:
            r13 = 0
        L_0x020e:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: m62.C46946f.mo7676d(android.content.Context, java.lang.String, android.content.Intent):boolean");
    }
}
