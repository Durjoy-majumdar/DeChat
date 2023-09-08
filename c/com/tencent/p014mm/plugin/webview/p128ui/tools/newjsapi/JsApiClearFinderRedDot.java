package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
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
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiClearFinderRedDot */
public final class JsApiClearFinderRedDot extends C15053a {

    /* renamed from: d */
    public static final JsApiClearFinderRedDot f23293d = new JsApiClearFinderRedDot();

    /* renamed from: e */
    public static final int f23294e = v2helper.EMethodSetPlayerPreCorrectCofOff;

    /* renamed from: f */
    public static final String f23295f = "cleanFinderRedDot";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiClearFinderRedDot$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiClearFinderRedDot$ClearFinderRedDotData;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiClearFinderRedDot$a */
    public static final class C6367a implements C80883e<ClearFinderRedDotData, IPCInteger> {
        public void invoke(Object obj, C1256g gVar) {
            ClearFinderRedDotData clearFinderRedDotData = (ClearFinderRedDotData) obj;
            Log.m105926v("MicroMsg.JsApiClearFinderRedDot", "ClearFinderRedDotTask in mm process");
            try {
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76746E6(clearFinderRedDotData != null ? clearFinderRedDotData.f23296d : null, new C6436g(gVar));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiClearFinderRedDot", e, "ClearFinderRedDotTask exception", new Object[0]);
                if (gVar != null) {
                    gVar.mo894a(new IPCInteger(0));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiClearFinderRedDot$b */
    public static final class C6368b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23297d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23298e;

        public C6368b(C13855j jVar, C13851h1 h1Var) {
            this.f23297d = jVar;
            this.f23298e = h1Var;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            HashMap hashMap = new HashMap();
            hashMap.put("cleanRet", Integer.valueOf(((IPCInteger) obj).f10313d));
            C13849g gVar = this.f23297d.f39001d;
            String str = this.f23298e.f38990c;
            gVar.mo10774a(str, this.f23298e.f38996i + ":success", hashMap);
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105924i("MicroMsg.JsApiClearFinderRedDot", "cleanFinderRedDot");
        try {
            JSONObject jSONObject = new JSONObject();
            Object obj = h1Var.f38983a.get("businessType");
            if (obj != null) {
                Log.m105924i("MicroMsg.JsApiClearFinderRedDot", "businessType :" + obj);
                jSONObject.put("businessType", obj);
            }
            Object obj2 = h1Var.f38983a.get("redDotPath");
            if (obj2 != null) {
                Log.m105924i("MicroMsg.JsApiClearFinderRedDot", "redDotPath :" + obj2);
                jSONObject.put("redDotPath", obj2);
            }
            String str = WeChatProcess.PROCESS_MAIN;
            String jSONObject2 = jSONObject.toString();
            if (jSONObject2 == null) {
                jSONObject2 = "";
            }
            XIPCInvoker.m98748a(str, new ClearFinderRedDotData(jSONObject2), C6367a.class, new C6368b(jVar, h1Var));
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.JsApiClearFinderRedDot", e, "handleMsg exception", new Object[0]);
            return true;
        }
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23294e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23295f;
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiClearFinderRedDot$ClearFinderRedDotData;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiClearFinderRedDot$ClearFinderRedDotData */
    public static final class ClearFinderRedDotData implements Parcelable {
        public static final C6366a CREATOR = new C6366a((C8480h) null);

        /* renamed from: d */
        public String f23296d;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiClearFinderRedDot$ClearFinderRedDotData$a */
        public static final class C6366a implements Parcelable.Creator<ClearFinderRedDotData> {
            public C6366a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new ClearFinderRedDotData(parcel);
            }

            public Object[] newArray(int i) {
                return new ClearFinderRedDotData[i];
            }
        }

        public ClearFinderRedDotData(String str) {
            C87412m.m108594g(str, "extInfo");
            this.f23296d = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f23296d);
        }

        public ClearFinderRedDotData(Parcel parcel) {
            C87412m.m108594g(parcel, "src");
            String str = "";
            this.f23296d = str;
            String readString = parcel.readString();
            this.f23296d = readString != null ? readString : str;
        }
    }
}
