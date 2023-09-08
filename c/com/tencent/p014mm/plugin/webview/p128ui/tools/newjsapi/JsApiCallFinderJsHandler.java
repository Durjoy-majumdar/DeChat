package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import kotlin.Metadata;
import q20.C89449a;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiCallFinderJsHandler */
public final class JsApiCallFinderJsHandler extends C15053a {

    /* renamed from: d */
    public static final JsApiCallFinderJsHandler f23289d = new JsApiCallFinderJsHandler();

    /* renamed from: e */
    public static final int f23290e = 480;

    /* renamed from: f */
    public static final String f23291f = "callFinderJsHandler";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiCallFinderJsHandler$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiCallFinderJsHandler$CallFinderJsHandlerTaskData;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiCallFinderJsHandler$a */
    public static final class C6365a implements C80883e<CallFinderJsHandlerTaskData, IPCBoolean> {
        public void invoke(Object obj, C1256g gVar) {
            CallFinderJsHandlerTaskData callFinderJsHandlerTaskData = (CallFinderJsHandlerTaskData) obj;
            Class cls = C60200t1.class;
            Log.m105924i("MicroMsg.JsApiCallFinderJsHandler", "CallFinderJsHandlerTask in mm process");
            try {
                Context qi = ((C60200t1) C86312j.m106911c(cls)).mo76869qi();
                if (qi == null) {
                    qi = MMApplicationContext.getContext();
                }
                Log.m105924i("MicroMsg.JsApiCallFinderJsHandler", "CallFinderJsHandlerTask context:" + qi);
                C60200t1 t1Var = (C60200t1) C86312j.m106911c(cls);
                C87412m.m108593f(qi, "context");
                t1Var.np0(qi, String.valueOf(callFinderJsHandlerTaskData != null ? callFinderJsHandlerTaskData.f23292d : null));
                if (gVar != null) {
                    gVar.mo894a(new IPCBoolean(true));
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiCallFinderJsHandler", e, "CallFinderJsHandlerTask exception", new Object[0]);
                if (gVar != null) {
                    gVar.mo894a(new IPCBoolean(false));
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r13, t83.C13851h1 r14) {
        /*
            r12 = this;
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "MicroMsg.JsApiCallFinderJsHandler"
            java.lang.String r1 = "callFinderJsHandler"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r14.f38983a
            java.lang.String r2 = "businessType"
            java.lang.Object r1 = r1.get(r2)
            boolean r3 = r1 instanceof java.lang.String
            r4 = 0
            if (r3 == 0) goto L_0x0021
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0022
        L_0x0021:
            r1 = r4
        L_0x0022:
            java.lang.String r3 = ""
            if (r1 != 0) goto L_0x0027
            r1 = r3
        L_0x0027:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r14.f38983a
            java.lang.String r6 = "finderJumpId"
            java.lang.Object r5 = r5.get(r6)
            boolean r7 = r5 instanceof java.lang.String
            if (r7 == 0) goto L_0x0036
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0037
        L_0x0036:
            r5 = r4
        L_0x0037:
            if (r5 != 0) goto L_0x003a
            r5 = r3
        L_0x003a:
            java.util.Map<java.lang.String, java.lang.Object> r7 = r14.f38983a
            java.lang.String r8 = "commentScene"
            java.lang.Object r7 = r7.get(r8)
            boolean r9 = r7 instanceof java.lang.String
            if (r9 == 0) goto L_0x0049
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x004a
        L_0x0049:
            r7 = r4
        L_0x004a:
            if (r7 != 0) goto L_0x004d
            r7 = r3
        L_0x004d:
            java.util.Map<java.lang.String, java.lang.Object> r9 = r14.f38983a
            java.lang.String r10 = "status"
            java.lang.Object r9 = r9.get(r10)
            boolean r11 = r9 instanceof java.lang.String
            if (r11 == 0) goto L_0x005d
            r4 = r9
            java.lang.String r4 = (java.lang.String) r4
        L_0x005d:
            if (r4 != 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r3 = r4
        L_0x0061:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r4.put(r2, r1)     // Catch:{ JSONException -> 0x0072 }
            r4.put(r6, r5)     // Catch:{ JSONException -> 0x0072 }
            r4.put(r8, r7)     // Catch:{ JSONException -> 0x0072 }
            r4.put(r10, r3)     // Catch:{ JSONException -> 0x0072 }
        L_0x0072:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "callFinderJsHandler json: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiCallFinderJsHandler$CallFinderJsHandlerTaskData r1 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiCallFinderJsHandler$CallFinderJsHandlerTaskData
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "json.toString()"
            gy3.C87412m.m108593f(r2, r3)
            r1.<init>((java.lang.String) r2)
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiCallFinderJsHandler$a> r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.JsApiCallFinderJsHandler.C6365a.class
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.e r3 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.e
            r3.<init>(r13, r14)
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r0, r1, r2, r3)
            r13 = 1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.JsApiCallFinderJsHandler.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23290e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23291f;
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiCallFinderJsHandler$CallFinderJsHandlerTaskData;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiCallFinderJsHandler$CallFinderJsHandlerTaskData */
    public static final class CallFinderJsHandlerTaskData implements Parcelable {
        public static final C6364a CREATOR = new C6364a((C8480h) null);

        /* renamed from: d */
        public String f23292d;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiCallFinderJsHandler$CallFinderJsHandlerTaskData$a */
        public static final class C6364a implements Parcelable.Creator<CallFinderJsHandlerTaskData> {
            public C6364a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new CallFinderJsHandlerTaskData(parcel);
            }

            public Object[] newArray(int i) {
                return new CallFinderJsHandlerTaskData[i];
            }
        }

        public CallFinderJsHandlerTaskData(String str) {
            C87412m.m108594g(str, "extInfo");
            this.f23292d = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f23292d);
        }

        public CallFinderJsHandlerTaskData(Parcel parcel) {
            C87412m.m108594g(parcel, "src");
            String str = "";
            this.f23292d = str;
            String readString = parcel.readString();
            this.f23292d = readString != null ? readString : str;
        }
    }
}
