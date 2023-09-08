package sl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fu3.C116901a;
import java.util.HashMap;
import jk0.C87975a;
import jk0.C87986j;
import org.json.JSONObject;

/* renamed from: sl0.b */
public abstract class C90217b extends C82016a0<C82381f> implements C87986j {

    /* renamed from: g */
    public C87975a f259018g = new C87975a();

    /* renamed from: h */
    public boolean mo114532h() {
        return true;
    }

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        if (!BuildInfo.DEBUG) {
            return mo114482u(fVar, jSONObject, fVar.getJsRuntime());
        }
        throw new RuntimeException("Should call 3 params version!");
    }

    /* renamed from: u */
    public String mo114482u(C82381f fVar, JSONObject jSONObject, C40482o oVar) {
        String taskId = getTaskId();
        HashMap hashMap = new HashMap();
        hashMap.put(mo122435a(), taskId);
        this.f259018g.f254568a.put(taskId, oVar);
        mo124021v(fVar, taskId);
        C116901a asyncHandler = fVar.getAsyncHandler();
        if (asyncHandler != null) {
            asyncHandler.post(new b$$a(this, fVar, jSONObject, taskId));
        } else {
            mo122436d(fVar, jSONObject, taskId);
        }
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        hashMap.put("errno", 0);
        return mo115114o("ok", hashMap);
    }

    /* renamed from: v */
    public void mo124021v(C82381f fVar, String str) {
    }
}
