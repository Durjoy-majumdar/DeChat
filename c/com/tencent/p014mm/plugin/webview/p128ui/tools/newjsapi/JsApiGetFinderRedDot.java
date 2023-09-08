package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.HashMap;
import kotlin.Metadata;
import org.json.JSONObject;
import q20.C89449a;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiGetFinderRedDot */
public final class JsApiGetFinderRedDot extends C15053a {

    /* renamed from: d */
    public static final JsApiGetFinderRedDot f23299d = new JsApiGetFinderRedDot();

    /* renamed from: e */
    public static final int f23300e = v2helper.EMethodSetPlayerPreCorrectCofOn;

    /* renamed from: f */
    public static final String f23301f = "getFinderRedDot";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiGetFinderRedDot$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiGetFinderRedDot$GetFinderRedDotData;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiGetFinderRedDot$a */
    public static final class C6370a implements C80883e<GetFinderRedDotData, IPCString> {
        public void invoke(Object obj, C1256g gVar) {
            GetFinderRedDotData getFinderRedDotData = (GetFinderRedDotData) obj;
            Log.m105926v("MicroMsg.JsApiGetFinderRedDot", "JsApiGetFinderRedDot in mm process");
            try {
                ((C60200t1) C86312j.m106911c(C60200t1.class)).Mr0(getFinderRedDotData != null ? getFinderRedDotData.f23302d : null, new C6572v(gVar));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiGetFinderRedDot", e, "JsApiGetFinderRedDot exception", new Object[0]);
                if (gVar != null) {
                    gVar.mo894a(new IPCString(""));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiGetFinderRedDot$b */
    public static final class C6371b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23303d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23304e;

        public C6371b(C13855j jVar, C13851h1 h1Var) {
            this.f23303d = jVar;
            this.f23304e = h1Var;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            HashMap hashMap = new HashMap();
            String str = ((IPCString) obj).f10315d;
            if (str == null) {
                str = "";
            }
            hashMap.put("redDotInfo", new JSONObject(str));
            C13849g gVar = this.f23303d.f39001d;
            String str2 = this.f23304e.f38990c;
            gVar.mo10774a(str2, this.f23304e.f38996i + ":success", hashMap);
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105924i("MicroMsg.JsApiGetFinderRedDot", "JsApiGetFinderRedDot");
        try {
            JSONObject jSONObject = new JSONObject();
            Object obj = h1Var.f38983a.get("businessType");
            if (obj != null) {
                Log.m105924i("MicroMsg.JsApiGetFinderRedDot", "businessType :" + obj);
                jSONObject.put("businessType", obj);
            }
            Object obj2 = h1Var.f38983a.get("redDotPath");
            if (obj2 != null) {
                Log.m105924i("MicroMsg.JsApiGetFinderRedDot", "redDotPath :" + obj2);
                jSONObject.put("redDotPath", obj2);
            }
            String str = WeChatProcess.PROCESS_MAIN;
            String jSONObject2 = jSONObject.toString();
            if (jSONObject2 == null) {
                jSONObject2 = "";
            }
            XIPCInvoker.m98748a(str, new GetFinderRedDotData(jSONObject2), C6370a.class, new C6371b(jVar, h1Var));
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.JsApiGetFinderRedDot", e, "handleMsg exception", new Object[0]);
            return true;
        }
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23300e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23301f;
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiGetFinderRedDot$GetFinderRedDotData;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiGetFinderRedDot$GetFinderRedDotData */
    public static final class GetFinderRedDotData implements Parcelable {
        public static final C6369a CREATOR = new C6369a((C8480h) null);

        /* renamed from: d */
        public String f23302d;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiGetFinderRedDot$GetFinderRedDotData$a */
        public static final class C6369a implements Parcelable.Creator<GetFinderRedDotData> {
            public C6369a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new GetFinderRedDotData(parcel);
            }

            public Object[] newArray(int i) {
                return new GetFinderRedDotData[i];
            }
        }

        public GetFinderRedDotData(String str) {
            C87412m.m108594g(str, "extInfo");
            this.f23302d = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f23302d);
        }

        public GetFinderRedDotData(Parcel parcel) {
            C87412m.m108594g(parcel, "src");
            String str = "";
            this.f23302d = str;
            String readString = parcel.readString();
            this.f23302d = readString != null ? readString : str;
        }
    }
}
