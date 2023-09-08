package eg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48840bd;
import te3.C48986cd;

/* renamed from: eg0.a */
public class C7648a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f25977d;

    /* renamed from: e */
    public final C47350c f25978e;

    public C7648a(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48840bd();
        bVar.f127067b = new C48986cd();
        bVar.f127068c = "/cgi-bin/micromsg-bin/bindlinkedincontact";
        bVar.f127069d = JsApiChooseMultiMedia.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f25978e = a;
        C48840bd bdVar = (C48840bd) a.f127055a.f127080a;
        bdVar.f131047d = i;
        bdVar.f131048e = i2;
        bdVar.f131049f = str;
        bdVar.f131050g = str2;
        bdVar.f131051h = str3;
        bdVar.f131052i = str4;
        bdVar.f131053j = str5;
        bdVar.f131054n = str6;
        bdVar.f131055o = str7;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f25977d = nVar;
        return dispatch(gVar, this.f25978e, this);
    }

    public int getType() {
        return JsApiChooseMultiMedia.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneBindLinkedinContact", "onGYNetEnd errType:" + i2 + " errCode:" + i3);
        C47350c cVar = this.f25978e;
        C48840bd bdVar = (C48840bd) cVar.f127055a.f127080a;
        C48986cd cdVar = (C48986cd) cVar.f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            C86709a0.m107535s().mo121142i().mo119676J(286722, bdVar.f131050g);
            C86709a0.m107535s().mo121142i().mo119676J(286721, bdVar.f131049f);
            C86709a0.m107535s().mo121142i().mo119676J(286723, bdVar.f131051h);
        }
        this.f25977d.onSceneEnd(i2, i3, str, this);
    }
}
