package xm2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import java.util.LinkedList;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49330et1;
import te3.C49468ft1;
import te3.C49608gt1;

/* renamed from: xm2.k */
public class C15860k extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f42708d;

    /* renamed from: e */
    public C47350c f42709e;

    /* renamed from: f */
    public String f42710f;

    public C15860k(int i, String str, Map<Integer, String> map) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49330et1();
        bVar.f127067b = new C49468ft1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/generalset";
        bVar.f127069d = WXWebReporter.WXWEB_GET_MMKV_CALLBACK_IS_NULL;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f42709e = a;
        this.f42710f = str;
        C49330et1 et12 = (C49330et1) a.f127055a.f127080a;
        et12.f133112d = i;
        et12.f133113e = str;
        if (map != null) {
            et12.f133114f = map.size();
            et12.f133115g = new LinkedList<>();
            for (Integer next : map.keySet()) {
                C49608gt1 gt12 = new C49608gt1();
                gt12.f134257d = next.intValue();
                gt12.f134258e = map.get(next);
                et12.f133115g.add(gt12);
            }
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105918d("MicroMsg.NetSceneGeneralSet", "doScene");
        this.f42708d = nVar;
        return dispatch(gVar, this.f42709e, this);
    }

    public int getType() {
        return WXWebReporter.WXWEB_GET_MMKV_CALLBACK_IS_NULL;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneGeneralSet", "onGYNetEnd errType:" + i2 + " errCode:" + i3);
        this.f42708d.onSceneEnd(i2, i3, str, this);
    }
}
