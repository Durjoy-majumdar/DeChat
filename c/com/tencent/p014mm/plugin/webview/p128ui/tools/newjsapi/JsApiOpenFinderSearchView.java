package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import pe3.C89349b;
import q20.C89449a;
import t83.C13851h1;
import t83.C13855j;
import te3.C48727ak1;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderSearchView */
public final class JsApiOpenFinderSearchView extends C15053a {

    /* renamed from: d */
    public static final JsApiOpenFinderSearchView f23332d = new JsApiOpenFinderSearchView();

    /* renamed from: e */
    public static final int f23333e = v2helper.EMethodSetNgStrength;

    /* renamed from: f */
    public static final String f23334f = "openFinderSearchView";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderSearchView$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderSearchView$OpenFinderSearchViewTaskData;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderSearchView$a */
    public static final class C6386a implements C80883e<OpenFinderSearchViewTaskData, IPCBoolean> {
        /* renamed from: a */
        public final List<C48727ak1> mo7401a(JSONArray jSONArray, int i) {
            ArrayList arrayList = new ArrayList();
            try {
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    C48727ak1 ak12 = new C48727ak1();
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    ak12.f130586d = jSONObject.optString("hotword_text", "");
                    ak12.f130587e = jSONObject.optInt("action_type", 0);
                    ak12.f130588f = jSONObject.optString("link", "");
                    ak12.f130589g = jSONObject.optString("appid", "");
                    ak12.f130590h = C89349b.m111674a(Base64.decode(jSONObject.optString("session_buffer", ""), 0));
                    ak12.f130591i = jSONObject.optString("reason_wording", "");
                    if (i2 == i) {
                        String str = ak12.f130586d;
                    }
                    arrayList.add(ak12);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiOpenFinderSearchView", e, "optHotWords", new Object[0]);
            }
            return arrayList;
        }

        public void invoke(Object obj, C1256g gVar) {
            OpenFinderSearchViewTaskData openFinderSearchViewTaskData = (OpenFinderSearchViewTaskData) obj;
            Class cls = C60200t1.class;
            Log.m105926v("MicroMsg.JsApiOpenFinderSearchView", "OpenFinderSearchViewTask in mm process");
            boolean z = false;
            try {
                Context qi = ((C60200t1) C86312j.m106911c(cls)).mo76869qi();
                if (qi == null) {
                    qi = MMApplicationContext.getContext();
                }
                Context context = qi;
                Log.m105924i("MicroMsg.JsApiOpenFinderSearchView", "OpenFinderSearchViewTask context:" + context);
                Object obj2 = null;
                if (!Util.isNullOrNil(openFinderSearchViewTaskData != null ? openFinderSearchViewTaskData.f23335d : null)) {
                    JSONObject jSONObject = new JSONObject(openFinderSearchViewTaskData != null ? openFinderSearchViewTaskData.f23335d : null);
                    int optInt = jSONObject.optInt("selectIndex");
                    int optInt2 = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                    String optString = jSONObject.optString("reportInfo");
                    JSONArray optJSONArray = jSONObject.optJSONArray("allSearchWord");
                    if (optJSONArray != null) {
                        List<C48727ak1> a = mo7401a(optJSONArray, optInt);
                        if (((((ArrayList) a).isEmpty() ^ true) && ((ArrayList) a).size() > optInt ? a : null) != null) {
                            obj2 = ((ArrayList) a).get(optInt);
                        }
                        C48727ak1 ak12 = (C48727ak1) obj2;
                        if (ak12 != null) {
                            C87412m.m108593f(context, "context");
                            C87412m.m108593f(optString, "reportInfo");
                            ((C60200t1) C86312j.m106911c(cls)).Ch0(context, ak12, optInt, a, optInt2, optString);
                            z = true;
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiOpenFinderSearchView", e, "OpenFinderPostViewTask exception", new Object[0]);
            }
            if (gVar != null) {
                gVar.mo894a(new IPCBoolean(z));
            }
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105924i("MicroMsg.JsApiOpenFinderSearchView", "openFinderSearchView");
        String str = (String) h1Var.f38983a.get("allSearchWord");
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = (String) h1Var.f38983a.get("selectIndex");
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = (String) h1Var.f38983a.get(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (str4 == null) {
            str4 = str2;
        }
        String str5 = (String) h1Var.f38983a.get("reportInfo");
        if (str5 != null) {
            str2 = str5;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("allSearchWord", new JSONArray(str));
            jSONObject.put("selectIndex", str3);
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str4);
            jSONObject.put("reportInfo", str2);
        } catch (Throwable unused) {
        }
        Log.m105924i("MicroMsg.JsApiOpenFinderSearchView", "openFinderPostView json: " + jSONObject);
        String str6 = WeChatProcess.PROCESS_MAIN;
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        XIPCInvoker.m98748a(str6, new OpenFinderSearchViewTaskData(jSONObject2), C6386a.class, new C6523n1(jVar, h1Var));
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23333e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23334f;
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderSearchView$OpenFinderSearchViewTaskData;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderSearchView$OpenFinderSearchViewTaskData */
    public static final class OpenFinderSearchViewTaskData implements Parcelable {
        public static final C6385a CREATOR = new C6385a((C8480h) null);

        /* renamed from: d */
        public String f23335d;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderSearchView$OpenFinderSearchViewTaskData$a */
        public static final class C6385a implements Parcelable.Creator<OpenFinderSearchViewTaskData> {
            public C6385a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new OpenFinderSearchViewTaskData(parcel);
            }

            public Object[] newArray(int i) {
                return new OpenFinderSearchViewTaskData[i];
            }
        }

        public OpenFinderSearchViewTaskData(String str) {
            C87412m.m108594g(str, "extInfo");
            this.f23335d = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f23335d);
        }

        public OpenFinderSearchViewTaskData(Parcel parcel) {
            C87412m.m108594g(parcel, "src");
            String str = "";
            this.f23335d = str;
            String readString = parcel.readString();
            this.f23335d = readString != null ? readString : str;
        }
    }
}
