package c63;

import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import ft3.C45807d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C48753ar1;
import te3.C50594nu1;
import te3.C64891zq1;
import te3.sy4;
import ub3.C78144b;

/* renamed from: c63.b */
public class C67345b {

    /* renamed from: c63.b$a */
    public static final class C0426a {
        /* renamed from: a */
        public static boolean m369a(String str) {
            String[] split;
            if (Util.isNullOrNil(str)) {
                return true;
            }
            C86709a0.m107528h();
            String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MALL_THIRD_PARTY_DISCLAIMER_STRING, (Object) null);
            if (Util.isNullOrNil(str2) || (split = str2.split(",")) == null || split.length == 0) {
                return false;
            }
            for (String equals : split) {
                if (equals.equals(str)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public static void m370b(String str) {
            String[] split;
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MALL_THIRD_PARTY_DISCLAIMER_STRING;
            if (!Util.isNullOrNil(str)) {
                C86709a0.m107528h();
                String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(aVar, (Object) null);
                if (!(Util.isNullOrNil(str2) || (split = str2.split(",")) == null || split.length == 0)) {
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= split.length) {
                            break;
                        } else if (split[i].equals(str)) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (!z) {
                        str = str2 + "," + str;
                    } else {
                        str = str2;
                    }
                }
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(aVar, str);
            }
        }
    }

    /* renamed from: a */
    public static String m79687a() {
        TelephonyManager telephonyManager = (TelephonyManager) MMApplicationContext.getContext().getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getNetworkCountryIso() : "";
    }

