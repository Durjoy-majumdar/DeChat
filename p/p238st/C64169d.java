package p238st;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.lite.C56832d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p158gt.C76057w;

/* renamed from: st.d */
public class C64169d implements C76057w.C76058a {

    /* renamed from: a */
    public final /* synthetic */ JSONArray f181889a;

    /* renamed from: b */
    public final /* synthetic */ JSONArray f181890b;

    /* renamed from: c */
    public final /* synthetic */ C56832d f181891c;

    public C64169d(C118302c cVar, JSONArray jSONArray, JSONArray jSONArray2, C56832d dVar) {
        this.f181889a = jSONArray;
        this.f181890b = jSONArray2;
        this.f181891c = dVar;
    }

    /* renamed from: a */
    public void mo25933a(String str, Bitmap bitmap, String str2) {
        if (!Util.isNullOrNil(str)) {
            try {
                int length = this.f181889a.length();
                for (int i = 0; i < length; i++) {
                    if (str.equals(this.f181889a.optString(i))) {
                        JSONObject optJSONObject = this.f181890b.optJSONObject(i);
                        if (optJSONObject != null) {
                            if (Util.isNullOrNil(str2)) {
                                optJSONObject.put("state", "fail");
                            } else {
                                optJSONObject.put("state", "success");
                                optJSONObject.put("path", C86013q1.m106448i(str2, false));
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new C56832d.C56834b("preloadImages", this.f181890b.toString()));
                            this.f181891c.mo80257a(arrayList);
                        } else {
                            return;
                        }
                    }
                }
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.LiteAppFeatureService", e, "", new Object[0]);
            }
        }
    }
}
