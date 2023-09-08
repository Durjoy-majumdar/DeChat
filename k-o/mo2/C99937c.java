package mo2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: mo2.c */
public class C99937c {

    /* renamed from: a */
    public String f292834a;

    /* renamed from: b */
    public String f292835b;

    /* renamed from: c */
    public String f292836c;

    /* renamed from: d */
    public String f292837d;

    /* renamed from: e */
    public int f292838e;

    /* renamed from: f */
    public long f292839f;

    /* renamed from: a */
    public static C99937c m130571a(String str) {
        SnsMethodCalculate.markStartTimeMs("parseFromExtJson", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("parseFromExtJson", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("subCardType");
            if (optInt != 4) {
                SnsMethodCalculate.markEndTimeMs("parseFromExtJson", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
                return null;
            }
            C99937c cVar = new C99937c();
            cVar.f292835b = jSONObject.optString("giveCardId");
            cVar.f292838e = optInt;
            cVar.f292836c = jSONObject.optString("senderUserName");
            cVar.f292837d = jSONObject.optString("senderNickName");
            cVar.f292839f = jSONObject.optLong("shareTime");
            SnsMethodCalculate.markEndTimeMs("parseFromExtJson", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            return cVar;
        } catch (Exception e) {
            Log.m105920e("ShareGiveHBCardInfo", "toExtInfoJsonString, exp=" + e.toString());
            SnsMethodCalculate.markEndTimeMs("parseFromExtJson", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            return null;
        }
    }
}
