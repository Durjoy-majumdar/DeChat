package com.tencent.p014mm.plugin.exdevice.model;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GetA8KeyRedirectEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tavkit.component.TAVPlayer;
import f40.C86709a0;
import nj3.C76879j;
import ob0.C11385n;

/* renamed from: com.tencent.mm.plugin.exdevice.model.o1 */
public class C41152o1 extends IStaticListener<GetA8KeyRedirectEvent> implements C11385n {

    /* renamed from: d */
    public ProgressDialog f110865d;

    /* renamed from: e */
    public GetA8KeyRedirectEvent f110866e;

    public boolean callback(IEvent iEvent) {
        Context context;
        GetA8KeyRedirectEvent getA8KeyRedirectEvent = (GetA8KeyRedirectEvent) iEvent;
        if (!(getA8KeyRedirectEvent instanceof GetA8KeyRedirectEvent)) {
            Log.m105922f("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "mismatched event");
        } else {
            this.f110866e = getA8KeyRedirectEvent;
            GetA8KeyRedirectEvent.C40113a aVar = getA8KeyRedirectEvent.f107573d;
            String str = aVar.f107576b;
            Log.m105925i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "action = %s, key = %s", Integer.valueOf(aVar.f107575a), str);
            if (!Util.isNullOrNil(str)) {
                GetA8KeyRedirectEvent.C40113a aVar2 = this.f110866e.f107573d;
                if (aVar2.f107575a == 15 && (context = aVar2.f107577c) != null && (context instanceof Activity)) {
                    C86709a0.m107529k().f251779b.mo123455a(TAVPlayer.VIDEO_PLAYER_WIDTH, this);
                    C41124e1 e1Var = new C41124e1(str);
                    C86709a0.m107529k().f251779b.mo123460f(e1Var);
                    Context context2 = this.f110866e.f107573d.f107577c;
                    this.f110865d = C76879j.m92724R(context2, context2.getString(C0966R.string.a3h), this.f110866e.f107573d.f107577c.getString(C0966R.string.f361235id1), true, true, new C41150n1(this, e1Var));
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void mo64214d() {
        Runnable runnable;
        GetA8KeyRedirectEvent getA8KeyRedirectEvent = this.f110866e;
        if (getA8KeyRedirectEvent != null && (runnable = getA8KeyRedirectEvent.callback) != null) {
            getA8KeyRedirectEvent.f107574e.f107579a = 1;
            runnable.run();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0078, code lost:
        r1 = r1.f127056b.f127083a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x065e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r31, int r32, java.lang.String r33, ob0.C117747y r34) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onSceneEnd errType = "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ", errCode = "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = ",errMsg = "
            r4.append(r5)
            r5 = r33
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            android.app.ProgressDialog r4 = r0.f110865d
            if (r4 == 0) goto L_0x003f
            boolean r4 = r4.isShowing()
            if (r4 == 0) goto L_0x003f
            android.app.ProgressDialog r4 = r0.f110865d
            r4.dismiss()
        L_0x003f:
            if (r34 != 0) goto L_0x0045
            r30.mo64214d()
            return
        L_0x0045:
            java.lang.String r4 = "scene.getType() = %s"
            r6 = 1
            r7 = 0
            if (r1 != 0) goto L_0x0664
            if (r2 == 0) goto L_0x0050
            goto L_0x0664
        L_0x0050:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            int r2 = r34.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r7] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r1)
            int r1 = r34.getType()
            r2 = 540(0x21c, float:7.57E-43)
            if (r1 != r2) goto L_0x0663
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            r1.mo123470p(r2, r0)
            r1 = r34
            com.tencent.mm.plugin.exdevice.model.e1 r1 = (com.tencent.p014mm.plugin.exdevice.model.C41124e1) r1
            ob0.c r1 = r1.f110791e
            if (r1 == 0) goto L_0x0081
            ob0.c$d r1 = r1.f127056b
            pe3.a r1 = r1.f127083a
            if (r1 == 0) goto L_0x0081
            te3.yx3 r1 = (te3.C52182yx3) r1
            goto L_0x0082
        L_0x0081:
            r1 = 0
        L_0x0082:
            if (r1 != 0) goto L_0x008e
            java.lang.String r1 = "resp == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            r30.mo64214d()
            return
        L_0x008e:
            te3.hf2 r4 = r1.f145561e
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r10 = r4.f134597e
            r9[r7] = r10
            java.lang.String r10 = r4.f134596d
            r9[r6] = r10
            java.lang.String r10 = "deviceId = %s, deviceType = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r9)
            te3.if2 r9 = r1.f145562f
            r10 = 6
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r11 = r9.f135284e
            r10[r7] = r11
            java.lang.String r11 = r9.f135283d
            r10[r6] = r11
            int r11 = r9.f135288i
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r8] = r11
            r11 = 3
            java.lang.String r12 = r9.f135286g
            r10[r11] = r12
            r11 = 4
            int r12 = r9.f135287h
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r10[r11] = r12
            r11 = 5
            java.lang.String r12 = r9.f135285f
            r10[r11] = r12
            java.lang.String r11 = "AuthKey = %s, BrandName = %s, CloseStrategy = %s, ConnProto = %s, ConnStrategy = %s, Mac = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r11, r10)
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            te3.k4 r11 = r1.f145565i
            java.lang.String r12 = ""
            if (r11 == 0) goto L_0x00e9
            java.lang.String r13 = r11.f136537d
            if (r13 == 0) goto L_0x00dd
            goto L_0x00de
        L_0x00dd:
            r13 = r12
        L_0x00de:
            java.lang.String r14 = r11.f136539f
            if (r14 == 0) goto L_0x00e3
            r12 = r14
        L_0x00e3:
            java.util.LinkedList<te3.ib4> r11 = r11.f136538e
            if (r11 == 0) goto L_0x00ea
            r10 = r11
            goto L_0x00ea
        L_0x00e9:
            r13 = r12
        L_0x00ea:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r14 = r10.size()
            if (r14 <= 0) goto L_0x0116
            r14 = 0
        L_0x00f6:
            int r15 = r10.size()
            if (r14 >= r15) goto L_0x0116
            java.lang.Object r15 = r10.get(r14)
            te3.ib4 r15 = (te3.ib4) r15
            java.lang.String r8 = r15.f135202d
            java.lang.String r2 = "text"
            boolean r2 = r8.contains(r2)
            if (r2 == 0) goto L_0x0112
            java.lang.String r2 = r15.f135203e
            r11.add(r2)
        L_0x0112:
            int r14 = r14 + 1
            r8 = 2
            goto L_0x00f6
        L_0x0116:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r8 = r1.f145563g
            r2[r7] = r8
            java.lang.String r8 = "resp.BindTicket = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r2)
            int r2 = r1.f145564h
            java.lang.String r8 = "bind_ticket"
            java.lang.String r10 = "device_brand_name"
            java.lang.String r14 = "device_icon_url"
            java.lang.String r15 = "device_desc"
            java.lang.String r7 = "device_title"
            r16 = r3
            java.lang.String r3 = "device_type"
            java.lang.String r0 = "device_id"
            if (r2 != r6) goto L_0x01e7
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r6 = "device_scan_mode"
            r34 = r11
            java.lang.String r11 = "SCAN_CATALOG"
            r2.putExtra(r6, r11)
            java.lang.String r6 = r9.f135286g
            java.lang.String r11 = "3"
            boolean r6 = r6.contains(r11)
            if (r6 != 0) goto L_0x015b
            java.lang.String r6 = r9.f135286g
            java.lang.String r11 = "1"
            boolean r6 = r6.contains(r11)
            if (r6 == 0) goto L_0x0159
            goto L_0x015b
        L_0x0159:
            r6 = 0
            goto L_0x015c
        L_0x015b:
            r6 = 1
        L_0x015c:
            java.lang.String r11 = r9.f135286g
            r17 = r12
            java.lang.String r12 = "4"
            boolean r11 = r11.contains(r12)
            if (r6 == 0) goto L_0x0170
            if (r11 == 0) goto L_0x0170
            java.lang.String r0 = "Category connect proto can not be blue&wifi at the same time..."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            return
        L_0x0170:
            java.lang.String r5 = "device_scan_conn_proto"
            if (r6 == 0) goto L_0x017a
            java.lang.String r6 = "blue"
            r2.putExtra(r5, r6)
            goto L_0x0182
        L_0x017a:
            if (r11 == 0) goto L_0x0182
            java.lang.String r6 = "wifi"
            r2.putExtra(r5, r6)
        L_0x0182:
            java.lang.String r5 = r4.f134597e
            r2.putExtra(r0, r5)
            java.lang.String r0 = r4.f134596d
            r2.putExtra(r3, r0)
            java.lang.String r0 = r9.f135295s
            r2.putExtra(r7, r0)
            java.lang.String r0 = r9.f135296t
            r2.putExtra(r15, r0)
            java.lang.String r0 = r9.f135293q
            r2.putExtra(r14, r0)
            java.lang.String r0 = r9.f135297u
            java.lang.String r3 = "device_category_id"
            r2.putExtra(r3, r0)
            java.lang.String r0 = r9.f135283d
            r2.putExtra(r10, r0)
            java.lang.String r0 = r1.f145563g
            r2.putExtra(r8, r0)
            long r0 = r9.f135300x
            java.lang.String r3 = "device_ble_simple_proto"
            r2.putExtra(r3, r0)
            java.lang.String r0 = "device_airkiss_key"
            r2.putExtra(r0, r13)
            java.lang.String r0 = "device_airkiss_title"
            r12 = r17
            r2.putExtra(r0, r12)
            java.lang.String r0 = "device_airkiss_steps"
            r1 = r34
            r2.putStringArrayListExtra(r0, r1)
            r0 = r30
            com.tencent.mm.autogen.events.GetA8KeyRedirectEvent r1 = r0.f110866e
            com.tencent.mm.autogen.events.GetA8KeyRedirectEvent$a r1 = r1.f107573d
            android.content.Context r1 = r1.f107577c
            java.lang.String r3 = "exdevice"
            java.lang.String r4 = ".ui.ExdeviceBindDeviceGuideUI"
            r5 = 0
            ke3.C88144b.m109791i(r1, r3, r4, r2, r5)
            com.tencent.mm.autogen.events.GetA8KeyRedirectEvent r1 = r0.f110866e
            if (r1 == 0) goto L_0x01e6
            java.lang.Runnable r2 = r1.callback
            if (r2 == 0) goto L_0x01e6
            com.tencent.mm.autogen.events.GetA8KeyRedirectEvent$b r1 = r1.f107574e
            r3 = 2
            r1.f107579a = r3
            r2.run()
        L_0x01e6:
            return
        L_0x01e7:
            r2 = r0
            r0 = r30
            te3.jy2 r6 = r1.f145560d
            if (r6 != 0) goto L_0x01f7
            java.lang.String r1 = "mContact == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            r30.mo64214d()
            return
        L_0x01f7:
            com.tencent.mm.autogen.events.GetA8KeyRedirectEvent r11 = r0.f110866e
            if (r11 == 0) goto L_0x0207
            java.lang.Runnable r12 = r11.callback
            if (r12 == 0) goto L_0x0207
            com.tencent.mm.autogen.events.GetA8KeyRedirectEvent$b r11 = r11.f107574e
            r13 = 2
            r11.f107579a = r13
            r12.run()
        L_0x0207:
            te3.rv3 r11 = r6.f136424d
            java.lang.String r11 = sf0.C48374j0.m53718g(r11)
            java.lang.String r12 = r6.f136419Z
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r13 == 0) goto L_0x0232
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r13 == 0) goto L_0x0232
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r17 = 0
            r13[r17] = r11
            r11 = 1
            r13[r11] = r12
            java.lang.String r12 = "processModContact user is null user:%s enuser:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r12, r13)
            r34 = r8
            goto L_0x0260
        L_0x0232:
            r13 = 1
            r17 = 0
            r34 = r8
            java.lang.Object[] r8 = new java.lang.Object[r13]
            r8[r17] = r11
            java.lang.String r13 = "processModContact : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r13, r8)
            k40.a r8 = f40.C86709a0.m107533q(r16)
            f62.k0 r8 = (f62.C75700k0) r8
            com.tencent.mm.storage.u3 r8 = r8.mo96097Ni()
            com.tencent.mm.storage.z1 r8 = r8.get(r11)
            if (r8 == 0) goto L_0x026e
            java.lang.String r13 = r8.mo73978v2()
            boolean r13 = r11.equals(r13)
            if (r13 == 0) goto L_0x026e
            java.lang.String r8 = "cat's replace user with stranger"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r8)
        L_0x0260:
            r17 = r1
            r19 = r2
            r21 = r3
            r31 = r4
            r18 = r14
            r20 = r15
            goto L_0x053e
        L_0x026e:
            com.tencent.mm.storage.z1 r13 = new com.tencent.mm.storage.z1
            r13.<init>(r11)
            r17 = r1
            java.lang.String r1 = r6.f136395J
            r13.mo62857I2(r1)
            int r1 = r6.f136436j
            r18 = r14
            int r14 = r6.f136441n
            r1 = r1 & r14
            r13.setType(r1)
            r1 = r15
            long r14 = r6.f136457u1
            r20 = r1
            r19 = r2
            long r1 = r6.f136459v1
            long r1 = r1 & r14
            r13.mo73961b3(r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r1 != 0) goto L_0x029b
            r13.mo62874S2(r12)
            goto L_0x02a9
        L_0x029b:
            if (r8 == 0) goto L_0x02a9
            long r1 = r8.f108320R1
            int r2 = (int) r1
            if (r2 <= 0) goto L_0x02a9
            java.lang.String r1 = r8.mo73978v2()
            r13.mo62874S2(r1)
        L_0x02a9:
            if (r8 != 0) goto L_0x02ae
            r14 = 0
            goto L_0x02b2
        L_0x02ae:
            long r14 = r8.f108320R1
            int r15 = (int) r14
            long r14 = (long) r15
        L_0x02b2:
            r13.f108320R1 = r14
            te3.rv3 r14 = r6.f136426e
            java.lang.String r14 = sf0.C48374j0.m53718g(r14)
            r13.mo62878U2(r14)
            te3.rv3 r14 = r6.f136428f
            java.lang.String r14 = sf0.C48374j0.m53718g(r14)
            r13.mo62882W2(r14)
            te3.rv3 r14 = r6.f136430g
            java.lang.String r14 = sf0.C48374j0.m53718g(r14)
            r13.mo62884X2(r14)
            int r14 = r6.f136432h
            r13.mo62900f4(r14)
            int r14 = r6.f136452s
            r13.mo62866N3(r14)
            te3.rv3 r14 = r6.f136458v
            java.lang.String r14 = sf0.C48374j0.m53718g(r14)
            r13.mo62872R2(r14)
            int r14 = r6.f136460w
            r13.mo62861K3(r14)
            int r14 = r6.f136387B
            r13.mo62889Z3(r14)
            java.lang.String r14 = r6.f136405S
            java.lang.String r15 = r6.f136464y
            java.lang.String r1 = r6.f136466z
            java.lang.String r1 = com.tencent.p014mm.storage.RegionCodeDecoder.m124564q(r14, r15, r1)
            r13.mo62893c4(r1)
            java.lang.String r1 = r6.f136386A
            r13.mo62902g4(r1)
            int r1 = r6.f136389D
            r13.mo62894d3(r1)
            java.lang.String r1 = r6.f136390E
            r13.mo62925q4(r1)
            int r1 = r6.f136392G
            r13.mo62912k4(r1)
            int r1 = r6.f136398M
            r13.mo62896e3(r1)
            java.lang.String r1 = r6.f136397L
            r13.mo62899f3(r1)
            java.lang.String r1 = r6.f136393H
            boolean r1 = eb0.C45628s0.m50754S(r1)
            if (r1 == 0) goto L_0x0324
            java.lang.String r1 = r6.f136393H
            r13.mo62928s4(r1)
        L_0x0324:
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r2 = (int) r1
            r13.mo62863L3(r2)
            te3.rv3 r1 = r6.f136445p
            java.lang.String r1 = sf0.C48374j0.m53718g(r1)
            r13.mo62860K2(r1)
            te3.rv3 r1 = r6.f136450r
            java.lang.String r1 = sf0.C48374j0.m53718g(r1)
            r13.mo62862L2(r1)
            te3.rv3 r1 = r6.f136448q
            java.lang.String r1 = sf0.C48374j0.m53718g(r1)
            r13.mo62864M2(r1)
            java.lang.String r1 = r6.f136418Y0
            r13.mo62895d4(r1)
            java.lang.String r1 = r6.f136420Z0
            r13.mo62897e4(r1)
            if (r8 == 0) goto L_0x0381
            java.lang.String r1 = r8.f149515T0
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            java.lang.String r2 = r6.f136420Z0
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0381
            xc0.g r1 = xc0.C78795g.m95196e()
            java.lang.String r1 = r1.mo108705b(r11)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r14 = 0
            r2[r14] = r11
            r14 = 1
            r2[r14] = r1
            java.lang.String r14 = "MicroMsg.RemarkImageStorage"
            java.lang.String r15 = "remove remark image: %s, path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r15, r2)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)
        L_0x0381:
            k40.a r1 = f40.C86709a0.m107533q(r16)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            r1.mo69718o4(r11)
            java.lang.String r1 = r13.getUsername()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x03a3
            java.lang.String r1 = "dkinit dealModContactExtInfo failed invalid contact"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            r21 = r3
            r31 = r4
            goto L_0x04a8
        L_0x03a3:
            java.lang.String r1 = r13.getUsername()
            java.lang.Class<ln.i> r2 = p196ln.C76708i.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ln.i r2 = (p196ln.C76708i) r2
            com.tencent.mm.modelavatar.n r2 = r2.mo106818Bq(r1, r6, r13)
            java.lang.Class<ln.g> r14 = p196ln.C76706g.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            ln.g r14 = (p196ln.C76706g) r14
            ln.n r14 = r14.mo106832eg()
            com.tencent.mm.modelavatar.o r14 = (com.tencent.p014mm.modelavatar.C68098o) r14
            r14.mo93608Yt(r2)
            te3.a94 r2 = r6.f136403R
            java.lang.String r14 = r13.getUsername()
            java.lang.String r15 = "@chatroom"
            boolean r14 = r14.endsWith(r15)
            if (r14 != 0) goto L_0x044c
            if (r2 == 0) goto L_0x044c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "SnsFlag modcontact "
            r14.append(r15)
            int r15 = r2.f130392d
            r14.append(r15)
            java.lang.String r15 = " "
            r14.append(r15)
            te3.rv3 r15 = r6.f136424d
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "SnsBg modcontact "
            r14.append(r15)
            java.lang.String r15 = r2.f130393e
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "SnsBgId modcontact "
            r14.append(r15)
            r21 = r3
            r31 = r4
            long r3 = r2.f130394f
            r14.append(r3)
            java.lang.String r3 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r15)
            int r4 = r2.f130395g
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            jr2.n r3 = jr2.C99019x.m128971c()
            if (r3 == 0) goto L_0x0450
            jr2.n r3 = jr2.C99019x.m128971c()
            java.lang.String r4 = r13.getUsername()
            os2.d0 r3 = (os2.C100399d0) r3
            r3.mo139792uP(r4, r2)
            goto L_0x0450
        L_0x044c:
            r21 = r3
            r31 = r4
        L_0x0450:
            java.lang.Class<rn.w> r2 = p227rn.C48054w.class
            java.lang.String r3 = eb0.C75592q0.m90789s()
            if (r3 == 0) goto L_0x04a8
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x04a8
            di3.d r3 = di3.C86312j.m106911c(r2)
            rn.w r3 = (p227rn.C48054w) r3
            rn.u r3 = r3.get(r1)
            xh.s0 r3 = (p749xh.C53349s0) r3
            r3.field_username = r1
            java.lang.String r1 = r6.f136411V
            r3.field_brandList = r1
            te3.r10 r1 = r6.f136413W
            if (r1 == 0) goto L_0x048b
            int r4 = r1.f140656d
            r3.field_brandFlag = r4
            java.lang.String r4 = r1.f140658f
            r3.field_brandInfo = r4
            java.lang.String r4 = r1.f140659g
            r3.field_brandIconURL = r4
            java.lang.String r1 = r1.f140657e
            r3.field_extInfo = r1
            r1 = 0
            r3.field_attrSyncVersion = r1
            r14 = 0
            r3.field_incrementUpdateTime = r14
        L_0x048b:
            di3.d r1 = di3.C86312j.m106911c(r2)
            rn.w r1 = (p227rn.C48054w) r1
            r4 = r3
            rn.u r4 = (p227rn.C48052u) r4
            boolean r1 = r1.mo72620Nf(r4)
            if (r1 != 0) goto L_0x04a3
            di3.d r1 = di3.C86312j.m106911c(r2)
            rn.w r1 = (p227rn.C48054w) r1
            r1.mo72621Uu(r4)
        L_0x04a3:
            int r1 = r3.field_type
            r13.mo62852D3(r1)
        L_0x04a8:
            int r1 = r6.f136416X0
            r13.mo62869P2(r1)
            te3.z3 r1 = r6.f136404R0
            if (r1 == 0) goto L_0x04cc
            te3.ao2 r1 = r1.f145664d
            if (r1 == 0) goto L_0x04cc
            java.lang.String r1 = r1.f130697e
            r13.mo62881V3(r1)
            te3.z3 r1 = r6.f136404R0
            te3.ao2 r1 = r1.f145664d
            java.lang.String r1 = r1.f130696d
            r13.mo62883W3(r1)
            te3.z3 r1 = r6.f136404R0
            te3.ao2 r1 = r1.f145664d
            java.lang.String r1 = r1.f130698f
            r13.mo62885X3(r1)
        L_0x04cc:
            boolean r1 = eb0.C45628s0.m50812z(r11)
            if (r1 == 0) goto L_0x04d5
            r13.mo62877T3()
        L_0x04d5:
            boolean r1 = r13.mo62916m3()
            if (r1 == 0) goto L_0x04de
            r13.mo62937v4()
        L_0x04de:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r1 != 0) goto L_0x04f2
            k40.a r1 = f40.C86709a0.m107533q(r16)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            r1.mo69678Y2(r12, r13)
            goto L_0x04ff
        L_0x04f2:
            k40.a r1 = f40.C86709a0.m107533q(r16)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            r1.mo69668Q3(r13)
        L_0x04ff:
            if (r8 == 0) goto L_0x053e
            int r1 = r8.getType()
            r1 = r1 & 2048(0x800, float:2.87E-42)
            int r2 = r13.getType()
            r2 = r2 & 2048(0x800, float:2.87E-42)
            if (r1 == r2) goto L_0x053e
            int r1 = r13.getType()
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x052b
            k40.a r1 = f40.C86709a0.m107533q(r16)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.v3 r1 = r1.mo96094Ku()
            java.lang.String r2 = r13.getUsername()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            r1.mo69766g0(r2)
            goto L_0x053e
        L_0x052b:
            k40.a r1 = f40.C86709a0.m107533q(r16)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.v3 r1 = r1.mo96094Ku()
            java.lang.String r2 = r13.getUsername()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            r1.mo69772j0(r2)
        L_0x053e:
            te3.rv3 r1 = r6.f136424d
            java.lang.String r1 = sf0.C48374j0.m53718g(r1)
            com.tencent.mm.autogen.events.GetA8KeyRedirectEvent r2 = r0.f110866e
            if (r2 == 0) goto L_0x065e
            com.tencent.mm.autogen.events.GetA8KeyRedirectEvent$a r2 = r2.f107573d
            if (r2 == 0) goto L_0x065e
            android.content.Context r2 = r2.f107577c
            if (r2 != 0) goto L_0x0552
            goto L_0x065e
        L_0x0552:
            k40.a r2 = f40.C86709a0.m107533q(r16)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r2.get(r1)
            if (r2 == 0) goto L_0x0663
            int r3 = r9.f135299w
            if (r3 == 0) goto L_0x0618
            java.lang.String r1 = "Jump to DeviceProfileUI."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            com.tencent.mm.autogen.events.GetA8KeyRedirectEvent r1 = r0.f110866e
            com.tencent.mm.autogen.events.GetA8KeyRedirectEvent$a r1 = r1.f107573d
            android.content.Context r1 = r1.f107577c
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI> r4 = com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceDeviceProfileUI.class
            r3.<init>(r1, r4)
            boolean r4 = r1 instanceof android.app.Activity
            if (r4 != 0) goto L_0x0581
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r4)
        L_0x0581:
            r4 = r31
            java.lang.String r5 = r4.f134597e
            r6 = r19
            r3.putExtra(r6, r5)
            java.lang.String r5 = r4.f134596d
            r8 = r21
            r3.putExtra(r8, r5)
            java.lang.String r5 = r9.f135285f
            java.lang.String r6 = "device_mac"
            r3.putExtra(r6, r5)
            java.lang.String r5 = r9.f135283d
            r3.putExtra(r10, r5)
            java.lang.String r5 = r9.f135292p
            java.lang.String r6 = "device_alias"
            r3.putExtra(r6, r5)
            java.lang.String r5 = r9.f135296t
            r6 = r20
            r3.putExtra(r6, r5)
            java.lang.String r5 = r9.f135295s
            r3.putExtra(r7, r5)
            java.lang.String r5 = r9.f135293q
            r6 = r18
            r3.putExtra(r6, r5)
            java.lang.String r5 = r9.f135294r
            java.lang.String r6 = "device_jump_url"
            r3.putExtra(r6, r5)
            r7 = r17
            java.lang.String r5 = r7.f145563g
            r6 = r34
            r3.putExtra(r6, r5)
            z71.c r5 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            java.lang.String r2 = r2.getUsername()
            java.lang.String r4 = r4.f134597e
            z71.b r2 = r5.mo74332TE(r2, r4)
            if (r2 == 0) goto L_0x05d9
            r6 = 1
            goto L_0x05da
        L_0x05d9:
            r6 = 0
        L_0x05da:
            java.lang.String r2 = "device_has_bound"
            r3.putExtra(r2, r6)
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r3)
            java.lang.Object[] r23 = r2.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/exdevice/model/SearchDeviceGetA8KeyRedirectListener"
            java.lang.String r25 = "onSceneEnd"
            java.lang.String r26 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r27 = "Undefined"
            java.lang.String r28 = "startActivity"
            java.lang.String r29 = "(Landroid/content/Intent;)V"
            r22 = r1
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            android.content.Intent r2 = (android.content.Intent) r2
            r1.startActivity(r2)
            java.lang.String r23 = "com/tencent/mm/plugin/exdevice/model/SearchDeviceGetA8KeyRedirectListener"
            java.lang.String r24 = "onSceneEnd"
            java.lang.String r25 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r26 = "Undefined"
            java.lang.String r27 = "startActivity"
            java.lang.String r28 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x065d
        L_0x0618:
            r4 = r31
            r7 = r17
            r6 = r19
            r8 = r21
            java.lang.String r2 = "Jump to ContactInfoUI."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "Contact_User"
            r2.putExtra(r3, r1)
            java.lang.String r1 = "KIsHardDevice"
            r3 = 1
            r2.putExtra(r1, r3)
            java.lang.String r1 = r7.f145563g
            java.lang.String r3 = "KHardDeviceBindTicket"
            r2.putExtra(r3, r1)
            java.lang.String r1 = r4.f134597e
            r2.putExtra(r6, r1)
            java.lang.String r1 = r4.f134596d
            r2.putExtra(r8, r1)
            java.lang.Class<om.f> r1 = p214om.C11502f.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            om.f r1 = (p214om.C11502f) r1
            wc3.z r1 = r1.mo11462yM()
            com.tencent.mm.autogen.events.GetA8KeyRedirectEvent r3 = r0.f110866e
            com.tencent.mm.autogen.events.GetA8KeyRedirectEvent$a r3 = r3.f107573d
            android.content.Context r3 = r3.f107577c
            com.tencent.mm.app.r1 r1 = (com.tencent.p014mm.app.C67654r1) r1
            r1.mo93174g(r2, r3)
        L_0x065d:
            return
        L_0x065e:
            java.lang.String r1 = "a8KeyRedirectEvent null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
        L_0x0663:
            return
        L_0x0664:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r34.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r4, r1)
            r30.mo64214d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C41152o1.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
