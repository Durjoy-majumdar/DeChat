package kg2;

import com.tencent.p014mm.plugin.recharge.model.MallRechargeProduct;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: kg2.b */
public class C76575b {
    /* renamed from: a */
    public static String m92141a(String str) {
        if (str == null) {
            return null;
        }
        String replaceAll = str.replaceAll("\\D", "");
        return replaceAll.startsWith("86") ? replaceAll.substring(2) : replaceAll;
    }

    /* renamed from: b */
    public static String m92142b(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str.replaceAll(" ", ""));
        int length = sb.length();
        if (length < 4) {
            return sb.toString();
        }
        sb.insert(3, ' ');
        if (length >= 8) {
            sb.insert(8, ' ');
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static MallRechargeProduct m92143c(String str, JSONObject jSONObject) {
        boolean z = true;
        MallRechargeProduct mallRechargeProduct = new MallRechargeProduct(jSONObject.optInt("need_getlatestinfo", 1) == 1);
        mallRechargeProduct.f203467d = str;
        mallRechargeProduct.f203469f = jSONObject.getString("product_id");
        mallRechargeProduct.f203470g = jSONObject.getString("product_name");
        mallRechargeProduct.f203471h = jSONObject.optString("product_desc");
        mallRechargeProduct.f203472i = ((float) jSONObject.getInt("product_min_price")) / 100.0f;
        mallRechargeProduct.f203473j = ((float) jSONObject.getInt("product_max_price")) / 100.0f;
        mallRechargeProduct.f203468e = jSONObject.optString("app_id");
        mallRechargeProduct.f203474n = jSONObject.getInt("is_infinite") == 1;
        mallRechargeProduct.f203475o = jSONObject.getInt("left_count");
        mallRechargeProduct.f203476p = jSONObject.getInt("discount");
        if (jSONObject.optInt("is_default_choose", 0) != 1) {
            z = false;
        }
        mallRechargeProduct.f203477q = z;
        mallRechargeProduct.f203478r = jSONObject.optInt("product_type", 0);
        return mallRechargeProduct;
    }

    /* renamed from: d */
    public static ArrayList<MallRechargeProduct> m92144d(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList<MallRechargeProduct> arrayList = new ArrayList<>();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(m92143c(str, jSONArray.getJSONObject(i)));
            }
            return arrayList;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.MallLogic", e, "", new Object[0]);
            return null;
        }
    }
}
