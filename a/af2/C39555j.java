package af2;

import af2.C39560p;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONArray;
import org.json.JSONObject;
import te3.C50087k62;
import te3.C50223l62;

/* renamed from: af2.j */
public class C39555j extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106183d;

    /* renamed from: e */
    public C47350c f106184e;

    /* renamed from: f */
    public String f106185f;

    /* renamed from: g */
    public C67036o f106186g;

    /* renamed from: h */
    public List<C39560p> f106187h;

    public C39555j(C67036o oVar, String str, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50087k62();
        bVar.f127067b = new C50223l62();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getproductdetail";
        bVar.f127069d = 553;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106184e = a;
        C50087k62 k622 = (C50087k62) a.f127055a.f127080a;
        this.f106185f = str;
        k622.f136583d = str;
        Log.m105918d("MicroMsg.NetSceneMallGetProductDetail", "pid " + str);
        k622.f136584e = i;
        this.f106186g = oVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106183d = nVar;
        return dispatch(gVar, this.f106184e, this);
    }

    public int getType() {
        return 553;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2;
        int i4;
        C50223l62 l622 = (C50223l62) ((C47350c) uVar).f127056b.f127083a;
        if (!Util.isNullOrNil(l622.f137225d)) {
            Log.m105918d("MicroMsg.NetSceneMallGetProductDetail", "resp.ProductInfo " + l622.f137225d);
            this.f106186g = C67036o.m79217b(this.f106186g, l622.f137225d);
        }
        if (i3 != 0 || (i4 = l622.f137226e) == 0) {
            i4 = i3;
            str2 = str;
        } else {
            str2 = l622.f137227f;
        }
        if (!Util.isNullOrNil(l622.f137228g)) {
            Log.m105918d("MicroMsg.NetSceneMallGetProductDetail", "resp.RecommendInfo " + l622.f137228g);
            String str3 = l622.f137228g;
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONObject(str3).getJSONArray("group_list");
                int length = jSONArray.length();
                for (int i5 = 0; i5 < length; i5++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i5);
                    C39560p pVar = new C39560p();
                    pVar.f106202a = jSONObject.getString("name");
                    JSONArray jSONArray2 = jSONObject.getJSONArray(FirebaseAnalytics.C113379b.ITEM_LIST);
                    int length2 = jSONArray2.length();
                    for (int i6 = 0; i6 < length2; i6++) {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i6);
                        C39560p.C39561a aVar = new C39560p.C39561a();
                        aVar.f106204a = jSONObject2.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        aVar.f106206c = jSONObject2.getInt("jump_type");
                        aVar.f106208e = jSONObject2.getString("native_url_args");
                        aVar.f106205b = jSONObject2.getString("icon_url");
                        aVar.f106207d = jSONObject2.getString("h5_url");
                        ((ArrayList) pVar.f106203b).add(aVar);
                    }
                    arrayList.add(pVar);
                }
            } catch (Exception unused) {
                arrayList = null;
            }
            this.f106187h = arrayList;
        }
        Log.m105918d("MicroMsg.NetSceneMallGetProductDetail", "errCode " + i4 + ", errMsg " + str2);
        this.f106183d.onSceneEnd(i2, i4, str2, this);
    }
}
