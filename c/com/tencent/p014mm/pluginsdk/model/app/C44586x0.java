package com.tencent.p014mm.pluginsdk.model.app;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80906n;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import p763ym.C79138l;

/* renamed from: com.tencent.mm.pluginsdk.model.app.x0 */
public class C44586x0 implements C80883e<Bundle, IPCBoolean> {
    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        Class cls = C79138l.class;
        if (bundle != null && WeChatProcess.PROCESS_MAIN.equals(C80906n.m98775b())) {
            String string = bundle.getString("appId");
            String string2 = bundle.getString("extInfo");
            C44561j TT = ((C79138l) C86312j.m106911c(cls)).mo74001TT(string, true);
            if (TT != null) {
                WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
                wXAppExtendObject.extInfo = string2;
                WXMediaMessage wXMediaMessage = new WXMediaMessage(wXAppExtendObject);
                wXMediaMessage.sdkVer = Build.SDK_INT;
                wXMediaMessage.messageExt = string2;
                boolean gu = ((C79138l) C86312j.m106911c(cls)).mo74010gu(MMApplicationContext.getContext(), TT.field_appId, wXMediaMessage, 2, (C44580q1) null, (Bundle) null);
                if (gVar != null) {
                    gVar.mo894a(new IPCBoolean(gu));
                }
            }
        }
    }
}
