package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.autogen.events.ExDeviceGetTicketEvent;
import ob0.C11385n;

/* renamed from: com.tencent.mm.plugin.exdevice.model.s */
public class C2241s implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ ExDeviceGetTicketEvent f12310d;

    public C2241s(ExdeviceEventManager exdeviceEventManager, ExDeviceGetTicketEvent exDeviceGetTicketEvent) {
        this.f12310d = exDeviceGetTicketEvent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        r9 = r9.f127056b.f127083a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r9, int r10, java.lang.String r11, ob0.C117747y r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L_0x00ea
            int r2 = r12.getType()
            r3 = 543(0x21f, float:7.61E-43)
            if (r2 != r3) goto L_0x00ea
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            r2.mo123470p(r3, r8)
            java.lang.String r2 = "getTicketSceneEndImpl errType = [%s], errCode = [%s]， errMsg = [%s]"
            r3 = 2
            r4 = 3
            java.lang.String r5 = "MicroMsg.exdevice.ExdeviceEventManager"
            r6 = 0
            if (r9 != 0) goto L_0x00c7
            if (r10 == 0) goto L_0x0022
            goto L_0x00c7
        L_0x0022:
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7[r6] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r7[r1] = r9
            r7[r3] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r7)
            com.tencent.mm.plugin.exdevice.model.k1 r12 = (com.tencent.p014mm.plugin.exdevice.model.C2239k1) r12
            ob0.c r9 = r12.f12308d
            if (r9 == 0) goto L_0x0045
            ob0.c$d r9 = r9.f127056b
            pe3.a r9 = r9.f127083a
            if (r9 != 0) goto L_0x0042
            goto L_0x0045
        L_0x0042:
            te3.o12 r9 = (te3.C50622o12) r9
            goto L_0x0046
        L_0x0045:
            r9 = r0
        L_0x0046:
            java.util.LinkedList<te3.p12> r9 = r9.f138903d
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
        L_0x004d:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x00b5
            java.lang.Object r11 = r9.next()
            te3.p12 r11 = (te3.C50768p12) r11
            if (r11 != 0) goto L_0x005c
            goto L_0x004d
        L_0x005c:
            te3.hf2 r12 = r11.f139528e
            if (r12 == 0) goto L_0x0065
            java.lang.String r2 = r12.f134597e
            java.lang.String r12 = r12.f134596d
            goto L_0x0067
        L_0x0065:
            r12 = r0
            r2 = r12
        L_0x0067:
            int r7 = r11.f139527d
            if (r7 != 0) goto L_0x009f
            java.lang.String r7 = r11.f139529f
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x0074
            goto L_0x009f
        L_0x0074:
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r6] = r2
            r7[r1] = r12
            java.lang.String r12 = r11.f139529f
            r7[r3] = r12
            int r12 = r11.f139530g
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r7[r4] = r12
            java.lang.String r12 = "GetHardDeviceOperTicket end. deviceId=%s, deviceType=%s, ticket=%s, oper=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r12, r7)
            com.tencent.mm.autogen.events.ExDeviceGetTicketEvent r12 = r8.f12310d
            com.tencent.mm.autogen.events.ExDeviceGetTicketEvent$b r2 = r12.f9096e
            r2.f9101a = r1
            java.lang.String r11 = r11.f139529f
            r2.f9102b = r11
            java.lang.Runnable r11 = r12.callback
            if (r11 == 0) goto L_0x004d
            r11.run()
            r10 = 1
            goto L_0x004d
        L_0x009f:
            java.lang.Object[] r12 = new java.lang.Object[r4]
            r12[r6] = r2
            int r2 = r11.f139527d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12[r1] = r2
            java.lang.String r11 = r11.f139529f
            r12[r3] = r11
            java.lang.String r11 = "deviceId(%s) get ticket fail. ret=%d, ticket=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r11, r12)
            goto L_0x004d
        L_0x00b5:
            if (r10 != 0) goto L_0x00c6
            com.tencent.mm.autogen.events.ExDeviceGetTicketEvent r9 = r8.f12310d
            com.tencent.mm.autogen.events.ExDeviceGetTicketEvent$b r10 = r9.f9096e
            r10.f9101a = r1
            r10.f9102b = r0
            java.lang.Runnable r9 = r9.callback
            if (r9 == 0) goto L_0x00c6
            r9.run()
        L_0x00c6:
            return
        L_0x00c7:
            java.lang.Object[] r12 = new java.lang.Object[r4]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12[r6] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r12[r1] = r9
            r12[r3] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r2, r12)
            com.tencent.mm.autogen.events.ExDeviceGetTicketEvent r9 = r8.f12310d
            com.tencent.mm.autogen.events.ExDeviceGetTicketEvent$b r10 = r9.f9096e
            r10.f9101a = r1
            r10.f9102b = r0
            java.lang.Runnable r9 = r9.callback
            if (r9 == 0) goto L_0x00e9
            r9.run()
        L_0x00e9:
            return
        L_0x00ea:
            com.tencent.mm.autogen.events.ExDeviceGetTicketEvent r9 = r8.f12310d
            com.tencent.mm.autogen.events.ExDeviceGetTicketEvent$b r10 = r9.f9096e
            r10.f9101a = r1
            r10.f9102b = r0
            java.lang.Runnable r9 = r9.callback
            if (r9 == 0) goto L_0x00f9
            r9.run()
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C2241s.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
