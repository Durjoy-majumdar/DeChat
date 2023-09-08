package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.util.WXWebReporter;
import eb0.C75592q0;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p823sg.C77710q;
import sf0.C48374j0;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.bq4;
import te3.cq4;

/* renamed from: com.tencent.mm.modelsimple.j0 */
public class C1307j0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f10427d;

    /* renamed from: e */
    public C47350c f10428e;

    /* renamed from: f */
    public long f10429f;

    public C1307j0(int i, String str, String str2, String str3, String str4, boolean z) {
        this(i, str, str2, str3, str4, z, 0);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f10427d = nVar;
        return dispatch(gVar, this.f10428e, this);
    }

    public int getType() {
        return 384;
    }

    /* renamed from: j1 */
    public String mo1225j1() {
        try {
            return ((cq4) this.f10428e.f127056b.f127083a).f131904f;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.NetSceneVerifyPswd", e, "", new Object[0]);
            return null;
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        updateDispatchId(i);
        C47350c cVar = this.f10428e;
        bq4 bq4 = (bq4) cVar.f127055a.f127080a;
        cq4 cq4 = (cq4) cVar.f127056b.f127083a;
        C51018qv3 qv32 = cq4.f131909n;
        if (qv32 != null && qv32.f140572d > 0) {
            Log.m105925i("MicroMsg.NetSceneVerifyPswd", "summerauth parseRet[%b], len[%d]", Boolean.valueOf(C86709a0.m107523b().mo121113k().mo182476f(this.f10429f, C48374j0.m53715d(cq4.f131909n))), Integer.valueOf(cq4.f131909n.f140572d));
            if (C86709a0.m107522a()) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MANUAL_AUTH_AS_QQ_ACCOUNT_BOOLEAN_SYNC, Boolean.TRUE);
            }
        }
        if (i2 == 0 && i3 == 0) {
            C86709a0.m107535s().mo121142i().mo119676J(77830, cq4.f131904f);
            C86709a0.m107535s().mo121142i().mo119676J(32, bq4.f131262e);
            C86709a0.m107535s().mo121142i().mo119676J(33, bq4.f131263f);
            C86709a0.m107535s().mo121142i().mo119676J(46, Util.encodeHexString(C48374j0.m53715d(cq4.f131906h)));
            String encodeHexString = Util.encodeHexString(C48374j0.m53715d(bq4.f131267j));
            C86709a0.m107535s().mo121142i().mo119676J(47, encodeHexString);
            C86709a0.m107535s().f251803a.mo119664f(18, encodeHexString);
            C86709a0.m107535s().mo121142i().mo119676J(-1535680990, cq4.f131908j);
            C51018qv3 qv33 = cq4.f131906h;
            int i4 = qv33 == null ? 0 : qv33.f140572d;
            String str2 = cq4.f131908j;
            int length = str2 == null ? 0 : str2.length();
            String str3 = cq4.f131904f;
            Log.m105925i("MicroMsg.NetSceneVerifyPswd", "A2Key.len %d, authKey.len: %d, ticketLen:%d", Integer.valueOf(i4), Integer.valueOf(length), Integer.valueOf(str3 == null ? 0 : str3.length()));
        } else if (i2 == 4) {
            C86709a0.m107535s().mo121142i().mo119676J(32, "");
            C86709a0.m107535s().mo121142i().mo119676J(33, "");
        }
        this.f10427d.onSceneEnd(i2, i3, str, this);
    }

    public C1307j0(int i, String str, String str2, String str3, String str4, boolean z, int i2) {
        this(i, str, str2, str3, str4, z, i2, true);
    }

    public C1307j0(int i, String str, String str2, String str3, String str4, boolean z, int i2, boolean z2) {
        int i3;
        String str5;
        byte[] bArr;
        this.f10429f = 0;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new bq4();
        bVar.f127067b = new cq4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/newverifypasswd";
        bVar.f127069d = 384;
        bVar.f127070e = WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS;
        bVar.f127071f = 1000000182;
        C47350c a = bVar.mo72403a();
        this.f10428e = a;
        bq4 bq4 = (bq4) a.f127055a.f127080a;
        bq4.f131261d = i;
        bq4.f131268n = i2;
        bq4.f131262e = Util.getFullPasswordMD5(str);
        bq4.f131263f = Util.getCutPasswordMD5(str);
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str2;
        rv32.f141176e = true;
        bq4.f131264g = rv32;
        C51163rv3 rv33 = new C51163rv3();
        rv33.f141175d = str3;
        rv33.f141176e = true;
        bq4.f131265h = rv33;
        C51163rv3 rv34 = new C51163rv3();
        rv34.f141175d = str4;
        rv34.f141176e = true;
        bq4.f131266i = rv34;
        if (i == 5 || i == 2) {
            this.f10429f = new C77710q(C75592q0.m90776f()).longValue();
            if (z) {
                bArr = C86709a0.m107523b().mo121113k().mo182473c(this.f10429f, str3);
            } else {
                bArr = C86709a0.m107523b().mo121113k().mo182474d(this.f10429f, Util.getFullPasswordMD5(str), z2);
            }
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(bArr);
            bq4.f131269o = qv32;
        }
        String nullAsNil = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(47, (Object) null));
        C51018qv3 qv33 = new C51018qv3();
        qv33.mo73350k(Util.decodeHexString(nullAsNil));
        bq4.f131267j = qv33;
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(bq4.f131261d);
        objArr[1] = Boolean.valueOf(z);
        objArr[2] = Boolean.valueOf(z2);
        C51018qv3 qv34 = bq4.f131269o;
        if (qv34 == null) {
            i3 = -1;
        } else {
            i3 = qv34.f140572d;
        }
        objArr[3] = Integer.valueOf(i3);
        C51018qv3 qv35 = bq4.f131269o;
        if (qv35 == null) {
            str5 = "null";
        } else {
            str5 = Util.secPrint(Util.dumpHex(qv35.f140574f.f257327a));
        }
        objArr[4] = str5;
        Log.m105925i("MicroMsg.NetSceneVerifyPswd", "summerauth opCode[%d], hasSecCode[%b], isManualAuth[%b], len:%d, content:[%s]", objArr);
    }
}
