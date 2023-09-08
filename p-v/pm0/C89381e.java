package pm0;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import js0.C9514m;
import kr0.C88267e;
import org.json.JSONException;
import org.json.JSONObject;
import pm0.C89377c;
import xj0.C91216b0;

/* renamed from: pm0.e */
public class C89381e implements C91216b0<JSONObject> {

    /* renamed from: a */
    public final /* synthetic */ C89377c.C89379b f257376a;

    /* renamed from: b */
    public final /* synthetic */ C88267e f257377b;

    /* renamed from: c */
    public final /* synthetic */ String f257378c;

    /* renamed from: d */
    public final /* synthetic */ int f257379d;

    /* renamed from: e */
    public final /* synthetic */ String f257380e;

    /* renamed from: f */
    public final /* synthetic */ C89383g f257381f;

    public C89381e(C89383g gVar, C89377c.C89379b bVar, C88267e eVar, String str, int i, String str2) {
        this.f257381f = gVar;
        this.f257376a = bVar;
        this.f257377b = eVar;
        this.f257378c = str;
        this.f257379d = i;
        this.f257380e = str2;
    }

    /* renamed from: a */
    public void mo123718a(int i, int i2, String str, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            jSONObject.put("errCode", i2);
            jSONObject.put("errMsg", this.f257381f.mo114779e() + XVFSFile.PATH_SEPARATOR + str);
            if (i2 == 0) {
                C9514m mVar = new C9514m();
                C86009m1 m1Var = new C86009m1(this.f257376a.f257371a);
                if (this.f257377b.getFileSystem().createTempFileFrom(m1Var, this.f257378c, true, mVar) != C81410b0.OK) {
                    this.f257377b.mo109647a(this.f257379d, this.f257381f.mo115109j(String.format("fail: createTempFileFrom fail %s", new Object[]{this.f257380e})));
                    return;
                }
                jSONObject.put("tempFilePath", mVar.f29691a);
                Log.m105925i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaContainer", "exportMediaContainer, fileName: %s, tempFile: [%s %s %s]", this.f257380e, mVar.f29691a, m1Var.mo119976n(), m1Var.mo119971i());
            } else {
                C86013q1.m106447h(this.f257376a.f257371a);
            }
            Log.m105925i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaContainer", "exportMediaContainer result: %s", jSONObject.toString());
        } catch (JSONException unused) {
        }
        this.f257377b.mo109647a(this.f257379d, jSONObject.toString());
    }
}
