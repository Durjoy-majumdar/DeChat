package sl0;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashMap;
import kr0.C88267e;
import ob0.C47350c;
import org.json.JSONObject;
import p275xz.C53485d;
import v20.C90741c;

/* renamed from: sl0.h */
public final class C48417h implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C88267e f129598a;

    /* renamed from: b */
    public final /* synthetic */ int f129599b;

    /* renamed from: c */
    public final /* synthetic */ C48418i f129600c;

    public C48417h(C88267e eVar, int i, C48418i iVar) {
        this.f129598a = eVar;
        this.f129599b = i;
        this.f129600c = iVar;
    }

    /* renamed from: a */
    public final void mo288a(int i, int i2, String str, C47350c cVar) {
        C90741c.m113809b("MicroMsg.JsApiNativeWXPayCgiTunnel", "onGYNetEnd errType :" + i + " errCode: " + i2 + " errMsg :" + str, new Object[0]);
        if (i == 0 && i2 == 0 && cVar.f127056b.f127083a != null) {
            C90741c.m113809b("MicroMsg.JsApiNativeWXPayCgiTunnel", "nativeWXPayCgiTunnel cgi success", new Object[0]);
            String S50 = ((C53485d) C86312j.m106911c(C53485d.class)).S50(cVar.f127056b.f127083a);
            if (!Util.isNullOrNil(S50)) {
                HashMap hashMap = new HashMap();
                C87412m.m108593f(S50, "respbuf");
                hashMap.put("respbuf", S50);
                C88267e eVar = this.f129598a;
                int i3 = this.f129599b;
                C48418i iVar = this.f129600c;
                iVar.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                hashMap.put("errno", 0);
                eVar.mo109647a(i3, iVar.mo115114o("ok", hashMap));
                return;
            }
            C88267e eVar2 = this.f129598a;
            int i4 = this.f129599b;
            C48418i iVar2 = this.f129600c;
            iVar2.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            eVar2.mo109647a(i4, iVar2.mo115115p("ok", jSONObject));
            return;
        }
        C90741c.m113808a("MicroMsg.JsApiNativeWXPayCgiTunnel", "nativeWXPayCgiTunnel cgi failed", new Object[0]);
        C88267e eVar3 = this.f129598a;
        int i5 = this.f129599b;
        C48418i iVar3 = this.f129600c;
        iVar3.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1000, "fail:server system error");
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("errno", 1000);
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
        }
        eVar3.mo109647a(i5, iVar3.mo115115p("fail:server system error", jSONObject2));
    }
}
