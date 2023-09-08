package com.tencent.p014mm.plugin.appbrand.jsapi.backgroundfetch;

import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenParcel;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.C29445x;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import java.util.HashMap;
import org.json.JSONObject;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.a */
public class C1633a extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 654;
    public static final String NAME = "getBackgroundFetchToken";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.a$a */
    public class C1634a implements C1256g<IPCString> {

        /* renamed from: d */
        public final /* synthetic */ C82381f f11252d;

        /* renamed from: e */
        public final /* synthetic */ int f11253e;

        public C1634a(C82381f fVar, int i) {
            this.f11252d = fVar;
            this.f11253e = i;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCString iPCString = (IPCString) obj;
            if (iPCString == null || Util.isNullOrNil(iPCString.f10315d)) {
                Log.m105924i("MicroMsg.AppBrand.JsApiGetBackgroundFetchToken", "getBackgroundFetchToken fail");
                this.f11252d.mo109647a(this.f11253e, C1633a.this.mo115109j("fail"));
                return;
            }
            Log.m105924i("MicroMsg.AppBrand.JsApiGetBackgroundFetchToken", "getBackgroundFetchToken success");
            String str = iPCString.f10315d;
            HashMap hashMap = new HashMap();
            hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str);
            Log.m105925i("MicroMsg.AppBrand.JsApiGetBackgroundFetchToken", "getBackgroundFetchToken, token:%s", str);
            this.f11252d.mo109647a(this.f11253e, C1633a.this.mo115112m("ok", hashMap));
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.a$b */
    public static class C1635b implements C1255d<IPCString, IPCString> {
        private C1635b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            AppBrandBackgroundFetchDataTokenParcel appBrandBackgroundFetchDataTokenParcel;
            IPCString iPCString = (IPCString) obj;
            Class cls = C29445x.class;
            if (iPCString != null && !Util.isNullOrNil(iPCString.f10315d)) {
                String f = C81661j.m100181f(iPCString.f10315d);
                if (!Util.isNullOrNil(f) && C86312j.m106911c(cls) != null && (appBrandBackgroundFetchDataTokenParcel = ((C29445x) C86312j.m106911c(cls)).get(f)) != null && !Util.isNullOrNil(appBrandBackgroundFetchDataTokenParcel.f80235e)) {
                    gVar.mo894a(new IPCString(appBrandBackgroundFetchDataTokenParcel.f80235e));
                    return;
                }
            }
            gVar.mo894a(new IPCString());
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCString(fVar.getAppId()), C1635b.class, new C1634a(fVar, i));
    }
}
