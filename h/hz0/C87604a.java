package hz0;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: hz0.a */
public class C87604a {

    /* renamed from: a */
    public String f253703a;

    /* renamed from: b */
    public int f253704b;

    /* renamed from: c */
    public String f253705c;

    /* renamed from: d */
    public String f253706d;

    /* renamed from: e */
    public String f253707e;

    /* renamed from: f */
    public String f253708f;

    /* renamed from: g */
    public String f253709g;

    /* renamed from: h */
    public String f253710h;

    /* renamed from: i */
    public String f253711i;

    /* renamed from: j */
    public String f253712j;

    /* renamed from: k */
    public int f253713k;

    /* renamed from: l */
    public String f253714l;

    /* renamed from: m */
    public String f253715m;

    /* renamed from: n */
    public String f253716n;

    /* renamed from: o */
    public boolean f253717o;

    /* renamed from: p */
    public String f253718p;

    /* renamed from: a */
    public static LinkedList<C87604a> m108956a(JSONArray jSONArray, boolean z) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        LinkedList<C87604a> linkedList = new LinkedList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            C87604a aVar = new C87604a();
            aVar.f253703a = jSONObject.optString("card_tp_id");
            aVar.f253704b = jSONObject.optInt("card_type");
            jSONObject.optString("color");
            aVar.f253705c = jSONObject.optString("logo_url");
            aVar.f253706d = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            aVar.f253707e = jSONObject.optString("sub_title");
            aVar.f253708f = jSONObject.optString("aux_title");
            aVar.f253709g = jSONObject.optString("encrypt_code");
            aVar.f253710h = jSONObject.optString("from_user_name");
            aVar.f253711i = jSONObject.optString("app_id");
            jSONObject.optInt("end_time");
            aVar.f253712j = jSONObject.optString("card_user_id");
            aVar.f253713k = jSONObject.optInt("choose_optional");
            aVar.f253715m = jSONObject.optString("invoice_item");
            aVar.f253716n = jSONObject.optString("invoice_status");
            aVar.f253714l = jSONObject.optString("invoice_title");
            aVar.f253717o = z;
            linkedList.add(aVar);
        }
        return linkedList;
    }
}
