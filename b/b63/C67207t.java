package b63;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: b63.t */
public class C67207t {

    /* renamed from: a */
    public boolean f192970a;

    /* renamed from: b */
    public int f192971b;

    /* renamed from: c */
    public String f192972c;

    /* renamed from: d */
    public String f192973d;

    /* renamed from: e */
    public String f192974e;

    /* renamed from: f */
    public List<C67208a> f192975f = new ArrayList();

    /* renamed from: b63.t$a */
    public static class C67208a {

        /* renamed from: a */
        public String f192976a;

        /* renamed from: b */
        public String f192977b;

        /* renamed from: c */
        public String f192978c;

        /* renamed from: d */
        public String f192979d;
    }

    /* renamed from: a */
    public static C67207t m79538a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        if (jSONObject == null) {
            return null;
        }
        C67207t tVar = new C67207t();
        jSONObject.optInt("block_layer_report_id");
        tVar.f192970a = jSONObject.optBoolean("is_show");
        tVar.f192971b = jSONObject.optInt("action_type");
        tVar.f192972c = jSONObject.optString("tiny_app_username");
        tVar.f192973d = jSONObject.optString("tiny_app_path");
        tVar.f192974e = jSONObject.optString("url");
        if (jSONObject.has("text_info_array") && (optJSONArray = jSONObject.optJSONArray("text_info_array")) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                C67208a aVar = new C67208a();
                aVar.f192976a = optJSONObject.optString("main_wording");
                aVar.f192977b = optJSONObject.optString("reminder_content");
                aVar.f192978c = optJSONObject.optString("action_btn_text");
                aVar.f192979d = optJSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE);
                ((ArrayList) tVar.f192975f).add(aVar);
            }
        }
        return tVar;
    }
}
