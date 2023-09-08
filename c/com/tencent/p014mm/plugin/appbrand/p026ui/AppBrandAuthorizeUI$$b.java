package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.LinkedList;
import java.util.List;
import ob0.C47350c;
import ob0.C89144l0;
import te3.C51793w7;
import te3.C52322zx2;
import te3.f55;
import te3.g55;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$$b */
public class AppBrandAuthorizeUI$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f108870d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandAuthorizeUI$$p f108871e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandAuthorizeUI f108872f;

    public AppBrandAuthorizeUI$$b(AppBrandAuthorizeUI appBrandAuthorizeUI, List list, AppBrandAuthorizeUI$$p appBrandAuthorizeUI$$p) {
        this.f108872f = appBrandAuthorizeUI;
        this.f108870d = list;
        this.f108871e = appBrandAuthorizeUI$$p;
    }

    public void run() {
        AppBrandAuthorizeUI appBrandAuthorizeUI = this.f108872f;
        if (appBrandAuthorizeUI.f49773y) {
            appBrandAuthorizeUI.f49773y = false;
            String str = appBrandAuthorizeUI.f49757f;
            List list = this.f108870d;
            AppBrandAuthorizeUI$$p appBrandAuthorizeUI$$p = this.f108871e;
            LinkedList<C52322zx2> linkedList = new LinkedList<>();
            int W7 = appBrandAuthorizeUI.mo22475W7();
            int V7 = appBrandAuthorizeUI.mo22474V7();
            for (C51793w7 next : appBrandAuthorizeUI.f49755d) {
                if (list.contains(next.f143896d)) {
                    Log.m105925i("MicroMsg.AppBrandAuthorizeUI", "setAuthState scope=%s", next.f143896d);
                    if ((appBrandAuthorizeUI.f49736D || !appBrandAuthorizeUI.f49735C || !next.f143896d.equals("scope.userLocationBackground") || W7 == 2) && (appBrandAuthorizeUI.f49742J || !appBrandAuthorizeUI.f49741I || !next.f143896d.equals("scope.bluetoothBackground") || V7 == 2)) {
                        C52322zx2 zx22 = new C52322zx2();
                        if (next.f143896d.equals("scope.userInfo")) {
                            zx22.f146270f = appBrandAuthorizeUI.f49771w;
                        }
                        if (next.f143896d.equals("scope.userProfileChange")) {
                            zx22.f146270f = appBrandAuthorizeUI.f49772x;
                        }
                        zx22.f146268d = next.f143896d;
                        zx22.f146269e = next.f143898f;
                        linkedList.add(zx22);
                    }
                }
            }
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new f55();
            bVar.f127067b = new g55();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp_modauth";
            bVar.f127069d = 1188;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            f55 f55 = new f55();
            f55.f133306d = str;
            f55.f133307e = linkedList;
            bVar.f127066a = f55;
            MMHandlerThread.postToMainThread(new C18029g(appBrandAuthorizeUI));
            C89144l0.m111430f(bVar.mo72403a(), new C84541i(appBrandAuthorizeUI, appBrandAuthorizeUI$$p), true, appBrandAuthorizeUI);
        }
    }
}
