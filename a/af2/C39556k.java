package af2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import fm0.C86977r1;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONArray;
import org.json.JSONObject;
import te3.C49097d50;
import te3.C50361m62;
import te3.C50502n62;

/* renamed from: af2.k */
public class C39556k extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106188d;

    /* renamed from: e */
    public C47350c f106189e;

    /* renamed from: f */
    public LinkedList<C49097d50> f106190f;

    /* renamed from: g */
    public String f106191g;

    public C39556k(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50361m62();
        bVar.f127067b = new C50502n62();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getproductdiscount";
        bVar.f127069d = C86977r1.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106189e = a;
        C50361m62 m622 = (C50361m62) a.f127055a.f127080a;
        m622.f137879d = str;
        this.f106191g = str2;
        m622.f137880e = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106188d = nVar;
        return dispatch(gVar, this.f106189e, this);
    }

    public int getType() {
        return C86977r1.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4;
        C50502n62 n622 = (C50502n62) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 && i3 == 0 && n622.f138441e == 0) {
            Log.m105918d("MicroMsg.NetSceneMallGetProductDiscount", "resp.ProductInfo " + n622.f138440d);
            try {
                JSONArray optJSONArray = new JSONObject(n622.f138440d).optJSONArray("discount_list");
                if (optJSONArray != null) {
                    this.f106190f = new LinkedList<>();
                    int length = optJSONArray.length();
                    for (int i5 = 0; i5 < length; i5++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i5);
                        C49097d50 d502 = new C49097d50();
                        d502.f132116d = jSONObject.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        d502.f132117e = jSONObject.getInt("fee");
                        this.f106190f.add(d502);
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (i3 == 0 && (i4 = n622.f138441e) != 0) {
            str = n622.f138442f;
            i3 = i4;
        }
        Log.m105918d("MicroMsg.NetSceneMallGetProductDiscount", "errCode " + i3 + ", errMsg " + str);
        this.f106188d.onSceneEnd(i2, i3, str, this);
    }
}
