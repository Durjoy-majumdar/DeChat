package sl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import jk0.C87975a;
import jk0.C87986j;
import org.json.JSONObject;

/* renamed from: sl0.c */
public abstract class C90218c extends C82268c<C82381f> implements C87986j {

    /* renamed from: g */
    public C87975a f259023g = new C87975a();

    /* renamed from: h */
    public boolean mo114532h() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (!BuildInfo.DEBUG) {
            mo114531v(fVar, jSONObject, i, fVar.getJsRuntime());
            return;
        }
        throw new RuntimeException("Should call 3 params version!");
    }

    /* renamed from: v */
    public void mo114531v(C82381f fVar, JSONObject jSONObject, int i, C40482o oVar) {
        String taskId = getTaskId();
        HashMap hashMap = new HashMap();
        hashMap.put(mo122435a(), taskId);
        this.f259023g.f254568a.put(taskId, oVar);
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        hashMap.put("errno", 0);
        fVar.mo109647a(i, mo115114o("ok", hashMap));
        mo122436d(fVar, jSONObject, taskId);
    }
}
