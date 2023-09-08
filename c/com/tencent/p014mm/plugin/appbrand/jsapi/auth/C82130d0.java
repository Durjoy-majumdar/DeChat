package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import android.os.Bundle;
import b30.C79662c;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiLogin;
import com.tencent.p014mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86916a;
import fl0.C86920e;
import java.io.IOException;
import java.util.LinkedList;
import p209nt.C11272e;
import te3.C49713hj2;
import te3.C90421jk2;
import te3.C90437rw3;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.d0 */
public class C82130d0 implements C11272e.C11273a {

    /* renamed from: a */
    public final /* synthetic */ JsApiLogin.LoginTask.C82111d f240908a;

    public C82130d0(JsApiLogin.LoginTask loginTask, JsApiLogin.LoginTask.C82111d dVar) {
        this.f240908a = dVar;
    }

    /* renamed from: a */
    public void mo11330a(int i, int i2, String str, C11272e eVar) {
        Log.m105925i("MicroMsg.JsApiLogin", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            if (eVar != null) {
                C79662c cVar = (C79662c) eVar;
                if (!(cVar.mo109787j1() == null || cVar.mo109787j1().f259628d == null)) {
                    C90421jk2 j1 = cVar.mo109787j1();
                    C49713hj2 hj22 = j1.f259628d;
                    int i3 = hj22.f134688d;
                    String str2 = hj22.f134689e;
                    String str3 = j1.f259637p;
                    Log.m105925i("MicroMsg.JsApiLogin", "stev NetSceneJSLogin jsErrcode %d", Integer.valueOf(i3));
                    if (i3 == -12000) {
                        LinkedList<C90437rw3> linkedList = j1.f259630f;
                        String str4 = j1.f259631g;
                        String str5 = j1.f259632h;
                        Log.m105925i("MicroMsg.JsApiLogin", "stev appName %s, appIconUrl %s", str4, str5);
                        JsApiLogin.LoginTask.C82107a aVar = (JsApiLogin.LoginTask.C82107a) this.f240908a;
                        aVar.getClass();
                        Log.m105924i("MicroMsg.JsApiLogin", "onConfirm !");
                        JsApiLogin.LoginTask.this.f240825y = linkedList.size();
                        int i4 = 0;
                        while (true) {
                            JsApiLogin.LoginTask loginTask = JsApiLogin.LoginTask.this;
                            if (i4 < loginTask.f240825y) {
                                C90437rw3 rw32 = linkedList.get(i4);
                                try {
                                    Bundle bundle = JsApiLogin.LoginTask.this.f240826z;
                                    bundle.putByteArray(i4 + "", rw32.toByteArray());
                                    i4++;
                                } catch (IOException e) {
                                    Log.m105921e("MicroMsg.JsApiLogin", "IOException %s", e.getMessage());
                                    Log.printErrStackTrace("MicroMsg.JsApiLogin", e, "", new Object[0]);
                                    JsApiLogin.LoginTask loginTask2 = JsApiLogin.LoginTask.this;
                                    loginTask2.f240818r = "fail";
                                    loginTask2.f240808E = new AppBrandErrorInfoParcelable(C86916a.f252262a);
                                    JsApiLogin.LoginTask.this.mo114394b();
                                    return;
                                }
                            } else {
                                loginTask.f240822v = str3;
                                loginTask.f240823w = str4;
                                loginTask.f240824x = str5;
                                loginTask.f240818r = "needConfirm";
                                loginTask.mo114394b();
                                return;
                            }
                        }
                    } else if (i3 == 0) {
                        String str6 = j1.f259629e;
                        JsApiLogin.LoginTask.C82107a aVar2 = (JsApiLogin.LoginTask.C82107a) this.f240908a;
                        aVar2.getClass();
                        Log.m105924i("MicroMsg.JsApiLogin", "onSuccess !");
                        JsApiLogin.LoginTask loginTask3 = JsApiLogin.LoginTask.this;
                        loginTask3.f240817q = str6;
                        loginTask3.f240818r = "ok";
                        loginTask3.mo114394b();
                        Log.m105925i("MicroMsg.JsApiLogin", "resp data code [%s]", str6);
                        return;
                    } else {
                        AppBrandErrorInfoParcelable appBrandErrorInfoParcelable = new AppBrandErrorInfoParcelable();
                        int i5 = j1.f259628d.f134690f;
                        appBrandErrorInfoParcelable.f241429d = i5;
                        Log.m105925i("MicroMsg.JsApiLogin", "resp data errno:%d", Integer.valueOf(i5));
                        if (i3 == -12001) {
                            ((JsApiLogin.LoginTask.C82107a) this.f240908a).mo114545a(i3, str2, appBrandErrorInfoParcelable);
                            Log.m105921e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLogin Invalid Scope %s", str2);
                            return;
                        } else if (i3 == -12002) {
                            ((JsApiLogin.LoginTask.C82107a) this.f240908a).mo114545a(i3, str2, appBrandErrorInfoParcelable);
                            Log.m105921e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLogin Invalid Data %s", str2);
                            return;
                        } else if (i3 == -12003) {
                            ((JsApiLogin.LoginTask.C82107a) this.f240908a).mo114545a(i3, str2, appBrandErrorInfoParcelable);
                            Log.m105921e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLogin Invalid ApiName %s", str2);
                            return;
                        } else {
                            ((JsApiLogin.LoginTask.C82107a) this.f240908a).mo114545a(i3, str2, appBrandErrorInfoParcelable);
                            Log.m105921e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLogin %s", str2);
                            return;
                        }
                    }
                }
            }
            ((JsApiLogin.LoginTask.C82107a) this.f240908a).mo114545a(-1, String.format("cgi fail response null", new Object[0]), new AppBrandErrorInfoParcelable(C86920e.f252323m));
        } else if (i != 4) {
            JsApiLogin.LoginTask.C82111d dVar = this.f240908a;
            JsApiLogin.LoginTask.C82107a aVar3 = (JsApiLogin.LoginTask.C82107a) dVar;
            aVar3.mo114545a(-1, String.format("cgi fail(%d,%d)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), new AppBrandErrorInfoParcelable(C86920e.f252322l));
        } else {
            AppBrandErrorInfoParcelable appBrandErrorInfoParcelable2 = new AppBrandErrorInfoParcelable();
            appBrandErrorInfoParcelable2.f241429d = 1000;
            if (eVar != null) {
                C79662c cVar2 = (C79662c) eVar;
                if (!(cVar2.mo109787j1() == null || cVar2.mo109787j1().f259628d == null || cVar2.mo109787j1().f259628d.f134690f == 0)) {
                    appBrandErrorInfoParcelable2.f241429d = cVar2.mo109787j1().f259628d.f134690f;
                }
            }
            ((JsApiLogin.LoginTask.C82107a) this.f240908a).mo114545a(-1, "", appBrandErrorInfoParcelable2);
        }
    }
}
