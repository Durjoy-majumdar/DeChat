package p301cd;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fl0.C86921f;
import java.util.HashMap;
import lo0.C88606e;
import org.json.JSONException;
import org.json.JSONObject;
import p954dd.C86224a;

/* renamed from: cd.s */
public class C80009s implements C86224a.C86226b {

    /* renamed from: a */
    public final /* synthetic */ JSONObject f234400a;

    /* renamed from: b */
    public final /* synthetic */ C80005q f234401b;

    public C80009s(C80005q qVar, JSONObject jSONObject) {
        this.f234401b = qVar;
        this.f234400a = jSONObject;
    }

    /* renamed from: a */
    public void mo110249a(String str, String str2) {
        if (!Util.isNullOrNil(str2)) {
            Log.m105925i(this.f234401b.mo110227w(), "operatePlayBgm, local file path:%s", str2);
            try {
                this.f234400a.put("BGMFilePath", str2);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.SameLayer.LivePusherPluginHandler", "operatePlayBgm, set param fail", e);
            }
            this.f234401b.mo110217G(new s$$a(this, this.f234400a, str));
            return;
        }
        Log.m105921e("MicroMsg.SameLayer.LivePusherPluginHandler", "operatePlayBgm, download file fail, url:%s", str);
        if (this.f234401b.f234329n != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            C80005q qVar = this.f234401b;
            ((C88606e) qVar.f234329n).mo123053b(qVar.f253971d, C86921f.f252339m, 10003, "download file fail", hashMap);
        }
    }
}
