package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import java.net.URLDecoder;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49589gp;
import te3.C77931fp;

/* renamed from: com.tencent.mm.plugin.remittance.model.p */
public class C70608p extends C75113f0 {

    /* renamed from: r */
    public C49589gp f204280r;

    public C70608p(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77931fp();
        bVar.f127067b = new C49589gp();
        bVar.f127069d = 2736;
        bVar.f127068c = "/cgi-bin/mmpay-bin/f2fdynamiccode";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C77931fp fpVar = (C77931fp) a.f127055a.f127080a;
        fpVar.f227408d = i;
        fpVar.f227409e = str;
        fpVar.f227410f = str2;
        fpVar.f227411g = URLDecoder.decode(str3);
        fpVar.f227412h = str4;
        fpVar.f227413i = str5;
        fpVar.f227414j = str6;
        fpVar.f227415n = str7;
        fpVar.f227416o = str8;
        Log.m105925i("MicroMsg.NetSceneF2fDynamicCode", "amount: %s, username: %s, transfer_code_id: %s", Integer.valueOf(i), str, URLDecoder.decode(str3));
    }

    public int getType() {
        return 2736;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneF2fDynamicCode", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49589gp gpVar = (C49589gp) ((C47350c) uVar).f127056b.f127083a;
        this.f204280r = gpVar;
        Log.m105925i("MicroMsg.NetSceneF2fDynamicCode", "retcode: %s, retmsg: %s", Integer.valueOf(gpVar.f134179d), this.f204280r.f134180e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C49589gp gpVar = (C49589gp) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = gpVar.f134179d;
        this.f221038h = gpVar.f134180e;
    }
}
