package wz0;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import hz0.C46144e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import te3.C51854wn;

/* renamed from: wz0.j */
public class C53260j {
    /* renamed from: a */
    public static ArrayList<C51854wn> m59691a(String str, int i) {
        JSONArray jSONArray;
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.CardListItemParser", "parseCardListItemArray jsonContent is null");
            return null;
        }
        if (i == 8 || i == 0) {
            jSONArray = new JSONObject(str).optJSONArray("card_list");
        } else if (i == 26) {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.CardListItemParser", e, "", new Object[0]);
                return null;
            }
        } else {
            jSONArray = new JSONArray(str);
        }
        if (jSONArray != null) {
            if (jSONArray.length() != 0) {
                ArrayList<C51854wn> arrayList = new ArrayList<>();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                    if (optJSONObject == null) {
                        if (i == 26 && (jSONArray.opt(i2) instanceof String)) {
                            try {
                                optJSONObject = new JSONObject(jSONArray.optString(i2));
                            } catch (JSONException e2) {
                                Log.printErrStackTrace("MicroMsg.CardListItemParser", e2, "protect itemJSON for AppBrand", new Object[0]);
                            }
                        }
                    }
                    C51854wn wnVar = new C51854wn();
                    wnVar.f144151d = optJSONObject.optString(i == 26 ? "cardId" : "card_id");
                    wnVar.f144152e = optJSONObject.optString(i == 26 ? "cardExt" : "card_ext");
                    arrayList.add(wnVar);
                }
                return arrayList;
            }
        }
        Log.m105920e("MicroMsg.CardListItemParser", "parseCardListItemArray cardItemListJson is null");
        return null;
    }

    /* renamed from: b */
    public static String m59692b(LinkedList<C46144e> linkedList, boolean z, int i) {
        if (linkedList == null || linkedList.size() == 0) {
            Log.m105920e("MicroMsg.CardListItemParser", "parseCardListItemToJson list == null || list.size() == 0");
            return "";
        }
        Log.m105924i("MicroMsg.CardListItemParser", "parseCardListItemToJson is_succ:" + z + " scene:" + i);
        JSONStringer jSONStringer = new JSONStringer();
        if (i == 8) {
            try {
                jSONStringer.object();
                jSONStringer.key("card_list");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.CardListItemParser", e, "", new Object[0]);
                return "";
            }
        }
        jSONStringer.array();
        Iterator<C46144e> it = linkedList.iterator();
        while (it.hasNext()) {
            C46144e next = it.next();
            jSONStringer.object();
            jSONStringer.key(i == 26 ? "cardId" : "card_id");
            jSONStringer.value(next.f144151d);
            jSONStringer.key(i == 26 ? "cardExt" : "card_ext");
            String str = next.f144152e;
            if (str == null) {
                str = "";
            }
            jSONStringer.value(str);
            jSONStringer.key(i == 26 ? "isSuccess" : "is_succ");
            if (z) {
                jSONStringer.value(i == 26 ? Boolean.TRUE : 1);
            } else {
                jSONStringer.value(i == 26 ? Boolean.FALSE : 0);
            }
            jSONStringer.key("code");
            String str2 = next.f124354f;
            if (str2 == null) {
                str2 = "";
            }
            jSONStringer.value(str2);
            jSONStringer.endObject();
        }
        jSONStringer.endArray();
        if (i == 8) {
            jSONStringer.endObject();
        }
        return jSONStringer.toString();
    }

    /* renamed from: c */
    public static String m59693c(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.CardListItemParser", "parseCardListItemArray jsonContent is null");
            return null;
        }
        JSONArray optJSONArray = new JSONObject(str).optJSONArray("card_list");
        if (optJSONArray != null) {
            if (optJSONArray.length() != 0) {
                JSONStringer jSONStringer = new JSONStringer();
                jSONStringer.array();
                int i2 = 0;
                while (i2 < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    jSONStringer.object();
                    try {
                        jSONStringer.key(i == 26 ? "cardId" : "card_id");
                        jSONStringer.value(optJSONObject.optString("card_id"));
                        jSONStringer.key(i == 26 ? "cardExt" : "card_ext");
                        jSONStringer.value(optJSONObject.optString("card_ext"));
                        String str2 = "isSuccess";
                        jSONStringer.key(i == 26 ? str2 : "is_succ");
                        if (i != 26) {
                            jSONStringer.value((long) optJSONObject.optInt("is_succ"));
                        } else if (optJSONObject.optInt("is_succ") == 1) {
                            jSONStringer.value(true);
                        } else {
                            jSONStringer.value(false);
                        }
                        jSONStringer.key("code");
                        if (!TextUtils.isEmpty(optJSONObject.optString("encrypt_code"))) {
                            jSONStringer.value(optJSONObject.optString("encrypt_code"));
                        } else {
                            jSONStringer.value(optJSONObject.optString("code"));
                        }
                        jSONStringer.endObject();
                        StringBuilder sb = new StringBuilder();
                        sb.append("parseJsonToArray item");
                        sb.append(i2);
                        sb.append("  is_succ:");
                        if (i != 26) {
                            str2 = "is_succ";
                        }
                        sb.append(optJSONObject.optInt(str2));
                        Log.m105924i("MicroMsg.CardListItemParser", sb.toString());
                        i2++;
                    } catch (JSONException e) {
                        Log.printErrStackTrace("MicroMsg.CardListItemParser", e, "", new Object[0]);
                        return "";
                    }
                }
                jSONStringer.endArray();
                return jSONStringer.toString();
            }
        }
        Log.m105920e("MicroMsg.CardListItemParser", "parseCardListItemArray cardItemListJson is null");
        return null;
    }
}
