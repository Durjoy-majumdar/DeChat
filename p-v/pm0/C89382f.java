package pm0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import kr0.C88267e;
import org.json.JSONException;
import org.json.JSONObject;
import xj0.C91216b0;

/* renamed from: pm0.f */
public class C89382f implements C91216b0<JSONObject> {

    /* renamed from: a */
    public final /* synthetic */ C88267e f257382a;

    /* renamed from: b */
    public final /* synthetic */ int f257383b;

    /* renamed from: c */
    public final /* synthetic */ C89383g f257384c;

    public C89382f(C89383g gVar, C88267e eVar, int i) {
        this.f257384c = gVar;
        this.f257382a = eVar;
        this.f257383b = i;
    }

    /* renamed from: a */
    public void mo123718a(int i, int i2, String str, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            jSONObject.put("errCode", i2);
            jSONObject.put("errMsg", this.f257384c.mo114779e() + XVFSFile.PATH_SEPARATOR + str);
            Log.m105925i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaContainer", "removeMediaContainer result, %s", jSONObject.toString());
        } catch (JSONException unused) {
        }
        this.f257382a.mo109647a(this.f257383b, jSONObject.toString());
    }
}
