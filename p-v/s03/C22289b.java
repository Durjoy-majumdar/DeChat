package s03;

import android.os.Build;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import di3.C86312j;
import h81.C32735h;
import java.util.Iterator;
import ky2.C10432i;
import lg3.C76695c;
import o03.C21723h;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONException;
import org.json.JSONObject;
import p03.C21912d;
import p03.C21914h;
import p156gj.C87200o;
import p166hy.C60229z;
import qe3.C89625d;
import te3.C49768hy;
import te3.jh4;
import te3.p25;
import te3.q25;
import te3.rh4;
import u73.C101987v0;
import u73.C22613h1;

/* renamed from: s03.b */
public class C22289b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f63188d;

    /* renamed from: e */
    public C47350c f63189e;

    /* renamed from: f */
    public jh4 f63190f;

    /* renamed from: g */
    public long f63191g = System.currentTimeMillis();

    public C22289b(jh4 jh4, int i) {
        String str;
        rh4 rh4;
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStory", "Create NetSceneTopStory Home channelId:%s, %s %s %s", Integer.valueOf(jh4.f64041s), Integer.valueOf(i), jh4.f64038p, jh4.f64030e);
        this.f63190f = jh4;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 1943;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/mmwebrecommend";
        bVar.f127066a = new p25();
        bVar.f127067b = new q25();
        C47350c a = bVar.mo72403a();
        this.f63189e = a;
        p25 p25 = (p25) a.f127055a.f127080a;
        p25.f64379d = jh4.f64032g;
        p25.f64380e = C43471q.m46977a(1);
        p25.f64382g = jh4.f64033h;
        p25.f64383h = C101987v0.m134273g();
        p25.f64384i = jh4.f64034i;
        p25.f64385j = jh4.f64029d;
        p25.f64388p.addAll(jh4.f64037o);
        p25.f64391s = jh4.f64041s;
        p25.f64397y = i;
        p25.f64398z = jh4.f64025A;
        p25.f64389q = jh4.f64030e;
        Class cls = C21912d.class;
        String str2 = jh4.f64026B;
        str2 = Util.isNullOrNil(str2) ? jh4.f64027C : str2;
        if (C21914h.m25163k(jh4.f64041s)) {
            rh4 rh42 = ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).f61497a;
            if (rh42 != null) {
                str2 = rh42.f64533d;
            }
        } else if (C21914h.m25162j(jh4.f64041s)) {
            rh4 rh43 = ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).f61498b;
            if (rh43 != null) {
                str2 = rh43.f64533d;
            }
        } else if (C21914h.m25164l(jh4.f64041s) && (rh4 = ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).f61499c) != null) {
            str2 = rh4.f64533d;
        }
        p25.f64393u = str2;
        p25.f64392t = jh4.f64042t;
        p25.f64394v = jh4.f64047y;
        p25.f64376C = C76695c.m92341b() ? 1 : 0;
        p25.f64377D = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e() ? 1 : 0;
        Class cls2 = C60229z.class;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oaid", ((C60229z) C86312j.m106911c(cls2)).mo85224r4());
            jSONObject.put("imei", ((C60229z) C86312j.m106911c(cls2)).d00());
            jSONObject.put("devIdInfo", ((C60229z) C86312j.m106911c(cls2)).Uc0());
            int i2 = C89625d.f257835a;
            jSONObject.put("device_type", C87200o.f252868a);
            str = jSONObject.toString();
        } catch (JSONException unused) {
            str = "";
        }
        p25.f64378E = str;
        C49768hy hyVar = new C49768hy();
        hyVar.f134951d = "client_system_version";
        hyVar.f134952e = (long) Build.VERSION.SDK_INT;
        p25.f64388p.add(hyVar);
        C49768hy hyVar2 = new C49768hy();
        hyVar2.f134951d = DownloadInfo.NETTYPE;
        hyVar2.f134953f = C43471q.m46979c();
        p25.f64388p.add(hyVar2);
        C49768hy hyVar3 = new C49768hy();
        hyVar3.f134951d = "client_request_time";
        hyVar3.f134953f = String.valueOf(System.currentTimeMillis());
        p25.f64388p.add(hyVar3);
        C49768hy hyVar4 = new C49768hy();
        hyVar4.f134951d = "clicfg_topstory_top_tab_params";
        hyVar4.f134953f = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_topstory_top_tab_params_3, "{\"tabs\":[{\"wording\":\"在看\",\"wording_cn\":\"在看\",\"wording_en\":\"Wow\",\"wording_hk\":\"在看\",\"wording_tw\":\"在看\",\"category\":700,\"showWhenRedDot\":1,\"tabInfo\":\"{\\\"category\\\":700}\",\"bypass\":\"700\"},{\"wording\":\"热点\",\"wording_cn\":\"热点\",\"wording_en\":\"Top\",\"wording_hk\":\"熱點\",\"wording_tw\":\"熱點\",\"category\":100,\"showWhenRedDot\":0,\"tabInfo\":\"{\\\"category\\\":100}\"}]}");
        p25.f64388p.add(hyVar4);
        Iterator<C49768hy> it = p25.f64388p.iterator();
        while (it.hasNext()) {
            C49768hy next = it.next();
            Log.m105925i("MicroMsg.TopStory.NetSceneTopStory", "key: %s unit_value %s text_value %s", next.f134951d, Long.valueOf(next.f134952e), next.f134953f);
        }
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStory", "request params offset %d h5Version %d CheckDocListSize: %d", Integer.valueOf(p25.f64379d), Integer.valueOf(p25.f64380e), Integer.valueOf(p25.f64394v.size()));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C22613h1.m26481g(this.f63190f.f64034i, 2);
        this.f63188d = nVar;
        return dispatch(gVar, this.f63189e, this);
    }

    public int getType() {
        return 1943;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStory", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, Long.valueOf(System.currentTimeMillis() - this.f63191g));
        if (i3 == -1) {
            C22613h1.m26481g(this.f63190f.f64034i, 4);
        } else if (i2 == 0 && i3 == 0) {
            C22613h1.m26481g(this.f63190f.f64034i, 3);
        } else {
            C22613h1.m26481g(this.f63190f.f64034i, 8);
        }
        this.f63188d.onSceneEnd(i2, i3, str, this);
    }
}
