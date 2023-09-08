package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;
import q20.C89449a;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiPreRenderMiniProgram */
public final class JsApiPreRenderMiniProgram extends C15053a {

    /* renamed from: d */
    public static final JsApiPreRenderMiniProgram f23357d = new JsApiPreRenderMiniProgram();

    /* renamed from: e */
    public static final int f23358e = 417;

    /* renamed from: f */
    public static final String f23359f = "prerenderMiniProgram";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiPreRenderMiniProgram$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiPreRenderMiniProgram$PreRenderMiniProgramData;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiPreRenderMiniProgram$a */
    public static final class C6397a implements C80883e<PreRenderMiniProgramData, IPCBoolean> {
        public void invoke(Object obj, C1256g gVar) {
            String str;
            PreRenderMiniProgramData preRenderMiniProgramData = (PreRenderMiniProgramData) obj;
            Log.m105926v("MicroMsg.prerenderMiniProgram", "openFinderTopic in mm process");
            boolean z = false;
            try {
                JsApiPreRenderMiniProgram jsApiPreRenderMiniProgram = JsApiPreRenderMiniProgram.f23357d;
                if (preRenderMiniProgramData == null || (str = preRenderMiniProgramData.f23360d) == null) {
                    str = "";
                }
                z = JsApiPreRenderMiniProgram.m6664e(jsApiPreRenderMiniProgram, str);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.prerenderMiniProgram", e, "openFinderTopic exception", new Object[0]);
            }
            if (gVar != null) {
                gVar.mo894a(new IPCBoolean(z));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r0.equals("trial") == false) goto L_0x0078;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m6664e(com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.JsApiPreRenderMiniProgram r5, java.lang.String r6) {
        /*
            r5.getClass()
            di0.o r5 = new di0.o
            r5.<init>()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x007b
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r6)
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r6 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer
            r6.<init>()
            r5.f250947s = r6
            java.lang.String r3 = "referrerAppId"
            java.lang.String r3 = r0.optString(r3)
            r6.f239397e = r3
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r6 = r5.f250947s
            r3 = 2
            r6.f239396d = r3
            java.lang.String r6 = "targetAppId"
            java.lang.String r6 = r0.optString(r6)
            r5.f250930b = r6
            java.lang.String r6 = "path"
            java.lang.String r6 = r0.optString(r6)
            r5.f250934f = r6
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiPreRenderMiniProgram r6 = f23357d
            java.lang.String r4 = "envVersion"
            java.lang.String r0 = r0.optString(r4)
            java.lang.String r4 = "it.optString(\"envVersion\")"
            gy3.C87412m.m108593f(r0, r4)
            r6.getClass()
            int r6 = r0.hashCode()
            r4 = 110628630(0x6980f16, float:5.719821E-35)
            if (r6 == r4) goto L_0x006f
            r3 = 1090594823(0x41012807, float:8.072272)
            if (r6 == r3) goto L_0x0069
            r3 = 1559690845(0x5cf6fe5d, float:5.56180157E17)
            if (r6 == r3) goto L_0x005e
            goto L_0x0078
        L_0x005e:
            java.lang.String r6 = "develop"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0067
            goto L_0x0078
        L_0x0067:
            r3 = 1
            goto L_0x0079
        L_0x0069:
            java.lang.String r6 = "release"
            r0.equals(r6)
            goto L_0x0078
        L_0x006f:
            java.lang.String r6 = "trial"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0079
        L_0x0078:
            r3 = 0
        L_0x0079:
            r5.f250931c = r3
        L_0x007b:
            java.lang.String r6 = r5.f250930b
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x009e
            java.lang.String r6 = r5.f250934f
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x008c
            goto L_0x009e
        L_0x008c:
            java.lang.Class<kr0.x0> r6 = kr0.C76630x0.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            kr0.x0 r6 = (kr0.C76630x0) r6
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.x1 r0 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.x1
            r0.<init>()
            r6.y20(r5, r0)
            r1 = 1
            goto L_0x00b8
        L_0x009e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[preRender] fail, stack:"
            r5.append(r6)
            com.tencent.mm.sdk.platformtools.MMStack r6 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.prerenderMiniProgram"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
        L_0x00b8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.JsApiPreRenderMiniProgram.m6664e(com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiPreRenderMiniProgram, java.lang.String):boolean");
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105924i("MicroMsg.prerenderMiniProgram", "prerenderMiniProgram");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("referrerAppId", (String) h1Var.f38983a.get("referrerAppId"));
        jSONObject.put("targetAppId", (String) h1Var.f38983a.get("targetAppId"));
        jSONObject.put("path", (String) h1Var.f38983a.get("path"));
        jSONObject.put("envVersion", (String) h1Var.f38983a.get("envVersion"));
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "extJson.toString()");
        Log.m105919d("MicroMsg.prerenderMiniProgram", "OpenWeAppSilence extInfo: %s", jSONObject2);
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new PreRenderMiniProgramData(jSONObject2), C6397a.class, new C6585y1(jVar, h1Var));
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23358e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23359f;
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiPreRenderMiniProgram$PreRenderMiniProgramData;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiPreRenderMiniProgram$PreRenderMiniProgramData */
    public static final class PreRenderMiniProgramData implements Parcelable {
        public static final C6396a CREATOR = new C6396a((C8480h) null);

        /* renamed from: d */
        public String f23360d;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiPreRenderMiniProgram$PreRenderMiniProgramData$a */
        public static final class C6396a implements Parcelable.Creator<PreRenderMiniProgramData> {
            public C6396a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new PreRenderMiniProgramData(parcel);
            }

            public Object[] newArray(int i) {
                return new PreRenderMiniProgramData[i];
            }
        }

        public PreRenderMiniProgramData(String str) {
            C87412m.m108594g(str, "extInfo");
            this.f23360d = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f23360d);
        }

        public PreRenderMiniProgramData(Parcel parcel) {
            C87412m.m108594g(parcel, "src");
            String str = "";
            this.f23360d = str;
            String readString = parcel.readString();
            this.f23360d = readString != null ? readString : str;
        }
    }
}
