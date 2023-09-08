package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C86497v5;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C35136m;

/* renamed from: com.tencent.mm.plugin.exdevice.model.b */
public class C41121b implements C86497v5.C31521b, C11385n {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9066Y(ob0.C35136m.C35137a r20) {
        /*
            r19 = this;
            r0 = r20
            te3.j3 r0 = r0.f94242a
            java.lang.String r1 = "MicroMsg.exdevice.ExDeviceWifiStatusMessageHandler"
            java.lang.String r2 = "parseMessageFromServer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            te3.rv3 r2 = r0.f227631h
            java.lang.String r2 = sf0.C48374j0.m53718g(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            java.lang.String r4 = ".sysmsg.wcdevicemsg.xml.DeviceID"
            java.lang.String r5 = ".sysmsg.wcdevicemsg.xml.MsgType"
            java.lang.String r6 = "wcdevicemsg"
            java.lang.String r7 = ".sysmsg.$type"
            java.lang.String r8 = "msg content is null"
            java.lang.String r9 = "sysmsg"
            r12 = 0
            r13 = -1
            if (r3 == 0) goto L_0x002e
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)
            goto L_0x0119
        L_0x002e:
            java.util.Map r2 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r2, r9, r12)
            if (r2 == 0) goto L_0x0119
            int r3 = r2.size()
            if (r3 <= 0) goto L_0x0119
            java.lang.Object r3 = r2.get(r7)
            java.lang.String r3 = (java.lang.String) r3
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r16 != 0) goto L_0x0119
            boolean r3 = r3.equalsIgnoreCase(r6)
            if (r3 == 0) goto L_0x0119
            java.lang.String r3 = ".sysmsg.wcdevicemsg.xml.ToUserName"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r15 = ".sysmsg.wcdevicemsg.xml.FromUserName"
            java.lang.Object r15 = r2.get(r15)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r12 = ".sysmsg.wcdevicemsg.xml.CreateTime"
            java.lang.Object r12 = r2.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r12, r13)
            java.lang.Object r17 = r2.get(r5)
            r13 = r17
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = ".sysmsg.wcdevicemsg.xml.DeviceType"
            java.lang.Object r14 = r2.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r17 = r2.get(r4)
            r10 = r17
            java.lang.String r10 = (java.lang.String) r10
            r17 = r4
            java.lang.String r4 = ".sysmsg.wcdevicemsg.xml.DeviceStatus"
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            r4 = -1
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r18 = r5
            java.lang.String r5 = "parseMessageFromServer:tousr="
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = ",fromuser="
            r4.append(r3)
            r4.append(r15)
            java.lang.String r3 = ",createtime="
            r4.append(r3)
            r4.append(r11)
            java.lang.String r3 = ",msgtype="
            r4.append(r3)
            r4.append(r13)
            java.lang.String r3 = ",devicetype="
            r4.append(r3)
            r4.append(r14)
            java.lang.String r3 = ",deviceid="
            r4.append(r3)
            r4.append(r10)
            java.lang.String r3 = ",devicestatus="
            r4.append(r3)
            r4.append(r2)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            z71.c r1 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            z71.b r1 = r1.mo74334bD(r10)
            if (r1 == 0) goto L_0x011d
            java.lang.String r3 = r1.field_connProto
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            java.lang.String r4 = "4"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x011d
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
            java.lang.String r4 = "device_status"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x011d
            if (r2 == 0) goto L_0x010a
            com.tencent.p014mm.plugin.exdevice.model.C41166r1.yx0()
            java.lang.String r2 = r1.field_brandName
            java.lang.String r3 = r1.field_url
            java.lang.String r1 = r1.field_deviceID
            r4 = 2
            com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.m44540n(r2, r3, r4, r1)
            goto L_0x0117
        L_0x010a:
            com.tencent.p014mm.plugin.exdevice.model.C41166r1.yx0()
            java.lang.String r2 = r1.field_brandName
            java.lang.String r3 = r1.field_url
            java.lang.String r1 = r1.field_deviceID
            r4 = 4
            com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.m44540n(r2, r3, r4, r1)
        L_0x0117:
            r1 = 1
            goto L_0x011e
        L_0x0119:
            r17 = r4
            r18 = r5
        L_0x011d:
            r1 = 0
        L_0x011e:
            if (r1 == 0) goto L_0x0122
            goto L_0x023c
        L_0x0122:
            te3.rv3 r0 = r0.f227631h
            java.lang.String r0 = sf0.C48374j0.m53718g(r0)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r2 = "MicroMsg.exdevice.ExDeviceMessageService"
            if (r1 == 0) goto L_0x0135
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r8)
            goto L_0x023c
        L_0x0135:
            r1 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r9, r1)
            if (r0 == 0) goto L_0x0236
            int r1 = r0.size()
            if (r1 > 0) goto L_0x0144
            goto L_0x0236
        L_0x0144:
            java.lang.Object r1 = r0.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 != 0) goto L_0x022f
            boolean r1 = r1.equalsIgnoreCase(r6)
            if (r1 != 0) goto L_0x0158
            goto L_0x022f
        L_0x0158:
            r1 = r18
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r1
            java.lang.String r5 = "newXml wcdevicemsg msgType = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r4)
            java.lang.String r4 = "device_relation"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0185
            com.tencent.mm.autogen.events.ExDeviceGetBoundDevicesEvent r0 = new com.tencent.mm.autogen.events.ExDeviceGetBoundDevicesEvent
            r0.<init>()
            com.tencent.mm.autogen.events.ExDeviceGetBoundDevicesEvent$a r1 = r0.f107445d
            r1.f107446a = r3
            r0.publish()
            goto L_0x023c
        L_0x0185:
            java.lang.String r1 = ".sysmsg.wcdevicemsg.xml.Content"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r3 = 0
            r4[r3] = r1
            java.lang.String r5 = "contentBase64 = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 == 0) goto L_0x01a4
            java.lang.String r0 = "Fuck off: contentBase64 is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x023c
        L_0x01a4:
            byte[] r4 = android.util.Base64.decode(r1, r3)     // Catch:{ Exception -> 0x0216 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r4)
            if (r3 == 0) goto L_0x01b5
            java.lang.String r0 = "null == decodedContent"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x023c
        L_0x01b5:
            java.lang.String r3 = ".sysmsg.wcdevicemsg.xml.SessionID"
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r5 = -1
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r3, r5)
            r3 = r17
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            r8 = 0
            r3[r8] = r7
            r7 = 1
            r3[r7] = r0
            r7 = 2
            r3[r7] = r1
            r1 = 3
            int r7 = r4.length
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3[r1] = r7
            java.lang.String r1 = "------NewXml Receive------sessionId = %d, deviceId = %s, message content = %s, length = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r3)
            z71.c r1 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            z71.b r0 = r1.mo74334bD(r0)
            if (r0 != 0) goto L_0x01f8
            java.lang.String r0 = "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x023c
        L_0x01f8:
            r1 = 0
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x020e
            a81.g r1 = new a81.g
            long r2 = r0.field_mac
            r5 = 0
            r1.<init>(r4, r5, r2)
            com.tencent.mm.plugin.exdevice.model.h r0 = y71.C53502m.m60039c()
            r0.mo64199b(r1)
            goto L_0x023c
        L_0x020e:
            n71.k r0 = n71.C47180k.m52466a()
            r0.mo72255b(r5, r4)
            goto L_0x023c
        L_0x0216:
            r0 = move-exception
            r1 = r0
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = r1.getMessage()
            r4 = 0
            r0[r4] = r3
            java.lang.String r3 = "decode failed!!! %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r0)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r0)
            goto L_0x023c
        L_0x022f:
            java.lang.String r0 = "receiveMessage, type not wcdevicemsg"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x023c
        L_0x0236:
            java.lang.String r0 = "receiveMessage, no sysmsg"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x023c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C41121b.mo9066Y(ob0.m$a):void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.exdevice.ExDeviceMessageService", "onScenend, errType = %d, errCode = %d, errMsg = ", Integer.valueOf(i), Integer.valueOf(i2), str);
    }
}
