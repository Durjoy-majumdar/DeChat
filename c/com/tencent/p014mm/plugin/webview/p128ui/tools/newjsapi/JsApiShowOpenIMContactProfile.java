package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import e00.C45520t;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import kotlin.Metadata;
import o40.C61926c;
import q20.C89449a;
import rm0.C90026e;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiShowOpenIMContactProfile */
public final class JsApiShowOpenIMContactProfile extends C15053a {

    /* renamed from: d */
    public static final JsApiShowOpenIMContactProfile f23361d = new JsApiShowOpenIMContactProfile();

    /* renamed from: e */
    public static final int f23362e = C90026e.CTRL_INDEX;

    /* renamed from: f */
    public static final String f23363f = "showOpenIMContactProfile";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiShowOpenIMContactProfile$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiShowOpenIMContactProfile$JumpProfileData;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiShowOpenIMContactProfile$a */
    public static final class C6399a implements C80883e<JumpProfileData, Bundle> {
        /* renamed from: a */
        public final Bundle mo7428a(String str, String str2) {
            C87412m.m108594g(str, "backInfo");
            Bundle bundle = new Bundle();
            bundle.putString("KEY_BACK_INFO", str);
            if (!(str2 == null || C112551y.m153811k(str2))) {
                bundle.putString("KEY_ERR_TIPS", str2);
            }
            return bundle;
        }

        public void invoke(Object obj, C1256g gVar) {
            C61926c.m72668M(new C6442g3(this, (JumpProfileData) obj, gVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiShowOpenIMContactProfile$b */
    public static final class C6400b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23367d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23368e;

        /* renamed from: f */
        public final /* synthetic */ boolean f23369f;

        public C6400b(C13855j jVar, C13851h1 h1Var, boolean z) {
            this.f23367d = jVar;
            this.f23368e = h1Var;
            this.f23369f = z;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            String string = bundle.getString("KEY_BACK_INFO");
            if (string == null) {
                string = "";
            }
            String str = string;
            String string2 = bundle.getString("KEY_ERR_TIPS");
            boolean z = false;
            if (!(C112551y.m153819s(str, "fail", false)) || C87412m.m108589b(str, "fail_cancel")) {
                JsApiShowOpenIMContactProfile.f23361d.mo7423e(this.f23367d, this.f23368e, str, this.f23369f);
                return;
            }
            if (string2 == null || C112551y.m153811k(string2)) {
                z = true;
            }
            if (z) {
                string2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.mup);
            }
            String str2 = string2;
            C87412m.m108593f(str2, "if(errTips.isNullOrBlank…errTips\n                }");
            C61926c.m72668M(new C6506k3(this.f23367d, str2, this.f23368e, str, this.f23369f));
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Object obj = h1Var.f38983a.get("dataUrl");
        byte[] bArr = null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = h1Var.f38983a.get("dismissSelf");
        boolean parseBoolean = Boolean.parseBoolean(obj2 instanceof String ? (String) obj2 : null);
        C45520t c = jVar.mo13183c();
        BaseWebViewController baseWebViewController = c instanceof BaseWebViewController ? (BaseWebViewController) c : null;
        if (baseWebViewController != null) {
            bArr = baseWebViewController.mo67710c0();
        }
        Log.m105918d("MicroMsg.JsApiShowOpenIMContactProfile", "handleMsg() called with: msg.params = " + h1Var.f38983a);
        if (str == null || C112551y.m153811k(str)) {
            mo7423e(jVar, h1Var, ":fail_invalid_arguments", parseBoolean);
            return true;
        }
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new JumpProfileData(str, bArr), C6399a.class, new C6400b(jVar, h1Var, parseBoolean));
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23362e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23363f;
    }

    /* renamed from: e */
    public final void mo7423e(C13855j jVar, C13851h1 h1Var, String str, boolean z) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        C87412m.m108594g(str, "errMsg");
        C13849g gVar = jVar.f39001d;
        String str2 = h1Var.f38990c;
        gVar.mo10774a(str2, h1Var.f38996i + str, (Map<String, Object>) null);
        Context context = jVar.f38998a;
        if (z && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiShowOpenIMContactProfile$JumpProfileData;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiShowOpenIMContactProfile$JumpProfileData */
    public static final class JumpProfileData implements Parcelable {
        public static final C6398a CREATOR = new C6398a((C8480h) null);

        /* renamed from: d */
        public final String f23364d;

        /* renamed from: e */
        public final int f23365e;

        /* renamed from: f */
        public final byte[] f23366f;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiShowOpenIMContactProfile$JumpProfileData$a */
        public static final class C6398a implements Parcelable.Creator<JumpProfileData> {
            public C6398a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new JumpProfileData(parcel);
            }

            public Object[] newArray(int i) {
                return new JumpProfileData[i];
            }
        }

        public JumpProfileData(String str, byte[] bArr) {
            this.f23364d = str;
            this.f23366f = bArr;
            this.f23365e = bArr != null ? bArr.length : 0;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "dest");
            parcel.writeString(this.f23364d);
            parcel.writeInt(this.f23365e);
            parcel.writeByteArray(this.f23366f);
        }

        public JumpProfileData(Parcel parcel) {
            C87412m.m108594g(parcel, "src");
            String readString = parcel.readString();
            this.f23364d = readString == null ? "" : readString;
            int readInt = parcel.readInt();
            this.f23365e = readInt;
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            this.f23366f = bArr;
        }
    }
}
