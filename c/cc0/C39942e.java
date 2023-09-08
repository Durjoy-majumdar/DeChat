package cc0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskForNative;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p702ts.C118505d;
import te3.C50180ku1;
import te3.C50311lu1;

/* renamed from: cc0.e */
public class C39942e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f107079d;

    /* renamed from: e */
    public final C47350c f107080e;

    /* renamed from: f */
    public String f107081f = "";

    public C39942e(C118505d dVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50180ku1();
        bVar.f127067b = new C50311lu1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getaddress";
        bVar.f127069d = JsApiAddDownloadTaskForNative.CTRL_INDEX;
        C47350c a = bVar.mo72403a();
        this.f107080e = a;
        C50180ku1 ku12 = (C50180ku1) a.f127055a.f127080a;
        double d = dVar.f354669a;
        ku12.f137043e = d;
        ku12.f137042d = dVar.f354670b;
        ku12.f137046h = dVar.f354671c;
        ku12.f137044f = dVar.f354672d;
        ku12.f137045g = dVar.f354673e;
        Log.m105925i("MicroMsg.NetSceneGetAddress", "Latitude:%s, Longitude:%s, scene:%s, indoorswitch:%s, poiFloor:%s", Double.valueOf(d), Double.valueOf(dVar.f354670b), Integer.valueOf(dVar.f354671c), Integer.valueOf(dVar.f354672d), dVar.f354673e);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f107079d = nVar;
        return dispatch(gVar, this.f107080e, this);
    }

    public int getType() {
        return JsApiAddDownloadTaskForNative.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneGetAddress", "onGYNetEnd errType %d errCode%d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            String str2 = ((C50311lu1) ((C47350c) uVar).f127056b.f127083a).f137644d;
            this.f107081f = str2;
            Log.m105918d("MicroMsg.NetSceneGetAddress", str2);
            C11385n nVar = this.f107079d;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        C11385n nVar2 = this.f107079d;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
