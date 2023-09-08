package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.util.Base64;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedList;
import org.json.JSONObject;
import p773yy.C66708h;
import qy2.C77459z;
import uz2.C65488a0;
import uz2.C65491m1;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.f0 */
public final class C55497f0 extends AppBrandProxyUIProcessTask {
    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        if (!(processRequest instanceof DoSetTextStatusRequest)) {
            Log.m105928w("MicroMsg.AppBrand.JsApiSetTextStatus", "handleRequest, request is not DoSetTextStatusRequest");
            return;
        }
        Log.m105924i("MicroMsg.AppBrand.JsApiSetTextStatus", "handleRequest, setTextStatus");
        C66708h hVar = (C66708h) C86312j.m106911c(C66708h.class);
        if (hVar != null) {
            MMActivity activityContext = getActivityContext();
            SetTextStatusParams setTextStatusParams = ((DoSetTextStatusRequest) processRequest).f158044d;
            LinkedList linkedList = new LinkedList();
            C65488a0 a0Var = new C65488a0();
            a0Var.f188439d = "7";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appId", setTextStatusParams.f158051j);
            jSONObject.put("username", setTextStatusParams.f158052n);
            jSONObject.put("path", setTextStatusParams.f158048g);
            jSONObject.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, setTextStatusParams.f158054p);
            jSONObject.put("versionType", setTextStatusParams.f158053o);
            jSONObject.put("headImageURL", setTextStatusParams.f158056r);
            a0Var.f188441f = jSONObject.toString();
            C65491m1 m1Var = new C65491m1();
            m1Var.f188449d = setTextStatusParams.f158051j;
            m1Var.f188450e = setTextStatusParams.f158048g;
            m1Var.f188451f = setTextStatusParams.f158052n;
            m1Var.f188452g = setTextStatusParams.f158053o;
            m1Var.f188453h = setTextStatusParams.f158054p;
            m1Var.f188454i = setTextStatusParams.f158056r;
            a0Var.f188442g = Base64.encodeToString(m1Var.toByteArray(), 2);
            linkedList.add(a0Var);
            C65488a0 a0Var2 = new C65488a0();
            a0Var2.f188439d = "3";
            a0Var2.f188441f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
            linkedList.add(a0Var2);
            C77459z.C63350a aVar = new C77459z.C63350a();
            aVar.mo88259f(setTextStatusParams.f158055q);
            aVar.mo88257d("http://wxapp.tc.qq.com/258/20304/stodownload?m=78b18448b71e7f791aad33ecee51e533&filekey=30340201010420301e0202010204025348041078b18448b71e7f791aad33ecee51e53302020ad5040d00000004627466730000000131&hy=SH&storeid=32303231303432373134313731383030306535393731303030303030303037636638353130393030303030313032&bizid=1023");
            aVar.mo88258e(setTextStatusParams.f158051j + "@weapp");
            aVar.mo88256c(setTextStatusParams.f158050i);
            aVar.mo88254a(setTextStatusParams.f158045d);
            aVar.f179715a.f229400e = setTextStatusParams.f158046e;
            aVar.mo88260g(setTextStatusParams.f158049h);
            aVar.f179715a.f229399d.f147231J = setTextStatusParams.f158047f;
            aVar.mo88255b(linkedList);
            C77459z zVar = aVar.f179715a;
            C87412m.m108593f(zVar, "Builder()\n            .s…fos)\n            .build()");
            hVar.L20(activityContext, zVar);
        }
        finishProcess(new EmptyResult());
    }
}