    /* renamed from: b */
    public static ArrayList<C64891zq1> m79688b(int i) {
        ArrayList<C64891zq1> arrayList = new ArrayList<>();
        LinkedList<C48753ar1> linkedList = m79690d(i).f138778d;
        if (linkedList != null) {
            Iterator<C48753ar1> it = linkedList.iterator();
            while (it.hasNext()) {
                C48753ar1 next = it.next();
                if (next != null) {
                    Iterator<C64891zq1> it4 = next.f130742e.iterator();
                    while (it4.hasNext()) {
                        C64891zq1 next2 = it4.next();
                        if (next2 != null) {
                            next2.f186836n = next.f130741d.f141840d;
                            arrayList.add(next2);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static SparseArray<ArrayList<Integer>> m79689c(int i) {
        SparseArray<ArrayList<Integer>> sparseArray = new SparseArray<>();
        LinkedList<C48753ar1> linkedList = m79690d(i).f138778d;
        if (linkedList != null) {
            Iterator<C48753ar1> it = linkedList.iterator();
            while (it.hasNext()) {
                C48753ar1 next = it.next();
                if (next != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<C64891zq1> it4 = next.f130742e.iterator();
                    while (it4.hasNext()) {
                        C64891zq1 next2 = it4.next();
                        if (next2 != null) {
                            arrayList.add(Integer.valueOf(next2.f186829d.f184923d));
                        }
                    }
                    sparseArray.put(next.f130741d.f141840d, arrayList);
                }
            }
        }
        return sparseArray;
    }

    /* renamed from: d */
    public static C50594nu1 m79690d(int i) {
        C50594nu1 nu12 = new C50594nu1();
        String str = (String) ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119992d(m79692f(i), (Object) null);
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.MallLogic", "getMallNewFunctionListRespone is null");
        } else {
            try {
                nu12.parseFrom(C45807d.m51085b(str));
                Log.m105924i("MicroMsg.MallLogic", "getMallNewFunctionListRespone success");
            } catch (Exception e) {
                Log.m105920e("MicroMsg.MallLogic", "getMallNewFunctionListRespone fail, " + e.getLocalizedMessage());
            }
        }
        return nu12;
    }

    /* renamed from: e */
    public static SparseArray<Integer> m79691e(int i) {
        sy4 sy4;
        SparseArray<Integer> sparseArray = new SparseArray<>();
        C50594nu1 d = m79690d(i);
        if (d.f138778d != null) {
            for (int i2 = 0; i2 < d.f138778d.size(); i2++) {
                C48753ar1 ar12 = d.f138778d.get(i2);
                if (!(ar12 == null || (sy4 = ar12.f130741d) == null)) {
                    sparseArray.put(sy4.f141840d, Integer.valueOf(i2 + 1));
                }
            }
        }
        return sparseArray;
    }

    /* renamed from: f */
    public static C72994y1.C72995a m79692f(int i) {
        Log.m105925i("MicroMsg.MallLogic", "getStoreInfoKey walletRegion：%s", Integer.valueOf(i));
        return i != 2 ? i != 4 ? i != 8 ? C72994y1.C72995a.WALLET_MALL_FUNCTION_LIST_RESPONE_NEW_STRING_SYNC : C72994y1.C72995a.WALLET_MALL_FUNCTION_LIST_RESPONE_NEW_HK_STRING_SYNC : C72994y1.C72995a.WALLET_MALL_FUNCTION_LIST_RESPONE_NEW_ZA_STRING_SYNC : C72994y1.C72995a.WALLET_MALL_FUNCTION_LIST_RESPONE_NEW_MY_STRING_SYNC;
    }

    /* renamed from: g */
    public static ArrayList<C0425a> m79693g(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                ArrayList<C0425a> arrayList = new ArrayList<>();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    C0425a aVar = new C0425a();
                    aVar.f1047a = jSONObject.optInt("banner_id");
                    aVar.f1048b = jSONObject.optString("banner_title");
                    aVar.f1049c = jSONObject.optString("banner_link");
                    arrayList.add(aVar);
                }
                return arrayList;
            } catch (JSONException e) {
                Log.m105928w("MicroMsg.MallLogic", "func[parseBannerActList], exp:" + e.getMessage());
                return null;
            }
        } else {
            Log.m105928w("MicroMsg.MallLogic", "func[parseBannerActList], jsonArr null");
            return null;
        }
    }

    /* renamed from: h */
    public static ArrayList<MallFunction> m79694h(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList<MallFunction> arrayList = new ArrayList<>();
            int length = jSONArray.length();
            Log.m105918d("MicroMsg.MallLogic", "functions.jsonArray.length : " + length);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                MallFunction mallFunction = new MallFunction();
                mallFunction.f209731d = jSONObject.getString("func_id");
                mallFunction.f209732e = jSONObject.getString("func_name");
                mallFunction.f209733f = jSONObject.optString("func_icon_url");
                mallFunction.f209734g = jSONObject.optString("hd_icon_url");
                mallFunction.f209735h = jSONObject.optString("func_foregroud_icon_url");
                mallFunction.f209736i = jSONObject.optString("native_url");
                mallFunction.f209737j = jSONObject.optString("h5_url");
                mallFunction.f209740p = jSONObject.optInt("property_type", 0);
                mallFunction.f209741q = jSONObject.optString("third_party_disclaimer");
                mallFunction.f209742r = jSONObject.optInt("download_restrict", 0);
                JSONArray optJSONArray = jSONObject.optJSONArray("remark_name_list");
                if (optJSONArray != null) {
                    mallFunction.f209738n = new ArrayList<>();
                    int length2 = optJSONArray.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        mallFunction.f209738n.add(optJSONArray.getString(i2));
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("activity_info_list");
                if (!(optJSONArray2 == null || optJSONArray2.length() == 0)) {
                    mallFunction.f209739o = m79696j(mallFunction.f209731d, optJSONArray2.getJSONObject(0));
                }
                arrayList.add(mallFunction);
            }
            return arrayList;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.MallLogic", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: i */
    public static ArrayList<MallNews> m79695i(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                ArrayList<MallNews> arrayList = new ArrayList<>();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    MallNews mallNews = new MallNews(jSONObject.optString("activity_jump_funcid"));
                    mallNews.f209750n = jSONObject.optString("activity_icon_link");
                    mallNews.f209748i = jSONObject.optString("activity_msg_content");
                    mallNews.f209752p = jSONObject.optString("activity_tips");
                    arrayList.add(mallNews);
                }
                return arrayList;
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.MallLogic", e, "", new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: j */
    public static MallNews m79696j(String str, JSONObject jSONObject) {
        MallNews mallNews = new MallNews(str);
        mallNews.f209746g = jSONObject.optString(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID);
        mallNews.f209747h = jSONObject.optString("activity_ticket");
        mallNews.f209748i = jSONObject.optString("activity_msg_content");
        mallNews.f209749j = jSONObject.optString("activity_link");
        mallNews.f209750n = jSONObject.optString("activity_icon_link");
        mallNews.f209751o = jSONObject.optInt("activity_expired_time");
        mallNews.f209752p = jSONObject.optString("activity_tips");
        mallNews.f209755s = jSONObject.optInt("activity_type");
        mallNews.f209756t = jSONObject.optString("activity_url");
        mallNews.f209753q = jSONObject.optInt("is_msg_reserved");
        return mallNews;
    }

    /* renamed from: k */
    public static SparseArray<String> m79697k(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                SparseArray<String> sparseArray = new SparseArray<>();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int optInt = jSONObject.optInt("type_id", 0);
                    if (optInt != 0) {
                        sparseArray.put(optInt, jSONObject.optString("type_name"));
                    }
                }
                return sparseArray;
            } catch (JSONException e) {
                Log.m105928w("MicroMsg.MallLogic", "func[parseBannerActList], exp:" + e.getMessage());
                return null;
            }
        } else {
            Log.m105928w("MicroMsg.MallLogic", "func[parseTypeNameMap], jsonArr null");
            return null;
        }
    }
}
