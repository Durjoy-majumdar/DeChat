package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.autogen.events.RtosWatchGetQuickReplyEvent;
import com.tencent.p014mm.autogen.events.RtosWatchSaveQuickReplyEvent;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.w5 */
public final class C1889w5 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 1155;
    public static final String NAME = "rtosWatchQuickReply";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/w5$a;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.w5$a */
    public static final class C1890a implements C80916r<IPCVoid, IPCString> {
        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            RtosWatchGetQuickReplyEvent rtosWatchGetQuickReplyEvent = new RtosWatchGetQuickReplyEvent();
            rtosWatchGetQuickReplyEvent.publish();
            return new IPCString(rtosWatchGetQuickReplyEvent.f78954d.f78956b);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/w5$b;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.w5$b */
    public static final class C1891b implements C80916r<IPCString, IPCString> {
        public Object invoke(Object obj) {
            IPCString iPCString = (IPCString) obj;
            RtosWatchSaveQuickReplyEvent rtosWatchSaveQuickReplyEvent = new RtosWatchSaveQuickReplyEvent();
            rtosWatchSaveQuickReplyEvent.f78957d.f78959a = iPCString != null ? iPCString.toString() : null;
            rtosWatchSaveQuickReplyEvent.publish();
            return new IPCString(rtosWatchSaveQuickReplyEvent.f78958e.f78960a);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        int i2;
        int i3;
        int i4;
        JSONObject jSONObject2 = jSONObject;
        int i5 = i;
        C82554k kVar = (C82554k) fVar;
        Log.m105918d("MicroMsg.JsApiRtosWatchQuickReply", "invoke " + jSONObject2);
        Integer valueOf = jSONObject2 != null ? Integer.valueOf(jSONObject2.optInt("action")) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            Log.m105924i("MicroMsg.JsApiRtosWatchQuickReply", "save quick reply.");
            IPCString iPCString = (IPCString) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, new IPCString(jSONObject2 != null ? jSONObject.toString() : null), C1891b.class);
            if (iPCString != null) {
                Log.m105924i("MicroMsg.JsApiRtosWatchQuickReply", "invoke save ok.");
                if (kVar != null) {
                    String iPCString2 = iPCString.toString();
                    String str = iPCString.f10315d;
                    if (iPCString2 == null) {
                        iPCString2 = str;
                    }
                    if (iPCString2 == null) {
                        iPCString2 = "";
                    }
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, iPCString2);
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("errno", 0);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                    }
                    kVar.mo109647a(i5, mo115115p(iPCString2, jSONObject3));
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.JsApiRtosWatchQuickReply", "invoke save fail.");
            if (kVar != null) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", -1, "fail");
                }
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("errno", -1);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
                kVar.mo109647a(i5, mo115115p("fail", jSONObject4));
            }
        } else if (valueOf != null && valueOf.intValue() == 2) {
            Log.m105924i("MicroMsg.JsApiRtosWatchQuickReply", "get quick reply.");
            IPCString iPCString3 = (IPCString) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, new IPCVoid(), C1890a.class);
            if (iPCString3 == null || Util.isNullOrNil(iPCString3.f10315d)) {
                Log.m105924i("MicroMsg.JsApiRtosWatchQuickReply", "invoke get replyList fail");
                if (kVar != null) {
                    JSONObject jSONObject5 = new JSONObject();
                    if (BuildInfo.DEBUG) {
                        i3 = -1;
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", -1, "fail");
                    } else {
                        i3 = -1;
                    }
                    try {
                        jSONObject5.put("errno", i3);
                    } catch (Exception e3) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
                    }
                    kVar.mo109647a(i5, mo115115p("fail", jSONObject5));
                    return;
                }
                return;
            }
            try {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("replyList", new JSONArray(iPCString3.toString()));
                Log.m105924i("MicroMsg.JsApiRtosWatchQuickReply", "invoke get replyList ok.");
                if (kVar != null) {
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                    }
                    try {
                        jSONObject6.put("errno", 0);
                    } catch (Exception e4) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e4);
                    }
                    kVar.mo109647a(i5, mo115115p("ok", jSONObject6));
                }
            } catch (Exception e5) {
                Log.printErrStackTrace("MicroMsg.JsApiRtosWatchQuickReply", e5, "invoke get replyList fail.", new Object[0]);
                if (kVar != null) {
                    JSONObject jSONObject7 = new JSONObject();
                    if (BuildInfo.DEBUG) {
                        i4 = -1;
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", -1, "fail");
                    } else {
                        i4 = -1;
                    }
                    try {
                        jSONObject7.put("errno", i4);
                    } catch (Exception e6) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e6);
                    }
                    kVar.mo109647a(i5, mo115115p("fail", jSONObject7));
                }
            }
        } else {
            Log.m105920e("MicroMsg.JsApiRtosWatchQuickReply", "unknown_action.");
            if (kVar != null) {
                if (BuildInfo.DEBUG) {
                    i2 = -1;
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", -1, "fail");
                } else {
                    i2 = -1;
                }
                JSONObject jSONObject8 = new JSONObject();
                try {
                    jSONObject8.put("errno", i2);
                } catch (Exception e7) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e7);
                }
                kVar.mo109647a(i5, mo115115p("fail", jSONObject8));
            }
        }
    }
}
