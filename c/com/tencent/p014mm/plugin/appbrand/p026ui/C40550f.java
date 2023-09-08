package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import cs0.C45152a0;
import java.util.HashMap;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C51793w7;
import te3.bp4;
import te3.s45;
import te3.v75;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.f */
public class C40550f implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeUI f108926d;

    public C40550f(AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f108926d = appBrandAuthorizeUI;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105919d("MicroMsg.AppBrandAuthorizeUI", "WxaAppGetAuthInfoReq errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            s45 s45 = (s45) cVar.f127056b.f127083a;
            if (s45 == null) {
                AppBrandAuthorizeUI appBrandAuthorizeUI = this.f108926d;
                String[] strArr = AppBrandAuthorizeUI.f49731X;
                appBrandAuthorizeUI.getClass();
                appBrandAuthorizeUI.runOnUiThread(new C40551m(appBrandAuthorizeUI, false));
                Log.m105920e("MicroMsg.AppBrandAuthorizeUI", "WxaAppGetAuthInfoReq failed, response is null!");
            } else {
                bp4 bp4 = s45.f141326d;
                int i3 = bp4.f131249d;
                String str2 = bp4.f131250e;
                if (i3 == 0) {
                    AppBrandAuthorizeUI appBrandAuthorizeUI2 = this.f108926d;
                    LinkedList<C51793w7> linkedList = s45.f141327e;
                    appBrandAuthorizeUI2.f49755d = linkedList;
                    appBrandAuthorizeUI2.f49736D = AppBrandAuthorizeUI.m18567N7(linkedList);
                    this.f108926d.f49742J = AppBrandAuthorizeUI.m18566M7(s45.f141327e);
                    AppBrandAuthorizeUI appBrandAuthorizeUI3 = this.f108926d;
                    v75 v75 = s45.f141328f;
                    appBrandAuthorizeUI3.f49756e = v75;
                    C45152a0 a0Var = C45152a0.f122426a;
                    String str3 = appBrandAuthorizeUI3.f49757f;
                    Log.m105924i("MicroMsg.AppBrand.UserInfoRevokeRepository", "injectCachedUsageInfo, appId: " + str3);
                    if (!(str3 == null || v75 == null)) {
                        ((HashMap) C45152a0.f122427b).put(str3, v75);
                    }
                } else {
                    AppBrandAuthorizeUI appBrandAuthorizeUI4 = this.f108926d;
                    String[] strArr2 = AppBrandAuthorizeUI.f49731X;
                    appBrandAuthorizeUI4.getClass();
                    appBrandAuthorizeUI4.runOnUiThread(new C40551m(appBrandAuthorizeUI4, false));
                    Log.m105921e("MicroMsg.AppBrandAuthorizeUI", "WxaAppGetAuthInfoReq error %s", str2);
                }
            }
            AppBrandAuthorizeUI appBrandAuthorizeUI5 = this.f108926d;
            appBrandAuthorizeUI5.f49743K = true;
            AppBrandAuthorizeUI.m18561H7(appBrandAuthorizeUI5, appBrandAuthorizeUI5.f49755d, appBrandAuthorizeUI5.f49745M, appBrandAuthorizeUI5.f49756e);
            return 0;
        }
        AppBrandAuthorizeUI appBrandAuthorizeUI6 = this.f108926d;
        String[] strArr3 = AppBrandAuthorizeUI.f49731X;
        appBrandAuthorizeUI6.getClass();
        appBrandAuthorizeUI6.runOnUiThread(new C40551m(appBrandAuthorizeUI6, false));
        return 0;
    }
}
