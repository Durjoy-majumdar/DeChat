package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
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

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderCreateAcctView */
public final class JsApiOpenFinderCreateAcctView extends C15053a {

    /* renamed from: d */
    public static final JsApiOpenFinderCreateAcctView f23309d = new JsApiOpenFinderCreateAcctView();

    /* renamed from: e */
    public static final int f23310e = 411;

    /* renamed from: f */
    public static final String f23311f = "openFinderCreateAcctView";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderCreateAcctView$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderCreateAcctView$OpenFinderCreateAccountTaskData;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderCreateAcctView$a */
    public static final class C6375a implements C80883e<OpenFinderCreateAccountTaskData, IPCInteger> {
        public void invoke(Object obj, C1256g gVar) {
            OpenFinderCreateAccountTaskData openFinderCreateAccountTaskData = (OpenFinderCreateAccountTaskData) obj;
            Log.m105926v("MicroMsg.JsApiOpenFinderCreateAcctView", "OpenFinderCreateAcctView in mm process");
            try {
                C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                t1Var.mo76761Ha(context, (Intent) null, openFinderCreateAccountTaskData != null ? openFinderCreateAccountTaskData.f23312d : null, new C6429f1(gVar));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiOpenFinderCreateAcctView", e, "OpenFinderCreateAccountTask exception", new Object[0]);
                if (gVar != null) {
                    gVar.mo894a(new IPCInteger(0));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderCreateAcctView$b */
    public static final class C6376b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23313d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23314e;

        public C6376b(C13855j jVar, C13851h1 h1Var) {
            this.f23313d = jVar;
            this.f23314e = h1Var;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            HashMap hashMap = new HashMap();
            int i = ((IPCInteger) obj).f10313d;
            if (i == 1) {
                hashMap.put(StateEvent.Name.MESSAGE, "创建成功");
                hashMap.put("code", 100);
                hashMap.put("err_msg", "openFinderCreateAcctView:ok");
            } else if (i == 2) {
                hashMap.put(StateEvent.Name.MESSAGE, "用户取消");
                hashMap.put("code", 200);
                hashMap.put("err_msg", "openFinderCreateAcctView:cancel");
            } else if (i == 3) {
                hashMap.put(StateEvent.Name.MESSAGE, "参数为空");
                hashMap.put("code", 300);
                hashMap.put("err_msg", "openFinderCreateAcctView:fail");
            } else if (i == 4) {
                hashMap.put(StateEvent.Name.MESSAGE, "账号已存在");
                hashMap.put("code", 301);
                hashMap.put("err_msg", "openFinderCreateAcctView:fail");
            }
            C13849g gVar = this.f23313d.f39001d;
            String str = this.f23314e.f38990c;
            gVar.mo10774a(str, this.f23314e.f38996i + ":success", hashMap);
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105924i("MicroMsg.JsApiOpenFinderCreateAcctView", "OpenFinderCreateAcctView");
        try {
            JSONObject jSONObject = new JSONObject();
            Object obj = h1Var.f38983a.get(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            if (obj != null) {
                Log.m105924i("MicroMsg.JsApiOpenFinderCreateAcctView", "OpenFinderCreateAcctView scene :" + obj);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, obj);
            }
            Object obj2 = h1Var.f38983a.get("tipsWording");
            if (obj2 != null) {
                Log.m105924i("MicroMsg.JsApiOpenFinderCreateAcctView", "OpenFinderCreateAcctView tipsWording :" + obj2);
                jSONObject.put("tipsWording", obj2);
            }
            String str = WeChatProcess.PROCESS_MAIN;
            String jSONObject2 = jSONObject.toString();
            if (jSONObject2 == null) {
                jSONObject2 = "";
            }
            XIPCInvoker.m98748a(str, new OpenFinderCreateAccountTaskData(jSONObject2), C6375a.class, new C6376b(jVar, h1Var));
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.JsApiOpenFinderCreateAcctView", e, "handleMsg exception", new Object[0]);
            return true;
        }
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23310e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23311f;
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderCreateAcctView$OpenFinderCreateAccountTaskData;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderCreateAcctView$OpenFinderCreateAccountTaskData */
    public static final class OpenFinderCreateAccountTaskData implements Parcelable {
        public static final C6374a CREATOR = new C6374a((C8480h) null);

        /* renamed from: d */
        public String f23312d;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderCreateAcctView$OpenFinderCreateAccountTaskData$a */
        public static final class C6374a implements Parcelable.Creator<OpenFinderCreateAccountTaskData> {
            public C6374a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new OpenFinderCreateAccountTaskData(parcel);
            }

            public Object[] newArray(int i) {
                return new OpenFinderCreateAccountTaskData[i];
            }
        }

        public OpenFinderCreateAccountTaskData(String str) {
            C87412m.m108594g(str, "extInfo");
            this.f23312d = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f23312d);
        }

        public OpenFinderCreateAccountTaskData(Parcel parcel) {
            C87412m.m108594g(parcel, "src");
            String str = "";
            this.f23312d = str;
            String readString = parcel.readString();
            this.f23312d = readString != null ? readString : str;
        }
    }
}
