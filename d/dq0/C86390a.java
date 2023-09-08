package dq0;

import bq0.C79768h;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.sdk.platformtools.Log;
import dq0.C86392b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import js0.C88016e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dq0.a */
public class C86390a {

    /* renamed from: a */
    public C79768h f251179a;

    /* renamed from: dq0.a$a */
    public static class C86391a implements C86392b.C86394b {
        /* renamed from: a */
        public void mo109891a(AppBrandRuntime appBrandRuntime, JSONObject jSONObject) {
            try {
                jSONObject.put("switchFs", 1);
            } catch (JSONException unused) {
            }
        }
    }

    static {
        C86392b.f251180a = new C86391a();
    }

    /* renamed from: a */
    public String mo120815a() {
        if (this.f251179a != null) {
            StringBuffer stringBuffer = new StringBuffer();
            mo109893c(stringBuffer);
            stringBuffer.append(mo109892b());
            return stringBuffer.toString();
        }
        throw new IllegalStateException("You had not called whenCreateJsRuntime!");
    }

    /* renamed from: b */
    public String mo109892b() {
        return C88016e.m109548e("wxa_library/node_jsapi.js");
    }

    /* renamed from: c */
    public void mo109893c(StringBuffer stringBuffer) {
        stringBuffer.append(";const _switchTimer = true;");
    }

    /* renamed from: d */
    public void mo120816d() {
        Log.m105924i("MicroMsg.AppBrandNodeJSInstallHelper", "whenCleanUp");
        C79768h hVar = this.f251179a;
        if (hVar != null) {
            hVar.getClass();
            Log.m105924i("MicroMsg.NodeJavaBroker", "shutdown");
            for (Map.Entry key : ((ConcurrentHashMap) hVar.f233772c).entrySet()) {
                hVar.unListen(((Integer) key.getKey()).intValue());
            }
            ((ConcurrentHashMap) hVar.f233772c).clear();
            return;
        }
        throw new IllegalStateException("You had not called whenCreateJsRuntime!");
    }

    /* renamed from: e */
    public void mo120817e(C81925i2 i2Var, C83165i iVar) {
        Log.m105924i("MicroMsg.AppBrandNodeJSInstallHelper", "whenCreateJsRuntime");
        C79768h hVar = new C79768h(i2Var, iVar);
        this.f251179a = hVar;
        iVar.addJavascriptInterface(hVar, "gJavaBroker");
    }
}
