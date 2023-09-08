package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import jc2.C117343c;
import kotlin.Metadata;
import org.json.JSONObject;
import p626nv.C109759g;
import p626nv.C47299e;
import q20.C89449a;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.m2 */
public final class C1728m2 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 1160;
    public static final String NAME = "deleteWeAppNewTipsInfo";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/m2$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.m2$a */
    public static final class C1729a implements C80883e<IPCString, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            C47299e V40 = ((C109759g) C86312j.m106911c(C109759g.class)).V40();
            String str = iPCString != null ? iPCString.f10315d : null;
            C115627l lVar = (C115627l) V40;
            lVar.getClass();
            lVar.mo175763b(new C117343c(str));
            if (gVar != null) {
                gVar.mo894a(IPCVoid.f10316d);
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        if (i2Var != null && i2Var.getContext() != null && jSONObject != null) {
            String optString = jSONObject.optString("pathKey");
            if (optString == null) {
                optString = "";
            }
            if (!C112551y.m153819s(optString, "weapp_internal_", false)) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 101);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                i2Var.mo109647a(i, mo115115p("fail:jsapi invalid request data", jSONObject2));
                return;
            }
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(optString), C1729a.class, (C1256g) null);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("errno", 0);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            i2Var.mo109647a(i, mo115115p("ok", jSONObject3));
        }
    }
}
