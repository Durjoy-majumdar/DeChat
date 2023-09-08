package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C1895m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import kotlin.Metadata;
import m53.C10756c;
import q20.C89449a;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiGetWCCoinBalance */
public final class JsApiGetWCCoinBalance extends C15053a {

    /* renamed from: d */
    public static final JsApiGetWCCoinBalance f23305d = new JsApiGetWCCoinBalance();

    /* renamed from: e */
    public static final int f23306e = 407;

    /* renamed from: f */
    public static final String f23307f = C1895m.NAME;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiGetWCCoinBalance$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiGetWCCoinBalance$GetWeCoinTaskData;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiGetWCCoinBalance$a */
    public static final class C6373a implements C80883e<GetWeCoinTaskData, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            GetWeCoinTaskData getWeCoinTaskData = (GetWeCoinTaskData) obj;
            try {
                ((C10756c) C86709a0.m107533q(C10756c.class)).mo11000qy(new C6586z(gVar));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiGetWCCoinBalance", e, "GetWeCoinBalanceTask exception", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String str = (String) h1Var.f38983a.get("extInfo");
        if (str == null) {
            str = "";
        }
        Log.m105925i("MicroMsg.JsApiGetWCCoinBalance", "getWCCoinBalance extInfo: %s", str);
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GetWeCoinTaskData(str), C6373a.class, new C6401a0(new HashMap(), "balance", "newUserDiscount", jVar, h1Var));
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23306e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23307f;
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiGetWCCoinBalance$GetWeCoinTaskData;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiGetWCCoinBalance$GetWeCoinTaskData */
    public static final class GetWeCoinTaskData implements Parcelable {
        public static final C6372a CREATOR = new C6372a((C8480h) null);

        /* renamed from: d */
        public String f23308d;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiGetWCCoinBalance$GetWeCoinTaskData$a */
        public static final class C6372a implements Parcelable.Creator<GetWeCoinTaskData> {
            public C6372a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new GetWeCoinTaskData(parcel);
            }

            public Object[] newArray(int i) {
                return new GetWeCoinTaskData[i];
            }
        }

        public GetWeCoinTaskData(String str) {
            C87412m.m108594g(str, "extInfo");
            this.f23308d = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f23308d);
        }

        public GetWeCoinTaskData(Parcel parcel) {
            C87412m.m108594g(parcel, "src");
            String str = "";
            this.f23308d = str;
            String readString = parcel.readString();
            this.f23308d = readString != null ? readString : str;
        }
    }
}
