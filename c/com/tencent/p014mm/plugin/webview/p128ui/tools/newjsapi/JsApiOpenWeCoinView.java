package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import m53.C10756c;
import org.json.JSONObject;
import q20.C89449a;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenWeCoinView */
public final class JsApiOpenWeCoinView extends C15053a {

    /* renamed from: d */
    public static final JsApiOpenWeCoinView f23351d = new JsApiOpenWeCoinView();

    /* renamed from: e */
    public static final int f23352e = 390;

    /* renamed from: f */
    public static final String f23353f = "openFinderWeCoinView";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeCoinView$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeCoinView$OpenWeCoinTaskData;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenWeCoinView$a */
    public static final class C6394a implements C80883e<OpenWeCoinTaskData, IPCBoolean> {
        public void invoke(Object obj, C1256g gVar) {
            OpenWeCoinTaskData openWeCoinTaskData = (OpenWeCoinTaskData) obj;
            Log.m105926v("MicroMsg.JsApiOpenWeCoinView", "OpenWeCoinTaskData in mm process");
            boolean z = false;
            try {
                new JSONObject().put("extInfo", new JSONObject(openWeCoinTaskData != null ? openWeCoinTaskData.f23354d : null));
                ((C10756c) C86709a0.m107533q(C10756c.class)).xa0(MMApplicationContext.getContext(), "");
                z = true;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiOpenWeCoinView", e, "OpenWeCoinTaskData exception", new Object[0]);
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
        Log.m105924i("MicroMsg.JsApiOpenWeCoinView", "OpenWeCoinTaskData");
        String str = (String) h1Var.f38983a.get("extInfo");
        JsApiOpenWeCoinView jsApiOpenWeCoinView = f23351d;
        if (str == null) {
            str = "";
        }
        jsApiOpenWeCoinView.getClass();
        Log.m105919d("MicroMsg.JsApiOpenWeCoinView", "OpenWeCoinView extInfo: %s", str);
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new OpenWeCoinTaskData(str), C6394a.class, new C6577w1(jVar, h1Var));
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23352e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23353f;
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeCoinView$OpenWeCoinTaskData;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenWeCoinView$OpenWeCoinTaskData */
    public static final class OpenWeCoinTaskData implements Parcelable {
        public static final C6393a CREATOR = new C6393a((C8480h) null);

        /* renamed from: d */
        public String f23354d;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenWeCoinView$OpenWeCoinTaskData$a */
        public static final class C6393a implements Parcelable.Creator<OpenWeCoinTaskData> {
            public C6393a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new OpenWeCoinTaskData(parcel);
            }

            public Object[] newArray(int i) {
                return new OpenWeCoinTaskData[i];
            }
        }

        public OpenWeCoinTaskData(String str) {
            C87412m.m108594g(str, "extInfo");
            this.f23354d = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f23354d);
        }

        public OpenWeCoinTaskData(Parcel parcel) {
            C87412m.m108594g(parcel, "src");
            String str = "";
            this.f23354d = str;
            String readString = parcel.readString();
            this.f23354d = readString != null ? readString : str;
        }
    }
}
