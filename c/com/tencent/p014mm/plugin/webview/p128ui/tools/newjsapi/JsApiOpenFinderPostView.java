package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import kotlin.Metadata;
import q20.C89449a;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderPostView */
public final class JsApiOpenFinderPostView extends C15053a {

    /* renamed from: d */
    public static final JsApiOpenFinderPostView f23328d = new JsApiOpenFinderPostView();

    /* renamed from: e */
    public static final int f23329e = v2helper.EMethodEhanceHeadsetEC;

    /* renamed from: f */
    public static final String f23330f = "openFinderPostView";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderPostView$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderPostView$OpenFinderViewTaskData;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderPostView$a */
    public static final class C6384a implements C80883e<OpenFinderViewTaskData, IPCBoolean> {
        public void invoke(Object obj, C1256g gVar) {
            OpenFinderViewTaskData openFinderViewTaskData = (OpenFinderViewTaskData) obj;
            Class cls = C60200t1.class;
            Log.m105926v("MicroMsg.JsApiOpenFinderPostView", "OpenFinderPostViewTask in mm process");
            try {
                Context qi = ((C60200t1) C86312j.m106911c(cls)).mo76869qi();
                if (qi == null) {
                    qi = MMApplicationContext.getContext();
                }
                Log.m105924i("MicroMsg.JsApiOpenFinderPostView", "OpenFinderPostViewTask context:" + qi);
                C60200t1 t1Var = (C60200t1) C86312j.m106911c(cls);
                C87412m.m108593f(qi, "context");
                t1Var.mo76834ai(qi, String.valueOf(openFinderViewTaskData != null ? openFinderViewTaskData.f23331d : null), 1, new C6509l1(gVar));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiOpenFinderPostView", e, "OpenFinderPostViewTask exception", new Object[0]);
                if (gVar != null) {
                    gVar.mo894a(new IPCBoolean(false));
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(1:2)|3|(1:5)|6|(1:8)|9|(1:11)|12|13|14|15|16|17|18|(2:19|20)|21|23) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0055 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0060 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r12, t83.C13851h1 r13) {
        /*
            r11 = this;
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "MicroMsg.JsApiOpenFinderPostView"
            java.lang.String r1 = "openFinderPostView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r13.f38983a
            java.lang.String r2 = "jumpInfo"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = ""
            if (r1 != 0) goto L_0x0020
            r1 = r3
        L_0x0020:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r13.f38983a
            java.lang.String r5 = "postInfo"
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x002d
            r4 = r3
        L_0x002d:
            java.util.Map<java.lang.String, java.lang.Object> r6 = r13.f38983a
            java.lang.String r7 = "callBackKey"
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x003a
            r6 = r3
        L_0x003a:
            java.util.Map<java.lang.String, java.lang.Object> r8 = r13.f38983a
            java.lang.String r9 = "optionalInfo"
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r3 = r8
        L_0x0048:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ all -> 0x0055 }
            r10.<init>(r1)     // Catch:{ all -> 0x0055 }
            r8.put(r2, r10)     // Catch:{ all -> 0x0055 }
        L_0x0055:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x005d }
            r1.<init>(r4)     // Catch:{ all -> 0x005d }
            r8.put(r5, r1)     // Catch:{ all -> 0x005d }
        L_0x005d:
            r8.put(r7, r6)     // Catch:{ all -> 0x0060 }
        L_0x0060:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0068 }
            r1.<init>(r3)     // Catch:{ all -> 0x0068 }
            r8.put(r9, r1)     // Catch:{ all -> 0x0068 }
        L_0x0068:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "openFinderPostView jumpInfo: "
            r1.append(r3)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r13.f38983a
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r2 = ", postInfo: "
            r1.append(r2)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r13.f38983a
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "openFinderPostView json: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderPostView$OpenFinderViewTaskData r1 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderPostView$OpenFinderViewTaskData
            java.lang.String r2 = r8.toString()
            java.lang.String r3 = "json.toString()"
            gy3.C87412m.m108593f(r2, r3)
            r1.<init>((java.lang.String) r2)
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderPostView$a> r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.JsApiOpenFinderPostView.C6384a.class
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.m1 r3 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.m1
            r3.<init>(r12, r13)
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r0, r1, r2, r3)
            r12 = 1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.JsApiOpenFinderPostView.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23329e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23330f;
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderPostView$OpenFinderViewTaskData;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderPostView$OpenFinderViewTaskData */
    public static final class OpenFinderViewTaskData implements Parcelable {
        public static final C6383a CREATOR = new C6383a((C8480h) null);

        /* renamed from: d */
        public String f23331d;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderPostView$OpenFinderViewTaskData$a */
        public static final class C6383a implements Parcelable.Creator<OpenFinderViewTaskData> {
            public C6383a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new OpenFinderViewTaskData(parcel);
            }

            public Object[] newArray(int i) {
                return new OpenFinderViewTaskData[i];
            }
        }

        public OpenFinderViewTaskData(String str) {
            C87412m.m108594g(str, "extInfo");
            this.f23331d = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f23331d);
        }

        public OpenFinderViewTaskData(Parcel parcel) {
            C87412m.m108594g(parcel, "src");
            String str = "";
            this.f23331d = str;
            String readString = parcel.readString();
            this.f23331d = readString != null ? readString : str;
        }
    }
}
