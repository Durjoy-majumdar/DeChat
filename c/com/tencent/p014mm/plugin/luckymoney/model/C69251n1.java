package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import com.tencent.p014mm.wallet_core.model.JumpRemind;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONObject;
import te3.C51018qv3;
import te3.C51240sg2;
import te3.C64727tg2;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.n1 */
public abstract class C69251n1 extends C75123k0 {

    /* renamed from: d */
    public C11385n f199282d;

    /* renamed from: e */
    public C47350c f199283e;

    /* renamed from: f */
    public JumpRemind f199284f;

    /* renamed from: g */
    public C69252a f199285g;

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.n1$a */
    public interface C69252a {
        /* renamed from: a */
        int mo80266a(C47350c cVar, C1311n nVar);

        /* renamed from: b */
        boolean mo80267b();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f199282d = nVar;
        C69252a aVar = this.f199285g;
        if (aVar == null || !aVar.mo80267b()) {
            return dispatch(gVar, this.f199283e, this);
        }
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyBase", "do fack response: %s", mo95311j1());
        return this.f199285g.mo80266a(this.f199283e, this);
    }

    public int getCgicmdForKV() {
        return mo95404k1();
    }

    /* renamed from: j1 */
    public abstract String mo95311j1();

    /* renamed from: k1 */
    public int mo95404k1() {
        return -1;
    }

