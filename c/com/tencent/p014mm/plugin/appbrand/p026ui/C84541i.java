package com.tencent.p014mm.plugin.appbrand.p026ui;

import ob0.l0$$e;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.i */
public class C84541i implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeUI$$p f246703d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandAuthorizeUI f246704e;

    public C84541i(AppBrandAuthorizeUI appBrandAuthorizeUI, AppBrandAuthorizeUI$$p appBrandAuthorizeUI$$p) {
        this.f246704e = appBrandAuthorizeUI;
        this.f246703d = appBrandAuthorizeUI$$p;
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x02aa  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo1488a(int r10, int r11, java.lang.String r12, ob0.C47350c r13, ob0.C117747y r14) {
        /*
            r9 = this;
            r14 = 3
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1 = 0
            r14[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r2 = 1
            r14[r2] = r0
            r0 = 2
            r14[r0] = r12
            java.lang.String r12 = "MicroMsg.AppBrandAuthorizeUI"
            java.lang.String r3 = "WxaAppModAuthReq errType = %d, errCode = %d, errMsg = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r3, r14)
            if (r10 != 0) goto L_0x02ae
            if (r11 == 0) goto L_0x0021
            goto L_0x02ae
        L_0x0021:
            ob0.c$d r10 = r13.f127056b
            pe3.a r10 = r10.f127083a
            te3.g55 r10 = (te3.g55) r10
            if (r10 != 0) goto L_0x0031
            java.lang.String r10 = "WxaAppModAuthReq failed, response is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r10)
        L_0x002e:
            r10 = 0
            goto L_0x02a1
        L_0x0031:
            te3.bp4 r11 = r10.f133872d
            int r13 = r11.f131249d
            java.lang.String r11 = r11.f131250e
            if (r13 != 0) goto L_0x0296
            java.lang.String r11 = "WxaAppModAuthReq OK!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r11)
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI r11 = r9.f246704e
            java.lang.String r13 = r11.f49759h
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x0049
            goto L_0x0060
        L_0x0049:
            java.util.LinkedList<te3.w7> r13 = r10.f133873e
            if (r13 == 0) goto L_0x0060
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x0054
            goto L_0x0060
        L_0x0054:
            com.tencent.mm.plugin.appbrand.ui.authrize.OnWxaAuthorizeScopeModifyEvent r13 = new com.tencent.mm.plugin.appbrand.ui.authrize.OnWxaAuthorizeScopeModifyEvent
            java.lang.String r11 = r11.f49759h
            java.util.LinkedList<te3.w7> r14 = r10.f133873e
            r13.<init>(r11, r14)
            r13.publish()
        L_0x0060:
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI r11 = r9.f246704e
            r11.getClass()
            java.util.LinkedList<te3.w7> r13 = r10.f133873e
            r14 = -1
            if (r13 == 0) goto L_0x00c7
            int r13 = r13.size()
            if (r13 > 0) goto L_0x0071
            goto L_0x00c7
        L_0x0071:
            java.util.LinkedList<te3.w7> r13 = r10.f133873e
            java.util.Iterator r13 = r13.iterator()
        L_0x0077:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x00c7
            java.lang.Object r3 = r13.next()
            te3.w7 r3 = (te3.C51793w7) r3
            java.lang.String r4 = r3.f143896d
            java.lang.String r5 = "scope.userInfo"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x008f
            goto L_0x0077
        L_0x008f:
            r13 = 0
        L_0x0090:
            java.util.List<te3.w7> r4 = r11.f49755d
            int r4 = r4.size()
            if (r13 >= r4) goto L_0x00ac
            java.util.List<te3.w7> r4 = r11.f49755d
            java.lang.Object r4 = r4.get(r13)
            te3.w7 r4 = (te3.C51793w7) r4
            java.lang.String r4 = r4.f143896d
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00a9
            goto L_0x00ad
        L_0x00a9:
            int r13 = r13 + 1
            goto L_0x0090
        L_0x00ac:
            r13 = -1
        L_0x00ad:
            if (r13 == r14) goto L_0x00ba
            java.util.List<te3.w7> r4 = r11.f49755d
            r4.remove(r13)
            java.util.List<te3.w7> r4 = r11.f49755d
            r4.add(r13, r3)
            goto L_0x00bf
        L_0x00ba:
            java.util.List<te3.w7> r13 = r11.f49755d
            r13.add(r3)
        L_0x00bf:
            com.tencent.mm.plugin.appbrand.ui.k r13 = new com.tencent.mm.plugin.appbrand.ui.k
            r13.<init>(r11, r3)
            r11.runOnUiThread(r13)
        L_0x00c7:
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI r11 = r9.f246704e
            r11.getClass()
            java.util.LinkedList<te3.w7> r13 = r10.f133873e
            if (r13 == 0) goto L_0x012d
            int r13 = r13.size()
            if (r13 > 0) goto L_0x00d7
            goto L_0x012d
        L_0x00d7:
            java.util.LinkedList<te3.w7> r13 = r10.f133873e
            java.util.Iterator r13 = r13.iterator()
        L_0x00dd:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x012d
            java.lang.Object r3 = r13.next()
            te3.w7 r3 = (te3.C51793w7) r3
            java.lang.String r4 = r3.f143896d
            java.lang.String r5 = "scope.userProfileChange"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x00f5
            goto L_0x00dd
        L_0x00f5:
            r13 = 0
        L_0x00f6:
            java.util.List<te3.w7> r4 = r11.f49755d
            int r4 = r4.size()
            if (r13 >= r4) goto L_0x0112
            java.util.List<te3.w7> r4 = r11.f49755d
            java.lang.Object r4 = r4.get(r13)
            te3.w7 r4 = (te3.C51793w7) r4
            java.lang.String r4 = r4.f143896d
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x010f
            goto L_0x0113
        L_0x010f:
            int r13 = r13 + 1
            goto L_0x00f6
        L_0x0112:
            r13 = -1
        L_0x0113:
            if (r13 == r14) goto L_0x0120
            java.util.List<te3.w7> r14 = r11.f49755d
            r14.remove(r13)
            java.util.List<te3.w7> r14 = r11.f49755d
            r14.add(r13, r3)
            goto L_0x0125
        L_0x0120:
            java.util.List<te3.w7> r13 = r11.f49755d
            r13.add(r3)
        L_0x0125:
            com.tencent.mm.plugin.appbrand.ui.l r13 = new com.tencent.mm.plugin.appbrand.ui.l
            r13.<init>(r11, r3)
            r11.runOnUiThread(r13)
        L_0x012d:
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI r11 = r9.f246704e
            java.util.List<te3.w7> r13 = r11.f49755d
            r11.getClass()
            if (r13 != 0) goto L_0x0137
            goto L_0x017d
        L_0x0137:
            r14 = 0
        L_0x0138:
            int r3 = r13.size()
            if (r14 >= r3) goto L_0x017d
            java.lang.Object r3 = r13.get(r14)
            te3.w7 r3 = (te3.C51793w7) r3
            java.lang.String r4 = r3.f143896d
            java.lang.String r5 = "scope.subscribemsg"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x017a
            int r13 = r3.f143898f
            if (r13 != r0) goto L_0x0155
            r13 = 1
            goto L_0x0156
        L_0x0155:
            r13 = 0
        L_0x0156:
            com.tencent.mm.autogen.events.UpdateWxaOptionsEvent r14 = new com.tencent.mm.autogen.events.UpdateWxaOptionsEvent
            r14.<init>()
            com.tencent.mm.autogen.events.UpdateWxaOptionsEvent$a r3 = r14.f193994d
            java.lang.String r11 = r11.f49759h
            r3.f193996a = r11
            if (r13 == 0) goto L_0x0164
            r0 = 1
        L_0x0164:
            r3.f193997b = r0
            r3.f193998c = r2
            r14.publish()
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r11[r1] = r13
            java.lang.String r13 = "updateSubscribeMsgItem banMsg:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r11)
            goto L_0x017d
        L_0x017a:
            int r14 = r14 + 1
            goto L_0x0138
        L_0x017d:
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI r11 = r9.f246704e
            java.util.List<te3.w7> r13 = r11.f49755d
            if (r13 != 0) goto L_0x0188
            r11.getClass()
            goto L_0x0248
        L_0x0188:
            java.lang.String r14 = r11.f49757f
            java.lang.String r0 = "scope.bluetoothBackground"
            if (r14 != 0) goto L_0x0190
            goto L_0x01bb
        L_0x0190:
            java.util.Iterator r14 = r13.iterator()
        L_0x0194:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x01bb
            java.lang.Object r3 = r14.next()
            te3.w7 r3 = (te3.C51793w7) r3
            if (r3 == 0) goto L_0x0194
            java.lang.String r4 = r3.f143896d
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0194
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.OnMonitorBluetoothDeviceAuthorizeStateEvent r14 = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.OnMonitorBluetoothDeviceAuthorizeStateEvent
            java.lang.String r4 = r11.f49757f
            int r3 = r3.f143898f
            if (r2 != r3) goto L_0x01b4
            r3 = 1
            goto L_0x01b5
        L_0x01b4:
            r3 = 0
        L_0x01b5:
            r14.<init>(r4, r3)
            r14.publish()
        L_0x01bb:
            java.util.Iterator r13 = r13.iterator()
            r14 = 0
            r3 = 0
            r4 = 0
        L_0x01c2:
            r5 = 0
        L_0x01c3:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x0236
            java.lang.Object r6 = r13.next()
            te3.w7 r6 = (te3.C51793w7) r6
            java.lang.String r7 = r6.f143896d
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x01ea
            java.lang.String r7 = r6.f143896d
            java.lang.String r8 = "scope.userLocation"
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L_0x01ea
            int r14 = r6.f143898f
            if (r14 != r2) goto L_0x01e8
            r14 = 1
            goto L_0x01c3
        L_0x01e8:
            r14 = 0
            goto L_0x01c3
        L_0x01ea:
            java.lang.String r7 = r6.f143896d
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0205
            java.lang.String r7 = r6.f143896d
            java.lang.String r8 = "scope.userLocationBackground"
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L_0x0205
            int r3 = r6.f143898f
            if (r3 != r2) goto L_0x0203
            r3 = 1
            goto L_0x01c3
        L_0x0203:
            r3 = 0
            goto L_0x01c3
        L_0x0205:
            java.lang.String r7 = r6.f143896d
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0220
            java.lang.String r7 = r6.f143896d
            java.lang.String r8 = "scope.bluetooth"
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L_0x0220
            int r4 = r6.f143898f
            if (r4 != r2) goto L_0x021e
            r4 = 1
            goto L_0x01c3
        L_0x021e:
            r4 = 0
            goto L_0x01c3
        L_0x0220:
            java.lang.String r7 = r6.f143896d
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x01c3
            java.lang.String r7 = r6.f143896d
            boolean r7 = r7.equalsIgnoreCase(r0)
            if (r7 == 0) goto L_0x01c3
            int r5 = r6.f143898f
            if (r5 != r2) goto L_0x01c2
            r5 = 1
            goto L_0x01c3
        L_0x0236:
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$AuthStateChangedByUserEvent r13 = new com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$AuthStateChangedByUserEvent
            r13.<init>()
            r13.f49776d = r14
            r13.f49777e = r3
            r13.f49778f = r4
            r13.f49779g = r5
            java.lang.String r11 = r11.f49757f
            com.tencent.p014mm.plugin.appbrand.ipc.C81964j.m100679b(r11, r13)
        L_0x0248:
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI r11 = r9.f246704e
            r11.getClass()
            java.util.LinkedList<te3.w7> r10 = r10.f133873e
            java.util.Iterator r10 = r10.iterator()
        L_0x0253:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x028c
            java.lang.Object r13 = r10.next()
            te3.w7 r13 = (te3.C51793w7) r13
            te3.uw3 r13 = r13.f143901i
            if (r13 == 0) goto L_0x0253
            androidx.appcompat.app.AppCompatActivity r3 = r11.getContext()
            pe3.b r10 = r13.f143167e
            java.lang.String r4 = r10.mo123705h()
            pe3.b r10 = r13.f143169g
            java.lang.String r5 = r10.mo123705h()
            pe3.b r10 = r13.f143168f
            java.lang.String r6 = r10.mo123705h()
            androidx.appcompat.app.AppCompatActivity r10 = r11.getContext()
            com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo r11 = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo
            r11.<init>(r13)
            com.tencent.mm.plugin.appbrand.jsapi.auth.p$a r7 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.C1620p.C1621a.m1657a(r10, r11)
            r8 = 0
            com.tencent.p014mm.plugin.appbrand.jsapi.auth.C1620p.m1656a(r3, r4, r5, r6, r7, r8)
            r10 = 1
            goto L_0x028d
        L_0x028c:
            r10 = 0
        L_0x028d:
            r10 = r10 ^ r2
            if (r10 != 0) goto L_0x02a1
            java.lang.String r11 = "Risk Intercepted!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            goto L_0x02a1
        L_0x0296:
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r1] = r11
            java.lang.String r11 = "WxaAppModAuthReq error %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r11, r10)
            goto L_0x002e
        L_0x02a1:
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI r11 = r9.f246704e
            com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandAuthorizeUI.m18563J7(r11)
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$$p r11 = r9.f246703d
            if (r11 == 0) goto L_0x02ad
            r11.mo22488a(r10)
        L_0x02ad:
            return r1
        L_0x02ae:
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI r10 = r9.f246704e
            com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandAuthorizeUI.m18563J7(r10)
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI r10 = r9.f246704e
            r11 = 2131821610(0x7f11042a, float:1.9275968E38)
            java.lang.String r11 = r10.getString(r11)
            android.widget.Toast r10 = nj3.C76912y0.makeText((android.content.Context) r10, (java.lang.CharSequence) r11, (int) r2)
            r10.show()
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$$p r10 = r9.f246703d
            if (r10 == 0) goto L_0x02ca
            r10.mo22488a(r1)
        L_0x02ca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.C84541i.mo1488a(int, int, java.lang.String, ob0.c, ob0.y):int");
    }
}
