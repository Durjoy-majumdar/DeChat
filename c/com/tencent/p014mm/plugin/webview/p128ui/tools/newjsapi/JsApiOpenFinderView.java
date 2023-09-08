package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import e00.C45520t;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import q20.C89449a;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderView */
public final class JsApiOpenFinderView extends C15053a {

    /* renamed from: d */
    public static final JsApiOpenFinderView f23340d = new JsApiOpenFinderView();

    /* renamed from: e */
    public static final int f23341e = 369;

    /* renamed from: f */
    public static final String f23342f = "openFinderView";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderView$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderView$OpenFinderViewTaskData;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderView$a */
    public static final class C6390a implements C80883e<OpenFinderViewTaskData, IPCString> {
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7  */
        /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void invoke(java.lang.Object r11, com.tencent.p014mm.ipcinvoker.C1256g r12) {
            /*
                r10 = this;
                com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderView$OpenFinderViewTaskData r11 = (com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.JsApiOpenFinderView.OpenFinderViewTaskData) r11
                java.lang.String r0 = "MicroMsg.JsApiOpenFinderView"
                java.lang.String r1 = "alvinluo openFinderView in mm process"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r1)
                r1 = 1
                r2 = 0
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x00bb }
                if (r11 == 0) goto L_0x0012
                java.lang.String r4 = r11.f23343d     // Catch:{ Exception -> 0x00bb }
                goto L_0x0013
            L_0x0012:
                r4 = 0
            L_0x0013:
                r3.<init>(r4)     // Catch:{ Exception -> 0x00bb }
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x00bb }
                r4.<init>()     // Catch:{ Exception -> 0x00bb }
                java.lang.String r5 = "extInfo"
                r4.put(r5, r3)     // Catch:{ Exception -> 0x00bb }
                java.lang.String r5 = "webUrl"
                if (r11 == 0) goto L_0x0029
                java.lang.String r11 = r11.f23344e     // Catch:{ Exception -> 0x00bb }
                if (r11 != 0) goto L_0x002b
            L_0x0029:
                java.lang.String r11 = ""
            L_0x002b:
                r4.put(r5, r11)     // Catch:{ Exception -> 0x00bb }
                java.lang.String r11 = "action"
                java.lang.String r11 = r3.optString(r11)     // Catch:{ Exception -> 0x00bb }
                java.lang.String r5 = "openFinderFeed"
                boolean r5 = gy3.C87412m.m108589b(r11, r5)     // Catch:{ Exception -> 0x00bb }
                if (r5 == 0) goto L_0x006f
                com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderView r5 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.JsApiOpenFinderView.f23340d     // Catch:{ Exception -> 0x00bb }
                r5.getClass()     // Catch:{ Exception -> 0x00bb }
                java.lang.String r5 = "behavior"
                org.json.JSONArray r6 = r3.optJSONArray(r5)     // Catch:{ Exception -> 0x0064 }
                r3.optJSONObject(r5)     // Catch:{ Exception -> 0x0064 }
                if (r6 == 0) goto L_0x006c
                int r5 = r6.length()     // Catch:{ Exception -> 0x0064 }
                r7 = 0
            L_0x0051:
                if (r7 >= r5) goto L_0x006c
                java.lang.String r8 = r6.getString(r7)     // Catch:{ Exception -> 0x0064 }
                java.lang.String r9 = "report_feed_read"
                boolean r8 = gy3.C87412m.m108589b(r8, r9)     // Catch:{ Exception -> 0x0064 }
                if (r8 == 0) goto L_0x0061
                r5 = 1
                goto L_0x006d
            L_0x0061:
                int r7 = r7 + 1
                goto L_0x0051
            L_0x0064:
                r5 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00bb }
                java.lang.String r7 = "getReportRead exception"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r5, r7, r6)     // Catch:{ Exception -> 0x00bb }
            L_0x006c:
                r5 = 0
            L_0x006d:
                r5 = r5 ^ r1
                goto L_0x0070
            L_0x006f:
                r5 = 1
            L_0x0070:
                java.lang.String r6 = "feedFocusChangeNotify"
                boolean r3 = r3.optBoolean(r6)     // Catch:{ Exception -> 0x00b8 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b8 }
                r6.<init>()     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r7 = "action:"
                r6.append(r7)     // Catch:{ Exception -> 0x00b8 }
                r6.append(r11)     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r11 = " isCallbackDirect:"
                r6.append(r11)     // Catch:{ Exception -> 0x00b8 }
                r6.append(r5)     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r11 = " feedFocusChangeNotify "
                r6.append(r11)     // Catch:{ Exception -> 0x00b8 }
                r6.append(r3)     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r11 = r6.toString()     // Catch:{ Exception -> 0x00b8 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)     // Catch:{ Exception -> 0x00b8 }
                java.lang.Class<ht1.t1> r11 = ht1.C60200t1.class
                di3.d r11 = di3.C86312j.m106911c(r11)     // Catch:{ Exception -> 0x00b8 }
                ht1.t1 r11 = (ht1.C60200t1) r11     // Catch:{ Exception -> 0x00b8 }
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r6 = "getContext()"
                gy3.C87412m.m108593f(r3, r6)     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00b8 }
                com.tencent.mm.plugin.webview.ui.tools.newjsapi.p1 r6 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.p1     // Catch:{ Exception -> 0x00b8 }
                r6.<init>(r10, r12)     // Catch:{ Exception -> 0x00b8 }
                r11.mo76898xr(r3, r4, r6)     // Catch:{ Exception -> 0x00b8 }
                goto L_0x00c5
            L_0x00b8:
                r11 = move-exception
                r1 = r5
                goto L_0x00bc
            L_0x00bb:
                r11 = move-exception
            L_0x00bc:
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.String r4 = "alvinluo openFinderView exception"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r11, r4, r3)
                r5 = r1
                r1 = 0
            L_0x00c5:
                if (r5 == 0) goto L_0x00e3
                org.json.JSONObject r11 = new org.json.JSONObject
                r11.<init>()
                if (r1 == 0) goto L_0x00cf
                goto L_0x00d0
            L_0x00cf:
                r2 = -1
            L_0x00d0:
                java.lang.String r0 = "retCode"
                r11.put(r0, r2)
                if (r12 == 0) goto L_0x00e3
                com.tencent.mm.ipcinvoker.type.IPCString r0 = new com.tencent.mm.ipcinvoker.type.IPCString
                java.lang.String r11 = r11.toString()
                r0.<init>(r11)
                r12.mo894a(r0)
            L_0x00e3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.JsApiOpenFinderView.C6390a.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.g):void");
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        String str;
        String currentUrl;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105924i("MicroMsg.JsApiOpenFinderView", "alvinfluo openFinderView");
        String str2 = (String) h1Var.f38983a.get("extInfo");
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        boolean z = false;
        Log.m105919d("MicroMsg.JsApiOpenFinderView", "alvinluo openFinderView extInfo: %s", str2);
        C45520t c = jVar.mo13183c();
        if (c == null || (str = c.mo63683n0()) == null) {
            str = str3;
        }
        C45520t c2 = jVar.mo13183c();
        if (!(c2 == null || (currentUrl = c2.getCurrentUrl()) == null)) {
            str3 = currentUrl;
        }
        if (str3.length() == 0) {
            z = true;
        }
        if (!z) {
            str = str3;
        }
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new OpenFinderViewTaskData(str2, str), C6390a.class, new C6544q1(jVar, h1Var));
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23341e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23342f;
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderView$OpenFinderViewTaskData;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderView$OpenFinderViewTaskData */
    public static final class OpenFinderViewTaskData implements Parcelable {
        public static final C6389a CREATOR = new C6389a((C8480h) null);

        /* renamed from: d */
        public String f23343d;

        /* renamed from: e */
        public String f23344e;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderView$OpenFinderViewTaskData$a */
        public static final class C6389a implements Parcelable.Creator<OpenFinderViewTaskData> {
            public C6389a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new OpenFinderViewTaskData(parcel);
            }

            public Object[] newArray(int i) {
                return new OpenFinderViewTaskData[i];
            }
        }

        public OpenFinderViewTaskData(String str, String str2) {
            C87412m.m108594g(str, "extInfo");
            C87412m.m108594g(str2, "curUrl");
            this.f23343d = str;
            this.f23344e = str2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f23343d);
            parcel.writeString(this.f23344e);
        }

        public OpenFinderViewTaskData(Parcel parcel) {
            C87412m.m108594g(parcel, "src");
            String str = "";
            this.f23343d = str;
            this.f23344e = str;
            String readString = parcel.readString();
            this.f23343d = readString == null ? str : readString;
            String readString2 = parcel.readString();
            this.f23344e = readString2 != null ? readString2 : str;
        }
    }
}
