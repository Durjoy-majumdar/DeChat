package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import b30.C79663d;
import com.tencent.map.sdk.comps.vis.VisualLayer;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiLogin;
import com.tencent.p014mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86920e;
import p209nt.C89091f;
import te3.C49713hj2;
import te3.C49717hk2;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.e0 */
public class C82132e0 implements C89091f.C89092a {

    /* renamed from: a */
    public final /* synthetic */ JsApiLogin.LoginTask.C82111d f240909a;

    /* renamed from: b */
    public final /* synthetic */ int f240910b;

    public C82132e0(JsApiLogin.LoginTask loginTask, JsApiLogin.LoginTask.C82111d dVar, int i) {
        this.f240909a = dVar;
        this.f240910b = i;
    }

    /* renamed from: a */
    public void mo114566a(int i, int i2, String str, C89091f fVar) {
        Log.m105925i("MicroMsg.JsApiLogin", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            if (!(fVar instanceof C89091f)) {
                Log.m105924i("MicroMsg.JsApiLogin", "not jslogin cgi reqeust");
                ((JsApiLogin.LoginTask.C82107a) this.f240909a).mo114545a(-1, VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_INTERNAL_ERROR, new AppBrandErrorInfoParcelable(C86920e.f252314d));
            } else if (this.f240910b == 2) {
                Log.m105924i("MicroMsg.JsApiLogin", "press reject button");
                ((JsApiLogin.LoginTask.C82107a) this.f240909a).mo114545a(i2, "auth deny", new AppBrandErrorInfoParcelable(C86920e.f252319i));
            } else {
                C49717hk2 j1 = ((C79663d) fVar).mo109788j1();
                C49713hj2 hj22 = j1.f134699d;
                int i3 = hj22.f134688d;
                String str2 = hj22.f134689e;
                Log.m105925i("MicroMsg.JsApiLogin", "stev NetSceneJSLoginConfirm jsErrcode %d", Integer.valueOf(i3));
                if (i3 == 0) {
                    String str3 = j1.f134700e;
                    JsApiLogin.LoginTask.C82107a aVar = (JsApiLogin.LoginTask.C82107a) this.f240909a;
                    aVar.getClass();
                    Log.m105924i("MicroMsg.JsApiLogin", "onSuccess !");
                    JsApiLogin.LoginTask loginTask = JsApiLogin.LoginTask.this;
                    loginTask.f240817q = str3;
                    loginTask.f240818r = "ok";
                    loginTask.mo114394b();
                    Log.m105925i("MicroMsg.JsApiLogin", "resp data code [%s]", str3);
                    return;
                }
                AppBrandErrorInfoParcelable appBrandErrorInfoParcelable = new AppBrandErrorInfoParcelable();
                appBrandErrorInfoParcelable.f241429d = j1.f134699d.f134690f;
                ((JsApiLogin.LoginTask.C82107a) this.f240909a).mo114545a(i3, str2, appBrandErrorInfoParcelable);
                Log.m105921e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLoginConfirm %s errnoInfo.errno:%d", str2, Integer.valueOf(appBrandErrorInfoParcelable.f241429d));
            }
        } else if (i != 4) {
            ((JsApiLogin.LoginTask.C82107a) this.f240909a).mo114545a(-1, "confirm cgi fail", new AppBrandErrorInfoParcelable(C86920e.f252322l));
        } else {
            AppBrandErrorInfoParcelable appBrandErrorInfoParcelable2 = new AppBrandErrorInfoParcelable();
            appBrandErrorInfoParcelable2.f241429d = 1000;
            if (fVar != null) {
                C79663d dVar = (C79663d) fVar;
                if (!(dVar.mo109788j1() == null || dVar.mo109788j1().f134699d == null || dVar.mo109788j1().f134699d.f134690f == 0)) {
                    appBrandErrorInfoParcelable2.f241429d = dVar.mo109788j1().f134699d.f134690f;
                }
            }
            ((JsApiLogin.LoginTask.C82107a) this.f240909a).mo114545a(-1, "", appBrandErrorInfoParcelable2);
        }
    }
}
