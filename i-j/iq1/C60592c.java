package iq1;

import android.app.Activity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.TXLiveConstants;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import je1.C33554b4;
import org.json.JSONArray;
import org.json.JSONObject;
import sx3.C64197v;
import te3.C64561mp1;

/* renamed from: iq1.c */
public final class C60592c {

    /* renamed from: a */
    public final Activity f172681a;

    /* renamed from: b */
    public final C64561mp1 f172682b;

    /* renamed from: c */
    public final String f172683c = "Finder.WxaAdUIC";

    /* renamed from: d */
    public boolean f172684d;

    /* renamed from: e */
    public long f172685e;

    /* renamed from: f */
    public long f172686f;

    /* renamed from: g */
    public final List<String> f172687g = C64197v.m75537f("dismatch", "duplicate", "quality");

    /* renamed from: h */
    public final String f172688h = "good";

    /* renamed from: i */
    public final JSONArray f172689i = new JSONArray();

    /* renamed from: j */
    public final HashMap<String, Integer> f172690j;

    public C60592c(Activity activity, C64561mp1 mp12) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(mp12, "wxaAdInfo");
        this.f172681a = activity;
        this.f172682b = mp12;
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("follow", 2008);
        hashMap.put("like", 2009);
        hashMap.put("double_like", Integer.valueOf(TXLiveConstants.PLAY_EVT_RCV_FIRST_AUDIO_FRAME));
        hashMap.put("big_btn_click", 2025);
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_COMMENT, 2010);
        hashMap.put("headimage", 2011);
        hashMap.put("nickname", 2012);
        hashMap.put("forward", 2013);
        this.f172690j = hashMap;
    }

    /* renamed from: a */
    public final void mo85549a() {
        this.f172684d = true;
        this.f172685e = C31543z5.m39453c();
    }

    /* renamed from: b */
    public final void mo85550b(String str) {
        try {
            int i = this.f172690j.get(str);
            if (i == null) {
                i = -1;
            }
            int intValue = i.intValue();
            String str2 = this.f172682b.f184372i;
            if (str2 == null) {
                str2 = "";
            }
            JSONObject jSONObject = new JSONObject(str2);
            JSONObject optJSONObject = jSONObject.optJSONObject("weapp_extra_data");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            jSONObject.put("report_type", 2);
            jSONObject.put("report_link", this.f172682b.f184371h);
            jSONObject.put("press_interval", 0);
            jSONObject.put("click_pos", intValue);
            jSONObject.put("pos_x", 0);
            jSONObject.put("pos_y", 0);
            optJSONObject.put("exp_time", this.f172686f);
            optJSONObject.put("clk_time", C31543z5.m39453c());
            jSONObject.put("weapp_extra_data", optJSONObject.toString());
            String str3 = this.f172683c;
            Log.m105924i(str3, "reportNormalAction source=" + str + " clickPos=" + intValue);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "json.toString()");
            C86709a0.m107524d().mo123460f(new C33554b4(1, jSONObject2));
        } catch (Throwable th) {
            String str4 = this.f172683c;
            Log.printErrStackTrace(str4, th, "reportNormalAction " + str, new Object[0]);
        }
    }
}
