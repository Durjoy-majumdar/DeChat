package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import md2.C47000b;
import ob0.C47350c;
import p763ym.C79138l;
import te3.C49222e24;
import te3.C49369f24;

/* renamed from: com.tencent.mm.pluginsdk.model.app.l1 */
public class C44573l1 extends C44549d1 {
    public C44573l1(String str, int i, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49222e24();
        bVar.f127067b = new C49369f24();
        bVar.f127068c = "/cgi-bin/micromsg-bin/setappsetting";
        bVar.f127069d = 396;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f120809d = a;
        C49222e24 e242 = (C49222e24) a.f127055a.f127080a;
        e242.f132649d = str;
        e242.f132650e = i;
        e242.f132651f = str2;
    }

    /* renamed from: a */
    public void mo69337a(byte[] bArr) {
        if (bArr == null) {
            Log.m105920e("MicroMsg.NetSceneSetAppSetting", "buf is null");
            return;
        }
        try {
            this.f120809d.f127056b.fromProtoBuf(bArr);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.NetSceneSetAppSetting", "parse error: " + e.getMessage());
            Log.printErrStackTrace("MicroMsg.NetSceneSetAppSetting", e, "", new Object[0]);
        }
    }

    /* renamed from: b */
    public int mo69338b() {
        return 2;
    }

    /* renamed from: c */
    public byte[] mo69339c() {
        try {
            return ((C47350c.C47353c) this.f120809d.getReqObj()).toProtoBuf();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.NetSceneSetAppSetting", "toProtBuf failed: " + e.getMessage());
            return null;
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C49369f24 f242;
        Log.m105924i("MicroMsg.NetSceneSetAppSetting", "errType = " + i2 + ", errCode = " + i3);
        if (i2 == 0 && i2 == 0 && (f242 = (C49369f24) this.f120809d.f127056b.f127083a) != null) {
            C44579p pVar = (C44579p) C47000b.C34548a.m40384a().mo72195FM();
            C44561j GW = ((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(f242.f133254d, false);
            if (GW != null) {
                GW.field_authFlag = f242.f133255e;
                boolean Ow = pVar.update(GW, new String[0]);
                Log.m105918d("MicroMsg.NetSceneSetAppSetting", "onGYNetEnd, update ret = " + Ow + ", appId = " + f242.f133254d);
            }
        }
    }
}
