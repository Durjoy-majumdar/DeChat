package com.tencent.p014mm.plugin.audio.broadcast.bluetooth;

import android.content.BroadcastReceiver;

/* renamed from: com.tencent.mm.plugin.audio.broadcast.bluetooth.BluetoothReceiver */
public class BluetoothReceiver extends BroadcastReceiver {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0225  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r17, android.content.Intent r18) {
        /*
            r16 = this;
            r1 = r18
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            java.lang.String r3 = "%s"
            java.lang.String r4 = "android.media.extra.SCO_AUDIO_STATE"
            if (r17 == 0) goto L_0x0451
            if (r1 == 0) goto L_0x0451
            java.lang.String r0 = r18.getAction()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0451
            boolean r0 = f40.C86709a0.m107522a()
            if (r0 != 0) goto L_0x001e
            goto L_0x0451
        L_0x001e:
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            java.lang.String r5 = "MicroMsg.BluetoothReceiver"
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "getDefaultAdapter == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            return
        L_0x002c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "dkbt action :"
            r6.append(r7)
            java.lang.String r7 = r18.getAction()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            r6 = -1
            r7 = 1
            r8 = 0
            int r9 = r1.getIntExtra(r4, r6)     // Catch:{ Exception -> 0x0061 }
            if (r9 == r7) goto L_0x004f
            if (r9 != 0) goto L_0x006d
        L_0x004f:
            java.util.Set r0 = r0.getBondedDevices()     // Catch:{ Exception -> 0x0061 }
            if (r0 == 0) goto L_0x005b
            int r0 = r0.size()     // Catch:{ Exception -> 0x0061 }
            if (r0 != 0) goto L_0x006d
        L_0x005b:
            java.lang.String r0 = "getBondedDevices == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)     // Catch:{ Exception -> 0x0061 }
            return
        L_0x0061:
            r0 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r9[r8] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r3, r9)
        L_0x006d:
            java.lang.String r0 = r18.getAction()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r5 == 0) goto L_0x0078
            return
        L_0x0078:
            java.lang.Class<dn.l> r5 = p492dn.C107054l.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            dn.l r5 = (p492dn.C107054l) r5
            r5.mo157466Yj(r1)
            r0.getClass()
            int r5 = r0.hashCode()
            r9 = 4
            r10 = 3
            r11 = 5
            r12 = 2
            switch(r5) {
                case -1692127708: goto L_0x00c9;
                case -1530327060: goto L_0x00be;
                case -1435586571: goto L_0x00b3;
                case 17117692: goto L_0x00a8;
                case 545516589: goto L_0x009d;
                case 1821585647: goto L_0x0092;
                default: goto L_0x0091;
            }
        L_0x0091:
            goto L_0x00d4
        L_0x0092:
            java.lang.String r5 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x009b
            goto L_0x00d4
        L_0x009b:
            r0 = 5
            goto L_0x00d5
        L_0x009d:
            java.lang.String r5 = "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00a6
            goto L_0x00d4
        L_0x00a6:
            r0 = 4
            goto L_0x00d5
        L_0x00a8:
            java.lang.String r5 = "android.bluetooth.headset.profile.action.ACTIVE_DEVICE_CHANGED"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00b1
            goto L_0x00d4
        L_0x00b1:
            r0 = 3
            goto L_0x00d5
        L_0x00b3:
            java.lang.String r5 = "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00bc
            goto L_0x00d4
        L_0x00bc:
            r0 = 2
            goto L_0x00d5
        L_0x00be:
            java.lang.String r5 = "android.bluetooth.adapter.action.STATE_CHANGED"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00c7
            goto L_0x00d4
        L_0x00c7:
            r0 = 1
            goto L_0x00d5
        L_0x00c9:
            java.lang.String r5 = "android.media.ACTION_SCO_AUDIO_STATE_UPDATED"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            r0 = 0
            goto L_0x00d5
        L_0x00d4:
            r0 = -1
        L_0x00d5:
            java.lang.String r5 = "pre address is null"
            java.lang.String r13 = "device is unavailable"
            java.lang.String r14 = "android.bluetooth.device.extra.DEVICE"
            java.lang.String r15 = "MicroMsg.BluetoothMgr"
            if (r0 == 0) goto L_0x0360
            if (r0 == r7) goto L_0x02e8
            r3 = 6
            r4 = 7
            if (r0 == r12) goto L_0x01ec
            if (r0 == r10) goto L_0x01b9
            if (r0 == r9) goto L_0x012e
            if (r0 == r11) goto L_0x00ee
            goto L_0x0451
        L_0x00ee:
            android.os.Parcelable r0 = r1.getParcelableExtra(r14)
            android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            if (r0 != 0) goto L_0x00fb
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r5)
            goto L_0x0451
        L_0x00fb:
            java.lang.String r1 = r0.getAddress()
            java.lang.String r2 = nu0.C109758a.f328509a
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            if (r1 == 0) goto L_0x0451
            java.lang.String r1 = "dkbt onReceive action[ BluetoothDevice.ACTION_ACL_DISCONNECTED ] "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "pre connect device is "
            r1.append(r2)
            java.lang.String r0 = r0.getAddress()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            qu0.C110472b.f330368d = r7
            pu0.b$a r0 = pu0.C110248b.f329777h
            r0.mo161668m(r4)
            goto L_0x0451
        L_0x012e:
            java.lang.String r0 = r18.getAction()
            java.lang.String r2 = "android.bluetooth.profile.extra.STATE"
            int r2 = r1.getIntExtra(r2, r6)
            android.os.Parcelable r1 = r1.getParcelableExtra(r14)
            android.bluetooth.BluetoothDevice r1 = (android.bluetooth.BluetoothDevice) r1
            if (r1 != 0) goto L_0x0145
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r5)
            goto L_0x0451
        L_0x0145:
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r5 = r1.getAddress()
            r4[r8] = r5
            java.lang.String r5 = " mPreBTAddress = device.address %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r5, r4)
            java.lang.Object[] r4 = new java.lang.Object[r7]
            int r5 = r1.getBondState()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r8] = r5
            java.lang.String r5 = "current bond state is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r5, r4)
            java.lang.String r4 = nu0.C109758a.f328509a
            if (r4 != 0) goto L_0x016f
            java.lang.String r0 = r1.getAddress()
            nu0.C109758a.f328509a = r0
            goto L_0x0451
        L_0x016f:
            java.lang.String r1 = r1.getAddress()
            java.lang.String r4 = nu0.C109758a.f328509a
            boolean r1 = gy3.C87412m.m108589b(r1, r4)
            if (r1 == 0) goto L_0x01b0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "dkbt onReceive action["
            r1.append(r4)
            r1.append(r0)
            java.lang.String r0 = "] state:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            if (r2 == 0) goto L_0x01a6
            if (r2 == r12) goto L_0x019d
            goto L_0x0451
        L_0x019d:
            qu0.C110472b.f330368d = r7
            pu0.b$a r0 = pu0.C110248b.f329777h
            r0.mo161668m(r11)
            goto L_0x0451
        L_0x01a6:
            pu0.b$a r0 = pu0.C110248b.f329777h
            r0.mo161668m(r3)
            r0 = 0
            nu0.C109758a.f328509a = r0
            goto L_0x0451
        L_0x01b0:
            nu0.C109758a.f328510b = r8
            java.lang.String r0 = "current run device change and not allow to stop"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            goto L_0x0451
        L_0x01b9:
            android.os.Parcelable r0 = r1.getParcelableExtra(r14)
            android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            if (r0 != 0) goto L_0x01c6
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r13)
            goto L_0x0451
        L_0x01c6:
            java.lang.String r1 = nu0.C109758a.f328509a
            java.lang.String r2 = r0.getAddress()
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            if (r1 != 0) goto L_0x0451
            java.lang.String r0 = r0.getAddress()
            nu0.C109758a.f328509a = r0
            nu0.C109758a.f328510b = r7
            pu0.b$a r0 = pu0.C110248b.f329777h
            r0.mo161668m(r8)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r1 = nu0.C109758a.f328509a
            r0[r8] = r1
            java.lang.String r1 = "android pie switch bt device,%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r1, r0)
            goto L_0x0451
        L_0x01ec:
            android.os.Parcelable r0 = r1.getParcelableExtra(r14)
            android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            if (r0 != 0) goto L_0x01f9
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r13)
            goto L_0x0451
        L_0x01f9:
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_audio_bluetooth_forbid_use_sco
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r5 == 0) goto L_0x0200
            goto L_0x0217
        L_0x0200:
            gj.c r5 = p156gj.C107835h0.f322846c
            int r5 = r5.f322769t
            if (r5 == r6) goto L_0x0219
            if (r5 == r7) goto L_0x0217
            if (r5 == r12) goto L_0x0215
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.h r2 = (h81.C32735h) r2
            boolean r1 = r2.mo58784wf(r1, r8)
            goto L_0x0223
        L_0x0215:
            r1 = 0
            goto L_0x0223
        L_0x0217:
            r1 = 1
            goto L_0x0223
        L_0x0219:
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.h r2 = (h81.C32735h) r2
            boolean r1 = r2.mo58784wf(r1, r8)
        L_0x0223:
            if (r1 == 0) goto L_0x0236
            android.bluetooth.BluetoothClass r1 = r0.getBluetoothClass()
            int r1 = r1.getDeviceClass()
            r2 = 1032(0x408, float:1.446E-42)
            if (r1 != r2) goto L_0x0233
            r1 = 1
            goto L_0x0234
        L_0x0233:
            r1 = 0
        L_0x0234:
            qu0.C110472b.f330368d = r1
        L_0x0236:
            java.lang.String r1 = nu0.C109758a.f328512d
            java.lang.String r2 = r0.getAddress()
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            if (r1 != 0) goto L_0x0451
            android.bluetooth.BluetoothClass r1 = r0.getBluetoothClass()
            if (r1 == 0) goto L_0x02dc
            int r2 = r1.getMajorDeviceClass()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r1 = r1.getDeviceClass()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Class<pu0.b> r5 = pu0.C110248b.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            java.lang.String r6 = "getService(SubCoreAudio::class.java)"
            gy3.C87412m.m108593f(r5, r6)
            pu0.b r5 = (pu0.C110248b) r5
            java.lang.String[] r5 = r5.f329781g
            r5 = r5[r8]
            java.lang.String r6 = r0.getName()
            java.lang.String r13 = r0.getAddress()
            java.lang.String r14 = "caller"
            gy3.C87412m.m108594g(r5, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "report audio device bt status \n deviceType: "
            r14.append(r15)
            r14.append(r9)
            java.lang.String r15 = " \n majorClass:"
            r14.append(r15)
            r14.append(r2)
            java.lang.String r15 = "\n deviceClass:"
            r14.append(r15)
            r14.append(r1)
            java.lang.String r15 = "\n caller:"
            r14.append(r15)
            r14.append(r5)
            java.lang.String r15 = "\n errorCode:"
            r14.append(r15)
            r14.append(r8)
            java.lang.String r15 = "\n deviceName:"
            r14.append(r15)
            r14.append(r6)
            java.lang.String r15 = "\n deviceAddress:"
            r14.append(r15)
            r14.append(r13)
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "MicroMsg.AudioReportUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r14)
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
            r4[r8] = r15
            r4[r7] = r2
            r4[r12] = r1
            r4[r10] = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r4[r9] = r1
            r4[r11] = r6
            r4[r3] = r13
            r1 = 21246(0x52fe, float:2.9772E-41)
            r14.mo160140o(r1, r7, r7, r4)
        L_0x02dc:
            java.lang.String r0 = r0.getAddress()
            nu0.C109758a.f328512d = r0
            nu0.C109758a.f328511c = r8
            qu0.C110472b.f330368d = r7
            goto L_0x0451
        L_0x02e8:
            r0 = 10
            java.lang.String r2 = "android.bluetooth.adapter.extra.STATE"
            int r2 = r1.getIntExtra(r2, r0)
            java.lang.String r3 = "android.bluetooth.adapter.extra.PREVIOUS_STATE"
            int r1 = r1.getIntExtra(r3, r0)
            java.lang.Object[] r3 = new java.lang.Object[r12]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3[r8] = r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r7] = r1
            java.lang.String r1 = "onReceive bluetooth state changed: %s, prevState: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r1, r3)
            if (r2 != r0) goto L_0x0310
            pu0.b$a r1 = pu0.C110248b.f329777h
            r1.mo161668m(r7)
        L_0x0310:
            java.lang.String r1 = "BluetoothStateReceiver.onReceive()"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r1)
            android.bluetooth.BluetoothAdapter r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            if (r1 == 0) goto L_0x0451
            int r2 = r1.getState()
            r3 = 12
            r4 = 11921(0x2e91, float:1.6705E-41)
            if (r2 != r3) goto L_0x0333
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r2[r8] = r3
            r0.mo160131h(r4, r2)
            goto L_0x0346
        L_0x0333:
            int r2 = r1.getState()
            if (r2 != r0) goto L_0x0346
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r2[r8] = r3
            r0.mo160131h(r4, r2)
        L_0x0346:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[oneliang]bluetoothAdapter state:"
            r0.append(r2)
            int r1 = r1.getState()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            goto L_0x0451
        L_0x0360:
            boolean r0 = f40.C86709a0.m107522a()
            if (r0 != 0) goto L_0x0368
            goto L_0x0451
        L_0x0368:
            int r0 = r1.getIntExtra(r4, r6)     // Catch:{ Exception -> 0x036d }
            goto L_0x037b
        L_0x036d:
            r0 = move-exception
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r4)
            r0[r8] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r3, r0)
            r0 = 0
        L_0x037b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "dkbt  action :"
            r3.append(r4)
            java.lang.String r1 = r18.getAction()
            r3.append(r1)
            java.lang.String r1 = " state:"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r1)
            java.lang.String r1 = nu0.C109758a.f328509a
            if (r1 == 0) goto L_0x03ac
            if (r0 != 0) goto L_0x03ac
            boolean r1 = nu0.C109758a.f328510b
            if (r1 == 0) goto L_0x03ac
            java.lang.String r0 = "current run a active device changed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            goto L_0x0451
        L_0x03ac:
            if (r0 == 0) goto L_0x043a
            if (r0 == r7) goto L_0x03b2
            goto L_0x0451
        L_0x03b2:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 == 0) goto L_0x03b8
            r0 = 1
            goto L_0x03ca
        L_0x03b8:
            gj.c r0 = p156gj.C107835h0.f322846c
            int r0 = r0.f322771u
            if (r0 != r6) goto L_0x03ca
            di3.d r0 = di3.C86312j.m106911c(r2)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_audio_bluetooth_forbid_use_sco_strategy
            int r0 = r0.mo58779Qe(r1, r7)
        L_0x03ca:
            if (r0 == 0) goto L_0x0434
            int r0 = nu0.C109758a.f328511c
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r1 == 0) goto L_0x03d4
            r1 = 2
            goto L_0x03e6
        L_0x03d4:
            gj.c r1 = p156gj.C107835h0.f322846c
            int r1 = r1.f322775w
            if (r1 != r6) goto L_0x03e6
            di3.d r1 = di3.C86312j.m106911c(r2)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_audio_bluetooth_forbid_use_sco_request_times
            int r1 = r1.mo58779Qe(r2, r12)
        L_0x03e6:
            if (r0 < r1) goto L_0x0403
            long r0 = nu0.C109758a.f328513e
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0403
            java.lang.String r0 = "aim at the sco connect limited"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            nu0.C109758a.f328511c = r8
            qu0.C110472b.f330368d = r8
            pu0.b$a r0 = pu0.C110248b.f329777h
            r0.mo161668m(r10)
            goto L_0x0451
        L_0x0403:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "not aim at the sco connect limited "
            r0.append(r1)
            int r1 = nu0.C109758a.f328511c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            int r0 = nu0.C109758a.f328511c
            if (r0 != 0) goto L_0x0423
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            nu0.C109758a.f328513e = r0
        L_0x0423:
            int r0 = nu0.C109758a.f328511c
            int r0 = r0 + r7
            nu0.C109758a.f328511c = r0
            java.lang.String r0 = "sco connected!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)
            boolean r0 = nu0.C109758a.f328510b
            if (r0 == 0) goto L_0x0434
            nu0.C109758a.f328510b = r8
        L_0x0434:
            pu0.b$a r0 = pu0.C110248b.f329777h
            r0.mo161668m(r12)
            goto L_0x0451
        L_0x043a:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            gj.m r1 = p156gj.C107835h0.f322856m
            int r1 = r1.f322889b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r8] = r1
            java.lang.String r1 = "sco disconnected!getStopBluetoothInBR = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r1, r0)
            pu0.b$a r0 = pu0.C110248b.f329777h
            r0.mo161668m(r10)
        L_0x0451:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.audio.broadcast.bluetooth.BluetoothReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
