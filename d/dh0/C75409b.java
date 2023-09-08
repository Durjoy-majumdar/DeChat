package dh0;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import i12.C76255b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dh0.b */
public class C75409b {
    /* renamed from: a */
    public static String m90442a(C76255b bVar) {
        JSONObject jSONObject = new JSONObject();
        if (bVar == null) {
            return jSONObject.toString();
        }
        try {
            jSONObject.put("type", bVar.f223379e);
            String str = bVar.f223379e;
            if (str != null) {
                if (str.equals("1")) {
                    jSONObject.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, bVar.f223381g);
                    jSONObject.put("taxNumber", "");
                    jSONObject.put("companyAddress", "");
                    jSONObject.put("telephone", "");
                    jSONObject.put("bankName", "");
                    jSONObject.put("bankAccount", "");
                    return jSONObject.toString();
                }
            }
            jSONObject.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, bVar.f223380f);
            String str2 = bVar.f223382h;
            if (str2 != null) {
                jSONObject.put("taxNumber", str2);
            } else {
                jSONObject.put("taxNumber", "");
            }
            String str3 = bVar.f223389r;
            if (str3 != null) {
                jSONObject.put("companyAddress", str3);
            } else {
                jSONObject.put("companyAddress", "");
            }
            String str4 = bVar.f223386o;
            if (str4 != null) {
                jSONObject.put("telephone", str4);
            } else {
                jSONObject.put("telephone", "");
            }
            String str5 = bVar.f223384j;
            if (str5 != null) {
                jSONObject.put("bankName", str5);
            } else {
                jSONObject.put("bankName", "");
            }
            String str6 = bVar.f223383i;
            if (str6 != null) {
                jSONObject.put("bankAccount", str6);
            } else {
                jSONObject.put("bankAccount", "");
            }
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.InvoiceUtil", "put json value error : %s", android.util.Log.getStackTraceString(e));
        }
        return jSONObject.toString();
    }
}
