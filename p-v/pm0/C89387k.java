package pm0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import kr0.C88267e;
import org.json.JSONException;
import org.json.JSONObject;
import xj0.C91216b0;

/* renamed from: pm0.k */
public class C89387k implements C91216b0<JSONObject> {

    /* renamed from: a */
    public final /* synthetic */ C88267e f257394a;

    /* renamed from: b */
    public final /* synthetic */ int f257395b;

    /* renamed from: c */
    public final /* synthetic */ C89388l f257396c;

    public C89387k(C89388l lVar, C88267e eVar, int i) {
        this.f257396c = lVar;
        this.f257394a = eVar;
        this.f257395b = i;
    }

    /* renamed from: a */
    public void mo123718a(int i, int i2, String str, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            jSONObject.put("errCode", i2);
            jSONObject.put("errMsg", this.f257396c.mo114779e() + XVFSFile.PATH_SEPARATOR + str);
            Log.m105925i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", "removeMediaTrack result, %s", jSONObject.toString());
        } catch (JSONException unused) {
        }
        this.f257394a.mo109647a(this.f257395b, jSONObject.toString());
    }
}
