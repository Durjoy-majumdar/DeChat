package com.tencent.p014mm.plugin.appbrand.p025ad.jsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82510g;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;
import p005bg.C0277c;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.a */
public final class C1500a extends C82268c<C82510g> {
    public static final int CTRL_INDEX = 1171;
    public static final String NAME = "clearAdPushMsg";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ad/jsapi/a$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.a$a */
    public static final class C1501a implements C80883e<IPCString, IPCBoolean> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            C87412m.m108594g(iPCString, "data");
            String str = iPCString.f10315d;
            C87412m.m108593f(str, "data.value");
            boolean j0 = ((C0277c) C86312j.m106911c(C0277c.class)).mo557j0(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_MINI_PROGRAM, str);
            if (!j0) {
                Log.m105920e("MicroMsg.JsApiClearAdPushMsg", "db operation failed");
            }
            if (gVar != null) {
                gVar.mo894a(new IPCBoolean(j0));
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82510g gVar = (C82510g) fVar;
        String str = null;
        if (Util.isNullOrNil(jSONObject != null ? jSONObject.optString("slotid") : null) && gVar != null) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "no slotid");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            gVar.mo109647a(i, mo115115p("no slotid", jSONObject2));
        }
        String str2 = WeChatProcess.PROCESS_MAIN;
        if (jSONObject != null) {
            str = jSONObject.optString("slotid");
        }
        XIPCInvoker.m98748a(str2, new IPCString(str), C1501a.class, new C1502b(gVar, i, this));
    }
}
