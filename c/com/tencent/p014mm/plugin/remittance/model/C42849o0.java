package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50025jr;
import te3.C50167kr;

/* renamed from: com.tencent.mm.plugin.remittance.model.o0 */
public class C42849o0 extends C75113f0 {

    /* renamed from: r */
    public C50167kr f116041r;

    /* renamed from: s */
    public String f116042s;

    public C42849o0(String str, long j, String str2) {
        this.f116042s = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50025jr();
        bVar.f127067b = new C50167kr();
        bVar.f127069d = 4895;
        bVar.f127068c = "/cgi-bin/mmpay-bin/uniontransfer_msgcheck";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C50025jr jrVar = (C50025jr) a.f127055a.f127080a;
        jrVar.f136262d = str;
        jrVar.f136264f = str2;
        jrVar.f136263e = j;
        Log.m105919d("MicroMsg.NetSceneUnionTransferMsgCheck", "transferId:%s", str);
    }

    public int getType() {
        return 4895;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneUnionTransferMsgCheck", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C50167kr krVar = (C50167kr) ((C47350c) uVar).f127056b.f127083a;
        this.f116041r = krVar;
        Log.m105925i("MicroMsg.NetSceneUnionTransferMsgCheck", "ret_code: %s, ret_msg: %s", Integer.valueOf(krVar.f136994d), this.f116041r.f136995e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C50167kr krVar = (C50167kr) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = krVar.f136994d;
        this.f221038h = krVar.f136995e;
    }
}
