package v53;

import android.util.SparseArray;
import b63.C67212y;
import com.tencent.p014mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import fr3.C75790l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p281yz.C79173v;
import z53.C79306a;

/* renamed from: v53.z */
public class C78358z extends C75790l {

    /* renamed from: d */
    public List<ElementQuery> f229621d;

    /* renamed from: e */
    public ElementQuery f229622e;

    /* renamed from: f */
    public String f229623f;

    /* renamed from: g */
    public String f229624g;

    /* renamed from: h */
    public int f229625h;

    /* renamed from: i */
    public int f229626i;

    /* renamed from: j */
    public int f229627j;

    /* renamed from: n */
    public Profession[] f229628n;

    /* renamed from: o */
    public int f229629o;

    /* renamed from: p */
    public String[] f229630p;

    /* renamed from: q */
    public ArrayList<C79306a> f229631q;

    public C78358z(String str, String str2, PayInfo payInfo) {
        this(3, str, str2, payInfo, (String) null, -1, -1, 0);
    }

    public int getFuncId() {
        return 1505;
    }

    public int getTenpayCgicmd() {
        return 73;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/elementquerynew";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        this.f229621d = new ArrayList();
        try {
            jSONObject.optString("time_stamp");
            String optString = jSONObject.optString("bank_type");
            if (!Util.isNullOrNil(this.f229624g)) {
                optString = this.f229624g;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("Array");
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                ElementQuery elementQuery = new ElementQuery();
                elementQuery.mo99418d(jSONObject2);
                if (Bankcard.m84545t2(this.f229625h, elementQuery.f209495I)) {
                    this.f229621d.add(elementQuery);
                }
                if (optString != null && optString.equals(elementQuery.f209516s)) {
                    this.f229622e = elementQuery;
                }
            }
            SparseArray<String> sparseArray = new SparseArray<>();
            JSONArray jSONArray2 = jSONObject.getJSONArray("cre_type_map");
            int length2 = jSONArray2.length();
            for (int i3 = 0; i3 < length2; i3++) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                int optInt = jSONObject3.optInt("key", 0);
                if (optInt > 0) {
                    sparseArray.put(optInt, jSONObject3.getString(TPReportParams.JSON_KEY_VAL));
                }
            }
            this.f229626i = jSONObject.optInt("need_area");
            this.f229627j = jSONObject.optInt("need_profession");
            ElementQuery elementQuery2 = this.f229622e;
            if (!(elementQuery2 == null || elementQuery2.f209495I == 1)) {
                Log.m105924i(C75790l.TAG, "oversea card, no need area and profession");
                this.f229626i = 0;
                this.f229627j = 0;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("profession_array");
            if (optJSONArray != null) {
                this.f229628n = new Profession[optJSONArray.length()];
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
                    if (optJSONObject != null) {
                        String optString2 = optJSONObject.optString("profession_name");
                        int optInt2 = optJSONObject.optInt("profession_type");
                        if (!Util.isNullOrNil(optString2)) {
                            this.f229628n[i4] = new Profession(optString2, optInt2);
                        } else {
                            Log.m105924i(C75790l.TAG, "empty profession_name!");
                        }
                    }
                }
            }
            this.f229629o = jSONObject.optInt("need_nationality", 0);
            JSONArray optJSONArray2 = jSONObject.optJSONArray("nationality_exclude_array");
            if (optJSONArray2 != null) {
                this.f229630p = new String[optJSONArray2.length()];
                for (int i5 = 0; i5 < optJSONArray2.length(); i5++) {
                    this.f229630p[i5] = optJSONArray2.optString(i5);
                }
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("bank_card_info");
            if (optJSONArray3 != null) {
                this.f229631q = new ArrayList<>();
                for (int i6 = 0; i6 < optJSONArray3.length(); i6++) {
                    JSONObject optJSONObject2 = optJSONArray3.optJSONObject(i6);
                    if (optJSONObject2 != null) {
                        C79306a aVar = new C79306a();
                        aVar.f232817a = optJSONObject2.optString("bank_type");
                        aVar.f232818b = optJSONObject2.optString("mobile_hint");
                        aVar.f232819c = optJSONObject2.optString("mobile_tips");
                        this.f229631q.add(aVar);
                    }
                }
            }
            C67212y yVar = ((C79173v) C86312j.m106911c(C79173v.class)).f232472d;
            List<ElementQuery> list = this.f229621d;
            ArrayList<C79306a> arrayList = this.f229631q;
            yVar.f193006a = sparseArray;
            yVar.f193007b = list;
            yVar.f193008c = arrayList;
        } catch (JSONException e) {
            Log.printErrStackTrace(C75790l.TAG, e, "", new Object[0]);
        }
    }

    public C78358z(String str, String str2, PayInfo payInfo, String str3, int i, int i2, int i3) {
        this(3, str, str2, payInfo, str3, i, i2, i3);
    }

    public C78358z(int i, String str, String str2, PayInfo payInfo, String str3, int i2, int i3, int i4) {
        this.f229621d = null;
        this.f229622e = null;
        this.f229624g = null;
        this.f229628n = null;
        this.f229630p = null;
        this.f229623f = str2;
        this.f229625h = i;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        setPayInfo(payInfo, hashMap, hashMap2);
        hashMap.put("req_key", str);
        hashMap.put("flag", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
        hashMap.put("card_id", str2);
        i = (i > 3 || i < 1) ? 3 : i;
        if (i3 > 0) {
            hashMap.put("realname_scene", i3 + "");
            Log.m105925i(C75790l.TAG, "realname_scene=%d", Integer.valueOf(i3));
        }
        if (i2 == 8) {
            hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "1003");
        }
        hashMap.put("bank_card_tag", i + "");
        hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str3);
        hashMap.put("newrealname", i4 + "");
        setRequestData(hashMap);
        if (C75133p0.f221064a) {
            hashMap2.put("uuid_for_bindcard", C75133p0.f221066c);
            hashMap2.put("bindcard_scene", "" + C75133p0.f221065b);
        }
        setWXRequestData(hashMap2);
    }
}
