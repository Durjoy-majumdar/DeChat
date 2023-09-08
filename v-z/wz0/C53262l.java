package wz0;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C50289lo;

/* renamed from: wz0.l */
public class C53262l {
    /* renamed from: a */
    public static LinkedList<C50289lo> m59699a(String str, int i, String str2) {
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.CardTpInfoItemParser", "parseCardTpInfoItemArray jsonContent is null");
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                Log.m105920e("MicroMsg.CardTpInfoItemParser", "parseCardTpInfoItemArray cardItemListJson is null");
                return null;
            }
            LinkedList<C50289lo> linkedList = new LinkedList<>();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (optJSONObject == null) {
                    if (i == 26 && (jSONArray.opt(i2) instanceof String)) {
                        try {
                            optJSONObject = new JSONObject(jSONArray.optString(i2));
                        } catch (JSONException e) {
                            Log.printErrStackTrace("MicroMsg.CardTpInfoItemParser", e, "protect itemJSON for AppBrand", new Object[0]);
                        }
                    }
                }
                C50289lo loVar = new C50289lo();
                loVar.f137530d = optJSONObject.optString(i == 26 ? "cardId" : "card_id");
                loVar.f137531e = optJSONObject.optString("code");
                loVar.f137532f = optJSONObject.optString("openCardParams");
                loVar.f137533g = str2;
                linkedList.add(loVar);
            }
            return linkedList;
        } catch (JSONException e2) {
            Log.printErrStackTrace("MicroMsg.CardTpInfoItemParser", e2, "", new Object[0]);
            return null;
        }
    }
}