    /* renamed from: l1 */
    public void mo95405l1(int i, JSONObject jSONObject) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006f, code lost:
        if (r15.has("retmsg") == false) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r19, int r20, int r21, java.lang.String r22, com.tencent.p014mm.network.C114799u r23, byte[] r24, long r25) {
        /*
            r18 = this;
            r1 = r18
            r0 = r20
            r2 = r21
            r3 = r22
            java.lang.String r4 = "retcode"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Cmd : "
            r5.append(r6)
            int r7 = r18.mo95404k1()
            r5.append(r7)
            java.lang.String r7 = ", errType = "
            r5.append(r7)
            r5.append(r0)
            java.lang.String r8 = ", errCode = "
            r5.append(r8)
            r5.append(r2)
            java.lang.String r9 = ", errMsg = "
            r5.append(r9)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r10 = "MicroMsg.NetSceneLuckyMoneyBase"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
            r5 = r23
            ob0.c r5 = (ob0.C47350c) r5
            ob0.c$d r5 = r5.f127056b
            pe3.a r5 = r5.f127083a
            te3.tg2 r5 = (te3.C64727tg2) r5
            if (r0 != 0) goto L_0x0126
            if (r2 != 0) goto L_0x0126
            int r13 = r5.f185558e
            te3.qv3 r14 = r5.f185557d
            java.lang.String r14 = sf0.C48374j0.m53717f(r14)
            r16 = 1000(0x3e8, float:1.401E-42)
            if (r13 != 0) goto L_0x0120
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r13 != 0) goto L_0x0120
            int r13 = r5.f185561h
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e4 }
            r15.<init>(r14)     // Catch:{ Exception -> 0x00e4 }
            boolean r17 = r15.has(r4)     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r11 = "retmsg"
            if (r17 == 0) goto L_0x0071
            boolean r17 = r15.has(r11)     // Catch:{ Exception -> 0x00e4 }
            if (r17 != 0) goto L_0x0092
        L_0x0071:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e4 }
            r12.<init>()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r0 = r23.getUri()     // Catch:{ Exception -> 0x00e4 }
            r12.append(r0)     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r0 = " no retcode,retmsg"
            r12.append(r0)     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r0 = r12.toString()     // Catch:{ Exception -> 0x00e4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ Exception -> 0x00e4 }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x00e4 }
            r12 = 1698(0x6a2, float:2.38E-42)
            r2 = 11
            r0.mo175911u(r12, r2)     // Catch:{ Exception -> 0x00e4 }
        L_0x0092:
            int r0 = r15.getInt(r4)     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r2 = r5.f185562i     // Catch:{ Exception -> 0x00e4 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x00e4 }
            if (r4 == 0) goto L_0x00a2
            java.lang.String r2 = r15.optString(r11)     // Catch:{ Exception -> 0x00e4 }
        L_0x00a2:
            com.tencent.mm.wallet_core.model.JumpRemind r4 = com.tencent.p014mm.wallet_core.model.JumpRemind.m90058c(r15)     // Catch:{ Exception -> 0x00e4 }
            r1.f199284f = r4     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r4 = "showmess"
            boolean r4 = r15.has(r4)     // Catch:{ Exception -> 0x00e4 }
            if (r4 == 0) goto L_0x00cc
            r4 = 268502454(0x100105b6, float:2.5445164E-29)
            if (r0 == r4) goto L_0x00cc
            java.lang.String r0 = "has alert item"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ Exception -> 0x00e4 }
            r0 = 0
            b63.a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69224g2.m81568n1(r0, r15)     // Catch:{ Exception -> 0x00e4 }
            com.tencent.mm.autogen.events.Show261AlertEvent r2 = new com.tencent.mm.autogen.events.Show261AlertEvent     // Catch:{ Exception -> 0x00e4 }
            r2.<init>()     // Catch:{ Exception -> 0x00e4 }
            com.tencent.mm.autogen.events.Show261AlertEvent$a r4 = r2.f193934d     // Catch:{ Exception -> 0x00e4 }
            r4.f193935a = r0     // Catch:{ Exception -> 0x00e4 }
            r2.publish()     // Catch:{ Exception -> 0x00e4 }
            goto L_0x00d3
        L_0x00cc:
            if (r0 != 0) goto L_0x00d9
            if (r13 != 0) goto L_0x00d9
            r1.onGYNetEnd(r0, r2, r15)     // Catch:{ Exception -> 0x00e4 }
        L_0x00d3:
            r16 = r20
            r0 = r21
            r2 = r3
            goto L_0x00e2
        L_0x00d9:
            r1.mo95405l1(r0, r15)     // Catch:{ Exception -> 0x00e4 }
            if (r13 != 0) goto L_0x00e1
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            goto L_0x00e2
        L_0x00e1:
            r0 = r13
        L_0x00e2:
            r15 = r0
            goto L_0x00f9
        L_0x00e4:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r3, r2)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 2131839043(0x7f114843, float:1.9311326E38)
            java.lang.String r2 = r0.getString(r2)
            r15 = 2
        L_0x00f9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            int r3 = r18.mo95404k1()
            r0.append(r3)
            java.lang.String r3 = ", tenpayErrType : "
            r0.append(r3)
            r0.append(r13)
            java.lang.String r3 = ", resp = "
            r0.append(r3)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x0123
        L_0x0120:
            java.lang.String r2 = r5.f185559f
            r15 = 2
        L_0x0123:
            r0 = r16
            goto L_0x014d
        L_0x0126:
            java.lang.String r0 = "e"
            r2 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, r0, r2)
            if (r0 == 0) goto L_0x013e
            java.lang.String r2 = "CDN error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r2)
            java.lang.String r2 = ".e.Content"
            java.lang.Object r0 = r0.get(r2)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0149
        L_0x013e:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 2131839043(0x7f114843, float:1.9311326E38)
            java.lang.String r2 = r0.getString(r2)
        L_0x0149:
            r0 = r20
            r15 = r21
        L_0x014d:
            if (r0 == 0) goto L_0x0177
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            int r4 = r18.mo95404k1()
            r3.append(r4)
            r3.append(r7)
            r3.append(r0)
            r3.append(r8)
            r3.append(r15)
            r3.append(r9)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r3)
        L_0x0177:
            ob0.n r3 = r1.f199282d
            r3.onSceneEnd(r0, r15, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.model.C69251n1.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[], long):void");
    }

    public abstract void onGYNetEnd(int i, String str, JSONObject jSONObject);

    public void setRequestData(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        String s = C75592q0.m90789s();
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(s);
        if (z1Var != null) {
            map.put("province", z1Var.mo101230H4());
            map.put("city", z1Var.mo101228F4());
        }
        if (this.f199283e == null) {
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C51240sg2();
            bVar.f127067b = new C64727tg2();
            bVar.f127068c = mo95311j1();
            bVar.f127069d = getType();
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C47350c a = bVar.mo72403a();
            this.f199283e = a;
            a.setIsUserCmd(true);
        }
        C51240sg2 sg22 = (C51240sg2) this.f199283e.f127055a.f127080a;
        sg22.f141493d = mo95404k1();
        sg22.f141494e = 1;
        Object[] array = map.keySet().toArray();
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (Object obj : array) {
            String str = map.get(obj);
            if (!Util.isNullOrNil(str)) {
                if (z) {
                    sb.append("&");
                }
                sb.append(obj);
                sb.append("=");
                sb.append(str);
                z = true;
            }
        }
        Log.m105924i("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + sg22.f141493d + ", req = " + sb.toString());
        byte[] bytes = sb.toString().getBytes();
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bytes);
        sg22.f141495f = qv32;
    }
}
