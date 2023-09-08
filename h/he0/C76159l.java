package he0;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: he0.l */
public class C76159l {

    /* renamed from: a */
    public String f223088a = "";

    /* renamed from: b */
    public List<C76160m> f223089b = new LinkedList();

    /* renamed from: a */
    public C76159l mo106375a(JSONObject jSONObject) {
        this.f223088a = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        JSONArray optJSONArray = jSONObject.optJSONArray("detail");
        if (optJSONArray == null) {
            return this;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            C76160m mVar = new C76160m();
            List<C76160m> list = this.f223089b;
            mVar.f223090a = jSONObject2.optString("icon");
            mVar.f223091b = jSONObject2.optString("desc");
            mVar.f223092c = jSONObject2.optInt("desc_type");
            mVar.f223093d = jSONObject2.optInt("action");
            mVar.f223094e = jSONObject2.optString("action_param");
            ((LinkedList) list).add(mVar);
        }
        return this;
    }
}
