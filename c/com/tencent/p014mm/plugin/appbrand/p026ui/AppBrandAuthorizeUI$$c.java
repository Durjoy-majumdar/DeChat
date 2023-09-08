package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.autogen.events.UpdateAppBrandNotifyMessageEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C49831id2;
import te3.s65;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$$c */
public class AppBrandAuthorizeUI$$c implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeUI f197168d;

    public AppBrandAuthorizeUI$$c(AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f197168d = appBrandAuthorizeUI;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        boolean z = true;
        Log.m105919d("MicroMsg.AppBrandAuthorizeUI", "getNotifyMsgInfo errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            s65 s65 = null;
            LinkedList<s65> linkedList = ((C49831id2) cVar.f127056b.f127083a).f135243e;
            if (linkedList == null) {
                Log.m105920e("MicroMsg.AppBrandAuthorizeUI", "wxa_msg_config_list not exist");
                return 0;
            }
            Iterator<s65> it = linkedList.iterator();
            while (it.hasNext()) {
                s65 next = it.next();
                if (next == null) {
                    Log.m105928w("MicroMsg.AppBrandAuthorizeUI", "scene end, item is null");
                } else {
                    if (this.f197168d.f49757f.equals(next.f141352d)) {
                        s65 = next;
                    }
                    UpdateAppBrandNotifyMessageEvent updateAppBrandNotifyMessageEvent = new UpdateAppBrandNotifyMessageEvent();
                    UpdateAppBrandNotifyMessageEvent.C67804a aVar = updateAppBrandNotifyMessageEvent.f193976d;
                    aVar.f193977a = next.f141352d;
                    aVar.f193978b = next.f141353e == 0;
                    updateAppBrandNotifyMessageEvent.publish();
                }
            }
            if (s65 == null) {
                Log.m105921e("MicroMsg.AppBrandAuthorizeUI", "currentConfigItem not found, appId: %s", this.f197168d.f49757f);
                return 0;
            }
            AppBrandAuthorizeUI appBrandAuthorizeUI = this.f197168d;
            appBrandAuthorizeUI.f49751T = true;
            if (s65.f141353e != 0) {
                z = false;
            }
            appBrandAuthorizeUI.f49750S = z;
            AppBrandAuthorizeUI.m18561H7(appBrandAuthorizeUI, appBrandAuthorizeUI.f49755d, appBrandAuthorizeUI.f49745M, appBrandAuthorizeUI.f49756e);
        }
        return 0;
    }
}
