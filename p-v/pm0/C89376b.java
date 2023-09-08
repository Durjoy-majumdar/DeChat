package pm0;

import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;
import org.json.JSONObject;
import pm0.C89369a;
import xj0.C91216b0;

/* renamed from: pm0.b */
public class C89376b implements C91216b0<JSONObject> {

    /* renamed from: a */
    public final /* synthetic */ C89369a.C89372c f257370a;

    public C89376b(C89369a.C89372c cVar) {
        this.f257370a = cVar;
    }

    /* renamed from: a */
    public void mo123718a(int i, int i2, String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        C89369a.C89372c cVar = this.f257370a;
        C89369a aVar = C89369a.this;
        C88267e eVar = cVar.f257356a;
        C89369a.m111700B(aVar, eVar, i, i2, str, (JSONObject) obj, jSONObject);
        Log.m105925i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "editFormatResult result, %s", jSONObject.toString());
        C89369a.C89372c cVar2 = this.f257370a;
        cVar2.f257356a.mo109647a(cVar2.f257357b, jSONObject.toString());
    }
}
