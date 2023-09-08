package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Arrays;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.n */
public final class C82304n extends C82296c {
    private static final int CTRL_INDEX = 1042;
    private static final String NAME = "reserveChannelsLive";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.n$a */
    public static final class C82305a<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public final /* synthetic */ C82381f f241228a;

        /* renamed from: b */
        public final /* synthetic */ int f241229b;

        /* renamed from: c */
        public final /* synthetic */ C82304n f241230c;

        public C82305a(C82381f fVar, int i, C82304n nVar) {
            this.f241228a = fVar;
            this.f241229b = i;
            this.f241230c = nVar;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            String str;
            ReserveChannelsLiveResult reserveChannelsLiveResult = (ReserveChannelsLiveResult) processResult;
            if (reserveChannelsLiveResult == null) {
                Log.m105928w("MicroMsg.AppBrand.JsApiReserveChannelsLive", "onReceiveResult#IProcessResultReceiver, result is null");
                return;
            }
            C82381f fVar = this.f241228a;
            int i = this.f241229b;
            if (reserveChannelsLiveResult.f241213d) {
                str = this.f241230c.mo115112m("ok", C90364q0.m113146e(new C13604l("state", Integer.valueOf(reserveChannelsLiveResult.f241214e))));
            } else {
                C82304n nVar = this.f241230c;
                String format = String.format("fail:pre check fail, errCode=%d", Arrays.copyOf(new Object[]{Integer.valueOf(reserveChannelsLiveResult.f241214e)}, 1));
                C87412m.m108593f(format, "format(this, *args)");
                str = nVar.mo115112m(format, C90364q0.m113146e(new C13604l("state", 0)));
            }
            fVar.mo109647a(i, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r4 == null) goto L_0x002f;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo114706w(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r8, org.json.JSONObject r9, org.json.JSONObject r10, int r11) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Context r0 = r8.getContext()
            java.lang.String r1 = "MicroMsg.AppBrand.JsApiReserveChannelsLive"
            if (r0 != 0) goto L_0x001a
            java.lang.String r9 = "invoke, context is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r9)
            java.lang.String r9 = "fail:internal error invalid android context"
            java.lang.String r9 = r7.mo115109j(r9)
            r8.mo109647a(r11, r9)
            return
        L_0x001a:
            if (r9 != 0) goto L_0x0021
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
        L_0x0021:
            java.lang.String r2 = r8.getAppId()     // Catch:{ Exception -> 0x0057 }
            java.lang.String r3 = "appId"
            if (r10 == 0) goto L_0x002f
            java.lang.String r4 = r10.optString(r3, r2)     // Catch:{ Exception -> 0x0057 }
            if (r4 != 0) goto L_0x0030
        L_0x002f:
            r4 = r2
        L_0x0030:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0057 }
            r5.<init>()     // Catch:{ Exception -> 0x0057 }
            java.lang.String r6 = "invoke, privateData: "
            r5.append(r6)     // Catch:{ Exception -> 0x0057 }
            r5.append(r10)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r10 = ", envAppId: "
            r5.append(r10)     // Catch:{ Exception -> 0x0057 }
            r5.append(r2)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r10 = ", appId: "
            r5.append(r10)     // Catch:{ Exception -> 0x0057 }
            r5.append(r4)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r10 = r5.toString()     // Catch:{ Exception -> 0x0057 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)     // Catch:{ Exception -> 0x0057 }
            r9.put(r3, r4)     // Catch:{ Exception -> 0x0057 }
        L_0x0057:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "invoke, paramsJsonObj: "
            r10.append(r2)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)
            com.tencent.mm.plugin.appbrand.jsapi.channels.ReserveChannelsLiveRequest r10 = new com.tencent.mm.plugin.appbrand.jsapi.channels.ReserveChannelsLiveRequest
            java.lang.String r9 = r9.toString()
            java.lang.String r1 = "paramsJsonObj.toString()"
            gy3.C87412m.m108593f(r9, r1)
            r10.<init>((java.lang.String) r9)
            com.tencent.mm.plugin.appbrand.jsapi.channels.n$a r9 = new com.tencent.mm.plugin.appbrand.jsapi.channels.n$a
            r9.<init>(r8, r11, r7)
            r8 = 0
            com.tencent.p014mm.plugin.appbrand.ipc.C81956c.m100675c(r0, r10, r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.channels.C82304n.mo114706w(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, org.json.JSONObject, int):void");
    }
}
