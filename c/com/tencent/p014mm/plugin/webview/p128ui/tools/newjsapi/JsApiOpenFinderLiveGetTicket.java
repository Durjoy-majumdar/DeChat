package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;
import p565ir.C60606n;
import q20.C89449a;
import rx3.C13604l;
import sx3.C90363p0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderLiveGetTicket */
public final class JsApiOpenFinderLiveGetTicket extends C15053a {

    /* renamed from: d */
    public static final JsApiOpenFinderLiveGetTicket f23315d = new JsApiOpenFinderLiveGetTicket();

    /* renamed from: e */
    public static Context f23316e;

    /* renamed from: f */
    public static final int f23317f = 453;

    /* renamed from: g */
    public static final String f23318g = "reserveChannelsLive";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderLiveGetTicket$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderLiveGetTicket$OpenFinderLiveGetTicketTaskData;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderLiveGetTicket$a */
    public static final class C6378a implements C80883e<OpenFinderLiveGetTicketTaskData, IPCInteger> {
        public void invoke(Object obj, C1256g gVar) {
            String str;
            OpenFinderLiveGetTicketTaskData openFinderLiveGetTicketTaskData = (OpenFinderLiveGetTicketTaskData) obj;
            Log.m105926v("MicroMsg.JsApiOpenFinderLiveGetTicket", "karlfeng openFinderLiveGetTicket in mm process");
            if (openFinderLiveGetTicketTaskData != null) {
                try {
                    str = openFinderLiveGetTicketTaskData.f23319d;
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.JsApiOpenFinderLiveGetTicket", e, "alvinluo openFinderLiveGetTicket exception", new Object[0]);
                    if (gVar != null) {
                        gVar.mo894a(new IPCInteger(-1000));
                        return;
                    }
                    return;
                }
            } else {
                str = null;
            }
            String str2 = str;
            if (str2 != null) {
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                ((C60606n) C86312j.m106911c(C60606n.class)).Ja0(context, str2, new C6438g1(gVar), new C6488h1(gVar), false);
            }
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105924i("MicroMsg.JsApiOpenFinderLiveGetTicket", "karlfeng openFinderLiveGetTicket");
        JSONObject jSONObject = new JSONObject();
        Object obj = h1Var.f38983a.get("noticeId");
        if (obj != null) {
            Log.m105924i("MicroMsg.JsApiOpenFinderLiveGetTicket", "noticeId: " + obj);
            jSONObject.put("noticeId", obj);
        }
        Object obj2 = h1Var.f38983a.get("appId");
        if (obj2 != null) {
            Log.m105924i("MicroMsg.JsApiOpenFinderLiveGetTicket", "appId: " + obj2);
            jSONObject.put("appId", obj2);
        }
        Object obj3 = h1Var.f38983a.get("wxData");
        if (obj3 != null) {
            Log.m105924i("MicroMsg.JsApiOpenFinderLiveGetTicket", "wxData: " + obj3);
            jSONObject.put("wxData", obj3);
        }
        Object obj4 = h1Var.f38983a.get("preferEnterLive");
        if (obj4 != null) {
            Log.m105924i("MicroMsg.JsApiOpenFinderLiveGetTicket", "preferEnterLive: " + obj4);
            jSONObject.put("preferEnterLive", obj4);
        }
        String optString = jSONObject.optString("noticeId");
        if (optString == null || optString.length() == 0) {
            C13849g gVar = jVar.f39001d;
            String str = h1Var.f38990c;
            gVar.mo10774a(str, h1Var.f38996i + ":noticeId is empty", C90363p0.m113143b(new C13604l("err_msg", "noticeId is empty")));
        }
        Log.m105918d("MicroMsg.JsApiOpenFinderLiveGetTicket", "karlfeng openFinderLiveGetTicket");
        f23316e = jVar.f38998a;
        String str2 = WeChatProcess.PROCESS_MAIN;
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "extInfo.toString()");
        XIPCInvoker.m98748a(str2, new OpenFinderLiveGetTicketTaskData(jSONObject2), C6378a.class, new C6494i1(jVar, h1Var));
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23317f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23318g;
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderLiveGetTicket$OpenFinderLiveGetTicketTaskData;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderLiveGetTicket$OpenFinderLiveGetTicketTaskData */
    public static final class OpenFinderLiveGetTicketTaskData implements Parcelable {
        public static final C6377a CREATOR = new C6377a((C8480h) null);

        /* renamed from: d */
        public String f23319d;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderLiveGetTicket$OpenFinderLiveGetTicketTaskData$a */
        public static final class C6377a implements Parcelable.Creator<OpenFinderLiveGetTicketTaskData> {
            public C6377a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new OpenFinderLiveGetTicketTaskData(parcel);
            }

            public Object[] newArray(int i) {
                return new OpenFinderLiveGetTicketTaskData[i];
            }
        }

        public OpenFinderLiveGetTicketTaskData(String str) {
            C87412m.m108594g(str, "extInfo");
            this.f23319d = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f23319d);
        }

        public OpenFinderLiveGetTicketTaskData(Parcel parcel) {
            C87412m.m108594g(parcel, "src");
            String str = "";
            this.f23319d = str;
            String readString = parcel.readString();
            this.f23319d = readString != null ? readString : str;
        }
    }
}
