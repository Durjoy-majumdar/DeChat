package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import org.json.JSONObject;
import p284zb.C91635f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.v5 */
public final class C83049v5 extends C82268c<C91635f> {
    public static final int CTRL_INDEX = 755;
    public static final String NAME = "returnCopyUrl";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C91635f fVar2 = (C91635f) fVar;
        if (fVar2 != null) {
            String optString = jSONObject != null ? jSONObject.optString("url") : null;
            if (optString == null) {
                optString = "";
            }
            boolean z = true;
            if (jSONObject != null && jSONObject.optBoolean("shortLinkEnable", false)) {
                C82372d7.f241423a.mo114776a(C82367d0.MP_SHORT_LINK, optString);
            } else {
                C82372d7.f241423a.mo114776a(C82367d0.PAGE_PATH, optString);
            }
            ClipboardHelper.setText(MMApplicationContext.getContext(), (CharSequence) null, optString);
            if (optString.length() != 0) {
                z = false;
            }
            fVar2.mo109647a(i, mo115109j(z ? "fail:empty url" : "ok"));
        }
    }
}
