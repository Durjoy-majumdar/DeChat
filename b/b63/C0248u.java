package b63;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import org.json.JSONObject;

/* renamed from: b63.u */
public class C0248u {

    /* renamed from: a */
    public String f786a;

    /* renamed from: b */
    public int f787b;

    /* renamed from: c */
    public String f788c;

    /* renamed from: d */
    public String f789d;

    /* renamed from: e */
    public String f790e;

    /* renamed from: a */
    public static C0248u m207a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C0248u uVar = new C0248u();
        uVar.f786a = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        jSONObject.optString("desc");
        jSONObject.optString("logo_url");
        uVar.f787b = jSONObject.optInt("jump_type", 0);
        uVar.f788c = jSONObject.optString("jump_url");
        uVar.f789d = jSONObject.optString("username");
        uVar.f790e = jSONObject.optString("path");
        return uVar;
    }
}
