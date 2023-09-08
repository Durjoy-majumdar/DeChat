package ms3;

import com.tencent.midas.api.ability.MidasActivityAbility;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: ms3.a */
public final class C11091a {

    /* renamed from: a */
    public static final C11091a f32868a = new C11091a();

    /* renamed from: b */
    public static /* synthetic */ void m10992b(C11091a aVar, String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject, String str7, int i, Object obj) {
        int i2 = i;
        aVar.mo11230a(str, str2, str3, str4, str5, str6, (i2 & 64) != 0 ? null : jSONObject, (i2 & 128) != 0 ? "" : str7);
    }

    /* renamed from: a */
    public final void mo11230a(String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject, String str7) {
        C87412m.m108594g(str4, "shareScene");
        C87412m.m108594g(str5, MidasActivityAbility.AbsShare.TYPE_KEY);
        C87412m.m108594g(str6, "isFastShare");
        Log.m105924i("Finder.FinderLiveShareReporter", "[report25775] liveId:" + str + ", feedId:" + str2 + ", username:" + str3 + ", shareScene:" + str4 + ", shareType: " + str5 + "isFastShare:" + str6 + ", shareExtra:" + jSONObject + " sessionBuffer: " + str7);
        String n = C112551y.m153814n(String.valueOf(jSONObject), ",", ";", false);
        long currentTimeMillis = System.currentTimeMillis();
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[10];
        objArr[0] = String.valueOf(currentTimeMillis);
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        if (str2 == null) {
            str2 = "";
        }
        objArr[2] = str2;
        if (str3 == null) {
            str3 = "";
        }
        objArr[3] = str3;
        objArr[4] = str4;
        objArr[5] = str5;
        objArr[6] = str6;
        objArr[7] = n;
        objArr[8] = Long.valueOf(currentTimeMillis);
        objArr[9] = str7;
        nVar.mo160131h(25775, objArr);
    }
}
