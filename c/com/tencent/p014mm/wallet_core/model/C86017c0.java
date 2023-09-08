package com.tencent.p014mm.wallet_core.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.FileReaderHelper;
import ie3.C76328d;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49491fz3;
import te3.C90409ez3;

/* renamed from: com.tencent.mm.wallet_core.model.c0 */
public class C86017c0 extends C117747y implements C1311n {

    /* renamed from: d */
    public int f250494d = 2632;

    /* renamed from: e */
    public C11385n f250495e;

    /* renamed from: f */
    public final C47350c f250496f;

    /* renamed from: g */
    public C76328d.C76329a f250497g;

    public C86017c0(Map<String, Object> map, String str, String str2, int i, C76328d.C76329a aVar) {
        Log.m105924i("MicroMsg.NetSceneJSAPISecureTunnel", "new pay sercuretunnel netscene url :" + str + " appid: " + str2);
        this.f250497g = aVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C90409ez3();
        bVar.f127067b = new C49491fz3();
        bVar.f127068c = "/cgi-bin/mmpay-bin/securetunnel";
        bVar.f127069d = 2632;
        if (map.containsKey("timeout")) {
            bVar.f127074i = ((Integer) map.get("timeout")).intValue();
        }
        C47350c a = bVar.mo72403a();
        this.f250496f = a;
        C90409ez3 ez32 = (C90409ez3) a.f127055a.f127080a;
        ez32.f259504g = (String) map.get("reqbuf");
        ez32.f259501d = (String) map.get(FileReaderHelper.OPEN_FILE_FROM_CMD);
        ez32.f259503f = str;
        ez32.f259502e = str2;
        ez32.f259505h = i;
        ez32.f259506i = 0;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f250495e = nVar;
        Log.m105918d("MicroMsg.NetSceneJSAPISecureTunnel", "doScene");
        return dispatch(gVar, this.f250496f, this);
    }

    public int getType() {
        return this.f250494d;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneJSAPISecureTunnel", "onGYNetEnd, netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        if (this.f250497g != null) {
            Log.m105924i("MicroMsg.NetSceneJSAPISecureTunnel", "secureTunnel callback");
            if (i2 == 0 && i3 == 0) {
                Log.m105924i("MicroMsg.NetSceneJSAPISecureTunnel", "secureTunnel callback success");
                this.f250497g.onSuccess(((C49491fz3) this.f250496f.f127056b.f127083a).f133753d);
            } else {
                Log.m105924i("MicroMsg.NetSceneJSAPISecureTunnel", "secureTunnel callback fail");
                this.f250497g.mo7300b(str);
            }
        }
        C11385n nVar = this.f250495e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
