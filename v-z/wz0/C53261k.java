package wz0;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hz0.C46141c;
import hz0.C46153l0;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C48748aq;
import te3.C52290zp;

/* renamed from: wz0.k */
public class C53261k {
    /* renamed from: a */
    public static String m59694a(Context context, int i, CardInfo cardInfo) {
        int i2 = i % 10;
        if (i2 == 0) {
            return context.getString(C0966R.string.b1x);
        }
        if (i2 == 1) {
            return context.getString(C0966R.string.b1w);
        }
        if (i2 == 2) {
            return context.getString(C0966R.string.b1v);
        }
        if (i2 == 3) {
            return context.getString(C0966R.string.b1u);
        }
        if (i2 != 4) {
            return null;
        }
        return cardInfo.field_label_wording;
    }

    /* renamed from: b */
    public static C52290zp m59695b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C52290zp zpVar = new C52290zp();
        zpVar.f146161e = jSONObject.optString("announcement");
        zpVar.f146160d = jSONObject.optString("card_id");
        zpVar.f146162f = jSONObject.optInt("end_time", 0);
        zpVar.f146163g = jSONObject.optInt("update_time", 0);
        zpVar.f146164h = jSONObject.optString("label_wording");
        return zpVar;
    }

    /* renamed from: c */
    public static C48748aq m59696c(JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.m105928w("MicroMsg.CardStickyHelper", "parseLayoutItemList param obj null");
            return null;
        }
        C48748aq aqVar = new C48748aq();
        aqVar.f130719d = new LinkedList<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(FirebaseAnalytics.C113379b.ITEM_LIST);
            for (int i = 0; i < jSONArray.length(); i++) {
                C52290zp b = m59695b(jSONArray.getJSONObject(i));
                if (b == null || (((long) b.f146162f) <= Util.nowSecond() && b.f146162f != 0)) {
                    Log.m105924i("MicroMsg.CardStickyHelper", "item.end_time > Util.nowSecond()");
                } else {
                    aqVar.f130719d.add(b);
                }
            }
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.CardStickyHelper", e, "", new Object[0]);
        }
        return aqVar;
    }

    /* renamed from: d */
    public static void m59697d(LinkedList<C52290zp> linkedList, int i) {
        if (linkedList != null) {
            int size = linkedList.size();
            for (int i2 = 0; i2 < linkedList.size(); i2++) {
                C52290zp zpVar = linkedList.get(i2);
                C46141c Gx0 = C46153l0.Gx0();
                String str = zpVar.f146160d;
                int i3 = ((size - i2) * 10) + i;
                String str2 = zpVar.f146161e;
                int i4 = zpVar.f146162f;
                Gx0.getClass();
                if (Util.isNullOrNil(str)) {
                    Log.m105928w("MicroMsg.CardInfoStorage", "cardId null");
                } else {
                    Gx0.f124344d.execSQL("UserCardInfo", "update UserCardInfo set stickyIndex=" + i3 + ", " + "stickyAnnouncement" + "='" + str2 + "', " + "stickyEndTime" + "=" + i4 + " where " + "card_id" + "='" + str + "'");
                }
            }
        }
    }

    /* renamed from: e */
    public static void m59698e(LinkedList<C52290zp> linkedList, int i) {
        if (linkedList != null) {
            for (int i2 = 0; i2 < linkedList.size(); i2++) {
                C52290zp zpVar = linkedList.get(i2);
                C46141c Gx0 = C46153l0.Gx0();
                String str = zpVar.f146160d;
                String str2 = zpVar.f146164h;
                if (str2 == null) {
                    str2 = "";
                }
                Gx0.getClass();
                Gx0.f124344d.execSQL("UserCardInfo", "update UserCardInfo set stickyIndex=" + i + ", " + "label_wording" + "='" + str2 + "' where " + "card_id" + "='" + str + "'");
            }
        }
    }
}
