package o91;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.math.BigDecimal;
import org.json.JSONObject;
import te3.v84;

/* renamed from: o91.h */
public final class C100315h {
    /* renamed from: a */
    public static JSONObject m131140a(v84 v84) {
        Log.m105929w("HABBYGE-MALI.HellTimelineReport", "createInvalidateFeed, timeline: %s, %s, %s", Long.valueOf(v84.f299655e), Long.valueOf(v84.f299656f), Long.valueOf(v84.f299657g));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("feedId", "10001");
            jSONObject.put("viewLikeCount", 0);
            jSONObject.put("viewCommentCount", 0);
            jSONObject.put("userName", "");
            jSONObject.put("feedheight", 0);
            jSONObject.put("realShowTime", new BigDecimal(v84.f299655e).setScale(2, 4).doubleValue());
            jSONObject.put("stayTimeRelative", new BigDecimal(v84.f299655e).setScale(2, 4).doubleValue());
            jSONObject.put("realScreenHeight", 0);
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.HellTimelineReport", e, "createInvalidateFeed-crash, %s", e.getMessage());
        }
        return jSONObject;
    }
}
