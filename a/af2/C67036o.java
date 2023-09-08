package af2;

import bf2.C39763f;
import bf2.C39765h;
import bf2.C39767j;
import bf2.C39768m;
import bf2.C54453e;
import bf2.C54454k;
import bf2.C54455l;
import bf2.C67223a;
import bf2.C67224c;
import bf2.C67225n;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: af2.o */
public class C67036o {

    /* renamed from: a */
    public String f192554a;

    /* renamed from: b */
    public int f192555b;

    /* renamed from: c */
    public int f192556c = Integer.MAX_VALUE;

    /* renamed from: d */
    public int f192557d = Integer.MAX_VALUE;

    /* renamed from: e */
    public C67224c f192558e;

    /* renamed from: f */
    public C67225n f192559f;

    /* renamed from: g */
    public LinkedList<C54455l> f192560g = new LinkedList<>();

    /* renamed from: h */
    public C39763f f192561h;

    /* renamed from: i */
    public String f192562i;

    /* renamed from: j */
    public String f192563j;

    /* renamed from: k */
    public String f192564k;

    /* renamed from: b */
    public static C67036o m79217b(C67036o oVar, String str) {
        String str2 = FirebaseAnalytics.C113379b.QUANTITY;
        C67036o oVar2 = oVar == null ? new C67036o() : oVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            oVar2.f192554a = jSONObject.getString("product_id");
            oVar2.f192555b = jSONObject.getInt("product_type");
            oVar2.f192556c = jSONObject.optInt(str2, Integer.MAX_VALUE);
            oVar2.f192557d = jSONObject.optInt("left_buy_quantity", Integer.MAX_VALUE);
            jSONObject.optInt("status", 6);
            JSONObject optJSONObject = jSONObject.optJSONObject("ext_attr");
            if (optJSONObject != null) {
                oVar2.f192561h = new C39763f();
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("product_ext");
                if (optJSONObject2 != null) {
                    C39763f fVar = oVar2.f192561h;
                    C39767j jVar = new C39767j();
                    jVar.f106720d = optJSONObject2.getInt("flag");
                    fVar.f106709d = jVar;
                } else {
                    oVar2.f192561h.f106710e = jSONObject.optString("ext_attr");
                }
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("base_attr");
            if (optJSONObject3 != null) {
                C67224c cVar = new C67224c();
                oVar2.f192558e = cVar;
                cVar.f193024d = optJSONObject3.getString("name");
                oVar2.f192558e.f193026f = optJSONObject3.getInt("ori_price");
                oVar2.f192558e.f193027g = optJSONObject3.getInt("up_price");
                oVar2.f192558e.f193028h = optJSONObject3.getInt("low_price");
                oVar2.f192558e.f193029i = new LinkedList<>();
                JSONArray jSONArray = optJSONObject3.getJSONArray("img_info");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    if (!Util.isNullOrNil(string)) {
                        oVar2.f192558e.f193029i.add(string);
                    }
                }
                oVar2.f192558e.f193030j = optJSONObject3.getString("digest");
                oVar2.f192558e.f193040w = optJSONObject3.getString("fee_type");
                oVar2.f192558e.f193031n = optJSONObject3.getString("detail");
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("share_info");
                if (optJSONObject4 != null) {
                    oVar2.f192558e.f193041x = new C54454k();
                    oVar2.f192558e.f193041x.f152709d = optJSONObject4.optString("icon_url");
                    oVar2.f192558e.f193041x.f152710e = optJSONObject4.optString("url");
                }
                JSONArray optJSONArray = optJSONObject3.optJSONArray("sku_table");
                if (optJSONArray != null) {
                    oVar2.f192558e.f193037t = new LinkedList<>();
                    int length2 = optJSONArray.length();
                    int i2 = 0;
                    while (i2 < length2) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        C39768m mVar = new C39768m();
                        mVar.f106723d = jSONObject2.getString("id");
                        mVar.f106724e = jSONObject2.getString("name");
                        mVar.f106725f = new LinkedList<>();
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("value_list");
                        int length3 = jSONArray2.length();
                        int i3 = 0;
                        while (i3 < length3) {
                            JSONArray jSONArray3 = optJSONArray;
                            JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                            int i4 = length2;
                            C39765h hVar = new C39765h();
                            hVar.f106715d = jSONObject3.getString("id");
                            hVar.f106716e = jSONObject3.getString("name");
                            hVar.f106717f = true;
                            mVar.f106725f.add(hVar);
                            i3++;
                            optJSONArray = jSONArray3;
                            length2 = i4;
                            jSONArray2 = jSONArray2;
                        }
                        oVar2.f192558e.f193037t.add(mVar);
                        i2++;
                        optJSONArray = optJSONArray;
                        length2 = length2;
                    }
                }
                JSONArray optJSONArray2 = optJSONObject3.optJSONArray("actiongroup_attr");
                if (optJSONArray2 != null) {
                    oVar2.f192558e.f193039v = new LinkedList<>();
                    int length4 = optJSONArray2.length();
                    for (int i5 = 0; i5 < length4; i5++) {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i5);
                        C67223a aVar = new C67223a();
                        String string2 = jSONObject4.getString("name");
                        aVar.f193019d = string2;
                        aVar.f193021f = 0;
                        if (!Util.isNullOrNil(string2)) {
                            oVar2.f192558e.f193039v.add(aVar);
                        }
                        JSONArray jSONArray4 = jSONObject4.getJSONArray("action_list");
                        int length5 = jSONArray4.length();
                        int i6 = 0;
                        while (i6 < length5) {
                            JSONObject jSONObject5 = jSONArray4.getJSONObject(i6);
                            C67223a aVar2 = new C67223a();
                            aVar2.f193019d = jSONObject5.getString("name");
                            aVar2.f193020e = jSONObject5.getString("tips");
                            aVar2.f193021f = jSONObject5.getInt("type");
                            aVar2.f193022g = jSONObject5.getString("content");
                            aVar2.f193023h = jSONObject5.getString("icon_url");
                            oVar2.f192558e.f193039v.add(aVar2);
                            i6++;
                            optJSONArray2 = optJSONArray2;
                        }
                        JSONArray jSONArray5 = optJSONArray2;
                    }
                }
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("available_sku_list");
            if (optJSONArray3 != null) {
                int length6 = optJSONArray3.length();
                oVar2.f192560g = new LinkedList<>();
                int i7 = 0;
                while (i7 < length6) {
                    JSONObject jSONObject6 = optJSONArray3.getJSONObject(i7);
                    C54455l lVar = new C54455l();
                    lVar.f152711d = jSONObject6.getString("id_info");
                    lVar.f152712e = jSONObject6.getInt(FirebaseAnalytics.C113379b.PRICE);
                    lVar.f152715h = jSONObject6.getInt(str2);
                    lVar.f152713f = jSONObject6.getString("icon_url");
                    JSONArray jSONArray6 = jSONObject6.getJSONArray("express_fee");
                    int length7 = jSONArray6.length();
                    lVar.f152714g = new LinkedList<>();
                    int i8 = 0;
                    while (i8 < length7) {
                        JSONObject jSONObject7 = jSONArray6.getJSONObject(i8);
                        JSONArray jSONArray7 = optJSONArray3;
                        C54453e eVar = new C54453e();
                        eVar.f152706d = jSONObject7.getInt("id");
                        eVar.f152707e = jSONObject7.getString("name");
                        eVar.f152708f = jSONObject7.getInt(FirebaseAnalytics.C113379b.PRICE);
                        lVar.f152714g.add(eVar);
                        i8++;
                        optJSONArray3 = jSONArray7;
                        str2 = str2;
                    }
                    oVar2.f192560g.add(lVar);
                    i7++;
                    optJSONArray3 = optJSONArray3;
                    str2 = str2;
                }
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("seller_attr");
            if (optJSONObject5 != null) {
                C67225n nVar = new C67225n();
                oVar2.f192559f = nVar;
                nVar.f193042d = optJSONObject5.getString("appid");
                oVar2.f192559f.f193043e = optJSONObject5.getString("name");
                oVar2.f192559f.f193045g = optJSONObject5.getString("username");
                oVar2.f192559f.f193044f = optJSONObject5.optString("logo");
                oVar2.f192559f.f193046h = optJSONObject5.optInt("flag", 0);
            }
            JSONObject optJSONObject6 = jSONObject.optJSONObject("oss_info");
            if (optJSONObject6 != null) {
                oVar2.f192563j = optJSONObject6.optString("self_buy_button_word");
                oVar2.f192564k = optJSONObject6.optString("product_mixed_h5_html");
            }
            return oVar2;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.ProductInfo", e, "", new Object[0]);
            return oVar2;
        }
    }

    /* renamed from: c */
    public static C67036o m79218c(C67036o oVar, String str) {
        String str2;
        if (oVar == null) {
            oVar = new C67036o();
        }
        Map<String, String> parseXml = XmlParser.parseXml(str, "mallProductInfo", (String) null);
        if (parseXml == null) {
            return null;
        }
        oVar.f192554a = Util.nullAsNil(parseXml.get(".mallProductInfo.id"));
        oVar.f192555b = Util.getInt(parseXml.get(".mallProductInfo.type"), 0);
        C67224c cVar = new C67224c();
        oVar.f192558e = cVar;
        cVar.f193024d = Util.nullAsNil(parseXml.get(".mallProductInfo.name"));
        oVar.f192558e.f193030j = Util.nullAsNil(parseXml.get(".mallProductInfo.digest"));
        oVar.f192558e.f193027g = Util.getInt(parseXml.get(".mallProductInfo.highPrice"), 0);
        oVar.f192558e.f193028h = Util.getInt(parseXml.get(".mallProductInfo.lowPrice"), 0);
        oVar.f192558e.f193026f = Util.getInt(parseXml.get(".mallProductInfo.originPrice"), 0);
        oVar.f192562i = Util.nullAsNil(parseXml.get(".mallProductInfo.sourceUrl"));
        int i = Util.getInt(parseXml.get(".mallProductInfo.imgCount"), 0);
        if (i > 0) {
            oVar.f192558e.f193029i = new LinkedList<>();
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 == 0) {
                    str2 = Util.nullAsNil(parseXml.get(".mallProductInfo.imgList.imgUrl"));
                } else {
                    str2 = Util.nullAsNil(parseXml.get(".mallProductInfo.imgList.imgUrl" + i2));
                }
                if (!Util.isNullOrNil(str2)) {
                    oVar.f192558e.f193029i.add(str2);
                }
            }
        }
        oVar.f192558e.f193041x = new C54454k();
        oVar.f192558e.f193041x.f152710e = Util.nullAsNil(parseXml.get(".mallProductInfo.shareInfo.shareUrl"));
        oVar.f192558e.f193041x.f152709d = Util.nullAsNil(parseXml.get(".mallProductInfo.shareInfo.shareThumbUrl"));
        C67225n nVar = new C67225n();
        oVar.f192559f = nVar;
        nVar.f193042d = Util.nullAsNil(parseXml.get(".mallProductInfo.sellerInfo.appID"));
        oVar.f192559f.f193043e = Util.nullAsNil(parseXml.get(".mallProductInfo.sellerInfo.appName"));
        oVar.f192559f.f193045g = Util.nullAsNil(parseXml.get(".mallProductInfo.sellerInfo.usrName"));
        return oVar;
    }

    /* renamed from: a */
    public String mo91020a() {
        LinkedList<String> linkedList;
        C54454k kVar;
        C67224c cVar = this.f192558e;
        if (cVar != null && (kVar = cVar.f193041x) != null && !Util.isNullOrNil(kVar.f152709d)) {
            return this.f192558e.f193041x.f152709d;
        }
        C67224c cVar2 = this.f192558e;
        if (cVar2 == null || (linkedList = cVar2.f193029i) == null || linkedList.size() <= 0) {
            return null;
        }
        return this.f192558e.f193029i.get(0);
    }
}
