package pm0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import kr0.C88267e;
import org.json.JSONException;
import org.json.JSONObject;
import xj0.C91216b0;

/* renamed from: pm0.h */
public class C89384h implements C91216b0<JSONObject> {

    /* renamed from: a */
    public final /* synthetic */ C88267e f257385a;

    /* renamed from: b */
    public final /* synthetic */ int f257386b;

    /* renamed from: c */
    public final /* synthetic */ C89388l f257387c;

    public C89384h(C89388l lVar, C88267e eVar, int i) {
        this.f257387c = lVar;
        this.f257385a = eVar;
        this.f257386b = i;
    }

    /* renamed from: a */
    public void mo123718a(int i, int i2, String str, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            jSONObject.put("errCode", i2);
            jSONObject.put("errMsg", this.f257387c.mo114779e() + XVFSFile.PATH_SEPARATOR + str);
            Log.m105925i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", "getMediaTrack result, %s", jSONObject.toString());
        } catch (JSONException unused) {
        }
        this.f257385a.mo109647a(this.f257386b, jSONObject.toString());
    }
}
