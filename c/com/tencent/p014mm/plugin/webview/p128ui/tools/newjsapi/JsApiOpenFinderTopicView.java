package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import kotlin.Metadata;
import org.json.JSONObject;
import q20.C89449a;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderTopicView */
public final class JsApiOpenFinderTopicView extends C15053a {

    /* renamed from: d */
    public static final JsApiOpenFinderTopicView f23336d = new JsApiOpenFinderTopicView();

    /* renamed from: e */
    public static final int f23337e = 392;

    /* renamed from: f */
    public static final String f23338f = "openFinderTopicView";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderTopicView$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderTopicView$OpenFinderTopicTaskData;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderTopicView$a */
    public static final class C6388a implements C80883e<OpenFinderTopicTaskData, IPCBoolean> {
        public void invoke(Object obj, C1256g gVar) {
            OpenFinderTopicTaskData openFinderTopicTaskData = (OpenFinderTopicTaskData) obj;
            Log.m105926v("MicroMsg.JsApiOpenFinderTopicView", "openFinderTopic in mm process");
            boolean z = false;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("extInfo", new JSONObject(openFinderTopicTaskData != null ? openFinderTopicTaskData.f23339d : null));
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76793OJ(context, jSONObject.toString());
                z = true;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiOpenFinderTopicView", e, "openFinderTopic exception", new Object[0]);
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
        Log.m105924i("MicroMsg.JsApiOpenFinderTopicView", "OpenFinderTopicView");
        String str = (String) h1Var.f38983a.get("extInfo");
        JsApiOpenFinderTopicView jsApiOpenFinderTopicView = f23336d;
        if (str == null) {
            str = "";
        }
        jsApiOpenFinderTopicView.getClass();
        Log.m105919d("MicroMsg.JsApiOpenFinderTopicView", "OpenFinderTopicView extInfo: %s", str);
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new OpenFinderTopicTaskData(str), C6388a.class, new C6534o1(jVar, h1Var));
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23337e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23338f;
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderTopicView$OpenFinderTopicTaskData;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderTopicView$OpenFinderTopicTaskData */
    public static final class OpenFinderTopicTaskData implements Parcelable {
        public static final C6387a CREATOR = new C6387a((C8480h) null);

        /* renamed from: d */
        public String f23339d;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderTopicView$OpenFinderTopicTaskData$a */
        public static final class C6387a implements Parcelable.Creator<OpenFinderTopicTaskData> {
            public C6387a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new OpenFinderTopicTaskData(parcel);
            }

            public Object[] newArray(int i) {
                return new OpenFinderTopicTaskData[i];
            }
        }

        public OpenFinderTopicTaskData(String str) {
            C87412m.m108594g(str, "extInfo");
            this.f23339d = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f23339d);
        }

        public OpenFinderTopicTaskData(Parcel parcel) {
            C87412m.m108594g(parcel, "src");
            String str = "";
            this.f23339d = str;
            String readString = parcel.readString();
            this.f23339d = readString != null ? readString : str;
        }
    }
}
